package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class stb extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.std a;

    public stb(defpackage.std stdVar) {
        j$.util.Objects.requireNonNull(stdVar);
        this.a = stdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        int i;
        ahok ahokVarF = defpackage.sns.z(context).fi().f(834, "Broadcast to WiredHeadsetManager.WiredHeadsetBroadcastReceiver");
        try {
            defpackage.sns.z(context).dQ().b(getClass(), intent, aify.p("state"));
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                boolean z = intent.getIntExtra("state", 0) == 1;
                defpackage.std stdVar = this.a;
                boolean z2 = stdVar.b;
                if (z2 != z) {
                    stdVar.b = z;
                    defpackage.ssu ssuVar = stdVar.d;
                    if (ssuVar != null) {
                        defpackage.ssu.a.b().l("com/android/dialer/playback/CallRecordingAudioManager", "onWiredHeadsetPluggedInChanged", 129, "CallRecordingAudioManager.java").L("wired headset was plugged in changed: %s -> %s", z2, z);
                        ssuVar.f.getRoute();
                        if (z) {
                            i = 4;
                        } else {
                            java.util.Iterator it = ssuVar.b.iterator();
                            while (it.hasNext()) {
                                ((com.android.dialer.playback.CallRecordingPlayer) it.next()).c(false);
                            }
                            i = ssuVar.e ? 8 : 1;
                        }
                        java.util.Iterator it2 = ssuVar.b.iterator();
                        while (it2.hasNext()) {
                            ((com.android.dialer.playback.CallRecordingPlayer) it2.next()).h(i == 8);
                        }
                        ssuVar.f(new android.telecom.CallAudioState(false, i, ssuVar.a()));
                    }
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
