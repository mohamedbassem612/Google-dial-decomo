package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wai implements defpackage.waj {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;
    private final java.lang.Object b;

    public wai(aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        aooh.f(aoinVar, "enableAgenticCallScreen");
        aooh.f(aoinVar2, "gacsUseGeminiBranding");
        this.a = aoinVar;
        this.b = aoinVar2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0253  */
    /* JADX WARN: Type inference failed for: r0v21, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [aoin, java.lang.Object] */
    @Override // defpackage.waj
    public final java.lang.Object a(akzx akzxVar, aoln aolnVar) {
        defpackage.wah wahVar;
        aolu aoluVar;
        ajyi ajyiVar;
        java.lang.Object obj;
        irl irlVar;
        ajyi ajyiVar2;
        akzx akzxVar2;
        ajyi ajyiVar3;
        akzx akzxVar3;
        ajyi ajyiVar4;
        defpackage.wag wagVar;
        ajyi ajyiVar5;
        java.lang.Object obj2;
        mnp mnpVar;
        ajyi ajyiVar6;
        akzx akzxVar4;
        ajyi ajyiVar7;
        akzx akzxVar5;
        ajyi ajyiVar8;
        defpackage.wbz wbzVar;
        ajyi ajyiVar9;
        akzx akzxVar6;
        ajyi ajyiVar10;
        ajyi ajyiVar11;
        int i = this.$cid;
        if (i == 0) {
            if (aolnVar instanceof defpackage.wah) {
                wahVar = (defpackage.wah) aolnVar;
                int i2 = wahVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wahVar.e = i2 - Integer.MIN_VALUE;
                } else {
                    wahVar = new defpackage.wah(this, aolnVar);
                }
            } else {
                wahVar = new defpackage.wah(this, aolnVar);
            }
            java.lang.Object obj3 = wahVar.c;
            aoluVar = aolu.a;
            int i3 = wahVar.e;
            if (i3 != 0) {
                if (i3 == 1) {
                    akzx akzxVar7 = wahVar.f;
                    ajyiVar2 = wahVar.h;
                    ajyi ajyiVar12 = (ajyi) wahVar.b;
                    ajyiVar = wahVar.g;
                    irlVar = (irl) wahVar.a;
                    aooc.af(obj3);
                    akzxVar2 = akzxVar7;
                    ajyiVar3 = ajyiVar12;
                    obj = obj3;
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    akzxVar3 = (akzx) wahVar.b;
                    ajyiVar3 = wahVar.g;
                    ajyiVar4 = (ajyi) wahVar.a;
                    aooc.af(obj3);
                }
                boolean zBooleanValue = ((java.lang.Boolean) obj3).booleanValue();
                akzx akzxVar8 = (akzx) ajyiVar3.a;
                akzxVar8.u();
                defpackage.amsy amsyVar = (defpackage.amsy) akzxVar8.b;
                defpackage.amsy amsyVar2 = defpackage.amsy.a;
                amsyVar.b |= 8;
                amsyVar.f = zBooleanValue;
                akzxVar = akzxVar3;
                ajyiVar = ajyiVar4;
                alad aladVarP = ((akzx) ajyiVar.a).p();
                aooh.e(aladVarP, "build(...)");
                defpackage.amsy amsyVar3 = (defpackage.amsy) aladVarP;
                akzxVar.u();
                defpackage.amtd amtdVar = (defpackage.amtd) akzxVar.b;
                defpackage.amtd amtdVar2 = defpackage.amtd.a;
                j$.util.Objects.requireNonNull(amsyVar3);
                amtdVar.e = amsyVar3;
                amtdVar.b |= 4;
                return aojh.a;
            }
            aooc.af(obj3);
            j$.util.Optional optionalG = ((zjm) this.b).g();
            aooh.e(optionalG, "getFeature(...)");
            irl irlVar2 = (irl) aooh.q(optionalG);
            akzx akzxVarM = defpackage.amsy.a.m();
            aooh.f(akzxVarM, "builder");
            ajyiVar = new ajyi(akzxVarM);
            java.lang.Object obj4 = this.a;
            java.lang.Object obj5 = ajyiVar.a;
            iqp iqpVar = (iqp) obj4;
            boolean zC = iqpVar.c();
            akzx akzxVar9 = (akzx) obj5;
            akzxVar9.u();
            defpackage.amsy amsyVar4 = (defpackage.amsy) akzxVar9.b;
            amsyVar4.b |= 1;
            amsyVar4.c = zC;
            boolean zA = iqpVar.a();
            akzxVar9.u();
            defpackage.amsy amsyVar5 = (defpackage.amsy) akzxVar9.b;
            amsyVar5.b |= 2;
            amsyVar5.d = zA;
            if (irlVar2 != null) {
                wahVar.a = irlVar2;
                wahVar.g = ajyiVar;
                wahVar.b = ajyiVar;
                wahVar.h = ajyiVar;
                wahVar.f = akzxVar;
                wahVar.e = 1;
                java.lang.Object objA = irlVar2.c.a(wahVar);
                if (objA != aoluVar) {
                    obj = objA;
                    irlVar = irlVar2;
                    ajyiVar2 = ajyiVar;
                    akzxVar2 = akzxVar;
                    ajyiVar3 = ajyiVar2;
                }
            }
            alad aladVarP2 = ((akzx) ajyiVar.a).p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.amsy amsyVar6 = (defpackage.amsy) aladVarP2;
            akzxVar.u();
            defpackage.amtd amtdVar3 = (defpackage.amtd) akzxVar.b;
            defpackage.amtd amtdVar4 = defpackage.amtd.a;
            j$.util.Objects.requireNonNull(amsyVar6);
            amtdVar3.e = amsyVar6;
            amtdVar3.b |= 4;
            return aojh.a;
            boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
            akzx akzxVar10 = (akzx) ajyiVar2.a;
            akzxVar10.u();
            defpackage.amsy amsyVar7 = (defpackage.amsy) akzxVar10.b;
            defpackage.amsy amsyVar8 = defpackage.amsy.a;
            amsyVar7.b |= 4;
            amsyVar7.e = zBooleanValue2;
            wahVar.a = ajyiVar;
            wahVar.g = ajyiVar3;
            wahVar.b = akzxVar2;
            wahVar.h = null;
            wahVar.f = null;
            wahVar.e = 2;
            java.lang.Object objD = irlVar.d(wahVar);
            if (objD != aoluVar) {
                akzx akzxVar11 = akzxVar2;
                obj3 = objD;
                akzxVar3 = akzxVar11;
                ajyiVar4 = ajyiVar;
                boolean zBooleanValue3 = ((java.lang.Boolean) obj3).booleanValue();
                akzx akzxVar12 = (akzx) ajyiVar3.a;
                akzxVar12.u();
                defpackage.amsy amsyVar9 = (defpackage.amsy) akzxVar12.b;
                defpackage.amsy amsyVar10 = defpackage.amsy.a;
                amsyVar9.b |= 8;
                amsyVar9.f = zBooleanValue3;
                akzxVar = akzxVar3;
                ajyiVar = ajyiVar4;
                alad aladVarP3 = ((akzx) ajyiVar.a).p();
                aooh.e(aladVarP3, "build(...)");
                defpackage.amsy amsyVar11 = (defpackage.amsy) aladVarP3;
                akzxVar.u();
                defpackage.amtd amtdVar5 = (defpackage.amtd) akzxVar.b;
                defpackage.amtd amtdVar6 = defpackage.amtd.a;
                j$.util.Objects.requireNonNull(amsyVar11);
                amtdVar5.e = amsyVar11;
                amtdVar5.b |= 4;
                return aojh.a;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    akzx akzxVarM2 = defpackage.amsz.a.m();
                    aooh.f(akzxVarM2, "builder");
                    boolean z = false;
                    if (((java.lang.Boolean) this.a.a()).booleanValue() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
                        z = true;
                    }
                    akzxVarM2.u();
                    defpackage.amsz amszVar = (defpackage.amsz) akzxVarM2.b;
                    amszVar.b |= 1;
                    amszVar.c = z;
                    alad aladVarP4 = akzxVarM2.p();
                    aooh.e(aladVarP4, "build(...)");
                    defpackage.amsz amszVar2 = (defpackage.amsz) aladVarP4;
                    akzxVar.u();
                    defpackage.amtd amtdVar7 = (defpackage.amtd) akzxVar.b;
                    defpackage.amtd amtdVar8 = defpackage.amtd.a;
                    j$.util.Objects.requireNonNull(amszVar2);
                    amtdVar7.h = amszVar2;
                    amtdVar7.b |= 32;
                    return aojh.a;
                }
                if (aolnVar instanceof defpackage.wbz) {
                    wbzVar = (defpackage.wbz) aolnVar;
                    int i4 = wbzVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        wbzVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        wbzVar = new defpackage.wbz(this, aolnVar);
                    }
                } else {
                    wbzVar = new defpackage.wbz(this, aolnVar);
                }
                java.lang.Object objAw = wbzVar.a;
                aolu aoluVar2 = aolu.a;
                int i5 = wbzVar.b;
                if (i5 == 0) {
                    aooc.af(objAw);
                    j$.util.Optional optionalG2 = ((zjm) this.b).g();
                    aooh.e(optionalG2, "getFeature(...)");
                    tkl tklVar = (tkl) aooh.q(optionalG2);
                    akzx akzxVarM3 = defpackage.amta.a.m();
                    aooh.f(akzxVarM3, "builder");
                    ajyiVar9 = new ajyi(akzxVarM3);
                    java.lang.Object obj6 = this.a;
                    java.lang.Object obj7 = ajyiVar9.a;
                    boolean zA2 = ((defpackage.wby) obj6).a();
                    akzx akzxVar13 = (akzx) obj7;
                    akzxVar13.u();
                    defpackage.amta amtaVar = (defpackage.amta) akzxVar13.b;
                    amtaVar.b |= 1;
                    amtaVar.c = zA2;
                    if (tklVar != null) {
                        wbzVar.e = ajyiVar9;
                        wbzVar.f = ajyiVar9;
                        wbzVar.c = akzxVar;
                        wbzVar.b = 1;
                        objAw = ((aogc) tklVar.c).aw(wbzVar);
                        if (objAw == aoluVar2) {
                            return aoluVar2;
                        }
                        akzxVar6 = akzxVar;
                        ajyiVar10 = ajyiVar9;
                        ajyiVar11 = ajyiVar10;
                    }
                    alad aladVarP5 = ((akzx) ajyiVar9.a).p();
                    aooh.e(aladVarP5, "build(...)");
                    defpackage.amta amtaVar2 = (defpackage.amta) aladVarP5;
                    akzxVar.u();
                    defpackage.amtd amtdVar9 = (defpackage.amtd) akzxVar.b;
                    defpackage.amtd amtdVar10 = defpackage.amtd.a;
                    j$.util.Objects.requireNonNull(amtaVar2);
                    amtdVar9.d = amtaVar2;
                    amtdVar9.b |= 2;
                    return aojh.a;
                }
                if (i5 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                akzxVar6 = wbzVar.c;
                ajyiVar10 = wbzVar.f;
                ajyiVar11 = wbzVar.e;
                aooc.af(objAw);
                boolean zBooleanValue4 = ((java.lang.Boolean) objAw).booleanValue();
                akzx akzxVar14 = (akzx) ajyiVar10.a;
                akzxVar14.u();
                defpackage.amta amtaVar3 = (defpackage.amta) akzxVar14.b;
                defpackage.amta amtaVar4 = defpackage.amta.a;
                amtaVar3.b |= 2;
                amtaVar3.d = zBooleanValue4;
                akzxVar = akzxVar6;
                ajyiVar9 = ajyiVar11;
                alad aladVarP6 = ((akzx) ajyiVar9.a).p();
                aooh.e(aladVarP6, "build(...)");
                defpackage.amta amtaVar5 = (defpackage.amta) aladVarP6;
                akzxVar.u();
                defpackage.amtd amtdVar11 = (defpackage.amtd) akzxVar.b;
                defpackage.amtd amtdVar12 = defpackage.amtd.a;
                j$.util.Objects.requireNonNull(amtaVar5);
                amtdVar11.d = amtaVar5;
                amtdVar11.b |= 2;
                return aojh.a;
            }
            if (aolnVar instanceof defpackage.wag) {
                wagVar = (defpackage.wag) aolnVar;
                int i6 = wagVar.d;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    wagVar.d = i6 - Integer.MIN_VALUE;
                } else {
                    wagVar = new defpackage.wag(this, aolnVar);
                }
            } else {
                wagVar = new defpackage.wag(this, aolnVar);
            }
            java.lang.Object obj8 = wagVar.c;
            aoluVar = aolu.a;
            int i7 = wagVar.d;
            if (i7 != 0) {
                if (i7 == 1) {
                    akzx akzxVar15 = wagVar.e;
                    ajyiVar6 = wagVar.h;
                    ajyi ajyiVar13 = (ajyi) wagVar.b;
                    ajyiVar5 = wagVar.g;
                    mnpVar = (mnp) wagVar.a;
                    aooc.af(obj8);
                    akzxVar4 = akzxVar15;
                    ajyiVar7 = ajyiVar13;
                    obj2 = obj8;
                } else {
                    if (i7 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    akzxVar5 = (akzx) wagVar.b;
                    ajyiVar7 = wagVar.g;
                    ajyiVar8 = (ajyi) wagVar.a;
                    aooc.af(obj8);
                }
                boolean zBooleanValue5 = ((java.lang.Boolean) obj8).booleanValue();
                akzx akzxVar16 = (akzx) ajyiVar7.a;
                akzxVar16.u();
                defpackage.amsx amsxVar = (defpackage.amsx) akzxVar16.b;
                defpackage.amsx amsxVar2 = defpackage.amsx.a;
                amsxVar.b |= 4;
                amsxVar.e = zBooleanValue5;
                akzxVar = akzxVar5;
                ajyiVar5 = ajyiVar8;
                alad aladVarP7 = ((akzx) ajyiVar5.a).p();
                aooh.e(aladVarP7, "build(...)");
                defpackage.amsx amsxVar3 = (defpackage.amsx) aladVarP7;
                akzxVar.u();
                defpackage.amtd amtdVar13 = (defpackage.amtd) akzxVar.b;
                defpackage.amtd amtdVar14 = defpackage.amtd.a;
                j$.util.Objects.requireNonNull(amsxVar3);
                amtdVar13.c = amsxVar3;
                amtdVar13.b |= 1;
                return aojh.a;
            }
            aooc.af(obj8);
            j$.util.Optional optionalG3 = ((zjm) this.b).g();
            aooh.e(optionalG3, "getFeature(...)");
            mnp mnpVar2 = (mnp) aooh.q(optionalG3);
            akzx akzxVarM4 = defpackage.amsx.a.m();
            aooh.f(akzxVarM4, "builder");
            ajyiVar5 = new ajyi(akzxVarM4);
            java.lang.Object obj9 = this.a;
            java.lang.Object obj10 = ajyiVar5.a;
            boolean zA3 = ((defpackage.wae) obj9).a();
            akzx akzxVar17 = (akzx) obj10;
            akzxVar17.u();
            defpackage.amsx amsxVar4 = (defpackage.amsx) akzxVar17.b;
            amsxVar4.b |= 1;
            amsxVar4.c = zA3;
            if (mnpVar2 != null) {
                wagVar.a = mnpVar2;
                wagVar.g = ajyiVar5;
                wagVar.b = ajyiVar5;
                wagVar.h = ajyiVar5;
                wagVar.e = akzxVar;
                wagVar.d = 1;
                java.lang.Object objA2 = mnpVar2.a.a(wagVar);
                if (objA2 != aoluVar) {
                    obj2 = objA2;
                    mnpVar = mnpVar2;
                    ajyiVar6 = ajyiVar5;
                    akzxVar4 = akzxVar;
                    ajyiVar7 = ajyiVar6;
                }
            }
            alad aladVarP8 = ((akzx) ajyiVar5.a).p();
            aooh.e(aladVarP8, "build(...)");
            defpackage.amsx amsxVar5 = (defpackage.amsx) aladVarP8;
            akzxVar.u();
            defpackage.amtd amtdVar15 = (defpackage.amtd) akzxVar.b;
            defpackage.amtd amtdVar16 = defpackage.amtd.a;
            j$.util.Objects.requireNonNull(amsxVar5);
            amtdVar15.c = amsxVar5;
            amtdVar15.b |= 1;
            return aojh.a;
            boolean zBooleanValue6 = ((java.lang.Boolean) obj2).booleanValue();
            akzx akzxVar18 = (akzx) ajyiVar6.a;
            akzxVar18.u();
            defpackage.amsx amsxVar6 = (defpackage.amsx) akzxVar18.b;
            defpackage.amsx amsxVar7 = defpackage.amsx.a;
            amsxVar6.b |= 2;
            amsxVar6.d = zBooleanValue6;
            wagVar.a = ajyiVar5;
            wagVar.g = ajyiVar7;
            wagVar.b = akzxVar4;
            wagVar.h = null;
            wagVar.e = null;
            wagVar.d = 2;
            java.lang.Object objE = mnpVar.b.e(wagVar);
            if (objE != aoluVar) {
                akzx akzxVar19 = akzxVar4;
                obj8 = objE;
                akzxVar5 = akzxVar19;
                ajyiVar8 = ajyiVar5;
                boolean zBooleanValue7 = ((java.lang.Boolean) obj8).booleanValue();
                akzx akzxVar110 = (akzx) ajyiVar7.a;
                akzxVar110.u();
                defpackage.amsx amsxVar8 = (defpackage.amsx) akzxVar110.b;
                defpackage.amsx amsxVar9 = defpackage.amsx.a;
                amsxVar8.b |= 4;
                amsxVar8.e = zBooleanValue7;
                akzxVar = akzxVar5;
                ajyiVar5 = ajyiVar8;
                alad aladVarP9 = ((akzx) ajyiVar5.a).p();
                aooh.e(aladVarP9, "build(...)");
                defpackage.amsx amsxVar10 = (defpackage.amsx) aladVarP9;
                akzxVar.u();
                defpackage.amtd amtdVar17 = (defpackage.amtd) akzxVar.b;
                defpackage.amtd amtdVar18 = defpackage.amtd.a;
                j$.util.Objects.requireNonNull(amsxVar10);
                amtdVar17.c = amsxVar10;
                amtdVar17.b |= 1;
                return aojh.a;
            }
        }
        return aoluVar;
    }

    public wai(java.lang.Object obj, zjm zjmVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = zjmVar;
    }
}
