package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzx implements defpackage.hzm {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/pstn/PstnDialerMediaPlayer");
    public final java.lang.Runnable b;
    public final java.util.function.Consumer c;
    public final rlv d;
    private final aoin e;
    private final defpackage.ibo f;
    private final defpackage.oii g;

    public hzx(java.lang.Runnable runnable, java.util.function.Consumer consumer, aoin aoinVar, defpackage.ibo iboVar, uss ussVar, rlv rlvVar) {
        this.b = runnable;
        this.c = consumer;
        this.f = iboVar;
        this.g = ussVar.o();
        this.d = rlvVar;
        this.e = aoinVar;
    }

    @Override // defpackage.hzm
    public final int a() {
        return this.g.a();
    }

    @Override // defpackage.hzm
    public final void b() {
        this.g.e();
    }

    @Override // defpackage.hzm
    public final void c(java.lang.String str) {
        java.lang.String message;
        int iIndexOf;
        defpackage.fxs fxsVar = new defpackage.fxs(this, 20);
        defpackage.oii oiiVar = this.g;
        oiiVar.j(fxsVar);
        oiiVar.k(new defpackage.ant(this, 12));
        j$.util.Optional optionalA = this.f.a();
        if (!optionalA.isPresent()) {
            throw new java.lang.IllegalStateException("missing telephony device");
        }
        oiiVar.h(new android.media.AudioAttributes.Builder().setUsage(2).build());
        try {
            oiiVar.i(str);
            oiiVar.c();
            defpackage.oii oiiVar2 = this.g;
            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) optionalA.orElseThrow();
            aooh.f(audioDeviceInfo, "deviceInfo");
            boolean zM = ft$.ExternalSyntheticApiModelOutline0.m((android.media.MediaPlayer) oiiVar2.a, audioDeviceInfo);
            zjv.i((zjv) oiiVar2.c, mgv.ep, ajsz.aY(gus.au(audioDeviceInfo.getType())), gus.ax(zM), 0, 24);
            if (!zM) {
                a.c().m(aioa.b).l("com/android/dialer/audio/impl/audiocontroller/pstn/PstnDialerMediaPlayer", "start", 99, "PstnDialerMediaPlayer.java").v("setPreferredDevice() failed.");
            }
            oiiVar2.m();
        } catch (java.io.IOException e) {
            if (((java.lang.Boolean) this.e.a()).booleanValue() && (message = e.getMessage()) != null && (iIndexOf = message.indexOf("status=")) != -1) {
                try {
                    a.d().k(e).l("com/android/dialer/audio/impl/audiocontroller/pstn/PstnDialerMediaPlayer", "logStatusCodeFromIoException", 135, "PstnDialerMediaPlayer.java").y("PstnDialerMediaPlayer.start IOException status code: %s", new aepb(java.lang.Long.decode(message.substring(iIndexOf + 7).trim()).longValue()));
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            this.g.e();
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // defpackage.hzm
    public final void d() {
        try {
            this.g.n();
        } catch (java.lang.Throwable th) {
            a.bq(a.d(), "failed to stop PSTN MediaPlayer", "com/android/dialer/audio/impl/audiocontroller/pstn/PstnDialerMediaPlayer", "stop", 'r', "PstnDialerMediaPlayer.java", th, zct.b);
        }
    }
}
