package com.reactnativefirebase.ntlconsent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Map;

public class NtlConsentModule extends NtlConsentSpec {
  public static final String NAME = "NtlConsent";
  FirebaseAnalytics firebaseAnalytics;

  NtlConsentModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  @ReactMethod
  public void setGrantAnalyticsStorage(Callback cb) {
      try {
          firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext());
          Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> consentMap = new EnumMap<>(FirebaseAnalytics.ConsentType.class);
          consentMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, FirebaseAnalytics.ConsentStatus.GRANTED);
          firebaseAnalytics.setConsent(consentMap);
          cb.invoke(null, "analytics_storage granted");
      } catch (Exception e) {
          cb.invoke(e.toString(), null);
      }
  }

  @ReactMethod
  public void setDenyAnalyticsStorage(Callback cb) {
      try {
          firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext());
          Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> consentMap = new EnumMap<>(FirebaseAnalytics.ConsentType.class);
          consentMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, FirebaseAnalytics.ConsentStatus.DENIED);
          firebaseAnalytics.setConsent(consentMap);
          cb.invoke(null, "analytics_storage denied");
      } catch (Exception e) {
          cb.invoke(e.toString(), null);
      }
  }

  @ReactMethod
  public void setGrantAdStorage(Callback cb) {
      try {
          firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext());
          Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> consentMap = new EnumMap<>(FirebaseAnalytics.ConsentType.class);
          consentMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, FirebaseAnalytics.ConsentStatus.GRANTED);
          firebaseAnalytics.setConsent(consentMap);
          cb.invoke(null, "ad_storage granted");
      } catch (Exception e) {
          cb.invoke(e.toString(), null);
      }
  }
  
  @ReactMethod
  public void setDenyAdStorage(Callback cb) {
      try {
          firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext());
          Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> consentMap = new EnumMap<>(FirebaseAnalytics.ConsentType.class);
          consentMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, FirebaseAnalytics.ConsentStatus.DENIED);
          firebaseAnalytics.setConsent(consentMap);
          cb.invoke(null, "ad_storage denied");
      } catch (Exception e) {
          cb.invoke(e.toString(), null);
      }
  }
}
