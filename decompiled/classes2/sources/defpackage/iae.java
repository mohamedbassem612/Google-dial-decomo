package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iae implements defpackage.hzo, defpackage.hzq, defpackage.hzn {
    @Override // defpackage.hzn
    public final ajcq a(boolean z) {
        a.bI(defpackage.iaf.a.c().m(aioa.b), "cannot manipulate mute with stub controller. Audio not controlled by the framework", "com/android/dialer/audio/impl/audiocontroller/stub/StubAudioController$StubMuteController", "setDownlinkMuted", '\\', "StubAudioController.java", zct.b);
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.hzn
    public final boolean b() {
        return false;
    }

    @Override // defpackage.hzq
    public final ajcq e(boolean z) {
        a.bI(defpackage.iaf.a.c().m(aioa.b), "cannot manipulate mute with stub controller. Audio not controlled by the framework", "com/android/dialer/audio/impl/audiocontroller/stub/StubAudioController$StubMuteController", "setUplinkMuted", 'r', "StubAudioController.java", zct.b);
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.hzq
    public final boolean f() {
        return false;
    }

    @Override // defpackage.hzo
    public final defpackage.hzn c() {
        return this;
    }

    @Override // defpackage.hzo
    public final defpackage.hzq d() {
        return this;
    }
}
