import java.util.Scanner;

public class Character implements Cloneable{
    private String race;
    protected int lvl;
    private String clas;
    private String weapon;

    public Object Clone() {
        {
            return new Character(race = this.race, lvl = this.lvl, clas = this.clas, weapon = this.weapon);
        }
    }
    public Character() {
        race = "Эльф";
        lvl = 24;
        clas = "Маг";
        weapon = "Посох искупления";
    }

    public Character(String a, int b, String c, String d) {
        race = a;
        lvl = b;
        clas = c;
        weapon = d;
    }

    public void display_character() {
        Sword sw= new Sword();
        System.out.println(" Персонаж:\n |Раса|     |Уровень|     |Класс|     |Оружение|\n");
        System.out.println(" |" + race + "|      |" + lvl + "|          |" + clas + "|      |" + weapon + "|\n");
        System.out.println("........................................................................");
        sw.display_weapon();
        Set.count++;
    }

    public void choice_character(Character x, Character y) {
        {
            Scanner scanner = new Scanner(System.in);

            int a;
            System.out.println("\nВыберите персонажа:\n");
            System.out.println("   Раса     Уровент     Класс     Оружение\n");
            System.out.println("1) " + x.race + "      " + x.lvl + "          " + x.clas + "      " + x.weapon + "\n");
            System.out.println("2) " + y.race + "      " + y.lvl + "          " + y.clas + "      " + y.weapon + "\n");
            do {
                a = scanner.nextInt();
            } while (a < 1 || a > 2);
            if (a == 1) System.out.println("Отличиный выбор, если вы любите магию!\n");
            if (a == 2) System.out.println("Любите решать проблемы грубой силой? Замечательно!\n");
        }
    }

    public int return_lvl() {
        return lvl;
    }
}
class  NPC extends Character {
    private String name;
    private String  cpecialization;

    public NPC(String a, String b, int c){
        name = a;
        cpecialization=b;
        lvl=c;
    }
    public int return_lvl(int t){
        return lvl;
    }
}
