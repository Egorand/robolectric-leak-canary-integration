package com.squareup.egor.robolectricleakcanary

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MyPresenterTest {
  @Test fun sayHelloOne() {
    val presenter = MyPresenter()
    assertEquals("Hello, Bob!", presenter.sayHello(name = "Bob"))
  }

  @Test fun sayHelloTwo() {
    val presenter = MyPresenter()
    assertEquals("Hello, Bob!", presenter.sayHello(name = "Bob"))
  }
}
