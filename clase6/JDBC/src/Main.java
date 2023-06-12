import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/high-school", "root", "Yoelcapo123.");

            // Generar las notas para todos los alumnos en los cursos
            CreateCourseNotes.createNotesForAllStudents(connection);

            // Mostrar las notas finales de todos los estudiantes
            ListFinalCourseNotes.listFinalCourseNotes(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión con la base de datos
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
