package androidx.versionedparcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(7);
    private final defpackage.gmh a;

    public ParcelImpl(android.os.Parcel parcel) {
        this.a = new defpackage.gmg(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new defpackage.gmg(parcel).k(this.a);
    }
}
