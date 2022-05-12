public class Set {
        public Location loc;
        public Character charac;
        public Enemies ene;
        public static int count = 0;

        static public int GetCount(){
                return count;
        }

        public Set(){

                loc = new Location();
                charac = new Character();
                ene = new Enemies();
        }
        public void init(){
                try {
                        loc = new Location(6, "Снежные горы", "Дождь");
                }
                catch(Exception ex){
                     System.out.println("Ошибка создания локации!! Ошибка: " + ex.getMessage() + "\n");
                }
                charac = new Character("Орк", 56, "Воин", "Двуручный меч");

                final int N = 2; final int M = 2;
                Enemies[][] ene = new Enemies[N][M];
                ene[0][0] = new Enemies(19, "Люди", "Огнетсрельное оружие", "Оружие ближнего боя");
                ene[0][1] = new Enemies(7, "Вампиры", "Свет и серебро", "Огнестрельное оружие");
                ene[1][0] = new Enemies(13, "Элементали огня", "Вода", "Огонь");
                ene[1][1] = new Enemies(25, "Зомби", "Голова", "Не восприимчивы к урону в тело");

                for (int i = 0; i < N; i++)
                        for (int j = 0; j < M; j++)
                        {
                                ene[i][j].display_enemies();
                        }
        }
}

