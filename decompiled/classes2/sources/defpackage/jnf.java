package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jnf implements defpackage.jnk {
    private final java.lang.String a;

    public jnf(java.lang.String str) {
        aooh.f(str, "reason");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jnf) && aooh.n(this.a, ((defpackage.jnf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "InferenceFailed(reason=" + this.a + ')';
    }
}
