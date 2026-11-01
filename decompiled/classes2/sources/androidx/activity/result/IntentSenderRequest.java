package androidx.activity.result;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class IntentSenderRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(12);
    public final android.content.IntentSender a;
    public final android.content.Intent b;
    public final int c;
    public final int d;

    public IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2) {
        aooh.f(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
