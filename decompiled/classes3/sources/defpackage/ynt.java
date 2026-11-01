package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ynt extends defpackage.ynz {
    private final double a;

    public ynt(double d) {
        this.a = d;
    }

    @Override // defpackage.yoa
    public final int b() {
        return 4;
    }

    @Override // defpackage.ynz, defpackage.yoa
    public final double c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.yoa)) {
            return false;
        }
        defpackage.yoa yoaVar = (defpackage.yoa) obj;
        return yoaVar.b() == 4 && java.lang.Double.doubleToLongBits(this.a) == java.lang.Double.doubleToLongBits(yoaVar.c());
    }

    public final int hashCode() {
        double d = this.a;
        return (int) ((java.lang.Double.doubleToLongBits(d) >>> 32) ^ java.lang.Double.doubleToLongBits(d));
    }

    public final java.lang.String toString() {
        return "FunctionArgsValue{doubleValue=" + this.a + '}';
    }
}
