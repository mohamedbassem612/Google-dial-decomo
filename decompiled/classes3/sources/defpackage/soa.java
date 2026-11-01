package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class soa implements ahjr {
    public static final aimz a = aimz.i("com/android/dialer/peertopeer/transport/rcs/inbound/NewRcsMessageListener");
    public final defpackage.zgn b;
    public final defpackage.zgx c;
    public final rlv d;
    public final defpackage.abtr e;
    public final defpackage.uyg f;
    private final aoss g;
    private final zjv h;
    private final defpackage.zoe i;

    public soa(aoss aossVar, defpackage.zoe zoeVar, defpackage.uyg uygVar, defpackage.zgn zgnVar, zjv zjvVar, defpackage.abtr abtrVar, defpackage.zgx zgxVar, rlv rlvVar, defpackage.rdp rdpVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(uygVar, "messageReceiver");
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(abtrVar, "rcsDeliveryTracker");
        aooh.f(zgxVar, "messageSender");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(rdpVar, "flagValues");
        this.g = aossVar;
        this.i = zoeVar;
        this.f = uygVar;
        this.b = zgnVar;
        this.h = zjvVar;
        this.e = abtrVar;
        this.c = zgxVar;
        this.d = rlvVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        java.lang.String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return ajcm.a;
        }
        if (aooh.n(action, "com.google.android.apps.messaging.external.p2p.impl.transportation.NEW_MESSAGE_NOTIFICATION")) {
            zjv.g(this.h, getClass(), intent, (java.util.List) null, 12);
            return aosv.F(this.g, 0, new defpackage.snz(this, null), 3);
        }
        a.d().l("com/android/dialer/peertopeer/transport/rcs/inbound/NewRcsMessageListener", "onReceive", 53, "NewRcsMessageListener.kt").v("The intent is unsupported.");
        return ajcm.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.zfd zfdVar, defpackage.zff zffVar, defpackage.zgf zgfVar, aoln aolnVar) {
        defpackage.sny snyVar;
        defpackage.zdt zdtVar;
        defpackage.zfd zfdVar2;
        defpackage.zdv zdvVar;
        if (aolnVar instanceof defpackage.sny) {
            snyVar = (defpackage.sny) aolnVar;
            int i = snyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                snyVar.c = i - Integer.MIN_VALUE;
            } else {
                snyVar = new defpackage.sny(this, aolnVar);
            }
        } else {
            snyVar = new defpackage.sny(this, aolnVar);
        }
        java.lang.Object obj = snyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = snyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.zdv zdvVarB = defpackage.zdv.b(zgfVar.b);
            if (zdvVarB == null) {
                zdvVarB = defpackage.zdv.UNRECOGNIZED;
            }
            aoin aoinVar = (aoin) ((zzx) this.i.a).k().get(zdvVarB);
            zdtVar = aoinVar != null ? (defpackage.zdt) aoinVar.a() : null;
            if (zdtVar == null) {
                a.d().l("com/android/dialer/peertopeer/transport/rcs/inbound/NewRcsMessageListener", "forwardDataToChannel", 140, "NewRcsMessageListener.kt").y("No CapabilityDataCommander is found for the capability: %s", zdvVarB);
                return java.lang.Boolean.FALSE;
            }
            byte[] bArrD = zgfVar.c.D();
            snyVar.d = zfdVar;
            snyVar.e = zffVar;
            snyVar.f = zdvVarB;
            snyVar.g = zdtVar;
            snyVar.c = 1;
            java.lang.Object objA = zdtVar.a(bArrD, snyVar);
            if (objA != aoluVar) {
                zfdVar2 = zfdVar;
                zdvVar = zdvVarB;
                obj = objA;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return obj;
        }
        zdtVar = snyVar.g;
        zdvVar = snyVar.f;
        zffVar = snyVar.e;
        zfdVar2 = snyVar.d;
        aooc.af(obj);
        albh albhVar = (albh) obj;
        if (albhVar == null) {
            a.d().l("com/android/dialer/peertopeer/transport/rcs/inbound/NewRcsMessageListener", "forwardDataToChannel", 134, "NewRcsMessageListener.kt").y("No decoder is found for the capability: %s", zdvVar);
            return java.lang.Boolean.FALSE;
        }
        snyVar.d = null;
        snyVar.e = null;
        snyVar.f = null;
        snyVar.g = null;
        snyVar.c = 2;
        java.lang.Object objD = zdtVar.d(zffVar, zfdVar2, albhVar, snyVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }
}
