package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class akwx implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public akwx(kaw kawVar, java.util.concurrent.atomic.AtomicReference atomicReference, ajcq ajcqVar, ahyp ahypVar, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.Object obj, int i) {
        this.$cid = i;
        this.d = atomicReference;
        this.a = ajcqVar;
        this.b = ahypVar;
        this.c = atomicInteger;
        this.e = obj;
        j$.util.Objects.requireNonNull(kawVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajcq, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ahyp, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            ?? r0 = ((defpackage.apjb) this.b).b;
            java.lang.Object obj = this.e;
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.c;
            defpackage.akwz akwzVar = (defpackage.akwz) this.a;
            defpackage.alfr alfrVar = (defpackage.alfr) obj2;
            defpackage.akxt akxtVar = (defpackage.akxt) obj;
            ajcq ajcqVarV = aiql.v(akwzVar.a(r0, (defpackage.akxw) obj3, alfrVar, akxtVar));
            aiql.ab(new ajcq[]{ajcqVarV}).b(new ajzz(akwzVar, ajcqVarV, alfrVar, akxtVar, 2), ajbm.a);
            return;
        }
        java.lang.Object obj4 = this.d;
        defpackage.lou louVar = (defpackage.lou) ((java.util.concurrent.atomic.AtomicReference) obj4).get();
        if (louVar != null) {
            ?? r2 = this.a;
            if (!r2.isCancelled()) {
                try {
                    java.lang.Object objH = aiql.H((java.util.concurrent.Future) r2);
                    if (this.b.a(objH)) {
                        ((java.util.concurrent.atomic.AtomicReference) obj4).set(null);
                        louVar.o(objH);
                        return;
                    }
                } catch (java.util.concurrent.ExecutionException e) {
                    ((java.util.concurrent.atomic.AtomicReference) this.d).set(null);
                    louVar.p(e);
                    return;
                }
            }
            if (((java.util.concurrent.atomic.AtomicInteger) this.c).decrementAndGet() == 0) {
                louVar.o(this.e);
            }
        }
    }

    public /* synthetic */ akwx(defpackage.akwz akwzVar, defpackage.apjb apjbVar, defpackage.akxw akxwVar, defpackage.alfr alfrVar, defpackage.akxt akxtVar, int i) {
        this.$cid = i;
        this.a = akwzVar;
        this.b = apjbVar;
        this.c = akxwVar;
        this.d = alfrVar;
        this.e = akxtVar;
    }
}
