
public class Location {
    private int size;
    private String typemap;
    private String weather;

    public void init_location(){
        size = 5;
        typemap = "Пустыня";
        weather = "Сонечно";
    }
    public void init_location2(int a, String b, String c){
        size = a;
        typemap = b;
        weather = c;
    }
    public void display_location() {
        System.out.println(" Локация:\n |Размер карты(км)|   |Тип карты|      |Погода|\n");
        System.out.println(" |" + size + "x" + size + "|                |" + typemap + "|        |" + weather + "|\n");
        System.out.println("........................................................................");
    }
    public void get_info_location() {
        if (typemap == "Пустыня") System.out.println("\nВы отправляетесь в пустыню! Лучше запаситесь водой.\n");
        if (typemap == "Снежные горы") System.out.println("\nОх, постарайтесь не замёрзнуть в горах. ЛУчше оденьтесь потеплей\n");

    }
}
