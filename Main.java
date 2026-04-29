public class Main extends PApplet {
    // declaring arrays and variables
    Chickens[] chic = new Chickens[50];
    Ducks[] duck = new Ducks[50];
    Fowls fowl;
    Days day;
    TotalEggs t;
    RestInPeace rip;

    public void settings() {
        size(400,400);
    }
    public void setup() {
        // actually creating objects and populating arrays
    fowl = new Fowls();
    day = new Days();
    t = new TotalEggs();
    rip = new RestInPeace();
    for (int i=0; i<chic.length; i++) {
        chic[i]=new Chickens();
    }
    for (int i=0; i<duck.length; i++) {
        duck[i]=new Ducks();
    }
    }

public void draw() {
    // displaying chickens, ducks, day count, and death count
    background(255);
     for (int i=0; i<chic.length; i++) {
        chic[i].display(this);
        fowl.layChicEggAttempt(chic[i]);
     }
       for (int i=0; i<duck.length; i++) {
        duck[i].display(this); 
        fowl.layDuckEggAttempt(duck[i]);
}

fowl.updateDay(this);

rip.death(this);
rip.display(this);

t.count(fowl, rip);
t.display(this);
}
       public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}
