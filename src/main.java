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

        for(int i=0;i<2;i++) {
            exm[i].loc.display_location();
        }


        exm[0].charac.init_character();
        exm[1].charac.init_character2("Орк", 56, "Воин", "Двуручный меч");

        exm[0].charac.display_character();
        exm[1].charac.display_character();

        exm[0].ene.init_enemies();
        exm[1].ene.init_enemies2(19, "Люди", "Склонны к убеждению", "Оружие ближнего боя");

        exm[0].ene.display_enemies();
        exm[1].ene.display_enemies();

        System.out.println("Кол-во выведенных блоков информации - " + Set.count + "\n");

        exm[0].loc.get_info_location();

        Set x = new Set();
        x.charac.choice_character(exm[0].charac, exm[1].charac);

        exm[1].ene.get_help(exm[0].charac.return_lvl());


        exm[0].loc.return_value();
    }
}