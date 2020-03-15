
package decorator;

public class Conductor extends BusDecorator {
    private String Caracteristicas="";
    
    public Conductor(String Caracteristica, Bus nuevoBus) {
        super(nuevoBus);
        this.Caracteristicas=Caracteristica;
    }
    
    @Override
    public String getCaracteristicas(){
        return tempBus.getCaracteristicas()+ this.Caracteristicas;
    }

    @Override
    public void setCaracteristicas(String newCaracteristicas) {
        this.Caracteristicas=newCaracteristicas;
    }
    
    
}
