package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pvm extends android.telecom.InCallService.VideoCall.Callback {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/video/impl/VideoCallCallback");
    final defpackage.znf b = new defpackage.pvl(this, 0);
    public final defpackage.pxh c;
    public final mfz d;
    public final defpackage.oyx e;
    private final defpackage.pvr f;
    private final defpackage.pvf g;
    private final ahpz h;
    private final defpackage.pxh i;

    public pvm(defpackage.oyx oyxVar, defpackage.pvr pvrVar, defpackage.pxh pxhVar, defpackage.pxh pxhVar2, defpackage.pvf pvfVar, mfz mfzVar, ahpz ahpzVar) {
        this.e = oyxVar;
        this.f = pvrVar;
        this.i = pxhVar;
        this.c = pxhVar2;
        this.g = pvfVar;
        this.d = mfzVar;
        this.h = ahpzVar;
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onCallDataUsageChanged(long j) {
        ahok ahokVarF = this.h.f(535, "VideoCallCallback.onCallDataUsageChanged");
        try {
            a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCallDataUsageChanged", 167, "VideoCallCallback.java").x("dataUsage: %d", j);
            mfz mfzVar = this.d;
            gus.av(j);
            mfzVar.c();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onCallSessionEvent(int i) {
        ahok ahokVarF = this.h.f(536, "VideoCallCallback.onCallSessionEvent");
        try {
            mfz mfzVar = this.d;
            gus.au(i);
            mfzVar.c();
            if (i == 1) {
                a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCallSessionEvent", 120, "VideoCallCallback.java").v("rx_pause");
            } else if (i == 2) {
                a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCallSessionEvent", 123, "VideoCallCallback.java").v("rx_resume");
            } else if (i != 5) {
                aimz aimzVar = a;
                if (i != 6) {
                    aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCallSessionEvent", 132, "VideoCallCallback.java").w("unknown event = : %d", i);
                } else {
                    aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCallSessionEvent", 129, "VideoCallCallback.java").v("camera_ready");
                }
            } else {
                a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCallSessionEvent", 126, "VideoCallCallback.java").v("camera_failure");
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onCameraCapabilitiesChanged(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities) {
        ahok ahokVarF = this.h.f(537, "VideoCallCallback.onCameraCapabilitiesChanged");
        try {
            aimz aimzVar = a;
            if (cameraCapabilities == null) {
                aimzVar.d().i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCameraCapabilitiesChanged", 183, "VideoCallCallback.java").v("received null cameraCapabilities. Camera permission denied?");
                mni.aK(this.d, mfy.dk);
            } else {
                aimzVar.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onCameraCapabilitiesChanged", 187, "VideoCallCallback.java").z("Local camera changed, width: %d, height: %d", cameraCapabilities.getWidth(), cameraCapabilities.getHeight());
                mfz mfzVar = this.d;
                gus.az(new mhc[]{gus.au(cameraCapabilities.getWidth()), gus.au(cameraCapabilities.getHeight())});
                mfzVar.c();
                android.util.Size size = new android.util.Size(cameraCapabilities.getWidth(), cameraCapabilities.getHeight());
                this.i.f(size);
                defpackage.pvf pvfVar = this.g;
                if (((java.lang.Boolean) pvfVar.m.a()).booleanValue()) {
                    if (!pvfVar.p.getAndSet(false)) {
                        a.bI(defpackage.pvf.a.d(), "detect VideoCall.Callback#onCameraCapabilitiesChanged() without requesting it.", "com/android/dialer/incall/core/video/impl/CameraController", "onCameraCapabilityChanged", (char) 486, "CameraController.java", zct.b);
                    } else if (!((java.lang.Boolean) pvfVar.n.a()).booleanValue()) {
                        defpackage.pvf.a.b().l("com/android/dialer/incall/core/video/impl/CameraController", "onCameraCapabilityChanged", 488, "CameraController.java").v("update local dimensions on every onCameraCapabilityChanged()");
                    }
                    j$.util.Optional optionalL = pvfVar.t.l();
                    hvp hvpVar = new hvp(pvfVar, size, 17);
                    if (true == optionalL.isPresent()) {
                        java.lang.Object obj = optionalL.get();
                        java.lang.Object obj2 = hvpVar.a;
                        ((defpackage.pvf) obj2).s.e((android.util.Size) hvpVar.b);
                        android.view.Surface surfaceA = ((defpackage.pvf) obj2).r.a();
                        ((defpackage.pvf) obj2).q.a(mfy.du);
                        ((android.telecom.InCallService.VideoCall) obj).setPreviewSurface(surfaceA);
                    }
                }
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onPeerDimensionsChanged(int i, int i2) {
        ahok ahokVarF = this.h.f(538, "VideoCallCallback.onPeerDimensionsChanged");
        try {
            a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onPeerDimensionsChanged", 142, "VideoCallCallback.java").z("Remote camera has changed, width: %d, height: %d", i, i2);
            mfz mfzVar = this.d;
            gus.az(new mhc[]{gus.au(i), gus.au(i2)});
            mfzVar.c();
            defpackage.pxh pxhVar = this.i;
            android.util.Size size = new android.util.Size(i, i2);
            if (size.getWidth() <= 0 || size.getHeight() <= 0) {
                a.bt(defpackage.pxh.a.d(), "unexpected invalid remote transit dimensions : %s", size, "com/android/dialer/incall/core/video/impl/VideoSurfaceCacheImpl", "updateRemoteSurfaceDimensions", (char) 175, "VideoSurfaceCacheImpl.java", zct.b);
            } else {
                pxhVar.g.set(j$.util.Optional.of(size));
                pxhVar.j.a(ajcm.a);
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onSessionModifyRequestReceived(android.telecom.VideoProfile videoProfile) {
        ahok ahokVarF = this.h.f(539, "VideoCallCallback.onSessionModifyRequestReceived");
        try {
            a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onSessionModifyRequestReceived", 72, "VideoCallCallback.java").y("videoProfile: %s", videoProfile);
            if (videoProfile != null) {
                mfz mfzVar = this.d;
                gus.au(videoProfile.getVideoState());
                mfzVar.c();
            }
            defpackage.pvr pvrVar = this.f;
            if (pvrVar.m.l().isPresent()) {
                pvrVar.i();
                defpackage.zcy zcyVarB = defpackage.zcy.b(videoProfile.getVideoState());
                pvrVar.j.set(j$.util.Optional.of(zcyVarB));
                int videoState = pvrVar.d.getDetails().getVideoState();
                if (android.telecom.VideoProfile.isVideo(videoState)) {
                    if (android.telecom.VideoProfile.isTransmissionEnabled(videoProfile.getVideoState()) && !android.telecom.VideoProfile.isTransmissionEnabled(videoState)) {
                        a.bI(defpackage.pvr.a.d(), "remote requests to enable TX while current TX isn't enabled", "com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onVideoUpgradeRequestReceived", (char) 444, "VideoControllerImpl.java", zct.b);
                        videoProfile = new android.telecom.VideoProfile(videoProfile.getVideoState() & (-2));
                    }
                    defpackage.pvr.a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onVideoUpgradeRequestReceived", 448, "VideoControllerImpl.java").y("call updated to %s", android.telecom.VideoProfile.videoStateToString(videoProfile.getVideoState()));
                    pvrVar.l(videoProfile);
                    pvrVar.o.l(false);
                } else if (zcyVarB == defpackage.zcy.a) {
                    if (android.telecom.VideoProfile.isVideo(videoState)) {
                        defpackage.pvr.a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onVideoUpgradeRequestReceived", 456, "VideoControllerImpl.java").v("downgraded to audio");
                    }
                    pvrVar.l(videoProfile);
                    hwv hwvVar = pvrVar.o;
                    hwvVar.l(false);
                    pvrVar.m(defpackage.puy.d);
                    agsm.i(546, hwvVar.k(false), "failed setting request state", new java.lang.Object[0]);
                } else {
                    pvrVar.o.l(true);
                }
            } else {
                a.bI(defpackage.pvr.a.c().m(aioa.b), "InCallService.VideoCall is null.", "com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onVideoUpgradeRequestReceived", (char) 426, "VideoControllerImpl.java", zct.b);
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onSessionModifyResponseReceived(int i, android.telecom.VideoProfile videoProfile, android.telecom.VideoProfile videoProfile2) {
        ahok ahokVarF = this.h.f(540, "VideoCallCallback.onSessionModifyResponseReceived");
        try {
            a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onSessionModifyResponseReceived", 88, "VideoCallCallback.java").M("status: %d, requestedProfile: %s, responseProfile: %s", java.lang.Integer.valueOf(i), videoProfile, videoProfile2);
            if (videoProfile != null && videoProfile2 != null) {
                mfz mfzVar = this.d;
                gus.az(new mhc[]{gus.au(i), gus.au(videoProfile.getVideoState()), gus.au(videoProfile2.getVideoState())});
                mfzVar.c();
            }
            defpackage.pvr pvrVar = this.f;
            hwv hwvVar = pvrVar.o;
            if (hwvVar.m()) {
                if (i != 1) {
                    hwvVar.l(false);
                    pvrVar.j.set(j$.util.Optional.empty());
                }
            } else if (hwvVar.n()) {
                if (i != 1) {
                    if (i == 2) {
                        pvrVar.m(defpackage.puy.b);
                        pvrVar.n();
                    } else if (i == 3) {
                        pvrVar.m(defpackage.puy.c);
                        pvrVar.n();
                    } else if (i == 4) {
                        pvrVar.m(defpackage.puy.d);
                        pvrVar.n();
                    } else if (i != 5) {
                        defpackage.pvr.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onSentVideoRequestResponseReceived", 280, "VideoControllerImpl.java").w("unknown video request response %d", i);
                    } else {
                        pvrVar.m(defpackage.puy.e);
                        pvrVar.n();
                    }
                }
            } else if (!((j$.util.Optional) pvrVar.i.get()).isPresent()) {
                a.bI(defpackage.pvr.a.d(), "Video request response received when there are no request.", "com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onSentVideoRequestResponseReceived", (char) 295, "VideoControllerImpl.java", zct.b);
            } else if (i != 1) {
                pvrVar.i();
            }
            pvrVar.l.a(ajcm.a);
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.telecom.InCallService.VideoCall.Callback
    public final void onVideoQualityChanged(int i) {
        ahok ahokVarF = this.h.f(541, "VideoCallCallback.onVideoQualityChanged");
        try {
            a.b().l("com/android/dialer/incall/core/video/impl/VideoCallCallback", "onVideoQualityChanged", 155, "VideoCallCallback.java").w("videoQuality: %d", i);
            mfz mfzVar = this.d;
            gus.au(i);
            mfzVar.c();
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
