package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adun implements java.lang.Runnable {
    final java.lang.Runnable a;
    final /* synthetic */ java.lang.Runnable b;
    final /* synthetic */ ajdd c;
    final /* synthetic */ defpackage.aduo d;
    final /* synthetic */ long e;
    final /* synthetic */ java.util.concurrent.TimeUnit f;
    final /* synthetic */ defpackage.aduq g;

    public adun(defpackage.aduq aduqVar, java.lang.Runnable runnable, ajdd ajddVar, defpackage.aduo aduoVar, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.b = runnable;
        this.c = ajddVar;
        this.d = aduoVar;
        this.e = j;
        this.f = timeUnit;
        j$.util.Objects.requireNonNull(aduqVar);
        this.g = aduqVar;
        this.a = this;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final java.lang.Runnable runnable = this.b;
        final ajdd ajddVar = this.c;
        final defpackage.aduo aduoVar = this.d;
        final long j = this.e;
        final java.util.concurrent.TimeUnit timeUnit = this.f;
        this.g.execute(new java.lang.Runnable() { // from class: adum
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                defpackage.adun adunVar = this.a;
                java.lang.Runnable runnable2 = runnable;
                ajdd ajddVar2 = ajddVar;
                defpackage.aduo aduoVar2 = aduoVar;
                java.util.concurrent.TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (ajddVar2.isDone()) {
                        return;
                    }
                    ajcs ajcsVarB = adunVar.g.a.b(adunVar.a, j2, timeUnit2);
                    aduoVar2.a = ajcsVarB;
                    if (aduoVar2.isDone()) {
                        ajcsVarB.cancel(false);
                    }
                } catch (java.lang.Throwable th) {
                    ajddVar2.p(th);
                }
            }
        });
    }
}
