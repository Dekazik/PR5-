import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);        
        Random random = new Random();
        

        ArrayList<Double> array = new ArrayList<Double>();
        double sum = 0;     
        double n = 1;
        double min;
        double max;
        
        System.out.println("Введіть кількість чисел у масиві: ");
        int l = scanner.nextInt();
                
        while (true)        {
            System.out.println("Введіть почат діапвзону: ");            
            min = scanner.nextDouble();
            
            System.out.println("Введіть кінець діапазону: ");            
            max = scanner.nextDouble();
            
            if(min < max ){
                System.out.println("Діапазон коректний");                
                break;
            }
            else
            {
                System.out.println("Некоректний діапазон. Початок має бути меншим за кінець.");
            }
        }
        
        for (int i = 0 ; i < l ; i++ )
        {
            double randomNum = random.nextDouble() * (max - min) + min;
            array.add(randomNum);   
        }
        
        for (int i = 0; i < array.size(); i++ )
        {
            sum += array.get(i);
        }
        double arithmeticMean = sum / array.size();
        
        
        for (int i = 0; i < array.size(); i++ )
        {
            n *= array.get(i);
        }
        double geometricMean = Math.pow(n, 1.0 / array.size());
        
        System.out.printf("Середнє арифметичне: %.2f%n", arithmeticMean);
        System.out.printf("Середнє геометричне: %.2f%n", geometricMean);
    }   
}