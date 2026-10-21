package exercises.constructor;

public class Show {

    public void printAll(Scheduling scheduling){
        System.out.println(
                scheduling.getNamePet() + "\n" +
                scheduling.getService() + "\n" +
                scheduling.getTime() + "\n" +
                scheduling.isParfum() + "\n" +
                scheduling.isRibbon() + "\n" +
                scheduling.isHidration() + "\n" +
                scheduling.getRemark() + "\n" +
                scheduling.getDiscount()
        );
    }
}
