 void setup(){
        PImage face=loadImage("face.jpg");
        size(800,600);
        face.resize(width,height);
        background(face);
    }

    void draw(){
      PImage face=loadImage("face.jpg");
        size(800,600);
        face.resize(width,height);
      background(face);
      fill(#ffffff);
      rect(178,272,63,63);
      rect(339,272,63,63);
      if(mouseX>=241||mouseX<=178){
        mouseX=178;
      }
      if(mouseY>=304||mouseY<=272){
        mouseY=272;
      }
      ellipse(210,303,90,90);
      ellipse(371,303,90,90);
      fill(#000000);
      ellipse(mouseX,mouseY,25,25);
      ellipse(mouseX+161,mouseY,25,25);
    }
