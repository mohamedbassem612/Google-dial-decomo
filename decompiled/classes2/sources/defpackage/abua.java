package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abua implements abuo {
    public final java.util.List a;

    public abua(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abua) && aooh.n(this.a, ((defpackage.abua) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallingCardDeleteSuccessResponse(callingCardDeleteResponseList=" + this.a + ')';
    }
}
