package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class avt extends dca {
    private final cwk a;
    private final float b;
    private final float d;

    public avt(cwk cwkVar, float f, float f2) {
        this.a = cwkVar;
        this.b = f;
        this.d = f2;
        if (!(f >= 0.0f || java.lang.Float.isNaN(f)) || !(f2 >= 0.0f || java.lang.Float.isNaN(f2))) {
            defpackage.bai.a("Padding from alignment line must be a non-negative number");
        }
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.avu(this.a, this.b, this.d);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.avu avuVar = (defpackage.avu) cmvVar;
        avuVar.a = this.a;
        avuVar.b = this.b;
        avuVar.c = this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.avt avtVar = obj instanceof defpackage.avt ? (defpackage.avt) obj : null;
        return avtVar != null && aooh.n(this.a, avtVar.a) && java.lang.Float.compare(this.b, avtVar.b) == 0 && java.lang.Float.compare(this.d, avtVar.d) == 0;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }
}
