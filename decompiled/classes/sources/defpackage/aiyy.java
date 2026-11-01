package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiyy {
    private static defpackage.aiyy b;
    public java.lang.Object a;

    public aiyy(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.a = new defpackage.eae(new android.view.WindowInsetsAnimation(0, null, 0L));
        this.a = new defpackage.eae(windowInsetsAnimation);
    }

    public static /* synthetic */ j$.time.Instant d() {
        return j$.time.Instant.ofEpochMilli(android.os.SystemClock.uptimeMillis());
    }

    public static synchronized defpackage.aiyy j() {
        defpackage.aiyy aiyyVar;
        aiyyVar = b;
        if (aiyyVar == null) {
            aiyyVar = new defpackage.aiyy();
            b = aiyyVar;
        }
        return aiyyVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final void a() throws afeb {
        defpackage.afec.c();
        if (this.a == null) {
            throw new java.lang.NullPointerException("init() was already called");
        }
        for (defpackage.afag afagVar : defpackage.afag.values()) {
            defpackage.afah afahVar = (defpackage.afah) this.a.get(afagVar);
            if (afahVar != null) {
                afahVar.a();
            }
        }
        this.a = null;
    }

    public final defpackage.adod b() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return (defpackage.adod) obj;
        }
        throw new java.lang.IllegalStateException("Settings not set for the Whisper lib.");
    }

    public final synchronized aajn c() {
        if (this.a == null) {
            this.a = new aajn(defpackage.ahvr.bI(new fed(7)), d());
        }
        return (aajn) this.a;
    }

    public final synchronized boolean e() {
        return this.a != null;
    }

    public final int f() {
        com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = ((defpackage.aavp) this.a).a;
        defpackage.aais.as(usageReportingOptInOptions);
        return usageReportingOptInOptions.a;
    }

    public final int g() {
        return baa$.ExternalSyntheticApiModelOutline1.m(((defpackage.eae) this.a).a);
    }

    public final long h() {
        return baa$.ExternalSyntheticApiModelOutline1.m(((defpackage.eae) this.a).a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[LOOP:0: B:23:0x0047->B:34:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0080 A[EDGE_INSN: B:55:0x0080->B:35:0x0080 BREAK  A[LOOP:0: B:23:0x0047->B:34:0x007d], SYNTHETIC] */
    public final java.lang.Object i(defpackage.aowv aowvVar, defpackage.aomy aomyVar) {
        defpackage.cec cecVar;
        defpackage.aowv aowvVar2;
        int i;
        if (this.a == null) {
            defpackage.cdh.b("Called runAndWatch on a manager that has been disposed of");
        }
        java.lang.Object obj = this.a;
        if ((obj instanceof defpackage.cec) && (aowvVar2 = (cecVar = (defpackage.cec) obj).c) != null && !defpackage.aooh.n(aowvVar2, aowvVar)) {
            cco ccoVar = new cco();
            defpackage.aowv aowvVar3 = cecVar.c;
            if (aowvVar3 == null) {
                defpackage.cdh.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            defpackage.ady adyVar = cecVar.d;
            if (adyVar != null) {
                java.lang.Object[] objArr = adyVar.b;
                long[] jArr = adyVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    ccoVar.f(aowvVar3, objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            } else {
                java.lang.Object obj2 = cecVar.a;
                if (obj2 == null) {
                    defpackage.aooh.g();
                }
                ccoVar.f(aowvVar3, obj2);
            }
            ccoVar.c();
            cecVar.d();
            this.a = ccoVar;
        }
        java.lang.Object obj3 = this.a;
        if (obj3 == null) {
            defpackage.aooh.g();
        }
        defpackage.cee ceeVar = (defpackage.cee) obj3;
        defpackage.cko ckoVarB = defpackage.ckw.b().b(ceeVar.a(aowvVar));
        ceeVar.b(aowvVar);
        try {
            defpackage.cko ckoVarW = ckoVarB.w();
            try {
                java.lang.Object objA = aomyVar.a();
                defpackage.ckw.i.j(ckoVarW);
                ckoVarB.d();
                ceeVar.c();
                return objA;
            } catch (java.lang.Throwable th) {
                defpackage.ckw.i.j(ckoVarW);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            ckoVarB.d();
            throw th2;
        }
    }

    public aiyy(java.lang.Object obj) {
        this.a = obj;
    }

    public aiyy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = null;
    }

    public aiyy(char[] cArr, byte[] bArr) {
        this.a = new defpackage.rrw(null);
    }

    public aiyy(short[] sArr, byte[] bArr) {
        this.a = new defpackage.cec();
    }

    public aiyy() {
    }
}
