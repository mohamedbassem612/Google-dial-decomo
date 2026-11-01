package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxh {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl");
    final defpackage.put b;
    final defpackage.znf c;
    public final android.telecom.Call d;
    public final defpackage.pvk e;
    public final defpackage.zjt h;
    public final zpz j;
    public final defpackage.oyx k;
    private final java.util.concurrent.atomic.AtomicReference l = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public j$.util.Optional i = j$.util.Optional.empty();

    public pxh(android.telecom.Call call, defpackage.oyx oyxVar, defpackage.pvk pvkVar, zpz zpzVar, defpackage.zjt zjtVar) {
        int i = 2;
        this.b = new defpackage.pvp(this, i);
        this.c = new defpackage.pvl(this, i);
        this.d = call;
        this.k = oyxVar;
        this.e = pvkVar;
        this.j = zpzVar;
        this.h = zjtVar;
    }

    public final android.view.Surface a() {
        return this.e.a().c;
    }

    public final android.view.Surface b() {
        return this.e.a().d;
    }

    public final j$.util.Optional c() {
        j$.util.Optional optional = (j$.util.Optional) this.l.get();
        return !optional.isPresent() ? (j$.util.Optional) this.f.get() : optional;
    }

    public final void d(int i) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "reportDeviceOrientationChanged", 119, "VideoSurfaceCacheImpl.java").v("device orientation changed");
        j$.util.Optional optionalL = this.k.l();
        if (optionalL.isPresent() && android.telecom.VideoProfile.isVideo(this.d.getDetails().getVideoState())) {
            this.h.b(mfy.dr, aify.p(gus.au(i)));
            ((android.telecom.InCallService.VideoCall) optionalL.orElseThrow()).setDeviceOrientation(i);
        }
        aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "reportDeviceOrientationChanged", 127, "VideoSurfaceCacheImpl.java").w("setting uiRotation: %d", i);
        this.i = j$.util.Optional.of(java.lang.Integer.valueOf(i));
    }

    public final void e(android.util.Size size) {
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            a.bt(a.d(), "unexpected invalid local dimensions : %s", size, "com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "updateLocalSurfaceDimensions", (char) 143, "VideoSurfaceCacheImpl.java", zct.b);
            return;
        }
        this.h.b(mfy.cB, aify.q(gus.au(size.getWidth()), gus.au(size.getHeight())));
        this.l.set(j$.util.Optional.of(size));
        this.e.a().a.a(size);
        this.j.a(ajcm.a);
    }

    public final void f(android.util.Size size) {
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            a.bt(a.d(), "unexpected invalid local transit dimensions : %s", size, "com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "updateLocalVideoTransmitDimensions", (char) 161, "VideoSurfaceCacheImpl.java", zct.b);
        } else {
            this.f.set(j$.util.Optional.of(size));
            this.j.a(ajcm.a);
        }
    }
}
