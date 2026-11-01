package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpq implements adpe {
    private static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voip/VoipCallAudioManager");
    private final android.content.Context c;
    private final j$.util.Optional d;
    private final ajct e;
    private defpackage.adpr g;
    private defpackage.adph h;
    private defpackage.adps i;
    private defpackage.adpt j;
    private boolean k;
    private defpackage.vqf l;
    private defpackage.vqf m;
    private final defpackage.vqf n;
    private volatile boolean b = false;
    private j$.util.Optional f = j$.util.Optional.empty();

    public adpq(android.content.Context context, ajct ajctVar, j$.util.Optional optional) {
        this.c = context;
        this.n = new defpackage.vqf(context, (char[]) null);
        this.d = optional;
        this.e = ajctVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    private final void i() {
        if (this.f.isPresent()) {
            try {
                a.b().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipCallAudioManager", "cleanUpPoliciesAndUpdateControllersState", 132, "VoipCallAudioManager.java").v("Unregistering audio policy");
                defpackage.vqf vqfVar = this.n;
                java.lang.Object obj = this.f.get();
                java.lang.Object obj2 = vqfVar.a;
                java.lang.Class[] clsArr = defpackage.adpa.a;
                defpackage.adpa.b(android.media.AudioManager.class, "unregisterAudioPolicyAsync", new java.lang.Class[]{defpackage.adpa.a("android.media.audiopolicy.AudioPolicy")}, null, obj2, ((defpackage.vqf) obj).a);
            } catch (adpd e) {
                a.by(a.c(), "Failed to unregister audio policy", "com/google/android/libraries/micore/telephony/common/audio/voip/VoipCallAudioManager", "cleanUpPoliciesAndUpdateControllersState", (char) 135, "VoipCallAudioManager.java", e);
            }
            this.f = j$.util.Optional.empty();
        }
    }

    private final synchronized void j() {
        ahvr.bZ(this.k, "VoipCallAudioManager is not initialized");
    }

    public final int a() {
        return 16000;
    }

    public final defpackage.adpc b() {
        j();
        return this.i;
    }

    public final defpackage.adpc c() {
        j();
        return this.j;
    }

    public final defpackage.adpf d() {
        j();
        return this.g;
    }

    public final defpackage.adph e() {
        j();
        return this.h;
    }

    public final synchronized void f() {
        if (this.k) {
            a.d().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipCallAudioManager", "init", 74, "VoipCallAudioManager.java").v("init(): already initialized.");
            return;
        }
        try {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setUsage(2);
            boolean z = this.b;
            java.lang.Class[] clsArr = defpackage.adpa.a;
            defpackage.adpa.b(usage.getClass(), "setCapturePreset", defpackage.adpa.a, null, usage, 7);
            this.m = defpackage.adpa.f(defpackage.adpa.d(2, usage.build(), 0, null), new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(4).setSampleRate(android.media.AudioTrack.getNativeOutputSampleRate(0)).build());
            defpackage.vqf vqfVarF = defpackage.adpa.f(defpackage.adpa.d(1, new android.media.AudioAttributes.Builder().setUsage(2).build(), 4, java.lang.Integer.valueOf(android.os.Process.myUid())), new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(16).setSampleRate(16000).build());
            this.l = vqfVarF;
            aify aifyVarQ = aify.q(this.m, vqfVarF);
            android.content.Context context = this.c;
            defpackage.vqf vqfVarE = defpackage.adpa.e(context, aifyVarQ);
            java.lang.Object objB = defpackage.adpa.b(android.media.AudioManager.class, "registerAudioPolicy", new java.lang.Class[]{defpackage.adpa.a("android.media.audiopolicy.AudioPolicy")}, java.lang.Integer.class, this.n.a, vqfVarE.a);
            if (objB == null) {
                throw new adpd("registerAudioPolicy returned null");
            }
            int iIntValue = ((java.lang.Integer) objB).intValue();
            if (iIntValue != 0) {
                throw new adpd(a.bj(iIntValue, "registerAudioPolicy failed with error code:"));
            }
            this.f = j$.util.Optional.of(vqfVarE);
            this.h = new defpackage.adpu((defpackage.vqf) this.f.get(), this.m);
            this.j = new defpackage.adpt(context, this.h, this.e);
            this.g = new defpackage.adpr((defpackage.vqf) this.f.get(), this.l, this.d);
            defpackage.adps adpsVar = new defpackage.adps(context, this.g);
            this.i = adpsVar;
            this.g.b = adpsVar;
            this.k = true;
            a.b().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipCallAudioManager", "init", 103, "VoipCallAudioManager.java").v("init finished successfully");
        } catch (adpd e) {
            i();
            throw e;
        }
    }

    public final synchronized void g() {
        if (!this.k) {
            a.d().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipCallAudioManager", "shutdown", 109, "VoipCallAudioManager.java").v("Shutdown called although VoipCallAudioManager isn't running");
            return;
        }
        defpackage.adpt adptVar = this.j;
        if (adptVar != null) {
            adptVar.e();
        }
        defpackage.adps adpsVar = this.i;
        if (adpsVar != null) {
            adpsVar.g();
        }
        java.util.List<defpackage.afpl> list = this.g.a;
        for (defpackage.afpl afplVar : list) {
            if (afplVar.m() == 3) {
                afplVar.q();
            }
            afplVar.o();
        }
        list.clear();
        defpackage.adph adphVar = this.h;
        for (android.media.AudioTrack audioTrack : ((defpackage.adpu) adphVar).b) {
            try {
                if (audioTrack.getState() != 0 && audioTrack.getPlayState() == 3) {
                    audioTrack.stop();
                }
                audioTrack.release();
            } catch (java.lang.Exception e) {
                a.by(defpackage.adpu.a.d(), "Failed to release audio track object", "com/google/android/libraries/micore/telephony/common/audio/voip/VoipUplinkAudioTrackFactory", "shutdown", 'A', "VoipUplinkAudioTrackFactory.java", e);
            }
        }
        ((defpackage.adpu) adphVar).b.clear();
        i();
        this.k = false;
    }

    public final synchronized boolean h() {
        return this.k;
    }
}
