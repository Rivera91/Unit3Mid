package nyc.c4q.unit3mid.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import nyc.c4q.unit3mid.R;

public class DisplayActivity extends AppCompatActivity {

    String itemViewText;

    public DisplayActivity(String text) {
        this.itemViewText = text;
    }

    public String getItemViewText() {
        return itemViewText;
    }
}
