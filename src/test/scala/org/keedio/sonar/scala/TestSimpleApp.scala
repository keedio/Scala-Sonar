package org.keedio.sonar.scala

import org.junit._

/**
 * Created by luislazaro on 20/8/15.
 * lalazaro@keedio.com
 * Keedio
 */
class TestSimpleApp {

    @Test
    def test1: Unit = {
        val array : Array[String] = Array("hola", "adios")
        assert(SimpleApp.foo(array).equals("holaadios"), "Strings are not equals")

    }
}
