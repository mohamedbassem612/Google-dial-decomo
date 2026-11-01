package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mfu {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public mfu(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mfu) {
            defpackage.mfu mfuVar = (defpackage.mfu) obj;
            if (this.a == mfuVar.a && this.b == mfuVar.b && this.c == mfuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.L(this.a) * 31) + anty.L(this.b)) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "DumpRequest(immediate=" + this.a + ", pii=" + this.b + ", piiNodesOnly=" + this.c + ')';
    }

    public mfu() {
        this(false, false, false);
    }
}
