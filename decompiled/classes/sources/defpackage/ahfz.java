package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahfz implements defpackage.emj {
    private final defpackage.emy a;
    private final defpackage.ajwa b;

    public ahfz(defpackage.ajwa ajwaVar, defpackage.emy emyVar) {
        this.a = emyVar;
        this.b = ajwaVar;
    }

    @Override // defpackage.emj
    public final void a(defpackage.emx emxVar) {
        defpackage.ahns.m(false);
        try {
            this.a.f(defpackage.emp.ON_CREATE);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emj
    public final void b(defpackage.emx emxVar) {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            this.a.f(defpackage.emp.ON_DESTROY);
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emj
    public final void c(defpackage.emx emxVar) {
        defpackage.ahns.f();
        try {
            this.a.f(defpackage.emp.ON_PAUSE);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emj
    public final void e(defpackage.emx emxVar) {
        defpackage.ahns.m(false);
        try {
            this.a.f(defpackage.emp.ON_START);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emj
    public final void f(defpackage.emx emxVar) {
        defpackage.ahns.f();
        try {
            this.a.f(defpackage.emp.ON_STOP);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) {
        defpackage.ajwa ajwaVar = this.b;
        defpackage.ahnl ahnlVar = new defpackage.ahnl(ajwaVar, ajwaVar.e(), 0);
        try {
            this.a.f(defpackage.emp.ON_RESUME);
            ahnlVar.close();
        } catch (java.lang.Throwable th) {
            try {
                ahnlVar.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
