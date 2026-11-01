package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aaf {
    public static final void a(cmw cmwVar, aomy aomyVar, boolean z, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(2111672474);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            den.aR(cfo.n(azm.i(cmwVar, 25.0f, 25.0f), new defpackage.jag(aomyVar, z, i4)), cavVarB);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bsq(cmwVar, aomyVar, z, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(defpackage.bkv bkvVar, cmj cmjVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        aonn aonnVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1090171650);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(bkvVar) : cbtVarB.D(bkvVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(cmjVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 128 : 256;
        }
        boolean z2 = false;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cbtVarB.B(bkvVar))) {
                z = false;
            }
            boolean z4 = z3 | z;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z4 || objR == cau.a) {
                objR = new defpackage.bkc(cmjVar, bkvVar);
                cbtVar.ab(objR);
            }
            defpackage.dra.b((defpackage.bkc) objR, null, new defpackage.drs(z2, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 1920), aonnVar, cbtVarB, ((i2 << 3) & 7168) | 384, 2);
            aonnVar2 = aonnVar;
        } else {
            aonnVar2 = aonnVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(bkvVar, cmjVar, aonnVar2, i, 7);
        }
    }

    public static final void c(final defpackage.bkv bkvVar, final boolean z, final int i, final boolean z2, long j, final float f, final cmw cmwVar, cav cavVar, final int i2) {
        int i3;
        final long j2;
        long j3;
        final boolean zB;
        int i4 = i2 & 6;
        cbt cbtVarB = cavVar.b(-466280168);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? cbtVarB.B(bkvVar) : cbtVarB.D(bkvVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.C(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cbtVarB.z(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cbtVarB.C(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != cbtVarB.B(cmwVar) ? 524288 : 1048576;
        }
        if (cbtVarB.H((533651 & i3) != 533650, i3 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) == 0 || cbtVarB.E()) {
                j3 = 9205357640488583168L;
            } else {
                cbtVarB.s();
                j3 = j;
            }
            cbtVarB.l();
            if (z) {
                zB = defpackage.blf.b(i, z2);
            } else {
                zB = !defpackage.blf.b(i, z2);
            }
            cmj cmjVar = zB ? defpackage.cmg.b : defpackage.cmg.a;
            int i5 = i3 & 14;
            boolean zC = (i5 == 4 || ((i3 & 8) != 0 && cbtVarB.D(bkvVar))) | ((i3 & 112) == 32) | cbtVarB.C(zB);
            java.lang.Object objR = cbtVar.R();
            if (zC || objR == cau.a) {
                objR = new aonj() { // from class: bjs
                    public final java.lang.Object a(java.lang.Object obj) {
                        boolean z3 = z;
                        diq diqVar = (diq) obj;
                        long jA = bkvVar.a();
                        diqVar.a(defpackage.blf.a, new defpackage.ble(z3 ? defpackage.bgp.b : defpackage.bgp.c, jA, true != zB ? 3 : 1, (9223372034707292159L & jA) != 9205357640488583168L));
                        return aojh.a;
                    }
                };
                cbtVar.ab(objR);
            }
            final cmw cmwVarB = dig.b(cmwVar, false, (aonj) objR);
            final dgk dgkVar = (dgk) cbtVarB.e(dfo.n);
            final boolean z3 = zB;
            j2 = j3;
            b(bkvVar, cmjVar, cfo.j(1365123137, new aonn() { // from class: bjt
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i6 = iIntValue & 3;
                    if (cavVar2.H(i6 != 2, iIntValue & 1)) {
                        final defpackage.bkv bkvVar2 = bkvVar;
                        final cmw cmwVar2 = cmwVarB;
                        final boolean z4 = z3;
                        final long j4 = j2;
                        den.ab(dfo.n.b(dgkVar), cfo.j(1260045569, new aonn() { // from class: bjv
                            public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4) {
                                cav cavVar3 = (cav) obj3;
                                int iIntValue2 = ((java.lang.Integer) obj4).intValue();
                                if (cavVar3.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    defpackage.bkv bkvVar3 = bkvVar2;
                                    cmw cmwVar3 = cmwVar2;
                                    boolean z5 = z4;
                                    long j5 = j4;
                                    if (j5 != 9205357640488583168L) {
                                        cavVar3.u(3458246);
                                        awa awaVar = z5 ? defpackage.avz.b : defpackage.avz.a;
                                        cmw cmwVarN = azm.n(cmwVar3, dpk.b(j5), dpk.a(j5), 0.0f, 0.0f, 12);
                                        cye cyeVarA = azh.a(awaVar, cmh.m, cavVar3, 0);
                                        int iM = anty.M(cavVar3.a());
                                        cje cjeVarM = cavVar3.M();
                                        cmw cmwVarM = cfo.m(cavVar3, cmwVarN);
                                        aomy aomyVar = dam.a;
                                        cavVar3.L();
                                        cavVar3.v();
                                        if (cavVar3.F()) {
                                            cavVar3.j(aomyVar);
                                        } else {
                                            cavVar3.x();
                                        }
                                        cev.c(cavVar3, cyeVarA, dam.e);
                                        cev.c(cavVar3, cjeVarM, dam.d);
                                        cev.c(cavVar3, java.lang.Integer.valueOf(iM), dam.f);
                                        cev.b(cavVar3, dam.g);
                                        cev.c(cavVar3, cmwVarM, dam.c);
                                        cmt cmtVar = cmw.c;
                                        boolean zD = cavVar3.D(bkvVar3);
                                        java.lang.Object objG = cavVar3.g();
                                        if (zD || objG == cau.a) {
                                            objG = new defpackage.bhl(bkvVar3, 16);
                                            cavVar3.w(objG);
                                        }
                                        defpackage.aaf.a(cmtVar, (aomy) objG, z5, cavVar3, 6);
                                        cavVar3.n();
                                        cavVar3.o();
                                    } else {
                                        cavVar3.u(4389176);
                                        boolean zD2 = cavVar3.D(bkvVar3);
                                        java.lang.Object objG2 = cavVar3.g();
                                        if (zD2 || objG2 == cau.a) {
                                            objG2 = new defpackage.bhl(bkvVar3, 17);
                                            cavVar3.w(objG2);
                                        }
                                        defpackage.aaf.a(cmwVar3, (aomy) objG2, z5, cavVar3, 0);
                                        cavVar3.o();
                                    }
                                } else {
                                    cavVar3.s();
                                }
                                return aojh.a;
                            }
                        }, cavVar2), cavVar2, 48);
                    } else {
                        cavVar2.s();
                    }
                    return aojh.a;
                }
            }, cbtVarB), cbtVarB, i5 | 384);
        } else {
            cbtVarB.s();
            j2 = j;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            final long j4 = j2;
            cdkVarI.c = new aonn() { // from class: bju
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.bkv bkvVar2 = bkvVar;
                    boolean z4 = z;
                    int i6 = i;
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.aaf.c(bkvVar2, z4, i6, z2, j4, f, cmwVar, cavVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                    return aojh.a;
                }
            };
        }
    }

    public static final float d(defpackage.acf acfVar, defpackage.acf acfVar2, float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("Invalid progress: " + f);
        }
        aopp aoppVarA = aooc.C(0, acfVar.b).a();
        while (aoppVarA.a) {
            int iA = aoppVarA.a();
            int i = iA + 1;
            if (g(f, acfVar.a(iA), acfVar.a(i % acfVar.b))) {
                int i2 = i % acfVar.b;
                float fA = acfVar.a(i2) - acfVar.a(iA);
                float f2 = defpackage.ema.a;
                float f3 = ((fA % 1.0f) + 1.0f) % 1.0f;
                return (((acfVar2.a(iA) + (((((acfVar2.a(i2) - acfVar2.a(iA)) % 1.0f) + 1.0f) % 1.0f) * (f3 < 0.001f ? 0.5f : ((((f - acfVar.a(iA)) % 1.0f) + 1.0f) % 1.0f) / f3))) % 1.0f) + 1.0f) % 1.0f;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final float e(float f, float f2) {
        float fAbs = java.lang.Math.abs(f - f2);
        return java.lang.Math.min(fAbs, 1.0f - fAbs);
    }

    public static final void f(defpackage.acf acfVar) {
        float fB = acfVar.b();
        int i = acfVar.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fA = acfVar.a(i2);
            if (fA < 0.0f || fA >= 1.0f) {
                throw new java.lang.IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(defpackage.acf.d(acfVar, null, null, 31)));
            }
            if (e(fA, fB) <= 1.0E-4f) {
                throw new java.lang.IllegalArgumentException("FloatMapping - Progress repeats a value: ".concat(defpackage.acf.d(acfVar, null, null, 31)));
            }
            if (fA < fB && (i3 = i3 + 1) > 1) {
                throw new java.lang.IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(defpackage.acf.d(acfVar, null, null, 31)));
            }
            i2++;
            fB = fA;
        }
    }

    public static final boolean g(float f, float f2, float f3) {
        if (f3 >= f2) {
            if (f2 > f || f > f3) {
                return false;
            }
        } else if (f < f2 && f > f3) {
            return false;
        }
        return true;
    }

    public static final defpackage.ell h(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new defpackage.ell(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    public static final defpackage.ell i(float f, float f2, float f3, float f4) {
        float f5 = defpackage.ema.a;
        return h(f, f2, (0.6666666f * f) + (0.33333334f * f3), (f2 * 0.6666666f) + (f4 * 0.33333334f), (0.3333333f * f) + (0.6666667f * f3), (f2 * 0.3333333f) + (f4 * 0.6666667f), f3, f4);
    }

    public static final void j(final java.lang.Class cls, cmw cmwVar, defpackage.yz yzVar, final android.os.Bundle bundle, emq emqVar, aonj aonjVar, cav cavVar, int i) {
        defpackage.yz yzVar2;
        emq emqVar2;
        aonj aonjVar2;
        char c;
        defpackage.yz yzVar3;
        emq emqVar3;
        aonj aonjVar3;
        bo boVarA;
        final emq emqVar4;
        final defpackage.yz yzVar4;
        final defpackage.elh elhVar;
        final bo boVar;
        cbt cbtVar;
        int i2 = i & 6;
        cbt cbtVarB = cavVar.b(1148251591);
        int i3 = i2 == 0 ? (true != cbtVarB.D(cls) ? 2 : 4) | i : i;
        int i4 = 16;
        if ((i & 48) == 0) {
            i3 |= true != cbtVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cbtVarB.D(bundle) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        int i5 = i3 | 196608;
        int i6 = 0;
        if (cbtVarB.H((74899 & i5) != 74898, i5 & 1)) {
            cbt cbtVar2 = cbtVarB;
            az azVar = null;
            cbtVar2.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                java.lang.Object[] objArr = new java.lang.Object[0];
                c = 2;
                dko dkoVar = new dko(new defpackage.cmp(20), new defpackage.dkq(17), 1);
                java.lang.Object objR = cbtVar2.R();
                java.lang.Object obj = cau.a;
                if (objR == obj) {
                    objR = new defpackage.eli(i6);
                    cbtVar2.ab(objR);
                }
                yzVar3 = (defpackage.yz) cfd.n(objArr, dkoVar, (aomy) objR, cbtVarB, 384);
                emq emqVar5 = (emq) cdh.j(((emx) cbtVarB.e(eom.a)).P().b(), cbtVarB).a();
                java.lang.Object objR2 = cbtVar2.R();
                if (objR2 == obj) {
                    objR2 = new defpackage.dkq(i4);
                    cbtVar2.ab(objR2);
                }
                emqVar3 = emqVar5;
                aonjVar3 = (aonj) objR2;
            } else {
                cbtVarB.s();
                yzVar3 = yzVar;
                emqVar3 = emqVar;
                c = 2;
                aonjVar3 = aonjVar;
            }
            cbtVarB.l();
            aonj aonjVar4 = aonjVar3;
            final cer cerVarG = cdh.g(aonjVar4, cbtVarB);
            final int iM = anty.M(cbtVar2.x);
            android.view.View view = (android.view.View) cbtVarB.e(dep.f);
            boolean zB = cbtVarB.B(view);
            java.lang.Object objR3 = cbtVar2.R();
            if (zB || objR3 == cau.a) {
                aw awVarF = bo.f(view);
                if (awVarF == null) {
                    for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
                        if (context instanceof az) {
                            azVar = (az) context;
                            break;
                        }
                    }
                    if (azVar == null) {
                        throw new java.lang.IllegalStateException(a.bg(view, "View ", " is not within a subclass of FragmentActivity."));
                    }
                    boVarA = azVar.a();
                } else {
                    if (!awVarF.aG()) {
                        throw new java.lang.IllegalStateException(a.bl(view, awVarF, "The Fragment ", " that owns View ", " has already been destroyed. Nested fragments should always use the child FragmentManager."));
                    }
                    boVarA = awVarF.I();
                }
                objR3 = boVarA;
                cbtVar2.ab(objR3);
            }
            bo boVar2 = (bo) objR3;
            final android.content.Context context2 = (android.content.Context) cbtVarB.e(dep.b);
            java.lang.Object objR4 = cbtVar2.R();
            java.lang.Object obj2 = cau.a;
            if (objR4 == obj2) {
                objR4 = new defpackage.elh(iM);
                cbtVar2.ab(objR4);
            }
            defpackage.elh elhVar2 = (defpackage.elh) objR4;
            defpackage.dqi.a(elhVar2, cmwVar, null, cbtVarB, i5 & 112, 4);
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = boVar2;
            objArr2[1] = elhVar2;
            objArr2[c] = cls;
            objArr2[3] = yzVar3;
            boolean zD = cbtVarB.D(boVar2) | cbtVarB.D(elhVar2) | cbtVarB.D(context2) | cbtVarB.D(cls) | cbtVarB.B(yzVar3) | cbtVarB.D(bundle) | cbtVarB.z(iM) | cbtVarB.z(emqVar3.ordinal()) | cbtVarB.B(cerVarG);
            java.lang.Object objR5 = cbtVar2.R();
            if (zD || objR5 == obj2) {
                emqVar4 = emqVar3;
                yzVar4 = yzVar3;
                elhVar = elhVar2;
                boVar = boVar2;
                cbtVar = cbtVar2;
                aonj aonjVar5 = new aonj() { // from class: elf
                    /* JADX WARN: Type inference failed for: r4v1, types: [ccp, java.lang.Object] */
                    public final java.lang.Object a(java.lang.Object obj3) {
                        android.os.Bundle bundle2;
                        aoop aoopVar = new aoop();
                        defpackage.elh elhVar3 = elhVar;
                        int id = elhVar3.b().getId();
                        bo boVar3 = boVar;
                        aw awVarD = boVar3.d(id);
                        defpackage.yz yzVar5 = yzVar4;
                        if (awVarD == null) {
                            java.lang.Class cls2 = cls;
                            android.content.Context context3 = context2;
                            bc bcVarH = boVar3.h();
                            context3.getClassLoader();
                            awVarD = bcVarH.b(cls2.getName());
                            android.support.v4.app.Fragment$SavedState fragment$SavedState = (android.support.v4.app.Fragment$SavedState) yzVar5.a.a();
                            if (awVarD.B != null) {
                                throw new java.lang.IllegalStateException("Fragment already added");
                            }
                            android.os.Bundle bundle3 = null;
                            if (fragment$SavedState != null && (bundle2 = fragment$SavedState.a) != null) {
                                bundle3 = bundle2;
                            }
                            emq emqVar6 = emqVar4;
                            int i7 = iM;
                            android.os.Bundle bundle4 = bundle;
                            awVarD.h = bundle3;
                            awVarD.au(bundle4);
                            u uVar = new u(boVar3);
                            uVar.s();
                            uVar.t(elhVar3.b(), awVarD, java.lang.String.valueOf(i7));
                            if (emqVar6.a(emq.c)) {
                                uVar.l(awVarD, emqVar6);
                            }
                            if (boVar3.ac()) {
                                aoopVar.a = true;
                                awVarD.P().c(new ykw(aoopVar, awVarD, 1));
                                uVar.d();
                            } else {
                                uVar.c();
                            }
                        }
                        cer cerVar = cerVarG;
                        boVar3.M(elhVar3.b());
                        aonj aonjVar6 = (aonj) cerVar.a();
                        aooh.d(awVarD, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment");
                        aonjVar6.a(awVarD);
                        return new defpackage.elg(boVar3, awVarD, yzVar5, aoopVar);
                    }
                };
                cbtVar.ab(aonjVar5);
                objR5 = aonjVar5;
            } else {
                boVar = boVar2;
                cbtVar = cbtVar2;
                emqVar4 = emqVar3;
                yzVar4 = yzVar3;
                elhVar = elhVar2;
            }
            cbp.d(objArr2, (aonj) objR5, cbtVarB);
            boolean zD2 = cbtVarB.D(boVar) | cbtVarB.D(elhVar) | cbtVarB.z(emqVar4.ordinal());
            java.lang.Object objR6 = cbtVar.R();
            if (zD2 || objR6 == obj2) {
                objR6 = new afx(boVar, elhVar, emqVar4, 16, (char[]) null);
                cbtVar.ab(objR6);
            }
            cbp.c(emqVar4, (aonj) objR6, cbtVarB);
            yzVar2 = yzVar4;
            emqVar2 = emqVar4;
            aonjVar2 = aonjVar4;
        } else {
            cbtVarB.s();
            yzVar2 = yzVar;
            emqVar2 = emqVar;
            aonjVar2 = aonjVar;
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.axp(cls, cmwVar, yzVar2, bundle, emqVar2, aonjVar2, i, 4);
        }
    }

    public static final defpackage.biz k(defpackage.biz bizVar, dpq dpqVar, dkz dkzVar, dpf dpfVar, gat gatVar, dnx dnxVar) {
        return (bizVar != null && dpqVar == bizVar.a && aooh.n(dff.f(dkzVar, dpqVar), bizVar.b) && dpfVar.a() == bizVar.c.a && gatVar == bizVar.e && aooh.n(dnxVar, bizVar.d)) ? bizVar : new defpackage.biz(dpqVar, dff.f(dkzVar, dpqVar), new dpg(dpfVar.a(), dpfVar.b()), gatVar, dnxVar);
    }

    public static final cmw l(cmw cmwVar, boolean z, kaw kawVar) {
        return cmwVar.a(z ? new defpackage.anh(kawVar) : cmw.c);
    }
}
