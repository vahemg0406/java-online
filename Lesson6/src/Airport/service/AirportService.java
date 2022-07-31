package Airport.service;

import Airport.model.Plane;

import java.util.Scanner;

public class AirportService {
    public Plane creatPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Enter releas year");
        plane.setReleaseYear(s.nextInt());
        System.out.println("Is Military plane? Y/N");
        String m = s.next().toLowerCase();
        plane.setMilitary(m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + " " + plane.getReleaseYear());
    }

    public void printNameOrHours(Plane plane) {
        //    if (plane.getReleaseYear()>2000)
        //        System.out.println(plane.getName());
        //    else System.out.println(plane.getHoursInAir());
        System.out.println(plane.getReleaseYear() > 2000 ? plane.getName() : plane.getHoursInAir());
    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
        //  if(plane1.getHoursInAir()>plane2.getHoursInAir())
        //      return plane1.getName();
        //  else
        //      return plane2.getName();
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();

    }

    public Plane planeWithBiggerName(Plane a, Plane b) {
        //    if (a.getName().length()>b.getName().length())
        //        return a;
        //    else
        //        return b;
        return a.getName().length() > b.getName().length() ? a : b;
    }

    public void printPlaneArray(Plane[] planes) {
        for (Plane x : planes) {
            x.printInfo();
        }
    }

    public void printMilitaryPlanesAfter2010(Plane[] planes) {
        for (Plane x : planes) {
            if (x.isMilitary() && x.getReleaseYear() > 2010)
                x.printInfo();

        }
    }

    public Plane maxHoursInAir(Plane[] planes) {
        Plane max = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getHoursInAir() > max.getHoursInAir()) {
                max = planes[i];
            }
        }
        return max;
    }

    public void theOldestPlane(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getReleaseYear() < min.getReleaseYear()) {
                min = planes[i];
            }
        }
        min.printInfo();
    }

    public void theNewestMilitaryPlane(Plane[] planes) {
        Plane newest = planes[0];
        int indexOfMilitary = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                newest = planes[i];
                indexOfMilitary = i;
                break;
            }
        }
        for (int i = indexOfMilitary + 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getReleaseYear() > newest.getReleaseYear()) {
                newest = planes[i];
            }
        }
        newest.printInfo();
    }

    public void sortByReleasYear(Plane[] planes){
        boolean qaniDerIfMtnume = true;
        int counOfFors=0;
               while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < planes.length - 1-counOfFors; i++) {
                if (planes[i].getReleaseYear() > planes[i + 1].getReleaseYear()) {
                    Plane j = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = j;
                    qaniDerIfMtnume = true;
                }
            }
            counOfFors++;
        }
        printPlaneArray(planes);
    }

}
