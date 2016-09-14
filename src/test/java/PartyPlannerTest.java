import org.junit.*;
import static org.junit.Assert.*;




  public class PartyPlannerTest {


    @Test
    public void getTotal_returnTotal_10() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, 0, 0, 0);
      assertEquals(445, testPartyPlanner.gTotal());
    }

    @Test
    public void getGuests_getNumOfGuests_10() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, 10, 0, 0);
      assertEquals(10, testPartyPlanner.getGuests());
    }

    @Test
    public void getFood_getnumFood_20() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, 20, 0, 0);
      assertEquals(20, testPartyPlanner.getFood());
    }

    @Test
    public void getDrinks_getNumDrinks_20() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, 0, 20, 0);
      assertEquals(20, testPartyPlanner.getDrinks());

    }
    @Test
    public void getTotal_ofGuestsSeeingBand_17() {
      PartyPlanner testPartyPlanner = new PartyPlanner(10, 0, 0, 0);
      assertEquals(445, testPartyPlanner.gTotal());
    }

  }
