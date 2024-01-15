package HesapMakinesi;

import base.Division;
import base.Multiplication;
import base.Subtraction;
import base.Addition;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Addition collection = new Addition();
        Subtraction extraction = new Subtraction();
        Division divide = new Division();
        Multiplication impact = new Multiplication();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yapmak istediğiniz işlemi seçiniz (+, -, *, /): ");
        char process = scanner.next().charAt(0);

        System.out.print("Birinci sayıyı girin: ");
        double number1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double number2 = scanner.nextDouble();

        switch (process) {
           case '+':
               double additionResult = collection.calculate(number1, number2);
           System.out.println("Toplama işlem sonucu: " + additionResult);
           break;

           case'-':
               double subtractionResult = extraction.calculate(number1, number2);
           System.out.println("Çıkarma işlem sonucu: " + subtractionResult);
           break;

           case '/':
                double divisionResult = divide.calculate(number1, number2);
           System.out.println("Bölme işlem sonucu: " + divisionResult);
           break;

           case '*':
                double multiplicationResult = impact.calculate(number1, number2);
           System.out.println("Çarpma işlem sonucu: " + multiplicationResult);
           break;

       }
    }
}
