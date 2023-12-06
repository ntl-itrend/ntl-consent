package com.reactnativefirebase.ntlconsent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Callback;

abstract class NtlConsentSpec extends ReactContextBaseJavaModule {
  NtlConsentSpec(ReactApplicationContext context) {
    super(context);
  }

  public abstract void setGrantAnalyticsStorage(cb: Callback);
  public abstract void setDenyAnalyticsStorage(cb: Callback);
  public abstract void setGrantAdStorage(cb: Callback);
  public abstract void setDenyAdStorage(cb: Callback);
}
