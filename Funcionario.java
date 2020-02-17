/*Uma universidade possui um registro de seus funcionários armazenando a 
matrícula e nome de cada um. Por padrão, o salário de todo funcionário é o 
valor do salário mínimo (considere o valor de R$1000 para facilitar). Na 
universidade trabalham professores, secretários e servidores. Todo 
funcionário tem os métodos imprimirDados() e calcularSalario().  */

public class Funcionario {
    private int matricula; // seria melhor String ou Integer
    private String nome;
    private double sal = 1000;
    
    public Funcionario(int matricula, String nome){ 
        this.matricula = matricula;
        this.nome = nome;
        // não tem salario pois ja esta definido como 1000
    }
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSal(){
        return sal;
    }
    
    void mostrarDados(){
        System.out.println("Matricula " + this.matricula);
        System.out.println("Nome " + this.nome);
        System.out.println("Salário " + this.getSal());
    }
    
    double calcularSalario(){
        return sal;
    }
}
