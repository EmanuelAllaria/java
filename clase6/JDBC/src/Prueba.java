import java.sql.*;

public class Prueba {
    public static void main(String[] args) {

        Connection connection = null;

        try {
            // Establecer la conexión con la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/high-school", "root", "Yoelcapo123.");

            ListStudentsAndTeachers.listStudentsAndTeachers(connection, "Matemáticas");
            ListTeachers.listTeacherSchedules(connection, "Juan");

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