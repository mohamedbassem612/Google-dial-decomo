package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fdr implements defpackage.fea {
    public final android.media.MediaCodec a;
    public final defpackage.fdv b;
    public final defpackage.feb c;
    public int d = 0;
    public final defpackage.hjx e;
    private boolean f;

    public fdr(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, defpackage.feb febVar, defpackage.hjx hjxVar) {
        this.a = mediaCodec;
        this.b = new defpackage.fdv(handlerThread);
        this.c = febVar;
        this.e = hjxVar;
    }

    public static java.lang.String d(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(')');
        }
        return sb.toString();
    }

    @Override // defpackage.fea
    public final int a() {
        int iS;
        this.c.b();
        defpackage.fdv fdvVar = this.b;
        synchronized (fdvVar.a) {
            fdvVar.b();
            iS = -1;
            if (!fdvVar.d()) {
                defpackage.etv etvVar = fdvVar.j;
                iS = etvVar.v() ? -1 : etvVar.s();
            }
        }
        return iS;
    }

    @Override // defpackage.fea
    public final int b(android.media.MediaCodec.BufferInfo bufferInfo) {
        int i;
        this.c.b();
        defpackage.fdv fdvVar = this.b;
        synchronized (fdvVar.a) {
            fdvVar.b();
            i = -1;
            if (!fdvVar.d()) {
                defpackage.etv etvVar = fdvVar.k;
                if (!etvVar.v()) {
                    int iS = etvVar.s();
                    if (iS >= 0) {
                        ahvr.ci(fdvVar.f);
                        android.media.MediaCodec.BufferInfo bufferInfo2 = (android.media.MediaCodec.BufferInfo) fdvVar.d.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (iS == -2) {
                        fdvVar.f = (android.media.MediaFormat) fdvVar.e.remove();
                        i = -2;
                    }
                    i = iS;
                }
            }
        }
        return i;
    }

    @Override // defpackage.fea
    public final android.media.MediaFormat c() {
        android.media.MediaFormat mediaFormat;
        defpackage.fdv fdvVar = this.b;
        synchronized (fdvVar.a) {
            mediaFormat = fdvVar.f;
            if (mediaFormat == null) {
                throw new java.lang.IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.fea
    public final java.nio.ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.fea
    public final java.nio.ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.fea
    public final void g() {
        mp$.ExternalSyntheticApiModelOutline1.m(this.a);
    }

    @Override // defpackage.fea
    public final void h() {
        this.c.a();
        this.a.flush();
        defpackage.fdv fdvVar = this.b;
        synchronized (fdvVar.a) {
            fdvVar.g++;
            android.os.Handler handler = fdvVar.c;
            java.lang.String str = eum.a;
            handler.post(new defpackage.fay(fdvVar, 6));
        }
        this.a.start();
    }

    @Override // defpackage.fea
    public final void i() {
        defpackage.hjx hjxVar;
        defpackage.hjx hjxVar2;
        defpackage.hjx hjxVar3;
        defpackage.hjx hjxVar4;
        try {
            try {
                if (this.d != 2) {
                    this.c.d();
                }
                this.d = 2;
                if (!this.f) {
                    try {
                        if (android.os.Build.VERSION.SDK_INT < 33) {
                            this.a.stop();
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 35 && (hjxVar4 = this.e) != null) {
                            hjxVar4.d(this.a);
                        }
                        this.a.release();
                        this.f = true;
                    } catch (java.lang.Throwable th) {
                        if (android.os.Build.VERSION.SDK_INT >= 35 && (hjxVar3 = this.e) != null) {
                            hjxVar3.d(this.a);
                        }
                        this.a.release();
                        this.f = true;
                        throw th;
                    }
                }
                this.b.c();
            } catch (java.lang.Throwable th2) {
                if (!this.f) {
                    try {
                        if (android.os.Build.VERSION.SDK_INT < 33) {
                            this.a.stop();
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 35 && (hjxVar2 = this.e) != null) {
                            hjxVar2.d(this.a);
                        }
                        this.a.release();
                        this.f = true;
                    } catch (java.lang.Throwable th3) {
                        if (android.os.Build.VERSION.SDK_INT >= 35 && (hjxVar = this.e) != null) {
                            hjxVar.d(this.a);
                        }
                        this.a.release();
                        this.f = true;
                        throw th3;
                    }
                }
                this.b.c();
                throw th2;
            }
        } catch (java.lang.Throwable th4) {
            this.b.c();
            throw th4;
        }
    }

    @Override // defpackage.fea
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.fea
    public final void k(android.view.Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.fea
    public final void l(android.os.Bundle bundle) {
        this.c.c(bundle);
    }

    @Override // defpackage.fea
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.fea
    public final void n(java.util.List list) {
        mp$.ExternalSyntheticApiModelOutline0.m(this.a, list);
    }

    @Override // defpackage.fea
    public final void o(java.util.List list) {
        mp$.ExternalSyntheticApiModelOutline0.m$1(this.a, list);
    }

    @Override // defpackage.fea
    public final void p(defpackage.eui euiVar) {
        defpackage.fef fefVar = new defpackage.fef(this, euiVar, 1);
        defpackage.fdv fdvVar = this.b;
        synchronized (fdvVar.a) {
            fdvVar.b();
            fefVar.a();
        }
    }

    @Override // defpackage.fea
    public final void q(int i, int i2, long j, int i3) {
        this.c.f(i, i2, j, i3);
    }

    @Override // defpackage.fea
    public final void r(int i, defpackage.ewq ewqVar, long j, int i2) {
        this.c.g(i, ewqVar, j, i2);
    }

    @Override // defpackage.fea
    public final void s(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.fea
    public final boolean t(rai raiVar) {
        defpackage.fdv fdvVar = this.b;
        synchronized (fdvVar.a) {
            fdvVar.l = raiVar;
        }
        return true;
    }
}
