package androidx.activity.result;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new v(11);
    public final int a;
    public final android.content.Intent b;

    public ActivityResult(int i, android.content.Intent intent) {
        this.a = i;
        this.b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf;
        int i = this.a;
        if (i != -1) {
            strValueOf = i != 0 ? java.lang.String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        return "ActivityResult{resultCode=" + strValueOf + ", data=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        defpackage.aooh.f(parcel, "dest");
        parcel.writeInt(this.a);
        android.content.Intent intent = this.b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
