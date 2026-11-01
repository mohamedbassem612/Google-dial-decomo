package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wwk implements defpackage.wvu {
    public static final defpackage.wxf a;
    public final defpackage.uss b;

    static {
        akzx akzxVarM = defpackage.wxf.a.m();
        java.util.List list = (java.util.List) j$.util.DesugarArrays.stream(defpackage.wxk.values()).map(new defpackage.vun(20)).collect(j$.util.stream.Collectors.toCollection(new defpackage.vjq(17)));
        akzxVarM.u();
        defpackage.wxf wxfVar = (defpackage.wxf) akzxVarM.b;
        alat alatVar = wxfVar.b;
        if (!alatVar.c()) {
            wxfVar.b = alad.J(alatVar);
        }
        akyl.i(list, wxfVar.b);
        a = (defpackage.wxf) akzxVarM.p();
    }

    public wwk(defpackage.uss ussVar) {
        this.b = ussVar;
    }
}
