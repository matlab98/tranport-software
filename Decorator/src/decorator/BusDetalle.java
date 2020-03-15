
package decorator;

public class BusDetalle implements Bus{
    private String Caracteristicas="La categoria es Bus";

    @Override
    public String getCaracteristicas() {
        return this.Caracteristicas;
    }

    @Override
    public void setCaracteristicas(String newCaracteristicas) {
        this.Caracteristicas=newCaracteristicas;
    }
    
}
