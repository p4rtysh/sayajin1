public class Aluno {
    protected int matricula;
    protected String nome;
    protected double notaProva1; // peso 2,5
    protected double notaProva2; // peso 2,5
    protected double notaTrabalho; // peso 2

    public Aluno(String nomeAluno, int matriculaAluno){
        this.nome = nomeAluno;
        this.matricula = matriculaAluno;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double mediaPonderada(){
        double[] notas = {this.notaProva1, this.notaProva2, this.notaTrabalho};
        double[] pesos = {2.5, 2.5, 2};
        double somaNotasPonderadas = 0;
        double somaPesos = 0;

        for(int i = 0; true; i++){
            somaNotasPonderadas = notas[i] * pesos[i];
            somaPesos += pesos[i];
            return somaNotasPonderadas / somaPesos;
        }

    }

    public void mediaFinal(){
        if (this.mediaPonderada() < 4){
            double calculo = 4 - this.mediaPonderada();
            System.out.println("O(a) aluno(a) precisa tirar " + calculo + " na prova final.");
        }else{
            System.out.println("O(a) aluno(a) está aprovado(a).");
        }
    }


}
