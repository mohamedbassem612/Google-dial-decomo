package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qba {
    public static final defpackage.agxj a = new defpackage.agxj("InCallUiLock");
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/incall/lock/InCallUiLockRegistry");
    private static final java.lang.Object g = new java.lang.Object();
    public final java.util.Map c = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.Set d = new defpackage.acc(0);
    public final java.util.concurrent.Executor e;
    public final defpackage.aogc f;
    private final defpackage.gpd h;

    public qba(defpackage.aogc aogcVar, defpackage.ajct ajctVar, defpackage.gpd gpdVar) {
        this.f = aogcVar;
        this.e = new defpackage.ajdc(ajctVar);
        this.h = gpdVar;
    }

    public final qay a(java.lang.String str) {
        qay qayVar = new qay(this, str);
        boolean zC = c();
        defpackage.aimz aimzVar = b;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/lock/InCallUiLockRegistry", "acquire", 58, "InCallUiLockRegistry.java")).y("acquiring %s", qayVar);
        this.c.put(qayVar, g);
        if (!zC) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/incall/lock/InCallUiLockRegistry", "acquire", 61, "InCallUiLockRegistry.java")).v("first lock acquired.");
            this.f.s(defpackage.aiql.z(null), a);
        }
        return qayVar;
    }

    public final void b() {
        this.h.i(null).b(defpackage.mce.ALL_UI_LOCKS_RELEASED);
    }

    public final boolean c() {
        return !this.c.isEmpty();
    }

    public final boolean d(java.util.function.Predicate predicate) {
        return j$.util.Collection.-EL.stream(this.c.keySet()).anyMatch(new qaz(predicate));
    }
}
