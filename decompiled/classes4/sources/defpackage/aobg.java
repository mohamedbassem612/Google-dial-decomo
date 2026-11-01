package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aobg implements java.lang.Runnable {
    final /* synthetic */ java.util.Collection a;
    final /* synthetic */ defpackage.aobs b;
    final /* synthetic */ boolean c;
    final /* synthetic */ java.util.concurrent.Future d;
    final /* synthetic */ boolean e;
    final /* synthetic */ java.util.concurrent.Future f;
    final /* synthetic */ defpackage.aobu g;

    public aobg(defpackage.aobu aobuVar, java.util.Collection collection, defpackage.aobs aobsVar, boolean z, java.util.concurrent.Future future, boolean z2, java.util.concurrent.Future future2) {
        this.a = collection;
        this.b = aobsVar;
        this.c = z;
        this.d = future;
        this.e = z2;
        this.f = future2;
        j$.util.Objects.requireNonNull(aobuVar);
        this.g = aobuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (defpackage.aobs aobsVar : this.a) {
            if (aobsVar != this.b) {
                aobsVar.a.c(defpackage.aobu.c);
            }
        }
        if (this.c) {
            java.util.concurrent.Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.e) {
                defpackage.aobu aobuVar = this.g;
                if (aobuVar.u.decrementAndGet() == Integer.MIN_VALUE) {
                    aobuVar.h.execute(new defpackage.aobd(this, 3));
                }
            }
        }
        java.util.concurrent.Future future2 = this.f;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.g.x();
    }
}
