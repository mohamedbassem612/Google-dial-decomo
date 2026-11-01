package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class fyd {
    public defpackage.fxy c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        ?? r0;
        defpackage.fxy fxyVar = this.c;
        if (fxyVar != null) {
            if (!this.d) {
                fxyVar.f(this, null);
            }
            fxyVar.c();
            if (fxyVar.b) {
                java.lang.Object obj = fxyVar.d;
                java.lang.Object obj2 = fxyVar.h;
                if (obj2 == null) {
                    obj2 = null;
                }
                defpackage.fye fyeVar = (defpackage.fye) obj;
                if (defpackage.aooh.n(this, fyeVar.e) && fyeVar.d == -1) {
                    defpackage.fya fyaVarA = fyeVar.c;
                    if (fyaVarA == null) {
                        fyaVarA = fyeVar.a(-1);
                    }
                    fyeVar.c = null;
                    fyeVar.d = 0;
                    fyeVar.e = null;
                    if (fyaVarA != null) {
                        fyaVarA.b();
                    } else if (obj2 != null && (r0 = ((defpackage.nf) ((defpackage.apnt) obj2).a).a) != 0) {
                        r0.run();
                    }
                    fyeVar.f.e(defpackage.fyf.a);
                }
            }
            this.d = false;
        }
    }

    protected void a() {
    }

    protected void d() {
    }

    protected void c(boolean z) {
    }
}
