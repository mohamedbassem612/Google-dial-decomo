package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fam {
    public final android.content.Context a;
    public final android.os.Handler b;
    final android.media.AudioDeviceCallback c;
    public final android.content.BroadcastReceiver d;
    public final defpackage.fak e;
    public defpackage.fai f;
    public android.media.AudioDeviceInfo g;
    public defpackage.epu h;
    public boolean i;
    public defpackage.aeic j;
    private final rai k;

    public fam(android.content.Context context, rai raiVar, defpackage.epu epuVar, android.media.AudioDeviceInfo audioDeviceInfo) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.k = raiVar;
        this.h = epuVar;
        this.g = audioDeviceInfo;
        android.os.Handler handlerAe = eum.ae();
        this.b = handlerAe;
        this.c = new defpackage.faj(this);
        this.d = new defpackage.fal(this);
        android.net.Uri uriFor = defpackage.fai.d() ? android.provider.Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.e = uriFor != null ? new defpackage.fak(this, handlerAe, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final java.util.List a() {
        defpackage.aeic aeicVar;
        if (android.os.Build.VERSION.SDK_INT < 32 || (aeicVar = this.j) == null) {
            return aike.a;
        }
        if (!aeicVar.d()) {
            return aike.a;
        }
        if (android.os.Build.VERSION.SDK_INT < 36) {
            return aify.p(252);
        }
        java.lang.Object obj = aeicVar.d;
        ahvr.ci(obj);
        return ebc$.ExternalSyntheticApiModelOutline7.m(obj).getSpatializedChannelMasks();
    }

    public final void b(defpackage.fai faiVar) {
        if (!this.i || faiVar.equals(this.f)) {
            return;
        }
        this.f = faiVar;
        defpackage.fbp fbpVar = (defpackage.fbp) this.k.a;
        fbpVar.i();
        defpackage.fai faiVar2 = fbpVar.b;
        if (faiVar2 == null || faiVar.equals(faiVar2)) {
            return;
        }
        fbpVar.b = faiVar;
        defpackage.eto etoVar = fbpVar.a;
        if (etoVar != null) {
            etoVar.e(-1, new defpackage.ezt(13));
        }
    }

    public final void c(android.media.AudioDeviceInfo audioDeviceInfo) {
        if (j$.util.Objects.equals(audioDeviceInfo, this.g)) {
            return;
        }
        this.g = audioDeviceInfo;
        b(defpackage.fai.b(this.a, this.h, audioDeviceInfo, a()));
    }

    public final void d() {
        b(defpackage.fai.b(this.a, this.h, this.g, a()));
    }
}
