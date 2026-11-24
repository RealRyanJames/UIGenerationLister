import android.graphics.Color;

public class DarkMode {
    public static boolean dark = true;
    public static int color;

    public static int is() {

        if (DarkMode.dark) {

            color = Color.rgb(20, 20, 20);

        }

        return color;
    }
}
