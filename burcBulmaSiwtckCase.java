import java.util.Scanner;
/**
 * burcBulmaSiwtckCase
 */
public class burcBulmaSiwtckCase {

    
    public static void main(String[] args) {

        int month,day;
        String burc= "";
        boolean isEror =false;

        Scanner input = new Scanner(System.in);
        System.out.println(" Doğdunuz Ay giriniz");
        month=input.nextInt();
    

        switch (month){
            
            
             case 3: {
               
                    System.out.println("Doğdunuz Gün giriniz ");
                    day = input.nextInt();
                    if(day>=1 && day <=21){
                        burc="Koc";;
                    }
                    else if(day>=20 && day <=30){
                       burc="Balik";
                    } else{isEror=true;

                    }

             }
            
             break;
             case 4: 
             System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                burc=" Koc ";
            }else if(day>=22 && day <=30){
               burc="Boğa";
            }
            else{isEror=true;
            }

             break;
             case 5: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
               burc="Boğa";
            }else if(day>=22 && day <=30){
                burc=" İkizler ";
            }
            else{isEror=true;
            }
        
             break;

             case 6: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                burc="İkizler";
            }else if(day>=23 && day <=30){
                burc="Yengeç";            }
            else{isEror=true;
            }

             break;

             case 7: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                burc="Yengeç";       
                 }else if(day>=23 && day <=30){
                    burc="Aslan";       
                     }
            else{isEror=true;
            }

             break;

             case 8: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                burc="Aslan"; 
            }else if(day>=23 && day <=30){
                burc="Basak";        
                 }
            else{isEror=true;
            }
             break;
             case 9: System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                burc="Basak";        
            }else if(day>=23 && day <=30){
                burc="Terazi";        
            }
            else{isEror=true;
            }
             break;
             case 10:  System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=22){
                burc="Terazi";        
            }else if(day>=23 && day <=30){
                burc="Akrep";        
            }
            else{isEror=true;
            }

             break;
             case 11:   System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                burc="Akrep";        
            }else if(day>=22 && day <=30){
                burc="Yay";        
            }
            else{isEror=true;
            }

             break;

             case 12:   System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                burc="Yay";        
            }else if(day>=22 && day <=30){
                burc="Oglak";        
            }
            else{isEror=true;
            }
             
             break;
             case 1:  System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=21){
                burc="Oglak";             
            }else if(day>=22 && day <=30){
                burc="Kova";             
            }
            else{isEror=true;
            }

             break;
             case 2:  System.out.println("Doğdunuz Gün giriniz ");
             day = input.nextInt();
             if(day>=1 && day <=19){
                burc="Kova";             
            }else if(day>=20 && day <=30){
                burc="balik";             
            }else{

            
            isEror=true;
            }

             break;

             default:
             isEror = true;
             

             }
             if( isEror){
                System.out.println(" hatali girs"); 
             }else{
                System.out.println(" borcunuz :  "  + burc);
             }
        
      
        

       









    }
    

    }