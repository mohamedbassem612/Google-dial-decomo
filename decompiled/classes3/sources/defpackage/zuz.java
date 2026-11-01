package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zuz {
    public final java.lang.Integer a;
    public final java.lang.Integer b;
    public final defpackage.aayj c;
    public final defpackage.aayk d;
    public final defpackage.aayk e;
    public final defpackage.aayk f;

    public zuz(java.lang.Integer num, java.lang.Integer num2, defpackage.aayj aayjVar, defpackage.aayk aaykVar, defpackage.aayk aaykVar2, defpackage.aayk aaykVar3) {
        this.a = num;
        this.b = num2;
        this.c = aayjVar;
        this.d = aaykVar;
        this.e = aaykVar2;
        this.f = aaykVar3;
    }

    public static final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.String str) {
        if (obj == null || obj2 == null) {
            return obj2 != null ? obj2 : obj;
        }
        throw new java.lang.IllegalArgumentException("Conflict merging CallEndedMetricsContribution for field '" + str + "': cannot overwrite '" + obj + "' with '" + obj2 + '\'');
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zuz) {
            defpackage.zuz zuzVar = (defpackage.zuz) obj;
            if (aooh.n(this.a, zuzVar.a) && aooh.n(this.b, zuzVar.b) && this.c == zuzVar.c && this.d == zuzVar.d && this.e == zuzVar.e && this.f == zuzVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = iHashCode * 31;
        defpackage.aayj aayjVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (aayjVar == null ? 0 : aayjVar.hashCode())) * 31;
        defpackage.aayk aaykVar = this.d;
        int iHashCode4 = (iHashCode3 + (aaykVar == null ? 0 : aaykVar.hashCode())) * 31;
        defpackage.aayk aaykVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (aaykVar2 == null ? 0 : aaykVar2.hashCode())) * 31;
        defpackage.aayk aaykVar3 = this.f;
        return iHashCode5 + (aaykVar3 != null ? aaykVar3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CallEndedMetricsContribution(callLoggingId=" + this.a + ", callInitiationType=" + this.b + ", callType=" + this.c + ", callDialingSuccess=" + this.d + ", incomingCallNotificationRequested=" + this.e + ", incomingCallFullScreenShown=" + this.f + ')';
    }

    public zuz() {
        this(null, null, null, null, null, null);
    }
}
