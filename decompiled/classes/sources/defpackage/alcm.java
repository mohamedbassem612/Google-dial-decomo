package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class alcm extends defpackage.alcn {
    @Override // defpackage.alcn
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.alcn
    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.alcn
    public final void c(java.lang.Object obj, long j, boolean z) {
        if (defpackage.alco.b) {
            defpackage.alco.j(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            defpackage.alco.k(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.alcn
    public final void d(java.lang.Object obj, long j, double d) {
        k(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // defpackage.alcn
    public final void e(java.lang.Object obj, long j, float f) {
        j(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // defpackage.alcn
    public final boolean f(java.lang.Object obj, long j) {
        if (defpackage.alco.b) {
            return defpackage.alco.p(obj, j);
        }
        return defpackage.alco.a(obj, j) != 0;
    }
}
