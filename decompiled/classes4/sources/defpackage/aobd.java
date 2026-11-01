package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aobd implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aobd(aobe aobeVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobeVar);
        this.a = aobeVar;
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map allHeaders;
        java.lang.String str;
        int i;
        long length;
        long j;
        int i2;
        int i3 = 2;
        switch (this.$cid) {
            case 0:
                aobe aobeVar = (aobe) this.a;
                if (!aobeVar.e) {
                    aobeVar.f = null;
                    return;
                }
                long jA = aobeVar.a();
                if (aobeVar.d - jA > 0) {
                    aobeVar.f = aobeVar.a.schedule(new defpackage.aobd(aobeVar, 2, (byte[]) null), aobeVar.d - jA, java.util.concurrent.TimeUnit.NANOSECONDS);
                    return;
                }
                aobeVar.e = false;
                aobeVar.f = null;
                aobeVar.c.run();
                return;
            case 1:
                ((defpackage.anon) this.a).c();
                return;
            case 2:
                aobe aobeVar2 = (aobe) this.a;
                aobeVar2.b.execute(new defpackage.aobd(aobeVar2, 0));
                return;
            case 3:
                defpackage.aobu aobuVar = ((defpackage.aobg) this.a).g;
                aobuVar.A = true;
                defpackage.anvr anvrVar = aobuVar.w;
                vqy vqyVar = aobuVar.F;
                anvrVar.a((anqw) vqyVar.b, (defpackage.anvq) vqyVar.c, (anph) vqyVar.a);
                return;
            case 4:
                defpackage.aobu aobuVar2 = (defpackage.aobu) this.a;
                if (aobuVar2.A) {
                    return;
                }
                aobuVar2.w.e();
                return;
            case 5:
                defpackage.aobu aobuVar3 = ((defpackage.aobr) this.a).b;
                aobuVar3.A = true;
                defpackage.anvr anvrVar2 = aobuVar3.w;
                vqy vqyVar2 = aobuVar3.F;
                anvrVar2.a((anqw) vqyVar2.b, (defpackage.anvq) vqyVar2.c, (anph) vqyVar2.a);
                return;
            case 6:
                defpackage.aobu aobuVar4 = ((defpackage.aobr) this.a).b;
                if (aobuVar4.A) {
                    return;
                }
                aobuVar4.w.e();
                return;
            case 7:
                ((anpv) this.a).b();
                return;
            case 8:
                ((defpackage.aocs) this.a).c.f(anqw.c.f("Handshake timeout exceeded"));
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                try {
                    java.lang.Object obj = this.a;
                    apqb apqbVar = ((defpackage.aoer) obj).f;
                    if (apqbVar != null) {
                        apoy apoyVar = ((defpackage.aoer) obj).b;
                        long j2 = apoyVar.b;
                        if (j2 > 0) {
                            apqbVar.fQ(apoyVar, j2);
                        }
                    }
                } catch (java.io.IOException e) {
                    ((defpackage.aoer) this.a).c.e(e);
                }
                try {
                    apqb apqbVar2 = ((defpackage.aoer) this.a).f;
                    if (apqbVar2 != null) {
                        apqbVar2.close();
                    }
                } catch (java.io.IOException e2) {
                    ((defpackage.aoer) this.a).c.e(e2);
                }
                try {
                    java.net.Socket socket = ((defpackage.aoer) this.a).g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (java.io.IOException e3) {
                    ((defpackage.aoer) this.a).c.e(e3);
                    return;
                }
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.anuv anuvVar = (defpackage.anuv) this.a;
                anuw anuwVar = anuvVar.b;
                java.util.concurrent.atomic.AtomicLong atomicLong = anuwVar.c;
                long j3 = anuvVar.a;
                long jMax = java.lang.Math.max(j3 << 1, j3);
                if (atomicLong.compareAndSet(j3, jMax)) {
                    anuw.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new java.lang.Object[]{anuwVar.b, java.lang.Long.valueOf(jMax)});
                    return;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                java.lang.Object obj2 = this.a;
                synchronized (((defpackage.aofk) obj2).m) {
                    ((defpackage.aofk) obj2).z = Integer.MAX_VALUE;
                    ahvr.bZ(((defpackage.aofk) obj2).A.isEmpty(), "Pending streams detected during transport start. RPCs should not be started before transport is ready.");
                    break;
                }
                defpackage.aofk aofkVar = (defpackage.aofk) this.a;
                aofkVar.o.execute(aofkVar.q);
                return;
            case 12:
                java.lang.Thread.currentThread().setName("JavaCronetEngine");
                android.os.Process.setThreadPriority(0);
                this.a.run();
                return;
            case 13:
                ((defpackage.apwe) this.a).g++;
                return;
            case 14:
                defpackage.apwm apwmVar = (defpackage.apwm) this.a;
                defpackage.apwe apweVar = apwmVar.y;
                if (apweVar != null) {
                    try {
                        apweVar.e();
                    } catch (java.io.IOException e4) {
                        android.util.Log.e("cn_".concat(java.lang.String.valueOf(defpackage.apwm.a)), "Exception when closing OutputChannel", e4);
                    }
                    break;
                }
                java.net.HttpURLConnection httpURLConnection = apwmVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    apwmVar.q = null;
                    return;
                }
                return;
            case 15:
                defpackage.apwm apwmVar2 = (defpackage.apwm) this.a;
                apwmVar2.f.add(apwmVar2.m);
                apwmVar2.h();
                return;
            case 16:
                defpackage.apwm apwmVar3 = (defpackage.apwm) this.a;
                java.nio.channels.ReadableByteChannel readableByteChannel = apwmVar3.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                        break;
                    } catch (java.io.IOException e5) {
                        e5.printStackTrace();
                    }
                    apwmVar3.n = null;
                    return;
                }
                return;
            case 17:
                ((defpackage.apwm) this.a).w++;
                return;
            case 18:
                defpackage.apwm apwmVar4 = (defpackage.apwm) this.a;
                apwmVar4.m = apwmVar4.p;
                apwmVar4.p = null;
                apwmVar4.h();
                return;
            case 19:
                java.lang.Object obj3 = this.a;
                try {
                    defpackage.apwm apwmVar5 = ((defpackage.apwk) obj3).d;
                    defpackage.apvs apvsVar = apwmVar5.t;
                    long j4 = apwmVar5.s;
                    defpackage.apwu apwuVar = apwmVar5.o;
                    if (apwuVar != null) {
                        allHeaders = apwuVar.getAllHeaders();
                        defpackage.apwu apwuVar2 = apwmVar5.o;
                        str = apwuVar2.b;
                        i = apwuVar2.a;
                    } else {
                        allHeaders = java.util.Collections.EMPTY_MAP;
                        str = "";
                        i = 0;
                    }
                    java.lang.String str2 = str;
                    long length2 = 0;
                    for (java.util.Map.Entry entry : apwmVar5.e.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry.getKey();
                        if (str3 != null) {
                            length2 += (long) str3.length();
                        }
                        java.lang.String str4 = (java.lang.String) entry.getValue();
                        if (str4 != null) {
                            length2 += (long) str4.length();
                        }
                    }
                    if (allHeaders == null) {
                        length = 0;
                    } else {
                        length = 0;
                        for (java.util.Map.Entry entry2 : allHeaders.entrySet()) {
                            java.lang.String str5 = (java.lang.String) entry2.getKey();
                            if (str5 != null) {
                                length += (long) str5.length();
                            }
                            if (entry2.getValue() != null) {
                                for (java.lang.String str6 : (java.util.List) entry2.getValue()) {
                                    if (str6 != null) {
                                        length += (long) str6.length();
                                    }
                                }
                            }
                        }
                    }
                    if (allHeaders.containsKey("Content-Length")) {
                        try {
                            j = java.lang.Long.parseLong((java.lang.String) ((java.util.List) allHeaders.get("Content-Length")).get(0));
                        } catch (java.lang.NumberFormatException unused) {
                            j = 0;
                        }
                        break;
                    } else {
                        j = -1;
                    }
                    j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(0L);
                    defpackage.apwm apwmVar6 = ((defpackage.apwk) obj3).d;
                    int i4 = apwmVar6.g.get();
                    if (i4 == 6) {
                        i2 = i3;
                    } else if (i4 == 7) {
                        i2 = 1;
                    } else {
                        if (i4 != 8) {
                            throw new java.lang.IllegalStateException(a.bs(i4, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i3 = 3;
                        i2 = i3;
                    }
                    int i5 = apwmVar6.w;
                    int i6 = apwmVar6.v;
                    defpackage.apwe apweVar2 = apwmVar6.y;
                    apvsVar.d(j4, new defpackage.apvq(length2, length, j, i, durationOfSeconds, str2, i2, i5, i6, apweVar2 != null ? apweVar2.g : 0, apwmVar6.x, android.os.Process.myUid(), defpackage.apvp.CRONET_SOURCE_FALLBACK));
                    return;
                } catch (java.lang.RuntimeException e6) {
                    android.util.Log.i("cn_".concat(java.lang.String.valueOf(defpackage.apwm.a)), "Error while trying to log CronetTrafficInfo: ", e6);
                    return;
                }
            default:
                ((defpackage.apwl) this.a).a();
                return;
        }
    }

    public /* synthetic */ aobd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public aobd(aobe aobeVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobeVar);
        this.a = aobeVar;
    }

    public aobd(defpackage.aobg aobgVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobgVar);
        this.a = aobgVar;
    }

    public aobd(defpackage.aobu aobuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobuVar);
        this.a = aobuVar;
    }

    public aobd(defpackage.aobr aobrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobrVar);
        this.a = aobrVar;
    }

    public aobd(defpackage.aobr aobrVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobrVar);
        this.a = aobrVar;
    }

    public aobd(aoby aobyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aobyVar);
        this.a = aobyVar;
    }

    public aobd(defpackage.aocs aocsVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aocsVar);
        this.a = aocsVar;
    }

    public aobd(defpackage.aoer aoerVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aoerVar);
        this.a = aoerVar;
    }

    public aobd(aoez aoezVar, defpackage.anuv anuvVar, int i) {
        this.$cid = i;
        this.a = anuvVar;
        j$.util.Objects.requireNonNull(aoezVar);
    }

    public aobd(defpackage.aofk aofkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aofkVar);
        this.a = aofkVar;
    }

    public aobd(ibm ibmVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.a = runnable;
        j$.util.Objects.requireNonNull(ibmVar);
    }

    public aobd(defpackage.apwm apwmVar, int i, int[] iArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(apwmVar);
        this.a = apwmVar;
    }
}
