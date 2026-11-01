package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyq implements defpackage.vyr {
    public final long a;
    public final java.lang.String b;
    public final defpackage.abwd c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.Map f;
    public final java.lang.String g;
    public final ied h;

    public vyq(long j, java.lang.String str, defpackage.abwd abwdVar, java.lang.String str2, java.lang.String str3, java.util.Map map, java.lang.String str4, ied iedVar) {
        aooh.f(str, "contactName");
        aooh.f(abwdVar, "contactImage");
        this.a = j;
        this.b = str;
        this.c = abwdVar;
        this.d = str2;
        this.e = str3;
        this.f = map;
        this.g = str4;
        this.h = iedVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.vyq) {
            defpackage.vyq vyqVar = (defpackage.vyq) obj;
            if (this.a == vyqVar.a && aooh.n(this.b, vyqVar.b) && aooh.n(this.c, vyqVar.c) && aooh.n(this.d, vyqVar.d) && aooh.n(this.e, vyqVar.e) && aooh.n(this.f, vyqVar.f) && aooh.n(this.g, vyqVar.g) && aooh.n(this.h, vyqVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        java.lang.String str = this.d;
        int iHashCode = ((iM * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.e;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f.hashCode()) * 31;
        java.lang.String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ied iedVar = this.h;
        return iHashCode3 + (iedVar != null ? iedVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "VoicemailEntryModel(id=" + this.a + ", contactName=" + this.b + ", contactImage=" + this.c + ", voicemailTranscription=" + this.d + ", voicemailTranscriptionBranding=" + this.e + ", clickListeners=" + this.f + ", callRecordingPlayerState=" + this.g + ", audioInfo=" + this.h + ')';
    }
}
