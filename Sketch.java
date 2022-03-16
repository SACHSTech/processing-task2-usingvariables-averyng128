/** A simple program using variables
 * @author: A. Ng
 * 
 */


import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 300);
  }

  public void draw() {

    // foreground
    fill(90, 140, 90);
    rect((float) (width*0), (float) (height*.75), (float) (width/1), (float) (height/4));

    // house
    fill(200, 170, 150);
    rect((float) (width/4), (float) (height/1.6), (float) (width/2), (float) (height*.75));
    stroke(255);
    line((float) (width/2), (float) (height*.375), (float) (width*.75), (float) (height*.625));
    stroke(255);
    line((float) (width/2), (float) (height*.375), (float) (width/4), (float) (height/1.6));
    fill(220, 170, 150);
    triangle((float) (width/2), (float) (height*.375), (float) (width*.75), (float) (height/1.6), (float) (width/4), (float) (height*.625));
    
    // sun
    fill(300, 400, 200);
    ellipse((float) (width*.95), (float) (height/20), (float) (width*.15), (float) (height*.15));
    stroke(225);
    line((float) (width*.85), (float) (height*.0375), (float) (width*.8), (float) (height*.03));
    line((float) (width*.845), (float) (height*.075), (float) (width*.7875), (float) (height*.0875));
    line((float) (width*.85), (float) (height*.1125), (float) (width/1.25), (float) (height*.1425));
    line((float) (width*.8875), (float) (height*.1325), (float) (width*.875), (float) (height*.175));
    line((float) (width*.9375), (float) (height*.15), (float) (width*.95), (float) (height/5));

    // door
    fill(220, 170, 150);
    rect((float) (width/2), (float) (height*.75), (float) (width/8), (float) (height/4));
    fill(200, 170, 150);
    ellipse((float) (width*.6), (float) (height*.875), (float) (width*.0175), (float) (height*.0175));

    // cloud
    fill(255);
    ellipse((float) (width/4), (float) (height/8), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.2875), (float) (height/10), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.28), (float) (height*.15), (float) (width/20), (float) (height/20));
    ellipse((float) (width/3.2), (float) (height*.1125), (float) (width/20), (float) (height/20));
    ellipse((float) (width/3.2), (float) (height*.1625), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.35), (float) (height*.105), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.35), (float) (height*.155), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.3875), (float) (height*.12), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.3875), (float) (height*.17), (float) (width/20), (float) (height/20));
    ellipse((float) (width*.4125), (float) (height*.15), (float) (width/20), (float) (height/20));
  
    
  }
  

}