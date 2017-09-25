// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obs = new Thing("Remove the obstacle");
        Thing stand = new Thing("Stand up");
        Thing lunch = new Thing("Eat lunch");

        stand.complete();
        lunch.complete();

        fleet.add(milk);
        fleet.add(obs);
        fleet.add(stand);
        fleet.add(lunch);

        System.out.println(fleet);
    }
}

/* fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacle"));
        fleet.add(new Thing("Stand up"));
        fleet.add(new Thing("Eat lunch"));*/