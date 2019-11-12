import java.io.IOException;



public class Simulador{

    public void ejecutar_Simulador() {                                              

        try {
              
            Runtime.getRuntime().exec("C:\\Users\\chris\\OneDrive\\Desktop\\Juegos\\Caesar3 portable\\c3.exe");
          
        } catch (IOException ex) {
        
            System.out.println(ex);
          
        }
  
    }


}