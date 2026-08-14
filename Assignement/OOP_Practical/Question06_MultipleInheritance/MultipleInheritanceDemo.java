public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        
        myPhone.makeCall("+123456789");
        myPhone.takePicture();
    }
}

interface Phone {
    void makeCall(String number);
}

interface Camera {
    void takePicture();
}

class SmartPhone implements Phone, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Dialing " + number + "...");
    }

    @Override
    public void takePicture() {
        System.out.println("Capturing photo with flash...");
    }
}
