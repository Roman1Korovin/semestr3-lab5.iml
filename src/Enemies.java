import java.util.Scanner;
public class Enemies {
    private int lvl;
    private String type;
    private String weakness;
    private String resistance;

    public Enemies(){
        lvl = 14;
        type = "Демоны";
        weakness = "Свет";
        resistance = "Огонь";
    }
    public Enemies(int a, String b, String c, String d){
        Scanner scanner = new Scanner(System.in);
        int q =0;
        while(q==0)
            try {
                System.out.println("Введите уровень: ");
                lvl = a;
                if(lvl<0){
                    throw new Exception(String.valueOf(lvl));
                }
                q=1;
            }
        catch ( Exception ex)
        {
            System.out.println("Ошибка ввода! Уровень не может быть отрицательным!");
        }
        type = b;
        weakness = c;
        resistance = d;
    }
    public void display_enemies(){
        System.out.println(" Враги:\n |Уровень|      |Тип|       |Уязвимость|      |Сопротивление|\n");
        System.out.println(" |" + lvl + "|           |" + type + "|      |" + weakness + "|        |" + resistance + "|\n");
        System.out.println("........................................................................");
        Set.count++;
    }
    public void get_help(int x)
    {
        System.out.println( "\nЕсли ваш уровень ("+x+") ниже уровня ваших противников ("+ lvl +"), то, возможно, вам следует отступить!\n");
    }

}
