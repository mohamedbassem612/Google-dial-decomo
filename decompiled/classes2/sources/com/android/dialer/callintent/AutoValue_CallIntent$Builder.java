package com.android.dialer.callintent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class AutoValue_CallIntent$Builder extends com.android.dialer.callintent.CallIntent$Builder {
    public defpackage.hue a;
    public android.telecom.PhoneAccountHandle b;
    public java.lang.String c;
    public aigb d;
    public aigf e;
    public aigb f;
    public aigf g;
    public aigb h;
    public aigf i;
    public android.os.Bundle j;
    public byte k;
    private android.net.Uri l;
    private defpackage.jxb m;
    private boolean n;
    private boolean o;
    private j$.util.Optional p = j$.util.Optional.empty();
    private j$.util.Optional q = j$.util.Optional.empty();
    private int r;

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final android.net.Uri a() {
        android.net.Uri uri = this.l;
        if (uri != null) {
            return uri;
        }
        throw new java.lang.IllegalStateException("Property \"number\" has not been set");
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final android.os.Bundle b() {
        return this.j;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final android.telecom.PhoneAccountHandle c() {
        return this.b;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final defpackage.hue d() {
        return this.a;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final defpackage.jwz e() {
        android.net.Uri uri;
        defpackage.jxb jxbVar;
        int i;
        aigb aigbVar = this.d;
        if (aigbVar != null) {
            this.e = aigbVar.e(true);
        } else if (this.e == null) {
            this.e = aikj.b;
        }
        aigb aigbVar2 = this.f;
        if (aigbVar2 != null) {
            this.g = aigbVar2.e(true);
        } else if (this.g == null) {
            this.g = aikj.b;
        }
        aigb aigbVar3 = this.h;
        if (aigbVar3 != null) {
            this.i = aigbVar3.e(true);
        } else if (this.i == null) {
            this.i = aikj.b;
        }
        if (this.k == 7 && (uri = this.l) != null && (jxbVar = this.m) != null && (i = this.r) != 0) {
            return new defpackage.jwz(uri, this.a, jxbVar, this.b, this.n, i, this.c, this.o, this.e, this.g, this.i, this.j, this.p, this.q);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.l == null) {
            sb.append(" number");
        }
        if (this.m == null) {
            sb.append(" callSpecificAppData");
        }
        if ((this.k & 1) == 0) {
            sb.append(" isEmergencyNumber");
        }
        if ((this.k & 2) == 0) {
            sb.append(" isVideoCall");
        }
        if (this.r == 0) {
            sb.append(" blockedState");
        }
        if ((this.k & 4) == 0) {
            sb.append(" allowAssistedDial");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final defpackage.jxb f() {
        defpackage.jxb jxbVar = this.m;
        if (jxbVar != null) {
            return jxbVar;
        }
        throw new java.lang.IllegalStateException("Property \"callSpecificAppData\" has not been set");
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final aigf g() {
        aigb aigbVar = this.h;
        if (aigbVar != null) {
            return aigbVar.e(true);
        }
        aigf aigfVar = this.i;
        if (aigfVar == null) {
            aigfVar = aikj.b;
            this.i = aigfVar;
        }
        return aigfVar;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final aigf h() {
        aigb aigbVar = this.f;
        if (aigbVar != null) {
            return aigbVar.e(true);
        }
        aigf aigfVar = this.g;
        if (aigfVar == null) {
            aigfVar = aikj.b;
            this.g = aigfVar;
        }
        return aigfVar;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final aigf i() {
        aigb aigbVar = this.d;
        if (aigbVar != null) {
            return aigbVar.e(true);
        }
        aigf aigfVar = this.e;
        if (aigfVar == null) {
            aigfVar = aikj.b;
            this.e = aigfVar;
        }
        return aigfVar;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final j$.util.Optional j() {
        return this.p;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final j$.util.Optional k() {
        return this.q;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final java.lang.String l() {
        return this.c;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final boolean m() {
        if ((this.k & 4) != 0) {
            return this.o;
        }
        throw new java.lang.IllegalStateException("Property \"allowAssistedDial\" has not been set");
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final boolean n() {
        if ((this.k & 2) != 0) {
            return this.n;
        }
        throw new java.lang.IllegalStateException("Property \"isVideoCall\" has not been set");
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final int o() {
        int i = this.r;
        if (i != 0) {
            return i;
        }
        throw new java.lang.IllegalStateException("Property \"blockedState\" has not been set");
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void p(boolean z) {
        this.o = z;
        this.k = (byte) (this.k | 4);
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void q(int i) {
        if (i == 0) {
            throw new java.lang.NullPointerException("Null blockedState");
        }
        this.r = i;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void r(defpackage.jxb jxbVar) {
        if (jxbVar == null) {
            throw new java.lang.NullPointerException("Null callSpecificAppData");
        }
        this.m = jxbVar;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void s(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null calleeId");
        }
        this.p = optional;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void t(boolean z) {
        this.n = z;
        this.k = (byte) (this.k | 2);
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void u(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null number");
        }
        this.l = uri;
    }

    @Override // com.android.dialer.callintent.CallIntent$Builder
    public final void v(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null outgoingCallRequestId");
        }
        this.q = optional;
    }
}
