package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itc {
    public final defpackage.ity a;
    public final defpackage.itr b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.Long e;
    public final java.lang.String f;
    public final java.util.UUID g;
    public final java.lang.String h;
    public final java.lang.Long i;
    public final java.lang.Integer j;
    public final defpackage.itt k;
    public final defpackage.itt l;
    public final boolean m;
    public final boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ itc(defpackage.ity ityVar, defpackage.itr itrVar, java.lang.String str, java.lang.String str2, java.lang.Long l, int i) {
        java.util.UUID uuid;
        if ((i & 64) != 0) {
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            aooh.e(uuidRandomUUID, "randomUUID(...)");
            uuid = uuidRandomUUID;
        } else {
            uuid = null;
        }
        this(ityVar, (i & 2) != 0 ? null : itrVar, (i & 4) != 0 ? null : str, null, null, null, uuid, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : l, null, null, null, false, true);
    }

    public static /* synthetic */ defpackage.itc a(defpackage.itc itcVar, defpackage.itr itrVar, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.String str3, java.lang.Long l2, java.lang.Integer num, defpackage.itt ittVar, defpackage.itt ittVar2, int i) {
        defpackage.ity ityVar = (i & 1) != 0 ? itcVar.a : null;
        defpackage.itr itrVar2 = (i & 2) != 0 ? itcVar.b : itrVar;
        java.lang.String str4 = (i & 4) != 0 ? itcVar.c : null;
        java.lang.String str5 = (i & 8) != 0 ? itcVar.d : str;
        java.lang.Long l3 = (i & 16) != 0 ? itcVar.e : l;
        java.lang.String str6 = (i & 32) != 0 ? itcVar.f : str2;
        java.util.UUID uuid = (i & 64) != 0 ? itcVar.g : null;
        java.lang.String str7 = (i & 128) != 0 ? itcVar.h : str3;
        java.lang.Long l4 = (i & 256) != 0 ? itcVar.i : l2;
        java.lang.Integer num2 = (i & 512) != 0 ? itcVar.j : num;
        defpackage.itt ittVar3 = (i & 1024) != 0 ? itcVar.k : ittVar;
        defpackage.itt ittVar4 = (i & 2048) != 0 ? itcVar.l : ittVar2;
        boolean z = (i & 4096) != 0 ? itcVar.m : false;
        boolean z2 = (i & 8192) != 0 ? itcVar.n : false;
        aooh.f(ityVar, "timestamp");
        aooh.f(uuid, "uniqueId");
        return new defpackage.itc(ityVar, itrVar2, str4, str5, l3, str6, uuid, str7, l4, num2, ittVar3, ittVar4, z, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.itc) {
            defpackage.itc itcVar = (defpackage.itc) obj;
            if (aooh.n(this.a, itcVar.a) && aooh.n(this.b, itcVar.b) && aooh.n(this.c, itcVar.c) && aooh.n(this.d, itcVar.d) && aooh.n(this.e, itcVar.e) && aooh.n(this.f, itcVar.f) && aooh.n(this.g, itcVar.g) && aooh.n(this.h, itcVar.h) && aooh.n(this.i, itcVar.i) && aooh.n(this.j, itcVar.j) && aooh.n(this.k, itcVar.k) && aooh.n(this.l, itcVar.l) && this.m == itcVar.m && this.n == itcVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.itr itrVar = this.b;
        int iHashCode2 = (iHashCode + (itrVar == null ? 0 : itrVar.hashCode())) * 31;
        java.lang.String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.String str3 = this.f;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.g.hashCode()) * 31;
        java.lang.String str4 = this.h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Long l2 = this.i;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.Integer num = this.j;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        defpackage.itt ittVar = this.k;
        int iHashCode10 = (iHashCode9 + (ittVar == null ? 0 : ittVar.hashCode())) * 31;
        defpackage.itt ittVar2 = this.l;
        return ((((iHashCode10 + (ittVar2 != null ? ittVar2.hashCode() : 0)) * 31) + anty.L(this.m)) * 31) + anty.L(this.n);
    }

    public final java.lang.String toString() {
        return "BeeslyData(timestamp=" + this.a + ", callActionsState=" + this.b + ", transcriptionFilePath=" + this.c + ", transcriptionText=" + this.d + ", transcriptionCreationTimestamp=" + this.e + ", audioRecordingFilePath=" + this.f + ", uniqueId=" + this.g + ", callId=" + this.h + ", callEndedTimestamp=" + this.i + ", callType=" + this.j + ", userContentVerdictState=" + this.k + ", aiCoreContentVerdictState=" + this.l + ", spamContentBannerDismissed=" + this.m + ", isEligibleForSurvey=" + this.n + ')';
    }

    public itc(defpackage.ity ityVar, defpackage.itr itrVar, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, java.util.UUID uuid, java.lang.String str4, java.lang.Long l2, java.lang.Integer num, defpackage.itt ittVar, defpackage.itt ittVar2, boolean z, boolean z2) {
        aooh.f(ityVar, "timestamp");
        aooh.f(uuid, "uniqueId");
        this.a = ityVar;
        this.b = itrVar;
        this.c = str;
        this.d = str2;
        this.e = l;
        this.f = str3;
        this.g = uuid;
        this.h = str4;
        this.i = l2;
        this.j = num;
        this.k = ittVar;
        this.l = ittVar2;
        this.m = z;
        this.n = z2;
    }
}
