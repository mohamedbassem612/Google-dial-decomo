package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyj {
    static {
        defpackage.gsh.b("ProcessUtils");
    }

    public static final boolean a(android.content.Context context, defpackage.grk grkVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (grkVar == null) {
            defpackage.aooh.i("configuration");
        }
        java.lang.String strM = ft$.ExternalSyntheticApiModelOutline0.m();
        defpackage.aooh.e(strM, "getProcessName(...)");
        java.lang.String str = grkVar.i;
        return defpackage.aooh.n(strM, context.getApplicationInfo().processName);
    }
}
