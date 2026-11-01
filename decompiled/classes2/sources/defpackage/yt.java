package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class yt {
    public static final void a(cmw cmwVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-932836462);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 16 : 32;
        }
        int i4 = 0;
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            den.aR(cmwVar.a(new defpackage.cnx(aonjVar)), cavVarB);
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonjVar, i, i4);
        }
    }

    public static final void b(cmw cmwVar, java.lang.String str, aonj aonjVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1162737955);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVarA = cmwVar.a(new defpackage.cnx(aonjVar));
            int i4 = i2 & 112;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 32 || objR == cau.a) {
                objR = new agb(str, 11);
                cbtVar.ab(objR);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = dig.a;
            den.aR(cmwVarA.a(new dhs(false, (aonj) objR)), cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(cmwVar, str, aonjVar, i, 1);
        }
    }

    public static final void c(android.app.PendingIntent pendingIntent) {
        try {
            android.app.ActivityOptions activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                rp$.ExternalSyntheticApiModelOutline0.m(activityOptionsMakeBasic, 4);
            } else {
                rp$.ExternalSyntheticApiModelOutline0.m(activityOptionsMakeBasic, 1);
            }
            rp$.ExternalSyntheticApiModelOutline0.m(pendingIntent, activityOptionsMakeBasic.toBundle());
        } catch (android.app.PendingIntent.CanceledException e) {
            android.util.Log.e("TextClassification", a.bi(e, pendingIntent, "error sending pendingIntent: ", " error: "));
        }
    }

    public static final void d(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(790527681);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.b);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            ccp ccpVar = (ccp) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.bhl(ccpVar, i4);
                cbtVar.ab(objR2);
            }
            aomy aomyVar = (aomy) objR2;
            int i5 = defpackage.bhu.a;
            defpackage.bis bisVarF = defpackage.zb.f(defpackage.bhs.b, cbtVarB, 6);
            den.ac(new cdj[]{defpackage.bix.b.b(defpackage.yj.d(aomyVar, cbtVarB)), defpackage.bix.a.b(bisVarF)}, cfo.j(1070596993, new defpackage.fxd(cmwVar, ccpVar, aonnVar, bisVarF, aomyVar, 1), cbtVarB), cbtVarB, 48);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonnVar, i, 10);
        }
    }

    public static final void e(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(155925518);
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            boolean z = cbtVarB.e(defpackage.bix.a) != null;
            boolean z2 = cbtVarB.e(defpackage.bix.b) != null;
            if (z && z2) {
                cbtVarB.u(-1977187922);
                cye cyeVarB = awo.b(cmh.a, true);
                cbt cbtVar = cbtVarB;
                int iM = anty.M(cbtVar.x);
                cje cjeVarAi = cbtVar.ai();
                cmw cmwVarM = cfo.m(cbtVarB, cmwVar);
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
                aonnVar.a(cbtVarB, java.lang.Integer.valueOf((i2 >> 3) & 14));
                cbtVar.W(true);
                cbtVar.W(false);
            } else {
                int i4 = (i2 & 14) | (i2 & 112);
                if (z) {
                    cbtVarB.u(-1976997706);
                    defpackage.yj.c(cmwVar, aonnVar, cbtVarB, i4);
                    cbtVarB.W(false);
                } else if (z2) {
                    cbtVarB.u(-1976846922);
                    defpackage.bhu.d(cmwVar, aonnVar, cbtVarB, i4);
                    cbtVarB.W(false);
                } else {
                    cbtVarB.u(-1976716505);
                    d(cmwVar, aonnVar, cbtVarB, i4);
                    cbtVarB.W(false);
                }
            }
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonnVar, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:195:0x0303  */
    /* JADX WARN: Code duplicated, block: B:197:0x0309  */
    /* JADX WARN: Code duplicated, block: B:221:0x038e  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:236:0x0422  */
    /* JADX WARN: Code duplicated, block: B:238:0x0440  */
    /* JADX WARN: Code duplicated, block: B:321:0x0587  */
    /* JADX WARN: Code duplicated, block: B:322:0x0589  */
    /* JADX WARN: Code duplicated, block: B:398:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:401:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:402:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:405:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:406:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:408:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:410:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:411:0x06ff A[PHI: r9
      0x06ff: PHI (r9v25 dst) = (r9v24 dst), (r9v30 dst) binds: [B:407:0x06f3, B:410:0x06fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:413:0x0703  */
    /* JADX WARN: Code duplicated, block: B:415:0x0707 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:425:0x0721 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    public static void f(dsz dszVar, dsq dsqVar, java.util.ArrayList arrayList, int i) {
        int i2;
        dsw[] dswVarArr;
        int i3;
        int i4;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        dsw[] dswVarArr2;
        dsy dsyVar;
        dsy dsyVar2;
        dsy dsyVar3;
        dsq dsqVar2;
        dsy dsyVar4;
        int i6;
        int i7;
        dsy dsyVar5;
        dst dstVar;
        dst dstVar2;
        dsx dsxVar;
        dst dstVar3;
        dsy dsyVar6;
        int i8;
        dsx dsxVar2;
        dst dstVar4;
        int i9;
        dsx[] dsxVarArr;
        dsx dsxVar3;
        dsx dsxVar4;
        dst dstVar5;
        dsx dsxVar5;
        dst dstVar6;
        dsx dsxVar6;
        int size;
        java.util.ArrayList arrayList2;
        float f2;
        float f3;
        dst dstVar7;
        dst dstVar8;
        dst dstVar9;
        dst dstVar10;
        dsp dspVarA;
        float f4;
        int i10;
        dsx dsxVar7;
        dsy dsyVar7;
        int i11;
        int i12;
        dsy dsyVar8;
        int iH;
        dsz dszVar2 = dszVar;
        int i13 = 2;
        if (i == 0) {
            i2 = dszVar2.as;
            dswVarArr = dszVar2.av;
            i3 = 0;
        } else {
            i2 = dszVar2.at;
            dswVarArr = dszVar2.au;
            i3 = 2;
        }
        int i14 = i2;
        dsw[] dswVarArr3 = dswVarArr;
        int i15 = 0;
        while (i15 < i14) {
            dsw dswVar = dswVarArr3[i15];
            int i16 = 3;
            int i17 = 8;
            dst dstVar11 = null;
            if (dswVar.t) {
                i4 = i15;
                f = 0.0f;
            } else {
                int i18 = dswVar.o;
                int i19 = i18 << 1;
                f = 0.0f;
                dsy dsyVar9 = dswVar.a;
                dsy dsyVar10 = dsyVar9;
                dsy dsyVar11 = dsyVar10;
                boolean z5 = false;
                while (!z5) {
                    int i20 = i19 + 1;
                    dswVar.i++;
                    dsyVar10.an[i18] = null;
                    dsyVar10.am[i18] = null;
                    if (dsyVar10.ah != i17) {
                        dswVar.l++;
                        if (dsyVar10.L(i18) != i16) {
                            int i21 = dswVar.m;
                            if (i18 == 0) {
                                iH = dsyVar10.j();
                                i12 = 0;
                            } else {
                                iH = dsyVar10.h();
                                i12 = 1;
                            }
                            dswVar.m = i21 + iH;
                        } else {
                            i12 = i18;
                        }
                        int i22 = dswVar.m;
                        dsx[] dsxVarArr2 = dsyVar10.R;
                        int iB = i22 + dsxVarArr2[i19].b();
                        dswVar.m = iB;
                        dswVar.m = iB + dsxVarArr2[i20].b();
                        int iB2 = dswVar.n + dsxVarArr2[i19].b();
                        dswVar.n = iB2;
                        dswVar.n = iB2 + dsxVarArr2[i20].b();
                        if (dswVar.b == null) {
                            dswVar.b = dsyVar10;
                        }
                        dswVar.d = dsyVar10;
                        int i23 = dsyVar10.aq[i12];
                        if (i23 == i16) {
                            int i24 = dsyVar10.u[i12];
                            if (i24 != 0 && i24 != i16) {
                                if (i24 == i13) {
                                    i24 = i13;
                                }
                            }
                            dswVar.j++;
                            float f5 = dsyVar10.al[i12];
                            if (f5 > 0.0f) {
                                dswVar.k += f5;
                            }
                            if (dsyVar10.ah != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                if (f5 < 0.0f) {
                                    dswVar.q = true;
                                } else {
                                    dswVar.r = true;
                                }
                                if (dswVar.h == null) {
                                    dswVar.h = new java.util.ArrayList();
                                }
                                dswVar.h.add(dsyVar10);
                            }
                            if (dswVar.f == null) {
                                dswVar.f = dsyVar10;
                            }
                            dsy dsyVar12 = dswVar.g;
                            if (dsyVar12 != null) {
                                dsyVar12.am[i12] = dsyVar10;
                            }
                            dswVar.g = dsyVar10;
                        }
                    } else {
                        i12 = i18;
                    }
                    dsy dsyVar13 = dsyVar11;
                    if (dsyVar13 != dsyVar10) {
                        dsyVar13.an[i12] = dsyVar10;
                    }
                    dsx dsxVar8 = dsyVar10.R[i20].e;
                    if (dsxVar8 != null) {
                        dsyVar8 = dsxVar8.d;
                        dsx dsxVar9 = dsyVar8.R[i19].e;
                        if (dsxVar9 == null || dsxVar9.d != dsyVar10) {
                            dsyVar8 = null;
                        }
                    } else {
                        dsyVar8 = null;
                    }
                    if (dsyVar8 != null) {
                        z5 = false;
                    } else {
                        dsyVar8 = dsyVar10;
                        z5 = true;
                    }
                    dsyVar11 = dsyVar10;
                    i16 = 3;
                    i17 = 8;
                    i13 = 2;
                    dsyVar10 = dsyVar8;
                    i15 = i15;
                }
                i4 = i15;
                dsy dsyVar14 = dswVar.b;
                if (dsyVar14 != null) {
                    dswVar.m -= dsyVar14.R[i19].b();
                }
                dsy dsyVar15 = dswVar.d;
                if (dsyVar15 != null) {
                    dswVar.m -= dsyVar15.R[i19 + 1].b();
                }
                dswVar.c = dsyVar10;
                if (i18 == 0 && dswVar.p) {
                    dswVar.e = dswVar.c;
                } else {
                    dswVar.e = dsyVar9;
                }
                dswVar.s = dswVar.r && dswVar.q;
            }
            dswVar.t = true;
            if (arrayList == 0 || arrayList.contains(dswVar.a)) {
                dsy dsyVar16 = dswVar.a;
                dsy dsyVar17 = dswVar.c;
                dsy dsyVar18 = dswVar.b;
                dsy dsyVar19 = dswVar.d;
                dsy dsyVar20 = dswVar.e;
                float f6 = dswVar.k;
                dsy dsyVar21 = dswVar.f;
                dsy dsyVar22 = dswVar.g;
                int i25 = dszVar2.aq[i];
                if (i == 0) {
                    int i26 = dsyVar20.aj;
                    boolean z6 = i26 == 0;
                    boolean z7 = i26 == 1;
                    z = i26 == 2;
                    z4 = z7;
                    z2 = z6;
                    z3 = false;
                } else {
                    int i27 = dsyVar20.ak;
                    boolean z8 = i27 == 0;
                    boolean z9 = i27 == 1;
                    z = i27 == 2;
                    z2 = z8;
                    z3 = false;
                    z4 = z9;
                }
                while (!z3) {
                    int i28 = i3 + 1;
                    dsx[] dsxVarArr3 = dsyVar16.R;
                    dsx dsxVar10 = dsxVarArr3[i3];
                    int i29 = true != z ? 4 : 1;
                    int iB3 = dsxVar10.b();
                    boolean z10 = z;
                    int[] iArr = dsyVar16.aq;
                    int iB4 = iB3;
                    boolean z11 = iArr[i] == 3 && dsyVar16.u[i] == 0;
                    dsx dsxVar11 = dsxVar10.e;
                    if (dsxVar11 != null && dsyVar16 != dsyVar16) {
                        iB4 += dsxVar11.b();
                    }
                    boolean z12 = z11;
                    int i30 = iB4;
                    if (z10 && dsyVar16 != dsyVar16 && dsyVar16 != dsyVar18) {
                        i29 = 8;
                    }
                    int i31 = i14;
                    if (dsxVar11 != null) {
                        if (dsyVar16 == dsyVar18) {
                            dsqVar.g(dsxVar10.h, dsxVar11.h, i30, 6);
                        } else {
                            dsqVar.g(dsxVar10.h, dsxVar11.h, i30, 8);
                        }
                        if (z12 && !z10) {
                            i29 = 5;
                        }
                        dsqVar.m(dsxVar10.h, dsxVar10.e.h, i30, (dsyVar16 == dsyVar18 && z10 && dsyVar16.T[i]) ? 5 : i29);
                    } else {
                        dswVarArr3 = dswVarArr3;
                    }
                    if (i25 == 2) {
                        if (dsyVar16.ah == 8 || iArr[i] != 3) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            dsqVar.g(dsxVarArr3[i28].h, dsxVarArr3[i3].h, 0, 5);
                        }
                        dsqVar.g(dsxVarArr3[i3].h, dszVar2.R[i3].h, i11, 8);
                    }
                    dsx dsxVar12 = dsxVarArr3[i28].e;
                    if (dsxVar12 != null) {
                        dsyVar7 = dsxVar12.d;
                        dsx dsxVar13 = dsyVar7.R[i3].e;
                        if (dsxVar13 == null || dsxVar13.d != dsyVar16) {
                            dsyVar7 = null;
                        }
                    } else {
                        dsyVar7 = null;
                    }
                    if (dsyVar7 != null) {
                        dsyVar16 = dsyVar7;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z = z10;
                    i14 = i31;
                    dswVarArr3 = dswVarArr3;
                }
                boolean z13 = z;
                i5 = i14;
                dswVarArr2 = dswVarArr3;
                if (dsyVar19 != null) {
                    int i32 = i3 + 1;
                    dsx[] dsxVarArr4 = dsyVar17.R;
                    if (dsxVarArr4[i32].e != null) {
                        dsx dsxVar14 = dsyVar19.R[i32];
                        if (dsyVar19.aq[i] == 3 && dsyVar19.u[i] == 0 && !z13) {
                            dsx dsxVar15 = dsxVar14.e;
                            if (dsxVar15.d == dszVar2) {
                                i10 = i32;
                                dsqVar.m(dsxVar14.h, dsxVar15.h, -dsxVar14.b(), 5);
                            } else {
                                i10 = i32;
                                if (z13) {
                                    dsxVar7 = dsxVar14.e;
                                    if (dsxVar7.d == dszVar2) {
                                        dsqVar.m(dsxVar14.h, dsxVar7.h, -dsxVar14.b(), 4);
                                    }
                                }
                            }
                        } else {
                            i10 = i32;
                            if (z13) {
                                dsxVar7 = dsxVar14.e;
                                if (dsxVar7.d == dszVar2) {
                                    dsqVar.m(dsxVar14.h, dsxVar7.h, -dsxVar14.b(), 4);
                                }
                            }
                        }
                        dsqVar.h(dsxVar14.h, dsxVarArr4[i10].e.h, -dsxVar14.b(), 6);
                    }
                }
                if (i25 == 2) {
                    int i33 = i3 + 1;
                    dst dstVar12 = dszVar2.R[i33].h;
                    dsx dsxVar16 = dsyVar17.R[i33];
                    dsqVar.g(dstVar12, dsxVar16.h, dsxVar16.b(), 8);
                }
                java.util.ArrayList arrayList3 = dswVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (dswVar.q && !dswVar.s) {
                        f6 = dswVar.j;
                    }
                    dsy dsyVar23 = null;
                    float f7 = f;
                    int i34 = 0;
                    while (i34 < size) {
                        dsy dsyVar24 = (dsy) arrayList3.get(i34);
                        float f8 = dsyVar24.al[i];
                        if (f8 >= f) {
                            arrayList2 = arrayList3;
                            if (f8 == f) {
                                dsx[] dsxVarArr5 = dsyVar24.R;
                                dsqVar.m(dsxVarArr5[i3 + 1].h, dsxVarArr5[i3].h, 0, 8);
                                size = size;
                                i34 = i34;
                                f3 = f;
                            } else {
                                if (dsyVar23 != null) {
                                    int i35 = i3 + 1;
                                    dsx[] dsxVarArr6 = dsyVar23.R;
                                    dstVar7 = dsxVarArr6[i3].h;
                                    dstVar8 = dsxVarArr6[i35].h;
                                    dsx[] dsxVarArr7 = dsyVar24.R;
                                    dstVar9 = dsxVarArr7[i3].h;
                                    dstVar10 = dsxVarArr7[i35].h;
                                    float f9 = f7;
                                    dspVarA = dsqVar.a();
                                    f2 = f8;
                                    f4 = f;
                                    dspVarA.b = f4;
                                    f3 = f4;
                                    if (f6 != f4 || f9 == f2) {
                                        dspVarA.e.g(dstVar7, 1.0f);
                                        dspVarA.e.g(dstVar8, -1.0f);
                                        dspVarA.e.g(dstVar10, 1.0f);
                                        dspVarA.e.g(dstVar9, -1.0f);
                                    } else if (f9 == f3) {
                                        dspVarA.e.g(dstVar7, 1.0f);
                                        dspVarA.e.g(dstVar8, -1.0f);
                                    } else if (f8 == f) {
                                        dspVarA.e.g(dstVar9, 1.0f);
                                        dspVarA.e.g(dstVar10, -1.0f);
                                    } else {
                                        dspVarA.e.g(dstVar7, 1.0f);
                                        dspVarA.e.g(dstVar8, -1.0f);
                                        float f10 = (f9 / f6) / (f2 / f6);
                                        dspVarA.e.g(dstVar10, f10);
                                        dspVarA.e.g(dstVar9, -f10);
                                    }
                                    dsqVar.e(dspVarA);
                                } else {
                                    f2 = f8;
                                    i34 = i34;
                                    f3 = f;
                                }
                                dsyVar23 = dsyVar24;
                                f7 = f2;
                            }
                        } else {
                            if (dswVar.s) {
                                dsx[] dsxVarArr8 = dsyVar24.R;
                                arrayList2 = arrayList3;
                                dsqVar.m(dsxVarArr8[i3 + 1].h, dsxVarArr8[i3].h, 0, 4);
                            } else {
                                f8 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f8 == f) {
                                    dsx[] dsxVarArr9 = dsyVar24.R;
                                    dsqVar.m(dsxVarArr9[i3 + 1].h, dsxVarArr9[i3].h, 0, 8);
                                } else {
                                    if (dsyVar23 != null) {
                                        int i36 = i3 + 1;
                                        dsx[] dsxVarArr10 = dsyVar23.R;
                                        dstVar7 = dsxVarArr10[i3].h;
                                        dstVar8 = dsxVarArr10[i36].h;
                                        dsx[] dsxVarArr11 = dsyVar24.R;
                                        dstVar9 = dsxVarArr11[i3].h;
                                        dstVar10 = dsxVarArr11[i36].h;
                                        float f11 = f7;
                                        dspVarA = dsqVar.a();
                                        f2 = f8;
                                        f4 = f;
                                        dspVarA.b = f4;
                                        f3 = f4;
                                        if (f6 != f4) {
                                            dspVarA.e.g(dstVar7, 1.0f);
                                            dspVarA.e.g(dstVar8, -1.0f);
                                            dspVarA.e.g(dstVar10, 1.0f);
                                            dspVarA.e.g(dstVar9, -1.0f);
                                        } else {
                                            dspVarA.e.g(dstVar7, 1.0f);
                                            dspVarA.e.g(dstVar8, -1.0f);
                                            dspVarA.e.g(dstVar10, 1.0f);
                                            dspVarA.e.g(dstVar9, -1.0f);
                                        }
                                        dsqVar.e(dspVarA);
                                    } else {
                                        f2 = f8;
                                        i34 = i34;
                                        f3 = f;
                                    }
                                    dsyVar23 = dsyVar24;
                                    f7 = f2;
                                }
                            }
                            size = size;
                            i34 = i34;
                            f3 = f;
                        }
                        i34++;
                        arrayList3 = arrayList2;
                        size = size;
                        f = f3;
                    }
                }
                if (dsyVar18 == null || !(dsyVar18 == dsyVar19 || z13)) {
                    dsyVar = dsyVar18;
                    dsyVar2 = dsyVar19;
                    if (!z2) {
                        dsyVar3 = dsyVar;
                    } else if (dsyVar != null) {
                        int i37 = dswVar.j;
                        boolean z14 = i37 > 0 && dswVar.i == i37;
                        dsy dsyVar25 = dsyVar;
                        dsy dsyVar26 = dsyVar25;
                        while (dsyVar26 != null) {
                            dsy dsyVar27 = dsyVar26.an[i];
                            while (true) {
                                if (dsyVar27 == null) {
                                    if (dsyVar26 != dsyVar2) {
                                        dsyVar6 = dsyVar27;
                                        i8 = 8;
                                    }
                                    if (dsyVar26.ah != i8) {
                                        dsyVar25 = dsyVar26;
                                    } else {
                                        dsyVar25 = dsyVar25;
                                    }
                                    dsyVar26 = dsyVar6;
                                    z14 = z14;
                                } else if (dsyVar27.ah == 8) {
                                    dsyVar27 = dsyVar27.an[i];
                                }
                                int i38 = i3 + 1;
                                dsx[] dsxVarArr12 = dsyVar26.R;
                                dsx dsxVar17 = dsxVarArr12[i3];
                                dst dstVar13 = dsxVar17.h;
                                dsx dsxVar18 = dsxVar17.e;
                                dst dstVar14 = dsxVar18 != null ? dsxVar18.h : null;
                                if (dsyVar25 != dsyVar26) {
                                    dstVar14 = dsyVar25.R[i38].h;
                                } else if (dsyVar26 == dsyVar) {
                                    dsx dsxVar19 = dsyVar16.R[i3].e;
                                    dstVar14 = dsxVar19 != null ? dsxVar19.h : null;
                                }
                                int iB5 = dsxVar17.b();
                                int iB6 = dsxVarArr12[i38].b();
                                if (dsyVar27 != null) {
                                    dsxVar2 = dsyVar27.R[i3];
                                    dsyVar6 = dsyVar27;
                                    dstVar4 = dsxVar2.h;
                                } else {
                                    dsyVar6 = dsyVar27;
                                    dsxVar2 = dsyVar17.R[i38].e;
                                    dstVar4 = dsxVar2 != null ? dsxVar2.h : null;
                                }
                                dst dstVar15 = dsxVarArr12[i38].h;
                                if (dsxVar2 != null) {
                                    iB6 += dsxVar2.b();
                                }
                                int iB7 = iB5 + dsyVar25.R[i38].b();
                                if (dstVar13 == null || dstVar14 == null || dstVar4 == null || dstVar15 == null) {
                                    i8 = 8;
                                } else {
                                    if (dsyVar26 == dsyVar) {
                                        iB7 = dsyVar.R[i3].b();
                                    }
                                    int i39 = iB7;
                                    if (dsyVar26 == dsyVar2) {
                                        iB6 = dsyVar2.R[i38].b();
                                    }
                                    int i40 = true != z14 ? 5 : 8;
                                    i8 = 8;
                                    dsqVar.d(dstVar13, dstVar14, i39, 0.5f, dstVar4, dstVar15, iB6, i40);
                                }
                                if (dsyVar26.ah != i8) {
                                    dsyVar25 = dsyVar26;
                                } else {
                                    dsyVar25 = dsyVar25;
                                }
                                dsyVar26 = dsyVar6;
                                z14 = z14;
                            }
                        }
                    } else {
                        dsyVar3 = null;
                    }
                    int i41 = 8;
                    if (!z4 || dsyVar == null) {
                        dsqVar2 = dsqVar;
                        dsyVar3 = dsyVar3;
                    } else {
                        int i42 = i3 + 1;
                        int i43 = dswVar.j;
                        boolean z15 = i43 > 0 && dswVar.i == i43;
                        dsy dsyVar28 = dsyVar;
                        dsy dsyVar29 = dsyVar28;
                        while (dsyVar28 != null) {
                            dsy dsyVar30 = dsyVar28.an[i];
                            while (dsyVar30 != null && dsyVar30.ah == i41) {
                                dsyVar30 = dsyVar30.an[i];
                            }
                            if (dsyVar28 == dsyVar || dsyVar28 == dsyVar2 || dsyVar30 == null) {
                                z15 = z15;
                                dsyVar5 = dsyVar28;
                                dsyVar28 = dsyVar30;
                            } else {
                                if (dsyVar30 == dsyVar2) {
                                    dsyVar30 = null;
                                }
                                dsx[] dsxVarArr13 = dsyVar28.R;
                                dsx dsxVar20 = dsxVarArr13[i3];
                                dsy dsyVar31 = dsyVar28;
                                dst dstVar16 = dsxVar20.h;
                                dsx dsxVar21 = dsxVar20.e;
                                dsx[] dsxVarArr14 = dsyVar29.R;
                                dst dstVar17 = dsxVarArr14[i42].h;
                                int iB8 = dsxVar20.b();
                                int iB9 = dsxVarArr13[i42].b();
                                if (dsyVar30 != null) {
                                    dsxVar = dsyVar30.R[i3];
                                    dstVar2 = dsxVar.h;
                                    dstVar = dstVar16;
                                    dsx dsxVar22 = dsxVar.e;
                                    dstVar3 = dsxVar22 != null ? dsxVar22.h : null;
                                } else {
                                    dstVar = dstVar16;
                                    dsx dsxVar23 = dsyVar2.R[i3];
                                    dstVar2 = dsxVar23 != null ? dsxVar23.h : null;
                                    dst dstVar18 = dsxVarArr13[i42].h;
                                    dsxVar = dsxVar23;
                                    dstVar3 = dstVar18;
                                }
                                if (dsxVar != null) {
                                    iB9 += dsxVar.b();
                                }
                                int iB10 = iB8 + dsxVarArr14[i42].b();
                                int i44 = true != z15 ? 4 : 8;
                                if (dstVar == null || dstVar17 == null || dstVar2 == null || dstVar3 == null) {
                                    dsyVar5 = dsyVar31;
                                } else {
                                    dst dstVar19 = dstVar2;
                                    dsyVar5 = dsyVar31;
                                    dsqVar.d(dstVar, dstVar17, iB10, 0.5f, dstVar19, dstVar3, iB9, i44);
                                }
                                dsyVar28 = dsyVar30;
                            }
                            dsyVar29 = dsyVar5.ah != 8 ? dsyVar5 : dsyVar29;
                            i41 = 8;
                            z15 = z15;
                        }
                        dsqVar2 = dsqVar;
                        dsx dsxVar24 = dsyVar.R[i3];
                        dsx dsxVar25 = dsyVar16.R[i3].e;
                        dsx dsxVar26 = dsyVar2.R[i42];
                        dsx dsxVar27 = dsyVar17.R[i42].e;
                        if (dsxVar25 != null) {
                            if (dsyVar != dsyVar2) {
                                i7 = 5;
                                dsqVar2.m(dsxVar24.h, dsxVar25.h, dsxVar24.b(), 5);
                            } else {
                                i7 = 5;
                                if (dsxVar27 != null) {
                                    i6 = 5;
                                    dsqVar2.d(dsxVar24.h, dsxVar25.h, dsxVar24.b(), 0.5f, dsxVar26.h, dsxVar27.h, dsxVar26.b(), 5);
                                }
                            }
                            i6 = i7;
                        } else {
                            i6 = 5;
                        }
                        if (dsxVar27 != null && dsyVar != dsyVar2) {
                            dsqVar2.m(dsxVar26.h, dsxVar27.h, -dsxVar26.b(), i6);
                        }
                    }
                    dsyVar4 = dsyVar3;
                    if ((z2 || z4) && dsyVar4 != null && dsyVar4 != dsyVar2) {
                        i9 = i3 + 1;
                        dsxVarArr = dsyVar4.R;
                        dsx dsxVar28 = dsxVarArr[i3];
                        if (dsyVar2 == null) {
                            dsyVar2 = dsyVar4;
                        }
                        dsx[] dsxVarArr15 = dsyVar2.R;
                        dsxVar3 = dsxVarArr15[i9];
                        dsxVar4 = dsxVar28.e;
                        if (dsxVar4 != null) {
                            dstVar5 = dsxVar4.h;
                        } else {
                            dstVar5 = null;
                        }
                        dsxVar5 = dsxVar3.e;
                        if (dsxVar5 != null) {
                            dstVar6 = dsxVar5.h;
                        } else {
                            dstVar6 = null;
                        }
                        if (dsyVar17 == dsyVar2) {
                            dstVar11 = dstVar6;
                        } else {
                            dsxVar6 = dsyVar17.R[i9].e;
                            if (dsxVar6 != null) {
                                dstVar6 = dsxVar6.h;
                                dstVar11 = dstVar6;
                            }
                        }
                        if (dsyVar4 == dsyVar2) {
                            dsxVar3 = dsxVarArr[i9];
                        }
                        if (dstVar5 == null && dstVar11 != null) {
                            dsqVar2.d(dsxVar28.h, dstVar5, dsxVar28.b(), 0.5f, dstVar11, dsxVar3.h, dsxVarArr15[i9].b(), 5);
                        }
                    }
                } else {
                    int i45 = i3 + 1;
                    dsx dsxVar29 = dsyVar16.R[i3];
                    dsx dsxVar30 = dsyVar17.R[i45];
                    dsx dsxVar31 = dsxVar29.e;
                    dst dstVar20 = dsxVar31 != null ? dsxVar31.h : null;
                    dsx dsxVar32 = dsxVar30.e;
                    dst dstVar21 = dsxVar32 != null ? dsxVar32.h : null;
                    dsx dsxVar33 = dsyVar18.R[i3];
                    if (dsyVar19 != null) {
                        dsxVar30 = dsyVar19.R[i45];
                    }
                    if (dstVar20 == null || dstVar21 == null) {
                        dsyVar = dsyVar18;
                        dsyVar2 = dsyVar19;
                    } else {
                        dsyVar2 = dsyVar19;
                        dsyVar = dsyVar18;
                        dsqVar.d(dsxVar33.h, dstVar20, dsxVar33.b(), i == 0 ? dsyVar20.ae : dsyVar20.af, dstVar21, dsxVar30.h, dsxVar30.b(), 7);
                    }
                }
                dsqVar2 = dsqVar;
                dsyVar4 = dsyVar;
                if (z2) {
                    i9 = i3 + 1;
                    dsxVarArr = dsyVar4.R;
                    dsx dsxVar210 = dsxVarArr[i3];
                    if (dsyVar2 == null) {
                        dsyVar2 = dsyVar4;
                    }
                    dsx[] dsxVarArr16 = dsyVar2.R;
                    dsxVar3 = dsxVarArr16[i9];
                    dsxVar4 = dsxVar210.e;
                    if (dsxVar4 != null) {
                        dstVar5 = dsxVar4.h;
                    } else {
                        dstVar5 = null;
                    }
                    dsxVar5 = dsxVar3.e;
                    if (dsxVar5 != null) {
                        dstVar6 = dsxVar5.h;
                    } else {
                        dstVar6 = null;
                    }
                    if (dsyVar17 == dsyVar2) {
                        dstVar11 = dstVar6;
                    } else {
                        dsxVar6 = dsyVar17.R[i9].e;
                        if (dsxVar6 != null) {
                            dstVar6 = dsxVar6.h;
                            dstVar11 = dstVar6;
                        }
                    }
                    if (dsyVar4 == dsyVar2) {
                        dsxVar3 = dsxVarArr[i9];
                    }
                    if (dstVar5 == null) {
                    }
                } else {
                    i9 = i3 + 1;
                    dsxVarArr = dsyVar4.R;
                    dsx dsxVar211 = dsxVarArr[i3];
                    if (dsyVar2 == null) {
                        dsyVar2 = dsyVar4;
                    }
                    dsx[] dsxVarArr17 = dsyVar2.R;
                    dsxVar3 = dsxVarArr17[i9];
                    dsxVar4 = dsxVar211.e;
                    if (dsxVar4 != null) {
                        dstVar5 = dsxVar4.h;
                    } else {
                        dstVar5 = null;
                    }
                    dsxVar5 = dsxVar3.e;
                    if (dsxVar5 != null) {
                        dstVar6 = dsxVar5.h;
                    } else {
                        dstVar6 = null;
                    }
                    if (dsyVar17 == dsyVar2) {
                        dstVar11 = dstVar6;
                    } else {
                        dsxVar6 = dsyVar17.R[i9].e;
                        if (dsxVar6 != null) {
                            dstVar6 = dsxVar6.h;
                            dstVar11 = dstVar6;
                        }
                    }
                    if (dsyVar4 == dsyVar2) {
                        dsxVar3 = dsxVarArr[i9];
                    }
                    if (dstVar5 == null) {
                    }
                }
            } else {
                i5 = i14;
                dswVarArr2 = dswVarArr3;
            }
            i15 = i4 + 1;
            dszVar2 = dszVar;
            i14 = i5;
            dswVarArr3 = dswVarArr2;
            i13 = 2;
        }
    }

    public static final java.lang.Object g(ajcq ajcqVar, aoln aolnVar) throws java.lang.Throwable {
        try {
            if (ajcqVar.isDone()) {
                int i = dsc.c;
                return a.h(ajcqVar);
            }
            aosc aoscVar = new aosc(ajsz.ap(aolnVar), 1);
            aoscVar.z();
            ajcqVar.c(new aoch(ajcqVar, aoscVar, 1), defpackage.dsi.INSTANCE);
            aoscVar.d(new defpackage.aib(ajcqVar, 7));
            return aoscVar.k();
        } catch (java.util.concurrent.ExecutionException e) {
            throw h(e);
        }
    }

    public static final java.lang.Throwable h(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        aooh.c(cause);
        return cause;
    }
}
