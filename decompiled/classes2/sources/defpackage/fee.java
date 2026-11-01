package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fee {
    public static final ahzi a = ahvr.bI(new defpackage.fed(0));
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final android.media.MediaCodecInfo.CodecCapabilities e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public int k;
    public int l;
    public float m;

    public fee(java.lang.String str, java.lang.String str2, java.lang.String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        ahvr.ci(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = codecCapabilities;
        this.h = z;
        this.f = z2;
        this.g = z3;
        this.i = z4;
        this.j = defpackage.eqz.i(str2);
        this.m = -3.4028235E38f;
        this.k = -1;
        this.l = -1;
    }

    public static android.graphics.Point a(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        java.lang.String str = eum.a;
        return new android.graphics.Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void j(java.lang.String str) {
        defpackage.etr.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.b + ", " + this.c + "] [" + eum.a + ']');
    }

    private static boolean k(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        android.graphics.Point pointA = a(videoCapabilities, i, i2);
        int i3 = pointA.x;
        int i4 = pointA.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = java.lang.Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        android.util.Range<java.lang.Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((java.lang.Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015b  */
    /* JADX WARN: Code duplicated, block: B:102:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x014f  */
    public final defpackage.exd b(defpackage.eqg eqgVar, defpackage.eqg eqgVar2) {
        defpackage.eqg eqgVar3;
        defpackage.eqg eqgVar4;
        defpackage.exd exdVar;
        java.lang.String str;
        int i;
        java.lang.String str2 = eqgVar.p;
        java.lang.String str3 = eqgVar2.p;
        int i2 = true != j$.util.Objects.equals(str2, str3) ? 8 : 0;
        if (!this.j) {
            eqgVar3 = eqgVar;
            eqgVar4 = eqgVar2;
            if (eqgVar3.H != eqgVar4.H) {
                i2 |= 4096;
            }
            if (eqgVar3.J != eqgVar4.J) {
                i2 |= 8192;
            }
            if (eqgVar3.K != eqgVar4.K) {
                i2 |= 16384;
            }
            if (i2 == 0) {
                java.lang.String str4 = this.c;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    android.util.Pair pairA = defpackage.ete.a(eqgVar3);
                    android.util.Pair pairA2 = defpackage.ete.a(eqgVar4);
                    if (pairA != null && pairA2 != null) {
                        int iIntValue = ((java.lang.Integer) pairA.first).intValue();
                        int iIntValue2 = ((java.lang.Integer) pairA2.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 3, 0);
                        } else if (str4.equals("audio/ac4") && pairA.equals(pairA2)) {
                            exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 3, 0);
                        } else if (i2 == 0) {
                            str = this.c;
                            if (str.equals("audio/eac3-joc")) {
                            }
                            exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 3, 0);
                        } else {
                            if (!eqgVar3.d(eqgVar4)) {
                                i2 |= 32;
                            }
                            if ("audio/opus".equals(this.c)) {
                                i2 |= 2;
                            }
                            if (i2 == 0) {
                                exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 1, 0);
                            }
                        }
                    } else if (i2 == 0) {
                        str = this.c;
                        if (!str.equals("audio/eac3-joc") || str.equals("audio/eac3")) {
                            exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 3, 0);
                        } else {
                            if (!eqgVar3.d(eqgVar4)) {
                                i2 |= 32;
                            }
                            if ("audio/opus".equals(this.c)) {
                                i2 |= 2;
                            }
                            if (i2 == 0) {
                                exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 1, 0);
                            }
                        }
                    } else {
                        if (!eqgVar3.d(eqgVar4)) {
                            i2 |= 32;
                        }
                        if ("audio/opus".equals(this.c)) {
                            i2 |= 2;
                        }
                        if (i2 == 0) {
                            exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 1, 0);
                        }
                    }
                } else if (i2 == 0) {
                    str = this.c;
                    if (str.equals("audio/eac3-joc")) {
                    }
                    exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 3, 0);
                } else {
                    if (!eqgVar3.d(eqgVar4)) {
                        i2 |= 32;
                    }
                    if ("audio/opus".equals(this.c)) {
                        i2 |= 2;
                    }
                    if (i2 == 0) {
                        exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 1, 0);
                    }
                }
            } else if (i2 == 0) {
                str = this.c;
                if (str.equals("audio/eac3-joc")) {
                }
                exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 3, 0);
            } else {
                if (!eqgVar3.d(eqgVar4)) {
                    i2 |= 32;
                }
                if ("audio/opus".equals(this.c)) {
                    i2 |= 2;
                }
                if (i2 == 0) {
                    exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 1, 0);
                }
            }
            return exdVar;
        }
        if (eqgVar.A != eqgVar2.A) {
            i2 |= 1024;
        }
        boolean z = (eqgVar.v == eqgVar2.v && eqgVar.w == eqgVar2.w) ? false : true;
        if (!this.f && z) {
            i2 |= 512;
        }
        defpackage.epy epyVar = eqgVar.F;
        if ((!defpackage.epy.h(epyVar) || !defpackage.epy.h(eqgVar2.F)) && !j$.util.Objects.equals(epyVar, eqgVar2.F)) {
            i2 |= 2048;
        }
        java.lang.String str5 = this.b;
        int i3 = defpackage.equ.a;
        if (android.os.Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str5) && !eqgVar.d(eqgVar2)) {
            i2 |= 2;
        }
        int i4 = eqgVar.x;
        if (i4 != -1 && (i = eqgVar.y) != -1 && i4 == eqgVar2.x && i == eqgVar2.y && z) {
            i2 |= 2;
        }
        if (i2 == 0 && j$.util.Objects.equals(str3, "video/dolby-vision")) {
            android.util.Pair pairA3 = defpackage.ete.a(eqgVar);
            android.util.Pair pairA4 = defpackage.ete.a(eqgVar2);
            if (pairA3 == null || pairA4 == null || !((java.lang.Integer) pairA3.first).equals(pairA4.first)) {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return new defpackage.exd(str5, eqgVar, eqgVar2, true == eqgVar.d(eqgVar2) ? 3 : 2, 0);
        }
        eqgVar3 = eqgVar;
        eqgVar4 = eqgVar2;
        exdVar = new defpackage.exd(this.b, eqgVar3, eqgVar4, 0, i2);
        return exdVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r3.equals("video/hevc") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r3.equals("video/av01") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.content.Context r18, defpackage.eqg r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fee.c(android.content.Context, eqg, boolean):boolean");
    }

    public final boolean d(defpackage.eqg eqgVar) {
        return (j$.util.Objects.equals(eqgVar.p, "audio/flac") && eqgVar.K == 22 && android.os.Build.VERSION.SDK_INT < 34 && this.b.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(android.content.Context context, defpackage.eqg eqgVar) {
        int i;
        int i2;
        if (!f(eqgVar) || !c(context, eqgVar, true) || !d(eqgVar)) {
            return false;
        }
        if (this.j) {
            int i3 = eqgVar.v;
            if (i3 > 0 && (i2 = eqgVar.w) > 0) {
                return h(i3, i2, eqgVar.z);
            }
        } else {
            int i4 = eqgVar.J;
            if (i4 != -1) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
                if (codecCapabilities == null) {
                    j("sampleRate.caps");
                    return false;
                }
                android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    j("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    j(a.bj(i4, "sampleRate.support, "));
                    return false;
                }
            }
            int i5 = eqgVar.H;
            if (i5 != -1) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.e;
                if (codecCapabilities2 == null) {
                    j("channelCount.caps");
                    return false;
                }
                android.media.MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    j("channelCount.aCaps");
                    return false;
                }
                java.lang.String str = this.b;
                java.lang.String str2 = this.c;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    defpackage.etr.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + ']');
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    j(a.bj(i5, "channelCount.support, "));
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(defpackage.eqg eqgVar) {
        java.lang.String str = this.c;
        return str.equals(eqgVar.p) || str.equals(defpackage.feq.c(eqgVar));
    }

    public final boolean g(defpackage.eqg eqgVar) {
        if (this.j) {
            return this.f;
        }
        defpackage.etd etdVarC = defpackage.ete.c(eqgVar);
        return etdVarC != null && etdVarC.b && etdVarC.b() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    public final boolean h(int i, int i2, double d) {
        java.util.List listM;
        int iAq;
        boolean z;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            j("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            j("sizeAndRate.vCaps");
            return false;
        }
        java.lang.Boolean bool = defpackage.hgt.d;
        if ((bool != null && bool.booleanValue()) || (listM = fn$.ExternalSyntheticApiModelOutline0.m(videoCapabilities)) == null || listM.isEmpty()) {
            iAq = 0;
        } else {
            iAq = defpackage.hgt.aq(listM, new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
            if (iAq == 1 && defpackage.hgt.d == null) {
                if (android.os.Build.VERSION.SDK_INT < 37) {
                    int iAp = defpackage.hgt.ap(true);
                    if (android.os.Build.VERSION.SDK_INT < 35 ? defpackage.hgt.ap(false) != 2 || iAp == 1 : iAp == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                defpackage.hgt.d = java.lang.Boolean.valueOf(z);
                if (defpackage.hgt.d.booleanValue()) {
                    iAq = 0;
                }
            }
        }
        if (iAq != 2) {
            if (iAq == 1) {
                j("sizeAndRate.cover, " + i + 'x' + i2 + '@' + d);
                return false;
            }
            if (!k(videoCapabilities, i, i2, d)) {
                if (i < i2) {
                    java.lang.String str = this.b;
                    int i3 = defpackage.equ.a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(android.os.Build.DEVICE)) && k(videoCapabilities, i2, i, d)) {
                        defpackage.etr.b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + 'x' + i2 + '@' + d) + "] [" + str + ", " + this.c + "] [" + eum.a + ']');
                    }
                }
                j("sizeAndRate.support, " + i + 'x' + i2 + '@' + d);
                return false;
            }
        }
        return true;
    }

    public final android.media.MediaCodecInfo.CodecProfileLevel[] i() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
