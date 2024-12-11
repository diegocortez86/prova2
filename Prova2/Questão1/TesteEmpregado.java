import java.util.Scanner;

public class TesteEmpregado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scanner scanner= new Scanner(System.in);
        String nome = scanner.nextLine();
        String sobrenome = scanner.nextLine();
        double salario = scanner.nextDouble();
        
        Empregado emp = new Empregado(nome, sobrenome, salario);

        System.out.println(emp);

        System.out.println("Aumentando o salario...");

        emp.setSalario(salario);
        System.out.println(emp.toString());
        
        sc.close();
    }
    
}
