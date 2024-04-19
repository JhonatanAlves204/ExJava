import java.util.Scanner;

public class Exjava {
    public static void main (String[]args) {
        Scanner ExJava = new Scanner (System.in);

        System.out.println("Qual o Seu Salario? ");
        float salario = ExJava.nextFloat();
        double a = 0.20;
        double b = 0.15;
        double c = 0.10;
        double d = 0.05;
        double inflação = 0.038;
        if(salario <= 280){
            double aumentoPercentual = salario * a;
            double reaSalario = salario + aumentoPercentual;
            double inflacao = salario - (salario * 0.038);
            System.out.println("Seu Salario é: R$" + salario); 
            System.out.println("Adicionado os % " + a*100 );
            System.out.println("O Valor do aumento: R$" + aumentoPercentual);
            System.out.println("Com o Aumento fica: R$ " + reaSalario);
            System.out.println("O Valor do aumento real descontando a inflação é : R$" + (inflacao));
        }   else if (salario > 280 && salario <= 700){
                double aumentoPercentual = salario * b;
                double reaSalario = salario + aumentoPercentual;
                double inflacao = salario - (salario * 0.038);
                System.out.println("Seu Salario é: R$" + salario); 
                System.out.println("Adicionado os % " + b*100 );
                System.out.println("O Valor do aumento: R$" + aumentoPercentual);
                System.out.println("Com o Aumento fica: R$ " + reaSalario);
                System.out.println("O Valor do aumento real descontando a inflação é : R$" + (inflacao));
            }   else if (salario > 700 && salario <= 1500){
                    double aumentoPercentual = salario * c;
                    double reaSalario = salario + aumentoPercentual;
                    double inflacao = salario - (salario * 0.038);
                    System.out.println("Seu Salario é: R$" + salario); 
                    System.out.println("Adicionado os % " + c*100 );
                    System.out.println("O Valor do aumento: R$" + aumentoPercentual);
                    System.out.println("Com o Aumento fica: R$ " + reaSalario);
                    System.out.println("O Valor do aumento real descontando a inflação é : R$" + (inflacao));
                }   else if (salario > 1500){
                    double aumentoPercentual = salario * d;
                    double reaSalario = salario + aumentoPercentual;
                    double inflacao = salario - (salario * 0.038);
                    System.out.println("Seu Salario é: R$" + salario); 
                    System.out.println("Adicionado os % " + d*100 );
                    System.out.println("O Valor do aumento: R$" + aumentoPercentual);
                    System.out.println("Com o Aumento fica: R$ " + reaSalario);
                    System.out.println("O Valor do aumento real descontando a inflação é : R$" + (inflacao));
                    }
    }
}