package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqn implements defpackage.tqo {
    public final defpackage.ywy a;

    public tqn(defpackage.ywy ywyVar) {
        this.a = ywyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tqn) && aooh.n(this.a, ((defpackage.tqn) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "PendingDevicePreconditionResult(devicePreconditionPending=" + this.a + ')';
    }
}
