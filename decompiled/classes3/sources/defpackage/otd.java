package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final defpackage.qit f;
    public final defpackage.abvz g;
    public final java.lang.String h;
    public final java.lang.Long i;

    public /* synthetic */ otd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, defpackage.qit qitVar, defpackage.abvz abvzVar, java.lang.String str, java.lang.Long l, int i) {
        defpackage.qit qitVar2 = (i & 32) != 0 ? defpackage.qit.UNKNOWN : qitVar;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        boolean z6 = (i & 16) == 0;
        boolean z7 = z6 & z5;
        boolean z8 = (i2 == 0) & z4;
        boolean z9 = (i3 == 0) & z3;
        boolean z10 = (i4 == 0) & z2;
        int i6 = (i5 ^ 1) & (z ? 1 : 0);
        defpackage.abvz abvzVar2 = (i & 64) != 0 ? null : abvzVar;
        java.lang.String str2 = (i & 128) != 0 ? null : str;
        java.lang.Long l2 = (i & 256) == 0 ? l : null;
        boolean z11 = 1 == i6;
        aooh.f(qitVar2, "notificationModelPriority");
        this.a = z11;
        this.b = z10;
        this.c = z9;
        this.d = z8;
        this.e = z7;
        this.f = qitVar2;
        this.g = abvzVar2;
        this.h = str2;
        this.i = l2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.otd) {
            defpackage.otd otdVar = (defpackage.otd) obj;
            if (this.a == otdVar.a && this.b == otdVar.b && this.c == otdVar.c && this.d == otdVar.d && this.e == otdVar.e && this.f == otdVar.f && aooh.n(this.g, otdVar.g) && aooh.n(this.h, otdVar.h) && aooh.n(this.i, otdVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = anty.L(this.a);
        defpackage.qit qitVar = this.f;
        boolean z = this.e;
        int iL2 = (((((((((iL * 31) + anty.L(this.b)) * 31) + anty.L(this.c)) * 31) + anty.L(this.d)) * 31) + anty.L(z)) * 31) + qitVar.hashCode();
        defpackage.abvz abvzVar = this.g;
        int iHashCode = ((iL2 * 31) + (abvzVar == null ? 0 : abvzVar.hashCode())) * 31;
        java.lang.String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l = this.i;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "InCallActivityIntentConfig(showDialpad=" + this.a + ", newOutgoingCall=" + this.b + ", isForFullScreen=" + this.c + ", isForNotificationButton=" + this.d + ", isForNotificationContent=" + this.e + ", notificationModelPriority=" + this.f + ", calleeId=" + this.g + ", callId=" + this.h + ", outgoingCallRequestId=" + this.i + ')';
    }

    public otd() {
        this(false, false, false, false, false, null, null, null, null, 511);
    }
}
