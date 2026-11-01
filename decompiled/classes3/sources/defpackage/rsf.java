package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rsf extends pez {
    public final java.lang.String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsf(java.lang.String str) {
        super((short[]) null);
        aooh.f(str, "text");
        this.a = str;
        if (aoov.H(str)) {
            throw new java.lang.IllegalArgumentException("text should never be empty or blank");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.rsf) && aooh.n(this.a, ((defpackage.rsf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TextString(text=" + this.a + ')';
    }
}
