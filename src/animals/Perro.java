package animals;

public class Perro extends Animal {

    public Perro() {
    }

    // ----------------------------
    @Override
    public void sonido() {
        System.out.println(this.getNombre() + " dice: BUUUP !");
            System.out.println(this.getNombre() + " dice: bupbup !");
    }
}
