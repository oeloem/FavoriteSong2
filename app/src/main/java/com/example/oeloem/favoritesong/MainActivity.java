package com.example.oeloem.favoritesong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String isPlaying = "media is playing";

    MediaPlayer player;

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(1);
            }
        });

        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });

        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });

        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(4);
            }
        });

        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(5);
            }
        });

        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(6);
            }
        });

        btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(7);
            }
        });

        btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(8);
            }
        });

        btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(9);
            }
        });

        btn10 = (Button) findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(10);
            }
        });

        btn11 = (Button) findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(11);
            }
        });

        btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(12);
            }
        });

        btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(13);
            }
        });

        btn14 = (Button) findViewById(R.id.button14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(14);
            }
        });

        btn15 = (Button) findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(15);
            }
        });

        btn16 = (Button) findViewById(R.id.button16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(16);
            }
        });

        btn17 = (Button) findViewById(R.id.button17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(17);
            }
        });

        btn18 = (Button) findViewById(R.id.button18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(18);
            }
        });

        btn19 = (Button) findViewById(R.id.button19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(19);
            }
        });

        btn20 = (Button) findViewById(R.id.button20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(20);
            }
        });

    }

    public void onPause() {
        try {
            super.onPause();
            player.pause();

        }catch (Exception e) {

        }

    }

    private void playSound(int arg) {
        try {
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }

        } catch (Exception e) {
            Toast.makeText(this, "Masuk Lagu", Toast.LENGTH_SHORT).show();
        }

        if (arg ==1) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.axwell);

        } else if (arg == 2) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.cleanbandit);

        } else if (arg == 3) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.imaginedragons);

        } else if (arg == 4) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.kygo);

        } else if (arg == 5) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.martingarrix);

        } else if (arg == 6) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.thechainsmokers);

        } else if (arg == 7) {
            Toast.makeText(this, isPlaying+ "Song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.xxxtentacion);

        } else if (arg == 8) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.cartoon);

        } else if (arg == 9) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.edsheeran);

        } else if (arg == 10) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.shawnmendes);

        } else if (arg == 11) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.janji);

        } else if (arg == 12) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.louistomlinson);

        } else if (arg == 13) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.machinegunkelly);

        } else if (arg == 14) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.maroon5);

        } else if (arg == 15) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.onedirection);

        } else if (arg == 16) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.dnce);

        } else if (arg == 17) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.afrojack);

        } else  if (arg == 18) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.johnlegend);

        } else if (arg ==19) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.r3hab);

        } else if (arg == 20) {
            Toast.makeText(this, isPlaying+ "song 1", Toast.LENGTH_SHORT).show();

            player = MediaPlayer.create(this, R.raw.yellowclaw);
        }

        player.setLooping(true);
        player.start();

    }

}

