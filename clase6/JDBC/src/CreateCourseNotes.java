import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateCourseNotes {

    public static void createNotes(Connection connection, int courseId) throws SQLException {
        // Obtener los números de registro de todos los estudiantes del curso
        String studentQuery = "SELECT numero_registro FROM estudiante";
        PreparedStatement studentStatement = connection.prepareStatement(studentQuery);
        ResultSet studentResult = studentStatement.executeQuery();

        // Generar las notas para cada estudiante en el curso
        String insertNoteQuery = "INSERT INTO notas (numero_registro_estudiante, id_curso, parcial1, parcial2, parcial3, nota_final) " +
                                "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement insertNoteStatement = connection.prepareStatement(insertNoteQuery);

        while (studentResult.next()) {
            String registrationNumber = studentResult.getString("numero_registro");

            // Generar las notas aleatoriamente
            double partialNote1 = Math.random() * 10;
            double partialNote2 = Math.random() * 10;
            double partialNote3 = Math.random() * 10;
            double finalNote = Math.random() * 10;

            // Insertar las notas en la tabla de notas
            insertNoteStatement.setString(1, registrationNumber);
            insertNoteStatement.setInt(2, courseId);
            insertNoteStatement.setDouble(3, partialNote1);
            insertNoteStatement.setDouble(4, partialNote2);
            insertNoteStatement.setDouble(5, partialNote3);
            insertNoteStatement.setDouble(6, finalNote);

            // Ejecutar la consulta de inserción de notas
            insertNoteStatement.executeUpdate();
            System.out.println("Notas creadas para el estudiante con número de registro " + registrationNumber +
                    " en el curso con ID " + courseId);
        }

        // Cerrar el statement y el resultSet
        insertNoteStatement.close();
        studentStatement.close();
        studentResult.close();
    }

    public static void createNotesForAllStudents(Connection connection) throws SQLException {
        // Obtener los IDs de todos los cursos
        String courseQuery = "SELECT id_curso FROM curso";
        PreparedStatement courseStatement = connection.prepareStatement(courseQuery);
        ResultSet courseResult = courseStatement.executeQuery();

        // Generar las notas para todos los estudiantes en cada curso
        while (courseResult.next()) {
            int courseId = courseResult.getInt("id_curso");
            createNotes(connection, courseId);
        }

        // Cerrar el statement y el resultSet
        courseStatement.close();
        courseResult.close();
    }

}
