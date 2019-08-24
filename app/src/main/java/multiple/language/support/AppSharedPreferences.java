package multiple.language.support;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSharedPreferences {

    /**
     * PREFS_NAME is a file name which generates inside data folder of application
     */
    private static final String PREFERENCES_FILE_NAME = "language_settings";

    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor prefEditor = null;

    private static Context mContext = null;
    public static AppSharedPreferences instance = null;

    public static AppSharedPreferences getInstance(Context context) {
        mContext = context;
        if (instance == null) {
            instance = new AppSharedPreferences();
        }
        sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        prefEditor = sharedPreferences.edit();
        return instance;
    }

    public void writeISOCode(String isoCode)
    {
        prefEditor.putString("iso_code", isoCode);
        prefEditor.commit();
    }

    public String readISOCode()
    {
        return sharedPreferences.getString("iso_code", "eng");
    }

    public void clearData() {
        prefEditor.clear();
        prefEditor.commit();
    }
}
