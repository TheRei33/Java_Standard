package Java_Standard_7;

public class SeventoThirthree {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner2 {
        int ilv = outerIv;
        int scv = outerCv;
    }

    static class StaticInner2 {
        //        int siv = outerIv;
        static int scv = outerCv;
    }

    void Method() {
        int lv = 0;
        final int LV = 0;

        class LocalInner2 {
            int liv = outerIv;
            int liv2 = outerCv;

            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
