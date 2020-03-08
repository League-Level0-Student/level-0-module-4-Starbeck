PImage creeper;
PImage minecraft;
int creeperX=100;
int creeperY=100;
void setup() {
  size(1920, 1080);
  minecraft = loadImage("minecraft.png");
  minecraft.resize(1920, 1080);
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(10, 10);
}
void draw() {
  image(creeper, creeperX, creeperY);
  if(mousePressed){
    boolean nearCreeperX=isNear(mouseX, creeperX+5);
    if(nearCreeperX==true){
      boolean nearCreeperY=isNear(mouseY, creeperY+5);
      if(nearCreeperY==true){
        fill(#009900);
      }else if(nearCreeperY==false){
        fill(#990000);
      }
    }else if(nearCreeperX==false){
      fill(#990000);
    }else{
      
    }
    ellipse(mouseX, mouseY, 20, 20);
  }
}
  boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
     return true;
  else
     return false;
}
