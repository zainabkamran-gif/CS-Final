public class Main extends PApplet {
    // declaring arrays and object variables
    Chickens[] chic = new Chickens[50];
    Ducks[] duck = new Ducks[50];
    Fowls fowl;
    TotalEggs t;
    RestInPeace rip;

    public void settings() {
        size(400,400);
    }
    public void setup() {
        // actually creating objects and populating arrays
    fowl = new Fowls();
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
    // displaying chickens, ducks, day count, chicken and duck death counts, and total egg count
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

rip.cdeath(this);
rip.ddeath(this);
rip.display(this);

t.count(fowl, rip);
t.display(this);
}
    // first thing Java runs, without this our program will NOT run
       public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}
