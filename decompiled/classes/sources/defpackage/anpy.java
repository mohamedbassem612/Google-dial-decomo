package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anpy {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anpy.class.getName());
    private static defpackage.anpy b;
    private java.lang.String c;
    private final java.util.LinkedHashSet d;
    private defpackage.aigf e;

    public anpy() {
        new defpackage.anpx(this);
        this.c = "unknown";
        this.d = new java.util.LinkedHashSet();
        this.e = defpackage.aikj.b;
    }

    public static synchronized defpackage.anpy b() {
        if (b == null) {
            defpackage.anpw.class.getClassLoader();
            java.util.List<defpackage.anpw> listDp = defpackage.ajsz.dp(defpackage.anpw.class, java.util.Collections.singletonList(defpackage.anww.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new defpackage.tzo(14), new defpackage.anow(2));
            if (listDp.isEmpty()) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new defpackage.anpy();
            for (defpackage.anpw anpwVar : listDp) {
                a.logp(java.util.logging.Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(anpwVar))));
                b.f(anpwVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(defpackage.anpw anpwVar) {
        anpwVar.f();
        this.d.add(anpwVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0016, B:8:0x0028, B:11:0x0035, B:13:0x003b, B:10:0x0032, B:14:0x0044), top: B:21:0x0001 }] */
    private final synchronized void g() {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String strC = "unknown";
        int iD = Integer.MIN_VALUE;
        for (defpackage.anpw anpwVar : this.d) {
            java.lang.String strC2 = anpwVar.c();
            defpackage.anpw anpwVar2 = (defpackage.anpw) map.get(strC2);
            if (anpwVar2 != null) {
                if (anpwVar2.d() < anpwVar.d()) {
                    map.put(strC2, anpwVar);
                }
            } else {
                map.put(strC2, anpwVar);
            }
            if (iD < anpwVar.d()) {
                iD = anpwVar.d();
                strC = anpwVar.c();
            }
        }
        this.e = defpackage.aigf.i(map);
        this.c = strC;
    }

    public final defpackage.anpw a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (defpackage.anpw) d().get(str.toLowerCase(java.util.Locale.US));
    }

    public final synchronized java.lang.String c() {
        return this.c;
    }

    final synchronized java.util.Map d() {
        return this.e;
    }

    public final synchronized void e(defpackage.anpw anpwVar) {
        f(anpwVar);
        g();
    }
}
