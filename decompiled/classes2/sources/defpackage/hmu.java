package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmu {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;

    public hmu(int i, java.lang.String str, java.lang.String str2) {
        aooh.f(str, "label");
        aooh.f(str2, "phoneNumber");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hmu) {
            defpackage.hmu hmuVar = (defpackage.hmu) obj;
            if (this.a == hmuVar.a && aooh.n(this.b, hmuVar.b) && aooh.n(this.c, hmuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneInfo(type=" + this.a + ", label=" + this.b + ", phoneNumber=" + this.c + ')';
    }
}
