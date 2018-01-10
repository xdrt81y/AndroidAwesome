package com.ruyu.haidihan.helloworldtext.Network;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.widget.ImageView;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by haidihan on 2018/1/10.
 */

public class DownloadImageThread extends Thread {
    private String url;
    private ImageView imageView;

    public DownloadImageThread(String url, ImageView imageView) {
        this.url = url;
        this.imageView = imageView;
    }

    @Override
    public void run() {
        final Handler handler = new Handler();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                final Bitmap bitmap = BitmapFactory.decodeStream(response.body().byteStream());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
