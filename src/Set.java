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
}

