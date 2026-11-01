package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abny {
    public static final defpackage.aonn a = defpackage.abnw.a;
    private static final defpackage.cbd c = new defpackage.cbn(defpackage.cdu.c, new defpackage.abnb(9));
    public static final defpackage.cbd b = new defpackage.cet(new defpackage.abnb(10));
    private static final defpackage.cbd d = new defpackage.cbn(defpackage.cdu.c, abnx.a);

    public static final void a(defpackage.bor borVar, defpackage.bti btiVar, defpackage.bwo bwoVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.bor borVar2;
        defpackage.bti btiVar2;
        defpackage.bwo bwoVar2;
        defpackage.aonn aonnVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-484509055);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(borVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(btiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(bwoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & 14;
            int i5 = i2 << 3;
            borVar2 = borVar;
            defpackage.abrz.p(borVar2, null, btiVar, bwoVar, aonnVar, cavVarB, i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            aonnVar2 = aonnVar;
        } else {
            borVar2 = borVar;
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            aonnVar2 = aonnVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abns(borVar2, btiVar2, bwoVar2, aonnVar2, i, 0);
        }
    }

    public static final void b(defpackage.abmy abmyVar, defpackage.abnz abnzVar, defpackage.abnk abnkVar, boolean z, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        if (aonnVar == null) {
            defpackage.aooh.i("content");
        }
        defpackage.cav cavVarB = cavVar.b(1769216500);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(abmyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abnzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(abnkVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.den.ac(new defpackage.cdj[]{defpackage.abmz.a.b(abmyVar), defpackage.aboa.a.b(abnzVar), defpackage.abno.a.b(abnkVar), b.b(java.lang.Boolean.valueOf(z)), d.b(null)}, aonnVar, cavVarB, (i2 >> 9) & 112);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(abmyVar, abnzVar, abnkVar, z, aonnVar, i, 5);
        }
    }

    public static final void c(defpackage.aonn aonnVar, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.aono aonoVar, defpackage.aonn aonnVar4, defpackage.aono aonoVar2, defpackage.aonq aonqVar, defpackage.aono aonoVar3, boolean z, defpackage.aonn aonnVar5, defpackage.aonj aonjVar, int i, final defpackage.aonn aonnVar6, defpackage.cav cavVar, final int i2, final int i3, final int i4) {
        defpackage.aonn xpfVar;
        int i5;
        defpackage.aonn dkmVar;
        defpackage.aonn aonnVar7;
        defpackage.aono aonoVar4;
        final defpackage.aono aonoVar5;
        final defpackage.aonq aonqVar2;
        final boolean z2;
        final defpackage.aonn aonnVar8;
        final defpackage.aonj aonjVar2;
        final int i6;
        final defpackage.aonn aonnVar9;
        defpackage.cav cavVar2;
        final defpackage.aonn aonnVar10;
        final defpackage.aonn aonnVar11;
        final defpackage.aono aonoVar6;
        final defpackage.aonn aonnVar12;
        final defpackage.aono aonoVar7;
        defpackage.aono abntVar;
        defpackage.aonq abnuVar;
        boolean zIsLowRamDevice;
        final defpackage.aonn aonnVar13;
        defpackage.aono aonoVar8;
        defpackage.aonn aonnVar14;
        defpackage.aonn aonnVar15;
        defpackage.aono aonoVar9;
        int i7;
        final boolean z3;
        defpackage.aono aonoVar10;
        int i8;
        defpackage.aonn aonnVar16;
        final defpackage.aonn aonnVar17;
        defpackage.bwo bwoVarAb;
        int i9;
        defpackage.aonn aonnVar18;
        int i10;
        defpackage.aonn aonnVar19;
        defpackage.aonn aonnVar20;
        if (aonnVar6 == null) {
            defpackage.aooh.i("content");
        }
        defpackage.cav cavVarB = cavVar.b(-1555398872);
        if ((i2 & 6) == 0) {
            if ((i4 & 1) == 0) {
                aonnVar20 = aonnVar;
                if (cavVarB.D(aonnVar20)) {
                    aonnVar18 = aonnVar20;
                    i10 = 4;
                    aonnVar19 = aonnVar20;
                }
                i5 = i10 | i2;
                xpfVar = aonnVar19;
            } else {
                aonnVar18 = aonnVar;
            }
            aonnVar18 = aonnVar20;
            i10 = 2;
            aonnVar19 = aonnVar18;
            i5 = i10 | i2;
            xpfVar = aonnVar19;
        } else {
            xpfVar = aonnVar;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            int i11 = 16;
            if ((i4 & 2) == 0) {
                dkmVar = aonnVar2;
                if (cavVarB.D(dkmVar)) {
                    i11 = 32;
                }
            } else {
                dkmVar = aonnVar2;
            }
            i5 |= i11;
        } else {
            dkmVar = aonnVar2;
        }
        if ((i2 & 384) == 0) {
            if ((i4 & 4) == 0) {
                aonnVar7 = aonnVar3;
                if (cavVarB.D(aonnVar7)) {
                    i9 = 256;
                }
                i5 |= i9;
            } else {
                aonnVar7 = aonnVar3;
            }
            i9 = 128;
            i5 |= i9;
        } else {
            aonnVar7 = aonnVar3;
        }
        if ((i2 & 3072) == 0) {
            int i12 = 1024;
            if ((i4 & 8) == 0) {
                aonoVar4 = aonoVar;
                if (cavVarB.D(aonoVar4)) {
                    i12 = 2048;
                }
            } else {
                aonoVar4 = aonoVar;
            }
            i5 |= i12;
        } else {
            aonoVar4 = aonoVar;
        }
        if ((i2 & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= 268435456;
        }
        int i13 = i3 | 54;
        if ((i3 & 384) == 0) {
            i13 |= true != cavVarB.D(aonnVar6) ? 128 : 256;
        }
        if (cavVarB.H(((306783379 & i5) == 306783378 && (i13 & 147) == 146) ? false : true, i5 & 1)) {
            int i14 = i4 & 8;
            int i15 = i4 & 4;
            int i16 = i4 & 2;
            int i17 = i4 & 1;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i2 & 1) == 0 || cavVarB.E()) {
                if (i17 != 0) {
                    i5 &= -15;
                    xpfVar = new xpf(11);
                }
                if (i16 != 0) {
                    dkmVar = new defpackage.dkm(9);
                    i5 &= -113;
                }
                if (i15 != 0) {
                    i5 &= -897;
                    aonnVar7 = a;
                }
                if (i14 != 0) {
                    abntVar = new defpackage.abnt();
                    i5 &= -7169;
                } else {
                    abntVar = aonoVar4;
                }
                defpackage.dkm dkmVar2 = new defpackage.dkm(10);
                defpackage.kcz kczVar = new defpackage.kcz(2);
                abnuVar = new defpackage.abnu();
                defpackage.kcz kczVar2 = new defpackage.kcz(3);
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.abnp.a;
                android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                if (context == null) {
                    defpackage.aooh.i("context");
                }
                java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.abnp.a;
                java.lang.Boolean bool = (java.lang.Boolean) atomicReference2.get();
                if (bool != null) {
                    zIsLowRamDevice = bool.booleanValue();
                } else {
                    java.lang.Object systemService = context.getSystemService("activity");
                    android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
                    zIsLowRamDevice = activityManager != null ? activityManager.isLowRamDevice() : context.getPackageManager().hasSystemFeature("android.hardware.ram.low");
                    atomicReference2.set(java.lang.Boolean.valueOf(zIsLowRamDevice));
                }
                defpackage.abnv abnvVar = new defpackage.abnv(zIsLowRamDevice, 0);
                int i18 = i5 & (-2147475457);
                java.lang.Object objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.rou(8);
                    cbtVar.ab(objR);
                }
                aonjVar2 = (defpackage.aonj) objR;
                aonnVar13 = aonnVar7;
                aonoVar8 = kczVar2;
                aonnVar14 = xpfVar;
                aonnVar15 = dkmVar;
                aonoVar9 = kczVar;
                i7 = 4;
                z3 = zIsLowRamDevice;
                aonoVar10 = abntVar;
                i8 = i18;
                aonnVar16 = dkmVar2;
                aonnVar17 = abnvVar;
            } else {
                cavVarB.s();
                if (i17 != 0) {
                    i5 &= -15;
                }
                if (i16 != 0) {
                    i5 &= -113;
                }
                if (i15 != 0) {
                    i5 &= -897;
                }
                if (i14 != 0) {
                    i5 &= -7169;
                }
                abnuVar = aonqVar;
                aonnVar17 = aonnVar5;
                aonjVar2 = aonjVar;
                i7 = i;
                i8 = i5 & (-2147475457);
                aonnVar15 = dkmVar;
                aonnVar13 = aonnVar7;
                aonoVar10 = aonoVar4;
                aonnVar16 = aonnVar4;
                aonoVar9 = aonoVar2;
                aonoVar8 = aonoVar3;
                z3 = z;
                aonnVar14 = xpfVar;
            }
            cavVarB.l();
            final defpackage.aono aonoVar11 = aonoVar8;
            java.lang.Boolean bool2 = (java.lang.Boolean) aonnVar14.a(cavVarB, java.lang.Integer.valueOf(i8 & 14));
            final boolean zBooleanValue = bool2.booleanValue();
            ((java.lang.Boolean) aonnVar15.a(cavVarB, java.lang.Integer.valueOf((i8 >> 3) & 14))).booleanValue();
            final boolean zN = defpackage.a.n();
            defpackage.aonn aonnVar21 = aonnVar14;
            java.lang.Object objE = cavVarB.e(defpackage.dep.b);
            defpackage.aonn aonnVar22 = aonnVar15;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zN);
            java.lang.Object objA = aonnVar13.a(objE, boolValueOf);
            final defpackage.bor borVar = (defpackage.bor) aonoVar10.a(bool2, objA, boolValueOf);
            java.lang.Object objA2 = aonnVar16.a(cavVarB, 0);
            if (i7 == 0) {
                throw null;
            }
            int i19 = i7 - 1;
            if (i19 == 0) {
                defpackage.dkz dkzVar = actp.a;
                defpackage.dkz dkzVar2 = actp.d;
                defpackage.dkz dkzVar3 = actp.e;
                defpackage.dkz dkzVar4 = actp.f;
                defpackage.dkz dkzVar5 = actp.g;
                defpackage.dkz dkzVar6 = actp.h;
                defpackage.dkz dkzVar7 = actp.i;
                defpackage.dkz dkzVar8 = actp.m;
                defpackage.dkz dkzVar9 = actp.n;
                defpackage.dkz dkzVar10 = actp.o;
                defpackage.dkz dkzVar11 = actp.a;
                defpackage.dkz dkzVar12 = actp.b;
                defpackage.dkz dkzVar13 = actp.c;
                defpackage.dkz dkzVar14 = actp.j;
                defpackage.dkz dkzVar15 = actp.k;
                defpackage.dkz dkzVar16 = actp.l;
                defpackage.dkz dkzVar17 = acto.a;
                bwoVarAb = defpackage.aaoo.ab(dkzVar2, dkzVar3, dkzVar4, dkzVar5, dkzVar6, dkzVar7, dkzVar8, dkzVar9, dkzVar10, dkzVar11, dkzVar12, dkzVar13, dkzVar14, dkzVar15, dkzVar16, acto.d, acto.e, acto.f, acto.g, acto.h, acto.i, acto.m, acto.n, acto.o, acto.a, acto.b, acto.c, acto.j, acto.k, acto.l);
            } else if (i19 == 1) {
                defpackage.dkz dkzVar18 = acts.a;
                long j = actr.a;
                defpackage.dkz dkzVarZ = defpackage.dkz.z(dkzVar18, 0L, actr.k, null, null, acty.b(actr.ad, actr.ac), null, actr.l, 0L, null, 0, actr.j, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ2 = defpackage.dkz.z(dkzVar18, 0L, actr.n, null, null, acty.b(actr.ag, actr.af), null, actr.o, 0L, null, 0, actr.m, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ3 = defpackage.dkz.z(dkzVar18, 0L, actr.q, null, null, acty.b(actr.aj, actr.ai), null, actr.r, 0L, null, 0, actr.p, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ4 = defpackage.dkz.z(dkzVar18, 0L, actr.t, null, null, acty.b(actr.am, actr.al), null, actr.u, 0L, null, 0, actr.s, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ5 = defpackage.dkz.z(dkzVar18, 0L, actr.w, null, null, acty.b(actr.ap, actr.ao), null, actr.x, 0L, null, 0, actr.v, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ6 = defpackage.dkz.z(dkzVar18, 0L, actr.z, null, null, acty.b(actr.as, actr.ar), null, actr.A, 0L, null, 0, actr.y, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ7 = defpackage.dkz.z(dkzVar18, 0L, actr.L, null, null, acty.b(actr.aE, actr.aD), null, actr.M, 0L, null, 0, actr.K, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ8 = defpackage.dkz.z(dkzVar18, 0L, actr.O, null, null, acty.b(actr.aH, actr.aG), null, actr.P, 0L, null, 0, actr.N, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ9 = defpackage.dkz.z(dkzVar18, 0L, actr.R, null, null, acty.b(actr.aK, actr.aJ), null, actr.S, 0L, null, 0, actr.Q, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ10 = defpackage.dkz.z(dkzVar18, 0L, actr.b, null, null, acty.b(actr.U, actr.T), null, actr.c, 0L, null, 0, actr.a, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ11 = defpackage.dkz.z(dkzVar18, 0L, actr.e, null, null, acty.b(actr.X, actr.W), null, actr.f, 0L, null, 0, actr.d, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ12 = defpackage.dkz.z(dkzVar18, 0L, actr.h, null, null, acty.b(actr.aa, actr.Z), null, actr.i, 0L, null, 0, actr.g, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ13 = defpackage.dkz.z(dkzVar18, 0L, actr.C, null, null, acty.b(actr.av, actr.au), null, actr.D, 0L, null, 0, actr.B, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ14 = defpackage.dkz.z(dkzVar18, 0L, actr.F, null, null, acty.b(actr.ay, actr.ax), null, actr.G, 0L, null, 0, actr.E, null, null, 0, 0, 16645981);
                defpackage.dkz dkzVarZ15 = defpackage.dkz.z(dkzVar18, 0L, actr.I, null, null, acty.b(actr.aB, actr.aA), null, actr.J, 0L, null, 0, actr.H, null, null, 0, 0, 16645981);
                long j2 = actq.a;
                bwoVarAb = new defpackage.bwo(dkzVarZ, dkzVarZ2, dkzVarZ3, dkzVarZ4, dkzVarZ5, dkzVarZ6, dkzVarZ7, dkzVarZ8, dkzVarZ9, dkzVarZ10, dkzVarZ11, dkzVarZ12, dkzVarZ13, dkzVarZ14, dkzVarZ15, defpackage.dkz.z(dkzVar18, 0L, actq.k, null, null, acty.b(actq.ad, actq.ac), null, actq.l, 0L, null, 0, actq.j, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.n, null, null, acty.b(actq.ag, actq.af), null, actq.o, 0L, null, 0, actq.m, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.q, null, null, acty.b(actq.aj, actq.ai), null, actq.r, 0L, null, 0, actq.p, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.t, null, null, acty.b(actq.am, actq.al), null, actq.u, 0L, null, 0, actq.s, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.w, null, null, acty.b(actq.ap, actq.ao), null, actq.x, 0L, null, 0, actq.v, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.z, null, null, acty.b(actq.as, actq.ar), null, actq.A, 0L, null, 0, actq.y, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.L, null, null, acty.b(actq.aE, actq.aD), null, actq.M, 0L, null, 0, actq.K, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.O, null, null, acty.b(actq.aH, actq.aG), null, actq.P, 0L, null, 0, actq.N, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.R, null, null, acty.b(actq.aK, actq.aJ), null, actq.S, 0L, null, 0, actq.Q, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.b, null, null, acty.b(actq.U, actq.T), null, actq.c, 0L, null, 0, actq.a, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.e, null, null, acty.b(actq.X, actq.W), null, actq.f, 0L, null, 0, actq.d, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.h, null, null, acty.b(actq.aa, actq.Z), null, actq.i, 0L, null, 0, actq.g, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.C, null, null, acty.b(actq.av, actq.au), null, actq.D, 0L, null, 0, actq.B, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.F, null, null, acty.b(actq.ay, actq.ax), null, actq.G, 0L, null, 0, actq.E, null, null, 0, 0, 16645981), defpackage.dkz.z(dkzVar18, 0L, actq.I, null, null, acty.b(actq.aB, actq.aA), null, actq.J, 0L, null, 0, actq.H, null, null, 0, 0, 16645981));
            } else if (i19 == 2) {
                bwoVarAb = defpackage.aaoo.ac();
            } else {
                if (i19 != 3) {
                    throw new defpackage.aois();
                }
                bwoVarAb = defpackage.abrz.j();
            }
            java.lang.Object objA3 = aonoVar9.a(bwoVarAb, cavVarB, 0);
            int i20 = ((defpackage.dov) cavVarB.e(c)).a;
            if (i20 != 0) {
                defpackage.bwo bwoVar = (defpackage.bwo) objA3;
                objA3 = new defpackage.bwo(defpackage.dkz.z(bwoVar.a, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.b, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.c, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.d, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.e, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.f, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.g, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.h, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.i, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.j, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.k, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.l, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.m, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.n, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), defpackage.dkz.z(bwoVar.o, 0L, 0L, null, null, null, null, 0L, 0L, null, i20, 0L, null, null, 0, 0, 16711679), bwoVar.p, bwoVar.q, bwoVar.r, bwoVar.s, bwoVar.t, bwoVar.u, bwoVar.v, bwoVar.w, bwoVar.x, bwoVar.y, bwoVar.z, bwoVar.A, bwoVar.B, bwoVar.C, bwoVar.D);
            }
            final defpackage.bwo bwoVar2 = (defpackage.bwo) objA3;
            final defpackage.acqy acqyVar = (defpackage.acqy) objA;
            defpackage.aono aonoVar12 = aonoVar10;
            defpackage.aonn aonnVar23 = aonnVar16;
            defpackage.aono aonoVar13 = aonoVar9;
            final defpackage.aonq aonqVar3 = abnuVar;
            a(borVar, (defpackage.bti) objA2, bwoVar2, defpackage.cfo.j(1916107011, new defpackage.aonn() { // from class: abnq
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar3 = (defpackage.cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i21 = iIntValue & 3;
                    int i22 = iIntValue & 1;
                    defpackage.aonn aonnVar24 = defpackage.abny.a;
                    if (cavVar3.H(i21 != 2, i22)) {
                        defpackage.aonn aonnVar25 = aonnVar13;
                        defpackage.aonj aonjVar3 = aonjVar2;
                        defpackage.aonn aonnVar26 = aonnVar6;
                        boolean z4 = z3;
                        defpackage.aonn aonnVar27 = aonnVar17;
                        defpackage.bwo bwoVar3 = bwoVar2;
                        defpackage.aono aonoVar14 = aonoVar11;
                        defpackage.abny.b((defpackage.abmy) aonqVar3.a(java.lang.Boolean.valueOf(zBooleanValue), acqyVar, java.lang.Boolean.valueOf(zN), cavVar3, 0), (defpackage.abnz) aonoVar14.a(defpackage.aboa.a(bwoVar3), cavVar3, 0), (defpackage.abnk) aonnVar27.a(cavVar3, 0), z4, aonnVar26, cavVar3, 0);
                        boolean zB = cavVar3.B(aonjVar3) | cavVar3.B(aonnVar25);
                        java.lang.Object objG = cavVar3.g();
                        if (zB || objG == defpackage.cau.a) {
                            objG = new defpackage.rox(aonjVar3, aonnVar25, (defpackage.aoln) null, 4);
                            cavVar3.w(objG);
                        }
                        defpackage.cbp.g(borVar, (defpackage.aonn) objG, cavVar3);
                    } else {
                        cavVar3.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVarB, 3072);
            cavVar2 = cavVarB;
            aonnVar8 = aonnVar17;
            z2 = z3;
            aonnVar11 = aonnVar13;
            aonnVar10 = aonnVar22;
            aonoVar6 = aonoVar12;
            i6 = i7;
            aonoVar5 = aonoVar13;
            aonqVar2 = aonqVar3;
            aonoVar7 = aonoVar11;
            aonnVar9 = aonnVar21;
            aonnVar12 = aonnVar23;
        } else {
            cavVarB.s();
            aonoVar5 = aonoVar2;
            aonqVar2 = aonqVar;
            z2 = z;
            aonnVar8 = aonnVar5;
            aonjVar2 = aonjVar;
            i6 = i;
            aonnVar9 = xpfVar;
            cavVar2 = cavVarB;
            aonnVar10 = dkmVar;
            aonnVar11 = aonnVar7;
            aonoVar6 = aonoVar4;
            aonnVar12 = aonnVar4;
            aonoVar7 = aonoVar3;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: abnr
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.aonn aonnVar24 = aonnVar9;
                    defpackage.aonn aonnVar25 = aonnVar10;
                    defpackage.aonn aonnVar26 = aonnVar11;
                    defpackage.aono aonoVar14 = aonoVar6;
                    defpackage.aonn aonnVar27 = aonnVar12;
                    defpackage.aono aonoVar15 = aonoVar5;
                    defpackage.aonq aonqVar4 = aonqVar2;
                    defpackage.aono aonoVar16 = aonoVar7;
                    boolean z4 = z2;
                    int i21 = i2;
                    defpackage.aonn aonnVar28 = aonnVar8;
                    int i22 = i3;
                    int i23 = i21 | 1;
                    int i24 = i22 & 306783378;
                    int i25 = i24 << 1;
                    int i26 = 306783378 & i23;
                    int i27 = i6;
                    int i28 = i22 & 613566756;
                    int i29 = i22 & (-920350135);
                    int i30 = i23 & 613566756;
                    defpackage.aonn aonnVar29 = aonnVar6;
                    defpackage.abny.c(aonnVar24, aonnVar25, aonnVar26, aonoVar14, aonnVar27, aonoVar15, aonqVar4, aonoVar16, z4, aonnVar28, aonjVar2, i27, aonnVar29, (defpackage.cav) obj, (i23 & (-920350135)) | i26 | (i30 >> 1) | ((i26 << 1) & i30), i29 | i24 | (i28 >> 1) | (i25 & i28), i4);
                    return defpackage.aojh.a;
                }
            };
        }
    }
}
