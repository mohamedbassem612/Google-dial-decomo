package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krl {
    public final int a;
    public final java.lang.String b;
    public final aonn c;
    public final int d;
    private final java.lang.String e;

    public krl(int i, int i2, java.lang.String str, java.lang.String str2, aonn aonnVar) {
        aooh.f(str, "actionText");
        aooh.f(str2, "descriptionText");
        this.d = i;
        this.a = i2;
        this.b = str;
        this.e = str2;
        this.c = aonnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.krl) {
            defpackage.krl krlVar = (defpackage.krl) obj;
            if (this.d == krlVar.d && this.a == krlVar.a && aooh.n(this.b, krlVar.b) && aooh.n(this.e, krlVar.e) && aooh.n(this.c, krlVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.d * 31) + this.a) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallActionUiModel(actionType=" + ((java.lang.Object) defpackage.hgz.J(this.d)) + ", iconRes=" + this.a + ", actionText=" + this.b + ", descriptionText=" + this.e + ", startAction=" + this.c + ')';
    }
}
