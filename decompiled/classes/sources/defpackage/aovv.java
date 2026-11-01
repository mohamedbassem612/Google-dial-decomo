package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovv {
    public static final /* synthetic */ int a = 0;
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object objAe;
        try {
            java.lang.Object objInvoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, android.os.Looper.getMainLooper());
            if (objInvoke == null) {
                defpackage.aooh.h("null cannot be cast to non-null type android.os.Handler");
            }
            objAe = new defpackage.aovt((android.os.Handler) objInvoke, null, false);
        } catch (java.lang.Throwable th) {
            objAe = defpackage.aooc.ae(th);
        }
    }
}
