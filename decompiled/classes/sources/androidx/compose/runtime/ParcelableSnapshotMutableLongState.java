package androidx.compose.runtime;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ParcelableSnapshotMutableLongState extends defpackage.cek implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.ccu(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(c());
    }
}
