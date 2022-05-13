interface  Iprinter
{
    void Print();
}

public class Location implements   Iprinter{
    private int size;
    private String typemap;
    private String weather;

    public Location(){
        this.size = 5;
        this.typemap = "Пустыня";
        this.weather = "Сонечно";
    }
    public Location(int a, String b, String c){
        this.size = a;
        this.typemap = b;
        this.weather = c;
    }
    public void display_location() {
        System.out.println(" Локация:\n |Размер карты(км)|   |Тип карты|      |Погода|\n");
        System.out.println(" |" + this.size + "x" + this.size + "|                |" + this.typemap + "|        |" +this.weather + "|\n");
        System.out.println("........................................................................");
        Set.count++;
    }
    public void get_info_location() {
        if (typemap == "Пустыня") System.out.println("\nВы отправляетесь в пустыню! Лучше запаситесь водой.\n");
        if (typemap == "Снежные горы") System.out.println("\nОх, постарайтесь не замёрзнуть в горах. ЛУчше оденьтесь потеплей\n");

    }

    public void return_value() {
        Rezult z = new Rezult();
        int k;
        this.get_size(z);
        k = z.param;
        System.out.println(k);
    }

    public void get_size(Rezult z){
        z.param = size;
    }

    public void Print()
    {
        System.out.println(" Локация:\n |Размер карты(км)|   |Тип карты|      |Погода|\n");
        System.out.println(" |" + this.size + "x" + this.size + "|                |" + this.typemap + "|        |" + this.weather + "|\n");
        System.out.println("........................................................................");
    }
}

class Rezult {
public int param;
}

