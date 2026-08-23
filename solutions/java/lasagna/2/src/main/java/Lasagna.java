public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time_passed) {
        return 40 - time_passed;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int time_passed) {
        int total = time_passed +
                    this.preparationTimeInMinutes(layers);
        return total;
    }
}
