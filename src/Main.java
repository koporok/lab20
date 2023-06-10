public class Main {
    public static void main(String[] args) {
        TransportCompany transportCompany = new TransportCompany();
        Transport truck = transportCompany.createTruck();
        truck.drive();
        Transport ship = transportCompany.createShip();
        ship.drive();
        Transport airplane = transportCompany.createAirplane();
        airplane.drive();
    }
}