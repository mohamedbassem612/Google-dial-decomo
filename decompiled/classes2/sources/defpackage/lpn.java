package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lpn implements aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lpn(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r3v53, types: [ccp, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        j$.util.Optional optional;
        pdv pdvVar;
        switch (this.$cid) {
            case 0:
                cav cavVar = (cav) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    mni.ck((java.lang.String) this.b, this.a, (cmw) null, cavVar, 0);
                } else {
                    cavVar.s();
                }
                break;
            case 1:
                cav cavVar2 = (cav) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (cavVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    cmt cmtVar = cmw.c;
                    cmw cmwVarAY = den.aY(azm.d(cmtVar, 1.0f), 12.0f);
                    cye cyeVarA = azh.a(awi.a, cmh.n, cavVar2, 48);
                    int iM = anty.M(cavVar2.a());
                    cje cjeVarM = cavVar2.M();
                    cmw cmwVarM = cfo.m(cavVar2, cmwVarAY);
                    aomy aomyVar = dam.a;
                    cavVar2.L();
                    cavVar2.v();
                    if (cavVar2.F()) {
                        cavVar2.j(aomyVar);
                    } else {
                        cavVar2.x();
                    }
                    boolean z = this.a;
                    java.lang.Object obj3 = this.b;
                    cev.c(cavVar2, cyeVarA, dam.e);
                    cev.c(cavVar2, cjeVarM, dam.d);
                    cev.c(cavVar2, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar2, dam.g);
                    cev.c(cavVar2, cmwVarM, dam.c);
                    defpackage.mao maoVar = (defpackage.mao) obj3;
                    int i = maoVar.c;
                    azk azkVar = azk.a;
                    aaoo.V(wv.k(i, cavVar2, 0), (java.lang.String) null, azm.g(cmtVar, 24.0f), defpackage.jlr.e(den.ak(cavVar2).s, z), cavVar2, 56, 0);
                    den.aR(azm.k(cmtVar, 12.0f), cavVar2);
                    java.lang.String str = maoVar.a;
                    aooh.e(str, "label(...)");
                    abrz.k(str, den.ba(azkVar.a(cmtVar, 1.0f, true), 0.0f, 1.0f, 0.0f, 0.0f), 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 2, 0, (aonj) null, den.an(cavVar2).j, cavVar2, 0, 24960, 110588);
                    cavVar2.n();
                } else {
                    cavVar2.s();
                }
                break;
            case 2:
                cav cavVar3 = (cav) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (cavVar3.H((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    pbp pbpVar = (pbp) this.b;
                    pac pacVarB = pbpVar.b();
                    if (pacVarB != null && (optional = pacVarB.l) != null && (pdvVar = (pdv) aooh.q(optional)) != null) {
                        boolean z2 = this.a;
                        pbp.a.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setupBackgroundComposable$<anonymous>", 740, "AnswerFragmentPeer.kt").v("updating call background.");
                        if (pdvVar.b == 3 && ((java.lang.Boolean) pdvVar.c).booleanValue()) {
                            cavVar3.u(-747245902);
                            pbpVar.h(z2, cavVar3, 0);
                            cavVar3.o();
                        } else {
                            int i2 = pdvVar.b;
                            if (i2 == 2) {
                                cavVar3.u(-747242874);
                                pbpVar.g(pdvVar, z2, cavVar3, 0);
                                cavVar3.o();
                            } else if (i2 == 1) {
                                cavVar3.u(-747239866);
                                pbpVar.f(pdvVar, z2, cavVar3, 0);
                                cavVar3.o();
                            } else {
                                cavVar3.u(-1689540495);
                                cavVar3.o();
                            }
                        }
                    }
                } else {
                    cavVar3.s();
                }
                break;
            case 3:
                cav cavVar4 = (cav) obj;
                int iIntValue4 = ((java.lang.Integer) obj2).intValue();
                if (cavVar4.H((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    gus.aG(false, false, cfo.j(-769085593, new defpackage.lpn(this.b, this.a, 4), cavVar4), cavVar4, 384, 3);
                } else {
                    cavVar4.s();
                }
                break;
            case 4:
                cav cavVar5 = (cav) obj;
                int iIntValue5 = ((java.lang.Integer) obj2).intValue();
                if (cavVar5.H((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    java.lang.Object obj4 = this.b;
                    java.util.List listE = ((pbp) obj4).e();
                    boolean zD = cavVar5.D(obj4);
                    java.lang.Object objG = cavVar5.g();
                    if (zD || objG == cau.a) {
                        objG = new defpackage.opy(obj4, 5);
                        cavVar5.w(objG);
                    }
                    aonj aonjVar = (aonj) objG;
                    boolean zD2 = cavVar5.D(obj4);
                    java.lang.Object objG2 = cavVar5.g();
                    if (zD2 || objG2 == cau.a) {
                        objG2 = new defpackage.mtr(obj4, 20);
                        cavVar5.w(objG2);
                    }
                    aomy aomyVar2 = (aomy) objG2;
                    boolean zD3 = cavVar5.D(obj4);
                    java.lang.Object objG3 = cavVar5.g();
                    if (zD3 || objG3 == cau.a) {
                        objG3 = new defpackage.opy(obj4, 6);
                        cavVar5.w(objG3);
                    }
                    pez.q(new pbx(listE, aonjVar, aomyVar2, (aonj) objG3, this.a), (cmw) null, cavVar5, 0);
                } else {
                    cavVar5.s();
                }
                break;
            case 5:
                cav cavVar6 = (cav) obj;
                int iIntValue6 = ((java.lang.Integer) obj2).intValue();
                if (cavVar6.H((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    pez.bP((qxm) this.b, this.a, cavVar6, 0);
                } else {
                    cavVar6.s();
                }
                break;
            case 6:
                cav cavVar7 = (cav) obj;
                int iIntValue7 = ((java.lang.Integer) obj2).intValue();
                if (cavVar7.H((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    gus.aG(false, false, cfo.j(331117648, new defpackage.lpn(this.b, this.a, 7), cavVar7), cavVar7, 384, 3);
                } else {
                    cavVar7.s();
                }
                break;
            case 7:
                cav cavVar8 = (cav) obj;
                int iIntValue8 = ((java.lang.Integer) obj2).intValue();
                if (cavVar8.H((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    java.lang.Object obj5 = this.b;
                    java.lang.String strF = dfa.f(2132019046, cavVar8);
                    rdk rdkVar = (rdk) obj5;
                    tec tecVar = rdkVar.l;
                    boolean zA = tecVar.a(rdkVar.c.A());
                    java.lang.Object objG4 = cavVar8.g();
                    java.lang.Object obj6 = cau.a;
                    if (objG4 == obj6) {
                        ozh ozhVar = new ozh(rdkVar, strF, zA, 3);
                        ajxw ajxwVar = ceo.a;
                        cbk cbkVar = new cbk(ozhVar, (cen) null);
                        cavVar8.w(cbkVar);
                        objG4 = cbkVar;
                    }
                    cer cerVar = (cer) objG4;
                    android.content.Context context = (android.content.Context) cavVar8.e(dep.b);
                    boolean zB = cavVar8.B(context);
                    java.lang.Object objG5 = cavVar8.g();
                    if (zB || objG5 == obj6) {
                        objG5 = java.lang.Boolean.valueOf(tecVar.a(context));
                        cavVar8.w(objG5);
                    }
                    boolean zBooleanValue = ((java.lang.Boolean) objG5).booleanValue();
                    boolean zE = rdkVar.I.e();
                    java.lang.Object objG6 = cavVar8.g();
                    if (objG6 == obj6) {
                        rcy rcyVar = new rcy(zBooleanValue, zE, rdkVar);
                        ajxw ajxwVar2 = ceo.a;
                        cbk cbkVar2 = new cbk(rcyVar, (cen) null);
                        cavVar8.w(cbkVar2);
                        objG6 = cbkVar2;
                    }
                    cer cerVar2 = (cer) objG6;
                    boolean z3 = ((java.lang.Boolean) rdkVar.E.a()).booleanValue() || ((java.lang.Boolean) rdkVar.F.a()).booleanValue();
                    defpackage.gnk gnkVar = defpackage.ro.t(cavVar8).a;
                    qxl qxlVar = (qxl) cerVar.a();
                    java.util.List list = (java.util.List) cerVar2.a();
                    rcc rccVarD = rdkVar.d();
                    qxn qxnVar = new qxn(qxlVar, list, z3, this.a, rccVarD != null && rccVarD.f, rdkVar.r());
                    java.lang.Object objA = rdkVar.v.a();
                    aooh.e(objA, "get(...)");
                    boolean zBooleanValue2 = ((java.lang.Boolean) objA).booleanValue();
                    cavVar8.u(376512680);
                    cmw cmwVarL = cmw.c;
                    if (gnkVar.a()) {
                        cavVar8.u(-1953491360);
                        cavVar8.o();
                    } else {
                        cavVar8.u(-894299883);
                        int i3 = ((android.content.res.Configuration) cavVar8.e(dep.a)).orientation;
                        cavVar8.o();
                        if (i3 == 2) {
                            cmwVarL = uu.l(cmwVarL, new defpackage.ayn(uu.h(cavVar8), 9));
                        }
                    }
                    cavVar8.o();
                    pez.bL(qxnVar, zBooleanValue2, cmwVarL, cavVar8, 0);
                } else {
                    cavVar8.s();
                }
                break;
            case 8:
                cav cavVar9 = (cav) obj;
                int iIntValue9 = ((java.lang.Integer) obj2).intValue();
                if (cavVar9.H((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    ablb ablbVarU = aehj.U((ccp) this.b);
                    if (ablbVarU == null) {
                        cavVar9.u(-1590910280);
                        cavVar9.o();
                    } else {
                        boolean z4 = this.a;
                        cavVar9.u(-1590910279);
                        int i4 = !z4 ? 2 : ablbVarU.i;
                        defpackage.abja abjaVar = ablbVarU.a;
                        boolean z5 = ablbVarU.b;
                        java.lang.String str2 = ablbVarU.c;
                        java.lang.String str3 = ablbVarU.d;
                        java.util.List list2 = ablbVarU.e;
                        ablc ablcVar = ablbVarU.f;
                        abld abldVar = ablbVarU.g;
                        aooh.f(str2, "cardTitle");
                        aooh.f(str3, "cardDescription");
                        aehj.ag(new ablb(abjaVar, z5, str2, str3, list2, ablcVar, abldVar, true, i4), (cmw) null, cavVar9, 0);
                        cavVar9.o();
                    }
                } else {
                    cavVar9.s();
                }
                break;
            default:
                cav cavVar10 = (cav) obj;
                int iIntValue10 = ((java.lang.Integer) obj2).intValue();
                int i5 = iIntValue10 & 3;
                if (cavVar10.H(i5 != 2, iIntValue10 & 1)) {
                    abts.ai((defpackage.abja) this.b, this.a, cavVar10, 0);
                } else {
                    cavVar10.s();
                }
                break;
        }
        return aojh.a;
    }
}
