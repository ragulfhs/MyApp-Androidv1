package com.info.apt.myapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.info.apt.myapp.R;

//import com.squareup.picasso.Picasso;

//import co.megaminds.CardViewRecyclerViewPicasso.HelperClasses.CircleTransform;
//import co.megaminds.CardViewRecyclerViewPicasso.Model.Datum;
//import co.megaminds.CardViewRecyclerViewPicasso.R;


public class VerticalAdapterTailor extends RecyclerView.Adapter<VerticalAdapterTailor.RecyclerVH> {
    Context c;
    String[] spacecrafts;

    public VerticalAdapterTailor(Context c, String[] spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    @Override
    public RecyclerVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.tailor_single_item, parent, false);
        return new RecyclerVH(v);
    }

    @Override
    public void onBindViewHolder(RecyclerVH holder, int position) {
        holder.nameTxt.setText(spacecrafts[position]);
    }

    @Override
    public int getItemCount() {
        return spacecrafts.length;
    }

    /*
    VIEWHOLDER CLASS
     */
    public class RecyclerVH extends RecyclerView.ViewHolder {
        TextView nameTxt;
        ImageView imageView;

        public RecyclerVH(View itemView) {
            super(itemView);
            nameTxt = (TextView) itemView.findViewById(R.id.tailor_name);
            imageView = (ImageView) itemView.findViewById(R.id.item1_image1);
        }
    }
}






/*public class VerticalAdapterTailor extends RecyclerView.Adapter<VerticalAdapterTailor.CustomViewHolder> {

    private Context context;
    private List<Datum> dataList;

    public VerticalAdapterTailor(Context context, List<Datum> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_single_item, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

//        view.setOnClickListener(this);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(VerticalAdapter.CustomViewHolder holder, int position) {

        Datum datum = dataList.get(position);

        Picasso.with(context)
                .load(datum.getImage())
                .into(holder.fullImage);

        holder.nameTextView.setText(datum.getTitle());

        Picasso.with(context)
                .load(datum.getNameImage())
                .transform(new CircleTransform())
                .into(holder.profileImage);

        holder.profileName.setText(datum.getName());
    }

    @Override
    public int getItemCount() {
        return (dataList!=null ? dataList.size() : 0);
    }


    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        ImageView fullImage;
        ImageView profileImage;
        TextView nameTextView;
        TextView profileName;
        TextView timeStamp;
        CardView cardView;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        CustomViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.name_text_view);
            profileName = (TextView) itemView.findViewById(R.id.profile_name);
            timeStamp = (TextView) itemView.findViewById(R.id.time_stamp);
            fullImage = (ImageView) itemView.findViewById(R.id.full_image);
            profileImage = (ImageView) itemView.findViewById(R.id.profile_image);
            cardView = (CardView) itemView.findViewById(R.id.card_view);

            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            Toast.makeText(context, dataList.get(clickedPosition).getName(), Toast.LENGTH_LONG).show();
        }
    }
}*/
