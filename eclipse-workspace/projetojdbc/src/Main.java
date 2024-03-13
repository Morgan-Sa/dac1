import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        try (Connection connection = ConexaoDB.getConnection()) {
            if (connection != null) {
                System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            } else {
                System.out.println("Não foi possível estabelecer a conexão com o banco de dados.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        
        /*
        
        AlunoDAO alunoDAO = new AlunoDAO();
        String matricula = "2022001";
        alunoDAO.deletarAluno(matricula);
       */
       
        /*
        
        AlunoDAO alunoDAO = new AlunoDAO();
        
        String matricula = "2022002";
        String novoNome = "João Silva";
        String novoEmail = "joao@example.com";
        String novoCpf = "123.456.789-00";
        int novoIdCurso = 2;
        
        Alunos alunoAtualizado = new Alunos(matricula, novoNome, novoEmail, novoCpf, novoIdCurso);
        
        alunoDAO.atualizarAluno(alunoAtualizado);
        
        */


    
        
      /*  AlunoDAO alunoDAO = new AlunoDAO();
        List<Alunos> alunos = alunoDAO.listarAlunos();
        for (Alunos aluno : alunos) {
            System.out.println(aluno);
        }
      */   
        
       /* Alunos aluno = new Alunos("2022002", "João", "joa@example.com", "124.456.789-00", 2);
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.criarAluno(aluno);
       */
    }
}
