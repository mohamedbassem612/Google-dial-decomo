package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class djg {
    public final java.lang.Object a;
    public final int b;
    public final int c;
    public final java.lang.String d;

    public djg(java.lang.Object obj, int i, int i2, java.lang.String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i > i2) {
            dnv.b("Reversed range is not supported");
        }
    }

    public static /* synthetic */ defpackage.djg a(defpackage.djg djgVar, java.lang.Object obj, int i, int i2) {
        if ((i2 & 1) != 0) {
            obj = djgVar.a;
        }
        int i3 = (i2 & 2) != 0 ? djgVar.b : 0;
        if ((i2 & 4) != 0) {
            i = djgVar.c;
        }
        return new defpackage.djg(obj, i3, i, djgVar.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.djg) {
            defpackage.djg djgVar = (defpackage.djg) obj;
            if (defpackage.aooh.n(this.a, djgVar.a) && this.b == djgVar.b && this.c == djgVar.c && defpackage.aooh.n(this.d, djgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }
}
