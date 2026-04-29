public class Ducks extends Objects {
int duckNo;

// constructor
public Ducks() {
super(random(400), random(400)); // calling the Object constructor and putting ducks on random positions
duckNo = 0;
}

// drawing the duck objects
public void display(PApplet p) {
p.fill(0,0,255);
p.ellipse(x, y, size, size);
}
}
