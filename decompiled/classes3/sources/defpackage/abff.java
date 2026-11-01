package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abff implements defpackage.abfo {
    public final float a = 0.16f;
    public final int b;
    public final int c;

    public abff(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abff) {
            defpackage.abff abffVar = (defpackage.abff) obj;
            float f = abffVar.a;
            if (this.b == abffVar.b && this.c == abffVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((-2041116106) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "ContentColorWithAlpha(colorAlpha=0.16, start=" + this.b + ", end=" + this.c + ')';
    }
}
