package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class smc implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ smc(defpackage.skf skfVar, boolean z, defpackage.smu smuVar, int i) {
        this.$cid = i;
        this.b = skfVar;
        this.a = z;
        this.c = smuVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        cmw cmwVarC;
        boolean z;
        int i = this.$cid;
        int i2 = 7;
        if (i == 0) {
            cav cavVar = (cav) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            int i3 = iIntValue & 3;
            int i4 = iIntValue & 1;
            java.util.List list = defpackage.sme.a;
            if (cavVar.H(i3 != 2, i4)) {
                java.lang.Object obj3 = this.b;
                cmw cmwVarX = den.x(cmw.c, "onboarding_flow_editor_container_measurement");
                float f = defpackage.smf.a;
                float f2 = defpackage.smf.i;
                defpackage.skf skfVar = (defpackage.skf) obj3;
                float f3 = skfVar.m ? 0.0f : defpackage.smf.j;
                boolean z2 = this.a;
                cmw cmwVarBa = den.ba(cmwVarX, 0.0f, f2, 0.0f, f3);
                boolean zC = cavVar.C(z2);
                java.lang.Object objG = cavVar.g();
                if (zC || objG == cau.a) {
                    objG = new skg(z2, 7);
                    cavVar.w(objG);
                }
                defpackage.sme.m(skfVar, (defpackage.smu) this.c, dig.b(cmwVarBa, false, (aonj) objG), cavVar, 0);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        if (i != 1) {
            cav cavVar2 = (cav) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                boolean z3 = this.a;
                cmw cmwVarG = azm.g(cmw.c, 16.0f);
                long j = den.ak(cavVar2).a;
                if (z3) {
                    defpackage.afpl afplVar = ((defpackage.abom) this.b).c;
                    if (afplVar != null) {
                        java.lang.Object obj4 = this.c;
                        aooh.f(obj4, "key");
                        if (afplVar.b.contains(obj4)) {
                            z = false;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                abts.w(2131951623, j, cmwVarG, 0, z, cavVar2, 384, 8);
            } else {
                cavVar2.s();
            }
            return aojh.a;
        }
        cav cavVar3 = (cav) obj;
        int iIntValue3 = ((java.lang.Integer) obj2).intValue();
        int i5 = iIntValue3 & 3;
        int i6 = iIntValue3 & 1;
        java.util.List list2 = defpackage.sme.a;
        if (cavVar3.H(i5 != 2, i6)) {
            final boolean z4 = this.a;
            java.lang.Object obj5 = this.b;
            ajl ajlVarB = den.al(cavVar3).b();
            if (z4) {
                cmt cmtVar = cmw.c;
                float f4 = defpackage.smf.a;
                cmwVarC = azm.d(bac.a(den.ba(cmtVar, 0.0f, 0.0f, 0.0f, defpackage.smf.j)), 1.0f);
            } else {
                cmwVarC = azm.c(cmw.c, 1.0f);
            }
            cmw cmwVar = cmwVarC;
            final defpackage.skf skfVar2 = (defpackage.skf) obj5;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(skfVar2.a);
            boolean zD = cavVar3.D(ajlVarB);
            java.lang.Object objG2 = cavVar3.g();
            if (zD || objG2 == cau.a) {
                objG2 = new defpackage.skx(ajlVarB, i2);
                cavVar3.w(objG2);
            }
            final defpackage.ske skeVar = skfVar2.b;
            final defpackage.smu smuVar = (defpackage.smu) this.c;
            uu.a(numValueOf, cmwVar, (aonj) objG2, (cmj) null, (java.lang.String) null, (aonj) null, cfo.j(-1389205938, new aonp() { // from class: slw
                /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                /* JADX WARN: Code duplicated, block: B:32:0x008c  */
                public final java.lang.Object a(java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) throws aois {
                    defpackage.sko skoVar;
                    cmw cmwVarC2;
                    java.lang.Object next;
                    int iIntValue4 = ((java.lang.Integer) obj7).intValue();
                    cav cavVar4 = (cav) obj8;
                    int iIntValue5 = ((java.lang.Integer) obj9).intValue();
                    java.util.List list3 = defpackage.sme.a;
                    aooh.f((aer) obj6, "$this$AnimatedContent");
                    if ((iIntValue5 & 48) == 0) {
                        iIntValue5 |= true != cavVar4.z(iIntValue4) ? 16 : 32;
                    }
                    if (cavVar4.H((iIntValue5 & 145) != 144, iIntValue5 & 1)) {
                        defpackage.smu smuVar2 = smuVar;
                        defpackage.skf skfVar3 = skfVar2;
                        defpackage.ske skeVar2 = skeVar;
                        boolean z5 = z4;
                        int iOrdinal = ((defpackage.slm) defpackage.sme.a.get(iIntValue4)).ordinal();
                        if (iOrdinal == 0) {
                            cavVar4.u(707927255);
                            defpackage.sme.j(z5 ? azm.d(cmw.c, 1.0f) : azm.c(cmw.c, 1.0f), new defpackage.slg(snl.g(skeVar2), skfVar3.d, skfVar3.m), smuVar2, cavVar4, 0);
                            cavVar4.o();
                        } else {
                            if (iOrdinal != 1) {
                                cavVar4.u(707925346);
                                cavVar4.o();
                                throw new aois();
                            }
                            cavVar4.u(471514012);
                            boolean z6 = skeVar2 instanceof defpackage.skd;
                            java.lang.Integer numValueOf2 = null;
                            if (z6) {
                                defpackage.skd skdVar = (defpackage.skd) skeVar2;
                                if (skdVar.e != null) {
                                    java.util.Iterator it = defpackage.sjz.b.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!aooh.n(((defpackage.sjz) next).c, skdVar.e));
                                    defpackage.sjz sjzVar = (defpackage.sjz) next;
                                    if (sjzVar != null) {
                                        skoVar = sjzVar.c;
                                    } else {
                                        skoVar = null;
                                    }
                                } else {
                                    skoVar = null;
                                }
                            } else {
                                skoVar = null;
                            }
                            if (z5) {
                                cmt cmtVar2 = cmw.c;
                                float f5 = defpackage.smf.a;
                                cmwVarC2 = azm.d(azm.e(cmtVar2, defpackage.smf.k), 1.0f);
                            } else {
                                cmwVarC2 = azm.c(cmw.c, 1.0f);
                            }
                            if (z6) {
                                numValueOf2 = java.lang.Integer.valueOf(skfVar3.g ? ((defpackage.skd) skeVar2).d : ((defpackage.skd) skeVar2).c);
                            }
                            defpackage.sme.l(cmwVarC2, new defpackage.slq(numValueOf2, skoVar, skfVar3.f), smuVar2, skfVar3, cavVar4, 0);
                            cavVar4.o();
                        }
                    } else {
                        cavVar4.s();
                    }
                    return aojh.a;
                }
            }, cavVar3), cavVar3, 1572864, 56);
        } else {
            cavVar3.s();
        }
        return aojh.a;
    }

    public /* synthetic */ smc(boolean z, defpackage.abom abomVar, java.lang.String str, int i) {
        this.$cid = i;
        this.a = z;
        this.b = abomVar;
        this.c = str;
    }
}
