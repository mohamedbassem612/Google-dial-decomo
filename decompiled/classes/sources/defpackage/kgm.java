package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgm {
    public final int a;
    public final boolean b;
    public final defpackage.aomy c;

    public kgm(int i, boolean z, defpackage.aomy aomyVar) {
        if (aomyVar == null) {
            defpackage.aooh.i("clickListener");
        }
        this.a = i;
        this.b = z;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kgm) {
            defpackage.kgm kgmVar = (defpackage.kgm) obj;
            if (this.a == kgmVar.a && this.b == kgmVar.b && defpackage.aooh.n(this.c, kgmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + defpackage.anty.L(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogFilterUiData(stringResourceId=" + this.a + ", selected=" + this.b + ", clickListener=" + this.c + ')';
    }
}
