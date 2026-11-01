package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdk {
    public defpackage.cdl a;
    public int b;
    public defpackage.aonn c;
    public int d;
    public defpackage.cfh e;
    public defpackage.ado f;
    public defpackage.adw g;

    public cdk(defpackage.cdl cdlVar) {
        this.a = cdlVar;
    }

    public final void a() {
        defpackage.cdl cdlVar = this.a;
        if (cdlVar != null) {
            cdlVar.c(this, null);
        }
    }

    public final void b(defpackage.ckg ckgVar, java.lang.Object obj) {
        defpackage.adw adwVar = this.g;
        if (adwVar == null) {
            adwVar = new defpackage.adw(6);
            this.g = adwVar;
        }
        adwVar.n(ckgVar, obj);
    }

    public final void c() {
        defpackage.cdl cdlVar = this.a;
        if (cdlVar != null) {
            cdlVar.b();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.c = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 4 : i & (-5);
    }

    public final void e(boolean z) {
        int i = this.b;
        this.b = z ? i | 256 : i & (-257);
    }

    public final void f(boolean z) {
        int i = this.b;
        this.b = z ? i | 8 : i & (-9);
    }

    public final void g(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void h(boolean z) {
        int i = this.b;
        this.b = z ? i | 1024 : i & (-1025);
    }

    public final void i(boolean z) {
        int i = this.b;
        this.b = z ? i | 512 : i & (-513);
    }

    public final void j(boolean z) {
        int i = this.b;
        this.b = z ? i | 128 : i & (-129);
    }

    public final void k(boolean z) {
        int i = this.b;
        this.b = z ? i | 16 : i & (-17);
    }

    public final boolean l() {
        return (this.b & 512) != 0;
    }

    public final boolean m() {
        return (this.b & 128) != 0;
    }

    public final boolean n() {
        return (this.b & 16) != 0;
    }

    public final boolean o() {
        return (this.b & 1) != 0;
    }

    public final boolean p() {
        defpackage.cfh cfhVar;
        return (this.a == null || (cfhVar = this.e) == null || !cfhVar.a()) ? false : true;
    }

    public final boolean q() {
        return this.g != null;
    }

    public final void r() {
        this.b |= 1;
    }

    public final int s(java.lang.Object obj) {
        defpackage.cdl cdlVar = this.a;
        if (cdlVar != null) {
            return cdlVar.c(this, obj);
        }
        return 1;
    }
}
