package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lpu {
    public final int a;
    public final java.lang.String b;
    public final aomy c;
    public final boolean d;

    public lpu(int i, java.lang.String str, aomy aomyVar, boolean z) {
        aooh.f(str, "text");
        aooh.f(aomyVar, "onClick");
        this.a = i;
        this.b = str;
        this.c = aomyVar;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lpu) {
            defpackage.lpu lpuVar = (defpackage.lpu) obj;
            if (this.a == lpuVar.a && aooh.n(this.b, lpuVar.b) && aooh.n(this.c, lpuVar.c) && this.d == lpuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "SelectableListItemUiData(iconId=" + this.a + ", text=" + this.b + ", onClick=" + this.c + ", selected=" + this.d + ')';
    }
}
