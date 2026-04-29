public class Days extends Objects {
int d;

// constructor
public Days() {
super(0,0);
d = 1;
}

public void increment(PApplet p) {
if (p.keyPressed && key == 'z' && p.frameCount%2==0) { // increases day by 1 if key pressed is z and if the user presses the key NOT MORE THAN TWICE
d++;
}
public void display(PApplet p) {
    p.fill(0);
    p.textSize(20);
    p.textAlign(PApplet.LEFT);
    p.text("Day: " + d, 10, 30);
}
}
}
