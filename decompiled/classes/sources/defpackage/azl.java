package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azl extends defpackage.dca {
    private final float a;
    private final float b;
    private final float d;
    private final float e;
    private final boolean f;

    public azl(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.azn(this.a, this.b, this.d, this.e, this.f);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.azn aznVar = (defpackage.azn) cmvVar;
        aznVar.a = this.a;
        aznVar.b = this.b;
        aznVar.c = this.d;
        aznVar.d = this.e;
        aznVar.e = this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.azl) {
            defpackage.azl azlVar = (defpackage.azl) obj;
            if (java.lang.Float.compare(this.a, azlVar.a) == 0 && java.lang.Float.compare(this.b, azlVar.b) == 0 && java.lang.Float.compare(this.d, azlVar.d) == 0 && java.lang.Float.compare(this.e, azlVar.e) == 0 && this.f == azlVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + (true != this.f ? 1237 : 1231);
    }
}
