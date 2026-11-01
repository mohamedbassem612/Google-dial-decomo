package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaak implements defpackage.zzq {
    public static final defpackage.aewz a;
    public static final j$.util.concurrent.ConcurrentHashMap b;
    static java.lang.Boolean c;
    static java.lang.Long d;
    public final android.content.Context e;

    static {
        defpackage.acxg acxgVar = defpackage.aasr.a;
        defpackage.aewz aewzVar = new defpackage.aewz(defpackage.aewo.a("com.google.android.gms.clearcut.public"), "", "", false, false);
        if (aewzVar.b) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        defpackage.aewz aewzVar2 = new defpackage.aewz((android.net.Uri) aewzVar.d, "gms:playlog:service:samplingrules_", aewzVar.a, false, aewzVar.c);
        java.lang.Object obj = aewzVar2.d;
        android.net.Uri uri = (android.net.Uri) obj;
        a = new defpackage.aewz(uri, (java.lang.String) aewzVar2.e, "LogSamplingRulesV2__", aewzVar2.b, aewzVar2.c);
        b = new j$.util.concurrent.ConcurrentHashMap();
        c = null;
        d = null;
    }

    public aaak(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            defpackage.aexb.f(applicationContext);
        }
    }
}
