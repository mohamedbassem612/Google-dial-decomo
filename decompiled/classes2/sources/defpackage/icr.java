package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icr extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(android.content.RestrictionsManager restrictionsManager, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = restrictionsManager;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v65, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v83, types: [aoin, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        android.media.MediaMuxer mediaMuxer = null;
        android.net.ConnectivityManager connectivityManager = null;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                defpackage.icu icuVar = (defpackage.icu) this.a;
                icuVar.i = new android.media.MediaMuxer(icuVar.c.getAbsolutePath(), 0);
                android.media.MediaFormat mediaFormatCreateAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", 16000, 2);
                aooh.e(mediaFormatCreateAudioFormat, "createAudioFormat(...)");
                mediaFormatCreateAudioFormat.setInteger("bitrate", 16000);
                android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(new android.media.MediaCodecList(0).findEncoderForFormat(mediaFormatCreateAudioFormat));
                mediaCodecCreateByCodecName.configure(mediaFormatCreateAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
                mediaCodecCreateByCodecName.start();
                aooh.e(mediaCodecCreateByCodecName, "apply(...)");
                icuVar.f = mediaCodecCreateByCodecName;
                android.media.MediaMuxer mediaMuxer2 = icuVar.i;
                if (mediaMuxer2 == null) {
                    aooh.j("mediaMuxer");
                    mediaMuxer2 = null;
                }
                icuVar.g = mediaMuxer2.addTrack(mediaFormatCreateAudioFormat);
                android.media.MediaMuxer mediaMuxer3 = icuVar.i;
                if (mediaMuxer3 == null) {
                    aooh.j("mediaMuxer");
                } else {
                    mediaMuxer = mediaMuxer3;
                }
                mediaMuxer.start();
                return aojh.a;
            case 1:
                aooc.af(obj);
                ((defpackage.hyf) this.a).f(defpackage.hxe.b);
                return aojh.a;
            case 2:
                aooc.af(obj);
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                defpackage.icu icuVar2 = (defpackage.icu) this.a;
                android.media.MediaCodec mediaCodec = icuVar2.f;
                if (mediaCodec == null) {
                    aooh.j("codec");
                    mediaCodec = null;
                }
                for (int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L); iDequeueOutputBuffer >= 0; iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L)) {
                    android.media.MediaMuxer mediaMuxer4 = icuVar2.i;
                    if (mediaMuxer4 == null) {
                        aooh.j("mediaMuxer");
                        mediaMuxer4 = null;
                    }
                    int i = icuVar2.g;
                    java.nio.ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null) {
                        throw new java.lang.IllegalStateException("getOutputBuffer() not supposed to return null with index from dequeueOutputBuffer()");
                    }
                    mediaMuxer4.writeSampleData(i, outputBuffer, bufferInfo);
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                if (((defpackage.igk) ((defpackage.ijk) this.a).c.get()) == null) {
                    return aojh.a;
                }
                throw null;
            case 4:
                aooc.af(obj);
                return ((defpackage.ijk) this.a).a() == null ? j$.util.Optional.empty() : j$.util.Optional.of(qtu.h);
            case 5:
                aooc.af(obj);
                return ((defpackage.ijt) this.a).b.p();
            case 6:
                aooc.af(obj);
                try {
                    try {
                        java.util.Iterator it = ((defpackage.ili) this.a).h.values().iterator();
                        while (it.hasNext()) {
                            ((rih) it.next()).close();
                        }
                    } catch (java.io.IOException e) {
                        defpackage.ili.b.c().k(e).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "stop$<anonymous>$<anonymous>", 274, "AudioPrismDuplexModelRunner.kt").v("failed to close the output stream");
                        break;
                    }
                    defpackage.ili iliVar = (defpackage.ili) this.a;
                    iliVar.h = new java.util.LinkedHashMap();
                    alje aljeVar = iliVar.l;
                    if (aljeVar != null) {
                        aljeVar.g();
                    }
                    iliVar.l = null;
                    iliVar.i = null;
                    defpackage.ili.b.b().l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "stop$<anonymous>$<anonymous>", 282, "AudioPrismDuplexModelRunner.kt").v("Duplex conversation stopped");
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    ((defpackage.ili) this.a).h = new java.util.LinkedHashMap();
                    throw th;
                }
            case 7:
                aooc.af(obj);
                ipo ipoVar = (ipo) this.a;
                return new java.lang.Long(ft$.ExternalSyntheticApiModelOutline0.m(ipoVar.d.getPackageInfo(ipoVar.b.getPackageName(), 0)));
            case 8:
                aooc.af(obj);
                if (((ipt) this.a).d().createNewFile()) {
                    return aojh.a;
                }
                throw new java.lang.IllegalStateException("Check failed.");
            case 9:
                aooc.af(obj);
                ipt iptVar = (ipt) this.a;
                if (android.provider.Settings.Global.getInt(iptVar.b.getContentResolver(), "device_provisioned", 0) == 1) {
                    return java.lang.Boolean.valueOf(!iptVar.d().exists());
                }
                ipt.a.b().l("com/android/dialer/backup/impl/DelayedBackupMigration", "shouldMigrate$<anonymous>", 45, "DelayedBackupMigration.kt").v("device setup in progress, not restoring");
                return java.lang.Boolean.FALSE;
            case 10:
                aooc.af(obj);
                java.io.File file = new java.io.File(((android.content.Context) ((kgl) this.a).b).getFilesDir(), "beesly");
                file.mkdirs();
                return file;
            case 11:
                aooc.af(obj);
                try {
                    java.lang.Object obj2 = this.a;
                    java.nio.charset.Charset charset = aoqv.a;
                    aooh.f(charset, "charset");
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream((java.io.File) obj2), charset);
                    try {
                        java.lang.String strC = aoog.c(inputStreamReader);
                        ajsz.ak(inputStreamReader, (java.lang.Throwable) null);
                        return strC;
                    } catch (java.lang.Throwable th2) {
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            ajsz.ak(inputStreamReader, th2);
                            throw th3;
                        }
                    }
                } catch (java.io.IOException e2) {
                    ivi.a.c().k(e2).l("com/android/dialer/beesly/impl/disclaimer/BeeslyDisclaimerRepository", "loadTextFile$<anonymous>$<anonymous>", 196, "BeeslyDisclaimerRepository.kt").y("Failed to read text file %s", ((java.io.File) this.a).getAbsolutePath());
                    return null;
                }
            case 12:
                aooc.af(obj);
                java.io.File file2 = new java.io.File((java.lang.String) this.a);
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                try {
                    long length = file2.length();
                    if (length > 2147483647L) {
                        throw new java.lang.OutOfMemoryError("File " + file2 + " is too big (" + length + " bytes) to fit in memory.");
                    }
                    int i2 = (int) length;
                    byte[] bArrCopyOf = new byte[i2];
                    int i3 = i2;
                    int i4 = 0;
                    while (i3 > 0) {
                        int i5 = fileInputStream.read(bArrCopyOf, i4, i3);
                        if (i5 < 0) {
                            bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, i4);
                            aooh.e(bArrCopyOf, "copyOf(...)");
                            ajsz.ak(fileInputStream, (java.lang.Throwable) null);
                            return (defpackage.koy) alad.B(defpackage.koy.a, bArrCopyOf, akzq.a());
                        }
                        i3 -= i5;
                        i4 += i5;
                    }
                    int i6 = fileInputStream.read();
                    if (i6 != -1) {
                        aomp aompVar = new aomp();
                        aompVar.write(i6);
                        aoog.d(fileInputStream, aompVar);
                        int size = aompVar.size() + i2;
                        if (size < 0) {
                            throw new java.lang.OutOfMemoryError(a.bg(file2, "File ", " is too big to fit in memory."));
                        }
                        byte[] bArrA = aompVar.a();
                        bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, size);
                        aooh.e(bArrCopyOf, "copyOf(...)");
                        ajsz.cZ(bArrA, bArrCopyOf, i2, 0, aompVar.size());
                    }
                    ajsz.ak(fileInputStream, (java.lang.Throwable) null);
                    return (defpackage.koy) alad.B(defpackage.koy.a, bArrCopyOf, akzq.a());
                } catch (java.lang.Throwable th4) {
                    try {
                        throw th4;
                    } catch (java.lang.Throwable th5) {
                        ajsz.ak(fileInputStream, th4);
                        throw th5;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                iqm iqmVar = (iqm) this.a;
                return abxl.L("BEESLY_ENABLED", (!iqmVar.a() || iqmVar.b()) ? 0 : 1);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                a.B((ccp) this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                return ((android.content.RestrictionsManager) this.a).getApplicationRestrictions();
            case 16:
                aooc.af(obj);
                defpackage.jcp jcpVar = (defpackage.jcp) this.a;
                android.net.ConnectivityManager connectivityManager2 = jcpVar.s;
                if (connectivityManager2 == null) {
                    aooh.j("connectivityManager");
                } else {
                    connectivityManager = connectivityManager2;
                }
                connectivityManager.unregisterNetworkCallback(jcpVar.r);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooc.af(obj);
                akzx akzxVarM = amom.a.m();
                aooh.f(akzxVarM, "builder");
                defpackage.jif jifVar = (defpackage.jif) this.a;
                java.lang.Long l = jifVar.b;
                if (l != null) {
                    int iLongValue = (int) l.longValue();
                    akzxVarM.u();
                    amom amomVar = akzxVarM.b;
                    amomVar.b |= 1;
                    amomVar.c = iLongValue;
                }
                java.lang.Long l2 = jifVar.c;
                if (l2 != null) {
                    int iLongValue2 = (int) l2.longValue();
                    akzxVarM.u();
                    amom amomVar2 = akzxVarM.b;
                    amomVar2.b |= 2;
                    amomVar2.d = iLongValue2;
                }
                java.lang.Long l3 = jifVar.e;
                if (l3 != null) {
                    int iLongValue3 = (int) l3.longValue();
                    akzxVarM.u();
                    amom amomVar3 = akzxVarM.b;
                    amomVar3.b |= 8;
                    amomVar3.f = iLongValue3;
                }
                java.lang.Long l4 = jifVar.d;
                if (l4 != null) {
                    int iLongValue4 = (int) l4.longValue();
                    akzxVarM.u();
                    amom amomVar4 = akzxVarM.b;
                    amomVar4.b |= 4;
                    amomVar4.e = iLongValue4;
                }
                int i7 = jifVar.g;
                if (i7 != 0) {
                    akzxVarM.u();
                    amom amomVar5 = akzxVarM.b;
                    amomVar5.g = i7 - 1;
                    amomVar5.b |= 16;
                }
                java.lang.Boolean bool = jifVar.f;
                if (bool != null) {
                    bool.booleanValue();
                    akzxVarM.u();
                    amom amomVar6 = akzxVarM.b;
                    amomVar6.b |= 32;
                    amomVar6.h = true;
                }
                amom amomVarP = akzxVarM.p();
                aooh.e(amomVarP, "build(...)");
                return amomVarP;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                ((defpackage.jif) this.a).f = java.lang.Boolean.TRUE;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooc.af(obj);
                defpackage.jnp.a.b().l("com/android/dialer/callannouncer/impl/growthkit/CallAnnouncerPromoGatewayHandler", "createMultibindingSettingsIntent", 42, "CallAnnouncerPromoGatewayHandler.kt").v("creating multibinding settings intent");
                ryg rygVarAU = pez.aU(rvq.a.m());
                ryg rygVarAS = pez.aS(rvo.a.m());
                rygVarAS.k(rvc.y);
                akzx akzxVarM2 = rvh.a.m();
                aooh.f(akzxVarM2, "builder");
                akzxVarM2.u();
                akzxVarM2.b.b = true;
                rvh rvhVarP = akzxVarM2.p();
                aooh.e(rvhVarP, "build(...)");
                rvh rvhVar = rvhVarP;
                aooh.f(rvhVar, "value");
                akzx akzxVar = (akzx) rygVarAS.a;
                akzxVar.u();
                rvo rvoVar = akzxVar.b;
                j$.util.Objects.requireNonNull(rvhVar);
                rvoVar.c = rvhVar;
                rvoVar.b = 6;
                rygVarAU.o(rygVarAS.i());
                return com.google.apps.tiktok.nav.gateway.GatewayHandler.GatewayDestination.b(((defpackage.jnp) this.a).c.aL(rygVarAU.n()));
            default:
                aooc.af(obj);
                return java.lang.String.valueOf(((android.content.SharedPreferences) this.a.a()).getLong("global_blacklist_experiment_id", 0L));
        }
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v40, types: [aoin, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.icr((defpackage.icu) this.a, aolnVar, 0);
            case 1:
                return new defpackage.icr((defpackage.hyf) this.a, aolnVar, 1);
            case 2:
                return new defpackage.icr((defpackage.icu) this.a, aolnVar, 2, (byte[]) null);
            case 3:
                return new defpackage.icr((defpackage.ijk) this.a, aolnVar, 3);
            case 4:
                return new defpackage.icr((defpackage.ijk) this.a, aolnVar, 4, (byte[]) null);
            case 5:
                return new defpackage.icr((defpackage.ijt) this.a, aolnVar, 5);
            case 6:
                return new defpackage.icr((defpackage.ili) this.a, aolnVar, 6);
            case 7:
                return new defpackage.icr((ipo) this.a, aolnVar, 7);
            case 8:
                return new defpackage.icr((ipt) this.a, aolnVar, 8);
            case 9:
                return new defpackage.icr((ipt) this.a, aolnVar, 9, (byte[]) null);
            case 10:
                return new defpackage.icr((kgl) this.a, aolnVar, 10);
            case 11:
                return new defpackage.icr((java.io.File) this.a, aolnVar, 11);
            case 12:
                return new defpackage.icr((java.lang.String) this.a, aolnVar, 12);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.icr((iqm) this.a, aolnVar, 13);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.icr((ccp) this.a, aolnVar, 14);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.icr((android.content.RestrictionsManager) this.a, aolnVar, 15);
            case 16:
                return new defpackage.icr((defpackage.jcp) this.a, aolnVar, 16);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.icr((defpackage.jif) this.a, aolnVar, 17);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.icr((defpackage.jif) this.a, aolnVar, 18, (byte[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.icr((defpackage.jnp) this.a, aolnVar, 19);
            default:
                return new defpackage.icr((aoin) this.a, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(aoin aoinVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aoinVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(ccp ccpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.hyf hyfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = hyfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.icu icuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = icuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.icu icuVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = icuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.ijk ijkVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ijkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.ijk ijkVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ijkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.ijt ijtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ijtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.ili iliVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = iliVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(ipo ipoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ipoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(ipt iptVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = iptVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(ipt iptVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = iptVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(iqm iqmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = iqmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(java.io.File file, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.jcp jcpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jcpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.jif jifVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jifVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.jif jifVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jifVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(defpackage.jnp jnpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jnpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icr(kgl kglVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = kglVar;
    }
}
