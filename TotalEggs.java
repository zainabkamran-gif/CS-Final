public class TotalEggs extends Objects {
int total;
// constructor
public TotalEggs() {
super(0,0);
total=0;
}
public void count(Fowls fowl, RestInPeace rip) {
total = fowl.totalEggsLaid - rip.chicDeathCount - rip.duckDeathCount;
}
// displaying the updated total egg count
public void display(PApplet p) {
 p.fill(255,0,0);
 p.textSize(30);
 p.textAlign(PApplet.LEFT);
 p.text("Total Eggs: " + total, 10, 130);
}
}
