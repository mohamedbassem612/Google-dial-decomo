package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abof implements abol {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.Integer d;
    public final abok e;
    public final java.lang.Boolean f;
    public final int g;

    public /* synthetic */ abof(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i, abok abokVar, java.lang.Boolean bool, int i2) {
        abokVar = (i2 & 32) != 0 ? defpackage.aboj.a : abokVar;
        int i3 = i2 & 2;
        num = (i2 & 8) != 0 ? null : num;
        str2 = i3 != 0 ? null : str2;
        bool = (i2 & 64) != 0 ? null : bool;
        aooh.f(str, "key");
        aooh.f(str3, "text");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.g = i;
        this.e = abokVar;
        this.f = bool;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abof) {
            defpackage.abof abofVar = (defpackage.abof) obj;
            if (aooh.n(this.a, abofVar.a) && aooh.n(this.b, abofVar.b) && aooh.n(this.c, abofVar.c) && aooh.n(this.d, abofVar.d) && this.g == abofVar.g && aooh.n(this.e, abofVar.e) && aooh.n(this.f, abofVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        java.lang.Integer num = this.d;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.g) * 31) + this.e.hashCode()) * 31;
        java.lang.Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageItem(key=");
        sb.append(this.a);
        sb.append(", textPrefix=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", textHighlightIndex=");
        sb.append(this.d);
        sb.append(", alignment=");
        sb.append((java.lang.Object) (this.g != 1 ? "End" : "Start"));
        sb.append(", metadata=");
        sb.append(this.e);
        sb.append(", animate=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
