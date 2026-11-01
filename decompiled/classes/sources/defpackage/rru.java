package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rru {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/ui/searchcontainer/SearchContainerImpl");
    public final defpackage.aw b;
    public final defpackage.teh c;

    public rru(defpackage.aw awVar, defpackage.teh tehVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        this.b = awVar;
        this.c = tehVar;
    }

    public static final rqv a(rrt rrtVar) {
        hgw hgwVarBw = defpackage.pez.bw(rqv.a.m());
        java.lang.String str = rrtVar.d;
        defpackage.aooh.e(str, "getInput(...)");
        hgwVarBw.F(str);
        if ((rrtVar.b & 2) != 0) {
            defpackage.alcf alcfVar = rrtVar.e;
            if (alcfVar == null) {
                alcfVar = defpackage.alcf.a;
            }
            defpackage.aooh.e(alcfVar, "getIntentTimestamp(...)");
            hgwVarBw.G(alcfVar);
        }
        return hgwVarBw.E();
    }
}
