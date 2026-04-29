public class Chicken extends Objects { 
int chicNo;

//constructor
public Chicken(float x, float y, float size) {
super(random(400),random(400)); // calling the Object constructor and putting chickens on random positions
chicNo = 0;
}

// drawing the chicken objects
public void display(PApplet p) {
p.fill(255,100,0);
p.ellipse(x, y, size, size);
}
}
