package com.example.nishant.whatsappclone;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nishant on 8/18/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public Adapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);

        holder.name.setText(listItem.getName());
        holder.message_overview.setText(listItem.getMessage_overview());
        holder.time.setText(listItem.getTime());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ChatActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView message_overview;
        TextView time;
        LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.textView_Name);
            message_overview = (TextView) itemView.findViewById(R.id.textView_MessageOverview);
            time = (TextView) itemView.findViewById(R.id.textView_time);

            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
