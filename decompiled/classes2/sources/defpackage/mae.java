package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mae {
    public final java.lang.CharSequence a;
    public final int b;

    public mae(java.lang.CharSequence charSequence, int i) {
        aooh.f(charSequence, "text");
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mae) {
            defpackage.mae maeVar = (defpackage.mae) obj;
            if (aooh.n(this.a, maeVar.a) && this.b == maeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "CallDetailsFeatureText(text=" + ((java.lang.Object) this.a) + ", styleResId=" + this.b + ')';
    }
}
