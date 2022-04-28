public class Character {
    private String race;
    private int lvl;
    private String clas;
    private String weapon;

    public void init_character() {
        race = "Эльф";
        lvl = 24;
        clas = "Маг";
        weapon = "Посох искупления";
    }

    public void init_character2(String a, int b, String c, String d) {
        race = a;
        lvl = b;
        clas = c;
        weapon = d;
    }
    public void display_character(){
        System.out.println(" Персонаж:\n |Раса|     |Уровень|     |Класс|     |Оружение|\n");
        System.out.println(" |" + race + "|      |" + lvl + "|          |" + clas + "|      |" + weapon + "|\n");
        System.out.println("........................................................................");
    }
}
