public class Fowls extends Objects {
int totalEggsLaid;
Days day;

// constructor
public Fowls() {
super(0,0);
totalEggsLaid = 0;
day = new Days();
}

public void updateDay(PApplet p) {
day.increment(p);  
day.display(p);
}

// method to attempt to lay a chicken egg
public boolean layChicEggAttempt(Chickens c) {
float r = random(0,1);
if (r>.8) {
totalEggsLaid++;
c.chicNo++;
return true;
} else {
return false;
}
}
// method to attempt to lay a duck egg
public boolean layDuckEggAttempt(Ducks d) {
float r = random(0,1);
if (r>.8) {
totalEggsLaid++;
d.duckNo++;
return true;
} else {
return false;
}
}
}
