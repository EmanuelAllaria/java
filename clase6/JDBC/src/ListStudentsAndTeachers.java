import java.sql.*;

public class ListStudentsAndTeachers {

    public static void listStudentsAndTeachers(Connection connection, String courseName) throws SQLException {
    // Consulta SQL para obtener los profesores y estudiantes del curso
        String sql = "SELECT c.nombre AS nombre_curso, p.apellido AS apellido_profesor, p.nombre AS nombre_profesor, " +
                    "e.apellido AS apellido_estudiante, e.nombre AS nombre_estudiante " +
                    "FROM curso c " +
                    "JOIN profesor p ON c.id_profesor_asignado = p.id_profesor " +
                    "JOIN estudiantecurso ce ON c.id_curso = ce.id_curso " +
                    "JOIN estudiante e ON ce.numero_registro = e.numero_registro " +
                    "WHERE c.nombre = ? " +
                    "ORDER BY e.apellido ASC";

        // Preparar la consulta
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, courseName);

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery();

        // Imprimir los estudiantes y profesores del curso
        System.out.println("Curso: " + courseName);
        boolean hasData = false;
        while (resultSet.next()) {
            String teacherLastName = resultSet.getString("apellido_profesor");
            String teacherFirstName = resultSet.getString("nombre_profesor");
            String studentLastName = resultSet.getString("apellido_estudiante");
            String studentFirstName = resultSet.getString("nombre_estudiante");

            // Imprimir los datos del profesor y estudiante
            if (!hasData) {
                System.out.println("Profesor: " + teacherLastName + ", " + teacherFirstName);
                System.out.println("Estudiantes:");
                hasData = true;
            }
            System.out.println(studentLastName + ", " + studentFirstName);
        }

        if (!hasData) {
            System.out.println("No se encontró ningún curso con el nombre: " + courseName);
        }

        // Cerrar el result set y el statement
        resultSet.close();
        statement.close();
    }
}