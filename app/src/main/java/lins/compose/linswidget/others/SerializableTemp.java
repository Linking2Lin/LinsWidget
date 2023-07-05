package lins.compose.linswidget.others;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class SerializableTemp implements Serializable {
    int para = 100;

    @NonNull
    @Override
    public String toString() {
        return String.valueOf(para);
    }
}
