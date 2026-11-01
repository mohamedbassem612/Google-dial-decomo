package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kad {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/calllog/compose/data/WifiConfigState");
    public final defpackage.aoss a;
    public final defpackage.aozh b;
    public final defpackage.aozj c;
    private final defpackage.aoir e;

    public kad(defpackage.zjm zjmVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = aossVar;
        defpackage.aozj aozjVarA = defpackage.aozk.a(defpackage.wgi.a);
        this.c = aozjVarA;
        this.b = new defpackage.aoys(aozjVarA, null);
        this.e = new defpackage.aoiy(new defpackage.jza(zjmVar, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        defpackage.kac kacVar;
        if (aolnVar instanceof defpackage.kac) {
            kacVar = (defpackage.kac) aolnVar;
            int i = kacVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kacVar.c = i - Integer.MIN_VALUE;
            } else {
                kacVar = new defpackage.kac(this, aolnVar);
            }
        } else {
            kacVar = new defpackage.kac(this, aolnVar);
        }
        java.lang.Object objD = kacVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kacVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objD);
                defpackage.zzx zzxVar = (defpackage.zzx) this.e.a();
                if (zzxVar != null) {
                    defpackage.ajcq ajcqVarR = zzxVar.r();
                    kacVar.c = 1;
                    objD = defpackage.aosv.D(ajcqVarR, kacVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.wgi wgiVar = defpackage.wgi.a;
                defpackage.aooh.e(wgiVar, "getDefaultInstance(...)");
                return wgiVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            defpackage.aooh.e(objD, "await(...)");
            return objD;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) d.d()).k(e).l("com/android/dialer/calllog/compose/data/WifiConfigState", "loadWifiCallingIconsConfig", 59, "WifiConfigState.kt")).v("Failed to load WifiCallingIconsConfig");
        }
    }
}
