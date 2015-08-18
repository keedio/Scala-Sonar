package org.keedio.sonar.scala

/**
 * Created by luislazaro on 18/8/15.
 * lalazaro@keedio.com
 * Keedio
 */
object SimpleApp {

    def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

    def main(args : Array[String]) {
        println( "Hello World!" )
        println("concat words = " + foo(Array("uno","dos","tres", "cuatro")))
    }

}
