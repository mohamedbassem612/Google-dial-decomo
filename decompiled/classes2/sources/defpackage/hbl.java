package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbl extends defpackage.hgn {
    public android.graphics.Path a;
    private final defpackage.hgn n;

    public hbl(defpackage.gzh gzhVar, defpackage.hgn hgnVar) {
        super(gzhVar, (android.graphics.PointF) hgnVar.b, (android.graphics.PointF) hgnVar.c, hgnVar.d, hgnVar.e, hgnVar.f, hgnVar.g, hgnVar.h);
        this.n = hgnVar;
        a();
    }

    public final void a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((android.graphics.PointF) obj2).equals(((android.graphics.PointF) obj3).x, ((android.graphics.PointF) this.c).y)) {
            z = true;
        }
        java.lang.Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        defpackage.hgn hgnVar = this.n;
        android.graphics.PointF pointF = (android.graphics.PointF) obj4;
        android.graphics.PointF pointF2 = (android.graphics.PointF) obj;
        android.graphics.PointF pointF3 = hgnVar.l;
        android.graphics.PointF pointF4 = hgnVar.m;
        java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF.x + pointF3.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        this.a = path;
    }
}
