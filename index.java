void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
  line(200, 0, 200, 400);
  line(0, 200, 400, 200);

  //Fill a black color
  

  //Build your conditional statement 
  if (mouseX > width/2 && mouseY > height/2) {
  fill(0);
  rect(width/2, height/2, width/2, height/2);
  }
  if (mouseX > width/2 && mouseY < height/2) {
  fill(0);
  rect(width/2, height * 0 ,width/2, height/2);
  }
  if (mouseX < width/2 && mouseY < height/2) {
  fill(0);
  rect(width * 0, height * 0 ,width/2, height/2);
} 
if (mouseX < width/2 && mouseY > height/2) {
  fill(0);
  rect(width * 0, height/2 ,width/2, height/2);
}
}