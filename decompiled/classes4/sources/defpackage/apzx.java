package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apzx extends defpackage.apvs {
    private static final java.lang.String a = "apzx";
    private final java.util.concurrent.atomic.AtomicInteger b;
    private final defpackage.aqaa c;

    public apzx() {
        defpackage.aqaa aqaaVar = new defpackage.aqaa();
        this.b = new java.util.concurrent.atomic.AtomicInteger();
        this.c = aqaaVar;
    }

    private static int e(defpackage.apvp apvpVar) {
        defpackage.apvp apvpVar2 = defpackage.apvp.CRONET_SOURCE_UNSPECIFIED;
        int iOrdinal = apvpVar.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 0 : 4;
        }
        return 3;
    }

    @Override // defpackage.apvs
    public final long a() {
        long jNextLong = j$.util.concurrent.ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    @Override // defpackage.apvs
    public final void b(defpackage.apvo apvoVar) {
        int i;
        new xkn("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo", 3, (byte[]) null);
        try {
            long j = apvoVar.a;
            int i2 = apvoVar.h;
            defpackage.apvp apvpVar = defpackage.apvp.CRONET_SOURCE_UNSPECIFIED;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 != 0) {
                i = i3 != 1 ? 0 : 2;
            } else {
                i = 1;
            }
            int i4 = apvoVar.b;
            int iE = e(apvoVar.c);
            int iAN = anty.aN(apvoVar.d) - 1;
            defpackage.apvr apvrVar = apvoVar.e;
            int i5 = apvrVar.a;
            int i6 = apvrVar.b;
            int i7 = apvrVar.c;
            int i8 = apvrVar.d;
            defpackage.apvr apvrVar2 = apvoVar.f;
            int i9 = apvrVar2 == null ? -1 : apvrVar2.a;
            int i10 = apvrVar2 == null ? -1 : apvrVar2.b;
            int i11 = apvrVar2 != null ? apvrVar2.c : -1;
            int i12 = apvrVar2 == null ? -1 : apvrVar2.d;
            int i13 = apvoVar.g;
            android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(762);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.writeInt(i4);
            builderNewBuilder.writeInt(iE);
            builderNewBuilder.writeInt(iAN);
            builderNewBuilder.writeInt(i5);
            builderNewBuilder.writeInt(i6);
            builderNewBuilder.writeInt(i7);
            builderNewBuilder.writeInt(i8);
            builderNewBuilder.writeInt(i9);
            builderNewBuilder.writeInt(i10);
            builderNewBuilder.writeInt(i11);
            builderNewBuilder.writeInt(i12);
            builderNewBuilder.writeInt(i13);
            builderNewBuilder.addBooleanAnnotation((byte) 1, true);
            builderNewBuilder.usePooledBuffer();
            android.util.StatsLog.write(builderNewBuilder.build());
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            try {
                android.os.Trace.endSection();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.apvs
    public final void c(long j, defpackage.apvn apvnVar, defpackage.apvr apvrVar, defpackage.apvp apvpVar) throws java.lang.Throwable {
        long j2;
        java.lang.String str;
        int i;
        int i2;
        boolean z;
        java.lang.Object objCast;
        int i3 = 1;
        try {
            try {
                new xkn("CronetLoggerImpl#writeCronetEngineCreation", 3, (byte[]) null);
                try {
                    defpackage.apzy apzyVar = new defpackage.apzy(apvnVar.f);
                    int i4 = apvrVar.a;
                    int i5 = apvrVar.b;
                    int i6 = apvrVar.c;
                    int i7 = apvrVar.d;
                    int iOrdinal = apvpVar.ordinal();
                    if (iOrdinal == 0) {
                        i = 0;
                    } else if (iOrdinal == 1) {
                        i = 1;
                    } else if (iOrdinal == 2) {
                        i = 2;
                    } else if (iOrdinal == 3) {
                        i = 3;
                    } else if (iOrdinal == 4) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    boolean z2 = apvnVar.d;
                    boolean z3 = apvnVar.c;
                    int i8 = apvnVar.e;
                    if (i8 == 0) {
                        i2 = 0;
                    } else if (i8 != 1) {
                        i3 = i8 != 2 ? 4 : 3;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        i3 = 2;
                    }
                    boolean z4 = apvnVar.a;
                    boolean z5 = apvnVar.b;
                    boolean z6 = apvnVar.g;
                    java.lang.String string = (java.lang.String) apzyVar.f("QUIC", "connection_options", null, java.lang.String.class);
                    if (defpackage.apzy.h(string)) {
                        z = z4;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.String[] strArrSplit = string.split(",", -1);
                        int length = strArrSplit.length;
                        int i9 = i2;
                        while (i9 < length) {
                            int i10 = i9;
                            java.lang.String str2 = strArrSplit[i10];
                            int i11 = length;
                            boolean z7 = z4;
                            if (defpackage.apzy.b.contains(str2.toUpperCase(java.util.Locale.ROOT).trim())) {
                                arrayList.add(str2);
                            }
                            i9 = i10 + 1;
                            length = i11;
                            z4 = z7;
                        }
                        z = z4;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.util.Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((java.lang.CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    sb.append((java.lang.CharSequence) ",");
                                }
                            }
                        }
                        string = sb.toString();
                    }
                    java.lang.String str3 = string;
                    int iAN = anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "store_server_configs_in_properties", null, java.lang.Boolean.class)) - 1;
                    int iB = apzyVar.b();
                    int iA = apzyVar.a();
                    int iAN2 = anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "goaway_sessions_on_ip_change", null, java.lang.Boolean.class)) - 1;
                    int iAN3 = anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "close_sessions_on_ip_change", null, java.lang.Boolean.class)) - 1;
                    int iK = apzyVar.k() - 1;
                    int iJ = apzyVar.j() - 1;
                    int iAN4 = anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "disable_bidirectional_streams", null, java.lang.Boolean.class)) - 1;
                    int iIntValue = ((java.lang.Integer) apzyVar.f("QUIC", "max_time_before_crypto_handshake_seconds", -1, java.lang.Integer.class)).intValue();
                    int iIntValue2 = ((java.lang.Integer) apzyVar.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, java.lang.Integer.class)).intValue();
                    int iAN5 = anty.aN((java.lang.Boolean) apzyVar.f("QUIC", "enable_socket_recv_optimization", null, java.lang.Boolean.class)) - 1;
                    int i12 = apzyVar.i() - 1;
                    int iM = apzyVar.m() - 1;
                    int iC = apzyVar.c();
                    int iD = apzyVar.d();
                    int iIntValue3 = ((java.lang.Integer) apzyVar.f("StaleDNS", "max_stale_uses", -1, java.lang.Integer.class)).intValue();
                    int iL = apzyVar.l() - 1;
                    int iN = apzyVar.n() - 1;
                    int iE = apzyVar.e();
                    int iO = apzyVar.o() - 1;
                    if (apzyVar.c.length() != 0) {
                        try {
                            objCast = java.lang.Boolean.class.cast(apzyVar.c.get("disable_ipv6_on_wifi"));
                        } catch (java.lang.ClassCastException | org.json.JSONException e) {
                            java.lang.String str4 = defpackage.apzy.a;
                            if (android.util.Log.isLoggable(str4, 2)) {
                                java.lang.String message = e.getMessage();
                                java.lang.Object[] objArr = new java.lang.Object[2];
                                objArr[i2] = "disable_ipv6_on_wifi";
                                objArr[1] = message;
                                aodc.r(str4, "Failed to get %s options: %s", objArr);
                            }
                            objCast = null;
                        }
                    } else {
                        objCast = null;
                    }
                    int iAN6 = anty.aN((java.lang.Boolean) objCast) - 1;
                    long j3 = apvnVar.h;
                    int iMyUid = android.os.Process.myUid();
                    android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
                    builderNewBuilder.setAtomId(703);
                    j2 = j;
                    try {
                        builderNewBuilder.writeLong(j2);
                        builderNewBuilder.writeInt(i4);
                        builderNewBuilder.writeInt(i5);
                        builderNewBuilder.writeInt(i6);
                        builderNewBuilder.writeInt(i7);
                        builderNewBuilder.writeInt(i);
                        builderNewBuilder.writeBoolean(z2);
                        builderNewBuilder.writeBoolean(z3);
                        builderNewBuilder.writeInt(i3);
                        builderNewBuilder.writeBoolean(z);
                        builderNewBuilder.writeBoolean(z5);
                        builderNewBuilder.writeBoolean(z6);
                        builderNewBuilder.writeInt(i2);
                        builderNewBuilder.writeString(str3);
                        builderNewBuilder.writeInt(iAN);
                        builderNewBuilder.writeInt(iB);
                        builderNewBuilder.writeInt(iA);
                        builderNewBuilder.writeInt(iAN2);
                        builderNewBuilder.writeInt(iAN3);
                        builderNewBuilder.writeInt(iK);
                        builderNewBuilder.writeInt(iJ);
                        builderNewBuilder.writeInt(iAN4);
                        builderNewBuilder.writeInt(iIntValue);
                        builderNewBuilder.writeInt(iIntValue2);
                        builderNewBuilder.writeInt(iAN5);
                        builderNewBuilder.writeInt(i12);
                        builderNewBuilder.writeInt(iM);
                        builderNewBuilder.writeInt(iC);
                        builderNewBuilder.writeInt(iD);
                        builderNewBuilder.writeInt(iIntValue3);
                        builderNewBuilder.writeInt(iL);
                        builderNewBuilder.writeInt(iN);
                        builderNewBuilder.writeInt(iE);
                        builderNewBuilder.writeInt(iO);
                        builderNewBuilder.writeInt(iAN6);
                        builderNewBuilder.writeLong(j3);
                        builderNewBuilder.writeInt(iMyUid);
                        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
                        builderNewBuilder.usePooledBuffer();
                        android.util.StatsLog.write(builderNewBuilder.build());
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        java.lang.Throwable th2 = th;
                        try {
                            android.os.Trace.endSection();
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    j2 = j;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                j2 = j;
                str = a;
                if (android.util.Log.isLoggable(str, 3)) {
                    aodc.q(str, java.lang.String.format("Failed to log CronetEngine:%s creation: %s", java.lang.Long.valueOf(j2), e.getMessage()), new java.lang.Object[0]);
                }
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            str = a;
            if (android.util.Log.isLoggable(str, 3)) {
                aodc.q(str, java.lang.String.format("Failed to log CronetEngine:%s creation: %s", java.lang.Long.valueOf(j2), e.getMessage()), new java.lang.Object[0]);
            }
        }
    }

    @Override // defpackage.apvs
    public final void d(long j, defpackage.apvq apvqVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bytes;
        defpackage.aqaa aqaaVar = this.c;
        synchronized (aqaaVar.a) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (aqaaVar.c + 1000 <= jElapsedRealtime) {
                aqaaVar.b = 1;
                aqaaVar.c = jElapsedRealtime;
            } else {
                if (aqaaVar.b > 0) {
                    this.b.incrementAndGet();
                    return;
                }
                aqaaVar.b = 1;
            }
            int andSet = this.b.getAndSet(0);
            new xkn("CronetLoggerImpl#writeCronetTrafficReported", 3, (byte[]) null);
            try {
                long j2 = apvqVar.a;
                anty.aL(j2, "Request header size is negative");
                double d = j2 / 1024.0d;
                if (anty.aM(d, 0, 1)) {
                    i = 1;
                } else if (anty.aM(d, 1, 10)) {
                    i = 2;
                } else if (anty.aM(d, 10, 25)) {
                    i = 3;
                } else if (anty.aM(d, 25, 50)) {
                    i = 4;
                } else {
                    i = anty.aM(d, 50, 100) ? 5 : 6;
                }
                anty.aL(-1L, "Request body size is negative");
                if (anty.aM(-9.765625E-4d, 10, 50)) {
                    i2 = 3;
                } else if (anty.aM(-9.765625E-4d, 50, 200)) {
                    i2 = 4;
                } else if (anty.aM(-9.765625E-4d, 200, 500)) {
                    i2 = 5;
                } else if (anty.aM(-9.765625E-4d, 500, 1000)) {
                    i2 = 6;
                } else {
                    i2 = anty.aM(-9.765625E-4d, 1000, 5000) ? 7 : 8;
                }
                long j3 = apvqVar.b;
                anty.aL(j3, "Response header size is negative");
                double d2 = j3 / 1024.0d;
                if (anty.aM(d2, 0, 1)) {
                    i3 = 1;
                } else if (anty.aM(d2, 1, 10)) {
                    i3 = 2;
                } else if (anty.aM(d2, 10, 25)) {
                    i3 = 3;
                } else if (anty.aM(d2, 25, 50)) {
                    i3 = 4;
                } else {
                    i3 = anty.aM(d2, 50, 100) ? 5 : 6;
                }
                long j4 = apvqVar.c;
                anty.aL(j4, "Response body size is negative");
                double d3 = j4 / 1024.0d;
                if (d3 == 0.0d) {
                    i4 = 1;
                } else if (d3 > 0.0d && d3 < 10.0d) {
                    i4 = 2;
                } else if (anty.aM(d3, 10, 50)) {
                    i4 = 3;
                } else if (anty.aM(d3, 50, 200)) {
                    i4 = 4;
                } else if (anty.aM(d3, 200, 500)) {
                    i4 = 5;
                } else if (anty.aM(d3, 500, 1000)) {
                    i4 = 6;
                } else {
                    i4 = anty.aM(d3, 1000, 5000) ? 7 : 8;
                }
                int i6 = apvqVar.d;
                java.lang.String str = apvqVar.f;
                java.security.MessageDigest messageDigest = defpackage.apzz.a;
                long j5 = 0;
                if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                    j5 = java.nio.ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                }
                int millis = (int) apvqVar.e.toMillis();
                int i7 = apvqVar.m;
                defpackage.apvp apvpVar = defpackage.apvp.CRONET_SOURCE_UNSPECIFIED;
                int i8 = i7 - 1;
                if (i8 != 0) {
                    i5 = i8 != 1 ? 3 : 2;
                } else {
                    i5 = 1;
                }
                int i9 = apvqVar.g;
                int i10 = apvqVar.h;
                int i11 = apvqVar.i;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                int iAN = anty.aN(bool) - 1;
                int iAN2 = anty.aN(java.lang.Boolean.valueOf(apvqVar.j)) - 1;
                int i12 = apvqVar.k;
                int iAN3 = anty.aN(bool) - 1;
                int iE = e(apvqVar.l);
                int iAN4 = anty.aN((java.lang.Boolean) null) - 1;
                int iAN5 = anty.aN(bool) - 1;
                android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
                builderNewBuilder.setAtomId(704);
                builderNewBuilder.writeLong(j);
                builderNewBuilder.writeInt(i);
                builderNewBuilder.writeInt(i2);
                builderNewBuilder.writeInt(i3);
                builderNewBuilder.writeInt(i4);
                builderNewBuilder.writeInt(i6);
                builderNewBuilder.writeLong(j5);
                builderNewBuilder.writeInt(-1);
                builderNewBuilder.writeInt(millis);
                builderNewBuilder.writeBoolean(false);
                builderNewBuilder.writeBoolean(false);
                builderNewBuilder.writeInt(andSet);
                builderNewBuilder.writeInt(i5);
                builderNewBuilder.writeInt(i9);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeInt(i10);
                builderNewBuilder.writeInt(i11);
                builderNewBuilder.writeInt(iAN);
                builderNewBuilder.writeInt(iAN2);
                builderNewBuilder.writeInt(i12);
                builderNewBuilder.addBooleanAnnotation((byte) 1, true);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeInt(iAN3);
                builderNewBuilder.writeString("156.0.8078.39");
                builderNewBuilder.writeInt(iE);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeLong(-1L);
                builderNewBuilder.writeInt(iAN4);
                builderNewBuilder.writeInt(iAN5);
                builderNewBuilder.usePooledBuffer();
                android.util.StatsLog.write(builderNewBuilder.build());
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th) {
                try {
                    android.os.Trace.endSection();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }
}
