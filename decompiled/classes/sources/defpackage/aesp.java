package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesp {
    public final defpackage.aoin a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public aesp(android.content.Context context, defpackage.aoin aoinVar, defpackage.amwu amwuVar, defpackage.amwu amwuVar2) {
        this.b = amwuVar;
        this.d = context;
        this.a = aoinVar;
        this.c = amwuVar2;
    }

    public static final void a(java.lang.String str, java.lang.String str2, long j) {
        java.lang.String str3 = java.lang.String.format(java.util.Locale.US, "J<%s>#%s#%d", str, str2, java.lang.Long.valueOf(j));
        if (str3.length() <= 127) {
            da$.ExternalSyntheticApiModelOutline0.m$1(str3, 352691800);
            da$.ExternalSyntheticApiModelOutline0.m(str3, 352691800);
        }
    }

    public static final void b(java.lang.String str) {
        if (da$.ExternalSyntheticApiModelOutline0.m()) {
            a(str, "FT#cancel", 16L);
            da$.ExternalSyntheticApiModelOutline0.m(java.lang.String.format(java.util.Locale.US, "J<%s>", str), 352691800);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:458:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:460:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:461:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:469:0x0902  */
    /* JADX WARN: Code duplicated, block: B:472:0x0917  */
    /* JADX WARN: Code duplicated, block: B:475:0x092d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0943  */
    public final defpackage.apgu c(defpackage.aeqo aeqoVar, defpackage.aeqo aeqoVar2) {
        java.lang.Long l;
        java.lang.Long l2;
        java.lang.Long l3;
        java.lang.Long l4;
        java.lang.Object obj;
        defpackage.aper aperVar;
        java.lang.Long l5;
        java.lang.Object obj2;
        java.lang.Long l6;
        defpackage.aper aperVar2;
        defpackage.akzx akzxVarM;
        int i;
        java.lang.String str;
        defpackage.apev apevVar;
        int i2;
        java.lang.Integer num;
        java.lang.Integer num2;
        defpackage.apeq apeqVar;
        defpackage.apeq apeqVar2;
        int i3;
        int i4;
        int i5;
        defpackage.apeq apeqVar3;
        defpackage.apeq apeqVar4;
        int i6;
        int i7;
        defpackage.apeq apeqVar5;
        defpackage.apeq apeqVar6;
        defpackage.apeq apeqVar7;
        defpackage.apeq apeqVar8;
        defpackage.apeq apeqVar9;
        defpackage.apeq apeqVar10;
        defpackage.apeq apeqVar11;
        defpackage.apeq apeqVar12;
        defpackage.apeq apeqVar13;
        defpackage.apeq apeqVar14;
        defpackage.apeq apeqVar15;
        defpackage.apeq apeqVar16;
        defpackage.apeq apeqVar17;
        defpackage.apeq apeqVar18;
        defpackage.apeq apeqVar19;
        defpackage.apeq apeqVar20;
        defpackage.apeq apeqVar21;
        defpackage.apeq apeqVar22;
        defpackage.apeq apeqVar23;
        defpackage.apeq apeqVar24;
        defpackage.apeq apeqVar25;
        defpackage.apeq apeqVar26;
        defpackage.apeq apeqVar27;
        defpackage.apeq apeqVar28;
        defpackage.apeq apeqVar29;
        defpackage.apeq apeqVar30;
        defpackage.apeq apeqVar31;
        defpackage.apeq apeqVar32;
        if (aeqoVar != null) {
            if (j$.util.Objects.equals(aeqoVar.d, aeqoVar2.d) && j$.util.Objects.equals(aeqoVar.e, aeqoVar2.e) && (l = aeqoVar.b) != null && (l2 = aeqoVar.c) != null && (l3 = aeqoVar2.b) != null && (l4 = aeqoVar2.c) != null) {
                long jLongValue = l3.longValue() - l.longValue();
                long jLongValue2 = l4.longValue() - l2.longValue();
                if (jLongValue2 > 0) {
                    long jAbs = java.lang.Math.abs(jLongValue - jLongValue2);
                    if (jAbs < 25) {
                        obj = this.c;
                        aperVar = aeqoVar2.a;
                        defpackage.aper aperVar3 = aeqoVar.a;
                        if (aperVar != null) {
                            l5 = l;
                            obj2 = obj;
                            l6 = l3;
                        } else {
                            l5 = l;
                            obj2 = obj;
                            l6 = l3;
                        }
                        if (aperVar == null) {
                            aperVar2 = null;
                        } else {
                            defpackage.akzx akzxVarL = aperVar.L();
                            defpackage.agab.bt(akzxVarL, (defpackage.aeqh) ((defpackage.adao) obj2).a);
                            aperVar2 = (defpackage.aper) akzxVarL.r();
                        }
                        if (aperVar2 != null) {
                            akzxVarM = apei.a.m();
                            long jLongValue3 = l6.longValue() - l5.longValue();
                            akzxVarM.u();
                            apei apeiVar = akzxVarM.b;
                            apeiVar.b |= 64;
                            apeiVar.i = jLongValue3;
                            i = aeqoVar.i;
                            if (i != 0) {
                                akzxVarM.u();
                                apei apeiVar2 = akzxVarM.b;
                                apeiVar2.c = i - 1;
                                apeiVar2.b |= 1;
                            }
                            str = aeqoVar.f;
                            if (str != null) {
                                akzxVarM.u();
                                apei apeiVar3 = akzxVarM.b;
                                j$.util.Objects.requireNonNull(str);
                                apeiVar3.b |= 8;
                                apeiVar3.f = str;
                            }
                            apevVar = aeqoVar.g;
                            if (apevVar != null) {
                                akzxVarM.u();
                                apei apeiVar4 = akzxVarM.b;
                                j$.util.Objects.requireNonNull(apevVar);
                                apeiVar4.g = apevVar;
                                apeiVar4.b |= 16;
                            }
                            i2 = aeqoVar2.i;
                            if (i2 != 0) {
                                akzxVarM.u();
                                apei apeiVar5 = akzxVarM.b;
                                apeiVar5.h = i2 - 1;
                                apeiVar5.b |= 32;
                            }
                            long jLongValue4 = l6.longValue();
                            akzxVarM.u();
                            apei apeiVar6 = akzxVarM.b;
                            apeiVar6.b |= 256;
                            apeiVar6.k = jLongValue4;
                            num = aeqoVar.h;
                            if (num != null) {
                                int iIntValue = num2.intValue() - num.intValue();
                                akzxVarM.u();
                                apei apeiVar7 = akzxVarM.b;
                                apeiVar7.b |= 512;
                                apeiVar7.l = iIntValue;
                            }
                            akzxVarM.u();
                            apei apeiVar8 = akzxVarM.b;
                            j$.util.Objects.requireNonNull(aperVar2);
                            apeiVar8.j = aperVar2;
                            apeiVar8.b |= 128;
                            defpackage.akzx akzxVarM2 = defpackage.apgu.a.m();
                            defpackage.akzx akzxVarM3 = defpackage.apej.a.m();
                            akzxVarM3.u();
                            defpackage.apej apejVar = (defpackage.apej) akzxVarM3.b;
                            apei apeiVarR = akzxVarM.r();
                            j$.util.Objects.requireNonNull(apeiVarR);
                            apejVar.c = apeiVarR;
                            apejVar.b |= 1;
                            akzxVarM2.u();
                            defpackage.apgu apguVar = (defpackage.apgu) akzxVarM2.b;
                            defpackage.apej apejVar2 = (defpackage.apej) akzxVarM3.r();
                            j$.util.Objects.requireNonNull(apejVar2);
                            apguVar.k = apejVar2;
                            apguVar.b |= 256;
                            return (defpackage.apgu) akzxVarM2.r();
                        }
                    } else if (jAbs / jLongValue2 <= 3.472222222222222E-5d) {
                        obj = this.c;
                        aperVar = aeqoVar2.a;
                        defpackage.aper aperVar4 = aeqoVar.a;
                        if (aperVar != null || aperVar4 == null) {
                            l5 = l;
                            obj2 = obj;
                            l6 = l3;
                        } else {
                            defpackage.akzx akzxVarM4 = defpackage.aper.a.m();
                            if ((aperVar.b & 1) != 0) {
                                long j = aperVar.d - aperVar4.d;
                                if (j != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar5 = (defpackage.aper) akzxVarM4.b;
                                    aperVar5.b |= 1;
                                    aperVar5.d = j;
                                }
                            }
                            if ((aperVar.b & 2) != 0) {
                                long j2 = aperVar.e - aperVar4.e;
                                if (j2 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar6 = (defpackage.aper) akzxVarM4.b;
                                    aperVar6.b |= 2;
                                    aperVar6.e = j2;
                                }
                            }
                            if ((aperVar.b & 4) != 0) {
                                long j3 = aperVar.f - aperVar4.f;
                                if (j3 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar7 = (defpackage.aper) akzxVarM4.b;
                                    aperVar7.b |= 4;
                                    aperVar7.f = j3;
                                }
                            }
                            if ((aperVar.b & 8) != 0) {
                                long j4 = aperVar.g - aperVar4.g;
                                if (j4 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar8 = (defpackage.aper) akzxVarM4.b;
                                    aperVar8.b |= 8;
                                    aperVar8.g = j4;
                                }
                            }
                            defpackage.aeqn aeqnVar = defpackage.aeqn.a;
                            akzxVarM4.bA(aeqnVar.e(aperVar.h, aperVar4.h));
                            akzxVarM4.bB(aeqnVar.e(aperVar.i, aperVar4.i));
                            akzxVarM4.bC(aeqnVar.e(aperVar.j, aperVar4.j));
                            akzxVarM4.bz(aeqnVar.e(aperVar.k, aperVar4.k));
                            akzxVarM4.by(aeqnVar.e(aperVar.l, aperVar4.l));
                            akzxVarM4.bu(aeqnVar.e(aperVar.m, aperVar4.m));
                            if ((aperVar.b & 16) != 0) {
                                apeqVar = aperVar.n;
                                if (apeqVar == null) {
                                    apeqVar = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar = null;
                            }
                            if ((aperVar4.b & 16) != 0) {
                                apeqVar2 = aperVar4.n;
                                if (apeqVar2 == null) {
                                    apeqVar2 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar2 = null;
                            }
                            defpackage.apeq apeqVarBn = defpackage.agab.bn(apeqVar, apeqVar2);
                            if (apeqVarBn != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar9 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn);
                                aperVar9.n = apeqVarBn;
                                aperVar9.b |= 16;
                            }
                            akzxVarM4.bv(aeqnVar.e(aperVar.o, aperVar4.o));
                            akzxVarM4.bx(defpackage.aeqk.a.e(aperVar.q, aperVar4.q));
                            akzxVarM4.bw(defpackage.aeqj.a.e(aperVar.r, aperVar4.r));
                            if ((aperVar.b & 32) != 0) {
                                long j5 = aperVar.s - aperVar4.s;
                                if (j5 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar10 = (defpackage.aper) akzxVarM4.b;
                                    aperVar10.b |= 32;
                                    aperVar10.s = j5;
                                }
                            }
                            if ((aperVar.b & 64) != 0) {
                                long j6 = aperVar.t - aperVar4.t;
                                if (j6 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar11 = (defpackage.aper) akzxVarM4.b;
                                    aperVar11.b |= 64;
                                    aperVar11.t = j6;
                                }
                            }
                            if ((aperVar.b & 128) != 0) {
                                long j7 = aperVar.u - aperVar4.u;
                                if (j7 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar12 = (defpackage.aper) akzxVarM4.b;
                                    aperVar12.b |= 128;
                                    aperVar12.u = j7;
                                }
                            }
                            if ((aperVar.b & 256) != 0) {
                                long j8 = aperVar.v - aperVar4.v;
                                if (j8 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar13 = (defpackage.aper) akzxVarM4.b;
                                    aperVar13.b |= 256;
                                    aperVar13.v = j8;
                                }
                            }
                            if ((aperVar.b & 512) != 0) {
                                long j9 = aperVar.w - aperVar4.w;
                                if (j9 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar14 = (defpackage.aper) akzxVarM4.b;
                                    aperVar14.b |= 512;
                                    aperVar14.w = j9;
                                }
                            }
                            if ((aperVar.b & 1024) != 0) {
                                long j10 = aperVar.x - aperVar4.x;
                                if (j10 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar15 = (defpackage.aper) akzxVarM4.b;
                                    aperVar15.b |= 1024;
                                    aperVar15.x = j10;
                                }
                            }
                            if ((aperVar.b & 2048) != 0) {
                                long j11 = aperVar.y - aperVar4.y;
                                if (j11 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar16 = (defpackage.aper) akzxVarM4.b;
                                    aperVar16.b |= 2048;
                                    aperVar16.y = j11;
                                }
                            }
                            if ((aperVar.b & 4096) != 0) {
                                long j12 = aperVar.z - aperVar4.z;
                                if (j12 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar17 = (defpackage.aper) akzxVarM4.b;
                                    aperVar17.b |= 4096;
                                    aperVar17.z = j12;
                                }
                            }
                            if ((aperVar.b & 8192) != 0) {
                                long j13 = aperVar.A - aperVar4.A;
                                if (j13 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar18 = (defpackage.aper) akzxVarM4.b;
                                    aperVar18.b |= 8192;
                                    aperVar18.A = j13;
                                }
                            }
                            if ((aperVar.b & 16384) != 0) {
                                long j14 = aperVar.B - aperVar4.B;
                                if (j14 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar19 = (defpackage.aper) akzxVarM4.b;
                                    aperVar19.b |= 16384;
                                    aperVar19.B = j14;
                                }
                            }
                            if ((aperVar.b & 32768) != 0) {
                                l5 = l;
                                long j15 = aperVar.C - aperVar4.C;
                                if (j15 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar20 = (defpackage.aper) akzxVarM4.b;
                                    aperVar20.b |= 32768;
                                    aperVar20.C = j15;
                                }
                            } else {
                                l5 = l;
                            }
                            if ((aperVar.b & 65536) != 0) {
                                i3 = 65536;
                                obj2 = obj;
                                long j16 = aperVar.D - aperVar4.D;
                                if (j16 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar21 = (defpackage.aper) akzxVarM4.b;
                                    aperVar21.b |= 65536;
                                    aperVar21.D = j16;
                                }
                            } else {
                                i3 = 65536;
                                obj2 = obj;
                            }
                            if ((aperVar.b & 131072) != 0) {
                                i4 = 131072;
                                l6 = l3;
                                long j17 = aperVar.E - aperVar4.E;
                                if (j17 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar22 = (defpackage.aper) akzxVarM4.b;
                                    aperVar22.b |= 131072;
                                    aperVar22.E = j17;
                                }
                            } else {
                                i4 = 131072;
                                l6 = l3;
                            }
                            if ((aperVar.b & 262144) != 0) {
                                i5 = 32768;
                                long j18 = aperVar.F - aperVar4.F;
                                if (j18 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar23 = (defpackage.aper) akzxVarM4.b;
                                    aperVar23.b |= 262144;
                                    aperVar23.F = j18;
                                }
                            } else {
                                i5 = 32768;
                            }
                            if ((aperVar.b & 524288) != 0) {
                                apeqVar3 = aperVar.G;
                                if (apeqVar3 == null) {
                                    apeqVar3 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar3 = null;
                            }
                            if ((aperVar4.b & 524288) != 0) {
                                apeqVar4 = aperVar4.G;
                                if (apeqVar4 == null) {
                                    apeqVar4 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar4 = null;
                            }
                            defpackage.apeq apeqVarBn2 = defpackage.agab.bn(apeqVar3, apeqVar4);
                            if (apeqVarBn2 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar24 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn2);
                                aperVar24.G = apeqVarBn2;
                                aperVar24.b |= 524288;
                            }
                            if ((aperVar.b & 1048576) != 0) {
                                i6 = i5;
                                i7 = 262144;
                                long j19 = aperVar.H - aperVar4.H;
                                if (j19 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar25 = (defpackage.aper) akzxVarM4.b;
                                    aperVar25.b |= 1048576;
                                    aperVar25.H = j19;
                                }
                            } else {
                                i6 = i5;
                                i7 = 262144;
                            }
                            if ((aperVar.b & 2097152) != 0) {
                                apeqVar5 = aperVar.I;
                                if (apeqVar5 == null) {
                                    apeqVar5 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar5 = null;
                            }
                            if ((aperVar4.b & 2097152) != 0) {
                                apeqVar6 = aperVar4.I;
                                if (apeqVar6 == null) {
                                    apeqVar6 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar6 = null;
                            }
                            defpackage.apeq apeqVarBn3 = defpackage.agab.bn(apeqVar5, apeqVar6);
                            if (apeqVarBn3 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar26 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn3);
                                aperVar26.I = apeqVarBn3;
                                aperVar26.b |= 2097152;
                            }
                            if ((aperVar.b & 4194304) != 0) {
                                apeqVar7 = aperVar.J;
                                if (apeqVar7 == null) {
                                    apeqVar7 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar7 = null;
                            }
                            if ((aperVar4.b & 4194304) != 0) {
                                apeqVar8 = aperVar4.J;
                                if (apeqVar8 == null) {
                                    apeqVar8 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar8 = null;
                            }
                            defpackage.apeq apeqVarBn4 = defpackage.agab.bn(apeqVar7, apeqVar8);
                            if (apeqVarBn4 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar27 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn4);
                                aperVar27.J = apeqVarBn4;
                                aperVar27.b |= 4194304;
                            }
                            if ((aperVar.b & 8388608) != 0) {
                                apeqVar9 = aperVar.K;
                                if (apeqVar9 == null) {
                                    apeqVar9 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar9 = null;
                            }
                            if ((aperVar4.b & 8388608) != 0) {
                                apeqVar10 = aperVar4.K;
                                if (apeqVar10 == null) {
                                    apeqVar10 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar10 = null;
                            }
                            defpackage.apeq apeqVarBn5 = defpackage.agab.bn(apeqVar9, apeqVar10);
                            if (apeqVarBn5 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar28 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn5);
                                aperVar28.K = apeqVarBn5;
                                aperVar28.b |= 8388608;
                            }
                            if ((aperVar.b & 16777216) != 0) {
                                apeqVar11 = aperVar.L;
                                if (apeqVar11 == null) {
                                    apeqVar11 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar11 = null;
                            }
                            if ((aperVar4.b & 16777216) != 0) {
                                apeqVar12 = aperVar4.L;
                                if (apeqVar12 == null) {
                                    apeqVar12 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar12 = null;
                            }
                            defpackage.apeq apeqVarBn6 = defpackage.agab.bn(apeqVar11, apeqVar12);
                            if (apeqVarBn6 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar29 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn6);
                                aperVar29.L = apeqVarBn6;
                                aperVar29.b |= 16777216;
                            }
                            if ((aperVar.b & 33554432) != 0) {
                                apeqVar13 = aperVar.M;
                                if (apeqVar13 == null) {
                                    apeqVar13 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar13 = null;
                            }
                            if ((aperVar4.b & 33554432) != 0) {
                                apeqVar14 = aperVar4.M;
                                if (apeqVar14 == null) {
                                    apeqVar14 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar14 = null;
                            }
                            defpackage.apeq apeqVarBn7 = defpackage.agab.bn(apeqVar13, apeqVar14);
                            if (apeqVarBn7 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar30 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn7);
                                aperVar30.M = apeqVarBn7;
                                aperVar30.b |= 33554432;
                            }
                            if ((aperVar.b & 67108864) != 0) {
                                apeqVar15 = aperVar.N;
                                if (apeqVar15 == null) {
                                    apeqVar15 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar15 = null;
                            }
                            if ((aperVar4.b & 67108864) != 0) {
                                apeqVar16 = aperVar4.N;
                                if (apeqVar16 == null) {
                                    apeqVar16 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar16 = null;
                            }
                            defpackage.apeq apeqVarBn8 = defpackage.agab.bn(apeqVar15, apeqVar16);
                            if (apeqVarBn8 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar31 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn8);
                                aperVar31.N = apeqVarBn8;
                                aperVar31.b |= 67108864;
                            }
                            if ((aperVar.b & 134217728) != 0) {
                                apeqVar17 = aperVar.R;
                                if (apeqVar17 == null) {
                                    apeqVar17 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar17 = null;
                            }
                            if ((aperVar4.b & 134217728) != 0) {
                                apeqVar18 = aperVar4.R;
                                if (apeqVar18 == null) {
                                    apeqVar18 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar18 = null;
                            }
                            defpackage.apeq apeqVarBn9 = defpackage.agab.bn(apeqVar17, apeqVar18);
                            if (apeqVarBn9 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar32 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn9);
                                aperVar32.R = apeqVarBn9;
                                aperVar32.b |= 134217728;
                            }
                            if ((aperVar.b & 268435456) != 0) {
                                apeqVar19 = aperVar.S;
                                if (apeqVar19 == null) {
                                    apeqVar19 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar19 = null;
                            }
                            if ((aperVar4.b & 268435456) != 0) {
                                apeqVar20 = aperVar4.S;
                                if (apeqVar20 == null) {
                                    apeqVar20 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar20 = null;
                            }
                            defpackage.apeq apeqVarBn10 = defpackage.agab.bn(apeqVar19, apeqVar20);
                            if (apeqVarBn10 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar33 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn10);
                                aperVar33.S = apeqVarBn10;
                                aperVar33.b |= 268435456;
                            }
                            if ((aperVar.b & 536870912) != 0) {
                                apeqVar21 = aperVar.T;
                                if (apeqVar21 == null) {
                                    apeqVar21 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar21 = null;
                            }
                            if ((aperVar4.b & 536870912) != 0) {
                                apeqVar22 = aperVar4.T;
                                if (apeqVar22 == null) {
                                    apeqVar22 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar22 = null;
                            }
                            defpackage.apeq apeqVarBn11 = defpackage.agab.bn(apeqVar21, apeqVar22);
                            if (apeqVarBn11 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar34 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn11);
                                aperVar34.T = apeqVarBn11;
                                aperVar34.b |= 536870912;
                            }
                            if ((aperVar.b & 1073741824) != 0) {
                                apeqVar23 = aperVar.U;
                                if (apeqVar23 == null) {
                                    apeqVar23 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar23 = null;
                            }
                            if ((aperVar4.b & 1073741824) != 0) {
                                apeqVar24 = aperVar4.U;
                                if (apeqVar24 == null) {
                                    apeqVar24 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar24 = null;
                            }
                            defpackage.apeq apeqVarBn12 = defpackage.agab.bn(apeqVar23, apeqVar24);
                            if (apeqVarBn12 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar35 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn12);
                                aperVar35.U = apeqVarBn12;
                                aperVar35.b |= 1073741824;
                            }
                            if ((aperVar.b & Integer.MIN_VALUE) != 0) {
                                apeqVar25 = aperVar.V;
                                if (apeqVar25 == null) {
                                    apeqVar25 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar25 = null;
                            }
                            if ((aperVar4.b & Integer.MIN_VALUE) != 0) {
                                apeqVar26 = aperVar4.V;
                                if (apeqVar26 == null) {
                                    apeqVar26 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar26 = null;
                            }
                            defpackage.apeq apeqVarBn13 = defpackage.agab.bn(apeqVar25, apeqVar26);
                            if (apeqVarBn13 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar36 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn13);
                                aperVar36.V = apeqVarBn13;
                                aperVar36.b |= Integer.MIN_VALUE;
                            }
                            if ((aperVar.c & 1) != 0) {
                                apeqVar27 = aperVar.W;
                                if (apeqVar27 == null) {
                                    apeqVar27 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar27 = null;
                            }
                            if ((aperVar4.c & 1) != 0) {
                                apeqVar28 = aperVar4.W;
                                if (apeqVar28 == null) {
                                    apeqVar28 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar28 = null;
                            }
                            defpackage.apeq apeqVarBn14 = defpackage.agab.bn(apeqVar27, apeqVar28);
                            if (apeqVarBn14 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar37 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn14);
                                aperVar37.W = apeqVarBn14;
                                aperVar37.c |= 1;
                            }
                            if ((aperVar.c & 2) != 0) {
                                apeqVar29 = aperVar.X;
                                if (apeqVar29 == null) {
                                    apeqVar29 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar29 = null;
                            }
                            if ((aperVar4.c & 2) != 0) {
                                apeqVar30 = aperVar4.X;
                                if (apeqVar30 == null) {
                                    apeqVar30 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar30 = null;
                            }
                            defpackage.apeq apeqVarBn15 = defpackage.agab.bn(apeqVar29, apeqVar30);
                            if (apeqVarBn15 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar38 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn15);
                                aperVar38.X = apeqVarBn15;
                                aperVar38.c |= 2;
                            }
                            if ((aperVar.c & 4) != 0) {
                                long j20 = aperVar.Y - aperVar4.Y;
                                if (j20 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar39 = (defpackage.aper) akzxVarM4.b;
                                    aperVar39.c |= 4;
                                    aperVar39.Y = j20;
                                }
                            }
                            if ((aperVar.c & 8) != 0) {
                                long j21 = aperVar.Z - aperVar4.Z;
                                if (j21 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar40 = (defpackage.aper) akzxVarM4.b;
                                    aperVar40.c |= 8;
                                    aperVar40.Z = j21;
                                }
                            }
                            if ((aperVar.c & 16) != 0) {
                                long j22 = aperVar.aa - aperVar4.aa;
                                if (j22 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar41 = (defpackage.aper) akzxVarM4.b;
                                    aperVar41.c |= 16;
                                    aperVar41.aa = j22;
                                }
                            }
                            if ((aperVar.c & 32) != 0) {
                                long j23 = aperVar.ab - aperVar4.ab;
                                if (j23 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar42 = (defpackage.aper) akzxVarM4.b;
                                    aperVar42.c |= 32;
                                    aperVar42.ab = j23;
                                }
                            }
                            if ((aperVar.c & 64) != 0) {
                                long j24 = aperVar.ac - aperVar4.ac;
                                if (j24 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar43 = (defpackage.aper) akzxVarM4.b;
                                    aperVar43.c |= 64;
                                    aperVar43.ac = j24;
                                }
                            }
                            if ((aperVar.c & 128) != 0) {
                                long j25 = aperVar.ad - aperVar4.ad;
                                if (j25 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar44 = (defpackage.aper) akzxVarM4.b;
                                    aperVar44.c |= 128;
                                    aperVar44.ad = j25;
                                }
                            }
                            if ((aperVar.c & 256) != 0) {
                                long j26 = aperVar.ae - aperVar4.ae;
                                if (j26 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar45 = (defpackage.aper) akzxVarM4.b;
                                    aperVar45.c |= 256;
                                    aperVar45.ae = j26;
                                }
                            }
                            if ((aperVar.c & 512) != 0) {
                                long j27 = aperVar.af - aperVar4.af;
                                if (j27 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar46 = (defpackage.aper) akzxVarM4.b;
                                    aperVar46.c |= 512;
                                    aperVar46.af = j27;
                                }
                            }
                            if ((aperVar.c & 1024) != 0) {
                                long j28 = aperVar.ag - aperVar4.ag;
                                if (j28 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar47 = (defpackage.aper) akzxVarM4.b;
                                    aperVar47.c |= 1024;
                                    aperVar47.ag = j28;
                                }
                            }
                            if ((aperVar.c & 2048) != 0) {
                                long j29 = aperVar.ah - aperVar4.ah;
                                if (j29 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar48 = (defpackage.aper) akzxVarM4.b;
                                    aperVar48.c |= 2048;
                                    aperVar48.ah = j29;
                                }
                            }
                            if ((aperVar.c & 4096) != 0) {
                                long j30 = aperVar.ai - aperVar4.ai;
                                if (j30 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar49 = (defpackage.aper) akzxVarM4.b;
                                    aperVar49.c |= 4096;
                                    aperVar49.ai = j30;
                                }
                            }
                            if ((aperVar.c & 8192) != 0) {
                                long j31 = aperVar.aj - aperVar4.aj;
                                if (j31 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar50 = (defpackage.aper) akzxVarM4.b;
                                    aperVar50.c |= 8192;
                                    aperVar50.aj = j31;
                                }
                            }
                            if ((aperVar.c & 16384) != 0) {
                                long j32 = aperVar.ak - aperVar4.ak;
                                if (j32 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar51 = (defpackage.aper) akzxVarM4.b;
                                    aperVar51.c |= 16384;
                                    aperVar51.ak = j32;
                                }
                            }
                            if ((aperVar.c & i6) != 0) {
                                long j33 = aperVar.al - aperVar4.al;
                                if (j33 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar52 = (defpackage.aper) akzxVarM4.b;
                                    aperVar52.c |= i6;
                                    aperVar52.al = j33;
                                }
                            }
                            if ((aperVar.c & i3) != 0) {
                                long j34 = aperVar.am - aperVar4.am;
                                if (j34 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar53 = (defpackage.aper) akzxVarM4.b;
                                    aperVar53.c |= i3;
                                    aperVar53.am = j34;
                                }
                            }
                            if ((aperVar.c & i4) != 0) {
                                apeqVar31 = aperVar.an;
                                if (apeqVar31 == null) {
                                    apeqVar31 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar31 = null;
                            }
                            if ((aperVar4.c & i4) != 0) {
                                apeqVar32 = aperVar4.an;
                                if (apeqVar32 == null) {
                                    apeqVar32 = defpackage.apeq.a;
                                }
                            } else {
                                apeqVar32 = null;
                            }
                            defpackage.apeq apeqVarBn16 = defpackage.agab.bn(apeqVar31, apeqVar32);
                            if (apeqVarBn16 != null) {
                                akzxVarM4.u();
                                defpackage.aper aperVar54 = (defpackage.aper) akzxVarM4.b;
                                j$.util.Objects.requireNonNull(apeqVarBn16);
                                aperVar54.an = apeqVarBn16;
                                aperVar54.c |= i4;
                            }
                            if ((aperVar.c & i7) != 0) {
                                long j35 = aperVar.ao - aperVar4.ao;
                                if (j35 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar55 = (defpackage.aper) akzxVarM4.b;
                                    aperVar55.c |= i7;
                                    aperVar55.ao = j35;
                                }
                            }
                            if ((aperVar.c & 524288) != 0) {
                                long j36 = aperVar.ap - aperVar4.ap;
                                if (j36 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar56 = (defpackage.aper) akzxVarM4.b;
                                    aperVar56.c |= 524288;
                                    aperVar56.ap = j36;
                                }
                            }
                            if ((aperVar.c & 1048576) != 0) {
                                long j37 = aperVar.aq - aperVar4.aq;
                                if (j37 != 0) {
                                    akzxVarM4.u();
                                    defpackage.aper aperVar57 = (defpackage.aper) akzxVarM4.b;
                                    aperVar57.c |= 1048576;
                                    aperVar57.aq = j37;
                                }
                            }
                            aperVar = (defpackage.aper) akzxVarM4.r();
                            if (defpackage.agab.bs(aperVar)) {
                                aperVar = null;
                            }
                        }
                        if (aperVar == null) {
                            aperVar2 = null;
                        } else {
                            defpackage.akzx akzxVarL2 = aperVar.L();
                            defpackage.agab.bt(akzxVarL2, (defpackage.aeqh) ((defpackage.adao) obj2).a);
                            aperVar2 = (defpackage.aper) akzxVarL2.r();
                        }
                        if (aperVar2 != null && (aperVar2.b & 1) != 0 && aperVar2.d > 0) {
                            akzxVarM = apei.a.m();
                            long jLongValue5 = l6.longValue() - l5.longValue();
                            akzxVarM.u();
                            apei apeiVar9 = akzxVarM.b;
                            apeiVar9.b |= 64;
                            apeiVar9.i = jLongValue5;
                            i = aeqoVar.i;
                            if (i != 0) {
                                akzxVarM.u();
                                apei apeiVar10 = akzxVarM.b;
                                apeiVar10.c = i - 1;
                                apeiVar10.b |= 1;
                            }
                            str = aeqoVar.f;
                            if (str != null) {
                                akzxVarM.u();
                                apei apeiVar11 = akzxVarM.b;
                                j$.util.Objects.requireNonNull(str);
                                apeiVar11.b |= 8;
                                apeiVar11.f = str;
                            }
                            apevVar = aeqoVar.g;
                            if (apevVar != null) {
                                akzxVarM.u();
                                apei apeiVar12 = akzxVarM.b;
                                j$.util.Objects.requireNonNull(apevVar);
                                apeiVar12.g = apevVar;
                                apeiVar12.b |= 16;
                            }
                            i2 = aeqoVar2.i;
                            if (i2 != 0) {
                                akzxVarM.u();
                                apei apeiVar13 = akzxVarM.b;
                                apeiVar13.h = i2 - 1;
                                apeiVar13.b |= 32;
                            }
                            long jLongValue6 = l6.longValue();
                            akzxVarM.u();
                            apei apeiVar14 = akzxVarM.b;
                            apeiVar14.b |= 256;
                            apeiVar14.k = jLongValue6;
                            num = aeqoVar.h;
                            if (num != null && (num2 = aeqoVar2.h) != null) {
                                int iIntValue2 = num2.intValue() - num.intValue();
                                akzxVarM.u();
                                apei apeiVar15 = akzxVarM.b;
                                apeiVar15.b |= 512;
                                apeiVar15.l = iIntValue2;
                            }
                            akzxVarM.u();
                            apei apeiVar16 = akzxVarM.b;
                            j$.util.Objects.requireNonNull(aperVar2);
                            apeiVar16.j = aperVar2;
                            apeiVar16.b |= 128;
                            defpackage.akzx akzxVarM5 = defpackage.apgu.a.m();
                            defpackage.akzx akzxVarM6 = defpackage.apej.a.m();
                            akzxVarM6.u();
                            defpackage.apej apejVar3 = (defpackage.apej) akzxVarM6.b;
                            apei apeiVarR2 = akzxVarM.r();
                            j$.util.Objects.requireNonNull(apeiVarR2);
                            apejVar3.c = apeiVarR2;
                            apejVar3.b |= 1;
                            akzxVarM5.u();
                            defpackage.apgu apguVar2 = (defpackage.apgu) akzxVarM5.b;
                            defpackage.apej apejVar4 = (defpackage.apej) akzxVarM6.r();
                            j$.util.Objects.requireNonNull(apejVar4);
                            apguVar2.k = apejVar4;
                            apguVar2.b |= 256;
                            return (defpackage.apgu) akzxVarM5.r();
                        }
                    }
                }
            }
        }
        return null;
    }

    public aesp(java.lang.String str, defpackage.adao adaoVar, defpackage.aazc aazcVar, defpackage.aoin aoinVar) {
        this.b = str;
        this.c = adaoVar;
        this.d = aazcVar;
        this.a = aoinVar;
    }
}
