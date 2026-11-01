package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqj implements defpackage.tqk {
    public final defpackage.yww a;

    public tqj(defpackage.yww ywwVar) {
        this.a = ywwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tqj) && aooh.n(this.a, ((defpackage.tqj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NotMetDevicePreconditionResult(devicePreconditionNotMet=" + this.a + ')';
    }
}
