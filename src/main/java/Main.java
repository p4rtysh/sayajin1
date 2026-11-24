import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Aluno a1 = new Aluno("maria", 2301239);
    a1.setNotaProva1(2.5);
    a1.setNotaProva2(2.5);
    a1.setNotaTrabalho(2);
    a1.mediaFinal();
    }
}
