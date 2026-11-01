package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dol implements defpackage.doy {
    public final defpackage.crb a;
    public final float b;

    public dol(defpackage.crb crbVar, float f) {
        this.a = crbVar;
        this.b = f;
    }

    @Override // defpackage.doy
    public final float a() {
        return this.b;
    }

    @Override // defpackage.doy
    public final long b() {
        return defpackage.cfd.S();
    }

    @Override // defpackage.doy
    public final defpackage.cqd c() {
        return this.a;
    }

    @Override // defpackage.doy
    public final /* synthetic */ defpackage.doy d(defpackage.doy doyVar) {
        return defpackage.dpe.n(this, doyVar);
    }

    @Override // defpackage.doy
    public final /* synthetic */ defpackage.doy e(defpackage.aomy aomyVar) {
        return defpackage.dpe.o(this, aomyVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dol) {
            defpackage.dol dolVar = (defpackage.dol) obj;
            if (defpackage.aooh.n(this.a, dolVar.a) && java.lang.Float.compare(this.b, dolVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ')';
    }
}
