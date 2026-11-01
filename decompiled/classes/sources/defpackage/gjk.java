package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gjk extends defpackage.gjo {
    private final defpackage.giw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjk(defpackage.gip gipVar, java.lang.String str) {
        super(gipVar, str);
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        this.a = gipVar.c(str);
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
        this.a.close();
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
        if (bArr == null) {
            defpackage.aooh.i("value");
        }
        p();
        this.a.a(i, bArr);
    }

    @Override // defpackage.gin
    public final void g(int i, double d) {
        p();
        this.a.b(i, d);
    }

    @Override // defpackage.gin
    public final void h(int i, long j) {
        p();
        this.a.c(i, j);
    }

    @Override // defpackage.gin
    public final void i(int i) {
        p();
        this.a.d(i);
    }

    @Override // defpackage.gin
    public final void j(int i, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        p();
        this.a.e(i, str);
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
        p();
        this.a.f();
        return false;
    }

    @Override // defpackage.gin
    public final byte[] n(int i) {
        p();
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }
}
