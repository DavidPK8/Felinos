public class Leon extends Felinos{
    private int tamanio_melena;

    public Leon(){
        super();
    }

    public Leon(String nombre, int edad, double peso, int tamanio_melena) {
        super(nombre, edad, peso);
        this.tamanio_melena = tamanio_melena;
    }

    public int getTamanio_melena() {
        return tamanio_melena;
    }

    public void setTamanio_melena(int tamanio_melena) {
        this.tamanio_melena = tamanio_melena;
    }

    public void cazar(){
        System.out.println("Este es el metodo cazar del leon");
    }
}
