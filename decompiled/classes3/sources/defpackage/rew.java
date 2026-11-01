package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rew implements defpackage.quq {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aoin a;
    final /* synthetic */ aoin b;

    public rew(aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        this.a = aoinVar;
        this.b = aoinVar2;
    }

    @Override // defpackage.quq
    public final aw a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? defpackage.rge.s() : defpackage.rge.s();
        }
        return defpackage.rge.s();
    }

    @Override // defpackage.quq
    public final defpackage.qun b() {
        int i = this.$cid;
        if (i == 0) {
            hgw hgwVarCi = pez.ci(defpackage.qun.a.m());
            hgw hgwVarCh = pez.ch(defpackage.qul.a.m());
            hgwVarCh.K("atlas_xatu");
            java.lang.Object objA = this.a.a();
            aooh.e(objA, "get(...)");
            hgwVarCh.I(((java.lang.Number) objA).longValue());
            java.lang.Object objA2 = this.b.a();
            aooh.e(objA2, "get(...)");
            hgwVarCh.J(((java.lang.Number) objA2).longValue());
            hgwVarCh.L(qbc.mm);
            hgwVarCi.P(hgwVarCh.H());
            return hgwVarCi.M();
        }
        if (i != 1) {
            hgw hgwVarCi2 = pez.ci(defpackage.qun.a.m());
            hgw hgwVarCh2 = pez.ch(defpackage.qul.a.m());
            hgwVarCh2.K("xatu");
            java.lang.Object objA3 = this.a.a();
            aooh.e(objA3, "get(...)");
            hgwVarCh2.I(((java.lang.Number) objA3).longValue());
            java.lang.Object objA4 = this.b.a();
            aooh.e(objA4, "get(...)");
            hgwVarCh2.J(((java.lang.Number) objA4).longValue());
            hgwVarCh2.L(qbc.mn);
            hgwVarCi2.P(hgwVarCh2.H());
            return hgwVarCi2.M();
        }
        hgw hgwVarCi3 = pez.ci(defpackage.qun.a.m());
        hgw hgwVarCh3 = pez.ch(defpackage.qul.a.m());
        hgwVarCh3.K("atlas");
        java.lang.Object objA5 = this.a.a();
        aooh.e(objA5, "get(...)");
        hgwVarCh3.I(((java.lang.Number) objA5).longValue());
        java.lang.Object objA6 = this.b.a();
        aooh.e(objA6, "get(...)");
        hgwVarCh3.J(((java.lang.Number) objA6).longValue());
        hgwVarCh3.L(qbc.ml);
        hgwVarCi3.P(hgwVarCh3.H());
        return hgwVarCi3.M();
    }

    @Override // defpackage.quq
    public final defpackage.qup c() {
        if (this.$cid != 0) {
        }
        return defpackage.qup.b;
    }

    @Override // defpackage.quq
    public final /* synthetic */ boolean d() {
        return true;
    }
}
