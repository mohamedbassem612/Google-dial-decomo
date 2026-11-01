package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdn {
    public final defpackage.abko a;
    public final defpackage.pdm b;
    public final boolean c;

    public pdn(defpackage.abko abkoVar, defpackage.pdm pdmVar, boolean z) {
        aooh.f(pdmVar, "avatarDisplaySize");
        this.a = abkoVar;
        this.b = pdmVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pdn) {
            defpackage.pdn pdnVar = (defpackage.pdn) obj;
            if (aooh.n(this.a, pdnVar.a) && this.b == pdnVar.b && this.c == pdnVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "AvatarUiModel(monogram2UiData=" + this.a + ", avatarDisplaySize=" + this.b + ", shouldAnimateRotation=" + this.c + ')';
    }
}
