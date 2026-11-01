package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apzp extends defpackage.apzr {
    @Override // defpackage.apzr
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(h(obj, j));
    }

    @Override // defpackage.apzr
    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(g(obj, j));
    }

    @Override // defpackage.apzr
    public final void c(java.lang.Object obj, long j, boolean z) {
        if (defpackage.apzs.a) {
            defpackage.apzs.i(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            defpackage.apzs.j(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.apzr
    public final void d(java.lang.Object obj, long j, double d) {
        j(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // defpackage.apzr
    public final void e(java.lang.Object obj, long j, float f) {
        i(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // defpackage.apzr
    public final boolean f(java.lang.Object obj, long j) {
        return defpackage.apzs.a ? defpackage.apzs.r(obj, j) : defpackage.apzs.s(obj, j);
    }
}
