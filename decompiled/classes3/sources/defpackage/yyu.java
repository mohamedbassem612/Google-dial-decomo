package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyu {
    public final java.lang.String a;
    public final int b;

    public yyu(java.lang.String str, int i) {
        aooh.f(str, "originalText");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yyu) {
            defpackage.yyu yyuVar = (defpackage.yyu) obj;
            if (aooh.n(this.a, yyuVar.a) && this.b == yyuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "TranscriptSentenceWithTokenCount(originalText=" + this.a + ", tokenCount=" + this.b + ')';
    }
}
