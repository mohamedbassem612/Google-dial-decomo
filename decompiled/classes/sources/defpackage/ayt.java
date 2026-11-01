package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ayt extends defpackage.dca {
    private final float a;
    private final float b;
    private final float d;
    private final float e;
    private final boolean f;

    public ayt(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        if (!((f >= 0.0f || java.lang.Float.isNaN(f)) & (f2 >= 0.0f || java.lang.Float.isNaN(f2)) & (f3 >= 0.0f || java.lang.Float.isNaN(f3))) || !(f4 >= 0.0f || java.lang.Float.isNaN(f4))) {
            bai.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.ayv(this.a, this.b, this.d, this.e, this.f);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.ayv ayvVar = (defpackage.ayv) cmvVar;
        ayvVar.a = this.a;
        ayvVar.b = this.b;
        ayvVar.c = this.d;
        ayvVar.d = this.e;
        ayvVar.e = this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.ayt aytVar = obj instanceof defpackage.ayt ? (defpackage.ayt) obj : null;
        return aytVar != null && java.lang.Float.compare(this.a, aytVar.a) == 0 && java.lang.Float.compare(this.b, aytVar.b) == 0 && java.lang.Float.compare(this.d, aytVar.d) == 0 && java.lang.Float.compare(this.e, aytVar.e) == 0 && this.f == aytVar.f;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + (true != this.f ? 1237 : 1231);
    }
}
