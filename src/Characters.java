public interface Characters {
    int attack();

    int spell();

    boolean trySpell();

    void damaged(int n);

    void gainMana();
}
