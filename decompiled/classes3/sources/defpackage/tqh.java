package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqh implements defpackage.tqp {
    public final defpackage.tqk a;

    public tqh(defpackage.tqk tqkVar) {
        this.a = tqkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tqh) && aooh.n(this.a, ((defpackage.tqh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NotMet(result=" + this.a + ')';
    }
}
