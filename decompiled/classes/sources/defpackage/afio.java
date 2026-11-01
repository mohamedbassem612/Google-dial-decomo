package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afio {
    public final java.lang.String a;
    public final java.lang.Class b;

    public afio(java.lang.String str, java.lang.Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afio) {
            defpackage.afio afioVar = (defpackage.afio) obj;
            if (this.b == afioVar.b && this.a.equals(afioVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.format("(%s, %s)", this.a, this.b);
    }
}
