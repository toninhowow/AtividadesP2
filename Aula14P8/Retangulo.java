package Aula14P8;

public class Retangulo {
    
    private double altura;
    private double largura;

    
    public Retangulo() {
        this.altura = 1.0;
        this.largura = 1.0;
    }

    
    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return 2 * (this.altura + this.largura);
    }

    
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que 0.0 e menor que 20.0!");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que 0.0 e menor que 20.0!");
        }
    }
}