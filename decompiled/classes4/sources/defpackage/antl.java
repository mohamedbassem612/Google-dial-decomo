package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antl implements java.io.Closeable {
    private android.os.Parcel a;

    public antl(android.os.Parcel parcel) {
        this.a = parcel;
    }

    public static defpackage.antl c() {
        return new defpackage.antl(android.os.Parcel.obtain());
    }

    public final android.os.Parcel a() {
        ahvr.bZ(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final android.os.Parcel b() {
        android.os.Parcel parcelA = a();
        this.a = null;
        return parcelA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        android.os.Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
