package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jma implements ahth {
    public final java.lang.String a;

    public jma(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jma) && aooh.n(this.a, ((defpackage.jma) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.lang.String toString() {
        return "ScamSuggestionEvent(suggestion=" + this.a + ')';
    }

    public jma() {
        this(null);
    }
}
