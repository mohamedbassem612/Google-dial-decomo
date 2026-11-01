package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdy {
    public final java.util.List a;
    public android.graphics.PointF b;
    public boolean c;

    public hdy(android.graphics.PointF pointF, boolean z, java.util.List list) {
        this.b = pointF;
        this.c = z;
        this.a = new java.util.ArrayList(list);
    }

    public final void a(float f, float f2) {
        android.graphics.PointF pointF = this.b;
        if (pointF == null) {
            pointF = new android.graphics.PointF();
            this.b = pointF;
        }
        pointF.set(f, f2);
    }

    public final java.lang.String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public hdy() {
        this.a = new java.util.ArrayList();
    }
}
