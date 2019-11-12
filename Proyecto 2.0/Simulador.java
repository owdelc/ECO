import java.io.IOException;



public class Simulador{

    public void ejecutar_Simulador() {                                              

        try {
              
            Runtime.getRuntime().exec("");
          
        } catch (IOException ex) {
        
            System.out.println(ex);
          
        }
  
    }


}