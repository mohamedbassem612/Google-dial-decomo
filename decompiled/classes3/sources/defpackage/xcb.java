package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xcb extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.xcc a;

    public xcb(defpackage.xcc xccVar) {
        j$.util.Objects.requireNonNull(xccVar);
        this.a = xccVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.xcc xccVar = this.a;
        ahok ahokVarF = xccVar.f.f(1171, "Broadcast to HoldForMeCallVolumeMonitor.VolumeChangeBroadcastReceiver");
        try {
            xccVar.g.b(getClass(), intent, aify.r("android.media.EXTRA_VOLUME_STREAM_TYPE", "android.media.EXTRA_VOLUME_STREAM_VALUE", "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE"));
            int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
            int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
            int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
            aihd aihdVar = defpackage.xcc.b;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(intExtra);
            if (aihdVar.contains(numValueOf)) {
                defpackage.xcc.a.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/service/callvolumemonitor/HoldForMeCallVolumeMonitor$VolumeChangeBroadcastReceiver", "onReceive", 133, "HoldForMeCallVolumeMonitor.java").M("volume changed [stream: %d; vol: %d -> %d]", numValueOf, java.lang.Integer.valueOf(intExtra3), java.lang.Integer.valueOf(intExtra2));
                if (intExtra2 != 2) {
                    android.media.AudioManager audioManager = xccVar.d;
                    audioManager.setStreamVolume(intExtra, 2, 0);
                    audioManager.adjustStreamVolume(intExtra, -100, 0);
                    agsm.i(1172, xccVar.c.c(), "failed to stop ringing", new java.lang.Object[0]);
                }
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
