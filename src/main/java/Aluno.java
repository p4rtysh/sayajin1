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

    public double media(){
        double[] notas = {this.notaProva1, this.notaProva2, this.notaTrabalho};
        double resultado = 0;
        for (double nota : notas){
            resultado += nota;
        }
        return resultado / notas.length;
    }

    public void mediaFinal(){
        if (this.media() < 4){
            double calculo = 4 - this.media();
            System.out.println("O(a) aluno(a) precisa tirar " + calculo + " na prova final.");
        }else{
            System.out.println("O(a) aluno(a) está aprovado(a).");
        }
    }


}
