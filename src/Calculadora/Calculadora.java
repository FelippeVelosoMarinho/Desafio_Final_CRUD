public class Calculadora {
    private double n1, n2;
    double soma, subtracao, multiplicacao, divisao;

    public Calculadora(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public double getSoma() {
        this.soma = n1+n2;
        return soma;
    }

    public double getSubtracao() {
        this.subtracao = n1-n2;
        return subtracao;
    }
    public double getMultiplicacao() {
        this.multiplicacao = n1*n2;
        return multiplicacao;
    }

    public double getDivisao() {
        this.divisao = n1/n2;
        return divisao;
    }
}
