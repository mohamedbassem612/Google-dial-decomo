package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njy implements defpackage.nke {
    public final defpackage.mzd a;

    public njy(defpackage.mzd mzdVar) {
        aooh.f(mzdVar, "newState");
        this.a = mzdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.njy) && aooh.n(this.a, ((defpackage.njy) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ConversationStateUpdateEvent(newState=" + this.a + ')';
    }
}
