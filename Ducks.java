public class Ducks extends Objects {
int duckNo;

// constructor
public Ducks(float x, float y, float size) {
super(random(400), random(400)); // calling the Object constructor and putting ducks on random positions
duckNo = 0;
}

// drawing the duck objects
public void display(PApplet p) {
p.fill(175,100,220);
p.ellipse(x, y, size, size);
}
}
