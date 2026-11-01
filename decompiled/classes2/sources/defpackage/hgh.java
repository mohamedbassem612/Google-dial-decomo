package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hgh {
    public static final /* synthetic */ int a = 0;
    private static final android.graphics.PointF b = new android.graphics.PointF();

    static int a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static android.graphics.PointF b(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return new android.graphics.PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void c(defpackage.hdy hdyVar, android.graphics.Path path) {
        android.graphics.Path path2;
        path.reset();
        android.graphics.PointF pointF = hdyVar.b;
        path.moveTo(pointF.x, pointF.y);
        android.graphics.PointF pointF2 = b;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            java.util.List list = hdyVar.a;
            if (i >= list.size()) {
                break;
            }
            defpackage.hct hctVar = (defpackage.hct) list.get(i);
            android.graphics.PointF pointF3 = hctVar.a;
            android.graphics.PointF pointF4 = hctVar.b;
            android.graphics.PointF pointF5 = hctVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        android.graphics.Path path3 = path;
        if (hdyVar.c) {
            path3.close();
        }
    }

    public static void d(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2, defpackage.hao haoVar) {
        if (hcwVar.d(haoVar.g(), i)) {
            list.add(hcwVar2.b(haoVar.g()).c(haoVar));
        }
    }
}
