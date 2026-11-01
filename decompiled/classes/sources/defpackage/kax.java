package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kax implements defpackage.kau {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/compose/logging/CallLogLoggingLifecycleListener");
    private final defpackage.ruc b;
    private final defpackage.gpd c;

    public kax(defpackage.ruc rucVar, defpackage.gpd gpdVar) {
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.b = rucVar;
        this.c = gpdVar;
    }

    private static final defpackage.aenj f(defpackage.lpv lpvVar) {
        int iOrdinal = lpvVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return defpackage.ruc.bw;
        }
        if (iOrdinal == 2) {
            return defpackage.ruc.bx;
        }
        throw new defpackage.aois();
    }

    @Override // defpackage.kau
    public final void a(defpackage.kav kavVar) {
        defpackage.aenj aenjVar;
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
        if (!kavVar.a) {
            ((defpackage.aimw) a.b().l("com/android/dialer/calllog/compose/logging/CallLogLoggingLifecycleListener", "onInteractive", 47, "CallLogLoggingLifecycleListener.kt")).v("not logging interactive startup latency because call log is not visible");
            return;
        }
        android.app.Activity activity = kavVar.c;
        defpackage.lpv lpvVar = kavVar.b;
        int iOrdinal = lpvVar.ordinal();
        if (iOrdinal == 0) {
            aenjVar = rty.a;
        } else if (iOrdinal == 1) {
            aenjVar = defpackage.rtz.a;
        } else {
            if (iOrdinal != 2) {
                throw new defpackage.aois();
            }
            aenjVar = rua.a;
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/calllog/compose/logging/CallLogLoggingLifecycleListener", "reportInteractiveLatency", 81, "CallLogLoggingLifecycleListener.kt")).y("logging interactive startup latency for %s screen size", lpvVar);
        defpackage.ruc rucVar = this.b;
        rucVar.g(aenjVar, activity);
        defpackage.aenj aenjVarF = f(lpvVar);
        if (aenjVarF != null) {
            rucVar.m(aenjVarF);
        }
        this.c.i(null).b(defpackage.mce.RECENTS_TAB_RENDERED_AFTER_CREATED);
    }

    @Override // defpackage.kau
    public final void c(defpackage.kav kavVar) {
        defpackage.aenj aenjVarF;
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
        if (!kavVar.a || (aenjVarF = f(kavVar.b)) == null) {
            return;
        }
        this.b.j(aenjVarF);
    }

    @Override // defpackage.kau
    public final void e() {
        this.c.i(null).b(defpackage.mce.RECENTS_TAB_RENDERED_AFTER_RESUMED);
    }

    @Override // defpackage.kau
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kau
    public final /* synthetic */ void b(java.lang.Long l) {
    }
}
