package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agi {
    public final float a;
    public final float b;
    public final long c;

    public agi(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agi) {
            defpackage.agi agiVar = (defpackage.agi) obj;
            if (java.lang.Float.compare(this.a, agiVar.a) == 0 && java.lang.Float.compare(this.b, agiVar.b) == 0 && this.c == agiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
        long j = this.c;
        return (iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
