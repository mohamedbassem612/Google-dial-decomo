package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hrj implements defpackage.hrb {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.aimz e = defpackage.aimz.i("com/android/dialer/androidautostatuslookup/impl/AndroidAutoStatusLookupImpl");
    private static final j$.time.Duration f = defpackage.aiql.N(100);
    public final defpackage.aoss a;
    public final defpackage.zpm b;
    public final defpackage.apni c;
    private final defpackage.aoss g;
    private final defpackage.aosy h;
    private final defpackage.ipc i;

    public hrj(defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.ipc ipcVar, defpackage.zpm zpmVar, defpackage.apni apniVar) {
        if (aossVar == null) {
            defpackage.aooh.i("mainScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        this.g = aossVar;
        this.a = aossVar2;
        this.i = ipcVar;
        this.b = zpmVar;
        this.c = apniVar;
        this.h = defpackage.aoov.am(aossVar, 0, new defpackage.dgz(this, (defpackage.aoln) null, 12), 3);
    }

    public static final pub e(apqr apqrVar) {
        return ((hrd) apqrVar.a(hrd.class)).ct();
    }

    @Override // defpackage.hrb
    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.a, 0, new hnt(this, (defpackage.aoln) null, 7), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hrb
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.hrh hrhVar;
        if (aolnVar instanceof defpackage.hrh) {
            hrhVar = (defpackage.hrh) aolnVar;
            int i = hrhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrhVar.c = i - Integer.MIN_VALUE;
            } else {
                hrhVar = new defpackage.hrh(this, aolnVar);
            }
        } else {
            hrhVar = new defpackage.hrh(this, aolnVar);
        }
        java.lang.Object objA = hrhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hrhVar.c;
        boolean z = false;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                defpackage.aosy aosyVar = this.h;
                hrhVar.c = 1;
                objA = aosyVar.a(hrhVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objA);
            }
            defpackage.enf enfVar = (defpackage.enf) objA;
            if (enfVar.e != defpackage.enf.a) {
                java.lang.Object objD = enfVar.d();
                if (objD == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                int iIntValue = ((java.lang.Number) objD).intValue();
                ((defpackage.aimw) ((defpackage.aimw) e.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/androidautostatuslookup/impl/AndroidAutoStatusLookupImpl", "isAndroidAutoConnected", 97, "AndroidAutoStatusLookupImpl.kt")).w("Android Auto connected in %d mode", iIntValue);
                if (iIntValue == 2) {
                    z = true;
                }
            } else {
                ((defpackage.aimw) ((defpackage.aimw) e.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/androidautostatuslookup/impl/AndroidAutoStatusLookupImpl", "isAndroidAutoConnected", 103, "AndroidAutoStatusLookupImpl.kt")).v("Android Auto connection type is not initialized. Didn't receive a callback from CarConnection within timeout");
            }
        } catch (java.lang.Exception e2) {
            ((defpackage.aimw) ((defpackage.aimw) e.d()).k(e2).l("com/android/dialer/androidautostatuslookup/impl/AndroidAutoStatusLookupImpl", "isAndroidAutoConnected", 112, "AndroidAutoStatusLookupImpl.kt")).v("isAndroidAutoConnected failed with an exception, returning false");
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.enf enfVar, defpackage.aoln aolnVar) {
        defpackage.hrf hrfVar;
        if (aolnVar instanceof defpackage.hrf) {
            hrfVar = (defpackage.hrf) aolnVar;
            int i = hrfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrfVar.c = i - Integer.MIN_VALUE;
            } else {
                hrfVar = new defpackage.hrf(this, aolnVar);
            }
        } else {
            hrfVar = new defpackage.hrf(this, aolnVar);
        }
        java.lang.Object obj = hrfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hrfVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                j$.time.Duration duration = f;
                long j = defpackage.aorh.j(defpackage.aooh.B(duration.getSeconds(), defpackage.aorj.SECONDS), defpackage.aooh.A(duration.getNano(), defpackage.aorj.NANOSECONDS));
                defpackage.bur burVar = new defpackage.bur(this, enfVar, (defpackage.aoln) null, 13);
                hrfVar.c = 1;
                if (defpackage.aooh.K(defpackage.aosv.h(j), burVar, hrfVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
        } catch (defpackage.aovk unused) {
            ((defpackage.aimw) e.b().l("com/android/dialer/androidautostatuslookup/impl/AndroidAutoStatusLookupImpl", "awaitCallbackWithTimeout", 133, "AndroidAutoStatusLookupImpl.kt")).v("liveData timeout exception.");
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.hrg hrgVar;
        if (aolnVar instanceof defpackage.hrg) {
            hrgVar = (defpackage.hrg) aolnVar;
            int i = hrgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrgVar.d = i - Integer.MIN_VALUE;
            } else {
                hrgVar = new defpackage.hrg(this, aolnVar);
            }
        } else {
            hrgVar = new defpackage.hrg(this, aolnVar);
        }
        java.lang.Object obj = hrgVar.b;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = hrgVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = hrgVar.a;
            defpackage.aooc.af(obj);
            return obj3;
        }
        defpackage.aooc.af(obj);
        defpackage.gus.aI();
        defpackage.ipc ipcVar = this.i;
        defpackage.gus.aI();
        java.lang.Object obj4 = ipcVar.a;
        j$.util.Objects.requireNonNull(obj4);
        defpackage.enf uhVar = ((android.content.Context) j$.util.Objects.requireNonNull(obj4)).getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new uh() : new defpackage.uk((android.content.Context) obj4);
        hrgVar.a = uhVar;
        hrgVar.d = 1;
        return c(uhVar, hrgVar) != obj2 ? uhVar : obj2;
    }
}
