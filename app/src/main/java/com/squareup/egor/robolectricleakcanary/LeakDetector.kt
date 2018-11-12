package com.squareup.egor.robolectricleakcanary

import android.app.Application
import com.squareup.leakcanary.AndroidExcludedRefs
import com.squareup.leakcanary.LeakCanary

fun installLeakDetector(app: Application) {
  if (!BuildConfig.DEBUG) return
  val refs = AndroidExcludedRefs.createAppDefaults()
      .staticField("com.facebook.stetho.inspector.elements.android.ActivityTracker", "sInstance")
      .build()
  LeakCanary.refWatcher(app)
      .excludedRefs(refs)
      .buildAndInstall()
}
