package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class imc extends defpackage.hgu {
    public final defpackage.igw a;
    public final int b;

    public imc(int i, defpackage.igw igwVar) {
        super(null);
        this.b = i;
        this.a = igwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.imc) {
            defpackage.imc imcVar = (defpackage.imc) obj;
            if (this.b == imcVar.b && aooh.n(this.a, imcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.igw igwVar = this.a;
        return (this.b * 31) + (igwVar == null ? 0 : igwVar.hashCode());
    }

    public final java.lang.String toString() {
        return "LanguagePackFailure(failure=" + ((java.lang.Object) java.lang.Integer.toString(this.b - 2)) + ", audioPrismSodaLpInfo=" + this.a + ')';
    }
}
