public class Alunos {
    private String matricula;
    private String nome;
    private String email;
    private String cpf;
    private int idCurso;

    public Alunos(String matricula, String nome, String email, String cpf, int idCurso) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idCurso = idCurso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public String toString() {
        return "Alunos [matricula=" + matricula + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", idCurso=" + idCurso + "]";
    }
}
