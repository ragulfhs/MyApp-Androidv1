package com.info.apt.myapp.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.info.apt.myapp.R;


//import com.squareup.picasso.Picasso;

//import co.megaminds.CardViewRecyclerViewPicasso.Model.Popular;
//import co.megaminds.CardViewRecyclerViewPicasso.R;


public  class ImageSlideAdapter extends PagerAdapter {

    private static int[] images =
            {
            R.drawable.wool2,
            R.drawable.wool1,
            R.drawable.wool,
            R.drawable.wool2,
            R.drawable.wool1
    };
    private Context ctx;
    private LayoutInflater inflater;

    public ImageSlideAdapter(Context ctx){
        this.ctx = ctx;
    }


    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.vp_image,container,false);
        ImageView img =(ImageView)v.findViewById(R.id.imageView);
        img.setImageResource(images[position]);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        container.refreshDrawableState();
    }
}






  /*  private ArrayList<ImageModel> imageModelArrayList;
    private LayoutInflater inflater;
    private Context context;


    public ImageSlideAdapter(Context context, ArrayList<ImageModel> imageModelArrayList) {
        this.context = context;
        this.imageModelArrayList = imageModelArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return imageModelArrayList.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View imageLayout = inflater.inflate(R.layout.vp_image, view, false);

        assert imageLayout != null;
        final ImageView imageView = (ImageView) imageLayout
                .findViewById(R.id.image);


        imageView.setImageResource(imageModelArrayList.get(position).getImage_drawable());

        view.addView(imageLayout, 0);

        return imageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    public class ImageModel {

        private int image_drawable;

        public int getImage_drawable() {
            return image_drawable;
        }

        public void setImage_drawable(int image_drawable) {
            this.image_drawable = image_drawable;
        }
    }


}
*/