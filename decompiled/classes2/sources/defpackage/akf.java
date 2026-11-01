package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class akf {
    public static cqf a;
    public static csh b;
    public static cpu c;

    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static /* synthetic */ java.lang.String c(int i) {
        if (i != 1) {
            return i != 2 ? "COLLAPSED" : "NOT_CROSSED";
        }
        return "CROSSED";
    }

    public static final long d(float[] fArr) {
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (true) {
            int length = fArr.length;
            if (i >= length) {
                float f3 = length >> 1;
                return mni.bj(f / f3, f2 / f3);
            }
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.ely e(float[] fArr, defpackage.elk elkVar, java.util.List list, float f, float f2) {
        float f3;
        float f4;
        int i;
        int i2;
        java.util.List listAY;
        defpackage.ell ellVarH;
        aoiu aoiuVar;
        defpackage.elk elkVar2;
        int length = fArr.length;
        if (length < 6) {
            throw new java.lang.IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i3 = 1;
        if ((length & 1) == 1) {
            throw new java.lang.IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && (list.size() << 1) != length) {
            throw new java.lang.IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = length >> 1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i5 = 0;
        int i6 = 0;
        while (i6 < i4) {
            defpackage.elk elkVar3 = (list == null || (elkVar2 = (defpackage.elk) list.get(i6)) == null) ? elkVar : elkVar2;
            int i7 = i6 + 1;
            int i8 = (((i6 + i4) - 1) % i4) << 1;
            int i9 = i6 << 1;
            int i10 = (i7 % i4) << 1;
            arrayList2.add(new defpackage.elw(mni.bj(fArr[i8], fArr[i8 + 1]), mni.bj(fArr[i9], fArr[i9 + 1]), mni.bj(fArr[i10], fArr[i10 + 1]), elkVar3));
            i6 = i7;
        }
        aopq aopqVarC = aooc.C(0, i4);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(aopqVarC, 10));
        aopp aoppVarA = aopqVarC.a();
        while (true) {
            f3 = 0.0f;
            f4 = 1.0f;
            if (!aoppVarA.a) {
                break;
            }
            int iA = aoppVarA.a();
            int i11 = (iA + 1) % i4;
            float f5 = ((defpackage.elw) arrayList2.get(iA)).g + ((defpackage.elw) arrayList2.get(i11)).g;
            float fB = ((defpackage.elw) arrayList2.get(iA)).b() + ((defpackage.elw) arrayList2.get(i11)).b();
            int i12 = iA << 1;
            int i13 = i11 << 1;
            float fA = defpackage.ema.a(fArr[i12] - fArr[i13], fArr[i12 + 1] - fArr[i13 + 1]);
            if (f5 > fA) {
                aoiuVar = new aoiu(java.lang.Float.valueOf(fA / f5), java.lang.Float.valueOf(0.0f));
            } else if (fB > fA) {
                aoiuVar = new aoiu(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf((fA - f5) / (fB - f5)));
            } else {
                java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
                aoiuVar = new aoiu(fValueOf, fValueOf);
            }
            arrayList3.add(aoiuVar);
        }
        int i14 = 0;
        while (i14 < i4) {
            defpackage.acf acfVar = new defpackage.acf(2);
            int i15 = i5;
            while (i15 < 2) {
                aoiu aoiuVar2 = (aoiu) arrayList3.get((((i14 + i4) - 1) + i15) % i4);
                acfVar.c((((defpackage.elw) arrayList2.get(i14)).g * ((java.lang.Number) aoiuVar2.a).floatValue()) + ((((defpackage.elw) arrayList2.get(i14)).b() - ((defpackage.elw) arrayList2.get(i14)).g) * ((java.lang.Number) aoiuVar2.b).floatValue()));
                i15++;
                f3 = f3;
                f4 = f4;
            }
            float f6 = f3;
            float f7 = f4;
            defpackage.elw elwVar = (defpackage.elw) arrayList2.get(i14);
            float fA2 = acfVar.a(i5);
            float fA3 = acfVar.a(i3);
            float fMin = java.lang.Math.min(fA2, fA3);
            float f8 = elwVar.g;
            if (f8 < 1.0E-4f || fMin < 1.0E-4f) {
                i = i3;
            } else {
                i = i3;
                float f9 = elwVar.f;
                if (f9 >= 1.0E-4f) {
                    float fMin2 = java.lang.Math.min(fMin, f8);
                    float fA4 = elwVar.a(fA2);
                    float fA5 = elwVar.a(fA3);
                    float f10 = (f9 * fMin2) / f8;
                    float f11 = defpackage.ema.a;
                    float fSqrt = (float) java.lang.Math.sqrt((f10 * f10) + (fMin2 * fMin2));
                    long j = elwVar.b;
                    int i16 = i5;
                    long j2 = elwVar.d;
                    long j3 = elwVar.e;
                    i2 = i16;
                    elwVar.h = m(j, n(k(j(m(j2, j3), 2.0f)), fSqrt));
                    long jM = m(j, n(j2, fMin2));
                    long jM2 = m(j, n(j3, fMin2));
                    defpackage.ell ellVarC = defpackage.elw.c(fMin2, fA4, j, elwVar.a, jM, jM2, elwVar.h, f10);
                    defpackage.ell ellVarC2 = defpackage.elw.c(fMin2, fA5, j, elwVar.c, jM2, jM, elwVar.h, f10);
                    defpackage.ell ellVarH2 = defpackage.aaf.h(ellVarC2.c(), ellVarC2.d(), ellVarC2.g(), ellVarC2.h(), ellVarC2.e(), ellVarC2.f(), ellVarC2.a(), ellVarC2.b());
                    defpackage.ell[] ellVarArr = new defpackage.ell[3];
                    ellVarArr[i2] = ellVarC;
                    float fH = h(elwVar.h);
                    float fI = i(elwVar.h);
                    float fC = ellVarC.c();
                    float fD = ellVarC.d();
                    float fA6 = ellVarH2.a();
                    float fB2 = ellVarH2.b();
                    float f12 = fC - fH;
                    float f13 = fD - fI;
                    float f14 = fA6 - fH;
                    float f15 = fB2 - fI;
                    long jB = defpackage.ema.b(f12, f13);
                    long jB2 = defpackage.ema.b(f14, f15);
                    long jC = defpackage.ema.c(jB);
                    long jC2 = defpackage.ema.c(jB2);
                    float fH2 = h(jC) * f14;
                    float fI2 = i(jC) * f15;
                    float f16 = f(jB, jB2);
                    if (f16 > 0.999f) {
                        ellVarH = defpackage.aaf.i(fC, fD, fA6, fB2);
                    } else {
                        float f17 = fH2 + fI2;
                        float f18 = f7 - f16;
                        float fA7 = ((((defpackage.ema.a(f12, f13) * 4.0f) / 3.0f) * (((float) java.lang.Math.sqrt(f18 + f18)) - ((float) java.lang.Math.sqrt(f7 - (f16 * f16))))) / f18) * (f17 >= f6 ? f7 : -1.0f);
                        ellVarH = defpackage.aaf.h(fC, fD, (h(jC) * fA7) + fC, (i(jC) * fA7) + fD, fA6 - (h(jC2) * fA7), fB2 - (i(jC2) * fA7), fA6, fB2);
                    }
                    ellVarArr[i] = ellVarH;
                    ellVarArr[2] = ellVarH2;
                    listAY = ajsz.bb(ellVarArr);
                }
                arrayList.add(listAY);
                i14++;
                f3 = f6;
                f4 = f7;
                i3 = i;
                arrayList2 = arrayList2;
                arrayList3 = arrayList3;
                i5 = i2;
            }
            i2 = i5;
            long j4 = elwVar.b;
            elwVar.h = j4;
            listAY = ajsz.aY(defpackage.aaf.i(h(j4), i(j4), h(j4), i(j4)));
            arrayList.add(listAY);
            i14++;
            f3 = f6;
            f4 = f7;
            i3 = i;
            arrayList2 = arrayList2;
            arrayList3 = arrayList3;
            i5 = i2;
        }
        int i17 = i3;
        int i18 = i5;
        float f19 = f3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int i19 = i18;
        while (i19 < i4) {
            int i20 = i19 + 1;
            int i21 = i19 << 1;
            long jBj = mni.bj(fArr[i21], fArr[i21 + 1]);
            int i22 = (((i19 + i4) - 1) % i4) << 1;
            long jBj2 = mni.bj(fArr[i22], fArr[i22 + 1]);
            int i23 = i20 % i4;
            int i24 = i23 << 1;
            long jBj3 = mni.bj(fArr[i24], fArr[i24 + 1]);
            float f20 = defpackage.ema.a;
            long jL = l(jBj, jBj2);
            long jL2 = l(jBj3, jBj);
            arrayList4.add(new defpackage.elo((java.util.List) arrayList.get(i19), (h(jL) * i(jL2)) - (i(jL) * h(jL2)) > f19 ? i17 : i18));
            arrayList4.add(new defpackage.elp(ajsz.aY(defpackage.aaf.i(((defpackage.ell) ajsz.bI((java.util.List) arrayList.get(i19))).c(), ((defpackage.ell) ajsz.bI((java.util.List) arrayList.get(i19))).d(), ((defpackage.ell) ajsz.bE((java.util.List) arrayList.get(i23))).a(), ((defpackage.ell) ajsz.bE((java.util.List) arrayList.get(i23))).b()))));
            i19 = i20;
        }
        long jD = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? d(fArr) : mni.bj(f, f2);
        int i25 = (int) (jD & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i25);
        if (arrayList4.size() < 2) {
            throw new java.lang.IllegalArgumentException("Polygons must have at least 2 features");
        }
        aokv aokvVar = new aokv(10);
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            for (defpackage.ell ellVar : ((defpackage.elq) it.next()).b) {
                aokvVar.add(java.lang.Float.valueOf(ellVar.a()));
                aokvVar.add(java.lang.Float.valueOf(ellVar.b()));
            }
        }
        float[] fArrCl = ajsz.cl(ajsz.aX(aokvVar));
        if (java.lang.Float.isNaN(fIntBitsToFloat)) {
            fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (d(fArrCl) >> 32));
        }
        if (java.lang.Float.isNaN(fIntBitsToFloat2)) {
            fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (d(fArrCl) & 4294967295L));
        }
        return new defpackage.ely(arrayList4, mni.bj(fIntBitsToFloat, fIntBitsToFloat2));
    }

    public static final float f(long j, long j2) {
        return (h(j) * h(j2)) + (i(j) * i(j2));
    }

    public static final float g(long j) {
        return (float) java.lang.Math.sqrt((h(j) * h(j)) + (i(j) * i(j)));
    }

    public static final float h(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float i(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long j(long j, float f) {
        return mni.bj(h(j) / f, i(j) / f);
    }

    public static final long k(long j) {
        float fG = g(j);
        if (fG > 0.0f) {
            return j(j, fG);
        }
        throw new java.lang.IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static final long l(long j, long j2) {
        return mni.bj(h(j) - h(j2), i(j) - i(j2));
    }

    public static final long m(long j, long j2) {
        return mni.bj(h(j) + h(j2), i(j) + i(j2));
    }

    public static final long n(long j, float f) {
        return mni.bj(h(j) * f, i(j) * f);
    }

    public static final long o(defpackage.ell ellVar, float f) {
        long jBj = mni.bj(ellVar.a(), ellVar.b());
        int i = 1;
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long jI = ellVar.i(f4);
            float fG = g(l(jI, jBj));
            if (fG >= f3) {
                return mni.bj(f4 - ((1.0f - (f3 / fG)) / 3.0f), f);
            }
            f3 -= fG;
            f2 += fG;
            if (i == 3) {
                return mni.bj(1.0f, f2);
            }
            i++;
            jBj = jI;
        }
    }

    public static final float p(defpackage.ell ellVar) {
        aooh.f(ellVar, "c");
        return java.lang.Float.intBitsToFloat((int) (o(ellVar, Float.POSITIVE_INFINITY) & 4294967295L));
    }

    public static final defpackage.elt q(defpackage.akf akfVar, defpackage.ely elyVar) {
        java.util.List listAY;
        aooh.f(elyVar, "polygon");
        java.util.ArrayList<defpackage.ell> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = elyVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.elq elqVar = (defpackage.elq) list.get(i);
            java.util.List list2 = elqVar.b;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((elqVar instanceof defpackage.elo) && i2 == list2.size() / 2) {
                    arrayList2.add(new aoiu(elqVar, java.lang.Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i2));
            }
        }
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        int iBl = ajsz.bl(arrayList, 9);
        if (iBl == 0) {
            listAY = ajsz.aY(fValueOf);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(iBl + 1);
            arrayList3.add(fValueOf);
            for (defpackage.ell ellVar : arrayList) {
                float fFloatValue = fValueOf.floatValue();
                float fP = p(ellVar);
                if (fP < 0.0f) {
                    throw new java.lang.IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                fValueOf = java.lang.Float.valueOf(fFloatValue + fP);
                arrayList3.add(fValueOf);
            }
            listAY = arrayList3;
        }
        float fFloatValue2 = ((java.lang.Number) ajsz.bI(listAY)).floatValue();
        defpackage.acf acfVar = new defpackage.acf(listAY.size());
        int size3 = listAY.size();
        for (int i3 = 0; i3 < size3; i3++) {
            acfVar.c(((java.lang.Number) listAY.get(i3)).floatValue() / fFloatValue2);
        }
        aokv aokvVar = new aokv(10);
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int iIntValue = ((java.lang.Number) ((aoiu) arrayList2.get(i4)).b).intValue();
            float fA = acfVar.a(iIntValue) + acfVar.a(iIntValue + 1);
            float f = defpackage.ema.a;
            aokvVar.add(new defpackage.elv((((fA / 2.0f) % 1.0f) + 1.0f) % 1.0f, (defpackage.elq) ((aoiu) arrayList2.get(i4)).a));
        }
        return new defpackage.elt(akfVar, ajsz.aX(aokvVar), arrayList, acfVar);
    }
}
