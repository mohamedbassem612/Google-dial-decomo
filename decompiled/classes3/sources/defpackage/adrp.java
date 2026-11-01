package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adrp {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    private long e;
    private byte f;
    private java.lang.Object g;

    public adrp(defpackage.adrr adrrVar) {
        this.a = j$.util.Optional.empty();
        this.b = j$.util.Optional.empty();
        this.c = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
        this.g = adrrVar.a;
        this.e = adrrVar.b;
        this.a = adrrVar.c;
        this.b = adrrVar.d;
        this.c = adrrVar.e;
        this.d = adrrVar.f;
        this.f = (byte) 1;
    }

    public final defpackage.adrr a() {
        java.lang.Object obj;
        if (this.f != 1 || (obj = this.g) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.g == null) {
                sb.append(" suggestions");
            }
            if (this.f == 0) {
                sb.append(" resultReceivedTime");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        long j = this.e;
        java.lang.Object obj2 = this.a;
        return new defpackage.adrr((aify) obj, j, (j$.util.Optional) obj2, (j$.util.Optional) this.b, (j$.util.Optional) this.c, (j$.util.Optional) this.d);
    }

    public final void b(defpackage.adns adnsVar) {
        this.b = j$.util.Optional.of(adnsVar);
    }

    public final void c(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    public final void d(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null suggestions");
        }
        this.g = aifyVar;
    }

    public final void e(adol adolVar) {
        this.c = j$.util.Optional.of(adolVar);
    }

    public final com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext f() {
        if (this.g == null) {
            this.g = aikj.b;
        }
        if (this.f != 1 || this.b == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.b == null) {
                sb.append(" promotion");
            }
            if (this.f == 0) {
                sb.append(" triggeringEventTimeMs");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = this.b;
        long j = this.e;
        java.lang.Object obj3 = this.g;
        return new com.google.android.libraries.internal.growth.growthkit.internal.common.AutoValue_PromoContext((java.lang.String) obj, (akhl) obj2, j, (aigf) obj3, (defpackage.aksc) this.d, (java.lang.String) this.c);
    }

    public final void g(java.util.Map map) {
        this.g = aigf.i(map);
    }

    public final void h(akhl akhlVar) {
        if (akhlVar == null) {
            throw new java.lang.NullPointerException("Null promotion");
        }
        this.b = akhlVar;
    }

    public final void i(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    public final defpackage.voy j() {
        java.lang.Object obj;
        if (this.f != 1 || (obj = this.g) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.g == null) {
                sb.append(" phoneAccountHandle");
            }
            if (this.f == 0) {
                sb.append(" durationMillis");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        long j = this.e;
        java.lang.Object obj2 = this.b;
        return new defpackage.voy((android.telecom.PhoneAccountHandle) obj, j, (aify) obj2, (android.net.Uri) this.d, (j$.util.Optional) this.a, (java.lang.String) this.c);
    }

    public final void k(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    public final void l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            throw new java.lang.NullPointerException("Null phoneAccountHandle");
        }
        this.g = phoneAccountHandle;
    }

    public final defpackage.upo m() {
        java.lang.Object obj;
        if (this.f == 1 && (obj = this.a) != null) {
            return new defpackage.upo((java.lang.Long) this.b, (j$.util.Optional) this.g, this.e, (java.lang.String) obj, (java.lang.String) this.c, (defpackage.upl) this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f == 0) {
            sb.append(" contactId");
        }
        if (this.a == null) {
            sb.append(" lookupKey");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void n(long j) {
        this.e = j;
        this.f = (byte) 1;
    }

    public final void o(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null lookupKey");
        }
        this.a = str;
    }

    public final void p(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null pinnedPosition");
        }
        this.g = optional;
    }

    public adrp() {
        this.a = j$.util.Optional.empty();
        this.b = j$.util.Optional.empty();
        this.c = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
    }

    public adrp(byte[] bArr, byte[] bArr2) {
        this.g = j$.util.Optional.empty();
    }

    public adrp(defpackage.upo upoVar) {
        this.g = j$.util.Optional.empty();
        this.b = upoVar.a;
        this.g = upoVar.b;
        this.e = upoVar.c;
        this.a = upoVar.d;
        this.c = upoVar.e;
        this.d = upoVar.f;
        this.f = (byte) 1;
    }

    public adrp(char[] cArr) {
        this.a = j$.util.Optional.empty();
    }

    public adrp(byte[] bArr) {
    }
}
