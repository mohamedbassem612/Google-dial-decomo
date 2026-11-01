package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iar implements defpackage.hzk, defpackage.iag {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/voip/VoipDownlinkAudioRecordWrapper");
    public static final android.media.AudioFormat b = new android.media.AudioFormat.Builder().setChannelMask(16).setSampleRate(16000).setEncoding(2).build();
    public final android.media.AudioManager c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.icx e;
    private android.media.AudioRecord f;
    private defpackage.kvt g;

    public iar(android.media.AudioManager audioManager, defpackage.icx icxVar) {
        this.c = audioManager;
        this.e = icxVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    @Override // defpackage.hzk
    public final void a() throws ahzr {
        a.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoipDownlinkAudioRecordWrapper", "startRecording", 67, "VoipDownlinkAudioRecordWrapper.java").v("enter");
        try {
            defpackage.icx icxVar = this.e;
            ahvr.bZ(icxVar.a(), "reflection failed, unable to create AudioMixingRule.Builder");
            ahzi ahziVar = icxVar.c;
            java.lang.Object objNewInstance = ((defpackage.icw) ahziVar.eZ()).f.getDeclaredConstructor(null).newInstance(null);
            ((defpackage.icw) ahziVar.eZ()).g.invoke(objNewInstance, 1, new android.media.AudioAttributes.Builder().setUsage(2).build());
            ((defpackage.icw) ahziVar.eZ()).h.invoke(objNewInstance, 4, java.lang.Integer.valueOf(android.os.Process.myUid()));
            ((defpackage.icw) ahziVar.eZ()).j.invoke(objNewInstance, java.lang.Boolean.TRUE);
            java.lang.Object objInvoke = ((defpackage.icw) ahziVar.eZ()).i.invoke(objNewInstance, null);
            ahvr.bZ(icxVar.a(), "reflection failed, unable to create AudioMix.Builder");
            java.lang.Object objNewInstance2 = ((defpackage.icw) ahziVar.eZ()).b.newInstance(objInvoke);
            ((defpackage.icw) ahziVar.eZ()).c.invoke(objNewInstance2, b);
            ((defpackage.icw) ahziVar.eZ()).d.invoke(objNewInstance2, 3);
            java.lang.Object objInvoke2 = ((defpackage.icw) ahziVar.eZ()).e.invoke(objNewInstance2, null);
            ahvr.bZ(icxVar.a(), "reflection failed, unable to create AudioPolicy.Builder");
            android.content.Context context = icxVar.b;
            java.lang.Object objNewInstance3 = ((defpackage.icw) ahziVar.eZ()).l.newInstance(context);
            ((defpackage.icw) ahziVar.eZ()).m.invoke(objNewInstance3, objInvoke2);
            defpackage.kvt kvtVar = new defpackage.kvt(((defpackage.icw) ahziVar.eZ()).n.invoke(objNewInstance3, null), icxVar, (char[]) null);
            this.g = kvtVar;
            ahvr.bZ(icxVar.a(), "reflection failed");
            ((java.lang.Integer) ((defpackage.icw) ahziVar.eZ()).o.invoke(context.getSystemService(android.media.AudioManager.class), kvtVar.b)).intValue();
            defpackage.kvt kvtVar2 = this.g;
            android.media.AudioRecord audioRecord = (android.media.AudioRecord) ((defpackage.icw) ((defpackage.icx) kvtVar2.a).c.eZ()).k.invoke(kvtVar2.b, objInvoke2);
            this.f = audioRecord;
            audioRecord.startRecording();
        } catch (java.lang.ReflectiveOperationException e) {
            throw new ahzr(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    @Override // defpackage.hzk
    public final void b() throws ahzr {
        this.f.stop();
        this.f.release();
        try {
            defpackage.icx icxVar = this.e;
            defpackage.kvt kvtVar = this.g;
            ahvr.bZ(icxVar.a(), "reflection failed");
            ((defpackage.icw) icxVar.c.eZ()).p.invoke(icxVar.b.getSystemService(android.media.AudioManager.class), kvtVar.b);
        } catch (java.lang.ReflectiveOperationException e) {
            throw new ahzr(e);
        }
    }

    @Override // defpackage.hzk
    public final boolean c() {
        return this.f.getRecordingState() == 3;
    }

    @Override // defpackage.hzk
    public final int d(byte[] bArr, int i) {
        return this.f.read(bArr, 0, i, 1);
    }
}
