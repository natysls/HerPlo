/*O salário dos professores depende da titulação e da sua carga horária. 
Para os mestres, o valor da hora/aula é R$80, enquanto o doutor ganha R$100 
por hora/aula. Além disso, caso o professor seja coordenador, ele pode tem 
uma gratificação de 20% do valor final de seu salário.*/
public class Professor extends Funcionario {
    public static final String DOUTOR = "doutor";
    public static final String MESTRE = "mestre";
    public static final double BONIFICACAO_COORDENADOR = 20;
    public static final double HORA_AULA_DOUTOR = 100;
    public static final double HORA_AULA_MESTRE = 80;
    
    private String titulacao = ""; 
    private Integer cargaHoraria = null; 
    boolean ehCoordenador = false;
    
    public Professor(int matricula, String nome, String titulacao, 
            Integer cargaHoraria, boolean ehCoordenador) {
        super(matricula, nome);
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria; 
        this.ehCoordenador = ehCoordenador;
    }
    
    public String getTitulacao(){
        return titulacao;
    }
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    
    public Integer getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Titulacao" + titulacao);
        System.out.println("Carga Horaria" + cargaHoraria);
    }
    
    @Override
    double calcularSalario(){
        double salario = 0;
        boolean ehcoordenador = false;
        if(titulacao == DOUTOR){
            salario = salario + (HORA_AULA_DOUTOR * cargaHoraria)+ super.calcularSalario();
        }
        else if(titulacao == MESTRE){
            salario = salario + (HORA_AULA_MESTRE * cargaHoraria) + super.calcularSalario();
        }
        if(ehcoordenador){
            salario = salario + (salario * BONIFICACAO_COORDENADOR/100);
        }
        return 0;
    }
    
    
}
