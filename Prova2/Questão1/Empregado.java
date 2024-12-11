public class Empregado {

    private String nome;
    private String sobrenome;
    private double salario;
    

    public Empregado(String nome, String sobrenome, double salario) {

    this.nome = nome;
    this.sobrenome = sobrenome;

    if(salario < 0){
        System.err.println("Salario invalido");
        this.salario = 0;
    }else{
    this.salario = salario; }

    }

    public void setSalario(double salario){
        this.salario *= 1.1;

    }

    @Override
    public String toString() {
        return String.format("Empregado:\n    nome = %s\n    sobrenome = %s\n    salario = R$%.2f", nome, sobrenome, salario);
    }
    


}