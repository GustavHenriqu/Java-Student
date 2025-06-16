
public class Horario {
    
    public static void main(String[] args) {
        String horacerta, minutocerto;
    
        for (int i = 0; i < 24; i++) {
            if (i <10) {
                horacerta = "0" + i;   
            } else {
                horacerta = "" + i;
            }
            
            for (int j = 0; j < 60; j++) {
                if (j < 10) {
                    minutocerto = "0" + j;
                } else{
                    minutocerto = "" + j;
                }
                System.out.println(horacerta + ":" + minutocerto);
                
            }
        }
               
    }
    
}
