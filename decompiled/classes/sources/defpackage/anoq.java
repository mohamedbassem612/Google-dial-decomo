package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anoq {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anoq.class.getName());
    private static defpackage.anoq b;
    private final java.util.LinkedHashSet c = new java.util.LinkedHashSet();
    private final java.util.LinkedHashMap d = new java.util.LinkedHashMap();

    public static synchronized defpackage.anoq b() {
        if (b == null) {
            defpackage.anop.class.getClassLoader();
            java.util.List<defpackage.anop> listDp = defpackage.ajsz.dp(defpackage.anop.class, java.util.Collections.singletonList(defpackage.aoau.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new defpackage.tzo(12), new defpackage.anow(1));
            b = new defpackage.anoq();
            for (defpackage.anop anopVar : listDp) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(anopVar))));
                b.c(anopVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(defpackage.anop anopVar) {
        anopVar.d();
        this.c.add(anopVar);
    }

    private final synchronized void d() {
        java.util.LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        for (defpackage.anop anopVar : this.c) {
            java.lang.String strC = anopVar.c();
            if (((defpackage.anop) linkedHashMap.get(strC)) != null) {
                anopVar.e();
            } else {
                linkedHashMap.put(strC, anopVar);
            }
        }
    }

    public final synchronized defpackage.anop a(java.lang.String str) {
        return (defpackage.anop) this.d.get(str);
    }
}
