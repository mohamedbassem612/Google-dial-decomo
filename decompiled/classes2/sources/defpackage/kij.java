package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kij implements kif {
    private final /* synthetic */ int $cid;

    public kij(int i) {
        this.$cid = i;
    }

    private static final aoiu c(defpackage.jvx jvxVar, int i) {
        if (new alam(jvxVar.c, defpackage.jvx.a).contains(defpackage.jvw.HD_PLUS)) {
            return new aoiu(2131231054, 2132017202);
        }
        if ((i & 4) == 4) {
            return new aoiu(2131231450, 2132017201);
        }
        return null;
    }

    public final defpackage.kie a(kiu kiuVar) {
        if (this.$cid == 0) {
            aooh.f(kiuVar, "row");
            defpackage.jvx jvxVar = kiuVar.F;
            if (jvxVar == null) {
                jvxVar = defpackage.jvx.b;
            }
            if (!new alam(jvxVar.c, defpackage.jvx.a).contains(defpackage.jvw.SHARED_DATA)) {
                return null;
            }
            defpackage.jhw jhwVarF = defpackage.hgt.F(defpackage.kie.a.m());
            jhwVarF.u(2131232010);
            jhwVarF.v(2);
            jhwVarF.t(2132017204);
            return jhwVarF.s();
        }
        aooh.f(kiuVar, "row");
        defpackage.jvx jvxVar2 = kiuVar.F;
        if (jvxVar2 == null) {
            jvxVar2 = defpackage.jvx.b;
        }
        aooh.e(jvxVar2, "getCallingNetworksAttributes(...)");
        aoiu aoiuVarC = c(jvxVar2, kiuVar.o);
        if (aoiuVarC == null) {
            return null;
        }
        int iIntValue = ((java.lang.Number) aoiuVarC.a).intValue();
        int iIntValue2 = ((java.lang.Number) aoiuVarC.b).intValue();
        defpackage.jhw jhwVarF2 = defpackage.hgt.F(defpackage.kie.a.m());
        jhwVarF2.u(iIntValue);
        jhwVarF2.v(2);
        jhwVarF2.t(iIntValue2);
        return jhwVarF2.s();
    }

    public final defpackage.kie b(defpackage.kip kipVar) {
        if (this.$cid == 0) {
            aooh.f(kipVar, "row");
            defpackage.jvx jvxVar = kipVar.q;
            if (jvxVar == null) {
                jvxVar = defpackage.jvx.b;
            }
            if (!new alam(jvxVar.c, defpackage.jvx.a).contains(defpackage.jvw.SHARED_DATA)) {
                return null;
            }
            defpackage.jhw jhwVarF = defpackage.hgt.F(defpackage.kie.a.m());
            jhwVarF.u(2131232010);
            jhwVarF.v(2);
            jhwVarF.t(2132017204);
            return jhwVarF.s();
        }
        aooh.f(kipVar, "row");
        defpackage.jvx jvxVar2 = kipVar.q;
        if (jvxVar2 == null) {
            jvxVar2 = defpackage.jvx.b;
        }
        aooh.e(jvxVar2, "getCallingNetworksAttributes(...)");
        aoiu aoiuVarC = c(jvxVar2, kipVar.f);
        if (aoiuVarC == null) {
            return null;
        }
        int iIntValue = ((java.lang.Number) aoiuVarC.a).intValue();
        int iIntValue2 = ((java.lang.Number) aoiuVarC.b).intValue();
        defpackage.jhw jhwVarF2 = defpackage.hgt.F(defpackage.kie.a.m());
        jhwVarF2.u(iIntValue);
        jhwVarF2.v(2);
        jhwVarF2.t(iIntValue2);
        return jhwVarF2.s();
    }
}
