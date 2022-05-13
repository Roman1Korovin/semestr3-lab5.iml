abstract public class Weapon {
    protected int damage;
    public Weapon(int damage)
    {
        this.damage=damage;
    }
    public Weapon()
    {
        damage=20;
    }
    abstract public void display_weapon();
}
 class Sword extends Weapon {
    private int weight;
    public Sword()
    {
        this.weight=13;
    }
     public Sword(int damage, int weight)
    {
        this.weight=weight;
    }
    public  void display_weapon(){
        System.out.println ("Оружие: Меч\n Урон - " + damage + "\n Вес - " + weight);
     }
}
 class Crossbow extends Weapon {
     private int speed;

     public Crossbow() {
         this.speed = 50;
     }
     public Crossbow(int speed, int weight) {
         this.speed = weight;
     }

     public void display_weapon() {
         System.out.println("Оружие: Ар\n Урон - " + damage + "\n Скорость - " + speed);
     }
 }


