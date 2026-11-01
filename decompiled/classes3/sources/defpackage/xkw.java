package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.android.onboarding.contracts.annotations.InternalOnboardingApi
public final class xkw implements java.lang.AutoCloseable {
    private final j$.util.concurrent.ConcurrentHashMap a;
    private final j$.util.concurrent.ConcurrentHashMap b;

    public xkw(final java.util.function.Supplier supplier, defpackage.xpz xpzVar) {
        aooh.f(xpzVar, "onboardingChanges");
        aooc.ag(new aomy() { // from class: xkv
            public final java.lang.Object a() {
                return ((android.content.Context) aa$.ExternalSyntheticApiModelOutline1.m(supplier)).getApplicationContext();
            }
        });
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        synchronized (concurrentHashMap) {
            java.util.Collection collectionValues = concurrentHashMap.values();
            aooh.e(collectionValues, "<get-values>(...)");
            concurrentHashMap.clear();
            this.b.clear();
            java.util.Iterator it = collectionValues.iterator();
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                aooh.e(next, "next(...)");
                throw null;
            }
        }
    }
}
