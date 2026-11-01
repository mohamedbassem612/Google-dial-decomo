package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajxn implements java.io.Closeable {
    public final java.net.URL a;
    public volatile java.util.concurrent.Future b;
    public aaum c;

    private ajxn(java.net.URL url) {
        this.a = url;
    }

    public static defpackage.ajxn a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new defpackage.ajxn(new java.net.URL(str));
        } catch (java.net.MalformedURLException unused) {
            android.util.Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.cancel(true);
    }
}
