import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListFinalCourseNotes {

    public static void listFinalCourseNotes(Connection connection) throws SQLException {
        // Consulta SQL para obtener las notas finales de todos los estudiantes
        String sql = "SELECT e.numero_registro, c.nombre AS curso_nombre, n.nota_final " +
                "FROM notas n " +
                "JOIN curso c ON n.id_curso = c.id_curso " +
                "JOIN estudiante e ON n.numero_registro_estudiante = e.numero_registro " +
                "ORDER BY n.nota_final DESC, c.nombre ASC";

        // Preparar la consulta
        PreparedStatement statement = connection.prepareStatement(sql);

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery();

        // Mostrar las notas finales para cada estudiante
        while (resultSet.next()) {
            String registrationNumber = resultSet.getString("numero_registro");
            String courseName = resultSet.getString("curso_nombre");
            double finalNote = resultSet.getDouble("nota_final");

            System.out.println("Estudiante con número de registro " + registrationNumber + ":");
            System.out.println("Curso: " + courseName);
            System.out.println("Nota Final: " + finalNote);
            System.out.println();
        }

        // Cerrar el statement y el resultSet
        statement.close();
        resultSet.close();
    }

}
