package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hsr {
    public static final aimz a = aimz.i("com/android/dialer/app/calllog/MissedCallLogUpdater");
    public final ojo b;
    private final aolr c;
    private final aoss d;
    private final zrw e;
    private final zzx f;
    private final apni g;

    public hsr(aolr aolrVar, aoss aossVar, apni apniVar, ojo ojoVar, zzx zzxVar, zrw zrwVar) {
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(ojoVar, "dialerContentResolver");
        this.c = aolrVar;
        this.d = aossVar;
        this.g = apniVar;
        this.b = ojoVar;
        this.f = zzxVar;
        this.e = zrwVar;
    }

    public final java.lang.Object a(aoln aolnVar) {
        java.lang.Object objB = b(null, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.net.Uri uri, aoln aolnVar) {
        defpackage.hsq hsqVar;
        java.lang.Object obj;
        aolr aolrVar;
        defpackage.amh amhVar;
        if (aolnVar instanceof defpackage.hsq) {
            hsqVar = (defpackage.hsq) aolnVar;
            int i = hsqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsqVar.d = i - Integer.MIN_VALUE;
            } else {
                hsqVar = new defpackage.hsq(this, aolnVar);
            }
        } else {
            hsqVar = new defpackage.hsq(this, aolnVar);
        }
        defpackage.hsq hsqVar2 = hsqVar;
        java.lang.Object objS = hsqVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = hsqVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = hsqVar2.a;
                aooc.af(objS);
            } else if (i2 == 2) {
                obj = hsqVar2.a;
                aooc.af(objS);
                if (!((java.lang.Boolean) objS).booleanValue()) {
                    a.b().l("com/android/dialer/app/calllog/MissedCallLogUpdater", "markMissedCallsInCallLogAsRead", 88, "MissedCallLogUpdater.kt").v("markMissedCallsInCallLogAsRead no call log write permission");
                    return aojh.a;
                }
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("new", new java.lang.Integer(0));
                contentValues.put("is_read", new java.lang.Integer(1));
                aolrVar = this.c;
                amhVar = new defpackage.amh(this, (android.net.Uri) obj, contentValues, (aoln) null, 20);
                hsqVar2.a = null;
                hsqVar2.d = 3;
                if (aoov.aj(aolrVar, amhVar, hsqVar2) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objS);
            }
            return aojh.a;
        }
        aooc.af(objS);
        if (this.f.m()) {
            a.b().l("com/android/dialer/app/calllog/MissedCallLogUpdater", "markMissedCallsInCallLogAsRead", 80, "MissedCallLogUpdater.kt").v("markMissedCallsInCallLogAsRead locked");
            return aojh.a;
        }
        zrw zrwVar = this.e;
        hsqVar2.a = uri;
        hsqVar2.d = 1;
        objS = zrwVar.s(hsqVar2);
        if (objS == aoluVar) {
            return aoluVar;
        }
        obj = uri;
        if (!((java.lang.Boolean) objS).booleanValue()) {
            a.b().l("com/android/dialer/app/calllog/MissedCallLogUpdater", "markMissedCallsInCallLogAsRead", 84, "MissedCallLogUpdater.kt").v("markMissedCallsInCallLogAsRead no phone permission");
            return aojh.a;
        }
        zrw zrwVar2 = this.e;
        hsqVar2.a = obj;
        hsqVar2.d = 2;
        objS = zrwVar2.k(hsqVar2);
        if (objS == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objS).booleanValue()) {
            a.b().l("com/android/dialer/app/calllog/MissedCallLogUpdater", "markMissedCallsInCallLogAsRead", 88, "MissedCallLogUpdater.kt").v("markMissedCallsInCallLogAsRead no call log write permission");
            return aojh.a;
        }
        android.content.ContentValues contentValues2 = new android.content.ContentValues();
        contentValues2.put("new", new java.lang.Integer(0));
        contentValues2.put("is_read", new java.lang.Integer(1));
        aolrVar = this.c;
        amhVar = new defpackage.amh(this, (android.net.Uri) obj, contentValues2, (aoln) null, 20);
        hsqVar2.a = null;
        hsqVar2.d = 3;
        if (aoov.aj(aolrVar, amhVar, hsqVar2) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final void c(android.net.Uri uri) {
        this.g.i(aoov.an(this.d, (aolr) null, 0, new huk(this, uri, (aoln) null, 1), 3));
    }
}
