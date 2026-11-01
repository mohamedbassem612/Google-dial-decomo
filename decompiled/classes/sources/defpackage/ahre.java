package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahre {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/tracing/TraceThreadContextElementKt");

    public static final java.lang.Object a(defpackage.aolr aolrVar, defpackage.aoln aolnVar) {
        defpackage.aolr aolrVarU = aolnVar.u();
        defpackage.cch cchVar = defpackage.ahrd.b;
        if (aolrVarU.get(cchVar) != null || (aolrVar != null && aolrVar.get(cchVar) != null)) {
            return defpackage.aojh.a;
        }
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("TikTok coroutine tracing methods should only be called in a TikTok CoroutineContext: go/tiktok/dev/concurrent/coroutines/tracing#trace-propagation");
        if (d()) {
            throw illegalStateException;
        }
        boolean z = defpackage.ahns.a;
        ((defpackage.aimw) ((defpackage.aimw) a.c()).k(illegalStateException).l("com/google/apps/tiktok/tracing/TraceThreadContextElementKt", "checkContextHasTraceElement", 87, "TraceThreadContextElement.kt")).v("Missing trace context element");
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.ahrd b(defpackage.ahpn ahpnVar, int i) {
        if ((i & 1) != 0) {
            ahpnVar = new defpackage.ahpg(0);
        }
        if (ahpnVar == null) {
            defpackage.aooh.i("context");
        }
        return new defpackage.ahrd(ahpnVar, false, false);
    }

    public static final void c(defpackage.aoss aossVar) {
        if (aossVar != null) {
            if (aossVar.c().get(defpackage.ahrd.b) != null) {
                return;
            }
            if (defpackage.aooh.n(aossVar.getClass().getName(), "androidx.compose.runtime.RememberedCoroutineScope") && ((java.lang.Boolean) aossVar.c().fold(java.lang.Boolean.FALSE, new agjd(2))).booleanValue()) {
                return;
            }
        }
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("TikTok coroutine tracing methods should only be called in a TikTok CoroutineContext: go/tiktok/dev/concurrent/coroutines/tracing#trace-propagation");
        if (d()) {
            throw illegalStateException;
        }
        boolean z = defpackage.ahns.a;
        ((defpackage.aimw) ((defpackage.aimw) a.c()).k(illegalStateException).l("com/google/apps/tiktok/tracing/TraceThreadContextElementKt", "checkHasTraceElement", 62, "TraceThreadContextElement.kt")).v("Missing trace context element");
    }

    private static final boolean d() {
        if (defpackage.aooh.n(android.os.Build.FINGERPRINT, "robolectric")) {
            return true;
        }
        if (defpackage.aooh.n(android.os.Build.HARDWARE, "ranchu")) {
            java.lang.String str = android.os.Build.FINGERPRINT;
            defpackage.aooh.e(str, "FINGERPRINT");
            if (defpackage.aoov.r(str, "test-keys", false)) {
                return true;
            }
        }
        return false;
    }
}
