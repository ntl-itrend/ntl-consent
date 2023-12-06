package com.reactnativefirebase.ntlconsent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Callback;

abstract class NtlConsentSpec extends ReactContextBaseJavaModule {
  NtlConsentSpec(ReactApplicationContext context) {
    super(context);
  }

  public abstract void setGrantAnalyticsStorage(Callback cb);
  public abstract void setDenyAnalyticsStorage(Callback cb);
  public abstract void setGrantAdStorage(Callback cb);
  public abstract void setDenyAdStorage(Callback cb);
}
