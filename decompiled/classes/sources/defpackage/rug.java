package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rug implements defpackage.ruc {
    private static final defpackage.aimz cg = defpackage.aimz.i("com/android/dialer/metrics/primes/PrimesMetrics");
    private final defpackage.aenl ch;
    private final defpackage.aeso ci;
    private final java.util.concurrent.atomic.AtomicBoolean cj = new java.util.concurrent.atomic.AtomicBoolean();

    public rug(defpackage.aenl aenlVar, defpackage.aeso aesoVar) {
        this.ch = aenlVar;
        this.ci = aesoVar;
    }

    private static int r(defpackage.rub rubVar) {
        int iOrdinal = rubVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 3) {
            return 4;
        }
        throw new java.lang.UnsupportedOperationException("unsupported status: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rubVar))));
    }

    @Override // defpackage.ruc
    public final j$.util.Optional a() {
        defpackage.aeun aeunVarB = this.ch.b();
        return defpackage.aeun.d(aeunVarB) ? j$.util.Optional.empty() : j$.util.Optional.of(aeunVarB);
    }

    @Override // defpackage.ruc
    public final void b(defpackage.aenj aenjVar) {
        this.ch.a.b(aenjVar);
    }

    @Override // defpackage.ruc
    public final void c(defpackage.aenj aenjVar) {
        this.ci.c(aenjVar);
    }

    @Override // defpackage.ruc
    public final void d(android.support.v7.widget.RecyclerView recyclerView, defpackage.aenj aenjVar) {
        recyclerView.au(new aesn(this.ci, aenjVar));
    }

    @Override // defpackage.ruc
    public final void e(defpackage.aenj aenjVar) {
        ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "recordBattery", 130, "PrimesMetrics.java")).y("recording battery for event: %s", aenjVar);
        this.ch.a.d(aenjVar);
    }

    @Override // defpackage.ruc
    public final void f(defpackage.aenj aenjVar) {
        ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "recordMemory", 124, "PrimesMetrics.java")).y("recording memory for event: %s", aenjVar);
        this.ch.g(aenjVar);
    }

    @Override // defpackage.ruc
    public final void g(defpackage.aenj aenjVar, android.app.Activity activity) {
        if (this.cj.compareAndSet(false, true)) {
            ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "reportOnAppInteractive", 157, "PrimesMetrics.java")).I("startupType: %s, activity: %s", aenjVar, activity);
            defpackage.aeud aeudVar = defpackage.aeud.a;
            aeudVar.c(aenjVar);
            aeudVar.b(activity);
        }
    }

    @Override // defpackage.ruc
    public final void h(defpackage.aenj aenjVar, defpackage.aw awVar) {
        if (awVar.aH()) {
            ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "reportOnAppInteractiveIfNotHidden", 166, "PrimesMetrics.java")).y("skip on app interactive as the fragment: %s is hidden", awVar);
            return;
        }
        if (this.cj.compareAndSet(false, true)) {
            ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "reportOnAppInteractiveIfNotHidden", 173, "PrimesMetrics.java")).I("startupType: %s, fragment: %s", aenjVar, awVar);
            defpackage.aeud aeudVar = defpackage.aeud.a;
            aeudVar.c(aenjVar);
            if (awVar.G() != null) {
                aeudVar.b(awVar.G());
            }
        }
    }

    @Override // defpackage.ruc
    public final void i(defpackage.aenj aenjVar) {
        ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "startBatteryDiff", 136, "PrimesMetrics.java")).y("start recording battery diff for event: %s", aenjVar);
        this.ch.a.f(aenjVar);
    }

    @Override // defpackage.ruc
    public final void j(defpackage.aenj aenjVar) {
        this.ch.a.g(aenjVar);
    }

    @Override // defpackage.ruc
    public final void k(defpackage.aenj aenjVar) {
        this.ci.d(aenjVar);
    }

    @Override // defpackage.ruc
    public final void l(defpackage.aenj aenjVar) {
        ((defpackage.aimw) ((defpackage.aimw) cg.b()).l("com/android/dialer/metrics/primes/PrimesMetrics", "stopBatteryDiff", 142, "PrimesMetrics.java")).y("stop recording battery diff for event: %s", aenjVar);
        this.ch.a.l(aenjVar);
    }

    @Override // defpackage.ruc
    public final void m(defpackage.aenj aenjVar) {
        this.ch.a.m(aenjVar, 1);
    }

    @Override // defpackage.ruc
    public final void n(defpackage.aenj aenjVar, defpackage.rub rubVar) {
        this.ch.a.m(aenjVar, r(rubVar));
    }

    @Override // defpackage.ruc
    public final void o(defpackage.aenj aenjVar) {
        defpackage.agsm.d("com/android/dialer/metrics/primes/PrimesMetrics", "stopJankRecorder", 105, this.ci.f(aenjVar), defpackage.zct.b, "failed to stop jank recorder for event: %s", aenjVar);
    }

    @Override // defpackage.ruc
    public final void p(defpackage.aeun aeunVar, defpackage.aenj aenjVar) {
        this.ch.f(aeunVar, aenjVar, 1);
    }

    @Override // defpackage.ruc
    public final void q(defpackage.aeun aeunVar, defpackage.aenj aenjVar, defpackage.rub rubVar) {
        this.ch.f(aeunVar, aenjVar, r(rubVar));
    }
}
