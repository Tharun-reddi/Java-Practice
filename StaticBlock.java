public class StaticBlock {
    static String appVersion;

    // Static block
    static {
        appVersion = "1.0.0";
        System.out.println("Static block executed. App Version: " + appVersion);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("App Version: " + appVersion);
    }
}

    
