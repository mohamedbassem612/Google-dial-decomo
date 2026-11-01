package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gff implements defpackage.gin {
    private final /* synthetic */ defpackage.gin a;

    public gff(defpackage.gin ginVar) {
        if (ginVar == null) {
            defpackage.aooh.i("delegate");
        }
        this.a = ginVar;
    }

    @Override // defpackage.gin
    public final double a(int i) {
        throw null;
    }

    @Override // defpackage.gin
    public final int b() {
        throw null;
    }

    @Override // defpackage.gin
    public final long c(int i) {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.gin, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.gin
    public final java.lang.String d(int i) {
        throw null;
    }

    @Override // defpackage.gin
    public final java.lang.String e(int i) {
        throw null;
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
        throw null;
    }

    @Override // defpackage.gin
    public final boolean l(int i) {
        throw null;
    }

    @Override // defpackage.gin
    public final boolean m() {
        throw new java.lang.IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.gin
    public final byte[] n(int i) {
        throw null;
    }

    @Override // defpackage.gin
    public final boolean o() {
        throw null;
    }
}
