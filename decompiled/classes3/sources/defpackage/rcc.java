package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcc {
    public final java.lang.String a;
    public final j$.util.Optional b;
    public final defpackage.pom c;
    public final aify d;
    public final j$.util.Optional e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final aify i;
    public final j$.util.Optional j;
    public final defpackage.rce k;
    public final boolean l;
    public final boolean m;
    public final j$.util.Optional n;
    public final j$.util.Optional o;
    public final boolean p;
    public final boolean q;
    public final j$.util.Optional r;
    public final j$.util.Optional s;
    public final int t;
    private final defpackage.rca u;
    private final defpackage.rca v;
    private final aify w;

    public rcc(java.lang.String str, j$.util.Optional optional, int i, defpackage.pom pomVar, aify aifyVar, j$.util.Optional optional2, boolean z, defpackage.rca rcaVar, defpackage.rca rcaVar2, boolean z2, boolean z3, aify aifyVar2, aify aifyVar3, j$.util.Optional optional3, defpackage.rce rceVar, boolean z4, boolean z5, j$.util.Optional optional4, j$.util.Optional optional5, boolean z6, boolean z7, j$.util.Optional optional6, j$.util.Optional optional7) {
        this.a = str;
        this.b = optional;
        this.t = i;
        this.c = pomVar;
        this.d = aifyVar;
        this.e = optional2;
        this.f = z;
        this.u = rcaVar;
        this.v = rcaVar2;
        this.g = z2;
        this.h = z3;
        this.w = aifyVar2;
        this.i = aifyVar3;
        this.j = optional3;
        this.k = rceVar;
        this.l = z4;
        this.m = z5;
        this.n = optional4;
        this.o = optional5;
        this.p = z6;
        this.q = z7;
        this.r = optional6;
        this.s = optional7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rcc) {
            defpackage.rcc rccVar = (defpackage.rcc) obj;
            if (this.a.equals(rccVar.a) && this.b.equals(rccVar.b)) {
                int i = this.t;
                int i2 = rccVar.t;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(rccVar.c) && ahvr.aP(this.d, rccVar.d) && this.e.equals(rccVar.e) && this.f == rccVar.f && this.u.equals(rccVar.u) && this.v.equals(rccVar.v) && this.g == rccVar.g && this.h == rccVar.h && ahvr.aP(this.w, rccVar.w) && ahvr.aP(this.i, rccVar.i) && this.j.equals(rccVar.j) && this.k.equals(rccVar.k) && this.l == rccVar.l && this.m == rccVar.m && this.n.equals(rccVar.n) && this.o.equals(rccVar.o) && this.p == rccVar.p && this.q == rccVar.q && this.r.equals(rccVar.r) && this.s.equals(rccVar.s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.t;
        anty.aJ(i);
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true == this.q ? 1231 : 1237)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.t;
        java.lang.String strValueOf = java.lang.String.valueOf(this.b);
        if (i != 1) {
            str = i != 2 ? "null" : "PRODUCED";
        } else {
            str = "INITIAL";
        }
        java.lang.String str2 = this.a;
        defpackage.pom pomVar = this.c;
        aify aifyVar = this.d;
        j$.util.Optional optional = this.e;
        boolean z = this.f;
        defpackage.rca rcaVar = this.u;
        defpackage.rca rcaVar2 = this.v;
        boolean z2 = this.g;
        boolean z3 = this.h;
        aify aifyVar2 = this.w;
        aify aifyVar3 = this.i;
        j$.util.Optional optional2 = this.j;
        defpackage.rce rceVar = this.k;
        boolean z4 = this.l;
        boolean z5 = this.m;
        j$.util.Optional optional3 = this.n;
        j$.util.Optional optional4 = this.o;
        boolean z6 = this.p;
        boolean z7 = this.q;
        j$.util.Optional optional5 = this.r;
        j$.util.Optional optional6 = this.s;
        return "VoiceModel{callId=" + str2 + ", outgoingCallRequestId=" + strValueOf + ", modelType=" + str + ", contactGridDataModel=" + java.lang.String.valueOf(pomVar) + ", fixedVoiceButtonsList=" + java.lang.String.valueOf(aifyVar) + ", partnerAppAreaButton=" + java.lang.String.valueOf(optional) + ", shouldShowButtonRow=" + z + ", contactGridModeOneColumnLayout=" + java.lang.String.valueOf(rcaVar) + ", contactGridModeTwoColumnLayout=" + java.lang.String.valueOf(rcaVar2) + ", shouldShowPromoSmallCenterFragment=" + z2 + ", shouldShowBluetoothPermissionsPrompt=" + z3 + ", callAudioDevicesList=" + java.lang.String.valueOf(aifyVar2) + ", voiceScreenChipsList=" + java.lang.String.valueOf(aifyVar3) + ", centerFragmentKey=" + java.lang.String.valueOf(optional2) + ", voiceScreenBottomSheet=" + java.lang.String.valueOf(rceVar) + ", canHideBottomSheet=" + z4 + ", canDragBottomSheet=" + z5 + ", dialogFragmentKey=" + java.lang.String.valueOf(optional3) + ", snackbarKey=" + java.lang.String.valueOf(optional4) + ", shouldEnableEndCallButton=" + z6 + ", nonVoiceInCallScreenKeySelected=" + z7 + ", voiceAnimationConfig=" + java.lang.String.valueOf(optional5) + ", callBackground=" + java.lang.String.valueOf(optional6) + '}';
    }

    public rcc() {
        throw null;
    }
}
