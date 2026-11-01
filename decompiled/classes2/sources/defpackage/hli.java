package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hli implements zog, zoi {
    private static final aimz c = aimz.i("com/android/dialer/activecalls/ActiveCallsFlow");
    public final aoxh a;
    public final defpackage.kvt b;
    private final aolr d;
    private final aoyq e;

    public hli(defpackage.kvt kvtVar, aolr aolrVar) {
        aooh.f(kvtVar, "activeCalls");
        aooh.f(aolrVar, "lightweightContext");
        this.b = kvtVar;
        this.d = aolrVar;
        aoyq aoyqVarC = aoyx.c(0, 1, 0, 5);
        this.e = aoyqVarC;
        this.a = aoxo.a(aoov.aC(new defpackage.hlh(new gdc(new defpackage.hlf(null, 0), aoyqVarC, 7), this, 0), aolrVar));
    }

    public final /* synthetic */ int a() {
        return 0;
    }

    public final void b(android.telecom.Call.Details details) {
        c.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/activecalls/ActiveCallsFlow", "onCallScopeAdded", 41, "ActiveCallsFlow.kt").v("Call scope added - update active calls");
        this.e.d(aojh.a);
    }

    public final void eh() {
        c.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/activecalls/ActiveCallsFlow", "onCallScopeRemoved", 47, "ActiveCallsFlow.kt").v("Call scope removed - update active calls");
        this.e.d(aojh.a);
    }
}
