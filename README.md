实验目的<br>
=====
验证Activity的生命周期，在调用onCreate(),onStart(),onResume(),onPause(),onStop()onDestroy()和onRestart()函数时会相应地输出正在调用哪些函数。<br>
关键代码<br>
=====
```
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","Hello World! --onCreate()--");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivityLife","--onStart()--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivityLife","--onResume()--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivityLife","--onPause()--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivityLife","--onStop()--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivityLife","--onDestroy()--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivityLife","--onRestart()--");
    }
```
<br>
结果截图
=====
<br>
