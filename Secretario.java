/*Secretários trabalham 20, 30 ou 40 horas semanais. Seu salário é a calculado
pelo valor da hora de trabalho, que é de R$8 para quem trabalha até 30h/semana
e R$10 para quem trabalha 40h/semana, vezes a quantidade de horas mensais 
trabalhadas (considere um mês como tendo 4 semanas). */
public class Secretario extends Professor{
    
    public Secretario(int matricula, String nome, double sal, String titulacao, double cargaHoraria) {
        super(matricula, nome, sal, titulacao, cargaHoraria);
    }
    
    double calcularSalario(double sal){
        if(cargaHoraria == 30){
            sal = 8 * 30 * 4;
        }
        if(cargaHoraria == 40){
            sal = 10 * 40 * 4;
        }
    }
}
