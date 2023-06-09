package clase4.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blog {
    private List<String> entries;
    private Map<String, List<Integer>> tags;

    public Blog() {
        entries = new ArrayList<>();
        tags = new HashMap<>();
    }

    public void publishEntry(String entry) {
        entries.add(entry);
    }

    public void deleteEntry(int index) {
        if (index >= 0 && index < entries.size()) {
            String entry = entries.get(index);
            removeTags(entry);
            entries.remove(index);
        }
    }

    public void updateEntry(int index, String newEntry) {
        if (index >= 0 && index < entries.size()) {
            String entry = entries.get(index);
            removeTags(entry);
            entries.set(index, newEntry);
        }
    }

    public List<String> getRecentEntries(int numEntries) {
        int start = Math.max(0, entries.size() - numEntries);
        return entries.subList(start, entries.size());
    }

    public void addTag(int index, String tag) {
        if (index >= 0 && index < entries.size()) {
            List<Integer> entryIndices = tags.getOrDefault(tag, new ArrayList<>());
            if (!entryIndices.contains(index)) {
                entryIndices.add(index);
                tags.put(tag, entryIndices);
            }
        }
    }

    public List<String> getAllTags() {
        return new ArrayList<>(tags.keySet());
    }

    public List<String> getEntriesByTag(String tag) {
        List<String> entriesWithTag = new ArrayList<>();
        List<Integer> entryIndices = tags.get(tag);

        if (entryIndices != null) {
            for (int index : entryIndices) {
                entriesWithTag.add(entries.get(index));
            }
        }

        return entriesWithTag;
    }

    private void removeTags(String entry) {
        for (String tag : tags.keySet()) {
            List<Integer> entryIndices = tags.get(tag);
            entryIndices.removeIf(index -> entries.get(index).equals(entry));
        }
    }

    public static void main(String[] args) {
        Blog blog = new Blog();

        // Publicar nuevas entradas
        blog.publishEntry("¡Hola, mundo!");
        blog.publishEntry("Bienvenidos al blog");
        blog.publishEntry("Últimas noticias");

        // Eliminar una entrada
        blog.deleteEntry(0);

        // Actualizar una entrada
        blog.updateEntry(1, "Nuevas noticias");

        // Ver las 10 entradas más recientes
        List<String> recentEntries = blog.getRecentEntries(10);
        System.out.println("Las 10 entradas más recientes:");
        for (String entry : recentEntries) {
            System.out.println(entry);
        }

        // Etiquetar una entrada
        blog.addTag(1, "noticias");
        blog.addTag(1, "actualización");

        // Mostrar todas las etiquetas
        List<String> allTags = blog.getAllTags();
        System.out.println("\nTodas las etiquetas:");
        for (String tag : allTags) {
            System.out.println(tag);
        }

        // Mostrar entradas con una etiqueta determinada
        List<String> entriesWithTag = blog.getEntriesByTag("noticias");
        System.out.println("\nEntradas con la etiqueta 'noticias':");
        for (String entry : entriesWithTag) {
            System.out.println(entry);
        }
    }
}
