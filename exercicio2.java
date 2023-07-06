package com.mycompany.cadastroveiculo;
import java.util.Scanner;

public class Cadastroveiculo {

    public static class Veiculo {
    private String modelo;
    private double preco;
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
    }
}

    public static class Moto extends Veiculo {
    private int ano;
    private double km;
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getKm() {
        return km;
    }
    
    public void setKm(double km) {
        this.km = km;
    }
    
    @Override
    public double getPreco() {
        return super.getPreco();
    }
    
    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        setModelo(modelo);
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();
        setPreco(preco);
        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();
        System.out.print("Digite a quilometragem: ");
        km = scanner.nextDouble();
    }
    
    public void ajustarPreco() {
        if (ano >= 2008) {
            setPreco(getPreco() * 1.1);
        }
    }
}

    public static class Carro extends Veiculo {
    private int ano;
    private double km;
    
    public Carro() {
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public double getKm() {
        return km;
    }
    
    public void setKm(double km) {
        this.km = km;
    }
    
    @Override
    public double getPreco() {
        return super.getPreco();
    }
    
    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        setModelo(modelo);
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();
        setPreco(preco);
        System.out.print("Digite o ano: ");
        ano = scanner.nextInt();
        System.out.print("Digite a quilometragem: ");
        km = scanner.nextDouble();
    }
    
    public void ajustarPreco() {
        if (km > 100000) {
            setPreco(getPreco() * 0.92);
        }
    }
}

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de motos a cadastrar: ");
        int numMotos = scanner.nextInt();
        System.out.print("Digite o número de carros a cadastrar: ");
        int numCarros = scanner.nextInt();
        
        Moto[] motos = new Moto[numMotos];
        Carro[] carros = new Carro[numCarros];
        
        for (int i = 0; i < numMotos; i++) {
            System.out.println("Cadastro da Moto #" + (i + 1));
            motos[i] = new Moto();
            motos[i].insertData();
        }
        
        for (int i = 0; i < numCarros; i++) {
            System.out.println("Cadastro do Carro #" + (i + 1));
            carros[i] = new Carro();
            carros[i].insertData();
        }
        
        double totalPrecoAntes = 0;
        double totalPrecoDepois = 0;
        
        System.out.println("\n---- Motos cadastradas ----");
        for (int i = 0; i < numMotos; i++) {
            System.out.println("\nDados da Moto #" + (i + 1));
            motos[i].printDados();
            totalPrecoAntes += motos[i].getPreco();
            motos[i].ajustarPreco();
            totalPrecoDepois += motos[i].getPreco();
        }
        
        System.out.println("\n---- Carros cadastrados ----");
        for (int i = 0; i < numCarros; i++) {
            System.out.println("\nDados do Carro #" + (i + 1));
            carros[i].printDados();
            totalPrecoAntes += carros[i].getPreco();
            carros[i].ajustarPreco();
            totalPrecoDepois += carros[i].getPreco();
        }
        
        System.out.println("\nTotal de preços dos veículos antes dos ajustes: " + totalPrecoAntes);
        System.out.println("Total de preços dos veículos após os ajustes: " + totalPrecoDepois);
    }
    
}
