package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abmm {
    public final int a;
    public final int b;
    public final int c;

    public abmm(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abmm) {
            defpackage.abmm abmmVar = (defpackage.abmm) obj;
            if (this.a == abmmVar.a && this.b == abmmVar.b && this.c == abmmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "AbcShaderColors(panelColor=" + this.a + ", innerColor=" + this.b + ", outerColor=" + this.c + ')';
    }
}
