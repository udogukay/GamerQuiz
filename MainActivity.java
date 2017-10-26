package kom.kay1.gamerquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void answerThreeClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer3:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }

    public void answerFourClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer4:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }

    public void answerFiveClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer5:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }

    public void answerSixClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer6:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }

    public void answerSevenClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer7:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }

    public void answerEightClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer8:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }


    public void answerNineClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer9:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }

    public void answerTenClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answer10:
                if (checked) break;

        }// set value for correct answer
        totalScore = (totalScore + 1);
    }


    public void setTotalScore(View v) {
        // Assign score for writing correct answer
        TextView myText = (TextView) findViewById(R.id.a1);
        if (Objects.equals("Cortana", myText.getText().toString())) {
            totalScore = totalScore + 1;
        }

        //Geth uprising checkbox identified and hooked
        CheckBox geth = (CheckBox) findViewById(R.id.answer2);
        // Geth uprising checkbox value enumerated and assigned a method name
        boolean correct = geth.isChecked();
        if (geth.isChecked()) {
            totalScore = totalScore + 1;
        }

        // Display toast on button click
        String text = "You scored " + totalScore + " out of 10";
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        totalScore = 0;

    }

}

