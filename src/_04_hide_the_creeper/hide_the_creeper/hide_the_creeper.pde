PImage creeper;
void setup() {
  size(1920, 1080);
  PImage minecraft = loadImage("minecraft.png");
  minecraft.resize(1920, 1080);
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(100, 100);
}

void draw() {
  image(creeper, mouseX, mouseY);
  
}
  boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
     return true;
  else
     return false;
}
