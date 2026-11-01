package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dos {
    public static final defpackage.dos a;
    public final float b;
    public final int c;
    public final int d;

    static {
        defpackage.dop.b(-1.0f);
        a = new defpackage.dos(-1.0f, 17, 0);
    }

    public dos(float f, int i, int i2) {
        this.b = f;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dos) {
            defpackage.dos dosVar = (defpackage.dos) obj;
            if (java.lang.Float.compare(this.b, dosVar.b) == 0 && this.c == dosVar.c && this.d == dosVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.b) * 31) + this.c) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "LineHeightStyle(alignment=" + defpackage.dop.a(this.b) + ", trim=" + defpackage.dor.a(this.c) + ",mode=" + defpackage.doq.a(this.d) + ')';
    }
}
