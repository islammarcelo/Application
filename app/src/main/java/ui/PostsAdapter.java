package ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

import pojo.PostModel;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {
    ArrayList<PostModel> list = new ArrayList<>();
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleTV.setText(list.get(position).getTitle());
        holder.bodyTV.setText(list.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void setList(ArrayList<PostModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTV,userIdTV,bodyTV;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.titleTV);
            bodyTV  = itemView.findViewById(R.id.body);
        }
    }
}
