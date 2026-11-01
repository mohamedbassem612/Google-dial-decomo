package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytp implements defpackage.ytr {
    public final defpackage.ytn a;

    public ytp(defpackage.ytn ytnVar) {
        this.a = ytnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ytp) && this.a == ((defpackage.ytp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(failureReason=" + this.a + ')';
    }
}
