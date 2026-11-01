package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxd {
    public final java.lang.String a;
    public final int b;

    public gxd(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("workSpecId");
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gxd) {
            defpackage.gxd gxdVar = (defpackage.gxd) obj;
            if (defpackage.aooh.n(this.a, gxdVar.a) && this.b == gxdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
