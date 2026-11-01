package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agan {
    private final defpackage.agav[] a = new defpackage.agav[4];
    private final android.graphics.Matrix[] b = new android.graphics.Matrix[4];
    private final android.graphics.Matrix[] c = new android.graphics.Matrix[4];
    private final android.graphics.PointF d = new android.graphics.PointF();
    private final android.graphics.Path e = new android.graphics.Path();
    private final android.graphics.Path f = new android.graphics.Path();
    private final defpackage.agav g = new defpackage.agav();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final android.graphics.Path j = new android.graphics.Path();
    private final android.graphics.Path k = new android.graphics.Path();
    private boolean l = true;

    public agan() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new defpackage.agav();
            this.b[i] = new android.graphics.Matrix();
            this.c[i] = new android.graphics.Matrix();
        }
    }

    public static defpackage.agan a() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread() ? defpackage.agam.a : new defpackage.agan();
    }

    static final defpackage.afzz b(int i, defpackage.agal agalVar) {
        if (i == 1) {
            return agalVar.d;
        }
        if (i != 2) {
            return i != 3 ? agalVar.c : agalVar.b;
        }
        return agalVar.e;
    }

    private final boolean d(android.graphics.Path path, int i) {
        android.graphics.Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, android.graphics.Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.BitSet] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    public final void c(defpackage.agal agalVar, float[] fArr, float f, android.graphics.RectF rectF, defpackage.apnt apntVar, android.graphics.Path path) {
        int i;
        ?? r3;
        defpackage.agab agabVar;
        char c;
        defpackage.agab agabVar2;
        path.rewind();
        android.graphics.Path path2 = this.e;
        path2.rewind();
        android.graphics.Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, android.graphics.Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            defpackage.afzz afzzVarB = fArr == null ? b(i2, agalVar) : new afzy(fArr[i2]);
            if (i2 == 1) {
                agabVar2 = agalVar.l;
            } else if (i2 != 2) {
                agabVar2 = i2 != 3 ? agalVar.k : agalVar.j;
            } else {
                agabVar2 = agalVar.m;
            }
            defpackage.agav[] agavVarArr = this.a;
            agabVar2.b(agavVarArr[i2], f, afzzVarB.a(rectF));
            int i3 = i2 + 1;
            android.graphics.Matrix[] matrixArr = this.b;
            matrixArr[i2].reset();
            android.graphics.PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr[i2].setTranslate(pointF.x, pointF.y);
            float f2 = (i3 % 4) * 90;
            matrixArr[i2].preRotate(f2);
            float[] fArr2 = this.h;
            defpackage.agav agavVar = agavVarArr[i2];
            fArr2[0] = agavVar.c;
            fArr2[1] = agavVar.d;
            matrixArr[i2].mapPoints(fArr2);
            android.graphics.Matrix[] matrixArr2 = this.c;
            matrixArr2[i2].reset();
            matrixArr2[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i2].preRotate(f2);
            i2 = i3;
        }
        int i4 = 1;
        char c2 = 0;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            float[] fArr3 = this.h;
            defpackage.agav[] agavVarArr2 = this.a;
            defpackage.agav agavVar2 = agavVarArr2[i5];
            fArr3[c2] = agavVar2.a;
            fArr3[i4] = agavVar2.b;
            android.graphics.Matrix[] matrixArr3 = this.b;
            matrixArr3[i5].mapPoints(fArr3);
            if (i5 == 0) {
                path.moveTo(fArr3[c2], fArr3[i4]);
            } else {
                path.lineTo(fArr3[c2], fArr3[i4]);
            }
            agavVarArr2[i5].c(matrixArr3[i5], path);
            if (apntVar != null) {
                defpackage.agav agavVar3 = agavVarArr2[i5];
                android.graphics.Matrix matrix = matrixArr3[i5];
                defpackage.agaf agafVar = (defpackage.agaf) apntVar.a;
                ?? r4 = c2;
                agafVar.t.set(i5, r4);
                agafVar.r[i5] = agavVar3.a(matrix);
                r3 = r4;
            } else {
                r3 = c2;
            }
            int i6 = i5 + 1;
            defpackage.agav agavVar4 = agavVarArr2[i5];
            fArr3[r3] = agavVar4.c;
            fArr3[i4] = agavVar4.d;
            matrixArr3[i5].mapPoints(fArr3);
            float[] fArr4 = this.i;
            int i7 = i6 % 4;
            defpackage.agav agavVar5 = agavVarArr2[i7];
            ?? r16 = r3;
            fArr4[r16 == true ? 1 : 0] = agavVar5.a;
            fArr4[i4] = agavVar5.b;
            matrixArr3[i7].mapPoints(fArr4);
            float fMax = java.lang.Math.max(((float) java.lang.Math.hypot(fArr3[r16 == true ? 1 : 0] - fArr4[r16 == true ? 1 : 0], fArr3[i4] - fArr4[i4])) - 0.001f, 0.0f);
            defpackage.agav agavVar6 = agavVarArr2[i5];
            fArr3[0] = agavVar6.c;
            fArr3[i4] = agavVar6.d;
            matrixArr3[i5].mapPoints(fArr3);
            int i8 = i4;
            float fAbs = (i5 == i8 || i5 == 3) ? java.lang.Math.abs(rectF.centerX() - fArr3[0]) : java.lang.Math.abs(rectF.centerY() - fArr3[i8]);
            defpackage.agav agavVar7 = this.g;
            agavVar7.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i5 == 1) {
                agabVar = agalVar.h;
            } else if (i5 != 2) {
                agabVar = i5 != 3 ? agalVar.g : agalVar.f;
            } else {
                agabVar = agalVar.i;
            }
            agabVar.c(fMax, fAbs, f, agavVar7);
            android.graphics.Path path4 = this.j;
            path4.reset();
            android.graphics.Matrix[] matrixArr4 = this.c;
            agavVar7.c(matrixArr4[i5], path4);
            if (this.l && (agabVar.d() || d(path4, i5) || d(path4, i7))) {
                path4.op(path4, path3, android.graphics.Path.Op.DIFFERENCE);
                fArr3[0] = agavVar7.a;
                i4 = 1;
                fArr3[1] = agavVar7.b;
                matrixArr4[i5].mapPoints(fArr3);
                path2.moveTo(fArr3[0], fArr3[1]);
                agavVar7.c(matrixArr4[i5], path2);
            } else {
                i4 = 1;
                agavVar7.c(matrixArr4[i5], path);
            }
            if (apntVar != null) {
                android.graphics.Matrix matrix2 = matrixArr4[i5];
                defpackage.agaf agafVar2 = (defpackage.agaf) apntVar.a;
                c = 0;
                agafVar2.t.set(i5 + 4, false);
                agafVar2.s[i5] = agavVar7.a(matrix2);
            } else {
                c = 0;
            }
            i5 = i6;
            c2 = c;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, android.graphics.Path.Op.UNION);
    }
}
