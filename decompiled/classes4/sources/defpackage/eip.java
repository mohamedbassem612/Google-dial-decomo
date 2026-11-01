package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class eip extends eis {
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(j(obj, j));
    }

    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(i(obj, j));
    }

    public final void c(java.lang.Object obj, long j, boolean z) {
        if (eit.a) {
            eit.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            eit.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    public final void d(java.lang.Object obj, long j, double d) {
        l(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    public final void e(java.lang.Object obj, long j, float f) {
        k(obj, j, java.lang.Float.floatToIntBits(f));
    }

    public final boolean f(java.lang.Object obj, long j) {
        return eit.a ? eit.t(obj, j) : eit.u(obj, j);
    }

    public final void g() {
    }
}
