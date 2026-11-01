package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ruo {
    public final java.lang.String a;
    public final defpackage.ruh b;

    public ruo(java.lang.String str, defpackage.ruh ruhVar) {
        this.a = str;
        this.b = ruhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ruo) {
            defpackage.ruo ruoVar = (defpackage.ruo) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(ruoVar.a) : ruoVar.a == null) {
                if (this.b.equals(ruoVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MmiCodeAndResultPair{code=" + this.a + ", result=" + this.b.toString() + '}';
    }

    public ruo() {
        throw null;
    }
}
