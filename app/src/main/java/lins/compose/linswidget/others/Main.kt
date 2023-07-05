package lins.compose.linswidget.others

import android.os.Binder
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

fun main() {
    val serializableTemp = SerializableTemp()
    serializableTemp.para = Int.MAX_VALUE

    val oOutputStream = ObjectOutputStream(FileOutputStream("a"))
    oOutputStream.writeObject(serializableTemp)
    oOutputStream.close()


    val oInputStream = ObjectInputStream(FileInputStream("a"))
    val oo =  oInputStream.readObject()
    println(oo.toString())
    oInputStream.close()

}