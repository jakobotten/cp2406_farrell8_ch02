public class QuartzToGallons {
    public static void main(String[] args) {
        final int NUMBER_OF_QUARTZ_IN_A_GALLON = 4;
        int quartzRequired = 18;
        System.out.println("A job that needs " + quartzRequired + " quartz requires " +
                quartzRequired / NUMBER_OF_QUARTZ_IN_A_GALLON + " gallons plus " +
                quartzRequired % NUMBER_OF_QUARTZ_IN_A_GALLON + " quartz.");
    }
}
