package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dhr {
    public final java.lang.String a;
    public final defpackage.aoio b;

    public dhr(java.lang.String str, defpackage.aoio aoioVar) {
        this.a = str;
        this.b = aoioVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dhr) {
            defpackage.dhr dhrVar = (defpackage.dhr) obj;
            if (defpackage.aooh.n(this.a, dhrVar.a) && defpackage.aooh.n(this.b, dhrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        defpackage.aoio aoioVar = this.b;
        return (iHashCode * 31) + (aoioVar != null ? aoioVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
