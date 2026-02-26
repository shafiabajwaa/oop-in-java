public class HotDogStand {

    private int id;
    private int hotDogsSold;

    public HotDogStand(int i) {
        id = i;
        hotDogsSold = 0;
    }
    public void justSold() {
        hotDogsSold = hotDogsSold + 1;
    }
  public int getHotDogsSold() {
        return hotDogsSold;
    }
    public int getId() {
        return id;    }

    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand(1);
        HotDogStand stand2 = new HotDogStand(2);
        HotDogStand stand3 = new HotDogStand(3);
        stand1.justSold();
        stand1.justSold();
        stand2.justSold();
     stand3.justSold();
        stand3.justSold();
        stand3.justSold();
       System.out.println("Stand " + stand1.getId() + " sold: " + stand1.getHotDogsSold());
        System.out.println("Stand " + stand2.getId() + " sold: " + stand2.getHotDogsSold());
        System.out.println("Stand " + stand3.getId() + " sold: " + stand3.getHotDogsSold());
    } }
