package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoj {
    public final java.lang.String a;
    private final float b;
    private final int c;

    public yoj(java.lang.String str, float f, int i) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        this.b = f;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yoj) {
            defpackage.yoj yojVar = (defpackage.yoj) obj;
            if (this.a.equals(yojVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(yojVar.b) && this.c == yojVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        return "SmartReplySuggestion{text=" + this.a + ", score=" + this.b + ", safetyClassificationResult=" + this.c + '}';
    }

    public yoj() {
        throw null;
    }
}
