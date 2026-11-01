package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icv {
    public final boolean a;
    private final boolean b = false;
    private final boolean c = false;

    public icv(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.icv) {
            defpackage.icv icvVar = (defpackage.icv) obj;
            if (this.a == icvVar.a) {
                boolean z = icvVar.b;
                boolean z2 = icvVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.L(this.a) * 31) + anty.L(false)) * 31) + anty.L(false);
    }

    public final java.lang.String toString() {
        return "StreamState(recordDownlink=" + this.a + ", recordUplink=false, recordPlayback=false)";
    }
}
