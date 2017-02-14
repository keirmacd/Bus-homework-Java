import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest{
Bus bus;
Passengers iggy;
Passengers mark;

@Before
public void before() {
Bus = new Bus("Paisley");
iggy = new Passengers("Iggy");
mark = new Passengers("Mark");

@Test void hasDestination(){
assertEquals("Paisley", bus.getDestination());

}

}

}