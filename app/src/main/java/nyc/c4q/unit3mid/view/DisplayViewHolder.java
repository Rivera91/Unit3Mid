package nyc.c4q.unit3mid.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import nyc.c4q.unit3mid.R;
import nyc.c4q.unit3mid.model.DisplayActivity;

/**
 * Created by AmyRivera on 1/24/18.
 */

public class DisplayViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    private TextView list;
    private Context context;
    private String text;

    public DisplayViewHolder(View itemView) {
        super(itemView);

        TextView list = (TextView) itemView.findViewById(R.id.textView_Recycler_text);

    }

    public void onBind(DisplayActivity displayActivity) {

        list.setText(displayActivity.getItemViewText());
        context = itemView.getContext();
        text = displayActivity.getItemViewText();

    }

    @Override
    public void onClick(View view) {
        Intent displayIntent = new Intent(context, DisplayActivity.class);
        displayIntent.putExtra("item_view_text", text );
    }
}

