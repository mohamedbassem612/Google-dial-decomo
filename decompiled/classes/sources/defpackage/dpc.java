package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpc {
    public static final defpackage.dpc a = new defpackage.dpc(2, false);
    private static final defpackage.dpc d = new defpackage.dpc(1, true);
    public final int b;
    public final boolean c;

    public dpc(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dpc) {
            defpackage.dpc dpcVar = (defpackage.dpc) obj;
            if (this.b == dpcVar.b && this.c == dpcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        if (defpackage.aooh.n(this, a)) {
            return "TextMotion.Static";
        }
        return defpackage.aooh.n(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}
