package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aid extends defpackage.dca {
    private final float a;
    private final java.lang.Object b;

    public aid(float f, java.lang.Object obj) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.aie(this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        ((defpackage.aie) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aid) {
            defpackage.aid aidVar = (defpackage.aid) obj;
            if (aidVar.a == this.a && defpackage.aooh.n(aidVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.a) * 31;
        java.lang.Object obj = this.b;
        return iFloatToIntBits + (obj != null ? obj.hashCode() : 0);
    }
}
