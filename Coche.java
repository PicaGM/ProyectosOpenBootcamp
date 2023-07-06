class Coche {
    private int numPuertas;

    public Coche() {
        numPuertas = 1;
    }

    public void incrementarPuertas() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Número de puertas: " + miCoche.getNumPuertas());
    }
}