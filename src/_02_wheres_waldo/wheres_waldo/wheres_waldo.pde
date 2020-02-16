void setup() {
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(590, 421);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // If the mouse is on Waldo, print “Waldo found!”
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
      ellipse(161,239,100,100);
      PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
      size(590, 421);
      image(waldo, 0, 0);
      if(mousePressed){
       if(mouseX>=110&&mouseX<=210){
         if(mouseY>=190&&mouseY<=290){
           playWoohoo();
           print("Woohoo");
           system.err.exit(5);
         }else{
           playDoh();
           print("Doh");
         }
       }else{
         playDoh();
         print("Doh");
       }
      }
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
