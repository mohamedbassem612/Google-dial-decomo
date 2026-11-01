package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gjj extends defpackage.gjo implements defpackage.gin {
    private final defpackage.gjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjj(defpackage.gip gipVar, java.lang.String str, defpackage.gjo gjoVar) {
        super(gipVar, str);
        defpackage.aooh.f(str, "sql");
        this.a = gjoVar;
    }

    @Override // defpackage.gin
    public final double a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.gin
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.gin
    public final long c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.gin, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.gin
    public final java.lang.String d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.gin
    public final java.lang.String e(int i) {
        return this.a.e(i);
    }

    @Override // defpackage.gin
    public final void f(int i, byte[] bArr) {
        defpackage.aooh.f(bArr, "value");
        this.a.f(i, bArr);
    }

    @Override // defpackage.gin
    public final void g(int i, double d) {
        this.a.g(i, d);
    }

    @Override // defpackage.gin
    public final void h(int i, long j) {
        this.a.h(i, j);
    }

    @Override // defpackage.gin
    public final void i(int i) {
        this.a.i(i);
    }

    @Override // defpackage.gin
    public final void j(int i, java.lang.String str) {
        defpackage.aooh.f(str, "value");
        this.a.j(i, str);
    }

    @Override // defpackage.gin
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.gin
    public final boolean l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.gin
    public final boolean m() {
        boolean zM = this.a.m();
        boolean zS = defpackage.aoov.s(e(0), "wal", true);
        defpackage.gip gipVar = this.f;
        if (zS) {
            gipVar.o();
        } else {
            gipVar.h();
        }
        return zM;
    }

    @Override // defpackage.gin
    public final byte[] n(int i) {
        return this.a.n(i);
    }

    @Override // defpackage.gjo, defpackage.gin
    public final boolean o() {
        return this.a.o();
    }
}
