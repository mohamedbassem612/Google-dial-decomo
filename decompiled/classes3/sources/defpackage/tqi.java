package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqi implements defpackage.tqk {
    public final defpackage.ywp a;

    public tqi(defpackage.ywp ywpVar) {
        this.a = ywpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tqi) && aooh.n(this.a, ((defpackage.tqi) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final java.lang.String toString() {
        return "NotMetCallPreconditionResult(callPreconditionNotMet=" + this.a + ')';
    }
}
