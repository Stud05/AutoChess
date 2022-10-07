public class Zephyr implements Characters {

    @Override
    public int attack() {
        gainMana();
        return dmg;
    }

    @Override
    public int spell() {
        System.out.println("Spell casted");
        baseMana = 0;
        return spell;
    }

    @Override
    public boolean trySpell() {
        return (baseMana == mana);
    }

    @Override
    public void damaged(int n) {
        health -= n;
    }

    @Override
    public void gainMana() {
        baseMana += 10;
    }


    int health;
    int dmg;
    int baseMana;
    int mana;
    int spell;

    public Zephyr() {
        this.health = 1000;
        this.dmg = 15;
        this.baseMana = 10;
        this.mana = 30;
        this.spell = 100;
    }
}
