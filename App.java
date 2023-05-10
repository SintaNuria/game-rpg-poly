public class App {
    public static void main(String[] args) throws Exception {
       
        Hero hh = new Hero();
        hh.move(); 
        hh.move(" Sinta ");
        Hero hd = new Fighter();
        hd.move(); 

        
        Enemy ee = new Enemy();
        ee.move(); 
        ee.move(4);
        Enemy ed = new Witch();
        ed.move(); 
        
       
        Character ch = new Hero();
        ch.move(); 
        Character chd = new Enemy();
        chd.move(); 
        Character cht = new Witch();
        cht.move(); 
        Character che = new Fighter();
        che.move(); 
        
        
        Character chl = new Witch();
        chl.move(); 
        Hero ht = (Hero) chl;
        Fighter fi = (Fighter) ht;
        fi.move(); 
    }
}