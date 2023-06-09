package clase4.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentFilesList {
    private final int maxSize;
    private final List<String> files;

    public RecentFilesList(int maxSize) {
        this.maxSize = maxSize;
        this.files = new LinkedList<>();
    }

    public void openFile(String fileName) {
        if (files.contains(fileName)) {
            files.remove(fileName);
        } else if (files.size() >= maxSize) {
            files.remove(files.size() - 1);
        }

        files.add(0, fileName);
    }

    public List<String> getRecentFiles() {
        return new ArrayList<>(files);
    }

    public static void main(String[] args) {
        RecentFilesList recentFilesList = new RecentFilesList(15);

        // Prueba 1: Lista vacía en la ejecución inicial
        List<String> files = recentFilesList.getRecentFiles();
        System.out.println("Archivos recientes al iniciar: " + files);

        // Prueba 2: Agregar un nuevo archivo
        recentFilesList.openFile("file1.txt");
        files = recentFilesList.getRecentFiles();
        System.out.println("Archivos recientes después de agregar 'file1.txt': " + files);

        // Prueba 3: Agregar un archivo existente (se mueve al principio)
        recentFilesList.openFile("file2.txt");
        recentFilesList.openFile("file2.txt");
        files = recentFilesList.getRecentFiles();
        System.out.println("Archivos recientes después de agregar 'file2.txt' nuevamente: " + files);

        // Prueba 4: Alcanzar el tamaño máximo y eliminar el archivo más antiguo
        recentFilesList.openFile("file3.txt");
        recentFilesList.openFile("file4.txt");
        recentFilesList.openFile("file5.txt");
        recentFilesList.openFile("file6.txt");
        recentFilesList.openFile("file7.txt");
        files = recentFilesList.getRecentFiles();
        System.out.println("Archivos recientes después de agregar 'file3.txt', 'file4.txt', 'file5.txt', 'file6.txt', 'file7.txt': " + files);
    }
}
