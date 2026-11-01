package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class epw implements defpackage.eri {
    protected final defpackage.erl a = new defpackage.erl();

    protected epw() {
    }

    @Override // defpackage.eri
    public final void a() {
        v(false);
    }

    @Override // defpackage.eri
    public final void b() {
        v(true);
    }

    @Override // defpackage.eri
    public final void c(long j) {
        f(i(), j);
    }

    @Override // defpackage.eri
    public final void d(defpackage.eqt eqtVar) {
        z(aify.p(eqtVar));
    }

    @Override // defpackage.eri
    public final boolean e() {
        return k() == 3 && x() && l() == 0;
    }

    protected abstract void f(int i, long j);
}
