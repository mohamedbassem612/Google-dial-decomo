package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezd {
    private static final java.lang.Object f = new java.lang.Object();
    private static volatile java.util.Map g;
    public final java.lang.String a;
    public final defpackage.ajsw b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public aezd(android.content.Context context, defpackage.aeze aezeVar) {
        this.a = aezeVar.c ? defpackage.aewo.e(context, aezeVar.b) : aezeVar.b;
        defpackage.ajsw ajswVarB = defpackage.ajsw.b(aezeVar.d);
        this.b = ajswVarB == null ? defpackage.ajsw.UNKNOWN : ajswVarB;
        this.c = aezeVar.g;
        this.d = aezeVar.e;
        this.e = aezeVar.f;
    }

    public static java.util.Map a(android.content.Context context) {
        java.util.Map map = g;
        if (map == null) {
            synchronized (f) {
                map = g;
                if (map == null) {
                    defpackage.aigb aigbVar = new defpackage.aigb(4);
                    try {
                        java.lang.String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (java.lang.String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        java.io.InputStream inputStreamOpen = context.getAssets().open(defpackage.a.bx(str, "phenotype/"));
                                        try {
                                            defpackage.alad aladVarD = defpackage.alad.D(defpackage.aeze.a, defpackage.akzf.J(inputStreamOpen, 4096), defpackage.akzq.a);
                                            defpackage.alad.V(aladVarD);
                                            defpackage.aezd aezdVar = new defpackage.aezd(context, (defpackage.aeze) aladVarD);
                                            aigbVar.i(aezdVar.a, aezdVar);
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } catch (java.lang.Throwable th) {
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (java.lang.Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (defpackage.alaz e) {
                                        android.util.Log.e("PackageInfo", defpackage.a.bx(str, "Unable to read Phenotype PackageMetadata for "), e);
                                    }
                                }
                            }
                        }
                    } catch (java.io.IOException e2) {
                        android.util.Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    defpackage.aigf aigfVarE = aigbVar.e(true);
                    g = aigfVarE;
                    map = aigfVarE;
                }
            }
        }
        return map;
    }
}
