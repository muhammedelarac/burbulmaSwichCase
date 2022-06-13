import java.util.Scanner;
/**
 * burcBulmaSiwtckCase
 */
public class burcBulmaSiwtckCase {

    
    public static void main(String[] args) {

        int month,day;

        Scanner input = new Scanner(System.in);
        System.out.println(" Doğdunuz Ay giriniz");
        month=input.nextInt();
    

        switch (month){
            
            
             case 3: {
               
                    System.out.println("Doğdunuz Gün giriniz ");
                    day = input.nextInt();
                    if(day>=1 && day <=21){
                        System.out.println(" Koç Burcu : 21 Mart - 20 Nisan");
                    }
                    else if(day>=20 && day <=30){
                        System.out.println("Balık Burcu : 20 Şubat - 20 Mart ");
                    } else{System.out.println(" Hatali Giris");

                    }



             }
            
             break;
             case 4: 
             System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                System.out.println(" Boğa Burcu : 21 Nisan - 21 Mayıs ");
            }else if(day>=22 && day <=30){
                System.out.println(" İkizler Burcu : 22 Mayıs - 22 Haziran");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;
             case 5: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                System.out.println(" Boğa Burcu : 21 Nisan - 21 Mayıs ");
            }else if(day>=22 && day <=30){
                System.out.println(" İkizler Burcu : 22 Mayıs - 22 Haziran");
            }
            else{System.out.println(" Hatali Giris");
            }
        
             break;

             case 6: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
            }else if(day>=23 && day <=30){
                System.out.println(" Yengeç Burcu : 23 Haziran - 22 Temmuz ");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;

             case 7: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                System.out.println(" Yengeç Burcu : 23 Haziran - 22 Temmuz");
            }else if(day>=23 && day <=30){
                System.out.println(" Aslan Burcu : 23 Temmuz - 22 Ağustos ");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;

             case 8: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                System.out.println("  Aslan Burcu : 23 Temmuz - 22 Ağustos");
            }else if(day>=23 && day <=30){
                System.out.println(" Başak Burcu : 23 Ağustos - 22 Eylü ");
            }
            else{System.out.println(" Hatali Giris");
            }
             break;
             case 9: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                System.out.println("  Başak Burcu : 23 Ağustos - 22 Eylü");
            }else if(day>=23 && day <=30){
                System.out.println(" Terazi Burcu : 23 Eylül - 22 Ekim ");
            }
            else{System.out.println(" Hatali Giris");
            }
             break;
             case 10:  System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                System.out.println("  Terazi Burcu : 23 Eylül - 22 Ekim");
            }else if(day>=23 && day <=30){
                System.out.println(" Akrep Burcu : 23 Ekim - 21 Kasım ");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;
             case 11:   System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                System.out.println("  Akrep Burcu : 23 Ekim - 21 Kasım");
            }else if(day>=22 && day <=30){
                System.out.println(" Yay Burcu : 22 Kasım - 21 Aralık ");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;

             case 12:   System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                System.out.println("  Yay Burcu : 22 Kasım - 21 Aralık");
            }else if(day>=22 && day <=30){
                System.out.println(" Oğlak Burcu : 22 Aralık - 21 Ocak ");
            }
            else{System.out.println(" Hatali Giris");
            }
             
             break;
             case 1:  System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                System.out.println("  Oğlak Burcu : 22 Aralık - 21 Ocak");
            }else if(day>=22 && day <=30){
                System.out.println("Kova Burcu : 22 Ocak - 19 Şubat ");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;
             case 2:  System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=19){
                System.out.println("  Kova Burcu : 22 Ocak - 19 Şubat");
            }else if(day>=20 && day <=30){
                System.out.println("Balık Burcu : 20 Şubat - 20 Mart ");
            }
            else{System.out.println(" Hatali Giris");
            }

             break;

             default:
             System.out.println(" hatali girs");
        }
       









    }
}