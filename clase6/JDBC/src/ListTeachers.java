import java.sql.*;

public class ListTeachers {

    public static void listTeacherSchedules(Connection connection, String teacherName) throws SQLException {
    // Consulta SQL para obtener los horarios de un profesor
        String sql = "SELECT horario FROM curso c " +
                    "JOIN profesor p ON c.id_profesor_asignado = p.id_profesor " +
                    "WHERE p.nombre = ?";

        // Preparar la consulta
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, teacherName);

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery();

        // Imprimir los horarios del profesor
        boolean hasSchedules = false;
        System.out.println("Teacher: " + teacherName);
        while (resultSet.next()) {
            String schedule = resultSet.getString("horario");
            System.out.println(schedule);
            hasSchedules = true;
        }

        if (!hasSchedules) {
            System.out.println("El profesor " + teacherName + " no tiene horarios asignados.");
        }

        // Cerrar el result set y el statement
        resultSet.close();
        statement.close();
    }
}