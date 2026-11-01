package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ghk implements defpackage.gip {
    public final defpackage.ghh a;

    public ghk(defpackage.ghh ghhVar) {
        this.a = ghhVar;
    }

    @Override // defpackage.gip
    public final android.database.Cursor a(defpackage.giv givVar) {
        try {
            return new defpackage.ghm(this.a.a().a(givVar), this.a);
        } catch (java.lang.Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // defpackage.gip
    public final android.database.Cursor b(java.lang.String str) {
        defpackage.aooh.f(str, "query");
        try {
            return new defpackage.ghm(this.a.a().b(str), this.a);
        } catch (java.lang.Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // defpackage.gip
    public final defpackage.giw c(java.lang.String str) {
        defpackage.aooh.f(str, "sql");
        return new ghl(str, this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        defpackage.ghh ghhVar = this.a;
        synchronized (ghhVar.d) {
            ghhVar.i = true;
            defpackage.aoub aoubVar = ghhVar.j;
            if (aoubVar != null) {
                aoubVar.s(null);
            }
            ghhVar.j = null;
            defpackage.gip gipVar = ghhVar.h;
            if (gipVar != null) {
                gipVar.close();
            }
            ghhVar.h = null;
        }
    }

    @Override // defpackage.gip
    public final java.lang.String d() {
        throw null;
    }

    @Override // defpackage.gip
    public final void e() {
        try {
            this.a.a().e();
        } catch (java.lang.Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // defpackage.gip
    public final void f() {
        try {
            this.a.a().f();
        } catch (java.lang.Throwable th) {
            this.a.c();
            throw th;
        }
    }

    @Override // defpackage.gip
    public final /* synthetic */ void g() {
        e();
    }

    @Override // defpackage.gip
    public final void h() {
        throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
    }

    @Override // defpackage.gip
    public final void i() {
        try {
            defpackage.gip gipVar = this.a.h;
            if (gipVar == null) {
                defpackage.aooh.g();
            }
            gipVar.i();
        } finally {
            this.a.c();
        }
    }

    @Override // defpackage.gip
    public final void j(java.lang.String str) {
        defpackage.aooh.f(str, "sql");
        this.a.b(new fxs(str, 8));
    }

    @Override // defpackage.gip
    public final void k() {
        defpackage.gip gipVar = this.a.h;
        if (gipVar == null) {
            defpackage.aooh.g();
        }
        gipVar.k();
    }

    @Override // defpackage.gip
    public final boolean l() {
        defpackage.ghh ghhVar = this.a;
        if (ghhVar.h == null) {
            return false;
        }
        return ((java.lang.Boolean) ghhVar.b(defpackage.ghi.a)).booleanValue();
    }

    @Override // defpackage.gip
    public final boolean m() {
        return !this.a.i;
    }

    @Override // defpackage.gip
    public final boolean n() {
        return ((java.lang.Boolean) this.a.b(ghj.a)).booleanValue();
    }

    @Override // defpackage.gip
    public final void o() {
        throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
    }

    @Override // defpackage.gip
    public final void p(java.lang.Object[] objArr) {
        this.a.b(new fxs(objArr, 9));
    }

    @Override // defpackage.gip
    public final int q(android.content.ContentValues contentValues, java.lang.Object[] objArr) {
        return ((java.lang.Number) this.a.b(new defpackage.dpz(contentValues, objArr, 15, null))).intValue();
    }
}
