package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dsz extends defpackage.dtf {
    public int a;
    public int ar;
    public int d;
    public final defpackage.aogc aH = new defpackage.aogc(this);
    public final defpackage.fxy aG = new defpackage.fxy(this);
    public defpackage.dtw aF = null;
    public boolean b = false;
    public final defpackage.dsq c = new defpackage.dsq();
    public int as = 0;
    public int at = 0;
    public defpackage.dsw[] au = new defpackage.dsw[4];
    public defpackage.dsw[] av = new defpackage.dsw[4];
    public int aw = 257;
    public boolean ax = false;
    public boolean ay = false;
    public java.lang.ref.WeakReference az = null;
    public java.lang.ref.WeakReference aA = null;
    public java.lang.ref.WeakReference aB = null;
    public java.lang.ref.WeakReference aC = null;
    final java.util.HashSet aD = new java.util.HashSet();
    public final defpackage.dtg aE = new defpackage.dtg();

    public static void X(defpackage.dsy dsyVar, defpackage.dtw dtwVar, defpackage.dtg dtgVar) {
        int i;
        int i2;
        if (dtwVar != null) {
            if (dsyVar.ah == 8 || (dsyVar instanceof defpackage.dtb) || (dsyVar instanceof defpackage.dsv)) {
                dtgVar.c = 0;
                dtgVar.d = 0;
                return;
            }
            dtgVar.i = dsyVar.M();
            dtgVar.j = dsyVar.N();
            dtgVar.a = dsyVar.j();
            dtgVar.b = dsyVar.h();
            dtgVar.g = false;
            dtgVar.h = 0;
            boolean z = dtgVar.i == 3;
            boolean z2 = dtgVar.j == 3;
            boolean z3 = z && dsyVar.X > 0.0f;
            boolean z4 = z2 && dsyVar.X > 0.0f;
            if (z && dsyVar.F(0) && dsyVar.s == 0 && !z3) {
                dtgVar.i = 2;
                if (z2 && dsyVar.t == 0) {
                    dtgVar.i = 1;
                }
                z = false;
            }
            if (z2 && dsyVar.F(1) && dsyVar.t == 0 && !z4) {
                dtgVar.j = 2;
                if (z && dsyVar.s == 0) {
                    dtgVar.j = 1;
                }
                z2 = false;
            }
            if (dsyVar.e()) {
                dtgVar.i = 1;
                z = false;
            }
            if (dsyVar.f()) {
                dtgVar.j = 1;
                z2 = false;
            }
            if (z3) {
                if (dsyVar.u[0] == 4) {
                    dtgVar.i = 1;
                } else if (!z2) {
                    if (dtgVar.j == 1) {
                        i2 = dtgVar.b;
                    } else {
                        dtgVar.i = 2;
                        dtwVar.a(dsyVar, dtgVar);
                        i2 = dtgVar.d;
                    }
                    dtgVar.i = 1;
                    dtgVar.a = (int) (dsyVar.X * i2);
                }
            }
            if (z4) {
                if (dsyVar.u[1] == 4) {
                    dtgVar.j = 1;
                } else if (!z) {
                    if (dtgVar.i == 1) {
                        i = dtgVar.a;
                    } else {
                        dtgVar.j = 2;
                        dtwVar.a(dsyVar, dtgVar);
                        i = dtgVar.c;
                    }
                    dtgVar.j = 1;
                    float f = i;
                    if (dsyVar.Y == -1) {
                        dtgVar.b = (int) (f / dsyVar.X);
                    } else {
                        dtgVar.b = (int) (dsyVar.X * f);
                    }
                }
            }
            dtwVar.a(dsyVar, dtgVar);
            dsyVar.C(dtgVar.c);
            dsyVar.x(dtgVar.d);
            dsyVar.F = dtgVar.f;
            dsyVar.u(dtgVar.e);
            dtgVar.h = 0;
            boolean z5 = dtgVar.g;
        }
    }

    private final void Z(defpackage.dsx dsxVar, defpackage.dst dstVar) {
        defpackage.dsq dsqVar = this.c;
        dsqVar.g(dstVar, dsqVar.b(dsxVar), 0, 5);
    }

    private final void aa(defpackage.dsx dsxVar, defpackage.dst dstVar) {
        defpackage.dsq dsqVar = this.c;
        dsqVar.g(dsqVar.b(dsxVar), dstVar, 0, 5);
    }

    private final void ab() {
        this.as = 0;
        this.at = 0;
    }

    @Override // defpackage.dsy
    public final void D(boolean z, boolean z2) {
        super.D(z, z2);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.dsy) this.aI.get(i)).D(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x023b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0246  */
    /* JADX WARN: Code duplicated, block: B:152:0x027b  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x02df  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:186:0x0308  */
    /* JADX WARN: Code duplicated, block: B:196:0x0324  */
    /* JADX WARN: Code duplicated, block: B:213:0x0369  */
    /* JADX WARN: Code duplicated, block: B:215:0x0370 A[LOOP:27: B:214:0x036e->B:215:0x0370, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0380  */
    /* JADX WARN: Code duplicated, block: B:219:0x0387 A[LOOP:28: B:218:0x0385->B:219:0x0387, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:225:0x03af A[LOOP:29: B:223:0x03a9->B:225:0x03af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:231:0x03d0 A[LOOP:30: B:229:0x03ca->B:231:0x03d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:237:0x03f1 A[LOOP:31: B:235:0x03eb->B:237:0x03f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x0403  */
    /* JADX WARN: Code duplicated, block: B:242:0x040a A[LOOP:32: B:241:0x0408->B:242:0x040a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x041a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0421 A[LOOP:33: B:245:0x041f->B:246:0x0421, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x0431  */
    /* JADX WARN: Code duplicated, block: B:250:0x0438 A[LOOP:34: B:249:0x0436->B:250:0x0438, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x0456  */
    /* JADX WARN: Code duplicated, block: B:256:0x0460 A[LOOP:35: B:254:0x045a->B:256:0x0460, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0477  */
    /* JADX WARN: Code duplicated, block: B:262:0x0481 A[LOOP:36: B:260:0x047b->B:262:0x0481, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x0498  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a2 A[LOOP:37: B:266:0x049c->B:268:0x04a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:274:0x04c2 A[LOOP:38: B:272:0x04bc->B:274:0x04c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:279:0x04db A[LOOP:39: B:278:0x04d9->B:279:0x04db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:293:0x0523  */
    /* JADX WARN: Code duplicated, block: B:295:0x052a  */
    /* JADX WARN: Code duplicated, block: B:297:0x0533  */
    /* JADX WARN: Code duplicated, block: B:299:0x053d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0546  */
    /* JADX WARN: Code duplicated, block: B:303:0x0549  */
    /* JADX WARN: Code duplicated, block: B:306:0x0550  */
    /* JADX WARN: Code duplicated, block: B:307:0x0558  */
    /* JADX WARN: Code duplicated, block: B:310:0x0560  */
    /* JADX WARN: Code duplicated, block: B:312:0x0569  */
    /* JADX WARN: Code duplicated, block: B:314:0x0573  */
    /* JADX WARN: Code duplicated, block: B:316:0x057c  */
    /* JADX WARN: Code duplicated, block: B:318:0x057f  */
    /* JADX WARN: Code duplicated, block: B:321:0x0585  */
    /* JADX WARN: Code duplicated, block: B:322:0x058d  */
    /* JADX WARN: Code duplicated, block: B:328:0x059e  */
    /* JADX WARN: Code duplicated, block: B:333:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:334:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:336:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:341:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:342:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:344:0x05e1 A[PHI: r4
      0x05e1: PHI (r4v1 int) = (r4v0 int), (r4v37 int) binds: [B:136:0x022d, B:141:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:519:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:521:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:524:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:528:0x0902 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:533:0x090f A[LOOP:14: B:532:0x090d->B:533:0x090f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:536:0x0940  */
    /* JADX WARN: Code duplicated, block: B:540:0x0954  */
    /* JADX WARN: Code duplicated, block: B:545:0x0976  */
    /* JADX WARN: Code duplicated, block: B:546:0x0984  */
    /* JADX WARN: Code duplicated, block: B:549:0x0997  */
    /* JADX WARN: Code duplicated, block: B:550:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:552:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:554:0x09ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:557:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:560:0x09c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:565:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:566:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:668:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x054a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x0580 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // defpackage.dtf
    public final void T() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean zW;
        int size;
        int i6;
        boolean z3;
        int iMax;
        ?? r5;
        boolean z4;
        int iMax2;
        ?? r0;
        int i7;
        ?? r4;
        ?? r1;
        int i8;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        defpackage.dsy dsyVar;
        boolean z5;
        int i9;
        int i10;
        int i11;
        java.util.ArrayList arrayList;
        defpackage.dsv dsvVar;
        boolean z6;
        defpackage.dtw dtwVar;
        java.util.ArrayList arrayList2;
        int size2;
        int i12;
        java.util.ArrayList arrayList3;
        int i13;
        java.util.ArrayList arrayList4;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        java.util.ArrayList arrayList7;
        java.util.ArrayList arrayList8;
        int i14;
        int i15;
        int i16;
        java.util.ArrayList arrayList9;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        java.util.HashSet hashSet3;
        dtq dtqVar;
        int i17;
        java.util.HashSet hashSet4;
        java.util.HashSet hashSet5;
        java.util.HashSet hashSet6;
        java.util.HashSet hashSet7;
        dtq dtqVar2;
        int i18;
        int i19;
        int i20;
        dtq dtqVar3;
        dtq dtqVar4;
        char c;
        int iJ;
        int iH;
        int size3;
        int i21;
        int i22;
        dtq dtqVar5;
        int iA;
        int size4;
        int i23;
        int i24;
        dtq dtqVar6;
        int iA2;
        int[] iArr;
        int size5;
        int i25;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.util.Iterator it3;
        java.util.Iterator it4;
        int size6;
        int i26;
        int size7;
        int i27;
        int size8;
        int i28;
        java.util.Iterator it5;
        java.util.Iterator it6;
        java.util.Iterator it7;
        int size9;
        int i29;
        int size10;
        int i30;
        defpackage.dsy dsyVar2;
        boolean z7;
        defpackage.dsv dsvVar2;
        defpackage.dtb dtbVar;
        defpackage.dsy dsyVar3;
        boolean z8;
        boolean z9;
        this.Z = 0;
        this.aa = 0;
        this.ax = false;
        this.ay = false;
        int size11 = this.aI.size();
        int iMax7 = java.lang.Math.max(0, j());
        int iMax8 = java.lang.Math.max(0, h());
        int[] iArr2 = this.aq;
        int i31 = iArr2[1];
        int i32 = iArr2[0];
        int i33 = -1;
        if (this.a == 0 && (this.aw & 1) == 1) {
            defpackage.dtw dtwVar2 = this.aF;
            int iM = M();
            int iN = N();
            defpackage.dtl.b = 0;
            defpackage.dtl.c = 0;
            t();
            java.util.ArrayList arrayList10 = this.aI;
            int size12 = arrayList10.size();
            for (int i34 = 0; i34 < size12; i34++) {
                ((defpackage.dsy) arrayList10.get(i34)).t();
            }
            boolean z10 = this.b;
            if (iM == 1) {
                v(0, j());
            } else {
                this.J.e(0);
                this.Z = 0;
            }
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i35 < size12) {
                defpackage.dsy dsyVar4 = (defpackage.dsy) arrayList10.get(i35);
                if (dsyVar4 instanceof defpackage.dtb) {
                    defpackage.dtb dtbVar2 = (defpackage.dtb) dsyVar4;
                    if (dtbVar2.ar == 1) {
                        int i36 = dtbVar2.b;
                        if (i36 != i33) {
                            dtbVar2.a(i36);
                        } else if (dtbVar2.c != i33 && e()) {
                            dtbVar2.a(j() - dtbVar2.c);
                        } else if (e()) {
                            dtbVar2.a((int) ((dtbVar2.a * j()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((dsyVar4 instanceof defpackage.dsv) && ((defpackage.dsv) dsyVar4).a() == 0) {
                    z12 = true;
                }
                i35++;
                i33 = -1;
                z11 = z11;
                z12 = z12;
            }
            if (z11) {
                for (int i37 = 0; i37 < size12; i37++) {
                    defpackage.dsy dsyVar5 = (defpackage.dsy) arrayList10.get(i37);
                    if (dsyVar5 instanceof defpackage.dtb) {
                        defpackage.dtb dtbVar3 = (defpackage.dtb) dsyVar5;
                        if (dtbVar3.ar == 1) {
                            defpackage.dtl.a(0, dtbVar3, dtwVar2, z10);
                        }
                    }
                }
            }
            int i38 = 0;
            defpackage.dtl.a(0, this, dtwVar2, z10);
            if (z12) {
                for (int i39 = 0; i39 < size12; i39++) {
                    defpackage.dsy dsyVar6 = (defpackage.dsy) arrayList10.get(i39);
                    if (dsyVar6 instanceof defpackage.dsv) {
                        defpackage.dsv dsvVar3 = (defpackage.dsv) dsyVar6;
                        if (dsvVar3.a() == 0) {
                            defpackage.dtl.d(dsvVar3, dtwVar2, 0, z10);
                        }
                    }
                }
            }
            if (iN == 1) {
                w(0, h());
                z8 = false;
                z9 = false;
            } else {
                this.K.e(0);
                this.aa = 0;
                z8 = false;
                z9 = false;
                i38 = 0;
            }
            while (i38 < size12) {
                defpackage.dsy dsyVar7 = (defpackage.dsy) arrayList10.get(i38);
                if (dsyVar7 instanceof defpackage.dtb) {
                    defpackage.dtb dtbVar4 = (defpackage.dtb) dsyVar7;
                    if (dtbVar4.ar == 0) {
                        int i40 = dtbVar4.b;
                        if (i40 != -1) {
                            dtbVar4.a(i40);
                        } else if (dtbVar4.c != -1 && f()) {
                            dtbVar4.a(h() - dtbVar4.c);
                        } else if (f()) {
                            dtbVar4.a((int) ((dtbVar4.a * h()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else if ((dsyVar7 instanceof defpackage.dsv) && ((defpackage.dsv) dsyVar7).a() == 1) {
                    z9 = true;
                }
                i38++;
            }
            if (z8) {
                for (int i41 = 0; i41 < size12; i41++) {
                    defpackage.dsy dsyVar8 = (defpackage.dsy) arrayList10.get(i41);
                    if (dsyVar8 instanceof defpackage.dtb) {
                        defpackage.dtb dtbVar5 = (defpackage.dtb) dsyVar8;
                        if (dtbVar5.ar == 0) {
                            defpackage.dtl.b(1, dtbVar5, dtwVar2);
                        }
                    }
                }
            }
            defpackage.dtl.b(0, this, dtwVar2);
            if (z9) {
                for (int i42 = 0; i42 < size12; i42++) {
                    defpackage.dsy dsyVar9 = (defpackage.dsy) arrayList10.get(i42);
                    if (dsyVar9 instanceof defpackage.dsv) {
                        defpackage.dsv dsvVar4 = (defpackage.dsv) dsyVar9;
                        if (dsvVar4.a() == 1) {
                            defpackage.dtl.d(dsvVar4, dtwVar2, 1, z10);
                        }
                    }
                }
            }
            for (int i43 = 0; i43 < size12; i43++) {
                defpackage.dsy dsyVar10 = (defpackage.dsy) arrayList10.get(i43);
                if (dsyVar10.J() && defpackage.dtl.c(dsyVar10)) {
                    X(dsyVar10, dtwVar2, defpackage.dtl.a);
                    if (!(dsyVar10 instanceof defpackage.dtb)) {
                        defpackage.dtl.a(0, dsyVar10, dtwVar2, z10);
                        defpackage.dtl.b(0, dsyVar10, dtwVar2);
                    } else if (((defpackage.dtb) dsyVar10).ar == 0) {
                        defpackage.dtl.b(0, dsyVar10, dtwVar2);
                    } else {
                        defpackage.dtl.a(0, dsyVar10, dtwVar2, z10);
                    }
                }
            }
            for (int i44 = 0; i44 < size11; i44++) {
                defpackage.dsy dsyVar11 = (defpackage.dsy) this.aI.get(i44);
                if (dsyVar11.J() && !(dsyVar11 instanceof defpackage.dtb) && !(dsyVar11 instanceof defpackage.dsv) && !(dsyVar11 instanceof defpackage.dte)) {
                    boolean z13 = dsyVar11.G;
                    int iL = dsyVar11.L(0);
                    int iL2 = dsyVar11.L(1);
                    if (iL != 3 || dsyVar11.s == 1 || iL2 != 3 || dsyVar11.t == 1) {
                        X(dsyVar11, this.aF, new defpackage.dtg());
                    }
                }
            }
        }
        if (size11 <= 2) {
            i = size11;
            i2 = iMax7;
            i3 = i31;
            i4 = iMax8;
            z = false;
            break;
        }
        if (i32 == 2) {
            if ((this.aw & 1024) == 1024) {
                dtwVar = this.aF;
                arrayList2 = this.aI;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        dsyVar3 = (defpackage.dsy) arrayList2.get(i12);
                        if (dum.d(M(), N(), dsyVar3.M(), dsyVar3.N()) || (dsyVar3 instanceof dta)) {
                            i2 = iMax7;
                            i32 = i32;
                            i3 = i31;
                            i = size11;
                            z = false;
                            i4 = iMax8;
                            break;
                        }
                        i12++;
                    } else {
                        arrayList3 = null;
                        i13 = 0;
                        arrayList4 = null;
                        arrayList5 = null;
                        arrayList6 = null;
                        arrayList7 = null;
                        arrayList8 = null;
                        while (i13 < size2) {
                            int i45 = i13;
                            dsyVar2 = (defpackage.dsy) arrayList2.get(i13);
                            int i46 = size11;
                            int i47 = iMax8;
                            int i48 = i31;
                            int i49 = iMax7;
                            if (!dum.d(M(), N(), dsyVar2.M(), dsyVar2.N())) {
                                X(dsyVar2, dtwVar, this.aE);
                            }
                            z7 = dsyVar2 instanceof defpackage.dtb;
                            if (z7) {
                                dtbVar = (defpackage.dtb) dsyVar2;
                                if (dtbVar.ar == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new java.util.ArrayList();
                                    }
                                    arrayList5.add(dtbVar);
                                }
                                if (dtbVar.ar == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new java.util.ArrayList();
                                    }
                                    arrayList3.add(dtbVar);
                                }
                            }
                            if (dsyVar2 instanceof defpackage.dtc) {
                                if (dsyVar2 instanceof defpackage.dsv) {
                                    dsvVar2 = (defpackage.dsv) dsyVar2;
                                    if (dsvVar2.a() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new java.util.ArrayList();
                                        }
                                        arrayList4.add(dsvVar2);
                                    }
                                    if (dsvVar2.a() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new java.util.ArrayList();
                                        }
                                        arrayList6.add(dsvVar2);
                                    }
                                } else {
                                    defpackage.dtc dtcVar = (defpackage.dtc) dsyVar2;
                                    if (arrayList4 == null) {
                                        arrayList4 = new java.util.ArrayList();
                                    }
                                    arrayList4.add(dtcVar);
                                    if (arrayList6 == null) {
                                        arrayList6 = new java.util.ArrayList();
                                    }
                                    arrayList6.add(dtcVar);
                                }
                            }
                            if (dsyVar2.J.e == null && dsyVar2.L.e == null && !z7 && !(dsyVar2 instanceof defpackage.dsv)) {
                                if (arrayList7 == null) {
                                    arrayList7 = new java.util.ArrayList();
                                }
                                arrayList7.add(dsyVar2);
                            }
                            if (dsyVar2.K.e != null && dsyVar2.M.e == null && dsyVar2.N.e == null && !z7 && !(dsyVar2 instanceof defpackage.dsv)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new java.util.ArrayList();
                                }
                                arrayList8.add(dsyVar2);
                            }
                            i13 = i45 + 1;
                            size11 = i46;
                            iMax8 = i47;
                            i31 = i48;
                            iMax7 = i49;
                        }
                        i14 = iMax7;
                        i15 = iMax8;
                        i16 = i31;
                        i = size11;
                        arrayList9 = new java.util.ArrayList();
                        if (arrayList3 != null) {
                            size10 = arrayList3.size();
                            while (i30 < size10) {
                                dum.b((defpackage.dtb) arrayList3.get(i30), 0, arrayList9, (dtq) null);
                            }
                        }
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            while (i29 < size9) {
                                defpackage.dtc dtcVar2 = (defpackage.dtc) arrayList4.get(i29);
                                dtq dtqVarB = dum.b(dtcVar2, 0, arrayList9, (dtq) null);
                                dtcVar2.T(arrayList9, 0, dtqVarB);
                                dtqVarB.b(arrayList9);
                            }
                        }
                        hashSet = K(2).a;
                        if (hashSet != null) {
                            it7 = hashSet.iterator();
                            while (it7.hasNext()) {
                                dum.b(((defpackage.dsx) it7.next()).d, 0, arrayList9, (dtq) null);
                            }
                        }
                        hashSet2 = K(4).a;
                        if (hashSet2 != null) {
                            it6 = hashSet2.iterator();
                            while (it6.hasNext()) {
                                dum.b(((defpackage.dsx) it6.next()).d, 0, arrayList9, (dtq) null);
                            }
                        }
                        hashSet3 = K(7).a;
                        if (hashSet3 != null) {
                            it5 = hashSet3.iterator();
                            while (it5.hasNext()) {
                                dum.b(((defpackage.dsx) it5.next()).d, 0, arrayList9, (dtq) null);
                            }
                        }
                        dtqVar = null;
                        i17 = 0;
                        if (arrayList7 != null) {
                            size8 = arrayList7.size();
                            i28 = 0;
                            while (i28 < size8) {
                                dum.b((defpackage.dsy) arrayList7.get(i28), i17, arrayList9, dtqVar);
                                i28++;
                                dtqVar = null;
                                i17 = 0;
                            }
                        }
                        if (arrayList5 != null) {
                            size7 = arrayList5.size();
                            while (i27 < size7) {
                                dum.b((defpackage.dtb) arrayList5.get(i27), 1, arrayList9, (dtq) null);
                            }
                        }
                        if (arrayList6 != null) {
                            size6 = arrayList6.size();
                            while (i26 < size6) {
                                defpackage.dtc dtcVar3 = (defpackage.dtc) arrayList6.get(i26);
                                dtq dtqVarB2 = dum.b(dtcVar3, 1, arrayList9, (dtq) null);
                                dtcVar3.T(arrayList9, 1, dtqVarB2);
                                dtqVarB2.b(arrayList9);
                            }
                        }
                        hashSet4 = K(3).a;
                        if (hashSet4 != null) {
                            it4 = hashSet4.iterator();
                            while (it4.hasNext()) {
                                dum.b(((defpackage.dsx) it4.next()).d, 1, arrayList9, (dtq) null);
                            }
                        }
                        hashSet5 = K(6).a;
                        if (hashSet5 != null) {
                            it3 = hashSet5.iterator();
                            while (it3.hasNext()) {
                                dum.b(((defpackage.dsx) it3.next()).d, 1, arrayList9, (dtq) null);
                            }
                        }
                        hashSet6 = K(5).a;
                        if (hashSet6 != null) {
                            it2 = hashSet6.iterator();
                            while (it2.hasNext()) {
                                dum.b(((defpackage.dsx) it2.next()).d, 1, arrayList9, (dtq) null);
                            }
                        }
                        hashSet7 = K(7).a;
                        if (hashSet7 != null) {
                            it = hashSet7.iterator();
                            while (it.hasNext()) {
                                dum.b(((defpackage.dsx) it.next()).d, 1, arrayList9, (dtq) null);
                            }
                        }
                        dtqVar2 = null;
                        i18 = 1;
                        if (arrayList8 != null) {
                            size5 = arrayList8.size();
                            i25 = 0;
                            while (i25 < size5) {
                                dum.b((defpackage.dsy) arrayList8.get(i25), i18, arrayList9, dtqVar2);
                                i25++;
                                dtqVar2 = null;
                                i18 = 1;
                            }
                        }
                        while (i19 < size2) {
                            defpackage.dsy dsyVar12 = (defpackage.dsy) arrayList2.get(i19);
                            iArr = dsyVar12.aq;
                            if (iArr[0] != 3 && iArr[1] == 3) {
                                dtq dtqVarC = dum.c(arrayList9, dsyVar12.ao);
                                dtq dtqVarC2 = dum.c(arrayList9, dsyVar12.ap);
                                if (dtqVarC != null && dtqVarC2 != null) {
                                    dtqVarC.c(0, dtqVarC2);
                                    dtqVarC2.d = 2;
                                    arrayList9.remove(dtqVarC);
                                }
                            }
                        }
                        i20 = 1;
                        if (arrayList9.size() > 1) {
                            if (M() == 2) {
                                size4 = arrayList9.size();
                                dtqVar3 = null;
                                i23 = 0;
                                i24 = 0;
                                while (i23 < size4) {
                                    dtqVar6 = (dtq) arrayList9.get(i23);
                                    if (dtqVar6.d == i20) {
                                        iA2 = dtqVar6.a(this.c, 0);
                                        if (iA2 > i24) {
                                            dtqVar3 = dtqVar6;
                                        }
                                        if (iA2 > i24) {
                                            i24 = iA2;
                                        }
                                    }
                                    i23++;
                                    i20 = 1;
                                }
                                if (dtqVar3 != null) {
                                    P(1);
                                    C(i24);
                                } else {
                                    dtqVar3 = null;
                                }
                            } else {
                                dtqVar3 = null;
                            }
                            if (N() == 2) {
                                size3 = arrayList9.size();
                                dtqVar4 = null;
                                i22 = 0;
                                while (i21 < size3) {
                                    dtqVar5 = (dtq) arrayList9.get(i21);
                                    if (dtqVar5.d == 0) {
                                        iA = dtqVar5.a(this.c, 1);
                                        if (iA > i22) {
                                            dtqVar4 = dtqVar5;
                                        }
                                        if (iA > i22) {
                                            i22 = iA;
                                        }
                                    }
                                }
                                if (dtqVar4 != null) {
                                    Q(1);
                                    x(i22);
                                } else {
                                    dtqVar4 = null;
                                }
                            } else {
                                dtqVar4 = null;
                            }
                            if (dtqVar3 == null || dtqVar4 != null) {
                                c = 2;
                                if (i32 == 2) {
                                    if (i14 < j() || i14 <= 0) {
                                        iJ = j();
                                    } else {
                                        C(i14);
                                        this.ax = true;
                                        iJ = i14;
                                    }
                                    i32 = 2;
                                    c = 2;
                                } else {
                                    iJ = i14;
                                }
                                if (i16 == c) {
                                    if (i15 < h() || i15 <= 0) {
                                        iH = h();
                                    } else {
                                        x(i15);
                                        this.ay = true;
                                        iH = i15;
                                    }
                                    i16 = 2;
                                } else {
                                    iH = i15;
                                }
                                i2 = iJ;
                                i4 = iH;
                                i32 = i32;
                                i3 = i16;
                                z = true;
                                break;
                            }
                        }
                        i4 = i15;
                        i3 = i16;
                        i2 = i14;
                    }
                }
            } else {
                i = size11;
                i2 = iMax7;
                i3 = i31;
                i4 = iMax8;
            }
            z = false;
            break;
        } else {
            if (i31 != 2) {
                i2 = iMax7;
                i32 = i32;
                i3 = i31;
                i = size11;
                z = false;
                i4 = iMax8;
                break;
            }
            i31 = 2;
            if ((this.aw & 1024) == 1024) {
                dtwVar = this.aF;
                arrayList2 = this.aI;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        dsyVar3 = (defpackage.dsy) arrayList2.get(i12);
                        if (dum.d(M(), N(), dsyVar3.M(), dsyVar3.N())) {
                        }
                        i2 = iMax7;
                        i32 = i32;
                        i3 = i31;
                        i = size11;
                        z = false;
                        i4 = iMax8;
                        break;
                    }
                    arrayList3 = null;
                    i13 = 0;
                    arrayList4 = null;
                    arrayList5 = null;
                    arrayList6 = null;
                    arrayList7 = null;
                    arrayList8 = null;
                    while (i13 < size2) {
                        int i410 = i13;
                        dsyVar2 = (defpackage.dsy) arrayList2.get(i13);
                        int i411 = size11;
                        int i412 = iMax8;
                        int i413 = i31;
                        int i414 = iMax7;
                        if (!dum.d(M(), N(), dsyVar2.M(), dsyVar2.N())) {
                            X(dsyVar2, dtwVar, this.aE);
                        }
                        z7 = dsyVar2 instanceof defpackage.dtb;
                        if (z7) {
                            dtbVar = (defpackage.dtb) dsyVar2;
                            if (dtbVar.ar == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new java.util.ArrayList();
                                }
                                arrayList5.add(dtbVar);
                            }
                            if (dtbVar.ar == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new java.util.ArrayList();
                                }
                                arrayList3.add(dtbVar);
                            }
                        }
                        if (dsyVar2 instanceof defpackage.dtc) {
                            if (dsyVar2 instanceof defpackage.dsv) {
                                dsvVar2 = (defpackage.dsv) dsyVar2;
                                if (dsvVar2.a() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new java.util.ArrayList();
                                    }
                                    arrayList4.add(dsvVar2);
                                }
                                if (dsvVar2.a() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new java.util.ArrayList();
                                    }
                                    arrayList6.add(dsvVar2);
                                }
                            } else {
                                defpackage.dtc dtcVar4 = (defpackage.dtc) dsyVar2;
                                if (arrayList4 == null) {
                                    arrayList4 = new java.util.ArrayList();
                                }
                                arrayList4.add(dtcVar4);
                                if (arrayList6 == null) {
                                    arrayList6 = new java.util.ArrayList();
                                }
                                arrayList6.add(dtcVar4);
                            }
                        }
                        if (dsyVar2.J.e == null) {
                            if (arrayList7 == null) {
                                arrayList7 = new java.util.ArrayList();
                            }
                            arrayList7.add(dsyVar2);
                        }
                        if (dsyVar2.K.e != null) {
                        }
                        i13 = i410 + 1;
                        size11 = i411;
                        iMax8 = i412;
                        i31 = i413;
                        iMax7 = i414;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i31;
                    i = size11;
                    arrayList9 = new java.util.ArrayList();
                    if (arrayList3 != null) {
                        size10 = arrayList3.size();
                        for (i30 = 0; i30 < size10; i30++) {
                            dum.b((defpackage.dtb) arrayList3.get(i30), 0, arrayList9, (dtq) null);
                        }
                    }
                    if (arrayList4 != null) {
                        size9 = arrayList4.size();
                        for (i29 = 0; i29 < size9; i29++) {
                            defpackage.dtc dtcVar5 = (defpackage.dtc) arrayList4.get(i29);
                            dtq dtqVarB3 = dum.b(dtcVar5, 0, arrayList9, (dtq) null);
                            dtcVar5.T(arrayList9, 0, dtqVarB3);
                            dtqVarB3.b(arrayList9);
                        }
                    }
                    hashSet = K(2).a;
                    if (hashSet != null) {
                        it7 = hashSet.iterator();
                        while (it7.hasNext()) {
                            dum.b(((defpackage.dsx) it7.next()).d, 0, arrayList9, (dtq) null);
                        }
                    }
                    hashSet2 = K(4).a;
                    if (hashSet2 != null) {
                        it6 = hashSet2.iterator();
                        while (it6.hasNext()) {
                            dum.b(((defpackage.dsx) it6.next()).d, 0, arrayList9, (dtq) null);
                        }
                    }
                    hashSet3 = K(7).a;
                    if (hashSet3 != null) {
                        it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            dum.b(((defpackage.dsx) it5.next()).d, 0, arrayList9, (dtq) null);
                        }
                    }
                    dtqVar = null;
                    i17 = 0;
                    if (arrayList7 != null) {
                        size8 = arrayList7.size();
                        i28 = 0;
                        while (i28 < size8) {
                            dum.b((defpackage.dsy) arrayList7.get(i28), i17, arrayList9, dtqVar);
                            i28++;
                            dtqVar = null;
                            i17 = 0;
                        }
                    }
                    if (arrayList5 != null) {
                        size7 = arrayList5.size();
                        for (i27 = 0; i27 < size7; i27++) {
                            dum.b((defpackage.dtb) arrayList5.get(i27), 1, arrayList9, (dtq) null);
                        }
                    }
                    if (arrayList6 != null) {
                        size6 = arrayList6.size();
                        for (i26 = 0; i26 < size6; i26++) {
                            defpackage.dtc dtcVar6 = (defpackage.dtc) arrayList6.get(i26);
                            dtq dtqVarB4 = dum.b(dtcVar6, 1, arrayList9, (dtq) null);
                            dtcVar6.T(arrayList9, 1, dtqVarB4);
                            dtqVarB4.b(arrayList9);
                        }
                    }
                    hashSet4 = K(3).a;
                    if (hashSet4 != null) {
                        it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            dum.b(((defpackage.dsx) it4.next()).d, 1, arrayList9, (dtq) null);
                        }
                    }
                    hashSet5 = K(6).a;
                    if (hashSet5 != null) {
                        it3 = hashSet5.iterator();
                        while (it3.hasNext()) {
                            dum.b(((defpackage.dsx) it3.next()).d, 1, arrayList9, (dtq) null);
                        }
                    }
                    hashSet6 = K(5).a;
                    if (hashSet6 != null) {
                        it2 = hashSet6.iterator();
                        while (it2.hasNext()) {
                            dum.b(((defpackage.dsx) it2.next()).d, 1, arrayList9, (dtq) null);
                        }
                    }
                    hashSet7 = K(7).a;
                    if (hashSet7 != null) {
                        it = hashSet7.iterator();
                        while (it.hasNext()) {
                            dum.b(((defpackage.dsx) it.next()).d, 1, arrayList9, (dtq) null);
                        }
                    }
                    dtqVar2 = null;
                    i18 = 1;
                    if (arrayList8 != null) {
                        size5 = arrayList8.size();
                        i25 = 0;
                        while (i25 < size5) {
                            dum.b((defpackage.dsy) arrayList8.get(i25), i18, arrayList9, dtqVar2);
                            i25++;
                            dtqVar2 = null;
                            i18 = 1;
                        }
                    }
                    for (i19 = 0; i19 < size2; i19++) {
                        defpackage.dsy dsyVar13 = (defpackage.dsy) arrayList2.get(i19);
                        iArr = dsyVar13.aq;
                        if (iArr[0] != 3) {
                        }
                    }
                    i20 = 1;
                    if (arrayList9.size() > 1) {
                        if (M() == 2) {
                            size4 = arrayList9.size();
                            dtqVar3 = null;
                            i23 = 0;
                            i24 = 0;
                            while (i23 < size4) {
                                dtqVar6 = (dtq) arrayList9.get(i23);
                                if (dtqVar6.d == i20) {
                                    iA2 = dtqVar6.a(this.c, 0);
                                    if (iA2 > i24) {
                                        dtqVar3 = dtqVar6;
                                    }
                                    if (iA2 > i24) {
                                        i24 = iA2;
                                    }
                                }
                                i23++;
                                i20 = 1;
                            }
                            if (dtqVar3 != null) {
                                P(1);
                                C(i24);
                            } else {
                                dtqVar3 = null;
                            }
                        } else {
                            dtqVar3 = null;
                        }
                        if (N() == 2) {
                            size3 = arrayList9.size();
                            dtqVar4 = null;
                            i22 = 0;
                            for (i21 = 0; i21 < size3; i21++) {
                                dtqVar5 = (dtq) arrayList9.get(i21);
                                if (dtqVar5.d == 0) {
                                    iA = dtqVar5.a(this.c, 1);
                                    if (iA > i22) {
                                        dtqVar4 = dtqVar5;
                                    }
                                    if (iA > i22) {
                                        i22 = iA;
                                    }
                                }
                            }
                            if (dtqVar4 != null) {
                                Q(1);
                                x(i22);
                            } else {
                                dtqVar4 = null;
                            }
                        } else {
                            dtqVar4 = null;
                        }
                        if (dtqVar3 == null) {
                        }
                        c = 2;
                        if (i32 == 2) {
                            if (i14 < j()) {
                                iJ = j();
                            } else {
                                iJ = j();
                            }
                            i32 = 2;
                            c = 2;
                        } else {
                            iJ = i14;
                        }
                        if (i16 == c) {
                            if (i15 < h()) {
                                iH = h();
                            } else {
                                iH = h();
                            }
                            i16 = 2;
                        } else {
                            iH = i15;
                        }
                        i2 = iJ;
                        i4 = iH;
                        i32 = i32;
                        i3 = i16;
                        z = true;
                        break;
                    }
                    i4 = i15;
                    i3 = i16;
                    i2 = i14;
                    i12++;
                }
            } else {
                i = size11;
                i2 = iMax7;
                i3 = i31;
                i4 = iMax8;
            }
            z = false;
            break;
        }
        int i50 = 64;
        boolean z14 = W(64) || W(128);
        defpackage.dsq dsqVar = this.c;
        dsqVar.f = false;
        dsqVar.g = false;
        if (this.aw != 0 && z14) {
            dsqVar.g = true;
        }
        java.util.ArrayList arrayList11 = this.aI;
        boolean z15 = M() == 2 || N() == 2;
        ab();
        int i51 = i;
        for (int i52 = 0; i52 < i51; i52++) {
            defpackage.dsy dsyVar14 = (defpackage.dsy) this.aI.get(i52);
            if (dsyVar14 instanceof defpackage.dtf) {
                ((defpackage.dtf) dsyVar14).T();
            }
        }
        boolean z16 = z;
        int i53 = 1;
        int i54 = 0;
        while (i53 != 0) {
            int i55 = i54 + 1;
            try {
                dsqVar.k();
                ab();
                q(dsqVar);
                for (int i56 = 0; i56 < i51; i56++) {
                    ((defpackage.dsy) this.aI.get(i56)).q(dsqVar);
                }
                boolean zW2 = W(i50);
                b(dsqVar, zW2);
                int size13 = this.aI.size();
                int i57 = 0;
                boolean z17 = false;
                while (i57 < size13) {
                    try {
                        defpackage.dsy dsyVar15 = (defpackage.dsy) this.aI.get(i57);
                        i9 = i55;
                        try {
                            dsyVar15.y(0, false);
                            dsyVar15.y(1, false);
                            z17 |= dsyVar15 instanceof defpackage.dsv;
                            i57++;
                            i55 = i9;
                        } catch (java.lang.Exception e) {
                            e = e;
                            z2 = z15;
                            i5 = i9;
                            e.printStackTrace();
                            java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                            boolean[] zArr = defpackage.dtd.a;
                            zArr[2] = false;
                            zW = W(64);
                            R(zW);
                            size = this.aI.size();
                            i6 = 0;
                            z3 = false;
                            while (i6 < size) {
                                dsyVar = (defpackage.dsy) this.aI.get(i6);
                                dsyVar.R(zW);
                                defpackage.dsq dsqVar2 = dsqVar;
                                if (dsyVar.k == -1) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                z3 = z5 | z3;
                                i6++;
                                dsqVar = dsqVar2;
                            }
                            defpackage.dsq dsqVar3 = dsqVar;
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (i8 = 0; i8 < i51; i8++) {
                                    defpackage.dsy dsyVar16 = (defpackage.dsy) this.aI.get(i8);
                                    iMax3 = java.lang.Math.max(iMax3, dsyVar16.Z + dsyVar16.j());
                                    iMax4 = java.lang.Math.max(iMax4, dsyVar16.aa + dsyVar16.h());
                                }
                                iMax5 = java.lang.Math.max(this.ac, iMax3);
                                iMax6 = java.lang.Math.max(this.ad, iMax4);
                                if (i32 == 2) {
                                    C(iMax5);
                                    this.aq[0] = 2;
                                    z16 = true;
                                    z3 = true;
                                }
                                if (i3 == 2) {
                                    x(iMax6);
                                    this.aq[1] = 2;
                                    z16 = true;
                                    z3 = true;
                                }
                            }
                            iMax = java.lang.Math.max(this.ac, j());
                            if (iMax > j()) {
                                C(iMax);
                                r5 = 1;
                                this.aq[0] = 1;
                                z16 = true;
                                z4 = true;
                            } else {
                                r5 = 1;
                                z4 = z3;
                            }
                            iMax2 = java.lang.Math.max(this.ad, h());
                            if (iMax2 > h()) {
                                x(iMax2);
                                this.aq[r5] = r5;
                                r1 = r5;
                                z16 = r1 == true ? 1 : 0;
                            } else {
                                r0 = z4;
                            }
                            if (!z16) {
                                r4 = this.aq;
                                if (r4[0] == 2) {
                                    r0 = r0;
                                    if (j() > i2) {
                                        this.ax = r5;
                                        r4[0] = r5;
                                        C(i2);
                                        ?? r2 = r5;
                                        z16 = r2 == true ? 1 : 0;
                                        r0 = r2;
                                    }
                                }
                                r0 = r1;
                                r0 = r0;
                                r0 = r0;
                                if (r4[r5] == 2) {
                                    this.ay = r5;
                                    r4[r5] = r5;
                                    x(i4);
                                    r0 = 1;
                                    z16 = true;
                                }
                            }
                            if (i5 > 8) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            i53 = r0 & i7;
                            i54 = i5;
                            dsqVar = dsqVar3;
                            z15 = z2;
                            i50 = 64;
                        }
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        i9 = i55;
                    }
                }
                i9 = i55;
                if (z17) {
                    int i58 = 0;
                    while (i58 < size13) {
                        defpackage.dsy dsyVar17 = (defpackage.dsy) this.aI.get(i58);
                        if (dsyVar17 instanceof defpackage.dsv) {
                            defpackage.dsv dsvVar5 = (defpackage.dsv) dsyVar17;
                            int i59 = 0;
                            while (i59 < dsvVar5.as) {
                                defpackage.dsy dsyVar18 = dsvVar5.ar[i59];
                                int i60 = i58;
                                if (dsvVar5.b || dsyVar18.d()) {
                                    int i61 = dsvVar5.a;
                                    dsvVar = dsvVar5;
                                    if (i61 == 0) {
                                        z6 = true;
                                    } else if (i61 == 1) {
                                        z6 = true;
                                    } else if (i61 == 2 || i61 == 3) {
                                        dsyVar18.y(1, true);
                                    }
                                    dsyVar18.y(0, z6);
                                } else {
                                    dsvVar = dsvVar5;
                                }
                                i59++;
                                i58 = i60;
                                dsvVar5 = dsvVar;
                            }
                        }
                        i58++;
                    }
                }
                java.util.HashSet hashSet8 = this.aD;
                hashSet8.clear();
                int i62 = 0;
                while (i62 < size13) {
                    int i63 = size13;
                    boolean z18 = z15;
                    int i64 = i9;
                    defpackage.dsy dsyVar19 = (defpackage.dsy) this.aI.get(i62);
                    if (dsyVar19.E()) {
                        if (dsyVar19 instanceof defpackage.dte) {
                            hashSet8.add(dsyVar19);
                        } else {
                            dsyVar19.b(dsqVar, zW2);
                        }
                    }
                    i62++;
                    i9 = i64;
                    size13 = i63;
                    z15 = z18;
                }
                while (hashSet8.size() > 0) {
                    int size14 = hashSet8.size();
                    java.util.Iterator it8 = hashSet8.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            z2 = z15;
                            break;
                        }
                        defpackage.dte dteVar = (defpackage.dte) ((defpackage.dsy) it8.next());
                        java.util.Iterator it9 = it8;
                        z2 = z15;
                        for (int i65 = 0; i65 < dteVar.as; i65++) {
                            try {
                                if (hashSet8.contains(dteVar.ar[i65])) {
                                    dteVar.b(dsqVar, zW2);
                                    hashSet8.remove(dteVar);
                                    break;
                                }
                            } catch (java.lang.Exception e3) {
                                e = e3;
                                i5 = i9;
                                e.printStackTrace();
                                java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr2 = defpackage.dtd.a;
                                zArr2[2] = false;
                                zW = W(64);
                                R(zW);
                                size = this.aI.size();
                                i6 = 0;
                                z3 = false;
                                while (i6 < size) {
                                    dsyVar = (defpackage.dsy) this.aI.get(i6);
                                    dsyVar.R(zW);
                                    defpackage.dsq dsqVar4 = dsqVar;
                                    if (dsyVar.k == -1) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    z3 = z5 | z3;
                                    i6++;
                                    dsqVar = dsqVar4;
                                }
                                defpackage.dsq dsqVar5 = dsqVar;
                                if (z2) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i8 < i51) {
                                        defpackage.dsy dsyVar110 = (defpackage.dsy) this.aI.get(i8);
                                        iMax3 = java.lang.Math.max(iMax3, dsyVar110.Z + dsyVar110.j());
                                        iMax4 = java.lang.Math.max(iMax4, dsyVar110.aa + dsyVar110.h());
                                    }
                                    iMax5 = java.lang.Math.max(this.ac, iMax3);
                                    iMax6 = java.lang.Math.max(this.ad, iMax4);
                                    if (i32 == 2) {
                                        C(iMax5);
                                        this.aq[0] = 2;
                                        z16 = true;
                                        z3 = true;
                                    }
                                    if (i3 == 2) {
                                        x(iMax6);
                                        this.aq[1] = 2;
                                        z16 = true;
                                        z3 = true;
                                    }
                                }
                                iMax = java.lang.Math.max(this.ac, j());
                                if (iMax > j()) {
                                    C(iMax);
                                    r5 = 1;
                                    this.aq[0] = 1;
                                    z16 = true;
                                    z4 = true;
                                } else {
                                    r5 = 1;
                                    z4 = z3;
                                }
                                iMax2 = java.lang.Math.max(this.ad, h());
                                if (iMax2 > h()) {
                                    x(iMax2);
                                    this.aq[r5] = r5;
                                    r1 = r5;
                                    z16 = r1 == true ? 1 : 0;
                                } else {
                                    r0 = z4;
                                }
                                if (!z16) {
                                    r4 = this.aq;
                                    if (r4[0] == 2) {
                                        r0 = r0;
                                        if (j() > i2) {
                                            this.ax = r5;
                                            r4[0] = r5;
                                            C(i2);
                                            ?? r3 = r5;
                                            z16 = r3 == true ? 1 : 0;
                                            r0 = r3;
                                        }
                                    }
                                    r0 = r1;
                                    r0 = r0;
                                    r0 = r0;
                                    if (r4[r5] == 2) {
                                        this.ay = r5;
                                        r4[r5] = r5;
                                        x(i4);
                                        r0 = 1;
                                        z16 = true;
                                    }
                                }
                                if (i5 > 8) {
                                    i7 = 0;
                                } else {
                                    i7 = 1;
                                }
                                i53 = r0 & i7;
                                i54 = i5;
                                dsqVar = dsqVar5;
                                z15 = z2;
                                i50 = 64;
                            }
                        }
                        it8 = it9;
                        z15 = z2;
                    }
                    if (size14 == hashSet8.size()) {
                        java.util.Iterator it10 = hashSet8.iterator();
                        while (it10.hasNext()) {
                            ((defpackage.dsy) it10.next()).b(dsqVar, zW2);
                        }
                        hashSet8.clear();
                    }
                    z15 = z2;
                }
                z2 = z15;
                if (defpackage.dsq.a) {
                    java.util.HashSet<defpackage.dsy> hashSet9 = new java.util.HashSet();
                    for (int i66 = 0; i66 < size13; i66++) {
                        defpackage.dsy dsyVar20 = (defpackage.dsy) this.aI.get(i66);
                        if (!dsyVar20.E()) {
                            hashSet9.add(dsyVar20);
                        }
                    }
                    i5 = i9;
                    try {
                        p(this, dsqVar, hashSet9, M() == 2 ? 0 : 1, false);
                        for (defpackage.dsy dsyVar21 : hashSet9) {
                            defpackage.dtd.a(this, dsqVar, dsyVar21);
                            dsyVar21.b(dsqVar, zW2);
                        }
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        java.lang.System.out.println("EXCEPTION : ".concat(e.toString()));
                    }
                } else {
                    i5 = i9;
                    int i67 = 0;
                    while (i67 < size13) {
                        defpackage.dsy dsyVar22 = (defpackage.dsy) this.aI.get(i67);
                        if (dsyVar22 instanceof defpackage.dsz) {
                            int[] iArr3 = dsyVar22.aq;
                            int i68 = iArr3[0];
                            i10 = i67;
                            int i69 = iArr3[1];
                            i11 = size13;
                            if (i68 == 2) {
                                dsyVar22.P(1);
                                i68 = 2;
                            }
                            if (i69 == 2) {
                                dsyVar22.Q(1);
                                i69 = 2;
                            }
                            dsyVar22.b(dsqVar, zW2);
                            if (i68 == 2) {
                                dsyVar22.P(2);
                            }
                            if (i69 == 2) {
                                dsyVar22.Q(2);
                            }
                        } else {
                            i10 = i67;
                            i11 = size13;
                            defpackage.dtd.a(this, dsqVar, dsyVar22);
                            if (!dsyVar22.E()) {
                                dsyVar22.b(dsqVar, zW2);
                            }
                        }
                        i67 = i10 + 1;
                        size13 = i11;
                    }
                }
                if (this.as > 0) {
                    arrayList = null;
                    yt.f(this, dsqVar, (java.util.ArrayList) null, 0);
                } else {
                    arrayList = null;
                }
                if (this.at > 0) {
                    yt.f(this, dsqVar, arrayList, 1);
                }
                java.lang.ref.WeakReference weakReference = this.az;
                if (weakReference != null && weakReference.get() != null) {
                    aa((defpackage.dsx) this.az.get(), dsqVar.b(this.K));
                    this.az = null;
                }
                java.lang.ref.WeakReference weakReference2 = this.aB;
                if (weakReference2 != null && weakReference2.get() != null) {
                    Z((defpackage.dsx) this.aB.get(), dsqVar.b(this.M));
                    this.aB = null;
                }
                java.lang.ref.WeakReference weakReference3 = this.aA;
                if (weakReference3 != null && weakReference3.get() != null) {
                    aa((defpackage.dsx) this.aA.get(), dsqVar.b(this.J));
                    this.aA = null;
                }
                java.lang.ref.WeakReference weakReference4 = this.aC;
                if (weakReference4 != null && weakReference4.get() != null) {
                    Z((defpackage.dsx) this.aC.get(), dsqVar.b(this.L));
                    this.aC = null;
                }
                dsqVar.j();
            } catch (java.lang.Exception e5) {
                e = e5;
                i5 = i55;
                z2 = z15;
            }
            boolean[] zArr3 = defpackage.dtd.a;
            zArr3[2] = false;
            zW = W(64);
            R(zW);
            size = this.aI.size();
            i6 = 0;
            z3 = false;
            while (i6 < size) {
                dsyVar = (defpackage.dsy) this.aI.get(i6);
                dsyVar.R(zW);
                defpackage.dsq dsqVar6 = dsqVar;
                if (dsyVar.k == -1 || dsyVar.l != -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z3 = z5 | z3;
                i6++;
                dsqVar = dsqVar6;
            }
            defpackage.dsq dsqVar7 = dsqVar;
            if (z2 && i5 < 8 && zArr3[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i8 < i51) {
                    defpackage.dsy dsyVar111 = (defpackage.dsy) this.aI.get(i8);
                    iMax3 = java.lang.Math.max(iMax3, dsyVar111.Z + dsyVar111.j());
                    iMax4 = java.lang.Math.max(iMax4, dsyVar111.aa + dsyVar111.h());
                }
                iMax5 = java.lang.Math.max(this.ac, iMax3);
                iMax6 = java.lang.Math.max(this.ad, iMax4);
                if (i32 == 2 && j() < iMax5) {
                    C(iMax5);
                    this.aq[0] = 2;
                    z16 = true;
                    z3 = true;
                }
                if (i3 == 2 && h() < iMax6) {
                    x(iMax6);
                    this.aq[1] = 2;
                    z16 = true;
                    z3 = true;
                }
            }
            iMax = java.lang.Math.max(this.ac, j());
            if (iMax > j()) {
                C(iMax);
                r5 = 1;
                this.aq[0] = 1;
                z16 = true;
                z4 = true;
            } else {
                r5 = 1;
                z4 = z3;
            }
            iMax2 = java.lang.Math.max(this.ad, h());
            if (iMax2 > h()) {
                x(iMax2);
                this.aq[r5] = r5;
                r1 = r5;
                z16 = r1 == true ? 1 : 0;
            } else {
                r0 = z4;
            }
            if (!z16) {
                r4 = this.aq;
                if (r4[0] == 2 && i2 > 0) {
                    r0 = r0;
                    if (j() > i2) {
                        this.ax = r5;
                        r4[0] = r5;
                        C(i2);
                        ?? r6 = r5;
                        z16 = r6 == true ? 1 : 0;
                        r0 = r6;
                    }
                }
                r0 = r1;
                r0 = r0;
                r0 = r0;
                if (r4[r5] == 2 && i4 > 0 && h() > i4) {
                    this.ay = r5;
                    r4[r5] = r5;
                    x(i4);
                    r0 = 1;
                    z16 = true;
                }
            }
            if (i5 > 8) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            i53 = r0 & i7;
            i54 = i5;
            dsqVar = dsqVar7;
            z15 = z2;
            i50 = 64;
        }
        this.aI = arrayList11;
        if (z16) {
            int[] iArr4 = this.aq;
            iArr4[0] = i32;
            iArr4[1] = i3;
        }
        S(this.c.j);
    }

    public final void U(int i) {
        this.aw = i;
        defpackage.dsq.a = W(512);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x003f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, java.util.List] */
    public final boolean V(boolean z, int i) {
        boolean z2;
        ?? r8;
        int size;
        int i2;
        boolean z3;
        defpackage.dtr dtrVar;
        defpackage.fxy fxyVar = this.aG;
        java.lang.Object obj = fxyVar.f;
        defpackage.dsy dsyVar = (defpackage.dsy) obj;
        boolean z4 = false;
        int iL = dsyVar.L(0);
        int iL2 = dsyVar.L(1);
        int iK = dsyVar.k();
        int iL3 = dsyVar.l();
        if (z) {
            if (iL == 2) {
                r8 = fxyVar.h;
                size = r8.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    dtrVar = (defpackage.dtr) r8.get(i2);
                    if (dtrVar.f != i && !dtrVar.e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3 && iL == 2) {
                        dsyVar.P(1);
                        defpackage.dsz dszVar = (defpackage.dsz) obj;
                        dsyVar.C(fxyVar.g(dszVar, 0));
                        dszVar.h.e.c(dsyVar.j());
                    }
                } else if (z3 && iL2 == 2) {
                    dsyVar.Q(1);
                    defpackage.dsz dszVar2 = (defpackage.dsz) obj;
                    dsyVar.x(fxyVar.g(dszVar2, 1));
                    dszVar2.i.e.c(dsyVar.h());
                }
            } else if (iL2 == 2) {
                iL2 = 2;
                r8 = fxyVar.h;
                size = r8.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    dtrVar = (defpackage.dtr) r8.get(i2);
                    if (dtrVar.f != i) {
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3) {
                        dsyVar.P(1);
                        defpackage.dsz dszVar3 = (defpackage.dsz) obj;
                        dsyVar.C(fxyVar.g(dszVar3, 0));
                        dszVar3.h.e.c(dsyVar.j());
                    }
                } else if (z3) {
                    dsyVar.Q(1);
                    defpackage.dsz dszVar4 = (defpackage.dsz) obj;
                    dsyVar.x(fxyVar.g(dszVar4, 1));
                    dszVar4.i.e.c(dsyVar.h());
                }
            }
        }
        if (i == 0) {
            defpackage.dsz dszVar5 = (defpackage.dsz) obj;
            int i3 = dszVar5.aq[0];
            if (i3 == 1 || i3 == 4) {
                int iJ = dsyVar.j() + iK;
                dszVar5.h.i.c(iJ);
                dszVar5.h.e.c(iJ - iK);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            defpackage.dsz dszVar6 = (defpackage.dsz) obj;
            int i4 = dszVar6.aq[1];
            if (i4 == 1 || i4 == 4) {
                int iH = dsyVar.h() + iL3;
                dszVar6.i.i.c(iH);
                dszVar6.i.e.c(iH - iL3);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        fxyVar.i();
        ?? r13 = fxyVar.h;
        int size2 = r13.size();
        for (int i5 = 0; i5 < size2; i5++) {
            defpackage.dtr dtrVar2 = (defpackage.dtr) r13.get(i5);
            if (dtrVar2.f == i && (dtrVar2.d != obj || dtrVar2.g)) {
                dtrVar2.c();
            }
        }
        int size3 = r13.size();
        for (int i6 = 0; i6 < size3; i6++) {
            defpackage.dtr dtrVar3 = (defpackage.dtr) r13.get(i6);
            if (dtrVar3.f == i && ((z2 || dtrVar3.d != obj) && (!dtrVar3.h.i || !dtrVar3.i.i || (!(dtrVar3 instanceof dth) && !dtrVar3.e.i)))) {
                dsyVar.P(iL);
                dsyVar.Q(iL2);
                return z4;
            }
        }
        z4 = true;
        dsyVar.P(iL);
        dsyVar.Q(iL2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.aw & i) == i;
    }

    final void a(defpackage.dsy dsyVar, int i) {
        if (i == 0) {
            int i2 = this.as + 1;
            defpackage.dsw[] dswVarArr = this.av;
            int length = dswVarArr.length;
            if (i2 >= length) {
                dswVarArr = (defpackage.dsw[]) java.util.Arrays.copyOf(dswVarArr, length << 1);
                this.av = dswVarArr;
            }
            int i3 = this.as;
            dswVarArr[i3] = new defpackage.dsw(dsyVar, 0, this.b);
            this.as = i3 + 1;
            return;
        }
        int i4 = this.at + 1;
        defpackage.dsw[] dswVarArr2 = this.au;
        int length2 = dswVarArr2.length;
        if (i4 >= length2) {
            dswVarArr2 = (defpackage.dsw[]) java.util.Arrays.copyOf(dswVarArr2, length2 << 1);
            this.au = dswVarArr2;
        }
        int i5 = this.at;
        dswVarArr2[i5] = new defpackage.dsw(dsyVar, 1, this.b);
        this.at = i5 + 1;
    }

    public final void c() {
        this.aG.a = true;
    }

    @Override // defpackage.dtf, defpackage.dsy
    public final void s() {
        this.c.k();
        this.d = 0;
        this.ar = 0;
        super.s();
    }
}
