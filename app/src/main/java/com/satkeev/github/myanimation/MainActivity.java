package com.satkeev.github.myanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;



  import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
    public class MainActivity extends AppCompatActivity {

//Create variables for animation
        private Button buttonAnim;
        private Animation logoAnim,buttonLogoAnim ;
        private ImageView logoImage;
        private Animation textLogoAnim;
        private View textAnim;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.image_activity);
            init();

        }
        private void init()
        {
// Loading animations variables
            textLogoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.text_anim);
            logoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.image_anim);
            buttonLogoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_anim);
            logoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);

            textAnim = findViewById(R.id.text_view);
            logoImage = findViewById(R.id.logo_view);
            logoImage.setImageResource(R.drawable.logo);
            buttonAnim = findViewById(R.id.button);

//Launch animation
            textAnim.startAnimation(textLogoAnim);
            logoImage.startAnimation(logoAnim);
            buttonAnim.startAnimation(buttonLogoAnim);


        }

        public void onClickStart(View view)
        {
            Intent i = new Intent(com.satkeev.github.myanimation.MainActivity.this,MainActivity.class);
            startActivity(i);

        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            finish();
        }
    }

