package com.example.string_change;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private Button button;
    private int currentTextIndex = 0;

    private final String[] customTexts = {
            "Activity",
            "Intent",
            "Fragment",
            "Layout",
            "View",
            "XML",
            "Manifest",
            "Adapter",
            "RecyclerView",
            "Toast",
            "Bundle",
            "Callback",
            "Service",
            "Thread",
            "Drawable",
            "API",
            "SDK",
            "Gradle",
            "Resource",
            "Permission",
            "Handler",
            "Logcat",
            "APK",
            "AsyncTask",
            "Lifecycle",
            "ConstraintLayout",
            "SQLite",
            "ViewModel",
            "SharedPreferences",
            "Dependency",
            "Theme",
            "Context",
            "Parcelable",
            "Serializable",
            "ViewModel",
            "LiveData",
            "ViewModelFactory",
            "ViewModelProvider",
            "ViewModelStore",
            "ViewModelScope",
            "LiveData",
            "MutableLiveData",
            "Observer",
            "Repository",
            "ViewModel",
            "ViewModelProvider",
            "ViewModelStore",
            "ViewModelScope",
            "IntentService",
            "SharedPreferences",
            "ConstraintSet",
            "Coroutine",
            "HandlerThread"

    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

        int currentTextIndex = 0;
        textView2.setText(customTexts[currentTextIndex]);

        // Set button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText();

            }
        });
    }
    private void changeText() {
        currentTextIndex = (currentTextIndex + 1) % customTexts.length;
        textView2.setText(customTexts[currentTextIndex]);
    }


}