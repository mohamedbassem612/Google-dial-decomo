package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgf {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public tgf(az azVar, defpackage.thj thjVar, zzx zzxVar, aais aaisVar, aoin aoinVar, int i) {
        aooh.f(azVar, "activity");
        this.b = azVar;
        this.c = thjVar;
        this.d = aaisVar;
        this.e = aoinVar;
        this.a = 3;
        aihd aihdVarE = zzxVar.e();
        aooh.e(aihdVarE, "get(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aihdVarE, 10)), 16));
        for (java.lang.Object obj : aihdVarE) {
            linkedHashMap.put(((defpackage.teu) obj).b(), obj);
        }
        this.f = linkedHashMap;
    }

    public static final void d(android.view.View view) {
        java.lang.Object systemService = view.getContext().getSystemService("input_method");
        aooh.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void a(java.util.List list, defpackage.tfj tfjVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        defpackage.tgf tgfVar = this;
        defpackage.tfj tfjVar2 = tfjVar;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1898687944);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(tfjVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(tgfVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVar = cmw.c;
            cye cyeVarA = aww.a(awi.c, cmh.j, cavVarB, 0);
            cbt cbtVar = (cbt) cavVarB;
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVarB, cmwVar);
            aomy aomyVar = dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            aonn aonnVar = dam.e;
            cev.c(cavVarB, cyeVarA, aonnVar);
            aonn aonnVar2 = dam.d;
            cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            aonn aonnVar3 = dam.f;
            cev.c(cavVarB, numValueOf, aonnVar3);
            aonj aonjVar = dam.g;
            cev.b(cavVarB, aonjVar);
            aonn aonnVar4 = dam.c;
            cev.c(cavVarB, cmwVarM, aonnVar4);
            cavVarB.u(1375951002);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.tgw tgwVar = (defpackage.tgw) it.next();
                cmn cmnVar = cmh.n;
                int i4 = i2;
                cmw cmwVar2 = cmwVar;
                cmw cmwVarM2 = azm.m(azm.d(cmwVar, 1.0f), 0.0f, 48.0f, 1);
                boolean zD = cavVarB.D(tgfVar) | cavVarB.D(tgwVar);
                boolean z2 = (i4 & 112) == 32;
                java.lang.Object objR = cbtVar.R();
                if ((zD | z2) || objR == cau.a) {
                    objR = new obp(tgfVar, tgwVar, tfjVar2, 16);
                    cbtVar.ab(objR);
                }
                cmw cmwVarBj = den.bj(cmwVarM2, true, (java.lang.String) null, (dib) null, (aomy) objR);
                cye cyeVarA2 = azh.a(awi.a, cmnVar, cavVarB, 48);
                int iM2 = anty.M(cbtVar.x);
                cje cjeVarAi2 = cbtVar.ai();
                cmw cmwVarM3 = cfo.m(cavVarB, cmwVarBj);
                cavVarB.v();
                if (cbtVar.w) {
                    cavVarB.j(aomyVar);
                } else {
                    cavVarB.x();
                }
                cev.c(cavVarB, cyeVarA2, aonnVar);
                cev.c(cavVarB, cjeVarAi2, aonnVar2);
                cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
                cev.b(cavVarB, aonjVar);
                cev.c(cavVarB, cmwVarM3, aonnVar4);
                aonn aonnVar5 = aonnVar2;
                cbt cbtVar2 = cbtVar;
                aaoo.V(wv.k(tgwVar.a(), cavVarB, 0), (java.lang.String) null, den.aY(azm.g(den.ba(cmwVar2, 16.0f, 0.0f, 0.0f, 0.0f), 48.0f), 12.0f), den.ak(cavVarB).a, cavVarB, 392, 0);
                cav cavVar3 = cavVarB;
                abrz.k(tgwVar.b().toString(), den.aZ(cmwVar2, 16.0f, 0.0f), den.ak(cavVar3).a, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 1, 0, (aonj) null, den.an(cavVar3).j, cavVar3, 48, 24960, 110584);
                cbtVar2.W(true);
                z = true;
                cbtVar = cbtVar2;
                aomyVar = aomyVar;
                aonnVar2 = aonnVar5;
                cmwVar = cmwVar2;
                cavVarB = cavVar3;
                i2 = i4;
                aonnVar3 = aonnVar3;
                aonjVar = aonjVar;
                aonnVar = aonnVar;
                aonnVar4 = aonnVar4;
                tgfVar = this;
                tfjVar2 = tfjVar;
            }
            cbt cbtVar3 = cbtVar;
            cavVar2 = cavVarB;
            cbtVar3.W(false);
            cbtVar3.W(z);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(this, list, tfjVar, i, 13);
        }
    }

    public final void b(cmw cmwVar, cav cavVar, int i) {
        cmw cmwVar2;
        defpackage.ykp ykxVar;
        bbh bbhVar;
        final defpackage.tgf tgfVar = this;
        cbt cbtVarB = cavVar.b(-1665052600);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(tgfVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            java.lang.Object obj = tgfVar.c;
            aozh aozhVar = ((defpackage.thj) obj).k;
            cmw cmwVar3 = cmw.c;
            cer cerVarH = dzo.h(aozhVar, emq.e, cbtVarB, 384, 5);
            bbh bbhVarA = bbj.a(cbtVarB);
            java.util.List listBb = ajsz.bb(new java.lang.String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
            aooh.f(listBb, "permissions");
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj2 = cau.a;
            if (objR == obj2) {
                objR = new defpackage.xgn(20);
                cbtVar.ab(objR);
            }
            aonj aonjVar = (aonj) objR;
            aooh.f(listBb, "permissions");
            if (((java.lang.Boolean) cbtVarB.e(dfy.a)).booleanValue()) {
                cbtVarB.u(1200385232);
                cbtVar.W(false);
                ykxVar = new defpackage.ykx(listBb);
            } else {
                cbtVarB.u(1200388050);
                aooh.f(listBb, "permissions");
                android.content.Context context = (android.content.Context) cbtVarB.e(dep.b);
                aooh.f(context, "<this>");
                android.content.Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof android.content.ContextWrapper)) {
                        throw new java.lang.IllegalStateException("Permissions should be called in the context of an Activity");
                    }
                    if (baseContext instanceof android.app.Activity) {
                        android.app.Activity activity = (android.app.Activity) baseContext;
                        java.lang.Object objR2 = cbtVar.R();
                        java.lang.Object obj3 = objR2;
                        if (objR2 == obj2) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBb, 10));
                            java.util.Iterator it = listBb.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new defpackage.ykr((java.lang.String) it.next(), context, activity));
                            }
                            cbtVar.ab(arrayList);
                            obj3 = arrayList;
                        }
                        java.util.List list = (java.util.List) obj3;
                        cbtVarB.u(165094867);
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            defpackage.ykr ykrVar = (defpackage.ykr) it2.next();
                            java.util.Iterator it3 = it2;
                            cbtVar.Z(165096535, ykrVar.a, 0, (java.lang.Object) null);
                            pa paVar = new pa();
                            boolean zB = cbtVarB.B(ykrVar);
                            java.lang.Object objR3 = cbtVar.R();
                            if (zB || objR3 == obj2) {
                                objR3 = new defpackage.xms(ykrVar, 6);
                                cbtVar.ab(objR3);
                            }
                            nw nwVarBI = den.bI(paVar, (aonj) objR3, cbtVarB);
                            boolean zB2 = cbtVarB.B(ykrVar) | cbtVarB.D(nwVarBI);
                            java.lang.Object objR4 = cbtVar.R();
                            if (zB2 || objR4 == obj2) {
                                objR4 = new defpackage.yrz(1);
                                cbtVar.ab(objR4);
                            }
                            cbp.c(nwVarBI, (aonj) objR4, cbtVarB);
                            cbtVar.W(false);
                            it2 = it3;
                        }
                        cbtVar.W(false);
                        defpackage.xhp.x(list, null, cbtVarB, 0);
                        java.lang.Object objR5 = cbtVar.R();
                        if (objR5 == obj2) {
                            objR5 = new defpackage.ykq(list);
                            cbtVar.ab(objR5);
                        }
                        ykxVar = (defpackage.ykq) objR5;
                        oz ozVar = new oz();
                        boolean zB3 = cbtVarB.B(ykxVar) | cbtVarB.B(aonjVar);
                        java.lang.Object objR6 = cbtVar.R();
                        if (zB3 || objR6 == obj2) {
                            objR6 = new uph(ykxVar, aonjVar, 12, (byte[]) null);
                            cbtVar.ab(objR6);
                        }
                        nw nwVarBI2 = den.bI(ozVar, (aonj) objR6, cbtVarB);
                        boolean zB4 = cbtVarB.B(ykxVar) | cbtVarB.D(nwVarBI2);
                        java.lang.Object objR7 = cbtVar.R();
                        if (zB4 || objR7 == obj2) {
                            objR7 = new uph(ykxVar, nwVarBI2, 13);
                            cbtVar.ab(objR7);
                        }
                        cbp.b(ykxVar, nwVarBI2, (aonj) objR7, cbtVarB);
                        cbtVar.W(false);
                        break;
                    }
                    baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
                    aooh.e(baseContext, "getBaseContext(...)");
                    cmwVar3 = cmwVar3;
                    bbhVarA = bbhVarA;
                    cerVarH = cerVarH;
                }
            }
            final defpackage.ykp ykpVar = ykxVar;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(ykpVar.b());
            boolean zB5 = cbtVarB.B(ykpVar) | cbtVarB.D(tgfVar);
            java.lang.Object objR8 = cbtVar.R();
            if (zB5 || objR8 == obj2) {
                objR8 = new roz(ykpVar, tgfVar, (aoln) null, 11);
                cbtVar.ab(objR8);
            }
            cbp.g(boolValueOf, (aonn) objR8, cbtVarB);
            final android.view.View view = (android.view.View) cbtVarB.e(dep.f);
            gus.aH(bbhVarA, ruc.x, cbtVarB, 0);
            boolean zB6 = cbtVarB.B(bbhVarA) | cbtVarB.D(tgfVar) | cbtVarB.D(view);
            java.lang.Object objR9 = cbtVar.R();
            if (zB6 || objR9 == obj2) {
                bbhVar = bbhVarA;
                defpackage.rjk rjkVar = new defpackage.rjk(bbhVar, this, view, (aoln) null, 14);
                view = view;
                cbtVar.ab(rjkVar);
                objR9 = rjkVar;
            } else {
                bbhVar = bbhVarA;
            }
            cbp.g(bbhVar, (aonn) objR9, cbtVarB);
            cdj cdjVarB = defpackage.tgb.a.b(obj);
            final bbh bbhVar2 = bbhVar;
            final cmw cmwVar4 = cmwVar3;
            final cer cerVar = cerVarH;
            tgfVar = this;
            cmwVar2 = cmwVar4;
            den.ab(cdjVarB, cfo.j(-1175304952, new aonn() { // from class: tgd
                /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5) throws aois {
                    boolean z;
                    java.lang.String strF;
                    cav cavVar2 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    if (cavVar2.H((iIntValue & 3) != 2, iIntValue & 1)) {
                        defpackage.thd thdVar = (defpackage.thd) cerVar.a();
                        j$.util.Objects.checkIndex(0, 3);
                        if (thdVar != null) {
                            if (thdVar instanceof defpackage.tgz) {
                                defpackage.ykp ykpVar2 = ykpVar;
                                android.view.View view2 = view;
                                cavVar2.u(-936320933);
                                defpackage.tgf.d(view2);
                                java.lang.String strF2 = dfa.f(2132019477, cavVar2);
                                java.lang.String strF3 = dfa.f(2132019755, cavVar2);
                                boolean zB7 = cavVar2.B(ykpVar2);
                                java.lang.Object objG = cavVar2.g();
                                if (zB7 || objG == cau.a) {
                                    objG = new sky(ykpVar2, 7);
                                    cavVar2.w(objG);
                                }
                                mni.cn(strF2, (cmw) null, 2131951704, strF3, (aomy) objG, 0, cavVar2, 0);
                                cavVar2.o();
                            } else if (thdVar instanceof defpackage.tha) {
                                cavVar2.u(-935786958);
                                defpackage.tha thaVar = (defpackage.tha) thdVar;
                                int length = thaVar.a.a.length();
                                java.util.List list2 = thaVar.c;
                                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                                    java.util.Iterator it4 = list2.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                        if (!((defpackage.thb) it4.next()).b.isEmpty()) {
                                            z = true;
                                            break;
                                        }
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                                if (length == 0) {
                                    if (z) {
                                        cavVar2.u(763740389);
                                        strF = dfa.f(2132018225, cavVar2);
                                        cavVar2.o();
                                    } else {
                                        cavVar2.u(-2093640637);
                                        cavVar2.o();
                                        strF = null;
                                    }
                                } else if (z) {
                                    cavVar2.u(763744509);
                                    strF = dfa.f(2132020316, cavVar2);
                                    cavVar2.o();
                                } else {
                                    cavVar2.u(-2093640637);
                                    cavVar2.o();
                                    strF = null;
                                }
                                cmw cmwVarBp = den.bp(cmwVar4, den.ak(cavVar2).F);
                                boolean zB8 = cavVar2.B(strF) | cavVar2.D(thdVar);
                                java.lang.Object objG2 = cavVar2.g();
                                if (zB8 || objG2 == cau.a) {
                                    objG2 = new defpackage.slv(strF, thdVar, 4);
                                    cavVar2.w(objG2);
                                }
                                defpackage.tgf tgfVar2 = this.a;
                                cmw cmwVarX = den.x(dig.b(cmwVarBp, false, (aonj) objG2), "search_list");
                                awb awbVarF = awi.f(2.0f);
                                ayy ayyVarA = bab.a(new ayn(uu.i(cavVar2), 47), cavVar2);
                                boolean zD = cavVar2.D(thdVar) | cavVar2.D(tgfVar2);
                                java.lang.Object objG3 = cavVar2.g();
                                if (zD || objG3 == cau.a) {
                                    objG3 = new defpackage.slv(thdVar, tgfVar2, 5);
                                    cavVar2.w(objG3);
                                }
                                den.aM(cmwVarX, bbhVar2, ayyVarA, false, awbVarF, (cmi) null, (ars) null, false, (amn) null, (bdn) null, (aonj) objG3, cavVar2, 100687872, 0, 744);
                                cavVar2.o();
                            }
                        }
                        cavVar2.u(108344482);
                        cavVar2.o();
                        throw new aois();
                    }
                    cavVar2.s();
                    return aojh.a;
                }
            }, cbtVarB), cbtVarB, 48);
        } else {
            cbtVarB.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new slz(tgfVar, cmwVar2, i, 5);
        }
    }

    public final void c(java.lang.String str, cmw cmwVar, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        cmw cmwVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-1523353703);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmw cmwVar3 = cmw.c;
            dkz dkzVar = den.an(cavVarB).m;
            long j = den.ak(cavVarB).a;
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == cau.a) {
                objR = new defpackage.skk(16);
                cbtVar.ab(objR);
            }
            cavVar2 = cavVarB;
            abrz.k(str, den.ba(azm.o(azm.f(azm.d(dig.b(cmwVar3, false, (aonj) objR), 1.0f), 46.0f, Float.NaN), cmh.n, 2), 32.0f, 0.0f, 0.0f, 0.0f), j, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 1, 0, (aonj) null, dkzVar, cavVar2, i4 & 14, 24960, 110584);
            cmwVar2 = cmwVar3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(this, str, cmwVar2, i, 12);
        }
    }

    public final void e(java.lang.String str, int i) {
        aooh.f(str, "query");
        aooh.f(str, "newQuery");
        java.lang.Object obj = this.c;
        java.lang.String strJ = i == 2 ? vwb.j(((defpackage.thj) obj).b, str) : str;
        aozj aozjVar = ((defpackage.thj) obj).m;
        aooh.c(strJ);
        aozjVar.e(new defpackage.tei(strJ, i, str));
    }

    public final int f(int i) {
        return ((int[]) this.d)[i];
    }

    public final int g(int i, int i2, int i3) {
        return ((int[][][]) this.e)[i][i2][i3] & 7;
    }

    public final fhg h(int i) {
        return ((fhg[]) this.f)[i];
    }

    public tgf(int[] iArr, fhg[] fhgVarArr, int[] iArr2, int[][][] iArr3, fhg fhgVar) {
        this.d = iArr;
        this.f = fhgVarArr;
        this.e = iArr3;
        this.c = iArr2;
        this.b = fhgVar;
        this.a = iArr.length;
    }
}
