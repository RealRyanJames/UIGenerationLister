import android.graphics.Color;

public class LightMode {
    public static boolean light = true;
    public static int color;

    public static int is() {

        if (LightMode.light) {

            color = Color.rgb(255, 255, 255);

        }

        return color;
    }
}
