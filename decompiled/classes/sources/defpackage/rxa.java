package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rxa {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/missedcalls/MissedCallNotificationCanceller");
    private final defpackage.rwi b;

    public rxa(defpackage.rwi rwiVar) {
        if (rwiVar == null) {
            defpackage.aooh.i("dialerNotificationManager");
        }
        this.b = rwiVar;
    }

    public final defpackage.ajcq a() {
        return this.b.e("MissedCallGroup");
    }

    public final defpackage.ajcq b(android.net.Uri uri) {
        if (uri == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/notification/missedcalls/MissedCallNotificationCanceller", "cancelSingleFuture", 67, "MissedCallNotificationCanceller.kt")).v("unable to cancel notification, uri is null");
            return defpackage.ajcm.a;
        }
        defpackage.rwi rwiVar = this.b;
        java.util.Objects.toString(uri);
        return rwiVar.d("MissedCall_".concat(uri.toString()), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        rwy rwyVar;
        if (aolnVar instanceof rwy) {
            rwyVar = (rwy) aolnVar;
            int i = rwyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwyVar.c = i - Integer.MIN_VALUE;
            } else {
                rwyVar = new rwy(this, aolnVar);
            }
        } else {
            rwyVar = new rwy(this, aolnVar);
        }
        java.lang.Object obj = rwyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rwyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ajcq ajcqVarA = a();
            rwyVar.c = 1;
            if (defpackage.aosv.D(ajcqVarA, rwyVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(long j, defpackage.aoln aolnVar) {
        rwz rwzVar;
        if (aolnVar instanceof rwz) {
            rwzVar = (rwz) aolnVar;
            int i = rwzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwzVar.c = i - Integer.MIN_VALUE;
            } else {
                rwzVar = new rwz(this, aolnVar);
            }
        } else {
            rwzVar = new rwz(this, aolnVar);
        }
        java.lang.Object obj = rwzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rwzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ajcq ajcqVarD = this.b.d(defpackage.snl.ad(j), 1);
            rwzVar.c = 1;
            if (defpackage.aosv.D(ajcqVarD, rwzVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
