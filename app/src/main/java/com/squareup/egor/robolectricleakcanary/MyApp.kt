package com.squareup.egor.robolectricleakcanary

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class MyApp : Application() {
  override fun onCreate() {
    super.onCreate()
    if (LeakCanary.isInAnalyzerProcess(this)) {
      // This process is dedicated to LeakCanary for heap analysis.
      // You should not init your app in this process.
      return
    }
    installLeakDetector(app = this)
  }
}
