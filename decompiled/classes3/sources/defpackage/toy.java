package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class toy implements defpackage.tpb {
    private final defpackage.toz a;

    public toy(defpackage.toz tozVar) {
        this.a = tozVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.toy) && aooh.n(this.a, ((defpackage.toy) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(reason=" + this.a + ')';
    }
}
