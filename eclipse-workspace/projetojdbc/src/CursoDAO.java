import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoDAO {

    public void criarCurso(Curso curso) {
        try (Connection connection = ConexaoDB.getConnection()) {
            String sql = "INSERT INTO curso (name, name_teacher, course_hours) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, curso.getName());
                statement.setString(2, curso.getNameTeacher());
                statement.setObject(3, curso.getCourseHours()); 
                
                statement.executeUpdate();
                System.out.println("Curso criado com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao criar curso: " + e.getMessage());
        }
    }
}