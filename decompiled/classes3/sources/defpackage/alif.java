package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alif implements java.lang.Comparable {
    public final int a;
    public final int b;
    public final float c;

    public alif(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Float.compare(((defpackage.alif) obj).c, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alif) {
            defpackage.alif alifVar = (defpackage.alif) obj;
            if (this.a == alifVar.a && this.b == alifVar.b) {
                if (java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(alifVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "Pos{start=" + this.a + ", end=" + this.b + ", confidence=" + this.c + '}';
    }

    public alif() {
        throw null;
    }
}
