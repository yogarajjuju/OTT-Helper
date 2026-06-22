package ott;
public class StreamingService{
  String name;
  int pricePerUnit;
  int unitInHours;
  public StreamingService(String name , int pricePerUnit , int unitInHours){
    this.name =name;
    this.pricePerUnit=pricePerUnit;
    this.unitInHours=unitInHours;
  }
  public int calculateCost (int hours){
    int cost = (hours / unitInHours) *pricePerUnit;
    return cost;
  }
}
