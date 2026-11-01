package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ywq implements defpackage.ywr {
    public final int a = 1;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ywq)) {
            return false;
        }
        int i = ((defpackage.ywq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "Pending(reason=PENDING_CALLER_INFO_API_LOOKUP)";
    }
}
