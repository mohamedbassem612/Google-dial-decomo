package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pa extends or {
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        aooh.f(context, "context");
        aooh.f(str, "input");
        return den.bH(new java.lang.String[]{str});
    }

    public final /* bridge */ /* synthetic */ defpackage.oq getSynchronousResult(android.content.Context context, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        aooh.f(context, "context");
        aooh.f(str, "input");
        if (dvx.c(context, str) == 0) {
            return new defpackage.oq(java.lang.Boolean.TRUE);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        if (intent == null || i != -1) {
            return java.lang.Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                    break;
                }
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
