package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvf {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/video/impl/CameraController");
    public static final android.util.Size b = new android.util.Size(720, 1280);
    public static final android.util.Size c = new android.util.Size(240, 320);
    final defpackage.znf d;
    final defpackage.puv h;
    public final defpackage.put i;
    final defpackage.puu j;
    public final android.telecom.Call k;
    public final aoin l;
    public final aoin m;
    public final aoin n;
    public final defpackage.zjt q;
    public final defpackage.pxh r;
    public final defpackage.pxh s;
    public final defpackage.oyx t;
    private final android.hardware.camera2.CameraManager x;
    private final ajct y;
    private final aoin z;
    final defpackage.zno e = new defpackage.otk(this, 2);
    public final defpackage.znv f = new ooa(this, 3);
    final defpackage.znk g = new defpackage.pva(this, 0);
    public final defpackage.rai w = new defpackage.rai(this);
    final defpackage.rai v = new defpackage.rai(this);
    final defpackage.rai u = new defpackage.rai(this);
    private final ahzi A = ahvr.bI(new exm(this, 12));
    public final java.util.concurrent.atomic.AtomicReference o = new java.util.concurrent.atomic.AtomicReference(defpackage.pur.a);
    public final java.util.concurrent.atomic.AtomicBoolean p = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final aijz B = new defpackage.pvb(this);

    public pvf(android.telecom.Call call, defpackage.oyx oyxVar, android.hardware.camera2.CameraManager cameraManager, ajct ajctVar, aoin aoinVar, defpackage.pxh pxhVar, defpackage.pxh pxhVar2, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, defpackage.zjt zjtVar) {
        int i = 1;
        this.d = new defpackage.pvl(this, i);
        this.h = new defpackage.qna(this, i);
        this.i = new defpackage.pvp(this, i);
        this.j = new defpackage.qpi(this, i);
        this.k = call;
        this.t = oyxVar;
        this.x = cameraManager;
        this.y = ajctVar;
        this.z = aoinVar;
        this.r = pxhVar;
        this.s = pxhVar2;
        this.l = aoinVar2;
        this.m = aoinVar3;
        this.n = aoinVar4;
        this.q = zjtVar;
    }

    public final aify a() {
        java.lang.String str;
        java.lang.String str2 = "CameraController.java";
        try {
            java.lang.String[] cameraIdList = this.x.getCameraIdList();
            aift aiftVar = new aift(4);
            int length = cameraIdList.length;
            int i = 0;
            while (i < length) {
                java.lang.String str3 = cameraIdList[i];
                try {
                    aiftVar.i(new defpackage.pvc(str3, this.x.getCameraCharacteristics(str3)));
                    str = str2;
                } catch (android.hardware.camera2.CameraAccessException e) {
                    str = str2;
                    hgb.g(a.c(), "failed reading camera characteristic for %s", str3, "com/android/dialer/incall/core/video/impl/CameraController", "getCameraInfo", (char) 387, str, e, zct.b);
                }
                i++;
                str2 = str;
            }
            return aiftVar.h();
        } catch (android.hardware.camera2.CameraAccessException e2) {
            a.bq(a.c(), "failed reading camera ids", "com/android/dialer/incall/core/video/impl/CameraController", "getCameraInfo", (char) 373, "CameraController.java", e2, zct.b);
            return aike.a;
        }
    }

    public final ajcq b() {
        a.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onUpgradeToVideoFailed", 444, "CameraController.java").v("failed to upgrade to video");
        f(defpackage.pur.a);
        g();
        return ajcm.a;
    }

    public final ajcq c() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onUpgradeToVideoStarted", 434, "CameraController.java").v("upgrading to video");
        if (this.o.get() == defpackage.pur.a) {
            aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onUpgradeToVideoStarted", 436, "CameraController.java").v("using front camera");
            f(defpackage.pur.b);
        }
        g();
        return ajcm.a;
    }

    public final j$.util.Optional d() {
        defpackage.pvd pvdVar = (defpackage.pvd) this.A.eZ();
        int iOrdinal = ((defpackage.pur) this.o.get()).ordinal();
        if (iOrdinal == 0) {
            return j$.util.Optional.empty();
        }
        if (iOrdinal == 1) {
            return pvdVar.a;
        }
        if (iOrdinal == 2) {
            return pvdVar.b;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public final j$.util.Optional e(aify aifyVar, defpackage.pur purVar) {
        return j$.util.Collection.-EL.stream(aifyVar).filter(new jty(purVar, 15)).min(this.B);
    }

    public final void f(defpackage.pur purVar) {
        this.o.set(purVar);
    }

    public final void g() {
        agsm.i(533, ahvr.H(((defpackage.pve) aooc.ar(((defpackage.afpl) this.z.a()).Y(), defpackage.pve.class)).aq(), new ahyc() { // from class: puz
            /* JADX WARN: Code duplicated, block: B:25:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:26:0x00f6  */
            public final java.lang.Object apply(java.lang.Object obj) {
                android.util.Size size;
                android.util.Size size2;
                int width;
                int height;
                defpackage.pvf pvfVar = this.a;
                defpackage.oyx oyxVar = pvfVar.t;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (!oyxVar.l().isPresent()) {
                    a.bI(defpackage.pvf.a.d(), "InCallService.VideoCall is null.", "com/android/dialer/incall/core/video/impl/CameraController", "syncCameraState", (char) 175, "CameraController.java", zct.b);
                    return null;
                }
                android.telecom.InCallService.VideoCall videoCall = (android.telecom.InCallService.VideoCall) oyxVar.l().orElseThrow();
                if (!bool.booleanValue()) {
                    a.bI(defpackage.pvf.a.d(), "missing camera permission, can't sync camera state", "com/android/dialer/incall/core/video/impl/CameraController", "syncCameraState", (char) 185, "CameraController.java", zct.b);
                    pvfVar.q.b(mfy.dq, aify.p(gus.aw("null")));
                    videoCall.setCamera(null);
                    return null;
                }
                j$.util.Optional optionalD = pvfVar.d();
                if (((java.lang.Boolean) pvfVar.n.a()).booleanValue()) {
                    defpackage.pnh pnhVar = new defpackage.pnh(pvfVar, 11);
                    if (true == optionalD.isPresent()) {
                        defpackage.pvc pvcVar = (defpackage.pvc) optionalD.get();
                        aoin aoinVar = ((defpackage.pvf) pnhVar.a).l;
                        if (((java.lang.Long) aoinVar.a()).longValue() == 240) {
                            size2 = defpackage.pvf.c;
                        } else {
                            if (((java.lang.Long) aoinVar.a()).longValue() == 720) {
                                size2 = defpackage.pvf.b;
                            } else {
                                a.bt(defpackage.pvf.a.c().m(aioa.b), "VIDEO_CALL_CAMERA_RESOLUTION is invalid: %d", aoinVar.a(), "com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", (char) 305, "CameraController.java", zct.b);
                                size = defpackage.pvf.b;
                            }
                            if (pvcVar.a().a()) {
                                width = size.getHeight();
                                height = size.getWidth();
                            } else {
                                width = size.getWidth();
                                height = size.getHeight();
                            }
                            aimz aimzVar = defpackage.pvf.a;
                            aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", 317, (java.lang.String) r17).M("view: %dx%d, sizes: %s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), pvcVar.b());
                            optionalD = j$.util.Collection.-EL.stream(pvcVar.b()).filter(new defpackage.amdh(width, height, 1)).max(j$.util.Comparator.-CC.comparingLong(new fhk(6)));
                            aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", 323, "CameraController.java").y("optimal size: %s", optionalD);
                            optionalD.getClass();
                        }
                        size = size2;
                        if (pvcVar.a().a()) {
                            width = size.getHeight();
                            height = size.getWidth();
                        } else {
                            width = size.getWidth();
                            height = size.getHeight();
                        }
                        aimz aimzVar2 = defpackage.pvf.a;
                        aimzVar2.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", 317, (java.lang.String) r17).M("view: %dx%d, sizes: %s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), pvcVar.b());
                        optionalD = j$.util.Collection.-EL.stream(pvcVar.b()).filter(new defpackage.amdh(width, height, 1)).max(j$.util.Comparator.-CC.comparingLong(new fhk(6)));
                        aimzVar2.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameraSize", 323, "CameraController.java").y("optimal size: %s", optionalD);
                        optionalD.getClass();
                    }
                    defpackage.puo puoVar = new defpackage.puo(pvfVar, 3);
                    if (true == optionalD.isPresent()) {
                        android.util.Size size3 = (android.util.Size) optionalD.get();
                        defpackage.pxh pxhVar = ((defpackage.pvf) puoVar.a).s;
                        pxhVar.f(size3);
                        pxhVar.e(size3);
                    }
                } else {
                    optionalD = optionalD;
                }
                java.lang.String str = (java.lang.String) (true != optionalD.isPresent() ? optionalD : j$.util.Optional.ofNullable(((defpackage.pvc) optionalD.get()).a)).orElse((java.lang.Object) null);
                defpackage.pxh pxhVar2 = pvfVar.r;
                android.view.Surface surfaceA = pxhVar2.a();
                aimz aimzVar3 = defpackage.pvf.a;
                aimzVar3.b().l("com/android/dialer/incall/core/video/impl/CameraController", "syncCameraState", 220, "CameraController.java").y("sync camera state to %s", str);
                defpackage.zjt zjtVar = pvfVar.q;
                zjtVar.b(mfy.dq, aify.p(str != null ? gus.aw(str) : gus.aw("null")));
                zjtVar.a(mfy.du);
                videoCall.setCamera(str);
                j$.util.Optional optionalC = pxhVar2.c();
                hvp hvpVar = new hvp(videoCall, surfaceA, 16, (byte[]) null);
                if (true == optionalC.isPresent()) {
                    ((android.telecom.InCallService.VideoCall) hvpVar.b).setPreviewSurface((android.view.Surface) hvpVar.a);
                }
                if (((java.lang.Boolean) pvfVar.m.a()).booleanValue() && pvfVar.p.getAndSet(true)) {
                    a.bI(aimzVar3.d(), "detect another syncCameraState() before videoCall.requestCameraCapabilities() finish", "com/android/dialer/incall/core/video/impl/CameraController", "syncCameraState", (char) 240, "CameraController.java", zct.b);
                    return null;
                }
                zjtVar.a(mfy.dn);
                videoCall.requestCameraCapabilities();
                return null;
            }
        }, this.y), "failed to sync camera state", new java.lang.Object[0]);
    }
}
