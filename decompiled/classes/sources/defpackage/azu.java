package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azu extends defpackage.dca {
    private final float a;
    private final float b;

    public azu(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.azv(this.a, this.b);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.azv azvVar = (defpackage.azv) cmvVar;
        azvVar.a = this.a;
        azvVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.azu)) {
            return false;
        }
        defpackage.azu azuVar = (defpackage.azu) obj;
        return java.lang.Float.compare(this.a, azuVar.a) == 0 && java.lang.Float.compare(this.b, azuVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public azu() {
        this(Float.NaN, Float.NaN);
    }
}
