package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jel {
    public final java.lang.String a;
    public final int b;
    public final abwd c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    private final java.lang.String g;

    public jel(java.lang.String str, int i, abwd abwdVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        aooh.f(abwdVar, "photoInfo");
        this.a = str;
        this.b = i;
        this.c = abwdVar;
        this.g = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jel) {
            defpackage.jel jelVar = (defpackage.jel) obj;
            if (aooh.n(this.a, jelVar.a) && this.b == jelVar.b && aooh.n(this.c, jelVar.c) && aooh.n(this.g, jelVar.g) && aooh.n(this.d, jelVar.d) && aooh.n(this.e, jelVar.e) && this.f == jelVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31) + this.c.hashCode();
        java.lang.String str2 = this.g;
        int iHashCode2 = ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.e;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + anty.L(this.f);
    }

    public final java.lang.String toString() {
        return "MissedCallNotificationContent(number=" + this.a + ", presentation=" + this.b + ", photoInfo=" + this.c + ", uniqueCallId=" + this.g + ", transcriptionText=" + this.d + ", audioRecordingFilePath=" + this.e + ", canShowTranscriptAudioFeedback=" + this.f + ')';
    }
}
