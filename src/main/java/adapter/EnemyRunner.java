package adapter;

public class EnemyRunner {
    public static void main(String[] args) {
        SpecialEnemy specialEnemy = new SpecialEnemy();
        IEnemy enemyAdapter = new EnemyAdapter(specialEnemy);
        System.out.println(enemyAdapter.attack());
    }
}
