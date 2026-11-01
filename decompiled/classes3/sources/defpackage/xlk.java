package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public class xlk implements java.lang.AutoCloseable {
    public static final xtq f;
    private final j$.util.concurrent.ConcurrentHashMap a;
    public final defpackage.xpz b;
    public final defpackage.xhe c;
    public final aoss d;
    public final j$.util.concurrent.ConcurrentLinkedQueue e;

    static {
        int i = defpackage.xox.a;
        f = new xtq("DefaultOnboardingTaskManager", (byte[]) null);
    }

    public xlk(aolr aolrVar, defpackage.xpz xpzVar, defpackage.xhe xheVar) {
        aooh.f(aolrVar, "coroutineContext");
        aooh.f(xpzVar, "onboardingChanges");
        this.b = xpzVar;
        this.c = xheVar;
        defpackage.xfc.c();
        this.d = aosv.n(aolrVar.plus(new aovh((aoub) null)));
        aooc.ag(new defpackage.wsn(this, 9));
        this.e = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        aooc.ag(new defpackage.wsn(this, 10));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.clear();
        aosv.q(this.d, (java.util.concurrent.CancellationException) null);
    }
}
