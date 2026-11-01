package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjp extends android.os.HandlerThread implements android.os.Handler.Callback {
    public defpackage.eth a;
    public android.os.Handler b;
    public java.lang.Error c;
    public java.lang.RuntimeException d;
    public androidx.media3.exoplayer.video.PlaceholderSurface e;

    public fjp() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            int i2 = message.arg1;
                            ahvr.ci(this.a);
                            defpackage.eth ethVar = this.a;
                            android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
                            defpackage.esv.a(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                            int[] iArr = new int[2];
                            defpackage.esv.a(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                            ethVar.d = eGLDisplayEglGetDisplay;
                            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                            int[] iArr2 = new int[1];
                            boolean zEglChooseConfig = android.opengl.EGL14.eglChooseConfig(ethVar.d, defpackage.eth.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                            defpackage.esv.a(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, eum.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new java.lang.Object[]{java.lang.Boolean.valueOf(zEglChooseConfig), java.lang.Integer.valueOf(iArr2[0]), eGLConfigArr[0]}));
                            android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
                            android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(ethVar.d, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                            defpackage.esv.a(eGLContextEglCreateContext != null, "eglCreateContext failed");
                            ethVar.e = eGLContextEglCreateContext;
                            android.opengl.EGLDisplay eGLDisplay = ethVar.d;
                            android.opengl.EGLContext eGLContext = ethVar.e;
                            if (i2 == 1) {
                                eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                            } else {
                                eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                defpackage.esv.a(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                            }
                            defpackage.esv.a(android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
                            ethVar.f = eGLSurfaceEglCreatePbufferSurface;
                            int[] iArr3 = ethVar.c;
                            android.opengl.GLES20.glGenTextures(1, iArr3, 0);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            aift aiftVar = new aift(4);
                            boolean z = false;
                            while (true) {
                                int iGlGetError = android.opengl.GLES20.glGetError();
                                if (iGlGetError == 0) {
                                    break;
                                }
                                if (z) {
                                    sb.append('\n');
                                }
                                java.lang.String strGluErrorString = android.opengl.GLU.gluErrorString(iGlGetError);
                                if (strGluErrorString == null) {
                                    strGluErrorString = "error code: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(iGlGetError)));
                                }
                                sb.append("glError: ");
                                sb.append(strGluErrorString);
                                aiftVar.i(java.lang.Integer.valueOf(iGlGetError));
                                z = true;
                            }
                            if (z) {
                                throw new defpackage.eti(sb.toString(), aiftVar.h());
                            }
                            ethVar.g = new android.graphics.SurfaceTexture(iArr3[0]);
                            ethVar.g.setOnFrameAvailableListener(ethVar);
                            android.graphics.SurfaceTexture surfaceTexture = this.a.g;
                            ahvr.ci(surfaceTexture);
                            this.e = new androidx.media3.exoplayer.video.PlaceholderSurface(this, surfaceTexture, i2 != 0);
                            synchronized (this) {
                                notify();
                            }
                        } catch (java.lang.Error e) {
                            defpackage.etr.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                            this.c = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (defpackage.eti e2) {
                        defpackage.etr.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.d = new java.lang.IllegalStateException(e2);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (java.lang.RuntimeException e3) {
                    defpackage.etr.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    ahvr.ci(this.a);
                    defpackage.eth ethVar2 = this.a;
                    ethVar2.b.removeCallbacks(ethVar2);
                    try {
                        android.graphics.SurfaceTexture surfaceTexture2 = ethVar2.g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.release();
                            android.opengl.GLES20.glDeleteTextures(1, ethVar2.c, 0);
                        }
                        android.opengl.EGLDisplay eGLDisplay2 = ethVar2.d;
                        if (eGLDisplay2 != null && !eGLDisplay2.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                            android.opengl.EGL14.eglMakeCurrent(ethVar2.d, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
                        }
                        android.opengl.EGLSurface eGLSurface = ethVar2.f;
                        if (eGLSurface != null && !eGLSurface.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                            android.opengl.EGL14.eglDestroySurface(ethVar2.d, ethVar2.f);
                        }
                        android.opengl.EGLContext eGLContext2 = ethVar2.e;
                        if (eGLContext2 != null) {
                            android.opengl.EGL14.eglDestroyContext(ethVar2.d, eGLContext2);
                        }
                        android.opengl.EGL14.eglReleaseThread();
                        android.opengl.EGLDisplay eGLDisplay3 = ethVar2.d;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                            android.opengl.EGL14.eglTerminate(ethVar2.d);
                        }
                        ethVar2.d = null;
                        ethVar2.e = null;
                        ethVar2.f = null;
                        ethVar2.g = null;
                    } catch (java.lang.Throwable th) {
                        android.opengl.EGLDisplay eGLDisplay4 = ethVar2.d;
                        if (eGLDisplay4 != null && !eGLDisplay4.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                            android.opengl.EGL14.eglMakeCurrent(ethVar2.d, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
                        }
                        android.opengl.EGLSurface eGLSurface2 = ethVar2.f;
                        if (eGLSurface2 != null && !eGLSurface2.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                            android.opengl.EGL14.eglDestroySurface(ethVar2.d, ethVar2.f);
                        }
                        android.opengl.EGLContext eGLContext3 = ethVar2.e;
                        if (eGLContext3 != null) {
                            android.opengl.EGL14.eglDestroyContext(ethVar2.d, eGLContext3);
                        }
                        android.opengl.EGL14.eglReleaseThread();
                        android.opengl.EGLDisplay eGLDisplay5 = ethVar2.d;
                        if (eGLDisplay5 != null && !eGLDisplay5.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                            android.opengl.EGL14.eglTerminate(ethVar2.d);
                        }
                        ethVar2.d = null;
                        ethVar2.e = null;
                        ethVar2.f = null;
                        ethVar2.g = null;
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    try {
                        defpackage.etr.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            return true;
        } catch (java.lang.Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
