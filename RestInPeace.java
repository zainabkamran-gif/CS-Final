public class RestInPeace extends Objects {
int deathCount;
// constructor
public RestInPeace() {
super(0,0);
deathCount=0;
}
// if x is pressed, a fowl dies
public boolean death(PApplet p) {
if (p.keyPressed && p.key=='x') {
deathCount++;
}
}
           // displaying the death count
public void display(PApplet p) {
           p.fill(255,0,0);
           p.textSize(30);
p.textAlign(PApplet.LEFT);
text("Death Count: " + deathCount,10,50);
}
}
