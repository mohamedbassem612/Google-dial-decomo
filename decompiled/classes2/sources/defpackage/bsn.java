package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bsn {
    public static final ajb a = new ajb(0.3f, 0.0f, 0.8f, 0.15f);
    public static final ajb b = new ajb(0.2f, 0.0f, 0.0f, 1.0f);

    public static final void a(csj csjVar, float f, float f2, long j, csm csmVar) {
        long jO = csjVar.o() >> 32;
        float f3 = csmVar.a / 2.0f;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) jO) - (f3 + f3);
        den.O(csjVar, j, f, f2, (((long) java.lang.Float.floatToRawIntBits(f3)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f3)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), csmVar, 832);
    }

    public static final void b(csj csjVar, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = csjVar.p() == dpq.a;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (a.x(i, 0) || fIntBitsToFloat2 > fIntBitsToFloat) {
            csjVar.r(j, (((long) java.lang.Float.floatToRawIntBits(f5)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(f6)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (java.lang.Math.abs(f2 - f) > 0.0f) {
            if (f6 > f8) {
                f6 = f8;
            }
            if (f5 <= f8) {
                f8 = f5;
            }
            csjVar.r(j, (((long) java.lang.Float.floatToRawIntBits(f8)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(f6)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f4)) & 4294967295L), f3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0181 A[PHI: r9
      0x0181: PHI (r9v6 long) = (r9v3 long), (r9v7 long) binds: [B:84:0x017f, B:80:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0194  */
    public static final void c(final cmw cmwVar, final long j, final float f, final long j2, final int i, final float f2, cav cavVar, final int i2) {
        int i3;
        int i4;
        long j3;
        boolean z;
        boolean z2;
        java.lang.Object objR;
        int i5;
        int i6 = i2 & 6;
        cbt cbtVarB = cavVar.b(333154241);
        if (i6 == 0) {
            i3 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.A(j) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cbtVarB.y(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cbtVarB.A(j2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 = i;
            i3 |= true != cbtVarB.z(i4) ? 8192 : 16384;
        } else {
            i4 = i;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != cbtVarB.y(f2) ? 65536 : 131072;
        }
        if (cbtVarB.H((74899 & i3) != 74898, i3 & 1)) {
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            final csm csmVar = new csm(((dpf) cbtVarB.e(dfo.e)).dl(f), 0.0f, i4, 0, 26);
            defpackage.ajw ajwVarB = wv.b(cbtVarB);
            final cer cerVarA = wv.a(ajwVarB, 0.0f, 1080.0f, den.bw(den.bv(6000, 0, ajk.d, 2), 0, 0L, 6), cbtVarB);
            final cer cerVarA2 = wv.a(ajwVarB, 0.0f, 360.0f, den.bw(den.bu(new defpackage.bpr(14)), 0, 0L, 6), cbtVarB);
            final cer cerVarA3 = wv.a(ajwVarB, 0.1f, 0.87f, den.bw(den.bu(new defpackage.bpr(13)), 0, 0L, 6), cbtVarB);
            cmw cmwVarG = azm.g(defpackage.rk.d(cmwVar), 40.0f);
            boolean zB = cbtVarB.B(cerVarA3) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 896) == 256) | cbtVarB.B(cerVarA) | cbtVarB.B(cerVarA2) | ((((i3 & 7168) ^ 3072) > 2048 && cbtVarB.A(j2)) || (i3 & 3072) == 2048) | cbtVarB.D(csmVar);
            if (((i3 & 112) ^ 48) > 32) {
                j3 = j;
                if (cbtVarB.A(j3)) {
                    z = true;
                }
                z2 = zB | z;
                objR = cbtVar.R();
                if (!z2 || objR == cau.a) {
                    final long j4 = j3;
                    i5 = 0;
                    objR = new aonj() { // from class: bsl
                        public final java.lang.Object a(java.lang.Object obj) {
                            csj csjVar = (csj) obj;
                            ajb ajbVar = defpackage.bsn.a;
                            float fFloatValue = ((java.lang.Number) cerVarA3.a()).floatValue() * 360.0f;
                            int i7 = i;
                            long j5 = j4;
                            boolean zX = a.x(i7, 0);
                            float f3 = f2;
                            long j6 = j2;
                            csm csmVar2 = csmVar;
                            float f4 = (zX || java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) > java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) ? f3 : f + f3 + 0.0f;
                            cer cerVar = cerVarA2;
                            cer cerVar2 = cerVarA;
                            float fDi = (f4 / ((float) (((double) csjVar.di(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((java.lang.Number) cerVar2.a()).floatValue() + ((java.lang.Number) cerVar.a()).floatValue();
                            long jN = csjVar.n();
                            csg csgVarQ = csjVar.q();
                            long jA = csgVarQ.a();
                            csgVarQ.b().g();
                            try {
                                csgVarQ.c.p(fFloatValue2, jN);
                                float fMin = java.lang.Math.min(fFloatValue, fDi) + fFloatValue;
                                float fMin2 = java.lang.Math.min(fFloatValue, fDi);
                                defpackage.bsn.a(csjVar, fMin, (360.0f - fFloatValue) - (fMin2 + fMin2), j6, csmVar2);
                                defpackage.bsn.a(csjVar, 0.0f, fFloatValue, j5, csmVar2);
                                return aojh.a;
                            } finally {
                                csgVarQ.b().e();
                                csgVarQ.h(jA);
                            }
                        }
                    };
                    cbtVar.ab(objR);
                } else {
                    i5 = 0;
                }
                defpackage.yt.a(cmwVarG, (aonj) objR, cbtVarB, i5);
            } else {
                j3 = j;
            }
            if ((i3 & 48) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = zB | z;
            objR = cbtVar.R();
            if (z2) {
                final long j5 = j3;
                i5 = 0;
                objR = new aonj() { // from class: bsl
                    public final java.lang.Object a(java.lang.Object obj) {
                        csj csjVar = (csj) obj;
                        ajb ajbVar = defpackage.bsn.a;
                        float fFloatValue = ((java.lang.Number) cerVarA3.a()).floatValue() * 360.0f;
                        int i7 = i;
                        long j6 = j5;
                        boolean zX = a.x(i7, 0);
                        float f3 = f2;
                        long j7 = j2;
                        csm csmVar2 = csmVar;
                        float f4 = (zX || java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) > java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) ? f3 : f + f3 + 0.0f;
                        cer cerVar = cerVarA2;
                        cer cerVar2 = cerVarA;
                        float fDi = (f4 / ((float) (((double) csjVar.di(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((java.lang.Number) cerVar2.a()).floatValue() + ((java.lang.Number) cerVar.a()).floatValue();
                        long jN = csjVar.n();
                        csg csgVarQ = csjVar.q();
                        long jA = csgVarQ.a();
                        csgVarQ.b().g();
                        try {
                            csgVarQ.c.p(fFloatValue2, jN);
                            float fMin = java.lang.Math.min(fFloatValue, fDi) + fFloatValue;
                            float fMin2 = java.lang.Math.min(fFloatValue, fDi);
                            defpackage.bsn.a(csjVar, fMin, (360.0f - fFloatValue) - (fMin2 + fMin2), j7, csmVar2);
                            defpackage.bsn.a(csjVar, 0.0f, fFloatValue, j6, csmVar2);
                            return aojh.a;
                        } finally {
                            csgVarQ.b().e();
                            csgVarQ.h(jA);
                        }
                    }
                };
                cbtVar.ab(objR);
            } else {
                final long j6 = j3;
                i5 = 0;
                objR = new aonj() { // from class: bsl
                    public final java.lang.Object a(java.lang.Object obj) {
                        csj csjVar = (csj) obj;
                        ajb ajbVar = defpackage.bsn.a;
                        float fFloatValue = ((java.lang.Number) cerVarA3.a()).floatValue() * 360.0f;
                        int i7 = i;
                        long j7 = j6;
                        boolean zX = a.x(i7, 0);
                        float f3 = f2;
                        long j8 = j2;
                        csm csmVar2 = csmVar;
                        float f4 = (zX || java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) > java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) ? f3 : f + f3 + 0.0f;
                        cer cerVar = cerVarA2;
                        cer cerVar2 = cerVarA;
                        float fDi = (f4 / ((float) (((double) csjVar.di(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((java.lang.Number) cerVar2.a()).floatValue() + ((java.lang.Number) cerVar.a()).floatValue();
                        long jN = csjVar.n();
                        csg csgVarQ = csjVar.q();
                        long jA = csgVarQ.a();
                        csgVarQ.b().g();
                        try {
                            csgVarQ.c.p(fFloatValue2, jN);
                            float fMin = java.lang.Math.min(fFloatValue, fDi) + fFloatValue;
                            float fMin2 = java.lang.Math.min(fFloatValue, fDi);
                            defpackage.bsn.a(csjVar, fMin, (360.0f - fFloatValue) - (fMin2 + fMin2), j8, csmVar2);
                            defpackage.bsn.a(csjVar, 0.0f, fFloatValue, j7, csmVar2);
                            return aojh.a;
                        } finally {
                            csgVarQ.b().e();
                            csgVarQ.h(jA);
                        }
                    }
                };
                cbtVar.ab(objR);
            }
            defpackage.yt.a(cmwVarG, (aonj) objR, cbtVarB, i5);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aonn() { // from class: bsm
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    cav cavVar2 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    cmw cmwVar2 = cmwVar;
                    long j7 = j;
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.bsn.c(cmwVar2, j7, f, j2, i, f2, cavVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                    return aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    public static final void d(final cmw cmwVar, final long j, final long j2, final int i, final float f, cav cavVar, final int i2) {
        int i3;
        float f2;
        cer cerVar;
        long j3;
        cbt cbtVar;
        boolean zB;
        java.lang.Object objR;
        int i4;
        int i5 = i2 & 6;
        cbt cbtVarB = cavVar.b(567589233);
        if (i5 == 0) {
            i3 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cbtVarB.A(j) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cbtVarB.A(j2) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cbtVarB.z(i) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            i3 |= true != cbtVarB.y(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if (cbtVarB.H((i3 & 9363) != 9362, i3 & 1)) {
            cbt cbtVar2 = cbtVarB;
            cbtVar2.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i2 & 1) != 0 && !cbtVarB.E()) {
                cbtVarB.s();
            }
            cbtVarB.l();
            defpackage.ajw ajwVarB = wv.b(cbtVarB);
            final cer cerVarA = wv.a(ajwVarB, 0.0f, 1.0f, den.bw(den.bu(new defpackage.bpr(11)), 0, 0L, 6), cbtVarB);
            final cer cerVarA2 = wv.a(ajwVarB, 0.0f, 1.0f, den.bw(den.bu(new defpackage.bpr(12)), 0, 0L, 6), cbtVarB);
            final cer cerVarA3 = wv.a(ajwVarB, 0.0f, 1.0f, den.bw(den.bu(new defpackage.bpr(15)), 0, 0L, 6), cbtVarB);
            cer cerVarA4 = wv.a(ajwVarB, 0.0f, 1.0f, den.bw(den.bu(new defpackage.bpr(16)), 0, 0L, 6), cbtVarB);
            cmw cmwVarI = azm.i(defpackage.rk.d(defpackage.bxd.b), 240.0f, 4.0f);
            boolean zB2 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | cbtVarB.B(cerVarA);
            if (((i3 & 896) ^ 384) > 256) {
                cerVar = cerVarA4;
                j3 = j2;
                if (cbtVarB.A(j3)) {
                    cbtVar = cbtVar2;
                }
                zB = zB2 | z | cbtVarB.B(cerVarA2) | ((((i3 & 112) ^ 48) <= 32 && cbtVarB.A(j)) || (i3 & 48) == 32) | cbtVarB.B(cerVarA3) | cbtVarB.B(cerVar);
                objR = cbtVar.R();
                if (!zB || objR == cau.a) {
                    final long j4 = j3;
                    i4 = 0;
                    final cer cerVar2 = cerVar;
                    final float f3 = f2;
                    objR = new aonj() { // from class: bsk
                        public final java.lang.Object a(java.lang.Object obj) {
                            long j5;
                            csj csjVar = (csj) obj;
                            ajb ajbVar = defpackage.bsn.a;
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                            int i6 = i;
                            float fDi = f3;
                            if (!a.x(i6, 0) && java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) {
                                fDi = fDi + csjVar.di(fIntBitsToFloat) + 0.0f;
                            }
                            long j6 = j4;
                            cer cerVar3 = cerVarA;
                            float fDi2 = fDi / csjVar.di(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                            if (((java.lang.Number) cerVar3.a()).floatValue() < 1.0f - fDi2) {
                                defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar3.a()).floatValue() > 0.0f ? ((java.lang.Number) cerVar3.a()).floatValue() + fDi2 : 0.0f, 1.0f, j6, fIntBitsToFloat, i6);
                            }
                            long j7 = j6;
                            long j8 = j;
                            cer cerVar4 = cerVarA2;
                            if (((java.lang.Number) cerVar3.a()).floatValue() - ((java.lang.Number) cerVar4.a()).floatValue() > 0.0f) {
                                defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar3.a()).floatValue(), ((java.lang.Number) cerVar4.a()).floatValue(), j8, fIntBitsToFloat, i6);
                                j5 = j8;
                            } else {
                                j5 = j8;
                            }
                            cer cerVar5 = cerVarA3;
                            if (((java.lang.Number) cerVar4.a()).floatValue() > fDi2) {
                                defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar5.a()).floatValue() > 0.0f ? ((java.lang.Number) cerVar5.a()).floatValue() + fDi2 : 0.0f, ((java.lang.Number) cerVar4.a()).floatValue() < 1.0f ? ((java.lang.Number) cerVar4.a()).floatValue() - fDi2 : 1.0f, j7, fIntBitsToFloat, i6);
                                j7 = j7;
                            }
                            cer cerVar6 = cerVar2;
                            if (((java.lang.Number) cerVar5.a()).floatValue() - ((java.lang.Number) cerVar6.a()).floatValue() > 0.0f) {
                                defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar5.a()).floatValue(), ((java.lang.Number) cerVar6.a()).floatValue(), j5, fIntBitsToFloat, i6);
                                csjVar = csjVar;
                                fIntBitsToFloat = fIntBitsToFloat;
                            }
                            if (((java.lang.Number) cerVar6.a()).floatValue() > fDi2) {
                                defpackage.bsn.b(csjVar, 0.0f, ((java.lang.Number) cerVar6.a()).floatValue() < 1.0f ? ((java.lang.Number) cerVar6.a()).floatValue() - fDi2 : 1.0f, j7, fIntBitsToFloat, i6);
                            }
                            return aojh.a;
                        }
                    };
                    cbtVar.ab(objR);
                } else {
                    i4 = 0;
                }
                defpackage.yt.a(cmwVarI, (aonj) objR, cbtVarB, i4);
            } else {
                cerVar = cerVarA4;
                j3 = j2;
            }
            cbtVar = cbtVar2;
            boolean z = (i3 & 384) == 256;
            zB = zB2 | z | cbtVarB.B(cerVarA2) | ((((i3 & 112) ^ 48) <= 32 && cbtVarB.A(j)) || (i3 & 48) == 32) | cbtVarB.B(cerVarA3) | cbtVarB.B(cerVar);
            objR = cbtVar.R();
            if (zB) {
                final long j5 = j3;
                i4 = 0;
                final cer cerVar3 = cerVar;
                final float f4 = f2;
                objR = new aonj() { // from class: bsk
                    public final java.lang.Object a(java.lang.Object obj) {
                        long j6;
                        csj csjVar = (csj) obj;
                        ajb ajbVar = defpackage.bsn.a;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                        int i6 = i;
                        float fDi = f4;
                        if (!a.x(i6, 0) && java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) {
                            fDi = fDi + csjVar.di(fIntBitsToFloat) + 0.0f;
                        }
                        long j7 = j5;
                        cer cerVar4 = cerVarA;
                        float fDi2 = fDi / csjVar.di(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                        if (((java.lang.Number) cerVar4.a()).floatValue() < 1.0f - fDi2) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar4.a()).floatValue() > 0.0f ? ((java.lang.Number) cerVar4.a()).floatValue() + fDi2 : 0.0f, 1.0f, j7, fIntBitsToFloat, i6);
                        }
                        long j8 = j7;
                        long j9 = j;
                        cer cerVar5 = cerVarA2;
                        if (((java.lang.Number) cerVar4.a()).floatValue() - ((java.lang.Number) cerVar5.a()).floatValue() > 0.0f) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar4.a()).floatValue(), ((java.lang.Number) cerVar5.a()).floatValue(), j9, fIntBitsToFloat, i6);
                            j6 = j9;
                        } else {
                            j6 = j9;
                        }
                        cer cerVar6 = cerVarA3;
                        if (((java.lang.Number) cerVar5.a()).floatValue() > fDi2) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar6.a()).floatValue() > 0.0f ? ((java.lang.Number) cerVar6.a()).floatValue() + fDi2 : 0.0f, ((java.lang.Number) cerVar5.a()).floatValue() < 1.0f ? ((java.lang.Number) cerVar5.a()).floatValue() - fDi2 : 1.0f, j8, fIntBitsToFloat, i6);
                            j8 = j8;
                        }
                        cer cerVar7 = cerVar3;
                        if (((java.lang.Number) cerVar6.a()).floatValue() - ((java.lang.Number) cerVar7.a()).floatValue() > 0.0f) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar6.a()).floatValue(), ((java.lang.Number) cerVar7.a()).floatValue(), j6, fIntBitsToFloat, i6);
                            csjVar = csjVar;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((java.lang.Number) cerVar7.a()).floatValue() > fDi2) {
                            defpackage.bsn.b(csjVar, 0.0f, ((java.lang.Number) cerVar7.a()).floatValue() < 1.0f ? ((java.lang.Number) cerVar7.a()).floatValue() - fDi2 : 1.0f, j8, fIntBitsToFloat, i6);
                        }
                        return aojh.a;
                    }
                };
                cbtVar.ab(objR);
            } else {
                final long j6 = j3;
                i4 = 0;
                final cer cerVar4 = cerVar;
                final float f5 = f2;
                objR = new aonj() { // from class: bsk
                    public final java.lang.Object a(java.lang.Object obj) {
                        long j7;
                        csj csjVar = (csj) obj;
                        ajb ajbVar = defpackage.bsn.a;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L));
                        int i6 = i;
                        float fDi = f5;
                        if (!a.x(i6, 0) && java.lang.Float.intBitsToFloat((int) (csjVar.o() & 4294967295L)) <= java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32))) {
                            fDi = fDi + csjVar.di(fIntBitsToFloat) + 0.0f;
                        }
                        long j8 = j6;
                        cer cerVar5 = cerVarA;
                        float fDi2 = fDi / csjVar.di(java.lang.Float.intBitsToFloat((int) (csjVar.o() >> 32)));
                        if (((java.lang.Number) cerVar5.a()).floatValue() < 1.0f - fDi2) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar5.a()).floatValue() > 0.0f ? ((java.lang.Number) cerVar5.a()).floatValue() + fDi2 : 0.0f, 1.0f, j8, fIntBitsToFloat, i6);
                        }
                        long j9 = j8;
                        long j10 = j;
                        cer cerVar6 = cerVarA2;
                        if (((java.lang.Number) cerVar5.a()).floatValue() - ((java.lang.Number) cerVar6.a()).floatValue() > 0.0f) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar5.a()).floatValue(), ((java.lang.Number) cerVar6.a()).floatValue(), j10, fIntBitsToFloat, i6);
                            j7 = j10;
                        } else {
                            j7 = j10;
                        }
                        cer cerVar7 = cerVarA3;
                        if (((java.lang.Number) cerVar6.a()).floatValue() > fDi2) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar7.a()).floatValue() > 0.0f ? ((java.lang.Number) cerVar7.a()).floatValue() + fDi2 : 0.0f, ((java.lang.Number) cerVar6.a()).floatValue() < 1.0f ? ((java.lang.Number) cerVar6.a()).floatValue() - fDi2 : 1.0f, j9, fIntBitsToFloat, i6);
                            j9 = j9;
                        }
                        cer cerVar8 = cerVar4;
                        if (((java.lang.Number) cerVar7.a()).floatValue() - ((java.lang.Number) cerVar8.a()).floatValue() > 0.0f) {
                            defpackage.bsn.b(csjVar, ((java.lang.Number) cerVar7.a()).floatValue(), ((java.lang.Number) cerVar8.a()).floatValue(), j7, fIntBitsToFloat, i6);
                            csjVar = csjVar;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((java.lang.Number) cerVar8.a()).floatValue() > fDi2) {
                            defpackage.bsn.b(csjVar, 0.0f, ((java.lang.Number) cerVar8.a()).floatValue() < 1.0f ? ((java.lang.Number) cerVar8.a()).floatValue() - fDi2 : 1.0f, j9, fIntBitsToFloat, i6);
                        }
                        return aojh.a;
                    }
                };
                cbtVar.ab(objR);
            }
            defpackage.yt.a(cmwVarI, (aonj) objR, cbtVarB, i4);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            final int i6 = 1;
            cdkVarI.c = new aonn() { // from class: acqi
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    if (i6 != 0) {
                        cav cavVar2 = (cav) obj;
                        ((java.lang.Integer) obj2).intValue();
                        int i7 = i2;
                        float f6 = f;
                        int i8 = i;
                        long j7 = j2;
                        long j8 = j;
                        int i9 = i7 | 1;
                        int i10 = 306783378 & i9;
                        int i11 = 613566756 & i9;
                        defpackage.bsn.d(cmwVar, j8, j7, i8, f6, cavVar2, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 << 1) & i11));
                        return aojh.a;
                    }
                    cav cavVar3 = (cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    int i12 = i2;
                    float f7 = f;
                    int i13 = i;
                    long j9 = j2;
                    long j10 = j;
                    int i14 = i12 | 1;
                    int i15 = 306783378 & i14;
                    int i16 = 613566756 & i14;
                    aaoo.N(cmwVar, j10, j9, i13, f7, cavVar3, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 << 1) & i16));
                    return aojh.a;
                }
            };
        }
    }
}
