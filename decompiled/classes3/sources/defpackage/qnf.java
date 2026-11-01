package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnf {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final defpackage.pux e;
    public final defpackage.pus f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    private final defpackage.pom j;

    public qnf(java.lang.String str, boolean z, boolean z2, boolean z3, defpackage.pux puxVar, defpackage.pus pusVar, boolean z4, boolean z5, boolean z6, defpackage.pom pomVar) {
        aooh.f(str, "callId");
        aooh.f(puxVar, "localVideo");
        aooh.f(pomVar, "contactGridDataModel");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = puxVar;
        this.f = pusVar;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = pomVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qnf) {
            defpackage.qnf qnfVar = (defpackage.qnf) obj;
            if (aooh.n(this.a, qnfVar.a) && this.b == qnfVar.b && this.c == qnfVar.c && this.d == qnfVar.d && aooh.n(this.e, qnfVar.e) && this.f == qnfVar.f && this.g == qnfVar.g && this.h == qnfVar.h && this.i == qnfVar.i && aooh.n(this.j, qnfVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.pux puxVar = this.e;
        int iL = ((((((iHashCode + anty.L(this.b)) * 31) + anty.L(this.c)) * 31) + anty.L(this.d)) * 31) + puxVar.hashCode();
        defpackage.pus pusVar = this.f;
        return (((((((((iL * 31) + (pusVar == null ? 0 : pusVar.hashCode())) * 31) + anty.L(this.g)) * 31) + anty.L(this.h)) * 31) + anty.L(this.i)) * 31) + this.j.hashCode();
    }

    public final java.lang.String toString() {
        return "VideoAnswerModel(callId=" + this.a + ", shouldSuppressFullscreenAlert=" + this.b + ", isSpamCall=" + this.c + ", isLocalVideoEnabled=" + this.d + ", localVideo=" + this.e + ", cameraOrientation=" + this.f + ", showAnswerWithLocalCameraOffChip=" + this.g + ", showBlackOverlay=" + this.h + ", canAnswerAsVoiceCall=" + this.i + ", contactGridDataModel=" + this.j + ')';
    }
}
