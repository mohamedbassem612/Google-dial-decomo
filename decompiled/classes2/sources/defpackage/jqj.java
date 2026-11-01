package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqj {
    public final defpackage.jqo a;

    public jqj(defpackage.jqo jqoVar) {
        this.a = jqoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jqj) && this.a == ((defpackage.jqj) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "PAssertedIdentity(stirShakenVerstatStatus=" + this.a + ')';
    }

    public jqj() {
        this((byte[]) null);
    }

    public /* synthetic */ jqj(byte[] bArr) {
        this(defpackage.jqo.f);
    }
}
