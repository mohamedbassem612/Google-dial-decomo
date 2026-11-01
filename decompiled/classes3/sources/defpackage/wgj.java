package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wgj implements kif {
    private final /* synthetic */ int $cid;
    private final sou a;

    public wgj(sou souVar, int i) {
        this.$cid = i;
        aooh.f(souVar, "phoneAccountInfoFetcher");
        this.a = souVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    private static final aoiu c(int i, jvx jvxVar, defpackage.sot sotVar) {
        int i2;
        if ((i & 8) != 8 && !new alam(jvxVar.c, jvx.a).contains(jvw.b)) {
            i2 = 1;
        } else if (sotVar == null) {
            i2 = 2;
        } else if (new alam(jvxVar.c, jvx.a).contains(jvw.f)) {
            jvy jvyVar = sotVar.f;
            if (jvyVar == null) {
                jvyVar = jvy.a;
            }
            if (true == jvyVar.f) {
                i2 = 3;
            } else {
                i2 = 2;
            }
        } else {
            jvy jvyVar2 = sotVar.f;
            if (jvyVar2 == null) {
                jvyVar2 = jvy.a;
            }
            int iAQ = a.aQ(jvyVar2.d);
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i3 = iAQ - 1;
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 != 2) {
                i2 = 2;
            } else {
                i2 = 5;
            }
        }
        int i4 = i2 - 1;
        if (i4 == 1) {
            return new aoiu(2131231676, 2132017212);
        }
        if (i4 == 2) {
            return new aoiu(2131231109, 2132017207);
        }
        if (i4 == 3) {
            return new aoiu(2131231112, 2132017209);
        }
        if (i4 != 4) {
            return null;
        }
        return new aoiu(2131231114, 2132017211);
    }

    private static final aoiu d(int i, jvx jvxVar, defpackage.sot sotVar) {
        if (((i & 64) == 64 || new alam(jvxVar.c, jvx.a).contains(jvw.c)) && sotVar != null) {
            jvy jvyVar = sotVar.f;
            if (jvyVar == null) {
                jvyVar = jvy.a;
            }
            int iAQ = a.aQ(jvyVar.e);
            if (iAQ != 0 && iAQ != 1) {
                if ((i & 1) == 1) {
                    return new aoiu(2131231108, 2132017206);
                }
                jvy jvyVar2 = sotVar.f;
                if (jvyVar2 == null) {
                    jvyVar2 = jvy.a;
                }
                int iAQ2 = a.aQ(jvyVar2.e);
                if (iAQ2 == 0) {
                    iAQ2 = 1;
                }
                int i2 = iAQ2 - 1;
                if (i2 == 1) {
                    return new aoiu(2131231111, 2132017208);
                }
                if (i2 == 2) {
                    return new aoiu(2131231113, 2132017210);
                }
            }
        }
        return null;
    }

    public final kie a(kiu kiuVar) {
        if (this.$cid != 0) {
            aooh.f(kiuVar, "row");
            int i = kiuVar.o;
            jvx jvxVar = kiuVar.F;
            if (jvxVar == null) {
                jvxVar = jvx.b;
            }
            aooh.e(jvxVar, "getCallingNetworksAttributes(...)");
            aoiu aoiuVarD = d(i, jvxVar, (defpackage.sot) this.a.b(kiuVar.m, kiuVar.n).orElse((java.lang.Object) null));
            if (aoiuVarD == null) {
                return null;
            }
            int iIntValue = ((java.lang.Number) aoiuVarD.a).intValue();
            int iIntValue2 = ((java.lang.Number) aoiuVarD.b).intValue();
            jhw jhwVarF = hgt.F(kie.a.m());
            jhwVarF.u(iIntValue);
            jhwVarF.v(2);
            jhwVarF.t(iIntValue2);
            return jhwVarF.s();
        }
        aooh.f(kiuVar, "row");
        int i2 = kiuVar.o;
        jvx jvxVar2 = kiuVar.F;
        if (jvxVar2 == null) {
            jvxVar2 = jvx.b;
        }
        aooh.e(jvxVar2, "getCallingNetworksAttributes(...)");
        aoiu aoiuVarC = c(i2, jvxVar2, (defpackage.sot) this.a.b(kiuVar.m, kiuVar.n).orElse((java.lang.Object) null));
        if (aoiuVarC == null) {
            return null;
        }
        int iIntValue3 = ((java.lang.Number) aoiuVarC.a).intValue();
        int iIntValue4 = ((java.lang.Number) aoiuVarC.b).intValue();
        jhw jhwVarF2 = hgt.F(kie.a.m());
        jhwVarF2.u(iIntValue3);
        jhwVarF2.v(2);
        jhwVarF2.t(iIntValue4);
        return jhwVarF2.s();
    }

    public final kie b(kip kipVar) {
        if (this.$cid != 0) {
            aooh.f(kipVar, "row");
            int i = kipVar.f;
            jvx jvxVar = kipVar.q;
            if (jvxVar == null) {
                jvxVar = jvx.b;
            }
            aooh.e(jvxVar, "getCallingNetworksAttributes(...)");
            aoiu aoiuVarD = d(i, jvxVar, (defpackage.sot) this.a.b(kipVar.j, kipVar.k).orElse((java.lang.Object) null));
            if (aoiuVarD == null) {
                return null;
            }
            int iIntValue = ((java.lang.Number) aoiuVarD.a).intValue();
            int iIntValue2 = ((java.lang.Number) aoiuVarD.b).intValue();
            jhw jhwVarF = hgt.F(kie.a.m());
            jhwVarF.u(iIntValue);
            jhwVarF.v(2);
            jhwVarF.t(iIntValue2);
            return jhwVarF.s();
        }
        aooh.f(kipVar, "row");
        int i2 = kipVar.f;
        jvx jvxVar2 = kipVar.q;
        if (jvxVar2 == null) {
            jvxVar2 = jvx.b;
        }
        aooh.e(jvxVar2, "getCallingNetworksAttributes(...)");
        aoiu aoiuVarC = c(i2, jvxVar2, (defpackage.sot) this.a.b(kipVar.j, kipVar.k).orElse((java.lang.Object) null));
        if (aoiuVarC == null) {
            return null;
        }
        int iIntValue3 = ((java.lang.Number) aoiuVarC.a).intValue();
        int iIntValue4 = ((java.lang.Number) aoiuVarC.b).intValue();
        jhw jhwVarF2 = hgt.F(kie.a.m());
        jhwVarF2.u(iIntValue3);
        jhwVarF2.v(2);
        jhwVarF2.t(iIntValue4);
        return jhwVarF2.s();
    }

    public wgj(sou souVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(souVar, "phoneAccountInfoFetcher");
        this.a = souVar;
    }
}
