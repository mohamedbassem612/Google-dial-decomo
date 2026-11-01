package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbp implements defpackage.fax {
    public static final /* synthetic */ int d = 0;
    public defpackage.eto a;
    public defpackage.fai b;
    public defpackage.fam c;
    private final android.content.Context e;
    private final defpackage.fbs f;
    private final float g;
    private defpackage.etc h;
    private android.os.Looper i;
    private android.content.Context j;
    private final defpackage.hjx k;
    private final rai l;

    static {
        ahvr.bI(new defpackage.fed(1));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [fbs, java.lang.Object] */
    public fbp(defpackage.fbo fboVar) {
        this.e = (android.content.Context) fboVar.a;
        java.lang.Object obj = fboVar.d;
        ahvr.ci(obj);
        this.k = (defpackage.hjx) obj;
        this.f = fboVar.b;
        this.b = (defpackage.fai) fboVar.c;
        this.l = fboVar.a == null ? null : new rai(this);
        this.g = 8.0f;
        this.h = defpackage.etc.a;
    }

    private static java.lang.String j(android.os.Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private final void k(defpackage.far farVar) {
        defpackage.fai faiVar;
        i();
        defpackage.fam famVar = this.c;
        if (famVar == null) {
            android.content.Context context = this.e;
            if (context != null) {
                defpackage.fam famVar2 = new defpackage.fam(context, new rai(this), farVar.b, farVar.c);
                this.c = famVar2;
                if (famVar2.i) {
                    faiVar = famVar2.f;
                    ahvr.ci(faiVar);
                } else {
                    famVar2.i = true;
                    defpackage.fak fakVar = famVar2.e;
                    if (fakVar != null) {
                        fakVar.a.registerContentObserver(fakVar.b, false, fakVar);
                    }
                    android.content.Context context2 = famVar2.a;
                    android.media.AudioManager audioManagerAH = defpackage.hgt.aH(context2);
                    android.media.AudioDeviceCallback audioDeviceCallback = famVar2.c;
                    android.os.Handler handler = famVar2.b;
                    audioManagerAH.registerAudioDeviceCallback(audioDeviceCallback, handler);
                    if (android.os.Build.VERSION.SDK_INT >= 32 && famVar2.j == null) {
                        famVar2.j = new defpackage.aeic(context2, new defpackage.drn(famVar2, 11), java.lang.Boolean.valueOf(eum.X(context2)));
                    }
                    famVar2.f = defpackage.fai.c(context2, context2.registerReceiver(famVar2.d, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), famVar2.h, famVar2.g, famVar2.a());
                    faiVar = famVar2.f;
                }
                this.b = faiVar;
            }
        } else {
            android.media.AudioDeviceInfo audioDeviceInfo = farVar.c;
            if (audioDeviceInfo != null) {
                famVar.c(audioDeviceInfo);
            }
            defpackage.fam famVar3 = this.c;
            defpackage.epu epuVar = farVar.b;
            if (!j$.util.Objects.equals(epuVar, famVar3.h)) {
                famVar3.h = epuVar;
                famVar3.b(defpackage.fai.b(famVar3.a, epuVar, famVar3.g, famVar3.a()));
            }
        }
        ahvr.ci(this.b);
    }

    @Override // defpackage.fax
    public final defpackage.fat a(defpackage.far farVar) {
        boolean zBooleanValue;
        defpackage.fan fanVarE;
        int iH;
        k(farVar);
        defpackage.eqg eqgVar = farVar.a;
        ahvr.ci(eqgVar);
        defpackage.epu epuVar = farVar.b;
        ahvr.ci(epuVar);
        int i = eqgVar.J;
        int i2 = 2;
        if (i == -1) {
            fanVarE = defpackage.fan.a;
        } else {
            defpackage.hjx hjxVar = this.k;
            java.lang.Object obj = hjxVar.a;
            if (obj != null) {
                zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            } else {
                java.lang.Object obj2 = hjxVar.b;
                if (obj2 != null) {
                    java.lang.String parameters = defpackage.hgt.aH((android.content.Context) obj2).getParameters("offloadVariableRateSupported");
                    hjxVar.a = java.lang.Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    hjxVar.a = java.lang.Boolean.FALSE;
                }
                zBooleanValue = ((java.lang.Boolean) hjxVar.a).booleanValue();
            }
            java.lang.String str = eqgVar.p;
            ahvr.ci(str);
            int iA = defpackage.eqz.a(str, eqgVar.k);
            if (iA == 0 || android.os.Build.VERSION.SDK_INT < eum.f(iA) || (iH = eum.h(eqgVar)) == 0) {
                fanVarE = defpackage.fan.a;
            } else {
                try {
                    android.media.AudioFormat audioFormatBuild = new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(iH).setEncoding(iA).build();
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        int iM = ae$.ExternalSyntheticApiModelOutline0.m(audioFormatBuild, epuVar.a());
                        if ((iM & 1) == 0) {
                            fanVarE = defpackage.fan.a;
                        } else {
                            boolean z = (iM & 3) == 3;
                            xwe xweVar = new xwe();
                            xweVar.b = true;
                            xweVar.c = z;
                            xweVar.a = zBooleanValue;
                            fanVarE = xweVar.e();
                        }
                    } else if (android.os.Build.VERSION.SDK_INT >= 31) {
                        int iM2 = mp$.ExternalSyntheticApiModelOutline0.m(audioFormatBuild, epuVar.a());
                        if (iM2 == 0) {
                            fanVarE = defpackage.fan.a;
                        } else {
                            xwe xweVar2 = new xwe();
                            boolean z2 = android.os.Build.VERSION.SDK_INT > 32 && iM2 == 2;
                            xweVar2.b = true;
                            xweVar2.c = z2;
                            xweVar2.a = zBooleanValue;
                            fanVarE = xweVar2.e();
                        }
                    } else if (fn$.ExternalSyntheticApiModelOutline0.m$1(audioFormatBuild, epuVar.a())) {
                        xwe xweVar3 = new xwe();
                        xweVar3.b = true;
                        xweVar3.a = zBooleanValue;
                        fanVarE = xweVar3.e();
                    } else {
                        fanVarE = defpackage.fan.a;
                    }
                } catch (java.lang.IllegalArgumentException unused) {
                    fanVarE = defpackage.fan.a;
                }
            }
        }
        defpackage.fas fasVar = new defpackage.fas();
        if (!j$.util.Objects.equals(eqgVar.p, "audio/raw") ? this.b.a(eqgVar, epuVar) == null : eqgVar.K != 2) {
            i2 = 0;
        }
        fasVar.d = i2;
        fasVar.a = fanVarE.b;
        fasVar.b = fanVarE.c;
        fasVar.c = fanVarE.d;
        return fasVar.a();
    }

    @Override // defpackage.fax
    public final defpackage.faw b(defpackage.far farVar) throws defpackage.fap {
        int i;
        char c;
        int iIntValue;
        int i2;
        int iJ;
        int iP;
        int i3;
        k(farVar);
        defpackage.eqg eqgVar = farVar.a;
        java.lang.String str = eqgVar.p;
        if (j$.util.Objects.equals(str, "audio/raw")) {
            i2 = eqgVar.K;
            ahvr.bM(eum.U(i2));
            i = eqgVar.J;
            iIntValue = eum.h(eqgVar);
            iJ = eum.j(i2) * eqgVar.H;
            c = 0;
        } else {
            i = eqgVar.J;
            defpackage.fan fanVar = defpackage.fan.a;
            android.util.Pair pairA = this.b.a(eqgVar, farVar.b);
            if (pairA == null) {
                throw new defpackage.fap("Unable to configure passthrough for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(eqgVar))));
            }
            int iIntValue2 = ((java.lang.Integer) pairA.first).intValue();
            c = 2;
            iIntValue = ((java.lang.Integer) pairA.second).intValue();
            i2 = iIntValue2;
            iJ = -1;
        }
        int i4 = eqgVar.j;
        if (j$.util.Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i4 == -1) {
            i4 = 768000;
        }
        int iMax = farVar.f;
        if (iMax == -1) {
            defpackage.fbs fbsVar = this.f;
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(i, iIntValue, i2);
            ahvr.bY(minBufferSize != -2);
            if (iJ == -1) {
                iJ = 1;
            }
            if (c == 0) {
                defpackage.fbx fbxVar = (defpackage.fbx) fbsVar;
                int i5 = fbxVar.b;
                int i6 = fbxVar.g;
                iP = aiql.P(((((long) i) * 500000) * ((long) iJ)) / 1000000);
            } else if (c != 1) {
                defpackage.fbx fbxVar2 = (defpackage.fbx) fbsVar;
                int i7 = fbxVar2.c;
                if (i2 == 5) {
                    int i8 = fbxVar2.e;
                    i3 = 500000;
                } else if (i2 == 8) {
                    int i9 = fbxVar2.f;
                    i3 = 1000000;
                    i2 = 8;
                } else {
                    i3 = 250000;
                }
                iP = aiql.P((((long) i3) * ((long) (i4 != -1 ? aiql.ak(i4, 8, java.math.RoundingMode.CEILING) : defpackage.fbx.a(i2)))) / 1000000);
            } else {
                int iA = defpackage.fbx.a(i2);
                int i10 = ((defpackage.fbx) fbsVar).d;
                iP = aiql.P((((long) iA) * 50000000) / 1000000);
            }
            iMax = (((java.lang.Math.max(minBufferSize, iP) + iJ) - 1) / iJ) * iJ;
        }
        defpackage.fav favVar = new defpackage.fav();
        favVar.b = i;
        favVar.c = iIntValue;
        favVar.a = i2;
        favVar.e = iMax;
        favVar.g = farVar.d;
        favVar.f = farVar.b;
        favVar.d = c == 1;
        favVar.h = farVar.e;
        return new defpackage.faw(favVar);
    }

    @Override // defpackage.fax
    public final void c() {
        defpackage.aeic aeicVar;
        defpackage.eto etoVar = this.a;
        if (etoVar != null) {
            etoVar.d();
        }
        defpackage.fam famVar = this.c;
        if (famVar == null || !famVar.i) {
            return;
        }
        famVar.f = null;
        android.content.Context context = famVar.a;
        defpackage.hgt.aH(context).unregisterAudioDeviceCallback(famVar.c);
        if (android.os.Build.VERSION.SDK_INT >= 32 && (aeicVar = famVar.j) != null) {
            aeicVar.a();
            famVar.j = null;
        }
        context.unregisterReceiver(famVar.d);
        defpackage.fak fakVar = famVar.e;
        if (fakVar != null) {
            fakVar.a.unregisterContentObserver(fakVar);
        }
        famVar.i = false;
    }

    @Override // defpackage.fax
    public final void d(defpackage.etc etcVar) {
        this.h = etcVar;
    }

    @Override // defpackage.fax
    public final boolean e() {
        boolean z;
        synchronized (defpackage.fbn.a) {
            z = defpackage.fbn.c > 0;
        }
        return z;
    }

    @Override // defpackage.fax
    public final void g(rai raiVar) {
        i();
        defpackage.eto etoVar = this.a;
        if (etoVar == null) {
            etoVar = new defpackage.eto(java.lang.Thread.currentThread());
            this.a = etoVar;
        }
        etoVar.a(raiVar);
    }

    @Override // defpackage.fax
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final defpackage.fbn f(defpackage.faw fawVar) throws defpackage.fau {
        android.content.Context context;
        try {
            int i = fawVar.g;
            int i2 = fawVar.h;
            android.content.Context context2 = null;
            if (i2 != -1 && (context = this.e) != null && android.os.Build.VERSION.SDK_INT >= 34) {
                android.content.Context context3 = this.j;
                if (context3 == null || rp$.ExternalSyntheticApiModelOutline0.m(context3) != i2) {
                    this.j = rp$.ExternalSyntheticApiModelOutline0.m(context, i2);
                }
                context2 = this.j;
                i = 0;
            }
            android.media.AudioTrack.Builder sessionId = new android.media.AudioTrack.Builder().setAudioAttributes(fawVar.f.a()).setAudioFormat(new android.media.AudioFormat.Builder().setSampleRate(fawVar.b).setChannelMask(fawVar.c).setEncoding(fawVar.a).build()).setTransferMode(1).setBufferSizeInBytes(fawVar.e).setSessionId(i);
            fn$.ExternalSyntheticApiModelOutline0.m(sessionId, fawVar.d);
            if (android.os.Build.VERSION.SDK_INT >= 34 && context2 != null) {
                rp$.ExternalSyntheticApiModelOutline0.m(sessionId, context2);
            }
            android.media.AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new defpackage.fbn(audioTrackBuild, fawVar, this.l, this.g, this.h);
            }
            try {
                audioTrackBuild.release();
            } catch (java.lang.Exception unused) {
            }
            throw new defpackage.fau();
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e) {
            throw new defpackage.fau(e);
        }
    }

    public final void i() {
        if (this.e != null) {
            android.os.Looper looperMyLooper = android.os.Looper.myLooper();
            android.os.Looper looper = this.i;
            boolean z = true;
            if (looper != null && looper != looperMyLooper) {
                z = false;
            }
            ahvr.ce(z, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", j(looper), j(looperMyLooper));
            this.i = looperMyLooper;
        }
    }
}
