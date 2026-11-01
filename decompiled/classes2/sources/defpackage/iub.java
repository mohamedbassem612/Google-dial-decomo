package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iub {
    public final defpackage.iua a;

    public iub(defpackage.iua iuaVar) {
        aooh.f(iuaVar, "errorType");
        this.a = iuaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.iub) && this.a == ((defpackage.iub) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslyCallActionsErrorEntity(errorType=" + this.a + ')';
    }
}
