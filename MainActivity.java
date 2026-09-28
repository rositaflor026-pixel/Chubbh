package com.saltopixel.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    getWindow().getDecorView().setSystemUiVisibility(5894);
    WebView w = new WebView(this);
    w.setBackgroundColor(0xFF0B1020);
    WebSettings s = w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true); s.setMediaPlaybackRequiresUserGesture(false);
    w.loadUrl("file:///android_asset/index.html"); setContentView(w);
  }
  @Override public void onBackPressed() { }
}
