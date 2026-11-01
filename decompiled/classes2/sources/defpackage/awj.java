package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class awj extends dca {
    private final float a;
    private final boolean b;

    public awj(float f, boolean z) {
        this.a = f;
        this.b = z;
        if (f <= 0.0f) {
            defpackage.bai.a("aspectRatio " + f + " must be > 0");
        }
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.awk(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.awk awkVar = (defpackage.awk) cmvVar;
        awkVar.a = this.a;
        awkVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.awj awjVar = obj instanceof defpackage.awj ? (defpackage.awj) obj : null;
        return awjVar != null && this.a == awjVar.a && this.b == ((defpackage.awj) obj).b;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }
}
