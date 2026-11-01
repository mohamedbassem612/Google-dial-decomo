package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwy {
    public final java.lang.String a;
    public final int b;
    public final int c;

    public gwy(java.lang.String str, int i, int i2) {
        if (str == null) {
            defpackage.aooh.i("workSpecId");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gwy) {
            defpackage.gwy gwyVar = (defpackage.gwy) obj;
            if (defpackage.aooh.n(this.a, gwyVar.a) && this.b == gwyVar.b && this.c == gwyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
