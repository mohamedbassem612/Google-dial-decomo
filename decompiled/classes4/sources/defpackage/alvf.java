package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvf {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final int f;

    public alvf(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        aooh.f(str, "text");
        aooh.f(str3, "action");
        aooh.f(str4, "intent");
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.alvf) {
            defpackage.alvf alvfVar = (defpackage.alvf) obj;
            if (this.f == alvfVar.f && aooh.n(this.a, alvfVar.a) && aooh.n(this.b, alvfVar.b) && aooh.n(this.c, alvfVar.c) && aooh.n(this.d, alvfVar.d) && this.e == alvfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.a.hashCode();
        java.lang.String str = this.b;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + anty.L(this.e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Turn(speaker=");
        sb.append((java.lang.Object) (this.f != 1 ? "REMOTE" : "BOT"));
        sb.append(", text=");
        sb.append(this.a);
        sb.append(", actionId=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", intent=");
        sb.append(this.d);
        sb.append(", isInterrupted=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
