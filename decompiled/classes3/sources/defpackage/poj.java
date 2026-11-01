package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class poj {
    public final java.lang.CharSequence a;
    public final defpackage.pmp b;
    public final defpackage.pok c;

    public poj(java.lang.CharSequence charSequence, defpackage.pmp pmpVar, defpackage.pok pokVar) {
        this.a = charSequence;
        this.b = pmpVar;
        this.c = pokVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.poj) {
            defpackage.poj pojVar = (defpackage.poj) obj;
            if (aooh.n(this.a, pojVar.a) && aooh.n(this.b, pojVar.b) && aooh.n(this.c, pojVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.CharSequence charSequence = this.a;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        defpackage.pmp pmpVar = this.b;
        int iHashCode2 = pmpVar == null ? 0 : pmpVar.hashCode();
        int i = iHashCode * 31;
        defpackage.pok pokVar = this.c;
        return ((i + iHashCode2) * 31) + (pokVar != null ? pokVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MiddleRow(label=" + ((java.lang.Object) this.a) + ", contactGridDisplayNameUiData=" + this.b + ", iconData=" + this.c + ')';
    }

    public poj() {
        this(null, null, null);
    }
}
