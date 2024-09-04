package adapter;

public class EnemyAdapter implements IEnemy{
    SpecialEnemy e;

    EnemyAdapter(SpecialEnemy se) {
        this.e = se;
    }

    @Override
    public String attack() {
        return e.castSpell();
    }
}

