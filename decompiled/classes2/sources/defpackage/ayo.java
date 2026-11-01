package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ayo extends dca {
    private final float a;
    private final float b;

    public ayo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.ayp(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.ayp aypVar = (defpackage.ayp) cmvVar;
        float f = aypVar.a;
        float f2 = this.a;
        int iCompare = java.lang.Float.compare(f, f2);
        float f3 = this.b;
        if (iCompare != 0 || java.lang.Float.compare(aypVar.b, f3) != 0 || !aypVar.c) {
            cfo.A(aypVar).V(false);
        }
        aypVar.a = f2;
        aypVar.b = f3;
        aypVar.c = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.ayo ayoVar = obj instanceof defpackage.ayo ? (defpackage.ayo) obj : null;
        return ayoVar != null && java.lang.Float.compare(this.a, ayoVar.a) == 0 && java.lang.Float.compare(this.b, ayoVar.b) == 0;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final java.lang.String toString() {
        float f = this.b;
        return "OffsetModifierElement(x=" + dpi.b(this.a) + ", y=" + dpi.b(f) + ", rtlAware=true)";
    }
}
