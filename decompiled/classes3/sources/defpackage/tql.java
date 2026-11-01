package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tql implements defpackage.tqp {
    public final defpackage.tqo a;

    public tql(defpackage.tqo tqoVar) {
        this.a = tqoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tql) && aooh.n(this.a, ((defpackage.tql) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Pending(result=" + this.a + ')';
    }
}
