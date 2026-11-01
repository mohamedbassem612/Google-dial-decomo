package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykt implements defpackage.ykv {
    public final boolean a;

    public ykt(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ykt) && this.a == ((defpackage.ykt) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.L(this.a);
    }

    public final java.lang.String toString() {
        return "Denied(shouldShowRationale=" + this.a + ')';
    }
}
