package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbt implements defpackage.kbu {
    public final java.lang.Long a;

    public kbt(java.lang.Long l) {
        this.a = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kbt) && aooh.n(this.a, ((defpackage.kbt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final java.lang.String toString() {
        return "RowLongClick(callId=" + this.a + ')';
    }
}
