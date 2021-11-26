public class AppChecker {

    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("Cyk");

        android.info();
        android.runAndroidApp();

        IphoneApp apple = new IphoneApp("Fuch");
        apple.info();
        apple.runIphoneApp();

    }

}
