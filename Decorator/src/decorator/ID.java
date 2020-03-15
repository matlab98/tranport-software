
package decorator;

public class ID extends BusDecorator {
    private String Caracteristicas="";
    
    public ID(String Caracteristicas,Bus nuevoBus) {
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
