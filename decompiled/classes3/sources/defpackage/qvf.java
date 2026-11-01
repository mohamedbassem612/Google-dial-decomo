package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qvf implements defpackage.quq {
    private final /* synthetic */ int $cid;

    public qvf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.quq
    public final aw a() {
        int i = this.$cid;
        if (i == 0) {
            return pez.h();
        }
        if (i != 1) {
            defpackage.rhe rheVar = new defpackage.rhe();
            amxr.g(rheVar);
            return rheVar;
        }
        jtk jtkVar = new jtk();
        amxr.g(jtkVar);
        return jtkVar;
    }

    @Override // defpackage.quq
    public final defpackage.qun b() {
        int i = this.$cid;
        if (i == 0) {
            hgw hgwVarCi = pez.ci(defpackage.qun.a.m());
            hgwVarCi.O(pez.cj(defpackage.quk.a.m()).Q());
            return hgwVarCi.M();
        }
        if (i == 1) {
            hgw hgwVarCi2 = pez.ci(defpackage.qun.a.m());
            hgwVarCi2.O(pez.cj(defpackage.quk.a.m()).Q());
            return hgwVarCi2.M();
        }
        akzx akzxVarM = defpackage.qun.a.m();
        defpackage.quj qujVar = defpackage.quj.a;
        akzxVarM.u();
        defpackage.qun qunVar = (defpackage.qun) akzxVarM.b;
        j$.util.Objects.requireNonNull(qujVar);
        qunVar.c = qujVar;
        qunVar.b = 1;
        return (defpackage.qun) akzxVarM.p();
    }

    @Override // defpackage.quq
    public final defpackage.qup c() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? defpackage.qup.c : defpackage.qup.b;
        }
        return defpackage.qup.a;
    }

    @Override // defpackage.quq
    public final /* synthetic */ boolean d() {
        return true;
    }
}
