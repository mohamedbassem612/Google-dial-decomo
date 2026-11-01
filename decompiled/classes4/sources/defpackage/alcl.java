package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alcl extends alcn {
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(h(obj, j));
    }

    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(g(obj, j));
    }

    public final void c(java.lang.Object obj, long j, boolean z) {
        if (alco.b) {
            alco.j(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            alco.k(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    public final void d(java.lang.Object obj, long j, double d) {
        k(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    public final void e(java.lang.Object obj, long j, float f) {
        j(obj, j, java.lang.Float.floatToIntBits(f));
    }

    public final boolean f(java.lang.Object obj, long j) {
        if (alco.b) {
            return alco.p(obj, j);
        }
        return alco.a(obj, j) != 0;
    }
}
