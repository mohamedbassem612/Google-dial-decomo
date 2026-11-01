package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apwa implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public apwa(defpackage.aobr aobrVar, defpackage.aobo aoboVar, defpackage.aobs aobsVar, int i) {
        this.$cid = i;
        this.b = aoboVar;
        this.c = aobsVar;
        j$.util.Objects.requireNonNull(aobrVar);
        this.a = aobrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            new xkn("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + ((java.lang.String) this.b) + " running callback", 3, (byte[]) null);
            try {
                new anxz(((defpackage.apwe) this.a).k, this.c, 16).run();
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
            synchronized (((defpackage.aobo) obj).a) {
                if (!((defpackage.aobo) obj).c) {
                    ((defpackage.aobo) obj).a();
                    ((defpackage.aobr) this.a).b.g.execute(new anxz(this, (defpackage.aobs) this.c, 7));
                }
            }
            return;
        }
        if (i == 2) {
            java.lang.Object obj2 = this.c;
            defpackage.apwm apwmVar = (defpackage.apwm) obj2;
            apwmVar.p = java.net.URI.create(apwmVar.m).resolve((java.lang.String) this.b).toString();
            apwmVar.f.add(apwmVar.p);
            apwmVar.j(2, 3, new anxz(obj2, this.a, 17, (byte[]) null));
            return;
        }
        java.lang.Object obj3 = this.b;
        java.lang.Object obj4 = this.a;
        java.lang.Object obj5 = this.c;
        try {
            ((defpackage.apwk) obj5).a.onFailed(((defpackage.apwk) obj5).d, (org.chromium.net.UrlResponseInfo) obj4, (org.chromium.net.CronetException) obj3);
        } catch (java.lang.Exception e) {
            ((defpackage.apwk) obj5).d.i("onFailed", e);
        }
        defpackage.apwk apwkVar = (defpackage.apwk) obj5;
        apwkVar.c();
        apwkVar.d.r.a();
    }

    public /* synthetic */ apwa(defpackage.apwk apwkVar, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException, int i) {
        this.$cid = i;
        this.c = apwkVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    public /* synthetic */ apwa(defpackage.apwm apwmVar, java.lang.String str, org.chromium.net.UrlResponseInfo urlResponseInfo, int i) {
        this.$cid = i;
        this.c = apwmVar;
        this.b = str;
        this.a = urlResponseInfo;
    }

    public /* synthetic */ apwa(defpackage.apwe apweVar, java.lang.String str, defpackage.apwn apwnVar, int i) {
        this.$cid = i;
        this.a = apweVar;
        this.b = str;
        this.c = apwnVar;
    }
}
