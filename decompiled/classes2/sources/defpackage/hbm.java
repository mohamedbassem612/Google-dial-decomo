package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbm extends defpackage.hbk {
    private final android.graphics.PointF e;
    private final float[] f;
    private final float[] g;
    private final android.graphics.PathMeasure h;
    private defpackage.hbl i;

    public hbm(java.util.List list) {
        super(list);
        this.e = new android.graphics.PointF();
        this.f = new float[2];
        this.g = new float[2];
        this.h = new android.graphics.PathMeasure();
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        float f2;
        defpackage.hbl hblVar = (defpackage.hbl) hgnVar;
        android.graphics.Path path = hblVar.a;
        if (path == null) {
            return (android.graphics.PointF) hgnVar.b;
        }
        defpackage.hgp hgpVar = this.d;
        if (hgpVar != null) {
            f2 = f;
            android.graphics.PointF pointF = (android.graphics.PointF) hgpVar.b(hblVar.g, hblVar.h.floatValue(), (android.graphics.PointF) hblVar.b, (android.graphics.PointF) hblVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.i != hblVar) {
            this.h.setPath(path, false);
            this.i = hblVar;
        }
        android.graphics.PathMeasure pathMeasure = this.h;
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.f;
        float[] fArr2 = this.g;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        android.graphics.PointF pointF2 = this.e;
        pointF2.set(fArr[0], fArr[1]);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 <= length) {
            return pointF2;
        }
        float f4 = f3 - length;
        pointF2.offset(fArr2[0] * f4, fArr2[1] * f4);
        return pointF2;
    }
}
