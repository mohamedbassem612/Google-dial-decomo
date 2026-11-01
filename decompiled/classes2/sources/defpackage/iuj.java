package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iuj {
    public final long a;
    public final java.util.UUID b;
    public final java.lang.String c;
    public final java.lang.Long d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.Long g;
    public final java.lang.String h;
    public final java.lang.Integer i;
    public final defpackage.itz j;
    public final defpackage.iub k;
    public final defpackage.iud l;
    public final defpackage.iud m;
    public final boolean n;
    public final boolean o;

    public iuj(long j, java.util.UUID uuid, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.String str3, java.lang.Long l2, java.lang.String str4, java.lang.Integer num, defpackage.itz itzVar, defpackage.iub iubVar, defpackage.iud iudVar, defpackage.iud iudVar2, boolean z, boolean z2) {
        aooh.f(uuid, "uniqueId");
        this.a = j;
        this.b = uuid;
        this.c = str;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = l2;
        this.h = str4;
        this.i = num;
        this.j = itzVar;
        this.k = iubVar;
        this.l = iudVar;
        this.m = iudVar2;
        this.n = z;
        this.o = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.iuj) {
            defpackage.iuj iujVar = (defpackage.iuj) obj;
            if (this.a == iujVar.a && aooh.n(this.b, iujVar.b) && aooh.n(this.c, iujVar.c) && aooh.n(this.d, iujVar.d) && aooh.n(this.e, iujVar.e) && aooh.n(this.f, iujVar.f) && aooh.n(this.g, iujVar.g) && aooh.n(this.h, iujVar.h) && aooh.n(this.i, iujVar.i) && aooh.n(this.j, iujVar.j) && aooh.n(this.k, iujVar.k) && aooh.n(this.l, iujVar.l) && aooh.n(this.m, iujVar.m) && this.n == iujVar.n && this.o == iujVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (anty.M(this.a) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        int iHashCode = ((iM * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l2 = this.g;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.String str4 = this.h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num = this.i;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        defpackage.itz itzVar = this.j;
        int iHashCode8 = (iHashCode7 + (itzVar == null ? 0 : itzVar.hashCode())) * 31;
        defpackage.iub iubVar = this.k;
        int iHashCode9 = (iHashCode8 + (iubVar == null ? 0 : iubVar.hashCode())) * 31;
        defpackage.iud iudVar = this.l;
        int iHashCode10 = (iHashCode9 + (iudVar == null ? 0 : iudVar.hashCode())) * 31;
        defpackage.iud iudVar2 = this.m;
        return ((((iHashCode10 + (iudVar2 != null ? iudVar2.hashCode() : 0)) * 31) + anty.L(this.n)) * 31) + anty.L(this.o);
    }

    public final java.lang.String toString() {
        return "BeeslyDataEntity(createdTimestampMs=" + this.a + ", uniqueId=" + this.b + ", callId=" + this.c + ", callEndedTimestampMs=" + this.d + ", transcriptionFilePath=" + this.e + ", transcriptionText=" + this.f + ", transcriptionCreationTimestampMs=" + this.g + ", audioRecordingFilePath=" + this.h + ", callType=" + this.i + ", callActions=" + this.j + ", callActionsError=" + this.k + ", userContentVerdictState=" + this.l + ", aiCoreContentVerdictState=" + this.m + ", isContentVerdictBannerDismissed=" + this.n + ", isEligibleForSurvey=" + this.o + ')';
    }
}
