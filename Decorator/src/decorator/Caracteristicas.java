
package decorator;

public class Caracteristicas extends BusDecorator {
    private String Caracteristicas="";
    
    public Caracteristicas(String Caracteristicas,Bus nuevoBus) {
        super(nuevoBus);
        this.Caracteristicas=Caracteristicas;
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