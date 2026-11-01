package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzk {
    public static final aimz a = aimz.i("com/google/android/callcoreshared/sharpie/scamdetection/impl/inference/SharpieAiCoreServiceImpl");
    public final aoss b;
    public final aoss c;
    public defpackage.ymj d;
    public defpackage.ymj e;
    public defpackage.ymk f;
    public boolean g;
    public defpackage.yza h;
    public int i;
    public final defpackage.ysu j;
    public final ahda k;

    public yzk(aoss aossVar, aoss aossVar2, defpackage.ysu ysuVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        aooh.f(ysuVar, "aiCoreClient");
        this.b = aossVar;
        this.c = aossVar2;
        this.j = ysuVar;
        this.k = new ahda((byte[]) null);
        this.i = 1;
        this.h = new defpackage.yza(-1);
    }

    public static final boolean e(defpackage.yzb yzbVar) {
        return yzbVar.b != 237;
    }

    private static final int f(defpackage.ymi ymiVar) {
        switch (ymiVar.b) {
            case 0:
                return 8;
            case 1:
            case 19:
            case 21:
            default:
                return 26;
            case 2:
            case 3:
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return 9;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case 15:
                return 14;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
            case 31:
            case 33:
            case 34:
                return 10;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return 19;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return 11;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return 12;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return 13;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
            case 17:
                return 18;
            case 16:
                return 20;
            case 18:
            case 20:
            case 29:
                return 24;
            case 22:
                return 21;
            case 23:
                return 16;
            case 24:
                return 15;
            case 25:
                return 22;
            case 26:
            case 32:
                return 23;
            case 27:
            case 28:
                return 17;
            case 30:
                return 25;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.yzf yzfVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yzf) {
            yzfVar = (defpackage.yzf) aolnVar;
            int i = yzfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yzfVar.c = i - Integer.MIN_VALUE;
            } else {
                yzfVar = new defpackage.yzf(this, aolnVar);
            }
        } else {
            yzfVar = new defpackage.yzf(this, aolnVar);
        }
        java.lang.Object obj = yzfVar.a;
        defpackage.yzd yzdVar = aolu.a;
        int i2 = yzfVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yzfVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1204, "SharpieAiCoreServiceImpl_cleanup");
            try {
                aosy aosyVarAg = ahvr.ag(this.b, this.k, new defpackage.xtn(this, (aoln) null, 8));
                yzfVar.d = ahoqVarZ;
                yzfVar.c = 1;
                java.lang.Object objA = aosyVarAg.a(yzfVar);
                if (objA != yzdVar) {
                    obj = objA;
                    ahoqVar = ahoqVarZ;
                }
                return yzdVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yzfVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        yzdVar = (defpackage.yzd) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return yzdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.yzb yzbVar, aoln aolnVar) {
        defpackage.yzg yzgVar;
        if (aolnVar instanceof defpackage.yzg) {
            yzgVar = (defpackage.yzg) aolnVar;
            int i = yzgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yzgVar.c = i - Integer.MIN_VALUE;
            } else {
                yzgVar = new defpackage.yzg(this, aolnVar);
            }
        } else {
            yzgVar = new defpackage.yzg(this, aolnVar);
        }
        java.lang.Object objA = yzgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yzgVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aosy aosyVarAm = aoov.am(this.b, 0, new defpackage.rir(this, yzbVar, (aoln) null, 13), 3);
            yzgVar.d = yzbVar;
            yzgVar.c = 1;
            objA = aosyVarAm.a(yzgVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        yzbVar = yzgVar.d;
        aooc.af(objA);
        defpackage.yzl yzlVar = (defpackage.yzl) objA;
        if (yzlVar != null) {
            return yzlVar;
        }
        aosy aosyVarAm2 = aoov.am(this.c, 0, new defpackage.yzh(this, yzbVar, (aoln) null, 0), 3);
        yzgVar.d = null;
        yzgVar.c = 2;
        java.lang.Object objA2 = aosyVarAm2.a(yzgVar);
        if (objA2 != aoluVar) {
            return objA2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.yzb yzbVar, aoln aolnVar) {
        defpackage.yzi yziVar;
        if (aolnVar instanceof defpackage.yzi) {
            yziVar = (defpackage.yzi) aolnVar;
            int i = yziVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yziVar.c = i - Integer.MIN_VALUE;
            } else {
                yziVar = new defpackage.yzi(this, aolnVar);
            }
        } else {
            yziVar = new defpackage.yzi(this, aolnVar);
        }
        java.lang.Object objD = yziVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yziVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objD);
                defpackage.ymj ymjVar = this.e;
                if (ymjVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                defpackage.ynm ynmVarA = defpackage.ynn.a();
                ynmVarA.b(ajsz.aY(new defpackage.ynk(yzbVar.a)));
                ynmVarA.f(0.0f);
                ynmVarA.g(1);
                ynmVarA.e(3);
                ynmVarA.d(256);
                ajcq ajcqVarB = ymjVar.b(ynmVarA.a());
                yziVar.c = 1;
                objD = aosv.D(ajcqVarB, yziVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = yziVar.d;
                    aooc.af(objD);
                    return new defpackage.yzl(f(e), aoil.a(e), this.h);
                }
                aooc.af(objD);
            }
            defpackage.ynp ynpVar = (defpackage.ynp) objD;
            defpackage.yza yzaVar = this.h;
            aooh.c(ynpVar);
            return new defpackage.yzm(yzaVar, ynpVar);
        } catch (defpackage.ymi e) {
            e = e;
            a.b().k(e).l("com/google/android/callcoreshared/sharpie/scamdetection/impl/inference/SharpieAiCoreServiceImpl", "runLlmInference", 118, "SharpieAiCoreServiceImpl.kt").v("Failed to query LlmService");
            aosy aosyVarAg = ahvr.ag(this.b, this.k, new uer(this, (aoln) null, 18, (byte[]) null));
            yziVar.d = e;
            yziVar.c = 2;
            if (aosyVarAg.a(yziVar) == aoluVar) {
                return aoluVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.yzb yzbVar, aoln aolnVar) {
        defpackage.yzj yzjVar;
        if (aolnVar instanceof defpackage.yzj) {
            yzjVar = (defpackage.yzj) aolnVar;
            int i = yzjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yzjVar.c = i - Integer.MIN_VALUE;
            } else {
                yzjVar = new defpackage.yzj(this, aolnVar);
            }
        } else {
            yzjVar = new defpackage.yzj(this, aolnVar);
        }
        java.lang.Object objD = yzjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yzjVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objD);
                defpackage.ymj ymjVar = this.d;
                if (ymjVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                defpackage.yoo yooVarA = defpackage.yop.a(ajsz.aY(new defpackage.yon(yzbVar.a)));
                yooVarA.d();
                yooVarA.e(1);
                yooVarA.c();
                yooVarA.b();
                ajcq ajcqVarB = ymjVar.b(yooVarA.a());
                yzjVar.c = 1;
                objD = aosv.D(ajcqVarB, yzjVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = yzjVar.d;
                    aooc.af(objD);
                    return new defpackage.yzl(f(e), aoil.a(e), this.h);
                }
                aooc.af(objD);
            }
            defpackage.yoq yoqVar = (defpackage.yoq) objD;
            defpackage.yza yzaVar = this.h;
            aooh.c(yoqVar);
            return new defpackage.yzn(yzaVar, yoqVar);
        } catch (defpackage.ymi e) {
            e = e;
            a.b().k(e).l("com/google/android/callcoreshared/sharpie/scamdetection/impl/inference/SharpieAiCoreServiceImpl", "runSummarizationInference", 101, "SharpieAiCoreServiceImpl.kt").v("Failed to query SummarizationService");
            aosy aosyVarAg = ahvr.ag(this.b, this.k, new uer(this, (aoln) null, 19, (char[]) null));
            yzjVar.d = e;
            yzjVar.c = 2;
            if (aosyVarAg.a(yzjVar) == aoluVar) {
                return aoluVar;
            }
        }
    }
}
