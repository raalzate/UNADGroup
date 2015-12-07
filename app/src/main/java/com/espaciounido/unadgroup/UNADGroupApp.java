

import android.app.Application;

import com.espaciounido.unadgroup.R;
import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by Contenidos on 24/11/2015.
 */
public class UNADGroupApp extends Application {
    public void onCreate() {
        Parse.initialize(this,
                getString(R.string.parse_id),
                getString(R.string.parse_key));
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }
}
