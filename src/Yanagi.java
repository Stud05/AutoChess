public class Yanagi implements Characters {
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

    public Yanagi() {
        this.health = 800;
        this.dmg = 30;
        this.baseMana = 0;
        this.mana = 40;
        this.spell = 250;
    }

}
