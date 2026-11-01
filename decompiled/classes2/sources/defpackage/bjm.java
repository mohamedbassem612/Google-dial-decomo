package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjm {
    public final dji a;
    public dji b;
    public boolean c = false;
    public bjb d = null;

    public bjm(dji djiVar, dji djiVar2) {
        this.a = djiVar;
        this.b = djiVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bjm) {
            defpackage.bjm bjmVar = (defpackage.bjm) obj;
            if (aooh.n(this.a, bjmVar.a) && aooh.n(this.b, bjmVar.b) && this.c == bjmVar.c && aooh.n(this.d, bjmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = true != this.c ? 1237 : 1231;
        bjb bjbVar = this.d;
        return (((iHashCode * 31) + i) * 31) + (bjbVar == null ? 0 : bjbVar.hashCode());
    }

    public final java.lang.String toString() {
        return "TextSubstitutionValue(original=" + this.a + ", substitution=" + this.b + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
