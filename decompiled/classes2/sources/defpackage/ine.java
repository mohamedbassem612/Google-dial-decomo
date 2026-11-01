package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ine implements defpackage.ing {
    public final java.lang.Long a;

    public ine(java.lang.Long l) {
        this.a = l;
    }

    @Override // defpackage.ing
    public final boolean a(java.lang.Long l) {
        if (l != null) {
            java.lang.Long l2 = this.a;
            if ((l2 != null ? l2.longValue() : Long.MIN_VALUE) >= l.longValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ine) && aooh.n(this.a, ((defpackage.ine) obj).a);
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
        return "Started(startTimeUsec=" + this.a + ')';
    }
}
