import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AlunoDAO {

    public void criarAluno(Alunos alunos) {
        try (Connection connection = ConexaoDB.getConnection()) {
            String sql = "INSERT INTO alunos (matricula, nome, email, cpf, IdCurso) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, alunos.getMatricula());
                statement.setString(2, alunos.getNome());
                statement.setString(3, alunos.getEmail());
                statement.setString(4, alunos.getCpf());
                statement.setInt(5, alunos.getIdCurso());
                
                
                statement.executeUpdate();
                System.out.println("Aluno criado com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao criar aluno: " + e.getMessage());
        }
    }
    
    
    public List<Alunos> listarAlunos() {
        List<Alunos> alunos = new ArrayList<>();
        try (Connection connection = ConexaoDB.getConnection()) {
            String sql = "SELECT * FROM alunos";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String matricula = resultSet.getString("matricula");
                        String nome = resultSet.getString("nome");
                        String email = resultSet.getString("email");
                        String cpf = resultSet.getString("cpf");
                        int idCurso = resultSet.getInt("idCurso");

                        Alunos aluno = new Alunos(matricula, nome, email, cpf, idCurso);
                        alunos.add(aluno);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar alunos: " + e.getMessage());
        }
        return alunos;
    }
    
    public void atualizarAluno(Alunos aluno) {
        try (Connection connection = ConexaoDB.getConnection()) {
            String sql = "UPDATE alunos SET nome = ?, email = ?, cpf = ?, IdCurso = ? WHERE matricula = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, aluno.getNome());
                statement.setString(2, aluno.getEmail());
                statement.setString(3, aluno.getCpf());
                statement.setInt(4, aluno.getIdCurso());
                statement.setString(5, aluno.getMatricula());
                
                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Aluno atualizado com sucesso!");
                } else {
                    System.out.println("Nenhum aluno atualizado.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar aluno: " + e.getMessage());
        }
    }
    
    public void deletarAluno(String matricula) {
        try (Connection connection = ConexaoDB.getConnection()) {
            String sql = "DELETE FROM alunos WHERE matricula = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, matricula);
                
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Aluno deletado com sucesso!");
                } else {
                    System.out.println("Nenhum aluno deletado. Verifique a matrícula.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao deletar aluno: " + e.getMessage());
        }
    }
    
}
