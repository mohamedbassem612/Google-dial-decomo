package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oes {
    public final java.lang.String a;

    public oes(java.lang.String str) {
        defpackage.aooh.f(str, "phoneNumber");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.oes) && defpackage.aooh.n(this.a, ((defpackage.oes) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ExpressoHandshakeDbEntity(phoneNumber=" + this.a + ')';
    }
}
