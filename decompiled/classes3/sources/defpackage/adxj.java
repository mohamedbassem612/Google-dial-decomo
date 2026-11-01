package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adxj {
    public static final aiof a = aiof.i("GnpSdk");
    private static volatile adxk b = null;

    public static adxk a(android.content.Context context) {
        adxk adxkVarA;
        if (b == null) {
            java.lang.Object applicationContext = context.getApplicationContext();
            if (applicationContext instanceof defpackage.ypg) {
                adxkVarA = (adxk) ((defpackage.ypg) applicationContext).a();
            } else {
                try {
                    try {
                        adxkVarA = (adxk) agab.aH(context, adxk.class);
                    } catch (java.lang.IllegalStateException unused) {
                        adxkVarA = ((defpackage.adxl) agab.aH(context, defpackage.adxl.class)).a();
                    }
                } catch (java.lang.IllegalStateException unused2) {
                    throw new java.lang.IllegalStateException("Unable to get GnpComponent from host app: ".concat(java.lang.String.valueOf(context.getPackageName())));
                }
            }
            b = adxkVarA;
        }
        b.eG().a(context);
        return b;
    }
}
