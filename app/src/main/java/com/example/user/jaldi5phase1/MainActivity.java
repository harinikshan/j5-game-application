package com.example.user.jaldi5phase1;

import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Timer;

import static android.os.Build.ID;

public class MainActivity extends AppCompatActivity {
//Button coin1,coin2,coin3,coin4,coin5,coin6,coin7,coin8,coin9,coin10,coin11,coin12,coin13,coin14,coin15,coin16,coin17,coin18,coin19;
//    Button coin20,coin21,coin22,coin23,coin24,coin25,coin26,coin27,coin28,coin29;
//    Button coin30,coin31,coin32,coin33,coin34,coin35,coin36,coin37,coin38,coin39;
//    Button coin40,coin41,coin42,coin43,coin44,coin45,coin46,coin47,coin48,coin49;
//    Button coin50,coin51,coin52,coin53,coin54,coin55,coin56,coin57,coin58,coin59;
//    Button coin60,coin61,coin62,coin63,coin64,coin65,coin66,coin67,coin68,coin69;
//    Button coin70,coin71,coin72,coin73,coin74,coin75,coin76,coin77,coin78,coin79;
//    Button coin80,coin81,coin82,coin83,coin84,coin85,coin86,coin87,coin88,coin89;
//
    TextToSpeech toSpeech;
    int result;
    final Button[] coin = new Button[100];
    Button swap,reset;
    TextView display;
    ImageView coinView;
    ArrayList<Integer> list;
    int i = 0,max = 100;
    int x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        coin1= (Button)findViewById(R.id.coin_1);
//        coin2= (Button)findViewById(R.id.coin_2);
//        coin3= (Button)findViewById(R.id.coin_3);
//        coin4= (Button)findViewById(R.id.coin_4);
//        coin5= (Button)findViewById(R.id.coin_5);
//        coin6= (Button)findViewById(R.id.coin_6);
//        coin7= (Button)findViewById(R.id.coin_7);
//        coin8= (Button)findViewById(R.id.coin_8);
//        coin9= (Button)findViewById(R.id.coin_9);
//        coin10= (Button)findViewById(R.id.coin_10);
//        coin11= (Button)findViewById(R.id.coin_11);
//        coin12= (Button)findViewById(R.id.coin_12);
//        coin13= (Button)findViewById(R.id.coin_13);
//        coin14= (Button)findViewById(R.id.coin_14);
//        coin15= (Button)findViewById(R.id.coin_15);
//        coin16= (Button)findViewById(R.id.coin_16);
//        coin17= (Button)findViewById(R.id.coin_17);
//        coin18= (Button)findViewById(R.id.coin_18);
//        coin19= (Button)findViewById(R.id.coin_19);
//        coin20= (Button)findViewById(R.id.coin_20);
//        coin21= (Button)findViewById(R.id.coin_21);
//        coin22= (Button)findViewById(R.id.coin_22);
//        coin23= (Button)findViewById(R.id.coin_23);
//        coin24= (Button)findViewById(R.id.coin_24);
//        coin25= (Button)findViewById(R.id.coin_25);
//        coin26= (Button)findViewById(R.id.coin_26);
//        coin27= (Button)findViewById(R.id.coin_27);
//        coin10= (Button)findViewById(R.id.coin_10);
//        coin11= (Button)findViewById(R.id.coin_11);
//        coin12= (Button)findViewById(R.id.coin_12);
//        coin13= (Button)findViewById(R.id.coin_13);
//        coin14= (Button)findViewById(R.id.coin_14);
//        coin15= (Button)findViewById(R.id.coin_15);
//        coin16= (Button)findViewById(R.id.coin_16);
//        coin17= (Button)findViewById(R.id.coin_17);
//        coin18= (Button)findViewById(R.id.coin_18);
//        coin19= (Button)findViewById(R.id.coin_19);
//        coin20= (Button)findViewById(R.id.coin_20);
//        coin21= (Button)findViewById(R.id.coin_21);
//        coin22= (Button)findViewById(R.id.coin_22);
//        coin23= (Button)findViewById(R.id.coin_23);
//        coin24= (Button)findViewById(R.id.coin_24);
//        coin25= (Button)findViewById(R.id.coin_25);
//        coin26= (Button)findViewById(R.id.coin_26);
//        coin27= (Button)findViewById(R.id.coin_27);
//        coin28= (Button)findViewById(R.id.coin_28);
//        coin29= (Button)findViewById(R.id.coin_29);
//        coin30= (Button)findViewById(R.id.coin_30);
//        coin31= (Button)findViewById(R.id.coin_31);
//        coin32= (Button)findViewById(R.id.coin_32);
//        coin33= (Button)findViewById(R.id.coin_33);
//        coin34= (Button)findViewById(R.id.coin_34);
//        coin35= (Button)findViewById(R.id.coin_35);
//        coin36= (Button)findViewById(R.id.coin_36);
//        coin37= (Button)findViewById(R.id.coin_37);
//        coin38= (Button)findViewById(R.id.coin_38);
//        coin39= (Button)findViewById(R.id.coin_39);
//        coin40= (Button)findViewById(R.id.coin_40);
//        coin41= (Button)findViewById(R.id.coin_41);
//        coin42= (Button)findViewById(R.id.coin_42);
//        coin43= (Button)findViewById(R.id.coin_43);
//        coin44= (Button)findViewById(R.id.coin_44);
//        coin45= (Button)findViewById(R.id.coin_45);
//        coin46= (Button)findViewById(R.id.coin_46);
//        coin47= (Button)findViewById(R.id.coin_47);
//        coin48= (Button)findViewById(R.id.coin_48);
//        coin49= (Button)findViewById(R.id.coin_49);
//        coin50= (Button)findViewById(R.id.coin_50);
//        coin51= (Button)findViewById(R.id.coin_51);
//        coin52= (Button)findViewById(R.id.coin_52);
//        coin53= (Button)findViewById(R.id.coin_53);
//        coin54= (Button)findViewById(R.id.coin_54);
//        coin55= (Button)findViewById(R.id.coin_55);
//        coin56= (Button)findViewById(R.id.coin_56);
//        coin57= (Button)findViewById(R.id.coin_57);
//        coin58= (Button)findViewById(R.id.coin_58);
//        coin59= (Button)findViewById(R.id.coin_59);
//        coin60= (Button)findViewById(R.id.coin_60);
//        coin61= (Button)findViewById(R.id.coin_61);
//        coin62= (Button)findViewById(R.id.coin_62);
//        coin63= (Button)findViewById(R.id.coin_63);
//        coin64= (Button)findViewById(R.id.coin_64);
//        coin65= (Button)findViewById(R.id.coin_65);
//        coin66= (Button)findViewById(R.id.coin_66);
//        coin67= (Button)findViewById(R.id.coin_67);
//        coin68= (Button)findViewById(R.id.coin_68);
//        coin69= (Button)findViewById(R.id.coin_69);
//        coin70= (Button)findViewById(R.id.coin_70);
//        coin71= (Button)findViewById(R.id.coin_71);
//        coin72= (Button)findViewById(R.id.coin_72);
//        coin73= (Button)findViewById(R.id.coin_73);
//        coin74= (Button)findViewById(R.id.coin_74);
//        coin75= (Button)findViewById(R.id.coin_75);
//        coin76= (Button)findViewById(R.id.coin_76);
//        coin77= (Button)findViewById(R.id.coin_77);
//        coin78= (Button)findViewById(R.id.coin_78);
//        coin79= (Button)findViewById(R.id.coin_79);
//        coin80= (Button)findViewById(R.id.coin_80);
//        coin81= (Button)findViewById(R.id.coin_81);
//        coin82= (Button)findViewById(R.id.coin_82);
//        coin83= (Button)findViewById(R.id.coin_83);
//        coin84= (Button)findViewById(R.id.coin_84);
//        coin85= (Button)findViewById(R.id.coin_85);
//        coin86= (Button)findViewById(R.id.coin_86);
//        coin87= (Button)findViewById(R.id.coin_87);
//        coin88= (Button)findViewById(R.id.coin_88);
//        coin89= (Button)findViewById(R.id.coin_89);
//        coin90= (Button)findViewById(R.id.coin_90);
//        coin91= (Button)findViewById(R.id.coin_91);
//        coin92= (Button)findViewById(R.id.coin_92);
//        coin93= (Button)findViewById(R.id.coin_93);
//        coin94= (Button)findViewById(R.id.coin_94);
//        coin95= (Button)findViewById(R.id.coin_95);
//        coin96= (Button)findViewById(R.id.coin_96);
//        coin97= (Button)findViewById(R.id.coin_97);
//        coin98= (Button)findViewById(R.id.coin_98);
//        coin99= (Button)findViewById(R.id.coin_99);
//        coin100= (Button)findViewById(R.id.coin_100);
        for (int i = 0; i < 100; i++) {
//            final String name = "coin_" + (i + 1);
//            final int id = resources.getIdentifier(name, "id", getPackageName());

            coin[i] = (Button) findViewById(getIdByName("coin_" + (i+1)));
        }
        swap =(Button)findViewById(R.id.swap);
        reset=(Button)findViewById(R.id.restart);
        display = (TextView) findViewById(R.id.display);
        coinView = (ImageView) findViewById(R.id.coinView);
        shuffle();
        colorchange();
         speechinit();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        toSpeech.stop();
    }

    public void speechinit()
{
    toSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int status) {
            if(status==TextToSpeech.SUCCESS)
            {
                result=toSpeech.setLanguage(Locale.US);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Feature not supported in your device",Toast.LENGTH_SHORT).show();
            }
        }
    });
}
    public void colorchange()
    {

        for (int i = 0; i < 100; i++) {
//            final String name = "coin_" + (i + 1);
//            final int id = resources.getIdentifier(name, "id", getPackageName());

            coin[i].setBackgroundColor(Color.GREEN);
        }
    }
    public static int getIdByName(final String name) {
        try {
            final Field field = R.id.class.getDeclaredField(name);

            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception ignore) {
            return -1;
        }
    }
    public void Onswap(View view)
    {
        mainfn();
    }
    public void shuffle()
    {
        list = new ArrayList<>();

        for(int i = 1; i<=100; i++)
            list.add(i);

        Collections.shuffle(list);
    }
public void resource(String temp)
{
        Log.i("hari1",temp);
      coin[Integer.parseInt(temp)-1].setBackgroundColor(Color.RED);
    }

    public void mainfn()
    {
        final int n;
        try {

            n = list.get(i);

//            else
//            {

               speech("coin"+n+"pop up");
            x=x+1;
            i = i + 1;
            Log.i("hari", "random" + n +" "+x);
//            }
            resource(String.valueOf(n));
            new CountDownTimer(1000, 1000) { // adjust the milli seconds here

                public void onTick(long millisUntilFinished) {


                    coinView.animate().scaleX(1f).scaleY(1f).setDuration(1000);
                    coinView.setVisibility(View.VISIBLE);
                    display.setVisibility(View.VISIBLE);
                    display.setText(""+n);

                     swap.setVisibility(View.INVISIBLE);
                     reset.setVisibility(View.INVISIBLE);




                }

                public void onFinish() {
                    coinView.setVisibility(View.INVISIBLE);
                    swap.setVisibility(View.VISIBLE);
                    reset.setVisibility(View.VISIBLE);
                    display.setVisibility(View.INVISIBLE);

                }
            }.start();


//            switch (n)
//            {
//                case 1:
//                    coin1.setBackgroundColor(Color.RED);
//                    break;
//                default:
//                    button.setBackgroundColor(Color.BLUE);
//            }
        }
        catch (Exception e) {

//                Log.i("hari 100", "random" + list.get(i) + " " + x);
//                x = x + 1;
//                i = i + 1;
//                display.setText("" + list.get(i));
//                resource(String.valueOf(list.get(i)));

                Toast.makeText(this, "game over", Toast.LENGTH_SHORT).show();
                Log.i("hari", "terminate");
           speech("Game over");
//            i=0;

        }
    }
    public void speech(String temp)
    {
        String text = temp;
        toSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }
public void Onrestart(View view)
{
    Toast.makeText(this, "GAME RESTART", Toast.LENGTH_SHORT).show();
    i=0;
   colorchange();
   speech("GAME RESTART");
}
}
