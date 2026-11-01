package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ttk {
    public final j$.time.Instant a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;

    public ttk(j$.time.Instant instant, java.lang.String str, int i, int i2, int i3) {
        aooh.f(instant, "callCreationInstant");
        aooh.f(str, "callId");
        this.a = instant;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ttk) {
            defpackage.ttk ttkVar = (defpackage.ttk) obj;
            if (aooh.n(this.a, ttkVar.a) && aooh.n(this.b, ttkVar.b) && this.c == ttkVar.c && this.d == ttkVar.d && this.e == ttkVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SharpieDataEntry(callCreationInstant=");
        sb.append(this.a);
        sb.append(", callId=");
        sb.append(this.b);
        sb.append(", mlVerdict=");
        sb.append((java.lang.Object) wsc.cl(this.c));
        sb.append(", userVerdict=");
        sb.append((java.lang.Object) wsc.cl(this.d));
        sb.append(", userScamAlertAction=");
        int i = this.e;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "BLOCKED" : "DISMISSED";
        } else {
            str = "NONE";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
