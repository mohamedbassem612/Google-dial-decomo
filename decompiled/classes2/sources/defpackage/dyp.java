package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dyp {
    private final java.lang.String a;
    private final int c;
    private final int d;
    private final float b = 1.0f;
    private final int e = 0;
    private final int f = 0;
    private final int g = 0;
    private final float h = 1.0f;

    public dyp(java.lang.String str, int i, int i2) {
        this.a = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dyp) {
            defpackage.dyp dypVar = (defpackage.dyp) obj;
            if (j$.util.Objects.equals(this.a, dypVar.a) && this.c == dypVar.c && this.d == dypVar.d) {
                float f = dypVar.b;
                int i = dypVar.e;
                int i2 = dypVar.f;
                int i3 = dypVar.g;
                float f2 = dypVar.h;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.c);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(this.d);
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        return j$.util.Objects.hash(new java.lang.Object[]{str, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf});
    }

    public final java.lang.String toString() {
        return "DisplayShapeCompat{ spec=" + java.lang.Integer.valueOf(this.a.hashCode()) + " displayWidth=" + this.c + " displayHeight=" + this.d + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
