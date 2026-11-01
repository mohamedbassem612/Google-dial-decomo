package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dhw {
    public final java.lang.String a;
    public final aomy b;

    public dhw(java.lang.String str, aomy aomyVar) {
        this.a = str;
        this.b = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dhw) {
            defpackage.dhw dhwVar = (defpackage.dhw) obj;
            if (aooh.n(this.a, dhwVar.a) && this.b == dhwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
