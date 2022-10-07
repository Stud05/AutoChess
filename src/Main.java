public class Main {
    public static void main(String[] args) {
        Yanagi yanagi = new Yanagi();
        Zephyr zephyr = new Zephyr();

        while(yanagi.health > 0 && zephyr.health > 0){
            zephyr.damaged(yanagi.attack());
            if(yanagi.trySpell()) {
                zephyr.damaged(yanagi.spell());
            }
            System.out.println(zephyr.health);
        }
        if (yanagi.health > 0 ) System.out.println("\r\nYanagi wins");
        else System.out.println("Zephyr wins");
    }

}