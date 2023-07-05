package lins.compose.linswidget.others

import android.os.Parcel
import android.os.Parcelable

class ParacelableObject() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ParacelableObject> {
        override fun createFromParcel(parcel: Parcel): ParacelableObject {
            return ParacelableObject(parcel)
        }

        override fun newArray(size: Int): Array<ParacelableObject?> {
            return arrayOfNulls(size)
        }
    }
}