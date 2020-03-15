
package decorator;

abstract class BusDecorator implements Bus {

    protected Bus tempBus;

    public BusDecorator(Bus nuevoBus){ //Se puede mandar cualquier cosa que implemente carro
        
        tempBus = nuevoBus;
    }
    
    @Override
    public String getCaracteristicas(){
        return tempBus.getCaracteristicas();
    }
    @Override
    public void setCaracteristicas(String newCaracteristicas){
        tempBus.setCaracteristicas(newCaracteristicas);
    } 
}
