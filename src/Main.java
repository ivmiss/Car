
public class Main {

    
    public static void main(String[] args) {
    
         Car myCar = new Car();
         myCar.printAtributes();
         myCar.changeLicense("av123");
         myCar.maxDistance();
         double distance = myCar.maxDistance();
         System.out.println("Maksimalna distanca je: " + distance);
         System.out.println();
         
         Car audi = new Car("Audi", 50, 2);
         audi.printAtributes();
         audi.changeLicense("kl6475");
         audi.changeWeight(1500);
         System.out.println("Maksimalna distanca je: " + audi.maxDistance());
         System.out.println();
         
         audi.fuelUp();
         audi.printAtributes();
         audi.travel(20);
         audi.printAtributes();
         audi.travel(30);
         audi.printAtributes();
        
         Car noviAuto = new Car("noviAuto", 40, 3, 5, 1);
         noviAuto.printAtributes();
         noviAuto.printPassengersInfo();
         noviAuto.getIn();
         noviAuto.getIn();
         noviAuto.getIn();
         noviAuto.getIn();
         noviAuto.getIn();
         noviAuto.getIn();
         noviAuto.printPassengersInfo();
         noviAuto.getOut();
         noviAuto.printPassengersInfo();
         noviAuto.getOut();
         noviAuto.getOut();
         noviAuto.getOut();
         noviAuto.getOut();
         noviAuto.getOut();
         noviAuto.getOut();
    }
    
    }
