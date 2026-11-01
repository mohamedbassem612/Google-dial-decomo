package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ham extends defpackage.haf {
    private final java.lang.String d;
    private final boolean e;
    private final adb f;
    private final adb g;
    private final android.graphics.RectF h;
    private final int i;
    private final defpackage.hbd j;
    private final defpackage.hbd k;
    private final defpackage.hbd l;
    private defpackage.hbu m;
    private final int n;

    public ham(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hdr hdrVar) {
        super(gzsVar, hefVar, defpackage.hgt.n(hdrVar.l), defpackage.hgt.m(hdrVar.m), hdrVar.g, hdrVar.c, hdrVar.f, hdrVar.h, hdrVar.i);
        this.f = new adb(10);
        this.g = new adb(10);
        this.h = new android.graphics.RectF();
        this.d = hdrVar.a;
        this.n = hdrVar.k;
        this.e = hdrVar.j;
        this.i = (int) (gzsVar.b.a() / 32.0f);
        defpackage.hbd hbdVarA = hdrVar.b.a();
        this.j = hbdVarA;
        hbdVarA.h(this);
        hefVar.i(hbdVarA);
        defpackage.hbd hbdVarA2 = hdrVar.d.a();
        this.k = hbdVarA2;
        hbdVarA2.h(this);
        hefVar.i(hbdVarA2);
        defpackage.hbd hbdVarA3 = hdrVar.e.a();
        this.l = hbdVarA3;
        hbdVarA3.h(this);
        hefVar.i(hbdVarA3);
    }

    private final int h() {
        float f = this.k.c;
        float f2 = this.i;
        int iRound = java.lang.Math.round(f * f2);
        int iRound2 = java.lang.Math.round(this.l.c * f2);
        int iRound3 = java.lang.Math.round(this.j.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        defpackage.hbu hbuVar = this.m;
        if (hbuVar != null) {
            java.lang.Integer[] numArr = (java.lang.Integer[]) hbuVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                int[] iArr2 = new int[length2];
                while (i < numArr.length) {
                    iArr2[i] = numArr[i].intValue();
                    i++;
                }
                return iArr2;
            }
            while (i < iArr.length) {
                iArr[i] = numArr[i].intValue();
                i++;
            }
        }
        return iArr;
    }

    @Override // defpackage.haf, defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        super.a(obj, hgpVar);
        if (obj == defpackage.gzx.L) {
            defpackage.hbu hbuVar = this.m;
            if (hbuVar != null) {
                this.a.k(hbuVar);
            }
            if (hgpVar == null) {
                this.m = null;
                return;
            }
            defpackage.hbu hbuVar2 = new defpackage.hbu(hgpVar, null);
            this.m = hbuVar2;
            hbuVar2.h(this);
            this.a.i(this.m);
        }
    }

    @Override // defpackage.haf, defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        android.graphics.Shader shader;
        android.graphics.Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            int iH = h();
            adb adbVar = this.f;
            long j = iH;
            shader = (android.graphics.LinearGradient) adbVar.d(j);
            if (shader == null) {
                android.graphics.PointF pointF = (android.graphics.PointF) this.k.e();
                android.graphics.PointF pointF2 = (android.graphics.PointF) this.l.e();
                defpackage.hdp hdpVar = (defpackage.hdp) this.j.e();
                radialGradient = new android.graphics.LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(hdpVar.b), hdpVar.a, android.graphics.Shader.TileMode.CLAMP);
                adbVar.g(j, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            adb adbVar2 = this.g;
            long j2 = iH2;
            shader = (android.graphics.RadialGradient) adbVar2.d(j2);
            if (shader == null) {
                android.graphics.PointF pointF3 = (android.graphics.PointF) this.k.e();
                android.graphics.PointF pointF4 = (android.graphics.PointF) this.l.e();
                defpackage.hdp hdpVar2 = (defpackage.hdp) this.j.e();
                int[] iArrI = i(hdpVar2.b);
                float[] fArr = hdpVar2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new android.graphics.RadialGradient(f, f2, (float) java.lang.Math.hypot(pointF4.x - f, pointF4.y - f2), iArrI, fArr, android.graphics.Shader.TileMode.CLAMP);
                adbVar2.g(j2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.d;
    }
}
