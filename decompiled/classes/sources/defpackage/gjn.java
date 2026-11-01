package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gjn extends defpackage.gjo {
    private final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjn(defpackage.gip gipVar, java.lang.String str, int i) {
        super(gipVar, str);
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        this.a = i;
    }

    @Override // defpackage.gin
    public final double a(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final int b() {
        p();
        return 0;
    }

    @Override // defpackage.gin
    public final long c(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin, java.lang.AutoCloseable
    public final void close() {
        q();
    }

    @Override // defpackage.gin
    public final java.lang.String d(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final java.lang.String e(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final void f(int i, byte[] bArr) {
        defpackage.aooh.f(bArr, "value");
        p();
        fsu.J(25, "column index out of range");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final void g(int i, double d) {
        p();
        fsu.J(25, "column index out of range");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final void h(int i, long j) {
        p();
        fsu.J(25, "column index out of range");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final void i(int i) {
        p();
        fsu.J(25, "column index out of range");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final void j(int i, java.lang.String str) {
        defpackage.aooh.f(str, "value");
        p();
        fsu.J(25, "column index out of range");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final void k() {
        p();
    }

    @Override // defpackage.gin
    public final boolean l(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }

    @Override // defpackage.gin
    public final boolean m() {
        int i = this.a - 1;
        if (i == 0) {
            defpackage.gip gipVar = this.f;
            gipVar.k();
            gipVar.i();
            return false;
        }
        if (i == 1) {
            this.f.i();
            return false;
        }
        if (i == 2) {
            this.f.e();
            return false;
        }
        defpackage.gip gipVar2 = this.f;
        if (i != 3) {
            gipVar2.g();
            return false;
        }
        gipVar2.f();
        return false;
    }

    @Override // defpackage.gin
    public final byte[] n(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }
}
