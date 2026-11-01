package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class kwl implements agtk {
    final /* synthetic */ defpackage.kwo a;

    public kwl(defpackage.kwo kwoVar) {
        j$.util.Objects.requireNonNull(kwoVar);
        this.a = kwoVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.kwo.a.c(), "failed to delete call recordings", "com/android/dialer/callrecording/impl/history/CallRecordingSessionFragmentPeer$1", "onFailure", 'r', "CallRecordingSessionFragmentPeer.java", th, zct.b);
        defpackage.kwo kwoVar = this.a;
        kwoVar.g.o(rmx.dw);
        agby.o(kwoVar.d.N(), 2132019854, 0).h();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        aimw aimwVarL = defpackage.kwo.a.b().l("com/android/dialer/callrecording/impl/history/CallRecordingSessionFragmentPeer$1", "onSuccess", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CallRecordingSessionFragmentPeer.java");
        defpackage.kwo kwoVar = this.a;
        aimwVarL.y("deleted call recording at %s", kwoVar.b.d);
        kwoVar.g.o(rmx.dv);
        defpackage.kwf kwfVar = new defpackage.kwf();
        defpackage.kwj kwjVar = kwoVar.d;
        ahvr.i(kwfVar, kwjVar);
        ahvr.i(new defpackage.kwg(), kwjVar);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
