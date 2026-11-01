package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lys implements ahth {
    public final java.lang.Long a;

    public lys(java.lang.Long l) {
        this.a = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.lys) && aooh.n(this.a, ((defpackage.lys) obj).a);
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
        return "DeleteAllCallLogHistoryConfirmedEvent(swipedRowId=" + this.a + ')';
    }

    public lys() {
        this(null);
    }
}
