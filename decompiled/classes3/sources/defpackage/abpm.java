package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpm {
    public final java.lang.CharSequence a;
    public final int b;

    public abpm(java.lang.CharSequence charSequence, int i) {
        aooh.f(charSequence, "text");
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abpm) {
            defpackage.abpm abpmVar = (defpackage.abpm) obj;
            if (aooh.n(this.a, abpmVar.a) && this.b == abpmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Entry(text=");
        sb.append((java.lang.Object) this.a);
        sb.append(", flag=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "NEW_LINE" : "PREPEND_SPACE";
        } else {
            str = "NONE";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
