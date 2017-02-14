import java.util.ArrayList;

public class Bus{
  private ArrayList<Passengers> passengers;
  private String destination;




  public Bus(String destination){
    this.destination = destination;
    this.passengers = new ArrayList<Passengers>();
  }
  public String getDestination(){
    return this.destination;
  }
  public void setDestination(String destination){
    this.name = name;
  }
    public int passengersOnBus(){
      return passengers.size();
  }
  public void remove(Passengers passenger){
    for (Passengers mark : this.belly) {
      if (mark.getName() == passengers.getName()) {
        System.out.println("The name of the passenger is " + mark.getName());
        passengers.remove(jam);
      }
    }
  }
  public void lastStop() {
  passengers.clear();
    
  }
}