package multiple.language.support;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
public class MultipleLangaugeSupportLoginActivity extends AppCompatActivity {

    private String languageISOCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_langauge_support_login);
        languageISOCode= AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).readISOCode();
        setLanguage(languageISOCode);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.language_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_english:
                languageISOCode="eng";
                AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).writeISOCode(languageISOCode);
                setLanguage(languageISOCode);
                break;
            case R.id.action_hindi:
                languageISOCode="hi";
                AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).writeISOCode(languageISOCode);
                setLanguage(languageISOCode);
                break;
            case R.id.action_telugu:
                languageISOCode="te";
                AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).writeISOCode(languageISOCode);
                setLanguage(languageISOCode);
                break;
            case R.id.action_french:
                languageISOCode="fr";
                AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).writeISOCode(languageISOCode);
                setLanguage(languageISOCode);
                break;
            case R.id.action_german:
                languageISOCode="de";
                AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).writeISOCode(languageISOCode);
                setLanguage(languageISOCode);
                break;
            case R.id.action_japanese:
                languageISOCode="ja";
                AppSharedPreferences.getInstance(MultipleLangaugeSupportLoginActivity.this).writeISOCode(languageISOCode);
                setLanguage(languageISOCode);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setLanguage(String languageISOCode)
    {
        Locale locale = new Locale(languageISOCode);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_multiple_langauge_support_login);
    }
}
