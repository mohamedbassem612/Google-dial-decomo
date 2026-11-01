package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bnn extends dca {
    private final float a;

    public bnn(float f) {
        this.a = f;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bnr(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.bnr) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.bnn bnnVar = obj instanceof defpackage.bnn ? (defpackage.bnn) obj : null;
        return bnnVar != null && this.a == bnnVar.a;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public bnn() {
        this(0.0f);
    }
}
