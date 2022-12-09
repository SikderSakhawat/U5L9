public class TrackCapuchin {
    //a
    private int xMonkey;
    private int yMonkey;
    private int xFood;
    private int yFood;

    public TrackCapuchin(int foodX, int foodY){
        this.xMonkey = 0;
        this.yMonkey = 0;
        this.xFood = foodX;
        this.yFood = foodY;
    }
    // b
    public int getxMonkey() {
        return xMonkey;
    }

    public int getyMonkey() {
        return yMonkey;
    }

    public int getxFood() {
        return xFood;
    }

    public int getyFood() {
        return yFood;
    }

    // c
    public void moveMonkey(int x, int y){
        this.xMonkey += x;
        this.yMonkey += y;
    }

    //d
    public double calcFoodDistance(){
        return Math.sqrt(Math.pow(xMonkey - xFood, 2) + Math.pow(yMonkey - yFood, 2));
    }

    //e
    public boolean isCloserThan(TrackCapuchin other){
        if(this.calcFoodDistance() < other.calcFoodDistance()) return false;
        else if (other.calcFoodDistance() > this.calcFoodDistance()) return true;
        return false;
    }
}
