PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(550, 406);
  tail.resize(50, 50);
}

void draw() {
  background (donkey);
  rect(0, 0, 50, 50);
  rect(480, 110, 50, 80);
  image(tail, mouseX, mouseY);
}
