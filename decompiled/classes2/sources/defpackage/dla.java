package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dla implements djd {
    public final java.lang.String a;

    public dla(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dla) && aooh.n(this.a, ((defpackage.dla) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.a + ')';
    }

    public dla() {
        throw null;
    }
}
