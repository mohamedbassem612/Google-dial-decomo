package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jdd implements defpackage.kif {
    private final defpackage.isj a;
    private final defpackage.rsr b;

    public jdd(defpackage.isj isjVar, defpackage.rsr rsrVar) {
        defpackage.aooh.f(isjVar, "beeslyCallLogDataIntegration");
        this.a = isjVar;
        this.b = rsrVar;
    }

    @Override // defpackage.kif
    public final kie a(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "row");
        if (!hgz.aa(kiuVar, this.a, this.b)) {
            return null;
        }
        jhw jhwVarF = hgt.F(kie.a.m());
        jhwVarF.u(2131231357);
        jhwVarF.v(2);
        jhwVarF.t(2132017194);
        return jhwVarF.s();
    }

    @Override // defpackage.kif
    public final /* synthetic */ kie b(kip kipVar) {
        defpackage.aooh.f(kipVar, "row");
        return null;
    }
}
