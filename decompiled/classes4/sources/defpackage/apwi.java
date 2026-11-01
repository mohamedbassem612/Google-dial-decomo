package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apwi implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ apwi(java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = "onFailed";
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            new xkn("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + ((java.lang.String) this.a) + " running callback", 3, (byte[]) null);
            try {
                this.b.run();
                android.os.Trace.endSection();
                return;
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            java.lang.Object obj = this.b;
            java.lang.Object obj2 = this.a;
            try {
                ((defpackage.apwk) obj2).a.onSucceeded(((defpackage.apwk) obj2).d, (org.chromium.net.UrlResponseInfo) obj);
            } catch (java.lang.Exception e) {
                ((defpackage.apwk) obj2).d.i("onSucceded", e);
            }
            defpackage.apwk apwkVar = (defpackage.apwk) obj2;
            apwkVar.c();
            apwkVar.d.r.a();
            return;
        }
        if (i != 2) {
            java.lang.Object obj3 = this.b;
            java.lang.Object obj4 = this.a;
            try {
                ((defpackage.apwk) obj4).a.onCanceled(((defpackage.apwk) obj4).d, (org.chromium.net.UrlResponseInfo) obj3);
            } catch (java.lang.Exception e2) {
                ((defpackage.apwk) obj4).d.i("onCanceled", e2);
            }
            defpackage.apwk apwkVar2 = (defpackage.apwk) obj4;
            apwkVar2.c();
            apwkVar2.d.r.a();
            return;
        }
        new xkn("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + ((java.lang.String) this.a) + " running callback", 3, (byte[]) null);
        try {
            this.b.run();
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th3) {
            try {
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public /* synthetic */ apwi(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
