package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hel extends defpackage.hef {
    private final android.graphics.RectF j;
    private final android.graphics.Paint k;
    private final float[] l;
    private final android.graphics.Path m;
    private final defpackage.hei n;
    private defpackage.hbd o;
    private defpackage.hbd p;

    public hel(defpackage.gzs gzsVar, defpackage.hei heiVar) {
        super(gzsVar, heiVar);
        this.j = new android.graphics.RectF();
        defpackage.hae haeVar = new defpackage.hae();
        this.k = haeVar;
        this.l = new float[8];
        this.m = new android.graphics.Path();
        this.n = heiVar;
        haeVar.setAlpha(0);
        haeVar.setStyle(android.graphics.Paint.Style.FILL);
        haeVar.setColor(heiVar.k);
    }

    @Override // defpackage.hef, defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        super.a(obj, hgpVar);
        if (obj == defpackage.gzx.K) {
            if (hgpVar == null) {
                this.o = null;
                return;
            } else {
                this.o = new defpackage.hbu(hgpVar, null);
                return;
            }
        }
        if (obj == defpackage.gzx.a) {
            if (hgpVar != null) {
                this.p = new defpackage.hbu(hgpVar, null);
            } else {
                this.p = null;
                this.k.setColor(this.n.k);
            }
        }
    }

    @Override // defpackage.hef, defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        defpackage.hei heiVar = this.n;
        float f = heiVar.i;
        float f2 = heiVar.j;
        android.graphics.RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.hef
    public final void j(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        defpackage.hei heiVar = this.n;
        int i2 = heiVar.k;
        int iAlpha = android.graphics.Color.alpha(i2);
        if (iAlpha != 0) {
            defpackage.hbd hbdVar = this.p;
            java.lang.Integer num = hbdVar == null ? null : (java.lang.Integer) hbdVar.e();
            android.graphics.Paint paint = this.k;
            if (num != null) {
                paint.setColor(num.intValue());
            } else {
                paint.setColor(i2);
            }
            defpackage.hbd hbdVar2 = this.g.e;
            int iIntValue = hbdVar2 == null ? 100 : ((java.lang.Integer) hbdVar2.e()).intValue();
            android.graphics.Paint paint2 = this.k;
            int i3 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
            paint2.setAlpha(i3);
            defpackage.hbd hbdVar3 = this.o;
            if (hbdVar3 != null) {
                paint2.setColorFilter((android.graphics.ColorFilter) hbdVar3.e());
            }
            if (i3 > 0) {
                float[] fArr = this.l;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f = heiVar.i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = heiVar.j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                android.graphics.Path path = this.m;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, paint2);
            }
        }
    }
}
