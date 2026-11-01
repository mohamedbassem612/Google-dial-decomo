package android.support.v4.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class FragmentManager$LaunchedFragmentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(2);
    public final java.lang.String a;
    public final int b;

    public FragmentManager$LaunchedFragmentInfo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public FragmentManager$LaunchedFragmentInfo(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }
}
