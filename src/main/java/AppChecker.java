public class AppChecker {
    public static void main(String[] args) {
        IphoneApp iphone = new IphoneApp("Apple");
        iphone.appInfo();
        iphone.runIphoneApp();

        AndroidApp android = new AndroidApp("Xiamomi");
        android.runAndroidApp();
        android.appInfo();
    }
}
