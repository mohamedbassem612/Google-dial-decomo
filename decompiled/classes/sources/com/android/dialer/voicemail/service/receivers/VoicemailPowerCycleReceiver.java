package com.android.dialer.voicemail.service.receivers;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class VoicemailPowerCycleReceiver extends android.content.BroadcastReceiver {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/receivers/VoicemailPowerCycleReceiver");

    private static void a(android.content.Context context) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/receivers/VoicemailPowerCycleReceiver", "onBoot", '{', "VoicemailPowerCycleReceiver.java")).v("onBoot");
        defpackage.gus.aI();
        c(context, false);
    }

    private static void b(android.content.Context context) {
        defpackage.zjx zjxVarDR = ((defpackage.vnf) defpackage.agab.aH(context, defpackage.vnf.class)).dR();
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.vnj.class);
        aguvVarA.f(new defpackage.aguy("com.android.dialer.voicemail.service.receivers.VvmDailyWorker", 1));
        aguvVarA.e(new defpackage.aile("VvmDailyWorkerTag"));
        defpackage.agux aguxVar = new defpackage.agux(1L, java.util.concurrent.TimeUnit.DAYS);
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        aguvVarA.d(new defpackage.aguw(aguxVar, ahwtVar));
        defpackage.agsm.i(992, zjxVarDR.b(aguvVarA.a()), "Failed to schedule once a day VVM work", new java.lang.Object[0]);
        defpackage.zjx zjxVarDR2 = ((defpackage.vnf) defpackage.agab.aH(context, defpackage.vnf.class)).dR();
        defpackage.aguv aguvVarA2 = defpackage.aguz.a(defpackage.vmo.class);
        aguvVarA2.f(new defpackage.aguy("com.android.dialer.voicemail.service.metrics.VvmNotificationWorker", 4));
        aguvVarA2.e(new defpackage.aile("vvm_notification_worker"));
        aguvVarA2.d(new defpackage.aguw(new defpackage.agux(1L, java.util.concurrent.TimeUnit.DAYS), ahwtVar));
        defpackage.agsm.i(993, zjxVarDR2.b(aguvVarA2.a()), "Failed to schedule once a day VVM notification work", new java.lang.Object[0]);
    }

    private static void c(android.content.Context context, boolean z) {
        android.preference.PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit().putBoolean("com.android.voicemail.impl.is_shutting_down", z).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.vnf vnfVar = (defpackage.vnf) defpackage.agab.aH(context, defpackage.vnf.class);
        defpackage.ahok ahokVarF = vnfVar.fi().f(988, "Broadcast to VoicemailPowerCycleReceiver");
        try {
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/service/receivers/VoicemailPowerCycleReceiver", "onReceive", 61, "VoicemailPowerCycleReceiver.java")).y("onReceive with intent action: %s", intent.getAction());
            defpackage.aoin aoinVarHF = vnfVar.hF();
            defpackage.rsr rsrVarPe = vnfVar.pe();
            defpackage.zzx zzxVarOv = vnfVar.ov();
            defpackage.aoin aoinVarHH = vnfVar.hH();
            if (((java.lang.Boolean) aoinVarHH.a()).booleanValue() && zzxVarOv.m()) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/service/receivers/VoicemailPowerCycleReceiver", "onReceive", 71, "VoicemailPowerCycleReceiver.java")).v("In direct boot mode, skipping CE storage access including WorkManager scheduling and VvmPowerCycleDao access");
            } else if (j$.util.Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
                b(context);
                if (((java.lang.Boolean) aoinVarHF.a()).booleanValue()) {
                    defpackage.agsm.i(991, rsrVarPe.u(), "Failed to clear the shut down state", new java.lang.Object[0]);
                }
                a(context);
            } else if (j$.util.Objects.equals(intent.getAction(), "android.intent.action.USER_UNLOCKED")) {
                if (((java.lang.Boolean) aoinVarHH.a()).booleanValue()) {
                    b(context);
                    if (((java.lang.Boolean) aoinVarHF.a()).booleanValue()) {
                        defpackage.agsm.i(990, rsrVarPe.u(), "Failed to clear the shut down state", new java.lang.Object[0]);
                    }
                    a(context);
                }
            } else {
                if (!j$.util.Objects.equals(intent.getAction(), "android.intent.action.ACTION_SHUTDOWN")) {
                    throw new java.lang.AssertionError("unexpected action: " + intent.getAction());
                }
                if (((java.lang.Boolean) aoinVarHF.a()).booleanValue()) {
                    defpackage.agsm.i(989, ((defpackage.afhf) rsrVarPe.b).a(new vmj(5), rsrVarPe.a), "Failed to set the shut down state", new java.lang.Object[0]);
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/receivers/VoicemailPowerCycleReceiver", "onShutdown", (char) 130, "VoicemailPowerCycleReceiver.java")).v("onShutdown");
                defpackage.gus.aI();
                c(context, true);
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
