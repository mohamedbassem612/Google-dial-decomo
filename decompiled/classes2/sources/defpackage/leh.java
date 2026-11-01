package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class leh implements defpackage.hxa {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.hzb a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ leh(defpackage.icm icmVar, defpackage.icc iccVar, defpackage.hzb hzbVar, int i) {
        this.$cid = i;
        this.c = icmVar;
        this.b = iccVar;
        this.a = hzbVar;
    }

    @Override // defpackage.hxa
    public final defpackage.hwz a(akzc akzcVar, int i) {
        if (this.$cid != 0) {
            defpackage.icm icmVar = (defpackage.icm) this.c;
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = icmVar.f;
            java.lang.Object obj = this.b;
            defpackage.icc iccVar = (defpackage.icc) obj;
            if (!defpackage.icm.g(concurrentHashMap, iccVar)) {
                defpackage.icm.a.b().l("com/android/dialer/audio/recorder/impl/RecorderFactoryImpl", "reader$<anonymous>", 192, "RecorderFactoryImpl.kt").y("no longer recording %s, stopping tee", obj);
                return defpackage.hwz.b;
            }
            icmVar.m.i(ahvr.ag(icmVar.d, icmVar.l, new defpackage.ick(i, akzcVar, icmVar, iccVar, this.a, null)));
            return defpackage.hwz.a;
        }
        vwb vwbVar = (vwb) this.b;
        boolean z = ((java.util.concurrent.atomic.AtomicBoolean) vwbVar.a).get();
        defpackage.hzb hzbVar = this.a;
        if (z) {
            defpackage.lei.a.b().l("com/android/dialer/callscreen/impl/recording/impl/CallRecorderImpl", "readAudioFromTee", 175, "CallRecorderImpl.java").v("CallScreen record controller stopped, stop recording");
            return defpackage.hwz.b;
        }
        if (((java.util.concurrent.atomic.AtomicBoolean) vwbVar.b).get()) {
            return defpackage.hwz.a;
        }
        java.lang.Object obj2 = this.c;
        if (i > 0) {
            try {
                ((akzb) obj2).write(new byte[i]);
            } catch (java.io.IOException e) {
                throw new java.io.UncheckedIOException("failure saving audio bytes", e);
            }
        }
        akzcVar.m((java.io.OutputStream) obj2);
        if (((akzb) obj2).a() < (hzbVar.b.getSampleRate() << 1) * 300) {
            return defpackage.hwz.a;
        }
        defpackage.lei.a.b().l("com/android/dialer/callscreen/impl/recording/impl/CallRecorderImpl", "readAudioFromTee", 191, "CallRecorderImpl.java").v("Maximum recording duration reached, stop recording");
        return defpackage.hwz.b;
    }

    public /* synthetic */ leh(vwb vwbVar, akzb akzbVar, defpackage.hzb hzbVar, int i) {
        this.$cid = i;
        this.b = vwbVar;
        this.c = akzbVar;
        this.a = hzbVar;
    }
}
