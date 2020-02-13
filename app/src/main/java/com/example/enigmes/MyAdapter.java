package com.example.enigmes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[], data3[], data4[];
    Context context;


    public MyAdapter(Context ct, String s1[], String s3[], String s4[]){
        context = ct;
        data1 = s1;
        data3 = s3;
        data4 = s4;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myText3.setText(data3[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ////////
                Intent intent = new Intent(context, Result.class);
                intent.putExtra("data4", data4[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return data3.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1,myText3;
        ConstraintLayout mainLayout;
        TextView myText4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText1 = itemView.findViewById(R.id.myText1);

            myText3 = itemView.findViewById(R.id.myText3);
            mainLayout = itemView.findViewById(R.id.mainLayout);

            myText4 = itemView.findViewById(R.id.da);
        }
    }
}
