package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kvm implements defpackage.kif {
    @Override // defpackage.kif
    public final kie a(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "row");
        defpackage.kui kuiVar = kiuVar.E;
        if (kuiVar == null) {
            kuiVar = defpackage.kui.a;
        }
        java.lang.String str = kuiVar.c;
        defpackage.aooh.e(str, "getCallRecordingFilePath(...)");
        if (str.length() <= 0) {
            return null;
        }
        jhw jhwVarF = hgt.F(kie.a.m());
        jhwVarF.u(2131231972);
        jhwVarF.v(4);
        jhwVarF.t(2132017195);
        return jhwVarF.s();
    }

    @Override // defpackage.kif
    public final /* synthetic */ kie b(kip kipVar) {
        defpackage.aooh.f(kipVar, "row");
        return null;
    }
}
