package org.keedio.sonar.scala
import org.junit._
import java.io.File
/**
 * Created by luislazaro on 20/8/15.
 * lalazaro@keedio.com
 * Keedio
 */
class TestReader {

    @Test
    def test1: Unit = {
        Reader.recursiveListFiles(new File("src/test/resources")).foreach(file => println(file.getName))
    }
}
