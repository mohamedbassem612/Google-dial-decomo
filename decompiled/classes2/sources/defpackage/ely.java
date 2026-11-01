package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ely {
    public final java.util.List a;
    public final java.util.List b;
    private final long c;

    /* JADX WARN: Code duplicated, block: B:17:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00af  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4 A[LOOP:0: B:11:0x008a->B:34:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[EDGE_INSN: B:50:0x00f7->B:35:0x00f7 BREAK  A[LOOP:0: B:11:0x008a->B:34:0x00f4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7 A[EDGE_INSN: B:51:0x00f7->B:35:0x00f7 BREAK  A[LOOP:0: B:11:0x008a->B:34:0x00f4], SYNTHETIC] */
    public ely(java.util.List list, long j) {
        java.util.List listBd;
        java.util.List listBd2;
        java.util.List list2;
        int size;
        int i;
        defpackage.ell ellVar;
        aooh.f(list, "features");
        this.a = list;
        this.c = j;
        aokv aokvVar = new aokv(10);
        defpackage.ell ellVar2 = null;
        int i2 = 0;
        if (list.size() <= 0 || ((defpackage.elq) list.get(0)).b.size() != 3) {
            listBd = null;
            listBd2 = null;
        } else {
            aoiu aoiuVarK = ((defpackage.ell) ((defpackage.elq) list.get(0)).b.get(1)).k(0.5f);
            defpackage.ell ellVar3 = (defpackage.ell) aoiuVarK.a;
            defpackage.ell ellVar4 = (defpackage.ell) aoiuVarK.b;
            listBd2 = ajsz.bd(new defpackage.ell[]{(defpackage.ell) ((defpackage.elq) list.get(0)).b.get(0), ellVar3});
            listBd = ajsz.bd(new defpackage.ell[]{ellVar4, (defpackage.ell) ((defpackage.elq) list.get(0)).b.get(2)});
        }
        int size2 = list.size();
        defpackage.ell ellVar5 = null;
        if (size2 >= 0) {
            defpackage.ell ellVar6 = null;
            int i3 = 0;
            while (true) {
                if (i3 == 0) {
                    if (listBd != null) {
                        list2 = listBd;
                        i3 = 0;
                    } else {
                        i3 = 0;
                        if (i3 == this.a.size()) {
                            list2 = ((defpackage.elq) this.a.get(i3)).b;
                        } else {
                            if (listBd2 != null) {
                                break;
                                break;
                            }
                            list2 = listBd2;
                        }
                    }
                    size = list2.size();
                    for (i = 0; i < size; i++) {
                        ellVar = (defpackage.ell) list2.get(i);
                        if (!ellVar.l()) {
                            if (ellVar6 != null) {
                                aokvVar.add(ellVar6);
                            }
                            if (ellVar5 == null) {
                                ellVar5 = ellVar;
                                ellVar6 = ellVar5;
                            } else {
                                ellVar6 = ellVar;
                            }
                        } else if (ellVar6 != null) {
                            float[] fArr = ellVar6.a;
                            float[] fArrCopyOf = java.util.Arrays.copyOf(fArr, fArr.length);
                            aooh.e(fArrCopyOf, "copyOf(...)");
                            defpackage.ell ellVar7 = new defpackage.ell(fArrCopyOf);
                            ellVar7.a[6] = ellVar.c();
                            ellVar7.a[7] = ellVar.d();
                            ellVar6 = ellVar7;
                        } else {
                            ellVar6 = null;
                        }
                    }
                    if (i3 != size2) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    if (i3 == this.a.size()) {
                        list2 = ((defpackage.elq) this.a.get(i3)).b;
                    } else if (listBd2 != null) {
                        break;
                    } else {
                        list2 = listBd2;
                    }
                    size = list2.size();
                    while (i < size) {
                        ellVar = (defpackage.ell) list2.get(i);
                        if (!ellVar.l()) {
                            if (ellVar6 != null) {
                                aokvVar.add(ellVar6);
                            }
                            if (ellVar5 == null) {
                                ellVar5 = ellVar;
                                ellVar6 = ellVar5;
                            } else {
                                ellVar6 = ellVar;
                            }
                        } else if (ellVar6 != null) {
                            float[] fArr2 = ellVar6.a;
                            float[] fArrCopyOf2 = java.util.Arrays.copyOf(fArr2, fArr2.length);
                            aooh.e(fArrCopyOf2, "copyOf(...)");
                            defpackage.ell ellVar8 = new defpackage.ell(fArrCopyOf2);
                            ellVar8.a[6] = ellVar.c();
                            ellVar8.a[7] = ellVar.d();
                            ellVar6 = ellVar8;
                        } else {
                            ellVar6 = null;
                        }
                    }
                    if (i3 != size2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            ellVar2 = ellVar6;
        }
        if (ellVar2 == null || ellVar5 == null) {
            aokvVar.add(defpackage.aaf.h(a(), b(), a(), b(), a(), b(), a(), b()));
        } else {
            aokvVar.add(defpackage.aaf.h(ellVar2.a(), ellVar2.b(), ellVar2.e(), ellVar2.f(), ellVar2.g(), ellVar2.h(), ellVar5.a(), ellVar5.b()));
        }
        aokv aokvVarAX = ajsz.aX(aokvVar);
        this.b = aokvVarAX;
        java.lang.Object obj = aokvVarAX.get(aokvVarAX.b - 1);
        int i4 = aokvVarAX.b;
        while (i2 < i4) {
            defpackage.ell ellVar9 = (defpackage.ell) this.b.get(i2);
            defpackage.ell ellVar10 = (defpackage.ell) obj;
            if (java.lang.Math.abs(ellVar9.a() - ellVar10.c()) > 1.0E-4f || java.lang.Math.abs(ellVar9.b() - ellVar10.d()) > 1.0E-4f) {
                throw new java.lang.IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i2++;
            obj = ellVar9;
        }
    }

    public static /* synthetic */ float[] e(defpackage.ely elyVar, float[] fArr, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        float[] fArr2 = (i & 1) != 0 ? new float[4] : fArr;
        aooh.f(fArr2, "bounds");
        int length = fArr2.length;
        aokv aokvVar = elyVar.b;
        int i2 = aokvVar.b;
        char c6 = 0;
        float fMax = Float.MIN_VALUE;
        int i3 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        while (i3 < i2) {
            defpackage.ell ellVar = (defpackage.ell) aokvVar.get(i3);
            aooh.f(fArr2, "bounds");
            if (ellVar.l()) {
                fArr2[c6] = ellVar.a();
                fArr2[c5] = ellVar.b();
                fArr2[2] = ellVar.a();
                fArr2[3] = ellVar.b();
                c = c5;
                c2 = c6;
                c3 = 3;
                c4 = 2;
            } else {
                float fMin3 = java.lang.Math.min(ellVar.a(), ellVar.c());
                c = c5;
                float fMin4 = java.lang.Math.min(ellVar.b(), ellVar.d());
                c2 = c6;
                float fMax3 = java.lang.Math.max(ellVar.a(), ellVar.c());
                c3 = 3;
                float fMax4 = java.lang.Math.max(ellVar.b(), ellVar.d());
                c4 = 2;
                fArr2[c2] = java.lang.Math.min(fMin3, java.lang.Math.min(ellVar.e(), ellVar.g()));
                fArr2[c] = java.lang.Math.min(fMin4, java.lang.Math.min(ellVar.f(), ellVar.h()));
                fArr2[2] = java.lang.Math.max(fMax3, java.lang.Math.max(ellVar.e(), ellVar.g()));
                fArr2[3] = java.lang.Math.max(fMax4, java.lang.Math.max(ellVar.f(), ellVar.h()));
            }
            fMin = java.lang.Math.min(fMin, fArr2[c2]);
            fMin2 = java.lang.Math.min(fMin2, fArr2[c]);
            fMax = java.lang.Math.max(fMax, fArr2[c4]);
            fMax2 = java.lang.Math.max(fMax2, fArr2[c3]);
            i3++;
            c6 = c2;
            c5 = c;
        }
        fArr2[c6] = fMin;
        fArr2[c5] = fMin2;
        fArr2[2] = fMax;
        fArr2[3] = fMax2;
        return fArr2;
    }

    public final float a() {
        return defpackage.akf.h(this.c);
    }

    public final float b() {
        return defpackage.akf.i(this.c);
    }

    public final defpackage.ely c() {
        float[] fArrE = e(this, null, 3);
        float f = fArrE[2] - fArrE[0];
        float f2 = fArrE[3] - fArrE[1];
        float fMax = java.lang.Math.max(f, f2);
        return d(new defpackage.elx(((fMax - f) / 2.0f) - fArrE[0], fMax, ((fMax - f2) / 2.0f) - fArrE[1]));
    }

    public final defpackage.ely d(defpackage.elu eluVar) {
        long j = this.c;
        long jA = eluVar.a(defpackage.akf.h(j), defpackage.akf.i(j));
        long jBj = mni.bj(java.lang.Float.intBitsToFloat((int) (jA >> 32)), java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)));
        aokv aokvVar = new aokv(10);
        java.util.List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aokvVar.add(((defpackage.elq) list.get(i)).a(eluVar));
        }
        return new defpackage.ely(ajsz.aX(aokvVar), jBj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ely) {
            return aooh.n(this.a, ((defpackage.ely) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        java.util.List list = this.a;
        return "[RoundedPolygon. Cubics = " + ajsz.cr(this.b, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 63) + " || Features = " + ajsz.cr(list, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 63) + " || Center = (" + a() + ", " + b() + ")]";
    }
}
