package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mah implements abya {
    public final defpackage.mac a;
    public final defpackage.maf b;

    public mah(defpackage.mac macVar, defpackage.maf mafVar) {
        this.a = macVar;
        this.b = mafVar;
    }

    public final int a() {
        return 2131624047;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mah) {
            defpackage.mah mahVar = (defpackage.mah) obj;
            if (aooh.n(this.a, mahVar.a) && aooh.n(this.b, mahVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallDetailsFeatureIntegrationDataWithLayout(data=" + this.a + ", callDetailsRawData=" + this.b + ')';
    }
}
