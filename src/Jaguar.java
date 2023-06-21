public class Jaguar extends Felinos{
    private int tamanio_orejas;

    public Jaguar(){
        super();
    }

    public Jaguar(String nombre, int edad, double peso, int tamanio_orejas) {
        super(nombre, edad, peso);
        this.tamanio_orejas = tamanio_orejas;
    }

    public int getTamanio_orejas() {
        return tamanio_orejas;
    }

    public void setTamanio_orejas(int tamanio_orejas) {
        this.tamanio_orejas = tamanio_orejas;
    }

    public void explorar(){
        System.out.println("Este es el metodo de explorar del jaguar");
    }
}
