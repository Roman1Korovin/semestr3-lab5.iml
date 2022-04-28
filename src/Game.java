import java.util.Date;

public class Game {
    public String name;
    public double version;
    public String date;

    public void info_game(String a, double b){
        name=a;
        version=b;
        Date time = new Date();
        date =String.format("%tc",time);
    }

}
