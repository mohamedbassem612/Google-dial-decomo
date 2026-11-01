package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abqf implements java.lang.Runnable {
    final java.lang.Runnable a;
    final /* synthetic */ java.lang.Runnable b;
    final /* synthetic */ ajdd c;
    final /* synthetic */ abqh d;
    final /* synthetic */ long e;
    final /* synthetic */ java.util.concurrent.TimeUnit f;
    final /* synthetic */ abqi g;

    public abqf(abqi abqiVar, java.lang.Runnable runnable, ajdd ajddVar, abqh abqhVar, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.b = runnable;
        this.c = ajddVar;
        this.d = abqhVar;
        this.e = j;
        this.f = timeUnit;
        j$.util.Objects.requireNonNull(abqiVar);
        this.g = abqiVar;
        this.a = this;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final java.lang.Runnable runnable = this.b;
        final ajdd ajddVar = this.c;
        final abqh abqhVar = this.d;
        final long j = this.e;
        final java.util.concurrent.TimeUnit timeUnit = this.f;
        this.g.execute(new java.lang.Runnable() { // from class: abqe
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                defpackage.abqf abqfVar = this.a;
                java.lang.Runnable runnable2 = runnable;
                ajdd ajddVar2 = ajddVar;
                abqh abqhVar2 = abqhVar;
                java.util.concurrent.TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (ajddVar2.isDone()) {
                        return;
                    }
                    ajcs ajcsVarB = abqfVar.g.a.b(abqfVar.a, j2, timeUnit2);
                    abqhVar2.a = ajcsVarB;
                    if (abqhVar2.isDone()) {
                        ajcsVarB.cancel(false);
                    }
                } catch (java.lang.Throwable th) {
                    ajddVar2.p(th);
                }
            }
        });
    }
}
