package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahme implements defpackage.ahlx {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final defpackage.ahlz b;
    public final java.util.concurrent.Executor c;
    public final java.lang.Boolean d;
    public final defpackage.ahyn e;
    public final defpackage.ahmk f;
    public final defpackage.ahbz g;
    private final java.lang.Boolean h = java.lang.Boolean.FALSE;

    static {
        new defpackage.agux(1L, java.util.concurrent.TimeUnit.DAYS);
    }

    public ahme(defpackage.ahbz ahbzVar, defpackage.ahlz ahlzVar, java.util.concurrent.Executor executor, defpackage.ahmk ahmkVar, java.lang.Boolean bool, defpackage.ahyn ahynVar) {
        this.g = ahbzVar;
        this.b = ahlzVar;
        this.c = executor;
        this.f = ahmkVar;
        this.d = bool;
        this.e = ahynVar;
    }

    public static defpackage.grn a(java.util.Set set) {
        defpackage.grl grlVar = new defpackage.grl();
        grlVar.a = set.contains(defpackage.ahkz.a);
        if (set.contains(defpackage.ahkz.b)) {
            grlVar.b(defpackage.gsi.c);
        } else if (set.contains(defpackage.ahkz.c)) {
            grlVar.b(defpackage.gsi.b);
        }
        return grlVar.a();
    }

    public static java.lang.String c(defpackage.grn grnVar, defpackage.ahyn ahynVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(defpackage.agab.aY("SyncPeriodicTask", ahynVar));
        if (grnVar.d) {
            sb.append("_charging");
        }
        defpackage.gsi gsiVar = grnVar.b;
        if (gsiVar == defpackage.gsi.c) {
            sb.append("_unmetered");
        } else if (gsiVar == defpackage.gsi.b) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    public final defpackage.ahyn b() {
        this.h.booleanValue();
        return defpackage.ahwt.a;
    }
}
