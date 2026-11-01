package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksp {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    private final boolean e = true;

    public ksp(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ksp) {
            defpackage.ksp kspVar = (defpackage.ksp) obj;
            if (aooh.n(this.a, kspVar.a) && aooh.n(this.b, kspVar.b) && aooh.n(this.c, kspVar.c) && aooh.n(this.d, kspVar.d)) {
                boolean z = kspVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1231;
    }

    public final java.lang.String toString() {
        return "BusinessData(e164PhoneNumber=" + this.a + ", brandName=" + this.b + ", iconUrl=" + this.c + ", deeplinkUrl=" + this.d + ", verified=true)";
    }
}
