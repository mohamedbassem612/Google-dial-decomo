package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqr {
    public final java.lang.String a;
    public final aify b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final defpackage.qqq h;
    public final defpackage.pux i;
    public final defpackage.pux j;
    public final j$.util.Optional k;
    public final j$.util.Optional l;
    public final boolean m;
    public final boolean n;
    public final defpackage.qqn o;
    public final boolean p;
    public final boolean q;
    public final j$.util.Optional r;
    public final j$.util.Optional s;
    public final boolean t;
    private final boolean u;
    private final defpackage.pom v;

    public qqr(java.lang.String str, aify aifyVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, defpackage.qqq qqqVar, defpackage.pux puxVar, defpackage.pux puxVar2, j$.util.Optional optional, j$.util.Optional optional2, boolean z6, boolean z7, defpackage.qqn qqnVar, boolean z8, boolean z9, j$.util.Optional optional3, j$.util.Optional optional4, boolean z10, boolean z11, defpackage.pom pomVar) {
        this.a = str;
        this.b = aifyVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = qqqVar;
        this.i = puxVar;
        this.j = puxVar2;
        this.k = optional;
        this.l = optional2;
        this.m = z6;
        this.n = z7;
        this.o = qqnVar;
        this.p = z8;
        this.q = z9;
        this.r = optional3;
        this.s = optional4;
        this.u = z10;
        this.t = z11;
        this.v = pomVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qqr) {
            defpackage.qqr qqrVar = (defpackage.qqr) obj;
            if (this.a.equals(qqrVar.a) && ahvr.aP(this.b, qqrVar.b) && this.c == qqrVar.c && this.d == qqrVar.d && this.e == qqrVar.e && this.f == qqrVar.f && this.g == qqrVar.g && this.h.equals(qqrVar.h) && this.i.equals(qqrVar.i) && this.j.equals(qqrVar.j) && this.k.equals(qqrVar.k) && this.l.equals(qqrVar.l) && this.m == qqrVar.m && this.n == qqrVar.n && this.o.equals(qqrVar.o) && this.p == qqrVar.p && this.q == qqrVar.q && this.r.equals(qqrVar.r) && this.s.equals(qqrVar.s) && this.u == qqrVar.u && this.t == qqrVar.t && this.v.equals(qqrVar.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true == this.t ? 1231 : 1237)) * 1000003) ^ this.v.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.pom pomVar = this.v;
        j$.util.Optional optional = this.s;
        j$.util.Optional optional2 = this.r;
        defpackage.qqn qqnVar = this.o;
        j$.util.Optional optional3 = this.l;
        j$.util.Optional optional4 = this.k;
        defpackage.pux puxVar = this.j;
        defpackage.pux puxVar2 = this.i;
        defpackage.qqq qqqVar = this.h;
        return "VideoModel{callId=" + this.a + ", buttons=" + java.lang.String.valueOf(this.b) + ", isInFullscreenMode=" + this.c + ", isLocalVideoOnlyMode=" + this.d + ", isLocalVideoEnabled=" + this.e + ", isRemoteVideoEnabled=" + this.f + ", isRemotelyHeld=" + this.g + ", preview=" + java.lang.String.valueOf(qqqVar) + ", localVideo=" + java.lang.String.valueOf(puxVar2) + ", remoteVideo=" + java.lang.String.valueOf(puxVar) + ", cameraOrientation=" + java.lang.String.valueOf(optional4) + ", localVideoTransmitDimensions=" + java.lang.String.valueOf(optional3) + ", autoRequestCameraPermission=" + this.m + ", shouldShowCameraPermissionToast=" + this.n + ", oneWayVideoDirectionForDisallowToastMessage=" + java.lang.String.valueOf(qqnVar) + ", shouldShowChargeAlertDialog=" + this.p + ", shouldShowReachedMaximumNumberOfParticipantsToast=" + this.q + ", localOffBlurredImage=" + java.lang.String.valueOf(optional2) + ", remoteOffBlurredImage=" + java.lang.String.valueOf(optional) + ", isVideoConference=" + this.u + ", shouldShowBluetoothPermissionPrompt=" + this.t + ", contactGridDataModel=" + java.lang.String.valueOf(pomVar) + '}';
    }

    public qqr() {
        throw null;
    }
}
