package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icw {
    public final boolean a;
    public java.lang.reflect.Constructor b;
    public java.lang.reflect.Method c;
    public java.lang.reflect.Method d;
    public java.lang.reflect.Method e;
    public java.lang.Class f;
    public java.lang.reflect.Method g;
    public java.lang.reflect.Method h;
    public java.lang.reflect.Method i;
    public java.lang.reflect.Method j;
    public java.lang.reflect.Method k;
    public java.lang.reflect.Constructor l;
    public java.lang.reflect.Method m;
    public java.lang.reflect.Method n;
    public java.lang.reflect.Method o;
    public java.lang.reflect.Method p;
    private java.lang.Class q;

    public icw() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.media.audiopolicy.AudioMix");
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.media.audiopolicy.AudioMixingRule");
            java.lang.Class<?> cls3 = java.lang.Class.forName("android.media.audiopolicy.AudioPolicy");
            java.lang.Class<?> cls4 = java.lang.Class.forName("android.media.audiopolicy.AudioMix$Builder");
            this.b = cls4.getConstructor(cls2);
            this.c = cls4.getMethod("setFormat", android.media.AudioFormat.class);
            this.d = cls4.getMethod("setRouteFlags", java.lang.Integer.TYPE);
            this.e = cls4.getMethod("build", null);
            java.lang.Class<?> cls5 = java.lang.Class.forName("android.media.audiopolicy.AudioMixingRule$Builder");
            this.f = cls5;
            this.g = cls5.getMethod("addMixRule", java.lang.Integer.TYPE, java.lang.Object.class);
            this.h = this.f.getMethod("excludeMixRule", java.lang.Integer.TYPE, java.lang.Object.class);
            this.j = this.f.getMethod("allowPrivilegedPlaybackCapture", java.lang.Boolean.TYPE);
            this.i = this.f.getMethod("build", null);
            cls3.getMethod("createAudioTrackSource", cls);
            this.k = cls3.getMethod("createAudioRecordSink", cls);
            java.lang.Class<?> cls6 = java.lang.Class.forName("android.media.audiopolicy.AudioPolicy$Builder");
            this.q = cls6;
            this.l = cls6.getConstructor(android.content.Context.class);
            this.m = this.q.getMethod("addMix", cls);
            this.n = this.q.getDeclaredMethod("build", null);
            this.o = android.media.AudioManager.class.getMethod("registerAudioPolicy", cls3);
            this.p = android.media.AudioManager.class.getMethod("unregisterAudioPolicyAsync", cls3);
            android.media.AudioAttributes.Builder.class.getMethod("setCapturePreset", java.lang.Integer.TYPE);
            this.a = true;
        } catch (java.lang.ReflectiveOperationException e) {
            a.bq(defpackage.icx.a.c(), "unable to initialize AudioSystemApiImpl", "com/android/dialer/audio/systemapi/AudioSystemApi$Reflector", "<init>", 'p', "AudioSystemApi.java", e, zct.b);
            this.a = false;
        }
    }
}
