package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rke {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;
    public final java.util.List c;

    public rke(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.util.List list) {
        aooh.f(charSequence, "descriptionText");
        aooh.f(charSequence2, "backupFooterText");
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rke) {
            defpackage.rke rkeVar = (defpackage.rke) obj;
            if (aooh.n(this.a, rkeVar.a) && aooh.n(this.b, rkeVar.b) && aooh.n(this.c, rkeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "JoyballUiModel(descriptionText=" + ((java.lang.Object) this.a) + ", backupFooterText=" + ((java.lang.Object) this.b) + ", whatIsIncludedContent=" + this.c + ')';
    }
}
