package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oci {
    private static final aimz a = aimz.i("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteMessagingNotifier");
    private final android.content.Context b;
    private final defpackage.odl c;
    private final rwj d;
    private final rlv e;
    private final gpd f;

    public oci(android.content.Context context, defpackage.odl odlVar, rwj rwjVar, gpd gpdVar, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(odlVar, "satelliteSOSTelephonyInfoCache");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        this.b = context;
        this.c = odlVar;
        this.d = rwjVar;
        this.f = gpdVar;
        this.e = rlvVar;
    }

    private final java.lang.String c(defpackage.oce oceVar) {
        java.lang.String string = this.b.getString(oceVar == defpackage.oce.b ? 2132020000 : 2132020008);
        aooh.e(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.ocg ocgVar;
        java.lang.String string;
        if (aolnVar instanceof defpackage.ocg) {
            ocgVar = (defpackage.ocg) aolnVar;
            int i = ocgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ocgVar.c = i - Integer.MIN_VALUE;
            } else {
                ocgVar = new defpackage.ocg(this, aolnVar);
            }
        } else {
            ocgVar = new defpackage.ocg(this, aolnVar);
        }
        java.lang.Object objA = ocgVar.a;
        aolu dvaVar = aolu.a;
        int i2 = ocgVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.odl odlVar = this.c;
            ocgVar.d = str;
            ocgVar.c = 1;
            objA = odlVar.a(ocgVar);
            if (objA != dvaVar) {
            }
            return dvaVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = ocgVar.d;
        aooc.af(objA);
        defpackage.odi odiVar = (defpackage.odi) objA;
        if (odiVar == null) {
            throw new java.lang.IllegalStateException("ConnectionEvent extras should have been provided by Telephony.");
        }
        android.content.Context context = this.b;
        dvaVar = new defpackage.dva(context, "phone_emergency_call");
        dvaVar.r = "call";
        dvaVar.j = 1;
        dvaVar.t = urg.c(context, 2130969018);
        dvaVar.n(2131231746);
        defpackage.oce oceVar = odiVar.b;
        defpackage.oce oceVar2 = defpackage.oce.a;
        if (oceVar != oceVar2) {
            string = context.getString(2132020001);
            aooh.e(string, "getString(...)");
        } else if (str == null) {
            string = context.getString(2132020009);
            aooh.e(string, "getString(...)");
        } else {
            string = context.getString(2132020010, str);
            aooh.e(string, "getString(...)");
        }
        dvaVar.h(string);
        dvaVar.g(c(oceVar));
        defpackage.duz duzVar = new defpackage.duz();
        duzVar.c(c(oceVar));
        dvaVar.o(duzVar);
        java.lang.String string2 = context.getString(oceVar == oceVar2 ? 2132020007 : 2132019999);
        aooh.e(string2, "getString(...)");
        android.app.PendingIntent pendingIntent = odiVar.a;
        aooh.f(context, "context");
        aooh.f(pendingIntent, "handoverPendingIntent");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.emergencycalling.satellitesos.impl.notification.SatelliteSOSBroadcastReceiver_Receiver.class);
        intent.setAction("com.android.dialer.DUNE_NOTIFICATION");
        intent.putExtra("DUNE_HANDOVER_PENDING_INTENT", pendingIntent);
        dvaVar.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131231746), defpackage.dva.c(string2), afap.c(context, 1, intent, 1140850688), new android.os.Bundle()));
        return dvaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, aoln aolnVar) {
        defpackage.och ochVar;
        if (aolnVar instanceof defpackage.och) {
            ochVar = (defpackage.och) aolnVar;
            int i = ochVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ochVar.c = i - Integer.MIN_VALUE;
            } else {
                ochVar = new defpackage.och(this, aolnVar);
            }
        } else {
            ochVar = new defpackage.och(this, aolnVar);
        }
        java.lang.Object objA = ochVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ochVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/notification/SatelliteMessagingNotifier", "sendSatelliteMessagingNotification", 38, "SatelliteMessagingNotifier.kt").v("enter");
            ochVar.c = 1;
            objA = a(str, ochVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        this.d.a("SatelliteMessagingNotification", ((defpackage.dva) objA).a());
        this.f.i((java.lang.String) null).b(mce.fc);
        this.e.o(rmx.nX);
        return aojh.a;
    }
}
