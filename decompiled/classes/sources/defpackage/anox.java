package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anox {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anox.class.getName());
    private static defpackage.anox b;
    private final java.util.LinkedHashSet c = new java.util.LinkedHashSet();
    private java.util.List d = java.util.Collections.EMPTY_LIST;

    public static synchronized defpackage.anox a() {
        if (b == null) {
            java.util.List<defpackage.anov> listDp = defpackage.ajsz.dp(defpackage.anov.class, java.util.ServiceLoader.load(defpackage.anov.class, defpackage.anov.class.getClassLoader()).iterator(), new defpackage.tzo(13), new defpackage.anow(0));
            b = new defpackage.anox();
            for (defpackage.anov anovVar : listDp) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.ManagedChannelRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(anovVar))));
                b.c(anovVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(defpackage.anov anovVar) {
        anovVar.d();
        this.c.add(anovVar);
    }

    private final synchronized void d() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.c);
        java.util.Collections.sort(arrayList, java.util.Collections.reverseOrder(new defpackage.agl(this, 7)));
        this.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    final synchronized java.util.List b() {
        return this.d;
    }
}
