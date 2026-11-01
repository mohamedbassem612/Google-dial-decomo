package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktf {
    public final defpackage.abja a;
    public final java.lang.String b;
    public final aomy c;

    public ktf(defpackage.abja abjaVar, java.lang.String str, aomy aomyVar) {
        aooh.f(str, "text");
        this.a = abjaVar;
        this.b = str;
        this.c = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ktf) {
            defpackage.ktf ktfVar = (defpackage.ktf) obj;
            if (this.a == ktfVar.a && aooh.n(this.b, ktfVar.b) && aooh.n(this.c, ktfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallOptionsSecondaryActionListItemUiData(icon=" + this.a + ", text=" + this.b + ", onClick=" + this.c + ')';
    }
}
