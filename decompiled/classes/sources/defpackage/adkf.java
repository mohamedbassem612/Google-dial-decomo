package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adkf implements defpackage.adjd {
    public static final defpackage.adjc a;
    public final java.util.Map b = new java.util.HashMap();

    static {
        defpackage.adjb adjbVarI = defpackage.adjc.i();
        int i = defpackage.adhw.c;
        adjbVarI.d(new defpackage.adhb("default", "default"));
        a = adjbVarI.a();
    }

    @Override // defpackage.adjd
    public final defpackage.adjc a(defpackage.adhw adhwVar) {
        defpackage.adjc adjcVarA;
        java.util.Map map = this.b;
        synchronized (map) {
            defpackage.adkg adkgVar = (defpackage.adkg) map.get(adhwVar);
            if (adkgVar == null) {
                defpackage.adjb adjbVarI = defpackage.adjc.i();
                adjbVarI.d(adhwVar);
                adjcVarA = adjbVarI.a();
            } else {
                if (adkgVar.i == null) {
                    defpackage.adjb adjbVarI2 = defpackage.adjc.i();
                    adjbVarI2.c(adkgVar.e);
                    adjbVarI2.e(adkgVar.d);
                    adjbVarI2.d(adkgVar.a);
                    adjbVarI2.b(adkgVar.c);
                    adjbVarI2.f(adkgVar.b);
                    adjbVarI2.b = adkgVar.f;
                    adjbVarI2.g(adkgVar.h);
                    adjbVarI2.a = adkgVar.g;
                    adkgVar.i = adjbVarI2.a();
                }
                adjcVarA = adkgVar.i;
            }
        }
        return adjcVarA;
    }

    @Override // defpackage.adjd
    public final void b(defpackage.adhw adhwVar) {
        throw null;
    }

    @Override // defpackage.adjd
    public final void c(defpackage.adhw adhwVar, int i) {
        throw null;
    }
}
