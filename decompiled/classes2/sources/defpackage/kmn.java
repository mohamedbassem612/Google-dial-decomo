package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kmn implements defpackage.kmw {
    public final defpackage.kdc a;

    public kmn(defpackage.kdc kdcVar) {
        aooh.f(kdcVar, "callLogUiModel");
        this.a = kdcVar;
    }

    @Override // defpackage.kmw
    public final int a() {
        return 3;
    }

    @Override // defpackage.kmw
    public final long b() {
        return this.a.a.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kmn) && aooh.n(this.a, ((defpackage.kmn) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ConversationHistoryFlippableData(callLogUiModel=" + this.a + ')';
    }
}
