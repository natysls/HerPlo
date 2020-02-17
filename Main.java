
public class Main {
    public static void main(String[] args) {
        Funcionario professor = new Professor(matricula: 1, 
            nome: "João", 
            Professor.DOUTOR, 
            cargaHoraria: 0, 
            ehCoordenador: false);
        professor.mostrarDados();
    }
}
