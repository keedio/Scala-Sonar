package org.keedio.sonar.scala

import java.io.File
/**
 * Created by luislazaro on 20/8/15.
 * lalazaro@keedio.com
 * Keedio
 */
object Reader {


    def recursiveListFiles(f: File): Array[File] = {
        val these = f.listFiles;
        these ++ these.filter(_.isDirectory).flatMap(recursiveListFiles)
    }
}
