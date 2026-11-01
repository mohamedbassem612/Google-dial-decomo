package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxp implements defpackage.lxr {
    public final int a;

    public lxp(int i) {
        this.a = i;
    }

    @Override // defpackage.lxr
    public final long a() {
        return -this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.lxp) && this.a == ((defpackage.lxp) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "HeaderRow(title=" + this.a + ')';
    }
}
