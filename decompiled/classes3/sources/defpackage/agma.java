package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agma {
    public final int a;
    public final int b;
    public final int c;

    static {
        new java.util.LinkedHashMap();
        new java.util.LinkedHashMap();
    }

    public agma(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agma) {
            defpackage.agma agmaVar = (defpackage.agma) obj;
            if (this.a == agmaVar.a && this.b == agmaVar.b && this.c == agmaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "EnergyColors(mid=" + this.a + ", end=" + this.b + ", neural=" + this.c + ')';
    }
}
