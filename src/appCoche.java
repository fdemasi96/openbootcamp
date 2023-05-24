public class main {


    public static void main (String [] args) {
        Coche nuevoCoche = new Coche ();
        nuevoCoche.agregarPuerta();
        nuevoCoche.agregarPuerta();
        nuevoCoche.agregarPuerta();
        System.out.println (nuevoCoche.puertas);
    }

static class Coche {
    public int puertas = 2;

    public void agregarPuerta () {
        this.puertas++;
    }

}
    }