package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pvl implements defpackage.znf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ pvl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znf
    public final void a() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.pvf pvfVar = (defpackage.pvf) this.a;
                pvfVar.p.set(false);
                if (!pvfVar.t.l().isPresent() || pvfVar.o.get() == defpackage.pur.a) {
                    return;
                }
                defpackage.pvf.a.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onVideoCallChanged", 397, "CameraController.java").v("resync camera because of VideoCall change");
                pvfVar.g();
                return;
            }
            defpackage.pxh.a.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "onVideoCallChanged", 184, "VideoSurfaceCacheImpl.java").v("video call changed");
            defpackage.pxh pxhVar = (defpackage.pxh) this.a;
            j$.util.Optional optionalL = pxhVar.k.l();
            if (optionalL.isPresent() && android.telecom.VideoProfile.isVideo(pxhVar.d.getDetails().getVideoState())) {
                pxhVar.h.a(mfy.ds);
                ((android.telecom.InCallService.VideoCall) optionalL.orElseThrow()).setDisplaySurface(pxhVar.b());
                return;
            }
            return;
        }
        aimz aimzVar = defpackage.pvm.a;
        aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onVideoCallChanged", 55, "VideoCallCallback.java").v("enter");
        java.lang.Object obj = this.a;
        defpackage.pvm pvmVar = (defpackage.pvm) obj;
        mni.aK(pvmVar.d, mfy.dd);
        j$.util.Optional optionalL2 = pvmVar.e.l();
        defpackage.puo puoVar = new defpackage.puo(obj, 5);
        if (true == optionalL2.isPresent()) {
            java.lang.Object obj2 = optionalL2.get();
            java.lang.Object obj3 = puoVar.a;
            aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onVideoCallChanged", 61, "VideoCallCallback.java").v("register");
            defpackage.pvm pvmVar2 = (defpackage.pvm) obj3;
            mni.aK(pvmVar2.d, mfy.dl);
            ((android.telecom.InCallService.VideoCall) obj2).registerCallback((android.telecom.InCallService.VideoCall.Callback) obj3);
            aimz aimzVar2 = defpackage.pxh.a;
            aimzVar2.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "reportDeviceOrientationOnVideoCallCreated", 132, "VideoSurfaceCacheImpl.java").v("enter");
            aimw aimwVarL = aimzVar2.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "reportDeviceOrientationOnVideoCallCreated", 133, "VideoSurfaceCacheImpl.java");
            defpackage.pxh pxhVar2 = pvmVar2.c;
            j$.util.Optional optionalOfNullable = pxhVar2.i;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(optionalOfNullable.get().toString());
            }
            aimwVarL.y("uiRotation: %s", optionalOfNullable.orElse("empty"));
            j$.util.Optional optional = pxhVar2.i;
            defpackage.puo puoVar2 = new defpackage.puo(pxhVar2, 6);
            if (true == optional.isPresent()) {
                java.lang.Object obj4 = optional.get();
                ((defpackage.pxh) puoVar2.a).d(((java.lang.Integer) obj4).intValue());
            }
        }
    }
}
