package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class you {
    public final java.lang.String a;
    public final float b;

    public you(java.lang.String str, float f) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.you) {
            defpackage.you youVar = (defpackage.you) obj;
            if (this.a.equals(youVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(youVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "Summary{text=" + this.a + ", score=" + this.b + '}';
    }

    public you() {
        throw null;
    }
}
