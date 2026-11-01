package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rik {
    public final java.lang.CharSequence a;
    public final java.lang.CharSequence b;

    public rik(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        aooh.f(charSequence, "title");
        aooh.f(charSequence2, "message");
        this.a = charSequence;
        this.b = charSequence2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rik) {
            defpackage.rik rikVar = (defpackage.rik) obj;
            if (aooh.n(this.a, rikVar.a) && aooh.n(this.b, rikVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "JoyballDialogModel(title=" + ((java.lang.Object) this.a) + ", message=" + ((java.lang.Object) this.b) + ')';
    }
}
