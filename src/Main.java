import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner inp = new Scanner(System.in);
        System.out.println("lutfen dogdugunuz ayı gırınız: ");
        month = inp.nextInt();
        System.out.println("lutfen dogdunuz gunu giriniz: ");
        day = inp.nextInt();
        switch(month)
        {
            case 1:
                if(day >= 1 && day <=21)
                {
                    System.out.println("Oglak burcusunuz :)");
                }
                else
                {
                    System.out.println("Kova urcusunuz :)");
                }
                break;
            case 2:
                if(day >= 1 && day <=19)
                {
                    System.out.println("Kova burcusunuz :)");
                }
                else
                {
                    System.out.println("Balık urcusunuz :)");
                }
                break;
            case 3:
                if(day >= 1 && day <=20)
                {
                    System.out.println("Balık burcusunuz :)");
                }
                else
                {
                    System.out.println("Koç urcusunuz :)");
                }
                break;
            case 4:
                if(day >= 1 && day <=21)
                {
                    System.out.println("Koç burcusunuz :)");
                }
                else
                {
                    System.out.println("Boğa urcusunuz :)");
                }
                break;
            case 5:
                if(day >= 1 && day <=21)
                {
                    System.out.println("Boğa burcusunuz :)");
                }
                else
                {
                    System.out.println("İkizler urcusunuz :)");
                }
                break;
            case 6:
                if(day >= 1 && day <=22)
                {
                    System.out.println("İki<ler burcusunuz :)");
                }
                else
                {
                    System.out.println("Yengeç urcusunuz :)");
                }
                break;
            case 7:
                if(day >= 1 && day <=23)
                {
                    System.out.println("Yengeç burcusunuz :)");
                }
                else
                {
                    System.out.println("Aslan urcusunuz :)");
                }
                break;
            case 8:
                if(day >= 1 && day <=23)
                {
                    System.out.println("Aslan burcusunuz :)");
                }
                else
                {
                    System.out.println("Başak urcusunuz :)");
                }
                break;
            case 9:
                if(day >= 1 && day <=23)
                {
                    System.out.println("Başak burcusunuz :)");
                }
                else
                {
                    System.out.println("Terazi urcusunuz :)");
                }
                break;
            case 10:
                if(day >= 1 && day <=23)
                {
                    System.out.println("Terazi burcusunuz :)");
                }
                else
                {
                    System.out.println("Akrep urcusunuz :)");
                }
                break;
            case 11:
                if(day >= 1 && day <=23)
                {
                    System.out.println("Akrep burcusunuz :)");
                }
                else
                {
                    System.out.println("Yay urcusunuz :)");
                }
                break;
            case 12:
                if(day >= 1 && day <=22)
                {
                    System.out.println("Yay burcusunuz :)");
                }
                else
                {
                    System.out.println("Oğlak urcusunuz :)");
                }
                break;
        }

    }
}