import java.util.Scanner;

public class Character {
    private String race;
    private int lvl;
    private String clas;
    private String weapon;

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
    public void display_character(){
        System.out.println(" Персонаж:\n |Раса|     |Уровень|     |Класс|     |Оружение|\n");
        System.out.println(" |" + race + "|      |" + lvl + "|          |" + clas + "|      |" + weapon + "|\n");
        System.out.println("........................................................................");
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
        public int return_lvl()
        {
            return lvl;
        }
}
