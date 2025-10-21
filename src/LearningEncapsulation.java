public class LearningEncapsulation {

    public static void main(String[] args){
        Car car1 = new Car("Chevrolet", "Mazeratti", 2020);
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}
