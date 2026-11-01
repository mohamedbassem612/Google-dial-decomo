package androidx.compose.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ParcelableSnapshotMutableFloatState extends defpackage.ceg implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(c());
    }
}
