package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abzr {
    public final android.net.Uri a;

    public abzr(android.net.Uri uri) {
        this.a = uri;
    }

    public final java.lang.String a() {
        return this.a.getPath();
    }

    public final defpackage.abzr b(java.lang.String str) {
        return new defpackage.abzr(this.a.buildUpon().encodedPath(str).build());
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
