package com.ruyu.haidihan.helloworldtext.SeniorControl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

import com.ruyu.haidihan.helloworldtext.R;

public class GalleryActivity extends AppCompatActivity {
//    private Gallery mGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

//        mGallery = (Gallery)findViewById(R.id.gallery);
//        try {
//            mGallery.setAdapter(new ImageAdapter(this));
//        } catch (IllegalArgumentException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        mGallery.setOnItemClickListener(new OnItemClickListener() {
//            public void onItemClick(AdapterView parent, View v, int position, long id) {
//                GalleryActivity.this.setTitle(String.valueOf(position));
//            }
//        });
    }

    /*
     * class ImageAdapter is used to control gallery source and operation.
     */
//    private class ImageAdapter extends BaseAdapter{
//        private Context mContext;
//        private ArrayList<Integer> imgList=new ArrayList<Integer>();
//        private ArrayList<Object> imgSizes=new ArrayList<Object>();
//        public ImageAdapter(Context c) throws IllegalArgumentException, IllegalAccessException{
//            mContext = c;
//
//            //用反射机制来获取资源中的图片ID和尺寸
//            Field[] fields = R.drawable.class.getDeclaredFields();
//            for (Field field : fields)
//            {
//                if (!"icon".equals(field.getName()))//除了icon之外的图片
//                {
//                    int index=field.getInt(R.drawable.class);
//                    //保存图片ID
//                    imgList.add(index);
//                    //保存图片大小
//                    int size[]=new int[2];
//                    Bitmap bmImg=BitmapFactory.decodeResource(getResources(),index);
//                    size[0]=bmImg.getWidth();size[1]=bmImg.getHeight();
//                    imgSizes.add(size);
//                }
//            }
//        }
//        @Override
//        public int getCount() {
//            // TODO Auto-generated method stub
//
//            return imgList.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            // TODO Auto-generated method stub
//
//            return position;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            // TODO Auto-generated method stub
//
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            // TODO Auto-generated method stub
//
//            ImageView i = new ImageView (mContext);
//            //从imgList取得图片ID
//            i.setImageResource(imgList.get(position).intValue());
//            i.setScaleType(ImageView.ScaleType.FIT_XY);
//            //从imgSizes取得图片大小
//            int size[]= new int[2];
//            size=(int[]) imgSizes.get(position);
//            i.setLayoutParams(new Gallery.LayoutParams(size[0], size[1]));
//            return i;
//        }
//
//    };
}
