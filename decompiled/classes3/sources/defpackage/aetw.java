package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aetw extends defpackage.aetu implements aepj {
    public final android.content.Context a;
    public final ajcu b;
    public final amwu c;
    public final android.os.Handler d;
    public final aequ e;
    public final aepm f;
    public volatile boolean g = false;
    public final java.lang.Object h = new java.lang.Object();
    public volatile defpackage.aetx i = null;
    public final defpackage.aljf j;
    private final java.util.concurrent.Executor k;

    public aetw(android.content.Context context, java.util.concurrent.Executor executor, ajcu ajcuVar, amwu amwuVar, gou gouVar, defpackage.aljf aljfVar, aepm aepmVar, aoin aoinVar, android.os.Handler handler) {
        this.a = context;
        this.b = ajcuVar;
        this.k = executor;
        this.c = amwuVar;
        this.d = handler;
        this.f = aepmVar;
        this.j = aljfVar;
        this.e = gouVar.D(ajcuVar, amwuVar, aoinVar);
    }

    public final void a() {
        if (!this.e.b((java.lang.String) null)) {
            synchronized (this.h) {
                this.f.b(this);
            }
        } else {
            amwu amwuVar = this.c;
            if (((aett) amwuVar.a()).e.isEmpty()) {
                defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/stall/StallMetricServiceImpl", "readConfigsAndMaybeStart", 181, "StallMetricServiceImpl.java").w("Stall thresholds list expected to have size > 0, was %s", ((aett) amwuVar.a()).e.size());
            } else {
                this.b.b(new aetv(this, 0), ((aett) amwuVar.a()).a, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g(aenj aenjVar) {
        this.g = false;
        if (this.i != null) {
            aiql.C(new aetv(this, 6), this.b);
        }
    }

    public final void j(aenj aenjVar) {
        this.g = true;
        if (this.i != null) {
            aiql.C(new aetv(this, 5), this.b);
        }
    }

    @Override // defpackage.aetu
    public final void n() {
        java.lang.Boolean.FALSE.booleanValue();
        this.f.a(this);
        aiql.C(new aetv(this, 3), this.k);
    }
}
