package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyq {
    public static final java.lang.String a = defpackage.gsh.b("WorkForegroundRunnable");

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static final java.lang.Object a(android.content.Context context, defpackage.gxl gxlVar, defpackage.gsg gsgVar, defpackage.grw grwVar, defpackage.gou gouVar, defpackage.aoln aolnVar) {
        defpackage.gyp gypVar;
        if (aolnVar instanceof defpackage.gyp) {
            gypVar = (defpackage.gyp) aolnVar;
            int i = gypVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gypVar.b = i - Integer.MIN_VALUE;
            } else {
                gypVar = new defpackage.gyp(aolnVar);
            }
        } else {
            gypVar = new defpackage.gyp(aolnVar);
        }
        java.lang.Object obj = gypVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gypVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (gxlVar.r && android.os.Build.VERSION.SDK_INT < 31) {
                ?? r0 = gouVar.c;
                defpackage.aooh.e(r0, "getMainThreadExecutor(...)");
                defpackage.aosp aospVarAc = defpackage.aooc.ac(r0);
                blv blvVar = new blv(gsgVar, gxlVar, grwVar, context, (defpackage.aoln) null, 2);
                gypVar.b = 1;
                if (defpackage.aoov.aj(aospVarAc, blvVar, gypVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
