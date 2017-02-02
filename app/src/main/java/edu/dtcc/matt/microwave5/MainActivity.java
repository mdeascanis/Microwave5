package edu.dtcc.matt.microwave5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;

//implement OnClickListener
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            //define button objects and set listener
            Button one = (Button) findViewById(R.id.button1);
            one.setOnClickListener(this);

            Button two = (Button) findViewById(R.id.button2);
            two.setOnClickListener(this);

            Button three = (Button) findViewById(R.id.button3);
            three.setOnClickListener(this);

            Button four = (Button) findViewById(R.id.button4);
            four.setOnClickListener(this);

            Button five = (Button) findViewById(R.id.button5);
            five.setOnClickListener(this);

            Button six = (Button) findViewById(R.id.button6);
            six.setOnClickListener(this);

            Button seven = (Button) findViewById(R.id.button7);
            seven.setOnClickListener(this);

            Button eight = (Button) findViewById(R.id.button8);
            eight.setOnClickListener(this);

            Button nine = (Button) findViewById(R.id.button9);
            nine.setOnClickListener(this);

            Button zero = (Button) findViewById(R.id.button0);
            zero.setOnClickListener(this);

            Button start = (Button) findViewById(R.id.buttonStart);
            start.setOnClickListener(this);

            Button stop = (Button) findViewById(R.id.buttonStop);
            stop.setOnClickListener(this);
        }


    @Override
    public void onClick(View view) {


        TextView timer = (TextView)findViewById(R.id.timer);

        ImageView window = (ImageView) findViewById(R.id.imageView);


        Toast.makeText(getApplicationContext(),
                "Seems to be working", Toast.LENGTH_LONG).show();

        switch (view.getId()) {

            case R.id.button1:
                timer.setText("01:00");
                break;

            case R.id.button2:
                timer.setText("02:00");
                break;

            case R.id.button3:
                timer.setText("03:00");
                break;

            case R.id.button4:
                timer.setText("04:00");
                break;

            case R.id.button5:
                timer.setText("05:00");
                break;

            case R.id.button6:
                timer.setText("06:00");
                break;

            case R.id.button7:
                timer.setText("07:00");
                break;

            case R.id.button8:
                timer.setText("08:00");
                break;

            case R.id.button9:
                timer.setText("09:00");
                break;

            case R.id.button0:
                timer.setText("00:00");
                break;

            case R.id.buttonStart:
                window.setImageResource(R.mipmap.ic_launcher);
                break;

            case R.id.buttonStop:
                window.setImageBitmap(null);
                break;

            default:
                break;
        }
    }
};
