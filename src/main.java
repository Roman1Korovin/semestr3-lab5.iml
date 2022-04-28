public class main
{

    public static void main(String[] args) {
        Game game = new Game();
        game.info_game("Хроники хауса", 0.1);

        Set exm[] = new Set[2];
        exm[0]=new Set();
        exm[1]=new Set();

        exm[0].loc.init_location();
        exm[1].loc.init_location2(6, "Снежные горы", "Дождь");

        exm[0].loc.display_location();
        exm[1].loc.display_location();

        exm[0].charac.init_character();
        exm[1].charac.init_character2("Орк", 56, "Воин", "Двуручный меч");

        exm[0].charac.display_character();
        exm[1].charac.display_character();

    }
}