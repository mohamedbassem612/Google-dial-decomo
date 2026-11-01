package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kab {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/calllog/compose/data/RttConfigState");
    public final defpackage.aoss a;
    public final defpackage.aozh b;
    public final defpackage.aozj c;
    private final defpackage.aoir e;

    public kab(defpackage.zjm zjmVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = aossVar;
        defpackage.aozj aozjVar = new defpackage.aozj(defpackage.tcp.UNSUPPORTED);
        this.c = aozjVar;
        this.b = new defpackage.aoys(aozjVar, null);
        this.e = new defpackage.aoiy(new defpackage.jza(zjmVar, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        defpackage.kaa kaaVar;
        if (aolnVar instanceof defpackage.kaa) {
            kaaVar = (defpackage.kaa) aolnVar;
            int i = kaaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kaaVar.c = i - Integer.MIN_VALUE;
            } else {
                kaaVar = new defpackage.kaa(this, aolnVar);
            }
        } else {
            kaaVar = new defpackage.kaa(this, aolnVar);
        }
        java.lang.Object objD = kaaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kaaVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objD);
                defpackage.aogc aogcVar = (defpackage.aogc) this.e.a();
                if (aogcVar != null) {
                    defpackage.ajcq ajcqVarA = ((defpackage.tcv) aogcVar.a).a();
                    kaaVar.c = 1;
                    objD = defpackage.aosv.D(ajcqVarA, kaaVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.tcp.UNSUPPORTED;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            defpackage.aooh.e(objD, "await(...)");
            return objD;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) d.d()).k(e).l("com/android/dialer/calllog/compose/data/RttConfigState", "loadRttConfiguration", 56, "RttConfigState.kt")).v("Failed to load RttConfiguration");
        }
    }
}
