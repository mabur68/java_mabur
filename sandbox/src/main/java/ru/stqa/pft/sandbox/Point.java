package ru.stqa.pft.sandbox;

public class Point {
  int x1,x2;
  int y1,y2;
  Point(int x1, int y1,int x2,int y2){
    this.x1=x1;
    this.y1=y1;
    this.x2=x2;
    this.y2=y2;
  }
  public  double distance(){
    return Math.round(Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1)));

  }


}
