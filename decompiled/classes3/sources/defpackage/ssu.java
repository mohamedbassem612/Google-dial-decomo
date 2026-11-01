package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class ssu implements android.media.AudioManager.OnAudioFocusChangeListener {
    public static final aimz a = aimz.i("com/android/dialer/playback/CallRecordingAudioManager");
    public android.media.AudioManager c;
    public defpackage.std d;
    public boolean e;
    public android.telecom.CallAudioState f;
    public boolean g = false;
    public j$.util.Optional h = j$.util.Optional.empty();
    public boolean i = false;
    public final java.util.List b = new java.util.ArrayList();

    public static int b(int i, int i2) {
        if (i != 5) {
            return i;
        }
        int i3 = i2 & 5;
        if (i3 != 0) {
            return i3;
        }
        a.bI(a.c().m(aioa.b), "One of wired headset or earpiece should always be valid.", "com/android/dialer/playback/CallRecordingAudioManager", "selectWiredOrEarpiece", (char) 298, "CallRecordingAudioManager.java", zct.b);
        return 1;
    }

    private final android.media.AudioDeviceInfo i(int i) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        android.media.AudioManager audioManager = this.c;
        return i2 >= 31 ? (android.media.AudioDeviceInfo) j$.util.Collection.-EL.stream(mp$.ExternalSyntheticApiModelOutline0.m(audioManager)).filter(new defpackage.sst(i, 1)).findFirst().orElse((java.lang.Object) null) : (android.media.AudioDeviceInfo) j$.util.DesugarArrays.stream(audioManager.getDevices(2)).filter(new defpackage.sst(i, 0)).findFirst().orElse((java.lang.Object) null);
    }

    private final void j() {
        int i = android.os.Build.VERSION.SDK_INT;
        boolean z = this.i;
        if (i < 31) {
            android.media.AudioManager audioManager = this.c;
            if (z) {
                audioManager.startBluetoothSco();
                this.c.setBluetoothScoOn(true);
                return;
            } else {
                audioManager.setBluetoothScoOn(false);
                if (this.c.isBluetoothScoOn()) {
                    this.c.stopBluetoothSco();
                    return;
                }
                return;
            }
        }
        if (z) {
            android.media.AudioDeviceInfo audioDeviceInfoI = i(7);
            if (audioDeviceInfoI != null) {
                mp$.ExternalSyntheticApiModelOutline0.m(this.c, audioDeviceInfoI);
                return;
            } else {
                a.bI(a.d(), "startBluetooth called but no bluetooth supported devices detected.", "com/android/dialer/playback/CallRecordingAudioManager", "applyBluetoothScoState", (char) 217, "CallRecordingAudioManager.java", zct.b);
                return;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfoM = rk$.ExternalSyntheticApiModelOutline0.m(this.c);
        if (audioDeviceInfoM == null || audioDeviceInfoM.getType() != 7) {
            return;
        }
        mp$.ExternalSyntheticApiModelOutline0.m(this.c);
    }

    private final void k(boolean z) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "turnOnSpeaker", 335, "CallRecordingAudioManager.java").y("turning speaker phone on: %s", java.lang.Boolean.valueOf(z));
        if (android.os.Build.VERSION.SDK_INT < 31) {
            this.c.setSpeakerphoneOn(z);
            return;
        }
        if (z) {
            android.media.AudioDeviceInfo audioDeviceInfoI = i(2);
            if (audioDeviceInfoI != null) {
                mp$.ExternalSyntheticApiModelOutline0.m(this.c, audioDeviceInfoI);
                return;
            } else {
                aimzVar.d().l("com/android/dialer/playback/CallRecordingAudioManager", "turnOnSpeaker", 343, "CallRecordingAudioManager.java").v("turnOnSpeaker called but no speaker devices detected.");
                return;
            }
        }
        android.media.AudioDeviceInfo audioDeviceInfoM = rk$.ExternalSyntheticApiModelOutline0.m(this.c);
        if (audioDeviceInfoM == null || audioDeviceInfoM.getType() != 2) {
            return;
        }
        mp$.ExternalSyntheticApiModelOutline0.m(this.c);
    }

    public final int a() {
        return this.d.b ? 12 : 9;
    }

    public final void c() {
        g(false);
        this.c.abandonAudioFocus(this);
    }

    public final void d(boolean z) {
        if (this.h.isPresent()) {
            boolean zIsHeld = ((android.os.PowerManager.WakeLock) this.h.orElseThrow()).isHeld();
            aimz aimzVar = a;
            if (!zIsHeld) {
                aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "disableProximitySensor", 380, "CallRecordingAudioManager.java").v("proximity wake lock already released");
                return;
            }
            aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "disableProximitySensor", 384, "CallRecordingAudioManager.java").v("releasing proximity wake lock");
            try {
                ((android.os.PowerManager.WakeLock) this.h.orElseThrow()).release(z ? 1 : 0);
            } catch (java.lang.RuntimeException e) {
                a.bq(a.d(), "proximity wake lock already released", "com/android/dialer/playback/CallRecordingAudioManager", "disableProximitySensor", (char) 397, "CallRecordingAudioManager.java", e, zct.b);
            }
        }
    }

    public final void e(int i) {
        android.telecom.CallAudioState.audioRouteToString(i);
        int iB = b(i, this.f.getSupportedRouteMask());
        if ((this.f.getSupportedRouteMask() | iB) == 0) {
            a.d().i(zct.b).l("com/android/dialer/playback/CallRecordingAudioManager", "setAudioRoute", 260, "CallRecordingAudioManager.java").w("Asking to set to a route that is unsupported: %s", iB);
        } else {
            this.e = iB == 8;
            f(new android.telecom.CallAudioState(false, iB, this.f.getSupportedRouteMask()));
        }
    }

    public final void f(android.telecom.CallAudioState callAudioState) {
        android.telecom.CallAudioState callAudioState2 = this.f;
        this.f = callAudioState;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "setSystemAudioState", 310, "CallRecordingAudioManager.java").I("changing from %s to %s", callAudioState2, this.f);
        int i = 4;
        if (this.f.getRoute() == 8) {
            k(true);
        } else if (this.f.getRoute() == 1 || this.f.getRoute() == 4) {
            k(false);
            j();
        }
        if (j$.util.Collection.-EL.stream(this.b).anyMatch(new defpackage.sqj(i))) {
            aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "setSystemAudioState", 328, "CallRecordingAudioManager.java").v("Active player found, updating proximityWakeLock");
            h();
        }
    }

    public final void g(boolean z) {
        boolean z2 = false;
        if (z && i(7) != null) {
            z2 = true;
        }
        this.i = z2;
        j();
    }

    public final void h() {
        if (this.h.isPresent()) {
            if (b(this.f.getRoute(), this.f.getSupportedRouteMask()) != 1) {
                a.b().l("com/android/dialer/playback/CallRecordingAudioManager", "updateProximityWakeLock", 412, "CallRecordingAudioManager.java").v("Current route is not earpiece, disable proximity sensor");
                d(false);
                return;
            }
            boolean zIsHeld = ((android.os.PowerManager.WakeLock) this.h.orElseThrow()).isHeld();
            aimz aimzVar = a;
            if (zIsHeld) {
                aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "updateProximityWakeLock", 419, "CallRecordingAudioManager.java").v("proximity wake lock already acquired");
                return;
            }
            aimzVar.b().l("com/android/dialer/playback/CallRecordingAudioManager", "updateProximityWakeLock", 423, "CallRecordingAudioManager.java").v("acquiring proximity wake lock");
            android.os.PowerManager.WakeLock wakeLock = (android.os.PowerManager.WakeLock) this.h.orElseThrow();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
            wakeLock.acquire(600000L);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        for (com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer : this.b) {
            if (i == 1) {
                callRecordingPlayer.j();
            } else {
                callRecordingPlayer.c(false);
            }
        }
    }
}
