import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;
PImage donkey;
PImage tail;
void setup() {
  Minim minim = new Minim(this);
  woohooSound = minim.loadSample("homer-woohoo.wav");
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(550, 406);
  tail.resize(50, 50);
}

void draw() {
  textSize(24);
  text("Pin the tail on the donkey",100,20);
  background (donkey);
  rect(0, 0, 50, 50);
  rect(480, 110, 50, 80);
  image(tail, mouseX, mouseY);
  //while (dist(0, 0, mouseX, mouseY) < 30){
  //  background (#000000);
  //}
  if(mousePressed){
    if(mouseX>=480&&mouseX<=530){
      if(mouseY>=110&&mouseY<=190){
        playSound();
        exit();
      }
      exit();
    }
    exit();
  }
  exit();
}
void playSound(){
           woohooSound.trigger();
           playSound = false;
}
