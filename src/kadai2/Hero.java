package kadai2;

public class Hero extends Character {
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10のダメージを与えた");
        m.hp-=10;
    }
    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }
}
