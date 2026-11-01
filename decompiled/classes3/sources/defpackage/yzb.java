package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzb {
    public final java.lang.String a;
    public final int b;
    public final int c;
    private final float d;
    private final int e;
    private final int f;
    private final int g;

    public yzb(java.lang.String str, int i, int i2) {
        aooh.f(str, "prompt");
        this.a = str;
        this.d = 0.0f;
        this.e = 1;
        this.f = 3;
        this.g = 256;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yzb) {
            defpackage.yzb yzbVar = (defpackage.yzb) obj;
            if (aooh.n(this.a, yzbVar.a)) {
                float f = yzbVar.d;
                int i = yzbVar.e;
                int i2 = yzbVar.f;
                int i3 = yzbVar.g;
                if (this.b == yzbVar.b && this.c == yzbVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 961) + 1) * 31) + 3) * 31) + 256) * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "SharpieAiCoreRequest(prompt=" + this.a + ", temperature=0.0, topK=1, targetReplyLengthMin=3, targetReplyLengthMax=256, aiCoreFeatureId=" + this.b + ", targetModelVersion=" + this.c + ')';
    }
}
