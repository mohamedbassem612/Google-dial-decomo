package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcb {
    public int g;
    private java.lang.String h;
    private defpackage.pom j;
    private aify k;
    private boolean l;
    private defpackage.rca m;
    private defpackage.rca n;
    private boolean o;
    private boolean p;
    private aify q;
    private aify r;
    private defpackage.rce s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private byte x;
    private j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional a = j$.util.Optional.empty();
    public j$.util.Optional b = j$.util.Optional.empty();
    public j$.util.Optional c = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional f = j$.util.Optional.empty();

    public final defpackage.rcc a() {
        java.lang.String str;
        int i;
        defpackage.pom pomVar;
        aify aifyVar;
        defpackage.rca rcaVar;
        defpackage.rca rcaVar2;
        aify aifyVar2;
        aify aifyVar3;
        defpackage.rce rceVar;
        if (this.x == 127 && (str = this.h) != null && (i = this.g) != 0 && (pomVar = this.j) != null && (aifyVar = this.k) != null && (rcaVar = this.m) != null && (rcaVar2 = this.n) != null && (aifyVar2 = this.q) != null && (aifyVar3 = this.r) != null && (rceVar = this.s) != null) {
            return new defpackage.rcc(str, this.i, i, pomVar, aifyVar, this.a, this.l, rcaVar, rcaVar2, this.o, this.p, aifyVar2, aifyVar3, this.b, rceVar, this.t, this.u, this.c, this.d, this.v, this.w, this.e, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.h == null) {
            sb.append(" callId");
        }
        if (this.g == 0) {
            sb.append(" modelType");
        }
        if (this.j == null) {
            sb.append(" contactGridDataModel");
        }
        if (this.k == null) {
            sb.append(" fixedVoiceButtonsList");
        }
        if ((this.x & 1) == 0) {
            sb.append(" shouldShowButtonRow");
        }
        if (this.m == null) {
            sb.append(" contactGridModeOneColumnLayout");
        }
        if (this.n == null) {
            sb.append(" contactGridModeTwoColumnLayout");
        }
        if ((this.x & 2) == 0) {
            sb.append(" shouldShowPromoSmallCenterFragment");
        }
        if ((this.x & 4) == 0) {
            sb.append(" shouldShowBluetoothPermissionsPrompt");
        }
        if (this.q == null) {
            sb.append(" callAudioDevicesList");
        }
        if (this.r == null) {
            sb.append(" voiceScreenChipsList");
        }
        if (this.s == null) {
            sb.append(" voiceScreenBottomSheet");
        }
        if ((this.x & 8) == 0) {
            sb.append(" canHideBottomSheet");
        }
        if ((this.x & 16) == 0) {
            sb.append(" canDragBottomSheet");
        }
        if ((this.x & 32) == 0) {
            sb.append(" shouldEnableEndCallButton");
        }
        if ((this.x & 64) == 0) {
            sb.append(" nonVoiceInCallScreenKeySelected");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null callAudioDevicesList");
        }
        this.q = aifyVar;
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        this.h = str;
    }

    public final void d(boolean z) {
        this.u = z;
        this.x = (byte) (this.x | 16);
    }

    public final void e(boolean z) {
        this.t = z;
        this.x = (byte) (this.x | 8);
    }

    public final void f(defpackage.pom pomVar) {
        if (pomVar == null) {
            throw new java.lang.NullPointerException("Null contactGridDataModel");
        }
        this.j = pomVar;
    }

    public final void g(defpackage.rca rcaVar) {
        if (rcaVar == null) {
            throw new java.lang.NullPointerException("Null contactGridModeOneColumnLayout");
        }
        this.m = rcaVar;
    }

    public final void h(defpackage.rca rcaVar) {
        if (rcaVar == null) {
            throw new java.lang.NullPointerException("Null contactGridModeTwoColumnLayout");
        }
        this.n = rcaVar;
    }

    public final void i(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null fixedVoiceButtonsList");
        }
        this.k = aifyVar;
    }

    public final void j(boolean z) {
        this.w = z;
        this.x = (byte) (this.x | 64);
    }

    public final void k(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null outgoingCallRequestId");
        }
        this.i = optional;
    }

    public final void l(boolean z) {
        this.v = z;
        this.x = (byte) (this.x | 32);
    }

    public final void m(boolean z) {
        this.p = z;
        this.x = (byte) (this.x | 4);
    }

    public final void n(boolean z) {
        this.l = z;
        this.x = (byte) (this.x | 1);
    }

    public final void o(boolean z) {
        this.o = z;
        this.x = (byte) (this.x | 2);
    }

    public final void p(defpackage.rce rceVar) {
        if (rceVar == null) {
            throw new java.lang.NullPointerException("Null voiceScreenBottomSheet");
        }
        this.s = rceVar;
    }

    public final void q(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null voiceScreenChipsList");
        }
        this.r = aifyVar;
    }
}
