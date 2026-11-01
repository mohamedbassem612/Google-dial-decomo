package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpk {
    public final ajcq a;
    public final int b;
    public final java.lang.String c;
    public final int d;

    public alpk(ajcq ajcqVar, int i, java.lang.String str, int i2) {
        this.a = ajcqVar;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alpk) {
            defpackage.alpk alpkVar = (defpackage.alpk) obj;
            if (this.a.equals(alpkVar.a) && this.b == alpkVar.b && this.c.equals(alpkVar.c) && this.d == alpkVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final java.lang.String toString() {
        return "DuplexAiCoreInferenceRequestData{inferenceFuture=" + java.lang.String.valueOf(this.a) + ", aiCoreFeatureId=" + this.b + ", aiCoreFeatureName=" + this.c + ", version=" + this.d + '}';
    }

    public alpk() {
        throw null;
    }
}
