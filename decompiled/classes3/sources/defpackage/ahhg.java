package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhg implements ahhb {
    public ahhb a;
    private final aw b;
    private final aolr c;

    public ahhg(aw awVar, aolr aolrVar) {
        aooh.f(awVar, "fragment");
        aooh.f(aolrVar, "mainImmediateContext");
        this.b = awVar;
        this.c = aolrVar;
    }

    public final defpackage.uzx a(aozh aozhVar) {
        if (!aooh.n(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            throw new java.lang.IllegalStateException("streamFrom() must be called from the main thread.");
        }
        try {
            if (this.b.Q().P().d != emq.b) {
                throw new java.lang.IllegalStateException("A @ViewLifecycle StreamMixin may only register callbacks in `onCreateView()`.");
            }
            ahhb ahhbVar = this.a;
            if (ahhbVar == null) {
                aw awVar = this.b;
                emx emxVarQ = awVar.Q();
                try {
                    defpackage.ahhe ahheVar = new defpackage.ahhe(emxVarQ, afsq.M(this.c, emxVarQ.P()), defpackage.uzx.aX(emxVarQ, awVar));
                    emxVarQ.P().c(new ahrs(new zu(this, 8)));
                    this.a = ahheVar;
                    ahhbVar = ahheVar;
                } catch (java.lang.IllegalStateException e) {
                    throw new java.lang.IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            if (!aooh.n(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
                throw new java.lang.IllegalStateException("streamFrom() must be called from the main thread.");
            }
            defpackage.ahhe ahheVar2 = (defpackage.ahhe) ahhbVar;
            defpackage.ahhf ahhfVar = ahheVar2.c;
            java.util.Map map = ahhfVar.a;
            java.lang.Object objValueOf = map.get(aozhVar);
            if (objValueOf == null) {
                if (!ahhfVar.b) {
                    throw new java.lang.IllegalStateException("This StateFlow object was not streamed from in the first lifecycle of this LifecycleOwner. A LifecycleOwner must streamFrom() every StateFlow it wishes to stream from in its first lifecycle, and must always stream from exactly the same set of StateFlow objects after each configuration change. This prevents state loss.");
                }
                int i = dzs.a;
                objValueOf = java.lang.Integer.valueOf(android.view.View.generateViewId());
                map.put(aozhVar, objValueOf);
            }
            ahheVar2.d.aS(((java.lang.Number) objValueOf).intValue(), ahheVar2.a, new defpackage.ahhc(ahhbVar, 0));
            return new defpackage.uzx(new defpackage.agvo(ahhbVar, aozhVar, 4), (byte[]) null);
        } catch (java.lang.IllegalStateException e2) {
            throw new java.lang.IllegalStateException("A @ViewLifecycle StreamMixin may only register callbacks in `onCreateView()`.", e2);
        }
    }
}
