package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adgy {
    public static final defpackage.adgl a = defpackage.adgl.a;
    public static final defpackage.adgh b = defpackage.adgh.a;
    public static final defpackage.adgj c = defpackage.adgj.a;
    public final int d;
    private final java.util.Map e = new java.util.HashMap();
    private final defpackage.adgx f = new defpackage.adgx(this);

    public adgy(int i) {
        this.d = i;
    }

    private final synchronized defpackage.adgx h(java.lang.String str) {
        java.util.Map map;
        map = this.e;
        if (!map.containsKey(str)) {
            map.put(str, new defpackage.adgx(this));
        }
        return (defpackage.adgx) map.get(str);
    }

    final synchronized defpackage.adgh a(java.lang.String str) {
        return d(str).b;
    }

    public final synchronized defpackage.adgj b(java.lang.String str) {
        return d(str).c;
    }

    final synchronized defpackage.adgl c(java.lang.String str) {
        return d(str).a;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d), top: B:13:0x0003 }] */
    public final synchronized defpackage.adgx d(java.lang.String str) {
        defpackage.adgx adgxVar;
        if (str != null) {
            adgxVar = (defpackage.adgx) this.e.get(str);
            if (adgxVar == null) {
                adgxVar = this.f;
            }
        } else {
            adgxVar = this.f;
        }
        return adgxVar;
    }

    public final synchronized void e(java.lang.String str, defpackage.adgh adghVar) {
        h(str).b = adghVar;
    }

    public final synchronized void f(java.lang.String str, defpackage.adgl adglVar) {
        h(str).a = adglVar;
    }

    public final synchronized void g(java.lang.String str) {
        int i = d(str).d;
    }
}
