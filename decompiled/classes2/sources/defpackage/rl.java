package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class rl {
    public static java.util.Map a(android.app.appsearch.GetSchemaResponse getSchemaResponse) {
        java.util.Map mapM = mp$.ExternalSyntheticApiModelOutline1.m(getSchemaResponse);
        if (mapM.isEmpty()) {
            return java.util.Collections.EMPTY_MAP;
        }
        aca acaVar = new aca(mapM.size());
        for (java.util.Map.Entry entry : mapM.entrySet()) {
            acaVar.put((java.lang.String) entry.getKey(), new defpackage.qf(mp$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline0.m(entry.getValue())), mp$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline0.m(entry.getValue()))));
        }
        return acaVar;
    }

    public static java.util.Map b(android.app.appsearch.GetSchemaResponse getSchemaResponse) {
        java.util.Map mapM$1 = mp$.ExternalSyntheticApiModelOutline1.m$1(getSchemaResponse);
        if (mapM$1.isEmpty()) {
            return java.util.Collections.EMPTY_MAP;
        }
        aca acaVar = new aca(mapM$1.size());
        for (java.util.Map.Entry entry : mapM$1.entrySet()) {
            acc accVar = new acc(((java.util.Set) entry.getValue()).size());
            java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                android.app.appsearch.SchemaVisibilityConfig schemaVisibilityConfigM = mp$.ExternalSyntheticApiModelOutline1.m(it.next());
                dzk.x(schemaVisibilityConfigM);
                defpackage.qj qjVar = new defpackage.qj();
                java.util.List listM = mp$.ExternalSyntheticApiModelOutline1.m(schemaVisibilityConfigM);
                for (int i = 0; i < listM.size(); i++) {
                    qjVar.b(new defpackage.qf(mp$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline0.m(listM.get(i))), mp$.ExternalSyntheticApiModelOutline0.m(mp$.ExternalSyntheticApiModelOutline0.m(listM.get(i)))));
                }
                java.util.Iterator it2 = mp$.ExternalSyntheticApiModelOutline1.m(schemaVisibilityConfigM).iterator();
                while (it2.hasNext()) {
                    qjVar.c((java.util.Set) it2.next());
                }
                android.app.appsearch.PackageIdentifier packageIdentifierM = mp$.ExternalSyntheticApiModelOutline1.m(schemaVisibilityConfigM);
                if (packageIdentifierM != null) {
                    qjVar.d(new defpackage.qf(mp$.ExternalSyntheticApiModelOutline0.m(packageIdentifierM), mp$.ExternalSyntheticApiModelOutline0.m(packageIdentifierM)));
                }
                accVar.add(qjVar.a());
            }
            acaVar.put((java.lang.String) entry.getKey(), accVar);
        }
        return acaVar;
    }

    public static android.app.appsearch.SearchSpec c(android.content.Context context, defpackage.qt qtVar, defpackage.rf rfVar) {
        dzk.x(qtVar);
        android.app.appsearch.SearchSpec.Builder builder = new android.app.appsearch.SearchSpec.Builder();
        java.lang.String str = qtVar.n;
        int i = qtVar.d;
        rk$.ExternalSyntheticApiModelOutline0.m(builder, 0);
        android.app.appsearch.SearchSpec.Builder builderM$2 = rk$.ExternalSyntheticApiModelOutline0.m$2(rk$.ExternalSyntheticApiModelOutline0.m$2(rk$.ExternalSyntheticApiModelOutline0.m$1(rk$.ExternalSyntheticApiModelOutline0.m(rk$.ExternalSyntheticApiModelOutline0.m$1(builder, qtVar.a), qtVar.c()), qtVar.a()), qtVar.b()), qtVar.c);
        int i2 = qtVar.e;
        rk$.ExternalSyntheticApiModelOutline0.m$6(rk$.ExternalSyntheticApiModelOutline0.m$5(rk$.ExternalSyntheticApiModelOutline0.m$4(rk$.ExternalSyntheticApiModelOutline0.m$3(builderM$2, 0), qtVar.f), qtVar.g), qtVar.h);
        if (qtVar.j != 0) {
            rk$.ExternalSyntheticApiModelOutline0.m(builder, 1, qtVar.k);
        }
        int i3 = dwz.a;
        if (i3 >= 7) {
            for (java.util.Map.Entry entry : qtVar.e().entrySet()) {
                rk$.ExternalSyntheticApiModelOutline0.m(builder, (java.lang.String) entry.getKey(), (java.util.Collection) entry.getValue());
            }
        }
        if (!qtVar.f().isEmpty()) {
            if (i3 < 7) {
                throw new java.lang.UnsupportedOperationException("Property weights are not supported with this backend/Android API level combination.");
            }
            defpackage.ry.c(builder, qtVar.f());
        }
        if (!qtVar.o.isEmpty()) {
            if (qtVar.j() || qtVar.l() || qtVar.i()) {
                if (i3 < 7) {
                    throw new java.lang.UnsupportedOperationException("Advanced query features (NUMERIC_SEARCH, VERBATIM_SEARCH and LIST_FILTER_QUERY_LANGUAGE) are not supported with this backend/Android API level combination.");
                }
                defpackage.ry.a(builder, qtVar);
            }
            if (qtVar.g()) {
                if (i3 < 13) {
                    throw new java.lang.UnsupportedOperationException("LIST_FILTER_HAS_PROPERTY_FUNCTION is not available on this AppSearch implementation.");
                }
                rz.b(builder, qtVar);
            }
            if (qtVar.h()) {
                if (i3 < 17) {
                    throw new java.lang.UnsupportedOperationException("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION is not available on this AppSearch implementation.");
                }
                defpackage.rx.c(builder, qtVar);
            }
        }
        java.util.List list = qtVar.q;
        if (!list.isEmpty()) {
            if (android.os.Build.VERSION.SDK_INT < 36) {
                throw new java.lang.UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
            }
            defpackage.rw.a(builder, list, rfVar);
            defpackage.rw.b(builder, qtVar.r);
        }
        if (!qtVar.t.isEmpty()) {
            throw new java.lang.UnsupportedOperationException("SEARCH_SPEC_SEARCH_STRING_PARAMETERS is not available on this AppSearch implementation.");
        }
        if (qtVar.w != 10) {
            throw new java.lang.UnsupportedOperationException("SCHEMA_EMBEDDING_APPROXIMATE_NEAREST_NEIGHBOR is not available on this AppSearch implementation.");
        }
        defpackage.qe qeVar = qtVar.m;
        if (qeVar != null) {
            if (i3 < 7) {
                throw new java.lang.UnsupportedOperationException("JoinSpec is not available on this AppSearch implementation.");
            }
            defpackage.ry.b(context, builder, qeVar, rfVar);
        }
        if (!qtVar.d().isEmpty()) {
            if (i3 < 13) {
                throw new java.lang.UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_PROPERTIES is not available on this AppSearch implementation.");
            }
            rz.a(builder, qtVar.d());
        }
        java.lang.String str2 = qtVar.p;
        java.util.List list2 = qtVar.s;
        if (!list2.isEmpty()) {
            if (i3 < 17) {
                throw new java.lang.UnsupportedOperationException("SEARCH_SPEC_ADD_INFORMATIONAL_RANKING_EXPRESSIONS are not available on this AppSearch implementation.");
            }
            defpackage.rx.b(builder, list2);
        }
        java.util.List list3 = qtVar.u;
        if (!list3.isEmpty()) {
            if (i3 < 17) {
                throw new java.lang.UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_DOCUMENT_IDS is not available on this AppSearch implementation.");
            }
            defpackage.rx.a(builder, list3);
        }
        if (qtVar.k()) {
            if (i3 < 17) {
                throw new java.lang.UnsupportedOperationException("SCHEMA_SCORABLE_PROPERTY_CONFIG is not available on this AppSearch implementation.");
            }
            defpackage.rx.d(builder, qtVar.k());
        }
        return rk$.ExternalSyntheticApiModelOutline0.m(builder);
    }

    public static final int d(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            return q(i2, i3, z);
        }
        boolean z2 = !z;
        if (r(i, i2, i3, z2)) {
            return p(i, i2, z);
        }
        return r(i, i2, i3, z) ? p(i, i2, z2) : q(i2, i3, z2);
    }

    public static final defpackage.aon e(cav cavVar, int i) {
        int i2 = (i & 14) ^ 6;
        java.lang.Object[] objArr = new java.lang.Object[0];
        ckb ckbVar = defpackage.aon.a;
        boolean z = true;
        if ((i2 <= 4 || !cavVar.z(0)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object objG = cavVar.g();
        if (z || objG == cau.a) {
            objG = new nu(10);
            cavVar.w(objG);
        }
        return (defpackage.aon) cfd.n(objArr, ckbVar, (aomy) objG, cavVar, 0);
    }

    public static final cmw f(cmw cmwVar, defpackage.aon aonVar, boolean z) {
        aso asoVar = z ? aso.a : aso.b;
        return den.bh(cmwVar, asoVar).a(new aoo(aonVar, asoVar, true, false, (ars) null, aonVar.g, (aqb) null, true, (amn) null)).a(new defpackage.aoq(aonVar, z));
    }

    public static final boolean g(long j) {
        if (anty.ah(j, cfd.M(0))) {
            return false;
        }
        float[] fArr = crp.a;
        csb csbVar = crp.y[(int) (63 & j)];
        long j2 = ((crn) csbVar).b;
        if (j2 != 12884901888L) {
            cqp.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(crm.a(j2)));
        }
        if (csbVar == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        }
        cru cruVar = csbVar.p;
        float fA = (float) ((cruVar.a(cqg.d(j)) * 0.2126d) + (cruVar.a(cqg.c(j)) * 0.7152d) + (cruVar.a(cqg.b(j)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            fA = 1.0f;
        }
        return ((double) fA) <= 0.5d;
    }

    public static final void h(final aomy aomyVar, long j, final defpackage.brt brtVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        defpackage.brt brtVar2;
        cbt cbtVar;
        final java.lang.Enum r6;
        char c;
        int i3;
        java.lang.Object obj;
        int i4;
        long j2 = j;
        int i5 = i & 6;
        cbt cbtVarB = cavVar.b(-85756322);
        if (i5 == 0) {
            i2 = (true != cbtVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.A(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            brtVar2 = brtVar;
            i2 |= true != cbtVarB.B(brtVar2) ? 128 : 256;
        } else {
            brtVar2 = brtVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cbtVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cbt cbtVar2 = cbtVarB;
            cbtVar2.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            android.view.View view = (android.view.View) cbtVarB.e(dep.f);
            dpf dpfVar = (dpf) cbtVarB.e(dfo.e);
            java.lang.Enum r15 = (dpq) cbtVarB.e(dfo.j);
            caz cazVarC = cbtVarB.c();
            cer cerVarG = cdh.g(aonnVar, cbtVarB);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object objR = cbtVar2.R();
            java.lang.Object obj2 = cau.a;
            if (objR == obj2) {
                objR = new defpackage.bmt(3);
                cbtVar2.ab(objR);
            }
            java.util.UUID uuid = (java.util.UUID) cfd.m(objArr, (aomy) objR, cbtVarB, 48);
            boolean zB = cbtVarB.B(view) | cbtVarB.B(dpfVar);
            java.lang.Object objR2 = cbtVar2.R();
            if (zB || objR2 == obj2) {
                cbtVar = cbtVar2;
                r6 = r15;
                c = 256;
                defpackage.brq brqVar = new defpackage.brq(aomyVar, brtVar2, j2, view, r6, dpfVar, uuid);
                j2 = j2;
                i3 = 1;
                brqVar.a.c(cazVarC, new cja(1379699857, true, new brg(cerVarG, 2)));
                cbtVar.ab(brqVar);
                obj = brqVar;
            } else {
                cbtVar = cbtVar2;
                r6 = r15;
                i3 = 1;
                c = 256;
                obj = objR2;
            }
            final defpackage.brq brqVar2 = (defpackage.brq) obj;
            boolean zD = cbtVarB.D(brqVar2);
            java.lang.Object objR3 = cbtVar.R();
            if (zD || objR3 == obj2) {
                i4 = 0;
                objR3 = new defpackage.bru(brqVar2, i4);
                cbtVar.ab(objR3);
            } else {
                i4 = 0;
            }
            cbp.c(brqVar2, (aonj) objR3, cbtVarB);
            int i6 = (cbtVarB.D(brqVar2) ? 1 : 0) | ((i2 & 14) == 4 ? i3 : i4) | ((i2 & 896) == c ? i3 : i4) | (((((i2 & 112) ^ 48) <= 32 || !cbtVarB.A(j2)) && (i2 & 48) != 32) ? i4 : i3) | (cbtVarB.z(r6.ordinal()) ? 1 : 0);
            java.lang.Object objR4 = cbtVar.R();
            if (i6 != 0 || objR4 == obj2) {
                final long j3 = j2;
                objR4 = new aomy() { // from class: brv
                    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                    public final java.lang.Object a() throws aois {
                        brqVar2.a(aomyVar, brtVar, j3, r6);
                        return aojh.a;
                    }
                };
                cbtVar.ab(objR4);
            }
            cbtVarB.r((aomy) objR4);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bpy(aomyVar, j, brtVar, aonnVar, i, 3);
        }
    }

    public static final void i(final aomy aomyVar, final cmw cmwVar, final defpackage.btt bttVar, final float f, final boolean z, final crd crdVar, final long j, final long j2, final float f2, final long j3, final aonn aonnVar, final aonn aonnVar2, final defpackage.brt brtVar, final aono aonoVar, cav cavVar, final int i, final int i2) {
        int i3;
        crd crdVar2;
        int i4;
        float f3;
        aonn aonnVar3;
        int i5;
        aono aonoVar2;
        cav cavVar2;
        java.lang.Object obj;
        aoss aossVar;
        int i6;
        defpackage.btt bttVar2;
        cbt cbtVar;
        int i7 = i & 6;
        cav cavVarB = cavVar.b(1904798512);
        if (i7 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(bttVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.y(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            crdVar2 = crdVar;
            i3 |= true != cavVarB.B(crdVar2) ? 65536 : 131072;
        } else {
            crdVar2 = crdVar;
        }
        if ((1572864 & i) == 0) {
            i4 = i3 | (true != cavVarB.A(j) ? 524288 : 1048576);
        } else {
            i4 = i3;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != cavVarB.A(j2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            f3 = f2;
            i4 |= true != cavVarB.y(f3) ? 33554432 : 67108864;
        } else {
            f3 = f2;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != cavVarB.A(j3) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            aonnVar3 = aonnVar;
            i5 = (true != cavVarB.D(aonnVar3) ? 2 : 4) | i2;
        } else {
            aonnVar3 = aonnVar;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != cavVarB.D(aonnVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != cavVarB.B(brtVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            aonoVar2 = aonoVar;
            i5 |= true != cavVarB.D(aonoVar2) ? 1024 : 2048;
        } else {
            aonoVar2 = aonoVar;
        }
        int i8 = i5;
        if (cavVarB.H(((306783379 & i4) == 306783378 && (i8 & 1171) == 1170) ? false : true, i4 & 1)) {
            cbt cbtVar2 = (cbt) cavVarB;
            cbtVar2.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            java.lang.Object objR = cbtVar2.R();
            java.lang.Object obj2 = cau.a;
            if (objR == obj2) {
                objR = cbp.a(aols.a, cavVarB);
                cbtVar2.ab(objR);
            }
            int i9 = (i4 & 896) ^ 384;
            aoss aossVar2 = (aoss) objR;
            boolean zD = ((i9 > 256 && cavVarB.B(bttVar)) || (i4 & 384) == 256) | cavVarB.D(aossVar2);
            boolean z2 = (i4 & 14) == 4;
            java.lang.Object objR2 = cbtVar2.R();
            if ((zD || z2) || objR2 == obj2) {
                obj = obj2;
                aossVar = aossVar2;
                i6 = i9;
                bttVar2 = bttVar;
                objR2 = new defpackage.af((java.lang.Object) bttVar2, (java.lang.Object) aossVar, (java.lang.Object) aomyVar, 8, (byte[]) null);
                cbtVar2.ab(objR2);
            } else {
                bttVar2 = bttVar;
                aossVar = aossVar2;
                obj = obj2;
                i6 = i9;
            }
            final aomy aomyVar2 = (aomy) objR2;
            boolean zD2 = ((i6 > 256 && cavVarB.B(bttVar2)) || (i4 & 384) == 256) | cavVarB.D(aossVar);
            java.lang.Object objR3 = cbtVar2.R();
            if ((zD2 | z2) || objR3 == obj) {
                defpackage.af afVar = new defpackage.af((java.lang.Object) bttVar2, (java.lang.Object) aossVar, (java.lang.Object) aomyVar, 9, (byte[]) null);
                cbtVar2.ab(afVar);
                objR3 = afVar;
            }
            java.lang.Object obj3 = obj;
            int i10 = i6;
            int i11 = i4;
            final float f4 = f3;
            final aonn aonnVar4 = aonnVar3;
            final crd crdVar3 = crdVar2;
            final aono aonoVar3 = aonoVar2;
            cavVar2 = cavVarB;
            h((aomy) objR3, j2, brtVar, cfo.j(-1328793519, new aonn() { // from class: brr
                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5) {
                    cav cavVar3 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    int i12 = iIntValue & 3;
                    if (cavVar3.H(i12 != 2, iIntValue & 1)) {
                        cmw cmwVarC = azm.c(cmw.c, 1.0f);
                        java.lang.Object objG = cavVar3.g();
                        java.lang.Object obj6 = cau.a;
                        if (objG == obj6) {
                            objG = new defpackage.bpr(8);
                            cavVar3.w(objG);
                        }
                        cmw cmwVarB = dig.b(cmwVarC, false, (aonj) objG);
                        cye cyeVarB = awo.b(cmh.a, false);
                        int iM = anty.M(cavVar3.a());
                        cje cjeVarM = cavVar3.M();
                        cmw cmwVarM = cfo.m(cavVar3, cmwVarB);
                        aomy aomyVar3 = dam.a;
                        cavVar3.L();
                        cavVar3.v();
                        if (cavVar3.F()) {
                            cavVar3.j(aomyVar3);
                        } else {
                            cavVar3.x();
                        }
                        defpackage.btt bttVar3 = bttVar;
                        cev.c(cavVar3, cyeVarB, dam.e);
                        cev.c(cavVar3, cjeVarM, dam.d);
                        cev.c(cavVar3, java.lang.Integer.valueOf(iM), dam.f);
                        cev.b(cavVar3, dam.g);
                        cev.c(cavVar3, cmwVarM, dam.c);
                        awt awtVar = awt.a;
                        boolean zB = cavVar3.B(bttVar3);
                        java.lang.Object objG2 = cavVar3.g();
                        if (zB || objG2 == obj6) {
                            objG2 = new defpackage.btv(bttVar3);
                            cavVar3.w(objG2);
                        }
                        defpackage.btv btvVar = (defpackage.btv) objG2;
                        java.lang.Object objG3 = cavVar3.g();
                        if (objG3 == obj6) {
                            defpackage.bll bllVar = new defpackage.bll(bttVar3, 19);
                            ajxw ajxwVar = ceo.a;
                            cbk cbkVar = new cbk(bllVar, (cen) null);
                            cavVar3.w(cbkVar);
                            objG3 = cbkVar;
                        }
                        cer cerVarB = aim.b(true != a.y((cer) objG3) ? 0.0f : 1.0f, den.ai(3, cavVar3), "ScrimAlphaAnimation", cavVar3, 3072, 20);
                        java.lang.String strAe = den.ae(2132018029, cavVar3);
                        boolean zB2 = cavVar3.B(cerVarB);
                        java.lang.Object objG4 = cavVar3.g();
                        if (zB2 || objG4 == obj6) {
                            objG4 = new defpackage.bll(cerVarB, 20);
                            cavVar3.w(objG4);
                        }
                        aono aonoVar4 = aonoVar3;
                        float f5 = f4;
                        long j4 = j2;
                        long j5 = j;
                        crd crdVar4 = crdVar3;
                        aonn aonnVar5 = aonnVar2;
                        aonn aonnVar6 = aonnVar4;
                        boolean z3 = z;
                        float f6 = f;
                        aomy aomyVar4 = aomyVar;
                        cmw cmwVar2 = cmwVar;
                        defpackage.rm.s(strAe, null, aomyVar2, (aomy) objG4, j3, cavVar3, 0);
                        pf.e(uu.l(awtVar.a(cmwVar2, cmh.b), btvVar), bttVar3, aomyVar4, f6, z3, aonnVar6, aonnVar5, crdVar4, j5, j4, f5, aonoVar4, cavVar3, 0, 0);
                        cavVar3.n();
                    } else {
                        cavVar3.s();
                    }
                    return aojh.a;
                }
            }, cavVar2), cavVar2, ((i11 >> 18) & 112) | 3072 | (i8 & 896));
            if (bttVar.d.p().g(defpackage.btu.b)) {
                cavVar2.u(748189566);
                boolean z3 = (i10 > 256 && cavVar2.B(bttVar)) || (i11 & 384) == 256;
                java.lang.Object objR4 = cbtVar2.R();
                if (z3 || objR4 == obj3) {
                    objR4 = new defpackage.bgx(bttVar, (aoln) null, 12, (byte[][]) null);
                    cbtVar = cbtVar2;
                    cbtVar.ab(objR4);
                } else {
                    cbtVar = cbtVar2;
                }
                cbp.g(bttVar, (aonn) objR4, cavVar2);
                cbtVar.W(false);
            } else {
                cavVar2.u(748547058);
                cbtVar2.W(false);
            }
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: brs
                public final java.lang.Object a(java.lang.Object obj4, java.lang.Object obj5) {
                    ((java.lang.Integer) obj5).intValue();
                    aomy aomyVar3 = aomyVar;
                    cmw cmwVar2 = cmwVar;
                    defpackage.btt bttVar3 = bttVar;
                    float f5 = f;
                    boolean z4 = z;
                    crd crdVar4 = crdVar;
                    long j4 = j;
                    long j5 = j2;
                    float f6 = f2;
                    long j6 = j3;
                    int i12 = i;
                    aonn aonnVar5 = aonnVar;
                    int i13 = i2;
                    int i14 = i12 | 1;
                    int i15 = i13 & 306783378;
                    int i16 = i14 & 306783378;
                    int i17 = i16 << 1;
                    defpackage.brt brtVar2 = brtVar;
                    int i18 = i13 & 613566756;
                    int i19 = i14 & 613566756;
                    aono aonoVar4 = aonoVar;
                    defpackage.rl.i(aomyVar3, cmwVar2, bttVar3, f5, z4, crdVar4, j4, j5, f6, j6, aonnVar5, aonnVar2, brtVar2, aonoVar4, (cav) obj4, (i14 & (-920350135)) | i16 | (i19 >> 1) | (i17 & i19), (i13 & (-920350135)) | i15 | (i18 >> 1) | ((i15 << 1) & i18));
                    return aojh.a;
                }
            };
        }
    }

    public static final defpackage.btt j(boolean z, cav cavVar, int i) {
        java.lang.Object objG = cavVar.g();
        if (objG == cau.a) {
            objG = new defpackage.bpr(7);
            cavVar.w(objG);
        }
        int i2 = ((i & 1) ^ 1) & (z ? 1 : 0);
        aonj aonjVar = (aonj) objG;
        defpackage.btu btuVar = defpackage.btu.a;
        return defpackage.bto.b(i2 != 0 ? ajsz.cW(new defpackage.btu[]{btuVar, defpackage.btu.b}) : ajsz.cW(new defpackage.btu[]{btuVar, defpackage.btu.c, defpackage.btu.b}), aonjVar, btuVar, cavVar, 196992, 24);
    }

    public static /* synthetic */ defpackage.ely k(java.util.List list, int i, boolean z, int i2) {
        char c;
        long j;
        java.util.List listAX;
        float fFloatValue;
        long j2 = (i2 & 4) != 0 ? 4539628425446424576L : 0L;
        int i3 = 0;
        char c2 = ' ';
        if (((i2 & 8) == 0) && z) {
            aokv aokvVar = new aokv(10);
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                defpackage.bqs bqsVar = (defpackage.bqs) list.get(i4);
                defpackage.elk elkVar = defpackage.bqt.a;
                long jAM = mni.aM(bqsVar.a, j2);
                arrayList.add(java.lang.Float.valueOf((((float) java.lang.Math.atan2(java.lang.Float.intBitsToFloat((int) (jAM & 4294967295L)), java.lang.Float.intBitsToFloat((int) (jAM >> 32)))) * 180.0f) / 3.1415927f));
            }
            float f = 3.1415927f;
            j = 4294967295L;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList2.add(java.lang.Float.valueOf(cpm.a(mni.aM(((defpackage.bqs) list.get(i5)).a, j2))));
            }
            int i6 = i << 1;
            float f2 = 360.0f / i6;
            int i7 = 0;
            while (i7 < i6) {
                aopp aoppVarA = ajsz.bf(list).a();
                while (aoppVarA.a) {
                    int iA = aoppVarA.a();
                    int i8 = i7 % 2;
                    if (i8 != 0) {
                        iA = ajsz.aZ(list) - iA;
                    }
                    if (iA <= 0) {
                        if (i8 == 0) {
                            i8 = i3;
                        }
                    }
                    defpackage.elk elkVar2 = defpackage.bqt.a;
                    float f3 = f;
                    float f4 = i7 * f2;
                    if (i8 == 0) {
                        fFloatValue = ((java.lang.Number) arrayList.get(iA)).floatValue();
                    } else {
                        float fFloatValue2 = f2 - ((java.lang.Number) arrayList.get(iA)).floatValue();
                        float fFloatValue3 = ((java.lang.Number) arrayList.get(i3)).floatValue();
                        fFloatValue = fFloatValue2 + fFloatValue3 + fFloatValue3;
                    }
                    float f5 = (f4 + fFloatValue) / 360.0f;
                    char c3 = c2;
                    double d = (f5 + f5) * f3;
                    java.util.ArrayList arrayList3 = arrayList2;
                    aokvVar.add(new defpackage.bqs(mni.bl(mni.bm((((long) java.lang.Float.floatToRawIntBits((float) java.lang.Math.cos(d))) << c3) | (((long) java.lang.Float.floatToRawIntBits((float) java.lang.Math.sin(d))) & 4294967295L), ((java.lang.Number) arrayList3.get(iA)).floatValue()), j2), ((defpackage.bqs) list.get(iA)).b));
                    arrayList2 = arrayList3;
                    f = f3;
                    c2 = c3;
                    i3 = 0;
                }
                i7++;
                f = f;
                i3 = 0;
            }
            c = c2;
            listAX = ajsz.aX(aokvVar);
        } else {
            c = ' ';
            j = 4294967295L;
            int size3 = list.size();
            aopq aopqVarC = aooc.C(0, size3 * i);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(aopqVarC, 10));
            aopp aoppVarA2 = aopqVarC.a();
            while (aoppVarA2.a) {
                int iA2 = aoppVarA2.a();
                defpackage.elk elkVar3 = defpackage.bqt.a;
                int i9 = iA2 % size3;
                long jAM2 = mni.aM(((defpackage.bqs) list.get(i9)).a, j2);
                float f6 = (((iA2 / size3) * 360.0f) / i) / 360.0f;
                double d2 = (f6 + f6) * 3.1415927f;
                int i10 = (int) (jAM2 >> 32);
                int i11 = (int) (jAM2 & 4294967295L);
                java.util.ArrayList arrayList5 = arrayList4;
                arrayList5.add(new defpackage.bqs(mni.bl((((long) java.lang.Float.floatToRawIntBits((java.lang.Float.intBitsToFloat(i10) * ((float) java.lang.Math.cos(d2))) - (java.lang.Float.intBitsToFloat(i11) * ((float) java.lang.Math.sin(d2))))) << 32) | (((long) java.lang.Float.floatToRawIntBits((java.lang.Float.intBitsToFloat(i10) * ((float) java.lang.Math.sin(d2))) + (java.lang.Float.intBitsToFloat(i11) * ((float) java.lang.Math.cos(d2))))) & 4294967295L), j2), ((defpackage.bqs) list.get(i9)).b));
                arrayList4 = arrayList5;
            }
            listAX = arrayList4;
        }
        int size4 = listAX.size() << 1;
        float[] fArr = new float[size4];
        for (int i12 = 0; i12 < size4; i12++) {
            long j3 = ((defpackage.bqs) listAX.get(i12 / 2)).a;
            fArr[i12] = java.lang.Float.intBitsToFloat((int) (i12 % 2 == 0 ? j3 >> c : j3 & j));
        }
        aokv aokvVar2 = new aokv(10);
        java.util.Iterator it = listAX.iterator();
        while (it.hasNext()) {
            aokvVar2.add(((defpackage.bqs) it.next()).b);
        }
        return defpackage.akf.e(fArr, defpackage.elk.a, ajsz.aX(aokvVar2), java.lang.Float.intBitsToFloat((int) (j2 >> c)), java.lang.Float.intBitsToFloat((int) (j2 & j)));
    }

    public static final defpackage.ely l() {
        defpackage.ely elyVar = defpackage.bqt.n;
        if (elyVar != null) {
            return elyVar;
        }
        defpackage.ely elyVarC = k(ajsz.bb(new defpackage.bqs[]{new defpackage.bqs(4487170498044482290L, new defpackage.elk(0.053f, 0.0f)), new defpackage.bqs(4482270580290176942L, new defpackage.elk(0.053f, 0.0f))}), 10, false, 12).c();
        defpackage.bqt.n = elyVarC;
        return elyVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(cmw cmwVar, long j, final long j2, crd crdVar, java.util.List list, cav cavVar, int i) {
        int i2;
        boolean z;
        char c;
        char c2;
        float f;
        aii aiiVar;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1776169461);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.A(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((i & 32768) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 8192 : 16384;
        }
        if (!cbtVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            cbtVarB.s();
        } else {
            if (list.size() <= 1) {
                throw new java.lang.IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons");
            }
            int i4 = 57344 & i2;
            if (i4 == 16384 || ((i2 & 32768) != 0 && cbtVarB.B(list))) {
                z = true;
                c = 1;
            } else {
                c = 1;
                z = false;
            }
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z || objR == cau.a) {
                aokv aokvVar = new aokv(10);
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    if (i6 < list.size()) {
                        aokvVar.add(new izg(((defpackage.ely) list.get(i5)).c(), ((defpackage.ely) list.get(i6)).c()));
                    } else {
                        aokvVar.add(new izg(((defpackage.ely) list.get(i5)).c(), ((defpackage.ely) list.get(0)).c()));
                    }
                    i5 = i6;
                }
                objR = ajsz.aX(aokvVar);
                cbtVar.ab(objR);
            }
            final java.util.List list2 = (java.util.List) objR;
            if (i4 != 16384) {
                c2 = ((i2 & 32768) == 0 || !cbtVarB.B(list)) ? (char) 0 : c;
            } else {
                c2 = c;
                i4 = 16384;
            }
            java.lang.Object objR2 = cbtVar.R();
            if (c2 != 0 || objR2 == cau.a) {
                float[] fArr = new float[4];
                int size2 = list.size();
                int i7 = 0;
                float fMin = 1.0f;
                f = 0.0f;
                while (i7 < size2) {
                    int i8 = size2;
                    defpackage.ely elyVar = (defpackage.ely) list.get(i7);
                    defpackage.ely.e(elyVar, fArr, 2);
                    aokv aokvVar2 = elyVar.b;
                    int i9 = aokvVar2.b;
                    float[] fArr2 = fArr;
                    float fMax = 0.0f;
                    int i10 = 0;
                    while (i10 < i9) {
                        int i11 = i9;
                        defpackage.ell ellVar = (defpackage.ell) aokvVar2.get(i10);
                        float fA = ellVar.a() - elyVar.a();
                        float fB = ellVar.b() - elyVar.b();
                        float f2 = defpackage.ema.a;
                        int i12 = i10;
                        long jI = ellVar.i(0.5f);
                        float fH = defpackage.akf.h(jI) - elyVar.a();
                        float fI = defpackage.akf.i(jI) - elyVar.b();
                        fMax = java.lang.Math.max(fMax, java.lang.Math.max((fA * fA) + (fB * fB), (fH * fH) + (fI * fI)));
                        i10 = i12 + 1;
                        i9 = i11;
                    }
                    float fSqrt = (float) java.lang.Math.sqrt(fMax);
                    float fA2 = elyVar.a() - fSqrt;
                    float fB2 = elyVar.b() - fSqrt;
                    float fA3 = elyVar.a() + fSqrt;
                    float fB3 = elyVar.b() + fSqrt;
                    float[] fArr3 = new float[4];
                    fArr3[0] = fA2;
                    fArr3[c] = fB2;
                    fArr3[2] = fA3;
                    fArr3[3] = fB3;
                    fMin = java.lang.Math.min(fMin, java.lang.Math.max(t(fArr2) / t(fArr3), s(fArr2) / s(fArr3)));
                    i7++;
                    size2 = i8;
                    fArr = fArr2;
                }
                java.util.List list3 = defpackage.bqm.a;
                objR2 = java.lang.Float.valueOf(fMin * defpackage.bqm.b);
                cbtVar.ab(objR2);
            } else {
                f = 0.0f;
            }
            final float fFloatValue = ((java.lang.Number) objR2).floatValue();
            java.lang.Object objR3 = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR3 == obj) {
                objR3 = aij.a(f);
                cbtVar.ab(objR3);
            }
            final aii aiiVar2 = (aii) objR3;
            java.lang.Object objR4 = cbtVar.R();
            if (objR4 == obj) {
                objR4 = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(90.0f);
                cbtVar.ab(objR4);
            }
            final ceg cegVar = (ceg) objR4;
            java.lang.Object objR5 = cbtVar.R();
            if (objR5 == obj) {
                objR5 = aij.a(f);
                cbtVar.ab(objR5);
            }
            aii aiiVar3 = (aii) objR5;
            char c3 = (i4 == 16384 || ((i2 & 32768) != 0 && cbtVarB.B(list))) ? c : (char) 0;
            java.lang.Object objR6 = cbtVar.R();
            if (c3 != 0 || objR6 == obj) {
                objR6 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
                cbtVar.ab(objR6);
            }
            final cei ceiVar = (cei) objR6;
            boolean zD = cbtVarB.D(aiiVar2) | cbtVarB.B(ceiVar) | cbtVarB.D(list2) | cbtVarB.D(aiiVar3);
            java.lang.Object objR7 = cbtVar.R();
            if (zD || objR7 == obj) {
                objR7 = new defpackage.bqr(aiiVar2, list2, ceiVar, cegVar, aiiVar3, null);
                aiiVar = aiiVar3;
                cbtVar.ab(objR7);
            } else {
                aiiVar = aiiVar3;
            }
            cbp.g(list, (aonn) objR7, cbtVarB);
            java.lang.Object objR8 = cbtVar.R();
            if (objR8 == obj) {
                objR8 = new cpx((byte[]) null);
                cbtVar.ab(objR8);
            }
            final cpx cpxVar = (cpx) objR8;
            java.lang.Object objR9 = cbtVar.R();
            if (objR9 == obj) {
                cqt cqtVar = new cqt(cqt.e());
                cbtVar.ab(cqtVar);
                objR9 = cqtVar;
            }
            final float[] fArr4 = ((cqt) objR9).a;
            cmw cmwVarD = defpackage.rk.d(cmwVar);
            java.util.List list4 = defpackage.bqm.a;
            cmw cmwVarBp = den.bp(cfd.K(azm.c(azm.i(cmwVarD, 48.0f, 48.0f), 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar, true, 0, 1042431), j);
            cye cyeVarB = awo.b(cmh.e, false);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cbtVarB, cmwVarBp);
            aomy aomyVar = dam.a;
            cbtVarB.v();
            if (cbtVar.w) {
                cbtVarB.j(aomyVar);
            } else {
                cbtVarB.x();
            }
            cev.c(cbtVarB, cyeVarB, dam.e);
            cev.c(cbtVarB, cjeVarAi, dam.d);
            cev.c(cbtVarB, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cbtVarB, dam.g);
            cev.c(cbtVarB, cmwVarM, dam.c);
            cmw cmwVarL = defpackage.rx.l(cmw.c, 1.0f, c);
            boolean zD2 = cbtVarB.D(aiiVar2) | cbtVarB.D(aiiVar) | cbtVarB.D(list2) | cbtVarB.B(ceiVar) | cbtVarB.D(cpxVar) | cbtVarB.y(fFloatValue) | cbtVarB.D(fArr4);
            boolean z2 = (i2 & 896) == 256;
            java.lang.Object objR10 = cbtVar.R();
            if ((zD2 | z2) || objR10 == obj) {
                final aii aiiVar4 = aiiVar;
                aonj aonjVar = new aonj() { // from class: bqn
                    public final java.lang.Object a(java.lang.Object obj2) {
                        dbm dbmVar = (dbm) obj2;
                        float fFloatValue2 = ((java.lang.Number) aiiVar2.d()).floatValue();
                        float fC = (90.0f * fFloatValue2) + cegVar.c() + ((java.lang.Number) aiiVar4.d()).floatValue();
                        long jN = dbmVar.n();
                        csg csgVarQ = dbmVar.q();
                        long jA = csgVarQ.a();
                        csgVarQ.b().g();
                        cei ceiVar2 = ceiVar;
                        long j3 = j2;
                        float[] fArr5 = fArr4;
                        float f3 = fFloatValue;
                        cpx cpxVar2 = cpxVar;
                        java.util.List list5 = list2;
                        try {
                            csgVarQ.c.p(fC, jN);
                            cpx cpxVarT = defpackage.rq.t((izg) list5.get(ceiVar2.c()), fFloatValue2, cpxVar2, false, 0.0f, 0.0f, 120);
                            long jO = dbmVar.o();
                            cqt.c(fArr5);
                            cqt.g(fArr5, java.lang.Float.intBitsToFloat((int) (jO >> 32)) * f3, java.lang.Float.intBitsToFloat((int) (4294967295L & jO)) * f3);
                            cpxVarT.n(fArr5);
                            cpxVarT.o(mni.aM(cdh.q(jO), cpxVarT.b().b()));
                            den.S(dbmVar, cpxVarT, j3, csl.a, 52);
                            return aojh.a;
                        } finally {
                            csgVarQ.b().e();
                            csgVarQ.h(jA);
                        }
                    }
                };
                cbtVar.ab(aonjVar);
                objR10 = aonjVar;
            }
            den.aR(ru.m(cmwVarL, (aonj) objR10), cbtVarB);
            cbtVar.W(true);
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bqo(cmwVar, j, j2, crdVar, list, i, 1);
        }
    }

    public static final void n(cmw cmwVar, long j, long j2, crd crdVar, java.util.List list, cav cavVar, int i) {
        int i2;
        long j3;
        long j4;
        crd crdVar2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(663218740);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= true != cavVarB.A(j3) ? 16 : 32;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i2 |= true != cavVarB.A(j4) ? 128 : 256;
        } else {
            j4 = j2;
        }
        if ((i & 3072) == 0) {
            crdVar2 = crdVar;
            i2 |= true != cavVarB.B(crdVar2) ? 1024 : 2048;
        } else {
            crdVar2 = crdVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            ((cbt) cavVarB).Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            m(cmwVar, j3, j4, crdVar2, list, cavVar2, i2 & 65534);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bqo(cmwVar, j, j2, crdVar, list, i, 0);
        }
    }

    public static final void o(cmw cmwVar, long j, java.util.List list, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        long j2;
        java.util.List list2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(387862047);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cbtVarB.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            long jS = cfd.S();
            java.util.List list3 = defpackage.bqm.a;
            cmwVar2 = cmwVar;
            m(cmwVar2, jS, j, btj.b(6, cbtVarB), list, cbtVarB, (i2 & 14) | 48 | ((i2 << 3) & 896) | ((i2 << 6) & 57344));
            j2 = j;
            list2 = list;
        } else {
            cmwVar2 = cmwVar;
            j2 = j;
            list2 = list;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abih(cmwVar2, j2, list2, i, 1);
        }
    }

    private static final int p(int i, int i2, boolean z) {
        return !z ? i - i2 : i;
    }

    private static final int q(int i, int i2, boolean z) {
        if (z) {
            return 0;
        }
        return i2 - i;
    }

    private static final boolean r(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i2 <= i) {
                return true;
            }
        } else if (i3 - i2 > i) {
            return true;
        }
        return false;
    }

    private static final float s(float[] fArr) {
        return fArr[3] - fArr[1];
    }

    private static final float t(float[] fArr) {
        return fArr[2] - fArr[0];
    }
}
