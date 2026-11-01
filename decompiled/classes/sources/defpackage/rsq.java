package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rsq implements defpackage.kkd {
    public final defpackage.rsr a;
    public final defpackage.rst b;
    public final defpackage.aoin c;
    public final defpackage.aogc d;
    private final defpackage.aozh e;
    private final defpackage.kkc f = defpackage.kkc.a;
    private final java.lang.String g = "marquee_integration";

    public rsq(defpackage.ipc ipcVar, defpackage.aoss aossVar, defpackage.rsr rsrVar, defpackage.aogc aogcVar, defpackage.rst rstVar, defpackage.aoin aoinVar) {
        this.a = rsrVar;
        this.d = aogcVar;
        this.b = rstVar;
        this.c = aoinVar;
        this.e = defpackage.aoov.as(new defpackage.fzh(ipcVar.a, 8), aossVar, new defpackage.aozg(5000L, Long.MAX_VALUE), defpackage.kkj.a);
    }

    @Override // defpackage.kkd
    public final defpackage.kkc a() {
        return this.f;
    }

    @Override // defpackage.kkd
    public final java.lang.String b() {
        return this.g;
    }

    @Override // defpackage.kkd
    public final defpackage.aozh c() {
        return this.e;
    }

    @Override // defpackage.kkd
    public final void d(defpackage.kkk kkkVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        defpackage.cbt cbtVar;
        if (kkkVar == null) {
            defpackage.aooh.i("data");
        }
        cavVar.u(-1598202615);
        if (kkkVar instanceof defpackage.kki) {
            android.view.View view = (android.view.View) cavVar.e(defpackage.dep.f);
            defpackage.agf agfVar = defpackage.rtn.a;
            defpackage.den.bz(z, null, defpackage.rtn.a, defpackage.rtn.b, null, defpackage.cfo.j(-1463618255, new defpackage.afd(kkkVar, this, view, cmwVar, 3), cavVar), cavVar, ((i >> 3) & 14) | 196608, 18);
            cbtVar = (defpackage.cbt) cavVar;
        } else {
            cbtVar = (defpackage.cbt) cavVar;
        }
        cbtVar.W(false);
    }
}
