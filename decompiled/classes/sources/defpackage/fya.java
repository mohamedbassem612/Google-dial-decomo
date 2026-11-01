package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class fya {
    private boolean a;
    public java.util.List c;
    public java.util.List d;
    public defpackage.fxy e;
    public defpackage.dzl f;

    public fya(defpackage.dzl dzlVar, boolean z) {
        this.f = dzlVar;
        defpackage.aokc aokcVar = defpackage.aokc.a;
        this.c = aokcVar;
        this.d = aokcVar;
        this.a = z;
    }

    protected void b() {
        throw null;
    }

    public final void f() {
        defpackage.fxy fxyVar = this.e;
        if (fxyVar == null || !((defpackage.ads) fxyVar.f).g(this)) {
            return;
        }
        defpackage.fye fyeVar = (defpackage.fye) fxyVar.d;
        if (defpackage.aooh.n(this, fyeVar.c)) {
            if (fyeVar.d == -1) {
                a();
            }
            fyeVar.c = null;
            fyeVar.d = 0;
            fyeVar.e = null;
        }
        fyeVar.a.remove(this);
        fyeVar.b.remove(this);
        this.e = null;
        fyeVar.c();
    }

    public final void g(boolean z) {
        if (this.a != z) {
            this.a = z;
            defpackage.fxy fxyVar = this.e;
            if (fxyVar != null) {
                ((defpackage.fye) fxyVar.d).c();
            }
        }
    }

    public final boolean h() {
        defpackage.fxy fxyVar = this.e;
        if (fxyVar == null || fxyVar.b) {
            return this.a;
        }
        return false;
    }

    protected void a() {
    }

    protected void c(fxx fxxVar) {
    }

    protected void d(fxx fxxVar) {
    }
}
