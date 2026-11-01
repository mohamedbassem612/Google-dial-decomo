package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ywy implements defpackage.ywz {
    public final int a = 1;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ywy)) {
            return false;
        }
        int i = ((defpackage.ywy) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "Pending(reason=PENDING_AICORE_AVAILABILITY_CHECK)";
    }
}
