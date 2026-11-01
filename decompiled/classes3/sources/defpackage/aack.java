package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aack {
    public static final defpackage.aack a = new defpackage.aack(true, null, null);
    public final boolean b;
    final java.lang.String c;
    final java.lang.Throwable d;

    public aack(boolean z, java.lang.String str, java.lang.Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public java.lang.String a() {
        return this.c;
    }

    final void b() {
        if (this.b || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        java.lang.Throwable th = this.d;
        if (th != null) {
            android.util.Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            android.util.Log.d("GoogleCertificatesRslt", a());
        }
    }
}
