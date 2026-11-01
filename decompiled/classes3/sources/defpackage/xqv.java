package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xqv implements ahjr {
    private static final aimz b = aimz.i("com/android/voicemail/impl/CarrierVvmPackageModifiedReceiver");
    public final android.content.Context a;
    private final ajct c;
    private final zjv d;
    private final zzx e;

    public xqv(android.content.Context context, zzx zzxVar, ajct ajctVar, zjv zjvVar) {
        this.a = context;
        this.e = zzxVar;
        this.c = ajctVar;
        this.d = zjvVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        defpackage.xqu xquVar;
        this.d.b(getClass(), intent, aify.p("android.intent.extra.PACKAGE_NAME"));
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.PACKAGE_NAME");
        java.lang.String action = intent.getAction();
        aimz aimzVar = b;
        aimzVar.b().i(zct.a).l("com/android/voicemail/impl/CarrierVvmPackageModifiedReceiver", "onReceive", 118, "CarrierVvmPackageModifiedReceiver.java").I("action: %s package modified: %s", action, stringExtra);
        if ("com.android.internal.telephony.CARRIER_VVM_PACKAGE_INSTALLED".equals(action)) {
            xquVar = defpackage.xqu.b;
        } else if ("com.android.internal.telephony.CARRIER_VVM_PACKAGE_REMOVED".equals(action)) {
            xquVar = defpackage.xqu.c;
        } else {
            xquVar = "com.android.internal.telephony.CARRIER_VVM_PACKAGE_CHANGED".equals(action) ? defpackage.xqu.d : defpackage.xqu.a;
        }
        if (defpackage.xqu.a.equals(xquVar)) {
            aimzVar.b().l("com/android/voicemail/impl/CarrierVvmPackageModifiedReceiver", "onReceive", 122, "CarrierVvmPackageModifiedReceiver.java").v("Unknown package action, ignoring");
            return ajcm.a;
        }
        if (!this.e.m()) {
            return ahvr.E(new opo(this, stringExtra, xquVar, 16), this.c);
        }
        aimzVar.b().l("com/android/voicemail/impl/CarrierVvmPackageModifiedReceiver", "onReceive", 127, "CarrierVvmPackageModifiedReceiver.java").v("In direct boot, ignoring");
        return ajcm.a;
    }
}
