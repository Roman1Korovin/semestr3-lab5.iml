public class Enemies {
    private int lvl;
    private String type;
    private String weakness;
    private String resistance;

    public void init_enemies(){
        lvl = 14;
        type = "Демоны";
        weakness = "Свет";
        resistance = "Огонь";
    }
    public void init_enemies2(int a, String b, String c, String d){
        lvl = a;
        type = b;
        weakness = c;
        resistance = d;
    }
    public void display_enemies(){
        System.out.println(" Враги:\n |Уровень|      |Тип|       |Уязвимость|      |Сопротивление|\n");
        System.out.println(" |" + lvl + "|           |" + type + "|      |" + weakness + "|        |" + resistance + "|\n");
        System.out.println("........................................................................");
    }
    public void get_help(int x)
    {
        System.out.println( "\nЕсли ваш уровень ("+x+") ниже уровня ваших противников ("+ lvl +"), то, возможно, вам следует отступить!\n");
    }

}
