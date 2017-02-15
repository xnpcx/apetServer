package com.myser.vers;

import android.app.*;
import android.os.*;
import android.webkit.*;
import java.util.*;
public class GameWebActivity extends Activity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
		WebView myWebView = (WebView) findViewById(R.id.upi);
		WebSettings WebSettings = myWebView.getSettings();
		WebSettings.setJavaScriptEnabled(true);
		WebSettings.setBuiltInZoomControls(true);
		myWebView.getSettings().setAppCacheEnabled(false);
		myWebView.clearCache(true);
		myWebView.setWebChromeClient(new WebChromeClient());
		CookieSyncManager.createInstance(GameWebActivity.this);
		CookieManager cookieManager = CookieManager.getInstance();
		cookieManager.removeSessionCookie();
		myWebView.loadUrl("http://anehagate.pe.hu");
	}
	public void onBackPressed() {
		WebView myWebView = (WebView) findViewById(R.id.upi);
		if(myWebView.canGoBack()) {
			myWebView.goBack();
		} else {
			super.onBackPressed();
		}
	}
	public final static boolean DEBUG = false;
}
