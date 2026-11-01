package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eiq extends defpackage.eis {
    @Override // defpackage.eis
    public final double a(java.lang.Object obj, long j) {
        return java.lang.Double.longBitsToDouble(j(obj, j));
    }

    @Override // defpackage.eis
    public final float b(java.lang.Object obj, long j) {
        return java.lang.Float.intBitsToFloat(i(obj, j));
    }

    @Override // defpackage.eis
    public final void c(java.lang.Object obj, long j, boolean z) {
        if (defpackage.eit.a) {
            defpackage.eit.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            defpackage.eit.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.eis
    public final void d(java.lang.Object obj, long j, double d) {
        l(obj, j, java.lang.Double.doubleToLongBits(d));
    }

    @Override // defpackage.eis
    public final void e(java.lang.Object obj, long j, float f) {
        k(obj, j, java.lang.Float.floatToIntBits(f));
    }

    @Override // defpackage.eis
    public final boolean f(java.lang.Object obj, long j) {
        return defpackage.eit.a ? defpackage.eit.t(obj, j) : defpackage.eit.u(obj, j);
    }

    @Override // defpackage.eis
    public final void g() {
    }
}
