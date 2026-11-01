package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kmm implements defpackage.kmw {
    public final defpackage.kdc a;

    public kmm(defpackage.kdc kdcVar) {
        aooh.f(kdcVar, "callLogUiModel");
        this.a = kdcVar;
    }

    @Override // defpackage.kmw
    public final int a() {
        return 2;
    }

    @Override // defpackage.kmw
    public final long b() {
        return this.a.a.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kmm) && aooh.n(this.a, ((defpackage.kmm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ConversationHistoryData(callLogUiModel=" + this.a + ')';
    }
}
