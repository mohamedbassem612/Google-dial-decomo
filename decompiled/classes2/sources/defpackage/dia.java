package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dia {
    public static final defpackage.dia a = new defpackage.dia(0.0f, new aopm(0.0f, 0.0f));
    public final float b;
    public final aopm c;
    private final int d = 0;

    public dia(float f, aopm aopmVar) {
        this.b = f;
        this.c = aopmVar;
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dia) {
            defpackage.dia diaVar = (defpackage.dia) obj;
            if (this.b == diaVar.b && aooh.n(this.c, diaVar.c)) {
                int i = diaVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.b) * 31) + this.c.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}
