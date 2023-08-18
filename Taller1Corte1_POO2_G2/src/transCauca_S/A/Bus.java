
package transCauca_S.A;
import javax.swing.JOptionPane;
public class Bus {
    int codigoBus, modeloBus;
    String marcaBus, placaBus, Datos;

    public Bus(int codigoBus, int modeloBus, String marcaBus, String placaBus) {
        this.codigoBus = codigoBus;
        this.modeloBus = modeloBus;
        this.marcaBus = marcaBus;
        this.placaBus = placaBus;
    }
    
    public String mostrarDatos(){
        codigoBus = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del bus"));
        modeloBus = Integer.parseInt(JOptionPane.showInputDialog("ingrese el modelo del bus"));
        marcaBus = JOptionPane.showInputDialog("ingrese la marca del bus");
        placaBus = JOptionPane.showInputDialog("ingrese la placa del bus");
        System.out.println("hola");
        return Datos;
    }
}
