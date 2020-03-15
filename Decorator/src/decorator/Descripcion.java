
package decorator;

public class Descripcion extends BusDecorator {
    private String Caracteristicas=", Son livianos, baratos y consumen poco";
    
    public Descripcion(String Caracteristicas, Bus nuevoBus) {
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