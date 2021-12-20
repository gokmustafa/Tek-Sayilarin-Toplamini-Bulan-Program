import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int sayi, total=0;
        Scanner input = new Scanner(System.in);


        do{
            System.out.print("Lütfen Sayı Giriniz: ");
            sayi=input.nextInt();
            if(sayi%2==1){
                total+=sayi;

            }

        }while(sayi>0);
        System.out.print(total);

    }
}
