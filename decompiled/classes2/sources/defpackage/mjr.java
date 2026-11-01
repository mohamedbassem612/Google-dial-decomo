package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mjr {
    public final java.util.List a;
    public final int b;
    public final int c;

    public mjr(java.util.List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mjr) {
            defpackage.mjr mjrVar = (defpackage.mjr) obj;
            if (aooh.n(this.a, mjrVar.a) && this.b == mjrVar.b && this.c == mjrVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "SimSelectorModel(entries=" + this.a + ", selectedSimIndex=" + this.b + ", defaultSimIndex=" + this.c + ')';
    }
}
