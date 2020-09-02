public class Game {
    public static void main(String[] args){

        // membuat objek player
        Player zaini = new Player();

        // mengisi atribut player
        zaini.name = "Zaini Ganteng";
        zaini.speed = 80;
        zaini.healthPoin = 100;

        // menjalankan method
        zaini.run();

        if(zaini.isDead()){
            System.out.println("Game Over!");
        }
    }
}