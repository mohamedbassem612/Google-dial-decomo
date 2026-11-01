package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jqi {
    public final defpackage.jqo a;

    public jqi(defpackage.jqo jqoVar) {
        this.a = jqoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jqi) && this.a == ((defpackage.jqi) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FromHeader(stirShakenVerstatStatus=" + this.a + ')';
    }

    public jqi() {
        this((byte[]) null);
    }

    public /* synthetic */ jqi(byte[] bArr) {
        this(defpackage.jqo.f);
    }
}
