package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyn {
    public final java.lang.String a;
    public final int b;

    public yyn(java.lang.String str, int i) {
        aooh.f(str, "sentence");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yyn) {
            defpackage.yyn yynVar = (defpackage.yyn) obj;
            if (aooh.n(this.a, yynVar.a) && this.b == yynVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "TranscriptSentenceWithWordCount(sentence=" + this.a + ", wordCount=" + this.b + ')';
    }
}
