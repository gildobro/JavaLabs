package labTest.LabTest1.src;

public class LabTest1 {
    public static void main(String[] args) throws Exception {

        // declare array of Car objects
        Car[] crs = {

                new Car("Tesla", "Model3", "Blue", 2021, new double[] { 261, 162 }),

                new Car("Ferrari", "488", "Red", 2020, new double[] { 330, 205 }),

                new Car("McLaren", "P1", "Black", 2019, new double[] { 209, 217 }),

                new Car("Corvette", "ZR1", "Green", 2022, new double[] { 344, 212 }), };

        // loop through each array and print object information
        for (Car cars : crs) {
            System.out.println(cars);
        }

    }
}
