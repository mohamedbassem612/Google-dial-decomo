package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbp extends defpackage.hbd {
    public java.util.List e;
    private final defpackage.hdy f;
    private final android.graphics.Path g;
    private android.graphics.Path h;
    private android.graphics.Path i;

    public hbp(java.util.List list) {
        super(list);
        this.f = new defpackage.hdy();
        this.g = new android.graphics.Path();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0384  */
    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        defpackage.hdy hdyVar;
        defpackage.hdy hdyVar2;
        defpackage.hdy hdyVar3;
        defpackage.hdy hdyVar4;
        defpackage.hdy hdyVar5;
        int i;
        defpackage.hdy hdyVar6;
        defpackage.hdy hdyVar7;
        int i2;
        android.graphics.PointF pointF;
        android.graphics.PointF pointF2;
        defpackage.hdy hdyVar8;
        defpackage.hdy hdyVar9 = (defpackage.hdy) hgnVar.b;
        defpackage.hdy hdyVar10 = (defpackage.hdy) hgnVar.c;
        defpackage.hdy hdyVar11 = hdyVar10 == null ? hdyVar9 : hdyVar10;
        defpackage.hdy hdyVar12 = this.f;
        if (hdyVar12.b == null) {
            hdyVar12.b = new android.graphics.PointF();
        }
        hdyVar12.c = hdyVar9.c || hdyVar11.c;
        java.util.List list = hdyVar9.a;
        int size = list.size();
        java.util.List list2 = hdyVar11.a;
        if (size != list2.size()) {
            defpackage.hge.a("Curves must have the same number of control points. Shape 1: " + list.size() + "\tShape 2: " + list2.size());
        }
        int iMin = java.lang.Math.min(list.size(), list2.size());
        java.util.List list3 = hdyVar12.a;
        if (list3.size() < iMin) {
            for (int size2 = list3.size(); size2 < iMin; size2++) {
                list3.add(new defpackage.hct());
            }
        } else if (list3.size() > iMin) {
            int size3 = list3.size();
            while (true) {
                size3--;
                if (size3 < iMin) {
                    break;
                }
                list3.remove(list3.size() - 1);
            }
        }
        android.graphics.PointF pointF3 = hdyVar9.b;
        android.graphics.PointF pointF4 = hdyVar11.b;
        float f2 = pointF3.x;
        float f3 = pointF4.x;
        int i3 = defpackage.hgh.a;
        float f4 = pointF3.y;
        hdyVar12.a(f2 + ((f3 - f2) * f), f4 + ((pointF4.y - f4) * f));
        int size4 = list3.size() - 1;
        while (size4 >= 0) {
            defpackage.hct hctVar = (defpackage.hct) list.get(size4);
            defpackage.hct hctVar2 = (defpackage.hct) list2.get(size4);
            android.graphics.PointF pointF5 = hctVar.a;
            android.graphics.PointF pointF6 = hctVar.b;
            android.graphics.PointF pointF7 = hctVar.c;
            android.graphics.PointF pointF8 = hctVar2.a;
            android.graphics.PointF pointF9 = hctVar2.b;
            android.graphics.PointF pointF10 = hctVar2.c;
            defpackage.hct hctVar3 = (defpackage.hct) list3.get(size4);
            defpackage.hdy hdyVar13 = hdyVar12;
            float f5 = pointF5.x;
            float f6 = f5 + ((pointF8.x - f5) * f);
            float f7 = pointF5.y;
            hctVar3.a(f6, f7 + ((pointF8.y - f7) * f));
            defpackage.hct hctVar4 = (defpackage.hct) list3.get(size4);
            float f8 = pointF6.x;
            float f9 = f8 + ((pointF9.x - f8) * f);
            float f10 = pointF6.y;
            hctVar4.b(f9, f10 + ((pointF9.y - f10) * f));
            defpackage.hct hctVar5 = (defpackage.hct) list3.get(size4);
            float f11 = pointF7.x;
            float f12 = f11 + ((pointF10.x - f11) * f);
            float f13 = pointF7.y;
            hctVar5.c(f12, f13 + ((pointF10.y - f13) * f));
            size4--;
            hdyVar12 = hdyVar13;
        }
        defpackage.hdy hdyVar14 = hdyVar12;
        java.util.List list4 = this.e;
        if (list4 != null) {
            int size5 = list4.size() - 1;
            defpackage.hdy hdyVar15 = hdyVar14;
            while (size5 >= 0) {
                defpackage.hau hauVar = (defpackage.hau) this.e.get(size5);
                java.util.List list5 = hdyVar15.a;
                if (list5.size() > 2) {
                    float fFloatValue = ((java.lang.Float) hauVar.a.e()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z = hdyVar15.c;
                        int size6 = list5.size() - 1;
                        int i4 = 0;
                        while (size6 >= 0) {
                            defpackage.hct hctVar6 = (defpackage.hct) list5.get(size6);
                            int i5 = size6 - 1;
                            int size7 = list5.size();
                            defpackage.hct hctVar7 = (defpackage.hct) list5.get(i5 - (defpackage.hau.a(i5, size7) * size7));
                            android.graphics.PointF pointF11 = (size6 != 0 || z) ? hctVar7.c : hdyVar15.b;
                            int i6 = size5;
                            i4 = (((size6 != 0 || z) ? hctVar7.b : pointF11).equals(pointF11) && hctVar6.a.equals(pointF11) && !(!hdyVar15.c && (size6 == 0 || size6 == list5.size() + (-1)))) ? i4 + 2 : i4 + 1;
                            size6 = i5;
                            size5 = i6;
                        }
                        i = size5;
                        defpackage.hdy hdyVar16 = hauVar.b;
                        if (hdyVar16 == null || hdyVar16.a.size() != i4) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(i4);
                            for (int i7 = 0; i7 < i4; i7++) {
                                arrayList.add(new defpackage.hct());
                            }
                            i2 = 0;
                            hauVar.b = new defpackage.hdy(new android.graphics.PointF(0.0f, 0.0f), false, arrayList);
                        } else {
                            i2 = 0;
                        }
                        defpackage.hdy hdyVar17 = hauVar.b;
                        hdyVar17.c = z;
                        hdyVar17.a(hdyVar15.b.x, hdyVar15.b.y);
                        java.util.List list6 = hdyVar17.a;
                        boolean z2 = hdyVar15.c;
                        int i8 = i2;
                        int i9 = i8;
                        while (i8 < list5.size()) {
                            int i10 = i9 + 1;
                            int i11 = i9 - 1;
                            defpackage.hct hctVar8 = (defpackage.hct) list5.get(i8);
                            int i12 = i8 - 1;
                            float f14 = fFloatValue;
                            int size8 = list5.size();
                            defpackage.hct hctVar9 = (defpackage.hct) list5.get(i12 - (defpackage.hau.a(i12, size8) * size8));
                            int i13 = i8 - 2;
                            boolean z3 = z2;
                            int size9 = list5.size();
                            defpackage.hct hctVar10 = (defpackage.hct) list5.get(i13 - (defpackage.hau.a(i13, size9) * size9));
                            if (i8 != 0) {
                                pointF = hctVar9.c;
                            } else if (z3) {
                                i8 = 0;
                                pointF = hctVar9.c;
                            } else {
                                pointF = hdyVar15.b;
                                i8 = 0;
                            }
                            if (i8 != 0) {
                                pointF2 = hctVar9.b;
                            } else if (z3) {
                                i8 = 0;
                                pointF2 = hctVar9.b;
                            } else {
                                pointF2 = pointF;
                                i8 = 0;
                            }
                            android.graphics.PointF pointF12 = hctVar8.a;
                            android.graphics.PointF pointF13 = hctVar10.c;
                            android.graphics.PointF pointF14 = hctVar8.c;
                            defpackage.hdy hdyVar18 = hdyVar10;
                            boolean z4 = !hdyVar15.c && (i8 == 0 || i8 == list5.size() + (-1));
                            if (pointF2.equals(pointF) && pointF12.equals(pointF) && !z4) {
                                float f15 = pointF.x - pointF13.x;
                                float f16 = pointF.y - pointF13.y;
                                float f17 = pointF14.x - pointF.x;
                                float f18 = pointF14.y - pointF.y;
                                defpackage.hdy hdyVar19 = hdyVar17;
                                float fHypot = (float) java.lang.Math.hypot(f15, f16);
                                float fHypot2 = (float) java.lang.Math.hypot(f17, f18);
                                float fMin = java.lang.Math.min(f14 / fHypot, 0.5f);
                                float fMin2 = java.lang.Math.min(f14 / fHypot2, 0.5f);
                                float f19 = pointF.x + ((pointF13.x - pointF.x) * fMin);
                                float f20 = pointF.y + ((pointF13.y - pointF.y) * fMin);
                                float f21 = pointF.x + ((pointF14.x - pointF.x) * fMin2);
                                float f22 = pointF.y + ((pointF14.y - pointF.y) * fMin2);
                                float f23 = f19 - pointF.x;
                                float f24 = f20 - pointF.y;
                                float f25 = f21 - pointF.x;
                                float f26 = f22 - pointF.y;
                                int size10 = list6.size();
                                defpackage.hct hctVar11 = (defpackage.hct) list6.get(i11 - (defpackage.hau.a(i11, size10) * size10));
                                defpackage.hct hctVar12 = (defpackage.hct) list6.get(i9);
                                hctVar11.b(f19, f20);
                                hctVar11.c(f19, f20);
                                if (i8 == 0) {
                                    hdyVar19.a(f19, f20);
                                }
                                hctVar12.a(f19 - (f23 * 0.5519f), f20 - (f24 * 0.5519f));
                                defpackage.hct hctVar13 = (defpackage.hct) list6.get(i10);
                                hctVar12.b(f21 - (f25 * 0.5519f), f22 - (f26 * 0.5519f));
                                hctVar12.c(f21, f22);
                                hctVar13.a(f21, f22);
                                i9 += 2;
                                hdyVar8 = hdyVar19;
                            } else {
                                hdyVar8 = hdyVar17;
                                int size11 = list6.size();
                                defpackage.hct hctVar14 = (defpackage.hct) list6.get(i11 - (defpackage.hau.a(i11, size11) * size11));
                                defpackage.hct hctVar15 = (defpackage.hct) list6.get(i9);
                                android.graphics.PointF pointF15 = hctVar9.b;
                                hctVar14.b(pointF15.x, pointF15.y);
                                android.graphics.PointF pointF16 = hctVar9.c;
                                hctVar14.c(pointF16.x, pointF16.y);
                                hctVar15.a(pointF12.x, pointF12.y);
                                i9 = i10;
                            }
                            i8++;
                            hdyVar9 = hdyVar9;
                            fFloatValue = f14;
                            z2 = z3;
                            list5 = list5;
                            hdyVar10 = hdyVar18;
                            hdyVar15 = hdyVar15;
                            hdyVar17 = hdyVar8;
                        }
                        hdyVar7 = hdyVar9;
                        hdyVar5 = hdyVar10;
                        hdyVar6 = hdyVar17;
                    } else {
                        hdyVar5 = hdyVar10;
                        i = size5;
                        hdyVar6 = hdyVar15;
                        hdyVar7 = hdyVar9;
                    }
                } else {
                    hdyVar5 = hdyVar10;
                    i = size5;
                    hdyVar6 = hdyVar15;
                    hdyVar7 = hdyVar9;
                }
                size5 = i - 1;
                hdyVar9 = hdyVar7;
                hdyVar10 = hdyVar5;
                hdyVar15 = hdyVar6;
            }
            hdyVar = hdyVar15;
            hdyVar3 = hdyVar10;
            hdyVar2 = hdyVar9;
        } else {
            hdyVar = hdyVar14;
            hdyVar2 = hdyVar9;
            hdyVar3 = hdyVar10;
        }
        android.graphics.Path path = this.g;
        defpackage.hgh.c(hdyVar, path);
        if (this.d == null) {
            return path;
        }
        if (this.h == null) {
            this.h = new android.graphics.Path();
            this.i = new android.graphics.Path();
        }
        defpackage.hgh.c(hdyVar2, this.h);
        if (hdyVar3 != null) {
            hdyVar4 = hdyVar3;
            defpackage.hgh.c(hdyVar4, this.i);
        } else {
            hdyVar4 = hdyVar3;
        }
        defpackage.hgp hgpVar = this.d;
        float f27 = hgnVar.g;
        float fFloatValue2 = hgnVar.h.floatValue();
        android.graphics.Path path2 = this.h;
        return (android.graphics.Path) hgpVar.b(f27, fFloatValue2, path2, hdyVar4 == null ? path2 : this.i, f, c(), this.c);
    }
}
