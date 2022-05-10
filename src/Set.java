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
                loc = new Location(6, "Снежные горы", "Дождь");
                charac = new Character("Орк", 56, "Воин", "Двуручный меч");
                ene = new Enemies(19, "Люди", "Склонны к убеждению", "Оружие ближнего боя");

        }
}

