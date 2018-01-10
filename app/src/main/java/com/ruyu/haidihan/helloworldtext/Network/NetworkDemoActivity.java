package com.ruyu.haidihan.helloworldtext.Network;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ruyu.haidihan.helloworldtext.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class NetworkDemoActivity extends AppCompatActivity {
    private Handler handler = new Handler();
    private TextView textView;
    private String TAG = "NetworkDemoActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_demo);

        textView = (TextView) findViewById(R.id.webview);
        // 同步方式
//        String response = Utils.get("http://www.baidu.com");

        // 异步方式1：Thread
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //从网络获取数据
//                final String response = NetUtils.get("http://www.baidu.com");
//                //向Handler发送处理操作
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                        //在UI线程更新UI
//                        textView.setText(response);
//                    }
//                });
//            }
//        }).start();

        // 异步方式2：callback
//        AsynNetUtils.get("http://www.baidu.com", new AsynNetUtils.Callback() {
//            @Override
//            public void onResponse(String response) {
//                textView.setText(response);
//            }
//        });

        // 用retrofit+okhttp 请求String
//        requestGithubString("xdrt81y");

        // 用retrofit+okhttp 请求model
//        requestGithubModel("xdrt81y");

        // 用retrofit+okhttp+rxJava 请求Model
        rxRetrofit("xdrt81y");
    }

    //用retrofit+okhttp 请求String
    private void  requestGithubString(String username){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GitHubService.BASEURL)
                //添加String支持
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<String> call = service.getData(username);//username 可以自己传入github的用户名

        // 异步请求
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                // 处理返回数据
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: " + response.body());
                    textView.setText(response.body());
                }
            }
            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onFailure: 请求数据失败");
                textView.setText("请求数据失败");
            }
        });
    }

    //用retrofit+okhttp 请求String
    private void  requestGithubModel(String username){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GitHubService.BASEURL)
                // 添加Json转换器支持
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GitHubService service = retrofit.create(GitHubService.class);
        Call<GitModel> call = service.getUserInfo(username);//username 可填入自己Github账号用户名
        call.enqueue(new Callback<GitModel>() {
            @Override
            public void onResponse(Call<GitModel> call, Response<GitModel> response) {
                if (response.isSuccessful()) {
                    GitModel model = response.body();
                    Log.d(TAG, "onResponse: " + model.htmlUrl);
                    textView.setText(response.body().htmlUrl);
                }
            }
            @Override
            public void onFailure(Call<GitModel> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

    // 用retrofit+okhttp+rxJava 请求Model
    public void rxRetrofit(String username) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(GitHubService.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Observable<GitModel> obserable = service.rxUser(username);
        obserable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GitModel>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onNext(GitModel gitModel) {
                        Log.d(TAG, "onNext: " + gitModel.htmlUrl);
                        textView.setText(gitModel.htmlUrl);
                    }
                });
    }
}
