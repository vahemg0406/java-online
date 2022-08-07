package Airport;

import Airport.model.Plane;
import Airport.service.AirportService;

public class AirportTest {
    public static void main(String[] args) {
        AirportService service = new AirportService();
        Plane plane = service.creatPlane();
        Plane plane2 = service.creatPlane();
        Plane plane3 = service.creatPlane();
        System.out.println("--------------");
        Plane[] planes = {plane, plane2, plane3,};
        //   System.out.println(plane.getName());
        //   System.out.println(plane.getHoursInAir());
        //   System.out.println(plane.getReleaseYear());
        //   System.out.println(plane.isMilitary());
        // plane.printInfo();
        service.printNameAndReleaseDate(plane);
        System.out.println("printNameOrHours---");
        service.printNameOrHours(plane);
        System.out.println("nameOfPlaneWithBiggerTime---");
        System.out.println(service.nameOfPlaneWithBiggerTime(plane, plane2));
        System.out.println("planeWithBiggerName---");
        //  Plane z = service.planeWithBiggerName(plane, plane2);
        //  z.printInfo();
        service.planeWithBiggerName(plane, plane2).printInfo();
        System.out.println("printPlaneArray---");
        service.printPlaneArray(planes);
        System.out.println("printMilitaryPlanesAfter2010---");
        service.printMilitaryPlanesAfter2010(planes);
        System.out.println("maxHoursInAir---");
        service.maxHoursInAir(planes).printInfo();
        System.out.println("theOldestPlane---");
        service.theOldestPlane(planes);
        System.out.println("theNewestMilitaryPlane---");
        service.theNewestMilitaryPlane(planes);
        System.out.println("sortByReleasYear---");
        service.sortByReleasYear(planes);

    }
}
