package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class opx {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/globalcontentobserver/DialerGlobalContentObservers");
    public final defpackage.ojo b;
    public final java.util.concurrent.ConcurrentMap c;
    private final java.util.Set d;

    public opx(defpackage.ojo ojoVar, java.util.Set set) {
        this.b = ojoVar;
        this.d = set;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap(set.size());
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            concurrentHashMap.put((defpackage.opu) it.next(), java.lang.Boolean.FALSE);
        }
        this.c = concurrentHashMap;
    }

    public final void a() {
        for (final defpackage.opu opuVar : this.d) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/globalcontentobserver/DialerGlobalContentObservers", "registerAll", 53, "DialerGlobalContentObservers.java")).y("registering %s", opuVar.c());
            j$.util.concurrent.ConcurrentMap.-EL.compute(this.c, opuVar, new java.util.function.BiFunction() { // from class: opw
                @Override // java.util.function.BiFunction
                public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                    return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                    defpackage.opx opxVar = this.a;
                    defpackage.opu opuVar2 = opuVar;
                    if (zBooleanValue) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.opx.a.b()).l("com/android/dialer/globalcontentobserver/DialerGlobalContentObservers", "registerAll", 59, "DialerGlobalContentObservers.java")).y("%s already registered", opuVar2.c());
                        return java.lang.Boolean.TRUE;
                    }
                    try {
                        defpackage.ojo ojoVar = opxVar.b;
                        android.net.Uri uriA = opuVar2.a();
                        opuVar2.d();
                        ojoVar.r(uriA, opuVar2.b());
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.opx.a.b()).l("com/android/dialer/globalcontentobserver/DialerGlobalContentObservers", "registerAll", 66, "DialerGlobalContentObservers.java")).y("%s registered", opuVar2.c());
                        return java.lang.Boolean.TRUE;
                    } catch (java.lang.Throwable th) {
                        defpackage.ainm ainmVarD = defpackage.opx.a.d();
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarD).i(defpackage.zct.b)).k(th)).l("com/android/dialer/globalcontentobserver/DialerGlobalContentObservers", "registerAll", 'O', "DialerGlobalContentObservers.java")).y("failed to register %s", opuVar2.c());
                        return java.lang.Boolean.FALSE;
                    }
                }
            });
        }
    }
}
