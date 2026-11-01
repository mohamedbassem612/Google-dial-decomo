package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kmp {
    public final int a;
    public final boolean b;
    public final kgc c;

    public kmp(int i, boolean z, kgc kgcVar) {
        aooh.f(kgcVar, "key");
        this.a = i;
        this.b = z;
        this.c = kgcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kmp) {
            defpackage.kmp kmpVar = (defpackage.kmp) obj;
            if (this.a == kmpVar.a && this.b == kmpVar.b && this.c == kmpVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SingleFilter(labelResId=" + this.a + ", selected=" + this.b + ", key=" + this.c + ')';
    }
}
