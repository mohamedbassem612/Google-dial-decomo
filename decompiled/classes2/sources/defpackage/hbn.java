package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbn extends defpackage.hbk {
    private final android.graphics.PointF e;

    public hbn(java.util.List list) {
        super(list);
        this.e = new android.graphics.PointF();
    }

    @Override // defpackage.hbd
    public final /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        return g(hgnVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hbd
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final android.graphics.PointF g(defpackage.hgn hgnVar, float f, float f2, float f3) {
        java.lang.Object obj;
        android.graphics.PointF pointF;
        java.lang.Object obj2 = hgnVar.b;
        if (obj2 == null || (obj = hgnVar.c) == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        android.graphics.PointF pointF2 = (android.graphics.PointF) obj2;
        android.graphics.PointF pointF3 = (android.graphics.PointF) obj;
        defpackage.hgp hgpVar = this.d;
        if (hgpVar != null && (pointF = (android.graphics.PointF) hgpVar.b(hgnVar.g, hgnVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        android.graphics.PointF pointF4 = this.e;
        pointF4.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
