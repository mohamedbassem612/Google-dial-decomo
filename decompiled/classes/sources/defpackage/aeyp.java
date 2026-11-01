package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeyp {
    public final com.google.android.gms.phenotype.ExperimentTokens a;
    public final java.lang.String b;

    public aeyp(com.google.android.gms.phenotype.ExperimentTokens experimentTokens, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("configPackageName");
        }
        this.a = experimentTokens;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aeyp) {
            defpackage.aeyp aeypVar = (defpackage.aeyp) obj;
            if (defpackage.aooh.n(this.a, aeypVar.a) && defpackage.aooh.n(this.b, aeypVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ')';
    }
}
