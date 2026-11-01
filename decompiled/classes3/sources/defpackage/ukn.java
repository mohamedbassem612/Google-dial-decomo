package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukn implements defpackage.uks {
    public final java.lang.String a;

    public ukn(java.lang.String str) {
        aooh.f(str, "rawNumber");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ukn) && aooh.n(this.a, ((defpackage.ukn) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AddToContacts(rawNumber=" + this.a + ')';
    }
}
