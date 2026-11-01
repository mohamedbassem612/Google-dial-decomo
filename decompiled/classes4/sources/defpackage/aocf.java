package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aocf implements defpackage.aocy {
    public final defpackage.aocg a;
    private final defpackage.anmo b;
    private java.io.InputStream c;
    private final defpackage.antw d;

    public aocf(defpackage.aocg aocgVar, defpackage.antw antwVar, defpackage.anmo anmoVar) {
        this.a = aocgVar;
        this.d = antwVar;
        this.b = anmoVar;
        anmoVar.d(new defpackage.aoce(this, 0), ajbm.a);
    }

    @Override // defpackage.aocy
    public final void a(anqw anqwVar) {
        int i = defpackage.aoik.a;
        defpackage.aocg aocgVar = this.a;
        java.io.InputStream inputStream = this.c;
        defpackage.annx annxVar = null;
        if (inputStream != null) {
            anxo.h(inputStream);
            this.c = null;
        }
        try {
            if (anqwVar.h()) {
                this.d.b();
            } else {
                aocgVar.d = true;
                this.d.a();
                anqw anqwVarF = anqw.c.f("RPC cancelled");
                anpc anpcVar = defpackage.annw.a;
                annxVar = new defpackage.annx(anqwVarF);
            }
        } finally {
            this.b.j(null);
        }
    }

    @Override // defpackage.aocy
    public final void b() {
        int i = defpackage.aoik.a;
        defpackage.aocg aocgVar = this.a;
        if (aocgVar.d) {
            return;
        }
        java.io.InputStream inputStream = this.c;
        if (inputStream != null) {
            this.c = null;
            try {
                this.d.d(aocgVar.b.b(inputStream));
                anxo.h(inputStream);
            } catch (java.lang.Throwable th) {
                anxo.h(inputStream);
                defpackage.ahzn.c(th);
                throw new java.lang.RuntimeException(th);
            }
        }
        this.d.c();
    }

    @Override // defpackage.aodm
    public final void d(defpackage.aodl aodlVar) {
        int i = defpackage.aoik.a;
        defpackage.aocg aocgVar = this.a;
        if (aocgVar.d) {
            anxo.g(aodlVar);
            return;
        }
        while (true) {
            try {
                java.io.InputStream inputStreamG = aodlVar.g();
                if (inputStreamG == null) {
                    return;
                }
                defpackage.anpk anpkVar = aocgVar.b;
                if (!anpkVar.a.a()) {
                    try {
                        this.d.d(anpkVar.b(inputStreamG));
                        inputStreamG.close();
                    } catch (java.lang.Throwable th) {
                        anxo.h(inputStreamG);
                        throw th;
                    }
                } else {
                    if (this.c != null) {
                        anxo.h(inputStreamG);
                        aocgVar.a.c(anqw.k.f("Too many requests"));
                        anxo.h(this.c);
                        this.c = null;
                        aocgVar.d = true;
                        return;
                    }
                    this.c = inputStreamG;
                }
            } catch (java.lang.Throwable th2) {
                anxo.g(aodlVar);
                defpackage.ahzn.c(th2);
                throw new java.lang.RuntimeException(th2);
            }
        }
    }

    @Override // defpackage.aodm
    public final void e() {
        int i = defpackage.aoik.a;
        if (this.a.d) {
            return;
        }
        this.d.e();
    }
}
