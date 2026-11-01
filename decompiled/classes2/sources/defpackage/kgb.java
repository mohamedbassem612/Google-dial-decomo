package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kgb {
    public final kgc a;
    public final boolean b;
    public final int c;

    public kgb(kgc kgcVar, boolean z, int i) {
        aooh.f(kgcVar, "key");
        this.a = kgcVar;
        this.b = z;
        this.c = i;
    }

    public static /* synthetic */ defpackage.kgb a(defpackage.kgb kgbVar, boolean z) {
        kgc kgcVar = kgbVar.a;
        int i = kgbVar.c;
        aooh.f(kgcVar, "key");
        return new defpackage.kgb(kgcVar, z, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kgb) {
            defpackage.kgb kgbVar = (defpackage.kgb) obj;
            if (this.a == kgbVar.a && this.b == kgbVar.b && this.c == kgbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.L(this.b)) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "FilterState(key=" + this.a + ", selected=" + this.b + ", labelResId=" + this.c + ')';
    }
}
