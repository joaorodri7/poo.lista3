package com.mycompany.loja;
import java.util.Scanner;

    public class Loja {

    public static class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return "Mídia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + "\nPreço: " + preco + "\nNome: " + nome;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código: ");
        codigo = scanner.nextInt();
        System.out.print("Digite o preço: ");
        preco = scanner.nextDouble();
        System.out.print("Digite o nome: ");
        scanner.nextLine(); 
        nome = scanner.nextLine();
    }
}

    public static class DVD extends Midia {
    private int faixas;

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nFaixas: " + faixas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de faixas: ");
        faixas = scanner.nextInt();
    }
}

    public static class CD extends Midia {
    private int musicas;

    public int getMusicas() {
        return musicas;
    }

    public void setMusicas(int musicas) {
        this.musicas = musicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\nMúsicas: " + musicas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de músicas: ");
        musicas = scanner.nextInt();
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de CDs a cadastrar: ");
        int numCDs = scanner.nextInt();
        System.out.print("Digite o número de DVDs a cadastrar: ");
        int numDVDs = scanner.nextInt();

        CD[] cds = new CD[numCDs];
        DVD[] dvds = new DVD[numDVDs];

        for (int i = 0; i < numCDs; i++) {
            System.out.println("Cadastro do CD #" + (i + 1));
            cds[i] = new CD();
            cds[i].inserirDados();
        }

        for (int i = 0; i < numDVDs; i++) {
            System.out.println("Cadastro do DVD #" + (i + 1));
            dvds[i] = new DVD();
            dvds[i].inserirDados();
        }

        System.out.println("\n---- CDs cadastrados ----");
        for (int i = 0; i < numCDs; i++) {
            System.out.println("\nDetalhes do CD #" + (i + 1));
            System.out.println(cds[i].getDetalhes());
        }

        System.out.println("\n---- DVDs cadastrados ----");
        for (int i = 0; i < numDVDs; i++) {
            System.out.println("\nDetalhes do DVD #" + (i + 1));
            System.out.println(dvds[i].getDetalhes());
        }
        
    }
    
   }
