package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hmd {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater");
    public static final java.util.List b = defpackage.ajsz.bb("android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.READ_PHONE_STATE", "android.permission.MODIFY_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.POST_NOTIFICATIONS");
    public final android.content.Context c;
    public final defpackage.aoss d;
    public final defpackage.aolr e;
    public final defpackage.zrw f;
    public final defpackage.ecx g;
    public final defpackage.ahda h;

    public hmd(android.content.Context context, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.zrw zrwVar, defpackage.ecx ecxVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        this.c = context;
        this.d = aossVar;
        this.e = aolrVar;
        this.f = zrwVar;
        this.g = ecxVar;
        this.h = new defpackage.ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(boolean z, defpackage.aoln aolnVar) {
        hmc hmcVar;
        if (aolnVar instanceof hmc) {
            hmcVar = (hmc) aolnVar;
            int i = hmcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmcVar.c = i - Integer.MIN_VALUE;
            } else {
                hmcVar = new hmc(this, aolnVar);
            }
        } else {
            hmcVar = new hmc(this, aolnVar);
        }
        java.lang.Object obj = hmcVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hmcVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.g;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 1, (byte[]) null);
            hmcVar.c = 1;
            if (ecxVar.a(jblVar, hmcVar) == aoluVar) {
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
