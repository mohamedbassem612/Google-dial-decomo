package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqm implements defpackage.tqo {
    public final defpackage.ywq a;

    public tqm(defpackage.ywq ywqVar) {
        this.a = ywqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tqm) && aooh.n(this.a, ((defpackage.tqm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "PendingCallPreconditionResult(callPreconditionPending=" + this.a + ')';
    }
}
