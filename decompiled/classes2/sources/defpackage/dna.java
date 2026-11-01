package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dna implements dmy {
    private final java.lang.String a;
    private final int b;

    public dna(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dna) {
            defpackage.dna dnaVar = (defpackage.dna) obj;
            if (aooh.n(this.a, dnaVar.a) && this.b == dnaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }

    public final void b() {
    }
}
