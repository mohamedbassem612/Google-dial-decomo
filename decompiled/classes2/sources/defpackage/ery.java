package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ery {
    public static final defpackage.ery a = new defpackage.ery(0, 0, 1.0f);
    public final int b;
    public final int c;
    public final float d;

    static {
        java.lang.String str = eum.a;
    }

    public ery(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ery) {
            defpackage.ery eryVar = (defpackage.ery) obj;
            if (this.b == eryVar.b && this.c == eryVar.c && this.d == eryVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 217) * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.d);
    }
}
