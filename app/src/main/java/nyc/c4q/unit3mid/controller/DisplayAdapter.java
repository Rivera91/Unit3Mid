package nyc.c4q.unit3mid.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.unit3mid.R;
import nyc.c4q.unit3mid.model.DisplayActivity;
import nyc.c4q.unit3mid.view.DisplayViewHolder;

/**
 * Created by AmyRivera on 1/24/18.
 */



public class DisplayAdapter extends RecyclerView.Adapter<DisplayViewHolder> {

    private List<DisplayActivity> displayList;

    public DisplayAdapter(List<DisplayActivity> emails) {
        this.displayList = emails;
    }

    @Override
    public DisplayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_view, parent, false);
        return new DisplayViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(DisplayViewHolder holder, int position) {

        DisplayActivity displayActivity = displayList.get(position);

        holder.onBind(displayActivity);

    }

    @Override
    public int getItemCount() {
       return displayList.size();

    }

}

