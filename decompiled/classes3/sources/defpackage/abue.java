package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abue implements defpackage.abuo {
    public final java.util.List a;

    public abue(java.util.List list) {
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abue) && aooh.n(this.a, ((defpackage.abue) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallingCardGetSuccessResponse(callingCardGetResponseList=" + this.a + ')';
    }
}
