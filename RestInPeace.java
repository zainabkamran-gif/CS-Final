public class RestInPeace extends Objects {
int chicDeathCount;
int duckDeathCount;
// constructor
public RestInPeace() {
super(0,0);
chicDeathCount=0;
duckDeathCount=0;
}
// if x is pressed, a chicken dies
public void cdeath(PApplet p) {
if (p.keyPressed && p.key=='x') {
chicDeathCount++;
}
}

// if y is pressed, a duck dies
public void ddeath(PApplet p) {
if (p.keyPressed && p.key=='y') {
duckDeathCount++;
}
}

// displaying the death count
public void display(PApplet p) {
p.fill(255,0,0);
p.textSize(30);
p.textAlign(PApplet.LEFT);
p.text("Chicken Death Count: " + chicDeathCount,10,50);
p.fill(255,0,0);
p.textSize(30);
p.textAlign(PApplet.LEFT);
p.text("Duck Death Count: " + duckDeathCount,10,90);
}
}
