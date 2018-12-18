package rzd.com.xylophoneapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final int simulation_sounds = 7;
    private final float leftVol = 1.0f;
    private final float rightVol = 1.0f;
    private final int no_loop = 0;
    private final int priority = 0;
    private final float normal_play_rate = 1.0f;

    Button btnRed1, btnBrown1, btnYellow1, btnGreen1, btnDarkGreen1, btnBlue1, btnViolet1;

    private SoundPool soundPool;
    private int soundA, soundB, soundC, soundD, soundE, soundF, soundG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        soundA = soundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        soundB = soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        soundC = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        soundD = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        soundE = soundPool.load(getApplicationContext(), R.raw.note5_g,1);
        soundF = soundPool.load(getApplicationContext(), R.raw.note6_a,1);
        soundG = soundPool.load(getApplicationContext(), R.raw.note7_b,1);



    }
    public void playRed(View v){
        soundPool.play(soundA,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
    public void playBrown(View v){
        soundPool.play(soundB,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
    public void playYellow(View v){
        soundPool.play(soundC,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
    public void playGreen(View v){
        soundPool.play(soundD,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
    public void playDarkGreen(View v){
        soundPool.play(soundE,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
    public void playBlue(View v){
        soundPool.play(soundF,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
    public void playViolet(View v){
        soundPool.play(soundG,leftVol,rightVol,priority,no_loop,normal_play_rate);
    }
}
