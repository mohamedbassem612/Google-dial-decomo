package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alpu {
    public final ymk a;
    public final int b;

    public alpu(ymk ymkVar, int i) {
        aooh.f(ymkVar, "aiFeature");
        this.a = ymkVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.alpu) {
            defpackage.alpu alpuVar = (defpackage.alpu) obj;
            if (aooh.n(this.a, alpuVar.a) && this.b == alpuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "AiFeatureAndStatus(aiFeature=" + this.a + ", featureStatus=" + this.b + ')';
    }
}
