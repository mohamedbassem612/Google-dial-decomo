package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcf extends dca {
    private final int a;
    private final int b;

    public hcf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.hcg(this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.hcg hcgVar = (defpackage.hcg) cmvVar;
        aooh.f(hcgVar, "node");
        hcgVar.a = this.a;
        hcgVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hcf) {
            defpackage.hcf hcfVar = (defpackage.hcf) obj;
            if (this.a == hcfVar.a && this.b == hcfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "LottieAnimationSizeElement(width=" + this.a + ", height=" + this.b + ')';
    }
}
