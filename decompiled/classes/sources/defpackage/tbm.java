package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tbm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/state/RevelioState");
    public final defpackage.ajct e;
    private final java.util.concurrent.Executor g;
    public final java.util.Map b = new defpackage.aca();
    public final java.util.Map c = new defpackage.aca();
    public final java.util.Set d = new java.util.HashSet();
    public final java.util.concurrent.atomic.AtomicLong f = new java.util.concurrent.atomic.AtomicLong(-1);
    private final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public tbm(defpackage.ajct ajctVar) {
        this.e = ajctVar;
        this.g = new defpackage.ajdc(ajctVar);
    }

    public final defpackage.ajcq a(long j) {
        return defpackage.ahvr.G(new lki(this, j, 2), this.g);
    }

    public final defpackage.ajcq b(long j) {
        return defpackage.ahvr.F(new jww(this, j, 8), this.g);
    }

    public final defpackage.ajcq c(long j, amrc amrcVar) {
        return defpackage.ahvr.E(new tbl(this, j, amrcVar, 0), this.g);
    }

    public final defpackage.ajcq d(long j, java.util.function.Consumer consumer) {
        return defpackage.ahvr.F(new tbk(this, j, consumer), this.g);
    }

    public final j$.util.Optional e() {
        return (j$.util.Optional) this.h.get();
    }

    public final void f(j$.util.Optional optional) {
        this.h.set(optional);
    }
}
