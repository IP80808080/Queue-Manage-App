package com.example.queuemanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutUS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);

        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription(" This App is to Help People to get Appointment of there Doctor. This App also contains Emergency Function.")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("kasambe.kamlesh1@gmail.com")
                .addEmail("kasambe.kamlesh1@gmail.com ")
                .addWebsite(" - - - ")
                .addYoutube(" - - - ")
                .addPlayStore("com.example.queuemanagement")
                .addInstagram("kasambe_kamlesh")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Kamlesh Kasambe", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);

        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUS.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}
