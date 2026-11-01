package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class olc {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl");
    public final defpackage.amwu b;
    public final defpackage.aoss c;
    public final defpackage.aolr d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.zjv g;
    public final android.content.pm.PackageManager h;
    private final defpackage.aolr i;
    private final defpackage.mgu j;
    private final defpackage.rlv k;
    private final defpackage.aoir l;

    public olc(defpackage.amwu amwuVar, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.aolr aolrVar3, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zjv zjvVar, defpackage.mgu mguVar, defpackage.aais aaisVar, android.content.pm.PackageManager packageManager, defpackage.rlv rlvVar) {
        if (amwuVar == null) {
            defpackage.aooh.i("lazyDuoKitClient");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aolrVar3 == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("maxLegacyMeetClientVersionCode");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableMeetQueryInBackground");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalLogging");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        if (aaisVar == null) {
            defpackage.aooh.i("sanitizer");
        }
        if (packageManager == null) {
            defpackage.aooh.i("packageManager");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = amwuVar;
        this.c = aossVar;
        this.d = aolrVar;
        this.i = aolrVar3;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = zjvVar;
        this.j = mguVar;
        this.h = packageManager;
        this.k = rlvVar;
        this.l = new defpackage.aoiy(new defpackage.mbe(this, 17));
    }

    public static final void d(defpackage.aakh aakhVar) {
        java.lang.Throwable cause = aakhVar.getCause();
        j$.util.Objects.checkIndex(0, 6);
        if (cause != null) {
            if (cause instanceof java.util.concurrent.TimeoutException) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).k(aakhVar).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "logDuoKitExceptionCause", 299, "DialerMeetLibraryImpl.kt")).v("failed due to remote timeout exception");
                return;
            }
            if (cause instanceof android.os.DeadObjectException) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).k(aakhVar).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "logDuoKitExceptionCause", 305, "DialerMeetLibraryImpl.kt")).v("failed due to remote dead object exception");
                return;
            } else if ((cause instanceof android.os.RemoteException) || (cause instanceof defpackage.alaz) || (cause instanceof java.lang.NullPointerException)) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).k(aakhVar).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "logDuoKitExceptionCause", 309, "DialerMeetLibraryImpl.kt")).v("failed due to remote feature getting error");
                return;
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) a.d()).k(aakhVar).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "logDuoKitExceptionCause", 310, "DialerMeetLibraryImpl.kt")).v("failed due to unknown reason");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        oky okyVar;
        if (aolnVar instanceof oky) {
            okyVar = (oky) aolnVar;
            int i = okyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                okyVar.c = i - Integer.MIN_VALUE;
            } else {
                okyVar = new oky(this, aolnVar);
            }
        } else {
            okyVar = new oky(this, aolnVar);
        }
        java.lang.Object objB = okyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = okyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            okyVar.c = 1;
            objB = b(okyVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        java.lang.Integer num = (java.lang.Integer) objB;
        if (num != null) {
            if (num.intValue() == 1) {
                return defpackage.nwv.UNAVAILABLE_MISSING_PROVIDER;
            }
            if (num.intValue() == 2) {
                return defpackage.nwv.UNAVAILABLE_SIGNED_OUT;
            }
            if (num.intValue() == 3) {
                return defpackage.nwv.AVAILABLE;
            }
        }
        return defpackage.nwv.UNKNOWN_API_PROVIDER_AVAILABILITY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.okz okzVar;
        java.lang.Integer num;
        java.lang.Integer num2;
        defpackage.rmx rmxVar;
        defpackage.mgu mguVar;
        if (aolnVar instanceof defpackage.okz) {
            okzVar = (defpackage.okz) aolnVar;
            int i = okzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                okzVar.c = i - Integer.MIN_VALUE;
            } else {
                okzVar = new defpackage.okz(this, aolnVar);
            }
        } else {
            okzVar = new defpackage.okz(this, aolnVar);
        }
        java.lang.Object obj = okzVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = okzVar.c;
        java.lang.Integer num3 = null;
        try {
            try {
                if (i2 == 0) {
                    defpackage.aooc.af(obj);
                    defpackage.mgu mguVar2 = this.j;
                    defpackage.aolr aolrVar = this.d;
                    defpackage.mev mevVar = new defpackage.mev(this, (defpackage.aoln) null, 4);
                    okzVar.d = mguVar2;
                    okzVar.c = 1;
                    java.lang.Object objAj = defpackage.aoov.aj(aolrVar, mevVar, okzVar);
                    if (objAj != obj2) {
                        mguVar = mguVar2;
                        obj = objAj;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mguVar = okzVar.d;
                defpackage.aooc.af(obj);
                int iIntValue = ((java.lang.Number) obj).intValue();
                j$.util.Objects.requireNonNull(mguVar);
                num = new java.lang.Integer(new defpackage.mgi(mguVar, defpackage.mgv.OUTSIDE_CALL_MEET_AVAILABILITY, java.lang.Integer.valueOf(iIntValue), iIntValue).f());
            } catch (java.lang.Exception e) {
                if (e instanceof defpackage.aakh) {
                    d((defpackage.aakh) e);
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/meet/impl/DialerMeetLibraryImpl", "getDuoKitAvailabilityInternal", 132, "DialerMeetLibraryImpl.kt")).v("failed to get Meet availability due to unknown reason");
                }
                num = null;
            }
        } catch (defpackage.aacw | defpackage.aovk unused) {
            num = null;
        }
        defpackage.rlv rlvVar = this.k;
        if (num != null) {
            if (num.intValue() == 0) {
                rmxVar = defpackage.rmx.MEET_UNKNOWN_API_PROVIDER_AVAILABILITY;
            } else if (num.intValue() == 1) {
                rmxVar = defpackage.rmx.MEET_UNAVAILABLE_MISSING_PROVIDER;
            } else if (num.intValue() == 2) {
                rmxVar = defpackage.rmx.MEET_UNAVAILABLE_SIGNED_OUT;
            } else {
                num2 = num;
            }
            obj2 = num;
            rlvVar.o(rmxVar);
            return obj2;
        }
        num2 = null;
        if (num == null) {
            rmxVar = defpackage.rmx.MEET_AVAILABILITY_FAILED;
            obj2 = num3;
        } else if (num.intValue() == 3) {
            obj2 = num2;
            rmxVar = defpackage.rmx.MEET_AVAILABLE;
        } else {
            num3 = num;
            rmxVar = defpackage.rmx.MEET_AVAILABILITY_FAILED;
            obj2 = num3;
        }
        rlvVar.o(rmxVar);
        return obj2;
    }

    public final java.lang.Object c(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.i, new defpackage.gbm(this, (defpackage.aoln) null, 5), aolnVar);
    }

    public final defpackage.gat e() {
        return (defpackage.gat) this.l.a();
    }
}
