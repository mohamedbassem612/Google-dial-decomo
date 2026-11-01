package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krm implements defpackage.krp {
    public final java.util.List a;

    public krm(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.krm) && aooh.n(this.a, ((defpackage.krm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallActions(callActionsUiModels=" + this.a + ')';
    }
}
