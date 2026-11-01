package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmv implements java.io.Closeable {
    public static final java.util.logging.Logger a;
    public final defpackage.appa b;
    private final defpackage.apmu c;
    private final defpackage.apmh d;

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.apmk.class.getName());
        defpackage.aooh.e(logger, "getLogger(...)");
        a = logger;
    }

    public apmv(defpackage.appa appaVar) {
        this.b = appaVar;
        defpackage.apmu apmuVar = new defpackage.apmu(appaVar);
        this.c = apmuVar;
        this.d = new defpackage.apmh(apmuVar);
    }

    private final java.util.List b(int i, int i2, int i3, int i4) throws java.io.IOException {
        defpackage.apmu apmuVar = this.c;
        apmuVar.c = i;
        apmuVar.d = i2;
        apmuVar.a = i3;
        apmuVar.b = i4;
        while (true) {
            defpackage.apmh apmhVar = this.d;
            defpackage.appa appaVar = apmhVar.d;
            if (appaVar.B()) {
                java.util.List list = apmhVar.b;
                java.util.List listBZ = defpackage.ajsz.bZ(list);
                list.clear();
                apmhVar.c = 0L;
                return listBZ;
            }
            byte bD = appaVar.d();
            int i5 = defpackage.apjv.a;
            int i6 = bD & 255;
            if (i6 == 128) {
                throw new java.io.IOException("index == 0");
            }
            if ((bD & 128) == 128) {
                int iB = apmhVar.b(i6, 127);
                int i7 = iB - 1;
                if (!defpackage.apmh.i(i7)) {
                    defpackage.apmg[] apmgVarArr = defpackage.apmj.a;
                    int length = defpackage.apmj.a.length;
                    int iA = apmhVar.a(iB - 62);
                    if (iA >= 0) {
                        defpackage.apmg[] apmgVarArr2 = apmhVar.e;
                        if (iA < apmgVarArr2.length) {
                            defpackage.apmg apmgVar = apmgVarArr2[iA];
                            if (apmgVar == null) {
                                defpackage.aooh.g();
                            }
                            apmhVar.e(apmgVar);
                        }
                    }
                    throw new java.io.IOException("Header index too large " + iB);
                }
                defpackage.apmg[] apmgVarArr3 = defpackage.apmj.a;
                apmhVar.e(defpackage.apmj.a[i7]);
            } else if (i6 == 64) {
                defpackage.apmg[] apmgVarArr4 = defpackage.apmj.a;
                defpackage.appb appbVarD = apmhVar.d();
                defpackage.apmj.a(appbVarD);
                apmhVar.h(new defpackage.apmg(appbVarD, apmhVar.d()));
            } else if ((bD & 64) == 64) {
                apmhVar.h(new defpackage.apmg(apmhVar.c(apmhVar.b(i6, 63) - 1), apmhVar.d()));
            } else if ((bD & 32) == 32) {
                int iB2 = apmhVar.b(i6, 31);
                apmhVar.a = iB2;
                if (iB2 < 0 || iB2 > 4096) {
                    throw new java.io.IOException(defpackage.a.bj(iB2, "Invalid dynamic table size update "));
                }
                int i8 = apmhVar.g;
                if (iB2 < i8) {
                    if (iB2 == 0) {
                        apmhVar.f();
                    } else {
                        apmhVar.g(i8 - iB2);
                    }
                }
            } else if (i6 == 16 || i6 == 0) {
                defpackage.apmg[] apmgVarArr5 = defpackage.apmj.a;
                defpackage.appb appbVarD2 = apmhVar.d();
                defpackage.apmj.a(appbVarD2);
                apmhVar.e(new defpackage.apmg(appbVarD2, apmhVar.d()));
            } else {
                apmhVar.e(new defpackage.apmg(apmhVar.c(apmhVar.b(i6, 15) - 1), apmhVar.d()));
            }
        }
    }

    private final void c() {
        defpackage.appa appaVar = this.b;
        appaVar.f();
        appaVar.d();
        int i = defpackage.apjv.a;
    }

    public final boolean a(boolean z, defpackage.apmr apmrVar) throws java.lang.Exception {
        boolean z2;
        defpackage.apoy apoyVar;
        long j;
        long j2;
        defpackage.apms apmsVar;
        defpackage.apmz apmzVarA;
        boolean z3;
        java.lang.Object[] array;
        try {
            this.b.z(9L);
            defpackage.appa appaVar = this.b;
            int iG = defpackage.apjv.g(appaVar);
            if (iG > 16384) {
                throw new java.io.IOException(defpackage.a.bj(iG, "FRAME_SIZE_ERROR: "));
            }
            int iD = appaVar.d() & 255;
            byte bD = appaVar.d();
            int i = bD & 255;
            int iF = appaVar.f();
            int i2 = iF & Integer.MAX_VALUE;
            boolean z4 = true;
            if (iD != 8) {
                java.util.logging.Logger logger = a;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    defpackage.appb appbVar = defpackage.apmk.a;
                    logger.fine(defpackage.apmk.b(true, i2, iG, iD, i));
                }
            }
            int i3 = 4;
            if (z && iD != 4) {
                defpackage.appb appbVar2 = defpackage.apmk.a;
                throw new java.io.IOException("Expected a SETTINGS frame but was ".concat(java.lang.String.valueOf(defpackage.apmk.a(iD))));
            }
            int i4 = 5;
            switch (iD) {
                case 0:
                    z4 = true;
                    if (i2 == 0) {
                        throw new java.io.IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    int i5 = bD & 1;
                    if ((bD & 32) != 0) {
                        throw new java.io.IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    iD = (bD & 8) != 0 ? appaVar.d() & 255 : 0;
                    int iAZ = defpackage.aoov.aZ(iG, i, iD);
                    defpackage.apms apmsVar2 = apmrVar.a;
                    if ((iF & 1) == 0) {
                        long j3 = iAZ;
                        defpackage.apoy apoyVar2 = new defpackage.apoy();
                        appaVar.z(j3);
                        appaVar.b(apoyVar2, j3);
                        apmsVar2.j.e(apmsVar2.d + '[' + i2 + "] onData", new apml(apmsVar2, i2, apoyVar2, iAZ));
                    } else {
                        defpackage.apmz apmzVarA2 = apmsVar2.a(i2);
                        if (apmzVarA2 == null) {
                            long j4 = iAZ;
                            apmsVar2.k(i2, defpackage.apme.PROTOCOL_ERROR);
                            apmsVar2.g(j4);
                            appaVar.A(j4);
                        } else {
                            java.util.TimeZone timeZone = defpackage.apjx.a;
                            long j5 = iAZ;
                            defpackage.apmx apmxVar = apmzVarA2.g;
                            defpackage.apmz apmzVar = apmxVar.f;
                            long j6 = j5;
                            while (true) {
                                if (j6 > 0) {
                                    synchronized (apmzVar) {
                                        z2 = apmxVar.b;
                                        apoyVar = apmxVar.d;
                                        j = apoyVar.b + j6;
                                        j2 = apmxVar.a;
                                    }
                                    if (j > j2) {
                                        appaVar.A(j6);
                                        apmxVar.f.h(defpackage.apme.FLOW_CONTROL_ERROR);
                                    } else if (z2) {
                                        appaVar.A(j6);
                                    } else {
                                        defpackage.apoy apoyVar3 = apmxVar.c;
                                        long jB = appaVar.b(apoyVar3, j6);
                                        if (jB == -1) {
                                            throw new java.io.EOFException();
                                        }
                                        j6 -= jB;
                                        synchronized (apmzVar) {
                                            if (apmxVar.e) {
                                                apoyVar3.y();
                                            } else {
                                                long j7 = apoyVar.b;
                                                apoyVar.M(apoyVar3);
                                                if (j7 == 0) {
                                                    apmzVar.notifyAll();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    apmxVar.c(j5);
                                    defpackage.apmz apmzVar2 = apmxVar.f;
                                    defpackage.apoy apoyVar4 = apmxVar.d;
                                }
                            }
                            if (i5 != 0) {
                                z4 = true;
                                apmzVarA2.i(defpackage.apiu.a, true);
                            } else {
                                z4 = true;
                            }
                        }
                    }
                    appaVar.A(iD);
                    return z4;
                case 1:
                    if (i2 == 0) {
                        throw new java.io.IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    int i6 = bD & 1;
                    int iD2 = (bD & 8) != 0 ? appaVar.d() & 255 : 0;
                    if ((bD & 32) != 0) {
                        c();
                        iG -= 5;
                    }
                    java.util.List listB = b(defpackage.aoov.aZ(iG, i, iD2), iD2, i, i2);
                    if (listB == null) {
                        defpackage.aooh.i("headerBlock");
                    }
                    defpackage.apms apmsVar3 = apmrVar.a;
                    int i7 = iF & 1;
                    if (i7 == 0) {
                        if (listB == null) {
                            defpackage.aooh.i("requestHeaders");
                        }
                        apmsVar3.j.e(apmsVar3.d + '[' + i2 + "] onHeaders", new defpackage.agsd(apmsVar3, i2, listB, i4));
                        z4 = true;
                    } else {
                        synchronized (apmsVar3) {
                            try {
                                apmzVarA = apmsVar3.a(i2);
                                z3 = 1 == i6;
                                if (apmzVarA == null) {
                                    if (apmsVar3.g || i2 <= apmsVar3.e || i7 == apmsVar3.f % 2) {
                                        apmsVar = apmsVar3;
                                    } else {
                                        apmsVar = apmsVar3;
                                        try {
                                            defpackage.apmz apmzVar3 = new defpackage.apmz(i2, apmsVar, false, z3, defpackage.apjx.g(listB));
                                            apmsVar.e = i2;
                                            apmsVar.c.put(java.lang.Integer.valueOf(i2), apmzVar3);
                                            apmsVar.h.b().e(apmsVar.d + '[' + i2 + "] onStream", new ahcm(apmsVar, apmzVar3, 13, (byte[]) null));
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                } else {
                                    z4 = true;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                apmsVar = apmsVar3;
                            }
                            break;
                        }
                        apmzVarA.i(defpackage.apjx.g(listB), z3);
                    }
                    return z4;
                case 2:
                    if (iG != 5) {
                        throw new java.io.IOException(defpackage.a.bs(iG, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i2 == 0) {
                        throw new java.io.IOException("TYPE_PRIORITY streamId == 0");
                    }
                    c();
                    z4 = true;
                    return z4;
                case 3:
                    if (iG != 4) {
                        throw new java.io.IOException(defpackage.a.bs(iG, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i2 == 0) {
                        throw new java.io.IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iF2 = appaVar.f();
                    defpackage.apme apmeVarBa = defpackage.aoov.ba(iF2);
                    if (apmeVarBa == null) {
                        throw new java.io.IOException(defpackage.a.bj(iF2, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    defpackage.apms apmsVar4 = apmrVar.a;
                    if ((iF & 1) == 0) {
                        apmsVar4.j.e(apmsVar4.d + '[' + i2 + "] onReset", new ahrx(apmsVar4, i2, 5));
                    } else {
                        defpackage.apmz apmzVarB = apmsVar4.b(i2);
                        if (apmzVarB != null) {
                            apmzVarB.j(apmeVarBa);
                        }
                    }
                    z4 = true;
                    return z4;
                case 4:
                    if (i2 != 0) {
                        throw new java.io.IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((bD & 1) == 0) {
                        if (iG % 6 != 0) {
                            throw new java.io.IOException(defpackage.a.bj(iG, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        defpackage.apnf apnfVar = new defpackage.apnf();
                        defpackage.aopo aopoVarB = defpackage.aooc.B(new defpackage.aopq(0, iG - 1), 6);
                        int i8 = aopoVarB.a;
                        int i9 = aopoVarB.b;
                        int i10 = aopoVarB.c;
                        if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                            while (true) {
                                char cW = (char) appaVar.w();
                                int iF3 = appaVar.f();
                                if (cW != 2) {
                                    if (cW != 4) {
                                        if (cW == 5 && (iF3 < 16384 || iF3 > 16777215)) {
                                            throw new java.io.IOException(defpackage.a.bj(iF3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        }
                                    } else if (iF3 < 0) {
                                        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                } else if (iF3 != 0 && iF3 != 1) {
                                    throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                apnfVar.g(cW, iF3);
                                if (i8 != i9) {
                                    i8 += i10;
                                }
                            }
                        }
                        defpackage.apms apmsVar5 = apmrVar.a;
                        apmsVar5.i.e(java.lang.String.valueOf(apmsVar5.d).concat(" applyAndAckSettings"), new defpackage.bev(apmrVar, apnfVar, 19, null));
                    } else if (iG != 0) {
                        throw new java.io.IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    z4 = true;
                    return z4;
                case 5:
                    if (i2 == 0) {
                        throw new java.io.IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    iD = (bD & 8) != 0 ? appaVar.d() & 255 : 0;
                    int iF4 = appaVar.f() & Integer.MAX_VALUE;
                    java.util.List listB2 = b(defpackage.aoov.aZ(iG - 4, i, iD), iD, i, i2);
                    if (listB2 == null) {
                        defpackage.aooh.i("requestHeaders");
                        defpackage.aooh.i("requestHeaders");
                    }
                    defpackage.apms apmsVar6 = apmrVar.a;
                    synchronized (apmsVar6) {
                        java.util.Set set = apmsVar6.w;
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF4);
                        if (set.contains(numValueOf)) {
                            apmsVar6.k(iF4, defpackage.apme.PROTOCOL_ERROR);
                        } else {
                            set.add(numValueOf);
                            apmsVar6.j.e(apmsVar6.d + '[' + iF4 + "] onRequest", new defpackage.agsd(apmsVar6, iF4, listB2, i3));
                        }
                    }
                    z4 = true;
                    return z4;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (iG != 8) {
                        throw new java.io.IOException(defpackage.a.bj(iG, "TYPE_PING length != 8: "));
                    }
                    if (i2 != 0) {
                        throw new java.io.IOException("TYPE_PING streamId != 0");
                    }
                    int i11 = bD & 1;
                    final int iF5 = appaVar.f();
                    final int iF6 = appaVar.f();
                    if (i11 != 0) {
                        defpackage.apms apmsVar7 = apmrVar.a;
                        synchronized (apmsVar7) {
                            try {
                                if (iF5 == 1) {
                                    apmsVar7.l++;
                                } else if (iF5 == 2) {
                                    apmsVar7.n++;
                                } else if (iF5 == 3) {
                                    apmsVar7.o++;
                                    apmsVar7.notifyAll();
                                }
                            } catch (java.lang.Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        final defpackage.apms apmsVar8 = apmrVar.a;
                        apmsVar8.i.e(java.lang.String.valueOf(apmsVar8.d).concat(" ping"), new defpackage.aomy() { // from class: apmq
                            @Override // defpackage.aomy
                            public final java.lang.Object a() {
                                apmsVar8.i(true, iF5, iF6);
                                return defpackage.aojh.a;
                            }
                        });
                    }
                    z4 = true;
                    return z4;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (iG < 8) {
                        throw new java.io.IOException(defpackage.a.bj(iG, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i2 != 0) {
                        throw new java.io.IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i12 = iG - 8;
                    int iF7 = appaVar.f();
                    int iF8 = appaVar.f();
                    if (defpackage.aoov.ba(iF8) == null) {
                        throw new java.io.IOException(defpackage.a.bj(iF8, "TYPE_GOAWAY unexpected error code: "));
                    }
                    defpackage.appb appbVarS = defpackage.appb.a;
                    if (i12 > 0) {
                        appbVarS = appaVar.s(i12);
                    }
                    if (appbVarS == null) {
                        defpackage.aooh.i("debugData");
                    }
                    appbVarS.c();
                    defpackage.apms apmsVar9 = apmrVar.a;
                    synchronized (apmsVar9) {
                        array = apmsVar9.c.values().toArray(new defpackage.apmz[0]);
                        apmsVar9.g = true;
                    }
                    for (defpackage.apmz apmzVar4 : (defpackage.apmz[]) array) {
                        int i13 = apmzVar4.a;
                        if (i13 > iF7 && apmzVar4.m()) {
                            apmzVar4.j(defpackage.apme.REFUSED_STREAM);
                            apmrVar.a.b(i13);
                        }
                    }
                    z4 = true;
                    return z4;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        if (iG != 4) {
                            throw new java.io.IOException(defpackage.a.bj(iG, "TYPE_WINDOW_UPDATE length !=4: "));
                        }
                        long jF = ((long) appaVar.f()) & 2147483647L;
                        if (jF == 0) {
                            throw new java.io.IOException("windowSizeIncrement was 0");
                        }
                        java.util.logging.Logger logger2 = a;
                        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                            defpackage.appb appbVar3 = defpackage.apmk.a;
                            logger2.fine(defpackage.apmk.c(true, i2, jF));
                        }
                        if (i2 == 0) {
                            defpackage.apms apmsVar10 = apmrVar.a;
                            synchronized (apmsVar10) {
                                apmsVar10.t += jF;
                                apmsVar10.notifyAll();
                            }
                        } else {
                            defpackage.apmz apmzVarA3 = apmrVar.a.a(i2);
                            if (apmzVarA3 != null) {
                                synchronized (apmzVarA3) {
                                    apmzVarA3.d(jF);
                                }
                            }
                        }
                        z4 = true;
                        return z4;
                    } catch (java.lang.Exception e) {
                        java.util.logging.Logger logger3 = a;
                        defpackage.appb appbVar4 = defpackage.apmk.a;
                        logger3.fine(defpackage.apmk.b(true, i2, iG, 8, i));
                        throw e;
                    }
                default:
                    z4 = true;
                    this.b.A(iG);
                    return z4;
            }
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
