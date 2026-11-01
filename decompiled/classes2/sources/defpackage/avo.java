package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class avo {
    public static final java.lang.Void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final java.lang.Void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void d(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void e(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static final void f(long j, android.os.Parcel parcel) {
        long jB = dps.b(j);
        byte b = 0;
        if (!anty.ah(jB, 0L)) {
            if (anty.ah(jB, 4294967296L)) {
                b = 1;
            } else if (anty.ah(jB, 8589934592L)) {
                b = 2;
            }
        }
        parcel.writeByte(b);
        if (anty.ah(dps.b(j), 0L)) {
            return;
        }
        parcel.writeFloat(dps.a(j));
    }

    public static final int g(aoir aoirVar) {
        return ((java.lang.Number) aoirVar.a()).intValue();
    }

    public static final defpackage.bkn h(defpackage.bkn bknVar, defpackage.bkl bklVar, int i) {
        return new defpackage.bkn(bklVar.f.n(i), i, bknVar.b);
    }

    public static final defpackage.bkn i(final defpackage.blg blgVar, final defpackage.bkl bklVar, defpackage.bkn bknVar) {
        final int i = blgVar.l() ? bklVar.c : bklVar.d;
        if ((blgVar.l() ? blgVar.c() : blgVar.a()) != bklVar.b) {
            return bklVar.b(i);
        }
        final aoir aoirVarAh = aooc.ah(3, new ahrx(bklVar, i, 1));
        final int i2 = blgVar.l() ? bklVar.d : bklVar.c;
        aoir aoirVarAh2 = aooc.ah(3, new aomy() { // from class: bkt
            public final java.lang.Object a() {
                int iG;
                int iD;
                defpackage.bkl bklVar2 = bklVar;
                dkw dkwVar = bklVar2.f;
                int i3 = i;
                defpackage.blg blgVar2 = blgVar;
                int iG2 = defpackage.avo.g(aoirVarAh);
                boolean zL = blgVar2.l();
                int iN = blgVar2.n();
                long jI = dkwVar.i(i3);
                if (dkwVar.e(dky.d(jI)) == iG2) {
                    iG = dky.d(jI);
                } else {
                    iG = iG2 >= dkwVar.c() ? dkwVar.g(dkwVar.c() - 1) : dkwVar.g(iG2);
                }
                if (dkwVar.e(dky.a(jI)) == iG2) {
                    iD = dky.a(jI);
                } else {
                    iD = iG2 >= dkwVar.c() ? dkwVar.d(dkwVar.c() - 1, false) : dkwVar.d(iG2, false);
                }
                int i4 = i2;
                if (iG == i4) {
                    return bklVar2.b(iD);
                }
                if (iD == i4) {
                    return bklVar2.b(iG);
                }
                if (!(zL ^ (iN == 1)) ? i3 >= iG : i3 > iD) {
                    iG = iD;
                }
                return bklVar2.b(iG);
            }
        });
        if (bklVar.a != bknVar.b) {
            return u(aoirVarAh2);
        }
        int i3 = bklVar.e;
        if (i == i3) {
            return bknVar;
        }
        dkw dkwVar = bklVar.f;
        if (g(aoirVarAh) != dkwVar.e(i3)) {
            return u(aoirVarAh2);
        }
        int i4 = bknVar.a;
        long jI = dkwVar.i(i4);
        boolean zL = blgVar.l();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zL ^ (bklVar.f() == 1))) {
                }
            }
            return bklVar.b(i);
        }
        return (i4 == dky.d(jI) || i4 == dky.a(jI)) ? u(aoirVarAh2) : bklVar.b(i);
    }

    public static final defpackage.bko j(defpackage.blg blgVar, defpackage.bjy bjyVar) {
        boolean z = blgVar.n() == 1;
        return new defpackage.bko(t(blgVar.h(), z, true, blgVar.c(), bjyVar), t(blgVar.f(), z, false, blgVar.a(), bjyVar), z);
    }

    public static final int k(long j, dkw dkwVar) {
        int i = (int) (4294967295L & j);
        if (java.lang.Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        return java.lang.Float.intBitsToFloat(i) >= dkwVar.b.e ? dkwVar.a.a.a() : dkwVar.h(j);
    }

    public static final int l(defpackage.bkn bknVar, java.util.Comparator comparator, long j, int i) {
        int iCompare = comparator.compare(java.lang.Long.valueOf(bknVar.b), java.lang.Long.valueOf(j));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare <= 0 ? bknVar.a : i;
    }

    public static final int m(defpackage.blh blhVar, int i, int i2, long j, boolean z) {
        int i3;
        defpackage.blg blgVar;
        int iA;
        defpackage.bkl bklVarF;
        defpackage.bko bkoVar = blhVar.e;
        if (bkoVar == null) {
            return defpackage.li.j(i, i2);
        }
        int iCompare = blhVar.g.compare(java.lang.Long.valueOf((z ? bkoVar.a : bkoVar.b).b), java.lang.Long.valueOf(j));
        if (iCompare < 0) {
            i3 = 1;
        } else {
            i3 = iCompare > 0 ? 3 : 2;
        }
        if (i3 != 2) {
            return i3;
        }
        if (blhVar.h && (blgVar = blhVar.f) != null) {
            if (z) {
                iA = blgVar.c();
                bklVarF = blgVar.h();
            } else {
                iA = blgVar.a();
                bklVarF = blgVar.f();
            }
            int i4 = bklVarF.b;
            if (iA < i4) {
                return 1;
            }
            if (iA > i4) {
                return 3;
            }
        }
        return 2;
    }

    public static final void n(java.lang.Object obj, java.lang.Object obj2, emx emxVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(696924721);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(obj2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 1024 : 2048;
        }
        if (cbtVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & (-897);
            cbt cbtVar = cbtVarB;
            cbtVar.Z(-127, (java.lang.Object) null, 0, (java.lang.Object) null);
            if ((i & 1) == 0 || cbtVarB.E()) {
                emxVar = (emx) cbtVarB.e(eom.a);
            } else {
                cbtVarB.s();
            }
            cbtVarB.l();
            boolean zB = cbtVarB.B(obj) | cbtVarB.B(obj2) | cbtVarB.B(emxVar);
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                objR = new xfi(emxVar.P(), 1, (byte[]) null);
                cbtVar.ab(objR);
            }
            o(emxVar, (xfi) objR, aonjVar, cbtVarB, (i4 >> 3) & 896);
        } else {
            cbtVarB.s();
        }
        emx emxVar2 = emxVar;
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.biu(obj, obj2, (java.lang.Object) emxVar2, aonjVar, i, 6);
        }
    }

    public static final void o(emx emxVar, xfi xfiVar, aonj aonjVar, cav cavVar, int i) {
        int i2;
        emx emxVar2;
        xfi xfiVar2;
        aonj aonjVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(228371534);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(emxVar) : cbtVarB.D(emxVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(xfiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonjVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            boolean zD = cbtVarB.D(xfiVar) | ((i2 & 896) == 256);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cbtVarB.D(emxVar))) {
                z = false;
            }
            boolean z2 = zD | z;
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z2 || objR == cau.a) {
                emxVar2 = emxVar;
                xfiVar2 = xfiVar;
                aonjVar2 = aonjVar;
                objR = new afx(emxVar2, xfiVar2, aonjVar2, 17, (char[]) null);
                cbtVar.ab(objR);
            } else {
                emxVar2 = emxVar;
                xfiVar2 = xfiVar;
                aonjVar2 = aonjVar;
            }
            cbp.b(emxVar2, xfiVar2, (aonj) objR, cbtVarB);
        } else {
            emxVar2 = emxVar;
            xfiVar2 = xfiVar;
            aonjVar2 = aonjVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(emxVar2, xfiVar2, aonjVar2, i, 14);
        }
    }

    public static final void p(gii giiVar) {
        ems emsVarP = giiVar.P();
        emq emqVarA = emsVarP.a();
        if (emqVarA == emq.b || emqVarA.a(emq.d)) {
            giiVar.aT().f(defpackage.eni.class);
        } else {
            emsVarP.c(new defpackage.emr(giiVar, 2));
        }
    }

    public static float q(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = java.lang.Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }

    public static final defpackage.ely r(int i) {
        if (i < 3) {
            throw new java.lang.IllegalArgumentException("Circle must have at least three vertices");
        }
        float f = defpackage.ema.a / i;
        float fCos = (float) java.lang.Math.cos(f);
        defpackage.elk elkVar = new defpackage.elk(1.0f, 0.0f);
        float[] fArr = new float[i << 1];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long jM = defpackage.akf.m(defpackage.ema.d(1.0f / fCos, (f + f) * i3), mni.bj(0.0f, 0.0f));
            fArr[i2] = defpackage.akf.h(jM);
            fArr[i2 + 1] = defpackage.akf.i(jM);
            i2 += 2;
        }
        return defpackage.akf.e(fArr, elkVar, null, 0.0f, 0.0f);
    }

    public static /* synthetic */ defpackage.ely s(int i, float f, float f2, defpackage.elk elkVar, defpackage.elk elkVar2, int i2) {
        if ((i2 & 8) != 0) {
            elkVar = defpackage.elk.a;
        }
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        java.util.ArrayList arrayList = null;
        if ((i2 & 16) != 0) {
            elkVar2 = null;
        }
        if (f > 0.0f) {
            if ((i2 & 4) != 0) {
                f2 = 0.5f;
            }
            if (f2 > 0.0f) {
                if (f2 >= f) {
                    throw new java.lang.IllegalArgumentException("innerRadius must be less than radius");
                }
                if (elkVar2 != null) {
                    aopq aopqVarC = aooc.C(0, i);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    aopp aoppVarA = aopqVarC.a();
                    while (aoppVarA.a) {
                        aoppVarA.a();
                        ajsz.bv(arrayList2, ajsz.bb(new defpackage.elk[]{elkVar, elkVar2}));
                    }
                    arrayList = arrayList2;
                }
                float[] fArr = new float[i << 2];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    float f3 = defpackage.ema.a / i;
                    long jD = defpackage.ema.d(f, (f3 + f3) * i4);
                    fArr[i3] = defpackage.akf.h(jD) + 0.0f;
                    fArr[i3 + 1] = defpackage.akf.i(jD) + 0.0f;
                    long jD2 = defpackage.ema.d(f2, f3 * ((i4 << 1) + 1));
                    int i5 = i3 + 3;
                    fArr[i3 + 2] = defpackage.akf.h(jD2) + 0.0f;
                    i3 += 4;
                    fArr[i5] = defpackage.akf.i(jD2) + 0.0f;
                }
                return defpackage.akf.e(fArr, elkVar, arrayList, 0.0f, 0.0f);
            }
        }
        throw new java.lang.IllegalArgumentException("Star radii must both be greater than 0");
    }

    private static final defpackage.bkn t(defpackage.bkl bklVar, boolean z, boolean z2, int i, defpackage.bjy bjyVar) {
        int i2 = z2 ? bklVar.c : bklVar.d;
        if (i != bklVar.b) {
            return bklVar.b(i2);
        }
        long jA = bjyVar.a(bklVar, i2);
        return bklVar.b(z2 ^ z ? dky.d(jA) : dky.a(jA));
    }

    private static final defpackage.bkn u(aoir aoirVar) {
        return (defpackage.bkn) aoirVar.a();
    }
}
