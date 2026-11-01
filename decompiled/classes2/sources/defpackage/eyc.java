package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyc extends defpackage.epw implements androidx.media3.exoplayer.ExoPlayer {
    public static final /* synthetic */ int C = 0;
    public final defpackage.hjx A;
    public final defpackage.hjx B;
    private final defpackage.ezf[] D;
    private final defpackage.ezf[] E;
    private final defpackage.fim F;
    private final java.util.concurrent.CopyOnWriteArraySet G;
    private final defpackage.erk H;
    private final boolean I;
    private final defpackage.fft J;
    private final defpackage.fip K;
    private final defpackage.exy L;
    private final defpackage.exz M;
    private final defpackage.eup N;
    private final long O;
    private final defpackage.eyb P;
    private boolean Q;
    private aihd R;
    private defpackage.ezj S;
    private defpackage.ezk T;
    private defpackage.exp U;
    private int V;
    private defpackage.ety W;
    private defpackage.epu X;
    private boolean Y;
    private boolean Z;
    private int aa;
    private long ab;
    private final defpackage.iay ac;
    private final defpackage.agze ad;
    private final defpackage.agze ae;
    private izg af;
    private final rai ag;
    final defpackage.fin b;
    final defpackage.ere c;
    public final android.content.Context d;
    public final defpackage.eri e;
    public final defpackage.etk f;
    public final defpackage.eyj g;
    public final defpackage.eto h;
    public final java.util.List i;
    public final android.os.Looper j;
    public final defpackage.etc k;
    public final defpackage.etb l;
    public int m;
    public int n;
    public boolean o;
    public defpackage.ere p;
    public defpackage.eqw q;
    public java.lang.Object r;
    public android.view.Surface s;
    public boolean t;
    public boolean u;
    public defpackage.eqw v;
    public defpackage.eza w;
    public int x;
    public long y;
    public final defpackage.ezv z;

    static {
        defpackage.equ.b("media3.exoplayer");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [fdz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [fek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [epw, eri, eyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eri, eyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v15, types: [fft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [fip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [fek, java.lang.Object] */
    public eyc(defpackage.exo exoVar) throws java.lang.Throwable {
        boolean z;
        defpackage.eyb eybVar;
        final defpackage.eyc epwVar = new defpackage.epw();
        epwVar.ae = new defpackage.agze(null);
        try {
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(epwVar));
            java.lang.String str = eum.a;
            boolean z2 = defpackage.eqe.a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("[Canary:");
            sb.append(true != defpackage.eqe.a ? "OFF" : "ON");
            int[] iArrC = defpackage.eqe.c(true);
            int[] iArrC2 = defpackage.eqe.c(false);
            int length = iArrC.length;
            if (length > 0 || iArrC2.length > 0) {
                sb.append(", Overrides:");
                if (length > 0) {
                    sb.append(" enabled=");
                    defpackage.eqe.a(sb, iArrC);
                    if (iArrC2.length > 0) {
                        sb.append(',');
                    }
                }
                if (iArrC2.length > 0) {
                    sb.append(" disabled=");
                    defpackage.eqe.a(sb, iArrC2);
                }
            }
            sb.append(']');
            defpackage.etr.e("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.11.1] [" + str + "] " + sb.toString());
            epwVar.d = exoVar.b.getApplicationContext();
            epwVar.z = (defpackage.ezv) exoVar.h.apply(exoVar.c);
            epwVar.aa = -1000;
            epwVar.X = exoVar.j;
            epwVar.V = 1;
            epwVar.t = false;
            epwVar.O = 2000L;
            defpackage.exy exyVar = new defpackage.exy(epwVar);
            epwVar.L = exyVar;
            epwVar.M = new defpackage.exz();
            android.os.Handler handler = new android.os.Handler(exoVar.i);
            java.lang.Object objEZ = exoVar.d.eZ();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object obj = ((izg) objEZ).b;
            ?? r8 = ((izg) objEZ).c;
            defpackage.fjn fjnVar = new defpackage.fjn((android.content.Context) obj);
            ?? r14 = ((izg) objEZ).a;
            fjnVar.d = r14;
            fjnVar.c = r8;
            fjnVar.e = 5000L;
            fjnVar.f = handler;
            fjnVar.j = exyVar;
            fjnVar.g = 50;
            fjnVar.h = 15000L;
            fjnVar.i = 50000L;
            ahvr.bY(!fjnVar.b);
            android.os.Handler handler2 = fjnVar.f;
            defpackage.exy exyVar2 = fjnVar.j;
            if (handler2 == null) {
                if (exyVar2 != null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (exyVar2 != null) {
                z = true;
            } else {
                z = false;
            }
            ahvr.bY(z);
            fjnVar.b = true;
            arrayList.add(new defpackage.fjo(fjnVar));
            defpackage.fbt fbtVar = new defpackage.fbt((android.content.Context) obj);
            ahvr.bY(!fbtVar.c);
            fbtVar.c = true;
            if (fbtVar.g == null) {
                fbtVar.g = new izg(new defpackage.esj[0]);
            }
            defpackage.fax faxVar = fbtVar.e;
            defpackage.hjx hjxVar = fbtVar.f;
            if (faxVar == null) {
                if (hjxVar == null) {
                    fbtVar.f = new defpackage.hjx(fbtVar.a);
                }
                if (fbtVar.d == null) {
                    fbtVar.d = defpackage.fbs.a;
                }
                android.content.Context context = fbtVar.a;
                defpackage.fbo fboVar = new defpackage.fbo(context);
                defpackage.fai faiVar = context != null ? null : fbtVar.b;
                java.lang.Object obj2 = fboVar.a;
                if (obj2 == null) {
                    fboVar.c = faiVar;
                }
                fboVar.d = fbtVar.f;
                fboVar.b = fbtVar.d;
                if (fboVar.d == null) {
                    fboVar.d = new defpackage.hjx((android.content.Context) obj2);
                }
                fbtVar.e = new defpackage.fbp(fboVar);
            } else {
                ahvr.bY(hjxVar == null);
                ahvr.bY(fbtVar.d == null);
            }
            arrayList.add(new defpackage.fca((android.content.Context) obj, r14, ((izg) objEZ).c, handler, exyVar, new defpackage.fbw(fbtVar)));
            arrayList.add(new defpackage.fhp(exyVar, handler.getLooper()));
            android.os.Looper looper = handler.getLooper();
            for (int i = 0; i < 4; i++) {
                arrayList.add(new defpackage.fev(exyVar, looper));
            }
            arrayList.add(new defpackage.fkn());
            arrayList.add(new defpackage.fdo(new defpackage.oq((android.content.Context) obj, (char[]) null)));
            defpackage.ezf[] ezfVarArr = (defpackage.ezf[]) arrayList.toArray(new defpackage.ezf[0]);
            epwVar.D = ezfVarArr;
            ahvr.bY(ezfVarArr.length > 0);
            epwVar.E = new defpackage.ezf[ezfVarArr.length];
            int i2 = 0;
            while (true) {
                defpackage.ezf[] ezfVarArr2 = epwVar.E;
                if (i2 >= ezfVarArr2.length) {
                    break;
                }
                epwVar.D[i2].dG();
                ezfVarArr2[i2] = null;
                i2++;
                epwVar.ae.g();
                throw th;
            }
            defpackage.fim fimVar = (defpackage.fim) exoVar.f.eZ();
            epwVar.F = fimVar;
            epwVar.J = ((defpackage.exm) exoVar.e).a;
            ?? EZ = exoVar.g.eZ();
            epwVar.K = EZ;
            epwVar.I = true;
            epwVar.T = exoVar.k;
            epwVar.S = exoVar.l;
            android.os.Looper looper2 = exoVar.i;
            epwVar.j = looper2;
            defpackage.etc etcVar = exoVar.c;
            epwVar.k = etcVar;
            epwVar.e = epwVar;
            epwVar.ab = -9223372036854775807L;
            epwVar.h = new defpackage.eto(new java.util.concurrent.CopyOnWriteArraySet(), looper2, looper2.getThread(), etcVar, new defpackage.etm() { // from class: exs
                @Override // defpackage.etm
                public final void a(java.lang.Object obj3, defpackage.eqd eqdVar) {
                    ((erg) obj3).M(this.a.e, new defpackage.erf(eqdVar));
                }
            }, true);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            epwVar.G = copyOnWriteArraySet;
            epwVar.i = new java.util.ArrayList();
            epwVar.af = new izg();
            epwVar.U = defpackage.exp.a;
            int length2 = epwVar.D.length;
            defpackage.fin finVar = new defpackage.fin(new defpackage.ezh[length2], new defpackage.fii[length2], defpackage.ert.a, null);
            epwVar.b = finVar;
            epwVar.H = new defpackage.erk();
            int i3 = defpackage.erd.a;
            ygq ygqVar = new ygq((byte[]) null);
            ygqVar.i(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32});
            defpackage.erd.c(29, true, ygqVar);
            defpackage.ere ereVarA = defpackage.erd.a(ygqVar);
            epwVar.c = ereVarA;
            ygq ygqVar2 = new ygq((byte[]) null);
            defpackage.erd.b(ereVarA, ygqVar2);
            ygqVar2.h(4);
            ygqVar2.h(10);
            epwVar.p = defpackage.erd.a(ygqVar2);
            epwVar.f = etcVar.b(looper2, null);
            rai raiVar = new rai((java.lang.Object) epwVar);
            epwVar.ag = raiVar;
            epwVar.w = defpackage.eza.j(finVar);
            final defpackage.ezv ezvVar = epwVar.z;
            ahvr.bY(ezvVar.e == null || ezvVar.b.b.isEmpty());
            ahvr.ci((java.lang.Object) epwVar);
            ezvVar.e = epwVar;
            defpackage.etc etcVar2 = ezvVar.a;
            ezvVar.f = etcVar2.b(looper2, null);
            defpackage.eto etoVar = ezvVar.d;
            ezvVar.d = new defpackage.eto(etoVar.c, looper2, looper2.getThread(), etcVar2, new defpackage.etm() { // from class: ezo
                /* JADX WARN: Code duplicated, block: B:140:0x0211  */
                /* JADX WARN: Code duplicated, block: B:141:0x0214  */
                /* JADX WARN: Code duplicated, block: B:143:0x0218  */
                /* JADX WARN: Code duplicated, block: B:144:0x0223  */
                /* JADX WARN: Code duplicated, block: B:146:0x0229  */
                /* JADX WARN: Code duplicated, block: B:147:0x022f  */
                /* JADX WARN: Code duplicated, block: B:149:0x0233 A[PHI: r10
                  0x0233: PHI (r10v5 int) = (r10v1 int), (r10v2 int), (r10v2 int), (r10v10 int), (r10v10 int) binds: [B:148:0x0231, B:133:0x0204, B:134:0x0206, B:109:0x01b5, B:111:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:150:0x0235  */
                /* JADX WARN: Code duplicated, block: B:152:0x0239  */
                /* JADX WARN: Code duplicated, block: B:154:0x023f  */
                /* JADX WARN: Code duplicated, block: B:156:0x0243  */
                /* JADX WARN: Code duplicated, block: B:157:0x024a  */
                /* JADX WARN: Code duplicated, block: B:159:0x024e  */
                /* JADX WARN: Code duplicated, block: B:160:0x0259  */
                /* JADX WARN: Code duplicated, block: B:170:0x02a9  */
                /* JADX WARN: Code duplicated, block: B:171:0x02ae  */
                /* JADX WARN: Code duplicated, block: B:173:0x02b1  */
                /* JADX WARN: Code duplicated, block: B:175:0x02b6  */
                /* JADX WARN: Code duplicated, block: B:241:0x03b6 A[PHI: r10
                  0x03b6: PHI (r10v18 int) = (r10v17 int), (r10v16 int), (r10v16 int), (r10v16 int) binds: [B:239:0x03b1, B:224:0x038c, B:225:0x038e, B:226:0x0390] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // defpackage.etm
                public final void a(java.lang.Object obj3, defpackage.eqd eqdVar) {
                    int i4;
                    int iA;
                    int errorCode;
                    int i5;
                    alic alicVar;
                    int i6;
                    boolean z3;
                    int i7;
                    defpackage.eqg eqgVar;
                    androidx.media3.common.DrmInitData drmInitData;
                    int i8;
                    int i9;
                    final defpackage.fad fadVar = (defpackage.fad) obj3;
                    android.util.SparseArray sparseArray = new android.util.SparseArray(eqdVar.b());
                    int i10 = 0;
                    for (int i11 = 0; i11 < eqdVar.b(); i11++) {
                        defpackage.ezv ezvVar2 = ezvVar;
                        int iA2 = eqdVar.a(i11);
                        defpackage.ezm ezmVar = (defpackage.ezm) ezvVar2.c.get(iA2);
                        ahvr.ci(ezmVar);
                        sparseArray.append(iA2, ezmVar);
                    }
                    if (defpackage.hgt.av(eqdVar) != 0) {
                        for (int i12 = 0; i12 < defpackage.hgt.av(eqdVar); i12++) {
                            int iA3 = eqdVar.a(i12);
                            defpackage.ezm ezmVarAu = defpackage.hgt.au(iA3, sparseArray);
                            if (iA3 == 0) {
                                fadVar.c.h(ezmVarAu);
                            } else if (iA3 == 11) {
                                fadVar.c.g(ezmVarAu, fadVar.j);
                            } else {
                                fadVar.c.f(ezmVarAu);
                            }
                        }
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        if (defpackage.hgt.at(0, eqdVar)) {
                            defpackage.ezm ezmVarAu2 = defpackage.hgt.au(0, sparseArray);
                            if (fadVar.i != null) {
                                fadVar.c(ezmVarAu2.b, ezmVarAu2.d);
                            }
                        }
                        defpackage.eri eriVar = epwVar;
                        if (defpackage.hgt.at(2, eqdVar) && fadVar.i != null) {
                            aify aifyVar = eriVar.r().b;
                            int size = aifyVar.size();
                            int i13 = 0;
                            loop2: while (true) {
                                if (i13 >= size) {
                                    drmInitData = null;
                                    break;
                                }
                                defpackage.ers ersVar = (defpackage.ers) aifyVar.get(i13);
                                int i14 = i10;
                                while (true) {
                                    i9 = i13 + 1;
                                    if (i14 < ersVar.a) {
                                        if (ersVar.c[i14] && (drmInitData = ersVar.b.a(i14).t) != null) {
                                            break loop2;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                                i13 = i9;
                                i10 = 0;
                            }
                            if (drmInitData != null) {
                                android.media.metrics.PlaybackMetrics.Builder builder = fadVar.i;
                                java.lang.String str2 = eum.a;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= drmInitData.b) {
                                        i8 = 1;
                                        break;
                                    }
                                    java.util.UUID uuid = drmInitData.a(i15).a;
                                    if (uuid.equals(defpackage.epx.d)) {
                                        i8 = 3;
                                        break;
                                    } else if (uuid.equals(defpackage.epx.e)) {
                                        i8 = 2;
                                        break;
                                    } else {
                                        if (uuid.equals(defpackage.epx.c)) {
                                            i8 = 6;
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                                ac$.ExternalSyntheticApiModelOutline0.m(builder, i8);
                            }
                        }
                        if (defpackage.hgt.at(1011, eqdVar)) {
                            fadVar.s++;
                        }
                        defpackage.erb erbVar = fadVar.m;
                        int i16 = 4;
                        if (erbVar == null) {
                            i5 = 2;
                        } else {
                            android.content.Context context2 = fadVar.a;
                            int i17 = fadVar.o;
                            int i18 = erbVar.a;
                            if (i18 == 1001) {
                                iA = 20;
                            } else {
                                defpackage.exl exlVar = (defpackage.exl) erbVar;
                                boolean z4 = exlVar.c == 1;
                                int i19 = exlVar.g;
                                java.lang.Throwable cause = erbVar.getCause();
                                ahvr.ci(cause);
                                if (cause instanceof java.io.IOException) {
                                    if (cause instanceof defpackage.ewh) {
                                        errorCode = ((defpackage.ewh) cause).c;
                                        iA = 5;
                                    } else if ((cause instanceof defpackage.ewg) || (cause instanceof defpackage.era)) {
                                        iA = i17 != 4 ? 11 : 10;
                                    } else {
                                        boolean z5 = cause instanceof defpackage.ewf;
                                        if (z5 || (cause instanceof defpackage.ewn)) {
                                            if (afpb.i(context2).f() == 1) {
                                                errorCode = 0;
                                                iA = 3;
                                            } else {
                                                java.lang.Throwable cause2 = cause.getCause();
                                                if (cause2 instanceof java.net.UnknownHostException) {
                                                    errorCode = 0;
                                                    iA = 6;
                                                } else if (cause2 instanceof java.net.SocketTimeoutException) {
                                                    errorCode = 0;
                                                    iA = 7;
                                                } else if (z5 && ((defpackage.ewf) cause).b == 1) {
                                                    iA = 4;
                                                } else {
                                                    errorCode = 0;
                                                    iA = 8;
                                                }
                                            }
                                        } else if (i18 == 1002) {
                                            iA = 21;
                                        } else if (cause instanceof defpackage.fcr) {
                                            java.lang.Throwable cause3 = cause.getCause();
                                            ahvr.ci(cause3);
                                            if (cause3 instanceof android.media.MediaDrm.MediaDrmStateException) {
                                                errorCode = eum.l(((android.media.MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                                iA = defpackage.fad.a(errorCode);
                                            } else if (cause3 instanceof android.media.MediaDrmResetException) {
                                                iA = 27;
                                            } else if (cause3 instanceof android.media.NotProvisionedException) {
                                                iA = 24;
                                            } else if (cause3 instanceof android.media.DeniedByServerException) {
                                                iA = 29;
                                            } else if (cause3 instanceof defpackage.fdg) {
                                                iA = 23;
                                            } else {
                                                iA = cause3 instanceof defpackage.fco ? 28 : 30;
                                            }
                                        } else if ((cause instanceof defpackage.ewc) && (cause.getCause() instanceof java.io.FileNotFoundException)) {
                                            java.lang.Throwable cause4 = cause.getCause();
                                            ahvr.ci(cause4);
                                            java.lang.Throwable cause5 = cause4.getCause();
                                            i4 = 31;
                                            if ((cause5 instanceof android.system.ErrnoException) && ((android.system.ErrnoException) cause5).errno == android.system.OsConstants.EACCES) {
                                                iA = 32;
                                            } else {
                                                iA = i4;
                                            }
                                        } else {
                                            iA = 9;
                                        }
                                    }
                                } else if (z4) {
                                    i4 = 35;
                                    if (i19 == 0 || i19 == 1) {
                                        iA = i4;
                                    } else if (i19 == 3) {
                                        iA = 15;
                                    } else if (i19 == 2) {
                                        iA = 23;
                                    } else if (cause instanceof defpackage.feg) {
                                        errorCode = eum.l(((defpackage.feg) cause).d);
                                        iA = 13;
                                    } else {
                                        i4 = 14;
                                        if (cause instanceof defpackage.fec) {
                                            errorCode = ((defpackage.fec) cause).a;
                                            iA = 14;
                                        } else if (cause instanceof java.lang.OutOfMemoryError) {
                                            iA = i4;
                                        } else if (cause instanceof defpackage.fbb) {
                                            iA = 17;
                                        } else if (cause instanceof defpackage.fbd) {
                                            errorCode = ((defpackage.fbd) cause).a;
                                            iA = 18;
                                        } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                                            errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                                            iA = defpackage.fad.a(errorCode);
                                        } else {
                                            iA = 22;
                                        }
                                    }
                                } else if (cause instanceof defpackage.feg) {
                                    errorCode = eum.l(((defpackage.feg) cause).d);
                                    iA = 13;
                                } else {
                                    i4 = 14;
                                    if (cause instanceof defpackage.fec) {
                                        errorCode = ((defpackage.fec) cause).a;
                                        iA = 14;
                                    } else if (cause instanceof java.lang.OutOfMemoryError) {
                                        iA = i4;
                                    } else if (cause instanceof defpackage.fbb) {
                                        iA = 17;
                                    } else if (cause instanceof defpackage.fbd) {
                                        errorCode = ((defpackage.fbd) cause).a;
                                        iA = 18;
                                    } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                                        errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                                        iA = defpackage.fad.a(errorCode);
                                    } else {
                                        iA = 22;
                                    }
                                }
                                final android.media.metrics.PlaybackErrorEvent playbackErrorEventM = ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m$1(ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.PlaybackErrorEvent.Builder(), jElapsedRealtime - fadVar.e), iA), errorCode), erbVar));
                                fadVar.b.execute(new java.lang.Runnable() { // from class: faa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ac$.ExternalSyntheticApiModelOutline0.m(fadVar.d, playbackErrorEventM);
                                    }
                                });
                                fadVar.t = true;
                                fadVar.m = null;
                                i5 = 2;
                            }
                            errorCode = 0;
                            final android.media.metrics.PlaybackErrorEvent playbackErrorEventM2 = ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m$1(ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.PlaybackErrorEvent.Builder(), jElapsedRealtime - fadVar.e), iA), errorCode), erbVar));
                            fadVar.b.execute(new java.lang.Runnable() { // from class: faa
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ac$.ExternalSyntheticApiModelOutline0.m(fadVar.d, playbackErrorEventM2);
                                }
                            });
                            fadVar.t = true;
                            fadVar.m = null;
                            i5 = 2;
                        }
                        if (defpackage.hgt.at(i5, eqdVar)) {
                            defpackage.ert ertVarR = eriVar.r();
                            boolean zA = ertVarR.a(i5);
                            boolean zA2 = ertVarR.a(1);
                            boolean zA3 = ertVarR.a(3);
                            if (zA || zA2) {
                                if (zA) {
                                    eqgVar = null;
                                } else {
                                    eqgVar = null;
                                    fadVar.f(jElapsedRealtime, null);
                                }
                                if (!zA2) {
                                    fadVar.d(jElapsedRealtime, eqgVar);
                                }
                                if (!zA3) {
                                    fadVar.e(jElapsedRealtime, eqgVar);
                                }
                            } else if (zA3) {
                                zA3 = true;
                                if (zA) {
                                    eqgVar = null;
                                    fadVar.f(jElapsedRealtime, null);
                                } else {
                                    eqgVar = null;
                                }
                                if (!zA2) {
                                    fadVar.d(jElapsedRealtime, eqgVar);
                                }
                                if (!zA3) {
                                    fadVar.e(jElapsedRealtime, eqgVar);
                                }
                            }
                        }
                        if (fadVar.h(fadVar.u)) {
                            alic alicVar2 = fadVar.u;
                            defpackage.eqg eqgVar2 = (defpackage.eqg) alicVar2.b;
                            if (eqgVar2.w != -1) {
                                int i20 = alicVar2.a;
                                fadVar.f(jElapsedRealtime, eqgVar2);
                                fadVar.u = null;
                            }
                        }
                        if (fadVar.h(fadVar.v)) {
                            alic alicVar3 = fadVar.v;
                            java.lang.Object obj4 = alicVar3.b;
                            int i21 = alicVar3.a;
                            fadVar.d(jElapsedRealtime, (defpackage.eqg) obj4);
                            alicVar = null;
                            fadVar.v = null;
                        } else {
                            alicVar = null;
                        }
                        if (fadVar.h(fadVar.w)) {
                            alic alicVar4 = fadVar.w;
                            java.lang.Object obj5 = alicVar4.b;
                            int i22 = alicVar4.a;
                            fadVar.e(jElapsedRealtime, (defpackage.eqg) obj5);
                            fadVar.w = alicVar;
                        }
                        switch (afpb.i(fadVar.a).f()) {
                            case 0:
                                i6 = 0;
                                break;
                            case 1:
                                i6 = 9;
                                break;
                            case 2:
                                i6 = 2;
                                break;
                            case 3:
                                i6 = 4;
                                break;
                            case 4:
                                i6 = 5;
                                break;
                            case 5:
                                i6 = 6;
                                break;
                            case 6:
                            case 8:
                            default:
                                i6 = 1;
                                break;
                            case 7:
                                i6 = 3;
                                break;
                            case 9:
                                i6 = 8;
                                break;
                            case 10:
                                i6 = 7;
                                break;
                        }
                        if (i6 != fadVar.l) {
                            fadVar.l = i6;
                            final android.media.metrics.NetworkEvent networkEventM = ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.NetworkEvent.Builder(), i6), jElapsedRealtime - fadVar.e));
                            fadVar.b.execute(new java.lang.Runnable() { // from class: ezz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ac$.ExternalSyntheticApiModelOutline0.m(fadVar.d, networkEventM);
                                }
                            });
                        }
                        if (eriVar.k() != 2) {
                            z3 = false;
                            fadVar.n = false;
                        } else {
                            z3 = false;
                        }
                        defpackage.eyc eycVar = (defpackage.eyc) eriVar;
                        eycVar.L();
                        if (eycVar.w.g == null) {
                            fadVar.p = z3;
                            i7 = 10;
                        } else {
                            i7 = 10;
                            if (defpackage.hgt.at(10, eqdVar)) {
                                fadVar.p = true;
                            }
                        }
                        int iK = eriVar.k();
                        if (fadVar.n) {
                            i16 = 5;
                        } else if (fadVar.p) {
                            i16 = 13;
                        } else if (iK == 4) {
                            i16 = 11;
                        } else {
                            int i23 = 2;
                            if (iK == 2) {
                                int i24 = fadVar.k;
                                if (i24 == 0 || i24 == 2 || i24 == 12) {
                                    i16 = i23;
                                } else if (eriVar.x()) {
                                    i16 = eriVar.l() != 0 ? i7 : 6;
                                } else {
                                    i16 = 7;
                                }
                            } else {
                                i23 = 3;
                                if (iK != 3) {
                                    i16 = (iK != 1 || fadVar.k == 0) ? fadVar.k : 12;
                                } else if (eriVar.x()) {
                                    if (eriVar.l() != 0) {
                                        i16 = 9;
                                    } else {
                                        i16 = i23;
                                    }
                                }
                            }
                        }
                        if (fadVar.k != i16) {
                            fadVar.k = i16;
                            fadVar.t = true;
                            final android.media.metrics.PlaybackStateEvent playbackStateEventM = ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.PlaybackStateEvent.Builder(), fadVar.k), jElapsedRealtime - fadVar.e));
                            fadVar.b.execute(new java.lang.Runnable() { // from class: fac
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ac$.ExternalSyntheticApiModelOutline0.m(fadVar.d, playbackStateEventM);
                                }
                            });
                        }
                        if (defpackage.hgt.at(1028, eqdVar)) {
                            fadVar.c.e(defpackage.hgt.au(1028, sparseArray));
                        }
                    }
                }
            }, etoVar.d);
            defpackage.fag fagVar = new defpackage.fag(exoVar.p);
            defpackage.eyj eyjVar = new defpackage.eyj(epwVar.d, epwVar.D, epwVar.E, fimVar, finVar, new defpackage.exh(), EZ, epwVar.z, epwVar.T, exoVar.q, looper2, etcVar, raiVar, fagVar, epwVar.U, epwVar.M);
            epwVar.g = eyjVar;
            android.os.Looper looper3 = eyjVar.g;
            defpackage.eqw eqwVar = defpackage.eqw.a;
            epwVar.q = eqwVar;
            epwVar.v = eqwVar;
            epwVar.x = -1;
            int i4 = defpackage.est.b;
            epwVar.Y = true;
            epwVar.s(epwVar.z);
            android.os.Handler handler3 = new android.os.Handler(looper2);
            defpackage.ezv ezvVar2 = epwVar.z;
            ahvr.ci(ezvVar2);
            ahvr.ci(ezvVar2);
            defpackage.oq oqVar = ((defpackage.fir) EZ).g;
            oqVar.j(ezvVar2);
            ((java.util.concurrent.CopyOnWriteArrayList) oqVar.a).add(new defpackage.aae(handler3, ezvVar2));
            copyOnWriteArraySet.add(epwVar.L);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                try {
                    android.content.Context context2 = epwVar.d;
                    defpackage.etk etkVarB = etcVar.b(eyjVar.g, null);
                    defpackage.ac acVar = new defpackage.ac((java.lang.Object) context2, (java.lang.Object) epwVar, (java.lang.Object) fagVar, 6, (byte[]) null);
                    epwVar = epwVar;
                    etkVarB.d(acVar);
                    eybVar = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                    epwVar = epwVar;
                }
            } else {
                eybVar = null;
                epwVar = epwVar;
            }
            defpackage.etb etbVar = new defpackage.etb(0, looper3, looper2, etcVar, new rai((java.lang.Object) epwVar));
            epwVar.l = etbVar;
            etbVar.a(new defpackage.drn((java.lang.Object) epwVar, 7));
            new defpackage.esv(exoVar.b, looper3, exoVar.i, etcVar);
            boolean z3 = (exoVar.m == Integer.MAX_VALUE || exoVar.n == Integer.MAX_VALUE) ? false : true;
            defpackage.eup eupVar = new defpackage.eup(exoVar.b, looper3, etcVar);
            epwVar.N = eupVar;
            if (eupVar.a != z3) {
                eupVar.a = z3;
                eupVar.a(z3, eupVar.b);
            }
            epwVar.ad = new defpackage.agze(exoVar.b, looper3, etcVar);
            int i5 = defpackage.eqc.a;
            defpackage.ery eryVar = defpackage.ery.a;
            epwVar.W = defpackage.ety.a;
            epwVar.P = android.os.Build.VERSION.SDK_INT >= 34 ? new defpackage.eyb(epwVar, exoVar.b) : eybVar;
            epwVar.A = new defpackage.hjx((defpackage.eyc) epwVar);
            epwVar.B = new defpackage.hjx((defpackage.eyc) epwVar);
            epwVar.ac = new defpackage.iay(epwVar, epwVar.L, etcVar, exoVar.m, exoVar.n);
            eyjVar.f.i(38, epwVar.S).b();
            defpackage.epu epuVar = epwVar.X;
            defpackage.etk etkVar = eyjVar.f;
            defpackage.yz yzVarL = defpackage.euh.l();
            yzVarL.a = ((defpackage.euh) etkVar).b.obtainMessage(31, 0, 0, epuVar);
            yzVarL.b();
            epwVar.G(1, 3, epwVar.X);
            epwVar.G(2, 4, java.lang.Integer.valueOf(epwVar.V));
            epwVar.G(2, 5, 0);
            epwVar.G(1, 9, java.lang.Boolean.valueOf(epwVar.t));
            epwVar.G(6, 8, epwVar.M);
            epwVar.G(-1, 16, java.lang.Integer.valueOf(epwVar.aa));
            epwVar.ae.g();
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final int N(defpackage.eza ezaVar) {
        defpackage.erm ermVar = ezaVar.b;
        return ermVar.n() ? this.x : ermVar.m(ezaVar.c.a, this.H).c;
    }

    private final long O(defpackage.eza ezaVar) {
        defpackage.erm ermVar = ezaVar.b;
        if (ermVar.n()) {
            return eum.w(this.y);
        }
        long jA = ezaVar.r ? ezaVar.a(android.os.SystemClock.elapsedRealtime()) : ezaVar.u;
        if (ezaVar == this.w) {
            long j = this.ab;
            if (j == -9223372036854775807L || jA >= j) {
                this.ab = jA;
            } else {
                jA = j;
            }
        }
        defpackage.ffu ffuVar = ezaVar.c;
        return ffuVar.c() ? jA : D(ermVar, ffuVar, jA);
    }

    private static long P(defpackage.eza ezaVar) {
        defpackage.erl erlVar = new defpackage.erl();
        defpackage.erk erkVar = new defpackage.erk();
        defpackage.erm ermVar = ezaVar.b;
        ermVar.m(ezaVar.c.a, erkVar);
        long j = ezaVar.d;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = ermVar.e(erkVar.c, erlVar, 0L).l;
        return 0L;
    }

    private final android.util.Pair Q(defpackage.erm ermVar, int i, long j) {
        if (ermVar.n()) {
            this.x = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.y = j;
            return null;
        }
        if (i == -1 || i >= ermVar.c()) {
            i = ermVar.g(false);
            j = ermVar.e(i, this.a, 0L).a();
        }
        return ermVar.k(this.a, this.H, i, eum.w(j));
    }

    private static defpackage.eza R(defpackage.eza ezaVar, int i) {
        defpackage.eza ezaVarH = ezaVar.h(i);
        return (i == 1 || i == 4) ? ezaVarH.c(false) : ezaVarH;
    }

    private final defpackage.eza S(defpackage.eza ezaVar, defpackage.erm ermVar, android.util.Pair pair) {
        defpackage.fhg fhgVar;
        defpackage.fin finVar;
        aify aifyVar;
        ahvr.bM(ermVar.n() || pair != null);
        defpackage.erm ermVar2 = ezaVar.b;
        long jC = C(ezaVar);
        defpackage.eza ezaVarI = ezaVar.i(ermVar);
        if (ermVar.n()) {
            defpackage.ffu ffuVar = defpackage.eza.a;
            long jW = eum.w(this.y);
            defpackage.eza ezaVarD = ezaVarI.e(ffuVar, jW, jW, jW, 0L, android.os.SystemClock.elapsedRealtime(), defpackage.fhg.a, this.b, aike.a).d(ffuVar);
            ezaVarD.s = ezaVarD.u;
            return ezaVarD;
        }
        defpackage.ffu ffuVar2 = ezaVarI.c;
        java.lang.Object obj = ffuVar2.a;
        java.lang.String str = eum.a;
        boolean zEquals = obj.equals(pair.first);
        defpackage.ffu ffuVar3 = !zEquals ? new defpackage.ffu(pair.first, -1, -1, -1L, -1) : ffuVar2;
        long jLongValue = ((java.lang.Long) pair.second).longValue();
        long jW2 = eum.w(jC);
        if (!ermVar2.n()) {
            defpackage.erk erkVar = this.H;
            long j = ermVar2.m(obj, erkVar).f;
            if (zEquals && jW2 - jLongValue == 1 && jW2 == ermVar2.m(obj, erkVar).d) {
                jW2--;
            }
        }
        if (!zEquals || jLongValue < jW2) {
            defpackage.ffu ffuVar4 = ffuVar3;
            ahvr.bY(!ffuVar4.c());
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (zEquals) {
                fhgVar = ezaVarI.i;
                finVar = ezaVarI.j;
                aifyVar = ezaVarI.k;
            } else {
                fhgVar = defpackage.fhg.a;
                finVar = this.b;
                aifyVar = aike.a;
            }
            defpackage.eza ezaVarD2 = ezaVarI.e(ffuVar4, jLongValue, jLongValue, jLongValue, 0L, jElapsedRealtime, fhgVar, finVar, aifyVar).d(ffuVar4);
            ezaVarD2.s = jLongValue;
            return ezaVarD2;
        }
        if (jLongValue != jW2) {
            defpackage.ffu ffuVar5 = ffuVar3;
            ahvr.bY(!ffuVar5.c());
            long jMax = java.lang.Math.max(0L, ezaVarI.t - (jLongValue - jW2));
            long j2 = ezaVarI.s;
            if (ezaVarI.l.equals(ffuVar2)) {
                j2 = jLongValue + jMax;
            }
            defpackage.eza ezaVarE = ezaVarI.e(ffuVar5, jLongValue, jLongValue, jLongValue, jMax, android.os.SystemClock.elapsedRealtime(), ezaVarI.i, ezaVarI.j, ezaVarI.k);
            ezaVarE.s = j2;
            return ezaVarE;
        }
        int iA = ermVar.a(ezaVarI.l.a);
        if (iA != -1) {
            defpackage.erk erkVar2 = this.H;
            if (ermVar.d(iA, erkVar2, false).c == ermVar.m(ffuVar3.a, erkVar2).c) {
                return ezaVarI;
            }
        }
        java.lang.Object obj2 = ffuVar3.a;
        defpackage.erk erkVar3 = this.H;
        ermVar.m(obj2, erkVar3);
        long jE = ffuVar3.c() ? erkVar3.e(ffuVar3.b, ffuVar3.c) : erkVar3.d;
        defpackage.ffu ffuVar6 = ffuVar3;
        defpackage.eza ezaVarD3 = ezaVarI.e(ffuVar6, ezaVarI.u, ezaVarI.u, ezaVarI.e, jE - ezaVarI.u, android.os.SystemClock.elapsedRealtime(), ezaVarI.i, ezaVarI.j, ezaVarI.k).d(ffuVar6);
        ezaVarD3.s = jE;
        return ezaVarD3;
    }

    private static defpackage.eza T(defpackage.eza ezaVar, long j) {
        return ezaVar.r ? ezaVar.b(j) : ezaVar;
    }

    private final defpackage.ezd U(defpackage.ezc ezcVar) {
        N(this.w);
        defpackage.erm ermVar = this.w.b;
        defpackage.eyj eyjVar = this.g;
        return new defpackage.ezd(eyjVar, ezcVar, eyjVar.g);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eri, java.lang.Object] */
    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void A() {
        android.content.Context context;
        defpackage.etr.e("ExoPlayerImpl", "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + eum.a + "] [" + defpackage.equ.a() + ']');
        L();
        this.N.b(false);
        this.ad.a(false);
        defpackage.eyb eybVar = this.P;
        if (eybVar != null && android.os.Build.VERSION.SDK_INT >= 34 && (context = (android.content.Context) eybVar.a.get()) != null) {
            rp$.ExternalSyntheticApiModelOutline0.m(context, eybVar.b);
        }
        defpackage.iay iayVar = this.ac;
        iayVar.g.e();
        iayVar.e.u(iayVar.d);
        defpackage.eyj eyjVar = this.g;
        int i = 10;
        int i2 = 1;
        if (!eyjVar.n && eyjVar.g.getThread().isAlive()) {
            eyjVar.n = true;
            defpackage.etc etcVar = eyjVar.h;
            defpackage.agze agzeVar = new defpackage.agze(null);
            eyjVar.f.i(7, agzeVar).b();
            long j = eyjVar.j;
            if (!agzeVar.d(500L)) {
                this.h.e(10, new defpackage.exv(i2));
            }
        }
        this.h.d();
        this.f.e();
        defpackage.fip fipVar = this.K;
        defpackage.ezv ezvVar = this.z;
        ((defpackage.fir) fipVar).g.j(ezvVar);
        defpackage.eza ezaVarT = T(this.w, android.os.SystemClock.elapsedRealtime());
        this.w = ezaVarT;
        defpackage.eza ezaVarR = R(ezaVarT, 1);
        this.w = ezaVarR;
        defpackage.eza ezaVarD = ezaVarR.d(ezaVarR.c);
        this.w = ezaVarD;
        ezaVarD.s = ezaVarD.u;
        this.w.t = 0L;
        defpackage.etk etkVar = ezvVar.f;
        ahvr.ci(etkVar);
        etkVar.d(new defpackage.drn(ezvVar, i));
        android.view.Surface surface = this.s;
        if (surface != null) {
            surface.release();
            this.s = null;
        }
        int i3 = defpackage.est.b;
        this.u = true;
        if (this.w.b.n()) {
            return;
        }
        defpackage.eza ezaVar = this.w;
        boolean z = ezaVar.b.a(ezaVar.c.a) != -1;
        java.util.Locale locale = java.util.Locale.US;
        defpackage.eza ezaVar2 = this.w;
        ahvr.bZ(z, java.lang.String.format(locale, "periodUid %s not found in timeline %s with size %d", ezaVar2.c.a, ezaVar2.b.getClass().getName(), java.lang.Integer.valueOf(this.w.b.c())));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void B(android.media.AudioDeviceInfo audioDeviceInfo) {
        L();
        G(1, 12, audioDeviceInfo);
    }

    public final long C(defpackage.eza ezaVar) {
        defpackage.ffu ffuVar = ezaVar.c;
        if (!ffuVar.c()) {
            return eum.C(O(ezaVar));
        }
        defpackage.erm ermVar = ezaVar.b;
        java.lang.Object obj = ffuVar.a;
        defpackage.erk erkVar = this.H;
        ermVar.m(obj, erkVar);
        long j = ezaVar.d;
        return j == -9223372036854775807L ? ermVar.e(N(ezaVar), this.a, 0L).a() : erkVar.f() + eum.C(j);
    }

    public final long D(defpackage.erm ermVar, defpackage.ffu ffuVar, long j) {
        java.lang.Object obj = ffuVar.a;
        defpackage.erk erkVar = this.H;
        ermVar.m(obj, erkVar);
        long j2 = erkVar.f;
        return j;
    }

    public final defpackage.eqw E() {
        defpackage.erm ermVarQ = q();
        if (ermVarQ.n()) {
            return this.v;
        }
        defpackage.eqt eqtVar = ermVarQ.e(i(), this.a, 0L).d;
        defpackage.eqv eqvVar = new defpackage.eqv(this.v);
        defpackage.eqw eqwVar = eqtVar.d;
        if (eqwVar != null) {
            java.lang.CharSequence charSequence = eqwVar.b;
            if (charSequence != null) {
                eqvVar.a = charSequence;
            }
            java.lang.CharSequence charSequence2 = eqwVar.c;
            if (charSequence2 != null) {
                eqvVar.b = charSequence2;
            }
            java.lang.CharSequence charSequence3 = eqwVar.d;
            if (charSequence3 != null) {
                eqvVar.c = charSequence3;
            }
            java.lang.CharSequence charSequence4 = eqwVar.e;
            if (charSequence4 != null) {
                eqvVar.d = charSequence4;
            }
            java.lang.CharSequence charSequence5 = eqwVar.f;
            if (charSequence5 != null) {
                eqvVar.e = charSequence5;
            }
            byte[] bArr = eqwVar.g;
            if (bArr != null) {
                java.lang.Integer num = eqwVar.h;
                eqvVar.f = (byte[]) bArr.clone();
                eqvVar.g = num;
            }
            java.lang.Integer num2 = eqwVar.i;
            if (num2 != null) {
                eqvVar.h = num2;
            }
            java.lang.Integer num3 = eqwVar.j;
            if (num3 != null) {
                eqvVar.i = num3;
            }
            java.lang.Integer num4 = eqwVar.k;
            if (num4 != null) {
                eqvVar.j = num4;
            }
            java.lang.Boolean bool = eqwVar.l;
            if (bool != null) {
                eqvVar.k = bool;
            }
            java.lang.Integer num5 = eqwVar.m;
            if (num5 != null) {
                eqvVar.l = num5;
            }
            java.lang.Integer num6 = eqwVar.n;
            if (num6 != null) {
                eqvVar.l = num6;
            }
            java.lang.Integer num7 = eqwVar.o;
            if (num7 != null) {
                eqvVar.m = num7;
            }
            java.lang.Integer num8 = eqwVar.p;
            if (num8 != null) {
                eqvVar.n = num8;
            }
            java.lang.Integer num9 = eqwVar.q;
            if (num9 != null) {
                eqvVar.o = num9;
            }
            java.lang.Integer num10 = eqwVar.r;
            if (num10 != null) {
                eqvVar.p = num10;
            }
            java.lang.Integer num11 = eqwVar.s;
            if (num11 != null) {
                eqvVar.q = num11;
            }
            java.lang.CharSequence charSequence6 = eqwVar.t;
            if (charSequence6 != null) {
                eqvVar.r = charSequence6;
            }
            java.lang.CharSequence charSequence7 = eqwVar.u;
            if (charSequence7 != null) {
                eqvVar.s = charSequence7;
            }
            java.lang.CharSequence charSequence8 = eqwVar.v;
            if (charSequence8 != null) {
                eqvVar.t = charSequence8;
            }
            java.lang.CharSequence charSequence9 = eqwVar.w;
            if (charSequence9 != null) {
                eqvVar.u = charSequence9;
            }
            java.lang.Integer num12 = eqwVar.x;
            if (num12 != null) {
                eqvVar.v = num12;
            }
            java.lang.Integer num13 = eqwVar.y;
            if (num13 != null) {
                eqvVar.w = num13;
            }
            java.lang.CharSequence charSequence10 = eqwVar.z;
            if (charSequence10 != null) {
                eqvVar.x = charSequence10;
            }
            java.lang.CharSequence charSequence11 = eqwVar.A;
            if (charSequence11 != null) {
                eqvVar.y = charSequence11;
            }
            java.lang.Integer num14 = eqwVar.B;
            if (num14 != null) {
                eqvVar.z = num14;
            }
            aify aifyVar = eqwVar.C;
            if (!aifyVar.isEmpty()) {
                eqvVar.A = aify.n(aifyVar);
            }
            aify aifyVar2 = eqwVar.D;
            if (!aifyVar2.isEmpty()) {
                eqvVar.B = aify.n(aifyVar2);
            }
        }
        return new defpackage.eqw(eqvVar);
    }

    public final void F(final int i, final int i2) {
        defpackage.ety etyVar = this.W;
        if (i == etyVar.b && i2 == etyVar.c) {
            return;
        }
        this.W = new defpackage.ety(i, i2);
        this.h.e(24, new defpackage.etl() { // from class: exr
            @Override // defpackage.etl
            public final void a(java.lang.Object obj) {
                int i3 = defpackage.eyc.C;
                ((erg) obj).w(i, i2);
            }
        });
        G(2, 14, new defpackage.ety(i, i2));
    }

    public final void G(int i, int i2, java.lang.Object obj) {
        for (defpackage.ezf ezfVar : this.D) {
            if (i == -1 || ezfVar.dG() == i) {
                defpackage.ezd ezdVarU = U(ezfVar);
                ezdVarU.e(i2);
                ezdVarU.d(obj);
                ezdVarU.c();
            }
        }
        for (defpackage.ezf ezfVar2 : this.E) {
            if (ezfVar2 != null && (i == -1 || ezfVar2.dG() == i)) {
                defpackage.ezd ezdVarU2 = U(ezfVar2);
                ezdVarU2.e(i2);
                ezdVarU2.d(obj);
                ezdVarU2.c();
            }
        }
    }

    public final void H(java.lang.Object obj) {
        java.lang.Object obj2 = this.r;
        boolean z = false;
        boolean zD = true;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        long j = z ? this.O : -9223372036854775807L;
        defpackage.eyj eyjVar = this.g;
        if (!eyjVar.n && eyjVar.g.getThread().isAlive()) {
            defpackage.etc etcVar = eyjVar.h;
            defpackage.agze agzeVar = new defpackage.agze(null);
            eyjVar.f.i(30, new android.util.Pair(obj, agzeVar)).b();
            if (j != -9223372036854775807L) {
                zD = agzeVar.d(j);
            }
        }
        if (z) {
            java.lang.Object obj3 = this.r;
            android.view.Surface surface = this.s;
            if (obj3 == surface) {
                surface.release();
                this.s = null;
            }
        }
        this.r = obj;
        if (zD) {
            return;
        }
        I(new defpackage.exl(2, new defpackage.eyk(3), 1003, null, -1, null, 4, null, false));
    }

    public final void I(defpackage.exl exlVar) {
        defpackage.eza ezaVar = this.w;
        defpackage.eza ezaVarT = T(ezaVar.d(ezaVar.c), android.os.SystemClock.elapsedRealtime());
        ezaVarT.s = ezaVarT.u;
        ezaVarT.t = 0L;
        defpackage.eza ezaVarR = R(ezaVarT, 1);
        if (exlVar != null) {
            ezaVarR = ezaVarR.g(exlVar);
        }
        this.m++;
        this.g.f.h(6).b();
        M(ezaVarR, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void J(boolean z, int i) {
        int i2;
        if (this.Q) {
            i2 = 4;
        } else {
            i2 = 0;
            if (this.w.o == 1 && !z) {
                i2 = 1;
            }
        }
        defpackage.eza ezaVar = this.w;
        if (ezaVar.m == z && ezaVar.o == i2 && ezaVar.n == i) {
            return;
        }
        this.m++;
        defpackage.eza ezaVarF = T(ezaVar, android.os.SystemClock.elapsedRealtime()).f(z, i, i2);
        this.g.f.j(1, z ? 1 : 0, (i2 << 4) | i).b();
        M(ezaVarF, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void K() {
        int iK = k();
        if (iK != 2 && iK != 3) {
            this.N.b(false);
            this.ad.a(false);
        } else {
            L();
            boolean z = this.w.q;
            this.N.b(x());
            this.ad.a(x());
        }
    }

    public final void L() {
        this.ae.c();
        android.os.Looper looper = this.j;
        if (java.lang.Thread.currentThread() != looper.getThread()) {
            java.lang.String strG = eum.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new java.lang.Object[]{java.lang.Thread.currentThread().getName(), looper.getThread().getName()});
            if (this.Y) {
                throw new java.lang.IllegalStateException(strG);
            }
            defpackage.etr.g("ExoPlayerImpl", strG, this.Z ? null : new java.lang.IllegalStateException());
            this.Z = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0256  */
    /* JADX WARN: Code duplicated, block: B:101:0x0259  */
    /* JADX WARN: Code duplicated, block: B:103:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:107:0x0298  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:114:0x0311  */
    /* JADX WARN: Code duplicated, block: B:116:0x0318  */
    /* JADX WARN: Code duplicated, block: B:119:0x032e  */
    /* JADX WARN: Code duplicated, block: B:121:0x033a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0348  */
    /* JADX WARN: Code duplicated, block: B:126:0x0359  */
    /* JADX WARN: Code duplicated, block: B:128:0x036a  */
    /* JADX WARN: Code duplicated, block: B:131:0x037b  */
    /* JADX WARN: Code duplicated, block: B:134:0x038a  */
    /* JADX WARN: Code duplicated, block: B:139:0x039e  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:142:0x03af  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:148:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:154:0x0411  */
    /* JADX WARN: Code duplicated, block: B:157:0x041c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0430  */
    /* JADX WARN: Code duplicated, block: B:160:0x0432  */
    /* JADX WARN: Code duplicated, block: B:163:0x043d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0440  */
    /* JADX WARN: Code duplicated, block: B:166:0x0455  */
    /* JADX WARN: Code duplicated, block: B:167:0x0458  */
    /* JADX WARN: Code duplicated, block: B:170:0x0464  */
    /* JADX WARN: Code duplicated, block: B:172:0x0478  */
    /* JADX WARN: Code duplicated, block: B:173:0x047a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0489  */
    /* JADX WARN: Code duplicated, block: B:180:0x0499  */
    /* JADX WARN: Code duplicated, block: B:183:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:188:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04de  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:214:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x0501  */
    /* JADX WARN: Code duplicated, block: B:219:0x0509 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x050d  */
    /* JADX WARN: Code duplicated, block: B:224:0x051f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0198 A[LOOP:1: B:65:0x0192->B:67:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01db  */
    /* JADX WARN: Code duplicated, block: B:86:0x01df  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0223  */
    /* JADX WARN: Code duplicated, block: B:93:0x0233  */
    /* JADX WARN: Code duplicated, block: B:95:0x023b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0248  */
    /* JADX WARN: Code duplicated, block: B:98:0x024e  */
    public final void M(final defpackage.eza ezaVar, final int i, boolean z, int i2, long j, int i3) {
        int i4;
        int i5;
        int i6;
        android.util.Pair pair;
        int i7;
        android.util.Pair pair2;
        boolean zBooleanValue;
        final int iIntValue;
        final defpackage.eqt eqtVar;
        defpackage.eqv eqvVar;
        aike aikeVar;
        int i8;
        defpackage.eqy eqyVar;
        int i9;
        boolean zEquals;
        int i10;
        int i11;
        int i12;
        defpackage.exl exlVar;
        defpackage.exl exlVar2;
        int i13;
        int i14;
        defpackage.fin finVar;
        defpackage.fin finVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        defpackage.ere ereVar;
        defpackage.eri eriVar;
        defpackage.epw epwVar;
        defpackage.erm ermVarQ;
        boolean z2;
        defpackage.erm ermVarQ2;
        boolean z3;
        defpackage.erm ermVarQ3;
        int i19;
        boolean z4;
        defpackage.erm ermVarQ4;
        boolean z5;
        long j2;
        defpackage.erm ermVarQ5;
        boolean z6;
        boolean zN;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        defpackage.ere ereVarA;
        int i20;
        defpackage.eto etoVar;
        defpackage.erk erkVar;
        int i21;
        int i22;
        java.lang.Object obj;
        defpackage.eqt eqtVar2;
        java.lang.Object obj2;
        long jP;
        long jP2;
        int i23;
        int iJ;
        int i24;
        java.lang.Object obj3;
        defpackage.eqt eqtVar3;
        java.lang.Object obj4;
        long jC;
        long jC2;
        defpackage.ffu ffuVar;
        final int i25 = i2;
        defpackage.eza ezaVar2 = this.w;
        this.w = ezaVar;
        if (z) {
            this.ab = -9223372036854775807L;
        } else {
            defpackage.ffu ffuVar2 = ezaVar2.c;
            defpackage.ffu ffuVar3 = ezaVar.c;
            if (ffuVar2.equals(ffuVar3)) {
                defpackage.erm ermVar = ezaVar2.b;
                if (!ermVar.n()) {
                    defpackage.erm ermVar2 = ezaVar.b;
                    if (!ermVar2.n()) {
                        java.lang.Object obj5 = ffuVar2.a;
                        defpackage.erk erkVar2 = this.H;
                        boolean z14 = ermVar.m(obj5, erkVar2).g;
                        boolean z15 = ermVar2.m(ffuVar3.a, erkVar2).g;
                        if (z14 && !z15) {
                            this.ab = -9223372036854775807L;
                        }
                    }
                }
            } else {
                this.ab = -9223372036854775807L;
            }
        }
        defpackage.erm ermVar3 = ezaVar.b;
        if (!ermVar3.n()) {
            java.lang.Object obj6 = ezaVar.c.a;
            ahvr.bZ(ermVar3.a(obj6) != -1, java.lang.String.format(java.util.Locale.US, "periodUid %s not found in timeline %s with size %d", obj6, ermVar3.getClass().getName(), java.lang.Integer.valueOf(ermVar3.c())));
        }
        defpackage.erm ermVar4 = ezaVar2.b;
        boolean zEquals2 = ermVar4.equals(ermVar3);
        if (!ermVar3.n() || !ermVar4.n()) {
            i4 = 3;
            if (ermVar3.n() != ermVar4.n()) {
                pair2 = new android.util.Pair(java.lang.Boolean.TRUE, 3);
            } else {
                defpackage.ffu ffuVar4 = ezaVar2.c;
                java.lang.Object obj7 = ffuVar4.a;
                defpackage.erk erkVar3 = this.H;
                int i26 = ermVar4.m(obj7, erkVar3).c;
                defpackage.erl erlVar = this.a;
                java.lang.Object obj8 = ermVar4.e(i26, erlVar, 0L).b;
                i5 = -1;
                defpackage.ffu ffuVar5 = ezaVar.c;
                i6 = 0;
                if (!obj8.equals(ermVar3.e(ermVar3.m(ffuVar5.a, erkVar3).c, erlVar, 0L).b)) {
                    if (!z) {
                        if (!zEquals2) {
                            throw new java.lang.IllegalStateException();
                        }
                        i7 = 3;
                    } else if (i25 == 0) {
                        i7 = 1;
                        i25 = 0;
                    } else if (i25 == 1) {
                        i7 = 2;
                    } else {
                        if (!zEquals2) {
                            throw new java.lang.IllegalStateException();
                        }
                        i7 = 3;
                    }
                    pair2 = new android.util.Pair(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i7));
                    pair = pair2;
                } else if (!z || i25 != 0) {
                    pair = new android.util.Pair(java.lang.Boolean.FALSE, -1);
                } else if (ffuVar4.d < ffuVar5.d) {
                    pair = new android.util.Pair(java.lang.Boolean.TRUE, 0);
                    i25 = 0;
                } else {
                    i25 = 0;
                    pair = new android.util.Pair(java.lang.Boolean.FALSE, -1);
                }
            }
            zBooleanValue = ((java.lang.Boolean) pair.first).booleanValue();
            iIntValue = ((java.lang.Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (ermVar3.n()) {
                    eqtVar = null;
                } else {
                    eqtVar = ermVar3.e(ermVar3.m(ezaVar.c.a, this.H).c, this.a, 0L).d;
                }
                this.v = defpackage.eqw.a;
            } else {
                eqtVar = null;
            }
            if (zBooleanValue || !ahvr.aP(ezaVar2.k, ezaVar.k)) {
                eqvVar = new defpackage.eqv(this.v);
                aikeVar = ezaVar.k;
                for (i8 = i6; i8 < aikeVar.d; i8++) {
                    eqyVar = (defpackage.eqy) aikeVar.get(i8);
                    for (i9 = i6; i9 < eqyVar.a(); i9++) {
                        eqyVar.b(i9).b(eqvVar);
                    }
                }
                this.v = new defpackage.eqw(eqvVar);
            }
            defpackage.eqw eqwVarE = E();
            zEquals = eqwVarE.equals(this.q);
            this.q = eqwVarE;
            if (ezaVar2.m != ezaVar.m) {
                i10 = 1;
            } else {
                i10 = i6;
            }
            if (ezaVar2.f != ezaVar.f) {
                i11 = 1;
            } else {
                i11 = i6;
            }
            if (i11 == 0 || i10 != 0) {
                K();
            }
            if (ezaVar2.h != ezaVar.h) {
                i12 = 1;
            } else {
                i12 = i6;
            }
            if (!zEquals2) {
                final int i27 = 1;
                this.h.c(i6, new defpackage.etl() { // from class: exu
                    @Override // defpackage.etl
                    public final void a(java.lang.Object obj9) {
                        if (i27 != 0) {
                            int i28 = defpackage.eyc.C;
                            ((erg) obj9).x(((defpackage.eza) ezaVar).b, i);
                        } else {
                            int i29 = defpackage.eyc.C;
                            ((erg) obj9).Q((defpackage.eqt) ezaVar, i);
                        }
                    }
                });
            }
            if (z) {
                erkVar = new defpackage.erk();
                if (ermVar4.n()) {
                    i21 = i3;
                    i22 = i21;
                    obj = null;
                    eqtVar2 = null;
                    obj2 = null;
                } else {
                    java.lang.Object obj9 = ezaVar2.c.a;
                    ermVar4.m(obj9, erkVar);
                    int i28 = erkVar.c;
                    int iA = ermVar4.a(obj9);
                    defpackage.erl erlVar2 = this.a;
                    obj = ermVar4.e(i28, erlVar2, 0L).b;
                    eqtVar2 = erlVar2.d;
                    i21 = i28;
                    obj2 = obj9;
                    i22 = iA;
                }
                if (i25 == 0) {
                    ffuVar = ezaVar2.c;
                    if (ffuVar.c()) {
                        jP = erkVar.e(ffuVar.b, ffuVar.c);
                        jP2 = P(ezaVar2);
                    } else {
                        if (ffuVar.e != i5) {
                            jP = P(this.w);
                        } else {
                            jP = erkVar.d;
                        }
                        jP2 = jP;
                    }
                } else if (ezaVar2.c.c()) {
                    jP = ezaVar2.u;
                    jP2 = P(ezaVar2);
                } else {
                    jP = ezaVar2.u;
                    jP2 = jP;
                }
                java.lang.String str = eum.a;
                defpackage.ffu ffuVar6 = ezaVar2.c;
                final defpackage.erh erhVar = new defpackage.erh(obj, i21, eqtVar2, obj2, i22, eum.C(jP), eum.C(jP2), ffuVar6.b, ffuVar6.c);
                i23 = i();
                iJ = j();
                if (this.w.b.n()) {
                    i24 = iJ;
                    obj3 = null;
                    eqtVar3 = null;
                    obj4 = null;
                } else {
                    defpackage.eza ezaVar3 = this.w;
                    java.lang.Object obj10 = ezaVar3.c.a;
                    ezaVar3.b.m(obj10, this.H);
                    int iA2 = this.w.b.a(obj10);
                    defpackage.erm ermVar5 = this.w.b;
                    defpackage.erl erlVar3 = this.a;
                    i24 = iA2;
                    obj3 = ermVar5.e(i23, erlVar3, 0L).b;
                    eqtVar3 = erlVar3.d;
                    obj4 = obj10;
                }
                jC = eum.C(j);
                if (this.w.c.c()) {
                    jC2 = eum.C(P(this.w));
                } else {
                    jC2 = jC;
                }
                defpackage.ffu ffuVar7 = this.w.c;
                final defpackage.erh erhVar2 = new defpackage.erh(obj3, i23, eqtVar3, obj4, i24, jC, jC2, ffuVar7.b, ffuVar7.c);
                this.h.c(11, new defpackage.etl() { // from class: ext
                    @Override // defpackage.etl
                    public final void a(java.lang.Object obj11) {
                        erg ergVar = (erg) obj11;
                        int i29 = defpackage.eyc.C;
                        int i30 = i25;
                        ergVar.s(i30);
                        ergVar.t(erhVar, erhVar2, i30);
                    }
                });
            } else {
                zBooleanValue = zBooleanValue;
                i10 = i10;
                zEquals = zEquals;
            }
            if (zBooleanValue) {
                final int i29 = 0;
                this.h.c(1, new defpackage.etl() { // from class: exu
                    @Override // defpackage.etl
                    public final void a(java.lang.Object obj11) {
                        if (i29 != 0) {
                            int i210 = defpackage.eyc.C;
                            ((erg) obj11).x(((defpackage.eza) eqtVar).b, iIntValue);
                        } else {
                            int i211 = defpackage.eyc.C;
                            ((erg) obj11).Q((defpackage.eqt) eqtVar, iIntValue);
                        }
                    }
                });
            }
            exlVar = ezaVar2.g;
            exlVar2 = ezaVar.g;
            i13 = 9;
            i14 = 10;
            if (exlVar != exlVar2) {
                etoVar = this.h;
                etoVar.c(10, new defpackage.exq(ezaVar, i13));
                if (exlVar2 != null) {
                    etoVar.c(10, new defpackage.exq(ezaVar, i14));
                }
            }
            finVar = ezaVar2.j;
            finVar2 = ezaVar.j;
            if (finVar != finVar2) {
                java.lang.Object obj11 = finVar2.e;
                this.h.c(2, new defpackage.exq(ezaVar, 11));
            }
            if (!zEquals) {
                this.h.c(14, new defpackage.exq(this.q, 1));
            }
            if (i12 != 0) {
                this.h.c(i4, new defpackage.exq(ezaVar, 0));
            }
            if (i11 == 0 || i10 != 0) {
                this.h.c(-1, new defpackage.exq(ezaVar, 2));
            }
            i15 = 4;
            if (i11 != 0) {
                this.h.c(4, new defpackage.exq(ezaVar, 3));
            }
            i16 = 5;
            if (i10 == 0 || ezaVar2.n != ezaVar.n) {
                this.h.c(5, new defpackage.exq(ezaVar, i15));
            }
            if (ezaVar2.o != ezaVar.o) {
                this.h.c(6, new defpackage.exq(ezaVar, i16));
            }
            i17 = 7;
            if (ezaVar2.k() != ezaVar.k()) {
                this.h.c(7, new defpackage.exq(ezaVar, i17));
            }
            i18 = 8;
            if (!ezaVar2.p.equals(ezaVar.p)) {
                this.h.c(12, new defpackage.exq(ezaVar, i18));
            }
            ereVar = this.p;
            eriVar = this.e;
            defpackage.ere ereVar2 = this.c;
            java.lang.String str2 = eum.a;
            boolean zY = eriVar.y();
            epwVar = (defpackage.epw) eriVar;
            ermVarQ = epwVar.q();
            if (ermVarQ.n() && ermVarQ.e(epwVar.i(), epwVar.a, 0L).h) {
                z2 = true;
            } else {
                z2 = false;
            }
            ermVarQ2 = epwVar.q();
            if (ermVarQ2.n()) {
                z3 = false;
            } else {
                i20 = epwVar.i();
                defpackage.eyc eycVar = (defpackage.eyc) eriVar;
                eycVar.L();
                eycVar.L();
                if (ermVarQ2.o(i20) != -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            ermVarQ3 = epwVar.q();
            if (ermVarQ3.n()) {
                z4 = false;
            } else {
                i19 = epwVar.i();
                defpackage.eyc eycVar2 = (defpackage.eyc) eriVar;
                eycVar2.L();
                eycVar2.L();
                if (ermVarQ3.j(i19, 0, false) != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            ermVarQ4 = epwVar.q();
            if (!ermVarQ4.n()) {
                z5 = z2;
                j2 = 0;
                boolean z16 = ermVarQ4.e(epwVar.i(), epwVar.a, 0L).c();
                ermVarQ5 = epwVar.q();
                if (ermVarQ5.n() && ermVarQ5.e(epwVar.i(), epwVar.a, j2).i) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zN = eriVar.q().n();
                int i30 = defpackage.erd.a;
                ygq ygqVar = new ygq((byte[]) null);
                defpackage.erd.b(ereVar2, ygqVar);
                boolean z17 = !zY;
                defpackage.erd.c(4, z17, ygqVar);
                if (z5 || zY) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                defpackage.erd.c(5, z7, ygqVar);
                if (z3 || zY) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                defpackage.erd.c(6, z8, ygqVar);
                if (!zN || (!(z3 || !z16 || z5) || zY)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                defpackage.erd.c(7, z9, ygqVar);
                if (z4 || zY) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                defpackage.erd.c(8, z10, ygqVar);
                if (!zN || (!(z4 || (z16 && z6)) || zY)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                defpackage.erd.c(9, z11, ygqVar);
                defpackage.erd.c(10, z17, ygqVar);
                if (z5 || zY) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                defpackage.erd.c(11, z12, ygqVar);
                if (z5 || zY) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                defpackage.erd.c(12, z13, ygqVar);
                ereVarA = defpackage.erd.a(ygqVar);
                this.p = ereVarA;
                if (!ereVarA.equals(ereVar)) {
                    this.h.c(13, new defpackage.exq(this, 6));
                }
                this.h.b();
                boolean z18 = ezaVar2.q;
                boolean z19 = ezaVar.q;
            }
            z5 = z2;
            j2 = 0;
            ermVarQ5 = epwVar.q();
            if (ermVarQ5.n()) {
                z6 = false;
            } else {
                z6 = false;
            }
            zN = eriVar.q().n();
            int i31 = defpackage.erd.a;
            ygq ygqVar2 = new ygq((byte[]) null);
            defpackage.erd.b(ereVar2, ygqVar2);
            boolean z110 = !zY;
            defpackage.erd.c(4, z110, ygqVar2);
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            defpackage.erd.c(5, z7, ygqVar2);
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            defpackage.erd.c(6, z8, ygqVar2);
            if (zN) {
                z9 = false;
            } else {
                z9 = false;
            }
            defpackage.erd.c(7, z9, ygqVar2);
            if (z4) {
                z10 = false;
            } else {
                z10 = false;
            }
            defpackage.erd.c(8, z10, ygqVar2);
            if (zN) {
                z11 = false;
            } else {
                z11 = false;
            }
            defpackage.erd.c(9, z11, ygqVar2);
            defpackage.erd.c(10, z110, ygqVar2);
            if (z5) {
                z12 = false;
            } else {
                z12 = false;
            }
            defpackage.erd.c(11, z12, ygqVar2);
            if (z5) {
                z13 = false;
            } else {
                z13 = false;
            }
            defpackage.erd.c(12, z13, ygqVar2);
            ereVarA = defpackage.erd.a(ygqVar2);
            this.p = ereVarA;
            if (!ereVarA.equals(ereVar)) {
                this.h.c(13, new defpackage.exq(this, 6));
            }
            this.h.b();
            boolean z111 = ezaVar2.q;
            boolean z112 = ezaVar.q;
        }
        i4 = 3;
        pair2 = new android.util.Pair(java.lang.Boolean.FALSE, -1);
        i5 = -1;
        i6 = 0;
        pair = pair2;
        zBooleanValue = ((java.lang.Boolean) pair.first).booleanValue();
        iIntValue = ((java.lang.Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (ermVar3.n()) {
                eqtVar = ermVar3.e(ermVar3.m(ezaVar.c.a, this.H).c, this.a, 0L).d;
            } else {
                eqtVar = null;
            }
            this.v = defpackage.eqw.a;
        } else {
            eqtVar = null;
        }
        if (zBooleanValue) {
            eqvVar = new defpackage.eqv(this.v);
            aikeVar = ezaVar.k;
            while (i8 < aikeVar.d) {
                eqyVar = (defpackage.eqy) aikeVar.get(i8);
                while (i9 < eqyVar.a()) {
                    eqyVar.b(i9).b(eqvVar);
                }
            }
            this.v = new defpackage.eqw(eqvVar);
        } else {
            eqvVar = new defpackage.eqv(this.v);
            aikeVar = ezaVar.k;
            while (i8 < aikeVar.d) {
                eqyVar = (defpackage.eqy) aikeVar.get(i8);
                while (i9 < eqyVar.a()) {
                    eqyVar.b(i9).b(eqvVar);
                }
            }
            this.v = new defpackage.eqw(eqvVar);
        }
        defpackage.eqw eqwVarE2 = E();
        zEquals = eqwVarE2.equals(this.q);
        this.q = eqwVarE2;
        if (ezaVar2.m != ezaVar.m) {
            i10 = 1;
        } else {
            i10 = i6;
        }
        if (ezaVar2.f != ezaVar.f) {
            i11 = 1;
        } else {
            i11 = i6;
        }
        if (i11 == 0) {
            K();
        } else {
            K();
        }
        if (ezaVar2.h != ezaVar.h) {
            i12 = 1;
        } else {
            i12 = i6;
        }
        if (!zEquals2) {
            final int i210 = 1;
            this.h.c(i6, new defpackage.etl() { // from class: exu
                @Override // defpackage.etl
                public final void a(java.lang.Object obj12) {
                    if (i210 != 0) {
                        int i211 = defpackage.eyc.C;
                        ((erg) obj12).x(((defpackage.eza) ezaVar).b, i);
                    } else {
                        int i212 = defpackage.eyc.C;
                        ((erg) obj12).Q((defpackage.eqt) ezaVar, i);
                    }
                }
            });
        }
        if (z) {
            erkVar = new defpackage.erk();
            if (ermVar4.n()) {
                java.lang.Object obj12 = ezaVar2.c.a;
                ermVar4.m(obj12, erkVar);
                int i211 = erkVar.c;
                int iA3 = ermVar4.a(obj12);
                defpackage.erl erlVar4 = this.a;
                obj = ermVar4.e(i211, erlVar4, 0L).b;
                eqtVar2 = erlVar4.d;
                i21 = i211;
                obj2 = obj12;
                i22 = iA3;
            } else {
                i21 = i3;
                i22 = i21;
                obj = null;
                eqtVar2 = null;
                obj2 = null;
            }
            if (i25 == 0) {
                ffuVar = ezaVar2.c;
                if (ffuVar.c()) {
                    jP = erkVar.e(ffuVar.b, ffuVar.c);
                    jP2 = P(ezaVar2);
                } else {
                    if (ffuVar.e != i5) {
                        jP = P(this.w);
                    } else {
                        jP = erkVar.d;
                    }
                    jP2 = jP;
                }
            } else if (ezaVar2.c.c()) {
                jP = ezaVar2.u;
                jP2 = P(ezaVar2);
            } else {
                jP = ezaVar2.u;
                jP2 = jP;
            }
            java.lang.String str3 = eum.a;
            defpackage.ffu ffuVar8 = ezaVar2.c;
            final defpackage.erh erhVar3 = new defpackage.erh(obj, i21, eqtVar2, obj2, i22, eum.C(jP), eum.C(jP2), ffuVar8.b, ffuVar8.c);
            i23 = i();
            iJ = j();
            if (this.w.b.n()) {
                defpackage.eza ezaVar4 = this.w;
                java.lang.Object obj13 = ezaVar4.c.a;
                ezaVar4.b.m(obj13, this.H);
                int iA4 = this.w.b.a(obj13);
                defpackage.erm ermVar6 = this.w.b;
                defpackage.erl erlVar5 = this.a;
                i24 = iA4;
                obj3 = ermVar6.e(i23, erlVar5, 0L).b;
                eqtVar3 = erlVar5.d;
                obj4 = obj13;
            } else {
                i24 = iJ;
                obj3 = null;
                eqtVar3 = null;
                obj4 = null;
            }
            jC = eum.C(j);
            if (this.w.c.c()) {
                jC2 = eum.C(P(this.w));
            } else {
                jC2 = jC;
            }
            defpackage.ffu ffuVar9 = this.w.c;
            final defpackage.erh erhVar4 = new defpackage.erh(obj3, i23, eqtVar3, obj4, i24, jC, jC2, ffuVar9.b, ffuVar9.c);
            this.h.c(11, new defpackage.etl() { // from class: ext
                @Override // defpackage.etl
                public final void a(java.lang.Object obj14) {
                    erg ergVar = (erg) obj14;
                    int i212 = defpackage.eyc.C;
                    int i32 = i25;
                    ergVar.s(i32);
                    ergVar.t(erhVar3, erhVar4, i32);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            i10 = i10;
            zEquals = zEquals;
        }
        if (zBooleanValue) {
            final int i212 = 0;
            this.h.c(1, new defpackage.etl() { // from class: exu
                @Override // defpackage.etl
                public final void a(java.lang.Object obj14) {
                    if (i212 != 0) {
                        int i213 = defpackage.eyc.C;
                        ((erg) obj14).x(((defpackage.eza) eqtVar).b, iIntValue);
                    } else {
                        int i214 = defpackage.eyc.C;
                        ((erg) obj14).Q((defpackage.eqt) eqtVar, iIntValue);
                    }
                }
            });
        }
        exlVar = ezaVar2.g;
        exlVar2 = ezaVar.g;
        i13 = 9;
        i14 = 10;
        if (exlVar != exlVar2) {
            etoVar = this.h;
            etoVar.c(10, new defpackage.exq(ezaVar, i13));
            if (exlVar2 != null) {
                etoVar.c(10, new defpackage.exq(ezaVar, i14));
            }
        }
        finVar = ezaVar2.j;
        finVar2 = ezaVar.j;
        if (finVar != finVar2) {
            java.lang.Object obj14 = finVar2.e;
            this.h.c(2, new defpackage.exq(ezaVar, 11));
        }
        if (!zEquals) {
            this.h.c(14, new defpackage.exq(this.q, 1));
        }
        if (i12 != 0) {
            this.h.c(i4, new defpackage.exq(ezaVar, 0));
        }
        if (i11 == 0) {
            this.h.c(-1, new defpackage.exq(ezaVar, 2));
        } else {
            this.h.c(-1, new defpackage.exq(ezaVar, 2));
        }
        i15 = 4;
        if (i11 != 0) {
            this.h.c(4, new defpackage.exq(ezaVar, 3));
        }
        i16 = 5;
        if (i10 == 0) {
            this.h.c(5, new defpackage.exq(ezaVar, i15));
        } else {
            this.h.c(5, new defpackage.exq(ezaVar, i15));
        }
        if (ezaVar2.o != ezaVar.o) {
            this.h.c(6, new defpackage.exq(ezaVar, i16));
        }
        i17 = 7;
        if (ezaVar2.k() != ezaVar.k()) {
            this.h.c(7, new defpackage.exq(ezaVar, i17));
        }
        i18 = 8;
        if (!ezaVar2.p.equals(ezaVar.p)) {
            this.h.c(12, new defpackage.exq(ezaVar, i18));
        }
        ereVar = this.p;
        eriVar = this.e;
        defpackage.ere ereVar3 = this.c;
        java.lang.String str4 = eum.a;
        boolean zY2 = eriVar.y();
        epwVar = (defpackage.epw) eriVar;
        ermVarQ = epwVar.q();
        if (ermVarQ.n()) {
            z2 = false;
        } else {
            z2 = false;
        }
        ermVarQ2 = epwVar.q();
        if (ermVarQ2.n()) {
            i20 = epwVar.i();
            defpackage.eyc eycVar3 = (defpackage.eyc) eriVar;
            eycVar3.L();
            eycVar3.L();
            if (ermVarQ2.o(i20) != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        ermVarQ3 = epwVar.q();
        if (ermVarQ3.n()) {
            z4 = false;
        } else {
            i19 = epwVar.i();
            defpackage.eyc eycVar4 = (defpackage.eyc) eriVar;
            eycVar4.L();
            eycVar4.L();
            if (ermVarQ3.j(i19, 0, false) != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        ermVarQ4 = epwVar.q();
        if (!ermVarQ4.n()) {
            z5 = z2;
            j2 = 0;
            if (ermVarQ4.e(epwVar.i(), epwVar.a, 0L).c()) {
            }
            ermVarQ5 = epwVar.q();
            if (ermVarQ5.n()) {
                z6 = false;
            } else {
                z6 = false;
            }
            zN = eriVar.q().n();
            int i32 = defpackage.erd.a;
            ygq ygqVar3 = new ygq((byte[]) null);
            defpackage.erd.b(ereVar3, ygqVar3);
            boolean z113 = !zY2;
            defpackage.erd.c(4, z113, ygqVar3);
            if (z5) {
                z7 = false;
            } else {
                z7 = false;
            }
            defpackage.erd.c(5, z7, ygqVar3);
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            defpackage.erd.c(6, z8, ygqVar3);
            if (zN) {
                z9 = false;
            } else {
                z9 = false;
            }
            defpackage.erd.c(7, z9, ygqVar3);
            if (z4) {
                z10 = false;
            } else {
                z10 = false;
            }
            defpackage.erd.c(8, z10, ygqVar3);
            if (zN) {
                z11 = false;
            } else {
                z11 = false;
            }
            defpackage.erd.c(9, z11, ygqVar3);
            defpackage.erd.c(10, z113, ygqVar3);
            if (z5) {
                z12 = false;
            } else {
                z12 = false;
            }
            defpackage.erd.c(11, z12, ygqVar3);
            if (z5) {
                z13 = false;
            } else {
                z13 = false;
            }
            defpackage.erd.c(12, z13, ygqVar3);
            ereVarA = defpackage.erd.a(ygqVar3);
            this.p = ereVarA;
            if (!ereVarA.equals(ereVar)) {
                this.h.c(13, new defpackage.exq(this, 6));
            }
            this.h.b();
            boolean z114 = ezaVar2.q;
            boolean z115 = ezaVar.q;
        }
        z5 = z2;
        j2 = 0;
        ermVarQ5 = epwVar.q();
        if (ermVarQ5.n()) {
            z6 = false;
        } else {
            z6 = false;
        }
        zN = eriVar.q().n();
        int i33 = defpackage.erd.a;
        ygq ygqVar4 = new ygq((byte[]) null);
        defpackage.erd.b(ereVar3, ygqVar4);
        boolean z116 = !zY2;
        defpackage.erd.c(4, z116, ygqVar4);
        if (z5) {
            z7 = false;
        } else {
            z7 = false;
        }
        defpackage.erd.c(5, z7, ygqVar4);
        if (z3) {
            z8 = false;
        } else {
            z8 = false;
        }
        defpackage.erd.c(6, z8, ygqVar4);
        if (zN) {
            z9 = false;
        } else {
            z9 = false;
        }
        defpackage.erd.c(7, z9, ygqVar4);
        if (z4) {
            z10 = false;
        } else {
            z10 = false;
        }
        defpackage.erd.c(8, z10, ygqVar4);
        if (zN) {
            z11 = false;
        } else {
            z11 = false;
        }
        defpackage.erd.c(9, z11, ygqVar4);
        defpackage.erd.c(10, z116, ygqVar4);
        if (z5) {
            z12 = false;
        } else {
            z12 = false;
        }
        defpackage.erd.c(11, z12, ygqVar4);
        if (z5) {
            z13 = false;
        } else {
            z13 = false;
        }
        defpackage.erd.c(12, z13, ygqVar4);
        ereVarA = defpackage.erd.a(ygqVar4);
        this.p = ereVarA;
        if (!ereVarA.equals(ereVar)) {
            this.h.c(13, new defpackage.exq(this, 6));
        }
        this.h.b();
        boolean z117 = ezaVar2.q;
        boolean z118 = ezaVar.q;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // defpackage.epw
    protected final void f(int i, long j) {
        L();
        if (i != -1) {
            ahvr.bM((boolean) ((i ^ (-1)) >>> 31));
            defpackage.erm ermVar = this.w.b;
            if (ermVar.n() || i < ermVar.c()) {
                defpackage.ezv ezvVar = this.z;
                if (!ezvVar.g) {
                    defpackage.ezm ezmVarA = ezvVar.A();
                    ezvVar.g = true;
                    ezvVar.F(ezmVarA, -1, new defpackage.ezp(18));
                }
                this.m++;
                if (y()) {
                    defpackage.etr.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    defpackage.eyh eyhVar = new defpackage.eyh(this.w);
                    eyhVar.a(1);
                    this.ag.w(eyhVar);
                    return;
                }
                defpackage.eza ezaVarR = this.w;
                int i2 = ezaVarR.f;
                if (i2 == 3 || (i2 == 4 && !ermVar.n())) {
                    ezaVarR = R(this.w, 2);
                }
                int i3 = i();
                defpackage.eza ezaVarS = S(ezaVarR, ermVar, Q(ermVar, i, j));
                this.g.f.i(3, new defpackage.eyi(ermVar, i, eum.w(j))).b();
                M(ezaVarS, 0, true, 1, O(ezaVarS), i3);
            }
        }
    }

    @Override // defpackage.eri
    public final int g() {
        L();
        if (y()) {
            return this.w.c.b;
        }
        return -1;
    }

    @Override // defpackage.eri
    public final int h() {
        L();
        if (y()) {
            return this.w.c.c;
        }
        return -1;
    }

    @Override // defpackage.eri
    public final int i() {
        L();
        int iN = N(this.w);
        if (iN == -1) {
            return 0;
        }
        return iN;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        L();
        return this.Q;
    }

    @Override // defpackage.eri
    public final int j() {
        L();
        if (!this.w.b.n()) {
            defpackage.eza ezaVar = this.w;
            return ezaVar.b.a(ezaVar.c.a);
        }
        int i = this.x;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.eri
    public final int k() {
        L();
        return this.w.f;
    }

    @Override // defpackage.eri
    public final int l() {
        L();
        return this.w.o;
    }

    @Override // defpackage.eri
    public final long m() {
        L();
        if (y()) {
            defpackage.eza ezaVar = this.w;
            return ezaVar.l.equals(ezaVar.c) ? eum.C(this.w.s) : o();
        }
        L();
        if (this.w.b.n()) {
            return this.y;
        }
        defpackage.eza ezaVar2 = this.w;
        long j = 0;
        if (ezaVar2.l.d != ezaVar2.c.d) {
            return ezaVar2.b.e(i(), this.a, 0L).b();
        }
        long j2 = ezaVar2.s;
        if (this.w.l.c()) {
            defpackage.eza ezaVar3 = this.w;
            ezaVar3.b.m(ezaVar3.l.a, this.H).k(this.w.l.b);
        } else {
            j = j2;
        }
        defpackage.eza ezaVar4 = this.w;
        return eum.C(D(ezaVar4.b, ezaVar4.l, j));
    }

    @Override // defpackage.eri
    public final long n() {
        L();
        return eum.C(O(this.w));
    }

    @Override // defpackage.eri
    public final long o() {
        L();
        if (!y()) {
            defpackage.erm ermVarQ = q();
            if (ermVarQ.n()) {
                return -9223372036854775807L;
            }
            return ermVarQ.e(i(), this.a, 0L).b();
        }
        defpackage.eza ezaVar = this.w;
        defpackage.ffu ffuVar = ezaVar.c;
        defpackage.erm ermVar = ezaVar.b;
        java.lang.Object obj = ffuVar.a;
        defpackage.erk erkVar = this.H;
        ermVar.m(obj, erkVar);
        return eum.C(erkVar.e(ffuVar.b, ffuVar.c));
    }

    @Override // defpackage.eri
    public final long p() {
        L();
        return eum.C(this.w.t);
    }

    @Override // defpackage.eri
    public final defpackage.erm q() {
        L();
        return this.w.b;
    }

    @Override // defpackage.eri
    public final defpackage.ert r() {
        L();
        return this.w.j.d;
    }

    @Override // defpackage.eri
    public final void s(erg ergVar) {
        ahvr.ci(ergVar);
        this.h.a(ergVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        L();
        G(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        defpackage.fib fibVar;
        L();
        if (z != this.Q) {
            this.Q = z;
            if (!this.S.b.isEmpty()) {
                defpackage.fih fihVar = (defpackage.fih) this.F;
                defpackage.fib fibVar2 = fihVar.c;
                if (z) {
                    this.R = fibVar2.I;
                    aihd aihdVar = this.S.b;
                    defpackage.fia fiaVar = new defpackage.fia(fibVar2);
                    ailj ailjVarK = aihdVar.k();
                    while (ailjVarK.hasNext()) {
                        java.lang.Integer num = (java.lang.Integer) ailjVarK.next();
                        num.intValue();
                        fiaVar.v.add(num);
                    }
                    fibVar = new defpackage.fib(fiaVar);
                } else {
                    defpackage.fia fiaVar2 = new defpackage.fia(fibVar2);
                    aihd aihdVar2 = this.R;
                    fiaVar2.v.clear();
                    fiaVar2.v.addAll(aihdVar2);
                    defpackage.fib fibVar3 = new defpackage.fib(fiaVar2);
                    this.R = null;
                    fibVar = fibVar3;
                }
                if (!fibVar.equals(fibVar2)) {
                    fihVar.f(fibVar);
                    defpackage.fia fiaVar3 = new defpackage.fia(fihVar.c);
                    fiaVar3.b(fibVar);
                    fihVar.f(new defpackage.fib(fiaVar3));
                }
            }
            defpackage.eyj eyjVar = this.g;
            eyjVar.f.i(36, java.lang.Boolean.valueOf(z)).b();
            defpackage.eza ezaVar = this.w;
            J(ezaVar.m, ezaVar.n);
        }
    }

    @Override // defpackage.eri
    public final void t() {
        L();
        defpackage.eza ezaVar = this.w;
        if (ezaVar.f == 1) {
            defpackage.eza ezaVarG = ezaVar.g(null);
            defpackage.eza ezaVarR = R(ezaVarG, true != ezaVarG.b.n() ? 2 : 4);
            this.m++;
            this.g.f.h(29).b();
            M(ezaVarR, 1, false, 5, -9223372036854775807L, -1);
        }
    }

    @Override // defpackage.eri
    public final void u(erg ergVar) {
        L();
        ahvr.ci(ergVar);
        defpackage.eto etoVar = this.h;
        etoVar.f();
        java.util.concurrent.CopyOnWriteArraySet<defpackage.etn> copyOnWriteArraySet = etoVar.c;
        for (defpackage.etn etnVar : copyOnWriteArraySet) {
            if (etnVar.a.equals(ergVar)) {
                etnVar.a(etoVar.b);
                copyOnWriteArraySet.remove(etnVar);
            }
        }
    }

    @Override // defpackage.eri
    public final void v(boolean z) {
        L();
        J(z, 1);
    }

    @Override // defpackage.eri
    public final void w() {
        L();
        I(null);
        aify aifyVar = aike.a;
        long j = this.w.u;
        new defpackage.est(aifyVar);
    }

    @Override // defpackage.eri
    public final boolean x() {
        L();
        return this.w.m;
    }

    @Override // defpackage.eri
    public final boolean y() {
        L();
        return this.w.c.c();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    @Override // defpackage.eri
    public final void z(java.util.List list) {
        L();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = false;
        for (int i = 0; i < ((aike) list).d; i++) {
            arrayList.add(this.J.b((defpackage.eqt) list.get(i)));
        }
        L();
        N(this.w);
        n();
        this.m++;
        java.util.List list2 = this.i;
        list2.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            defpackage.eyx eyxVar = new defpackage.eyx((defpackage.ffw) arrayList.get(i2), this.I);
            arrayList2.add(eyxVar);
            list2.add(i2, new defpackage.eya(eyxVar.b, eyxVar.a));
        }
        this.af = this.af.A().B(arrayList2.size());
        defpackage.ewy ewyVar = new defpackage.ewy(list2, this.af);
        if (!ewyVar.n() && ewyVar.b < 0) {
            throw new defpackage.eqh();
        }
        int iG = ewyVar.g(false);
        defpackage.eza ezaVarS = S(this.w, ewyVar, Q(ewyVar, iG, -9223372036854775807L));
        int i3 = ezaVarS.f;
        if (i3 == 1) {
            i3 = 1;
        } else if (ewyVar.n()) {
            i3 = 4;
        } else if (iG == -1) {
            iG = -1;
        } else if (iG >= ewyVar.b) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        defpackage.eza ezaVarR = R(ezaVarS, i3);
        this.g.f.i(17, new defpackage.eyf(arrayList2, this.af, iG, eum.w(-9223372036854775807L))).b();
        if (!this.w.c.a.equals(ezaVarR.c.a) && !this.w.b.n()) {
            z = true;
        }
        M(ezaVarR, 0, z, 4, O(ezaVarR), -1);
    }
}
