package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mls {
    public final defpackage.mlt a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final mlr g;
    private final mlr h;

    public mls(defpackage.mlt mltVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, mlr mlrVar) {
        aooh.f(str, "toastMessage");
        aooh.f(str3, "dialogMessage");
        this.a = mltVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = mlrVar;
        this.h = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mls) {
            defpackage.mls mlsVar = (defpackage.mls) obj;
            if (this.a == mlsVar.a && aooh.n(this.b, mlsVar.b) && aooh.n(this.c, mlsVar.c) && aooh.n(this.d, mlsVar.d) && aooh.n(this.e, mlsVar.e) && aooh.n(this.f, mlsVar.f) && aooh.n(this.g, mlsVar.g)) {
                mlr mlrVar = mlsVar.h;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31;
        java.lang.String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        mlr mlrVar = this.g;
        return (iHashCode4 + (mlrVar != null ? mlrVar.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return "DisconnectPromptModel(promptType=" + this.a + ", toastMessage=" + this.b + ", dialogTitle=" + this.c + ", dialogMessage=" + this.d + ", dialogPositiveButton=" + this.e + ", dialogNegativeButton=" + this.f + ", dialogPositiveClickListener=" + this.g + ", dialogNegativeClickListener=null)";
    }
}
