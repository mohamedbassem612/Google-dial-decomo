package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class feq {
    public static final /* synthetic */ int a = 0;
    private static final java.util.HashMap b = new java.util.HashMap();

    public static android.media.MediaCodecInfo.CodecProfileLevel a(int i, int i2) {
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static aify b(android.content.Context context, java.util.List list, defpackage.eqg eqgVar) {
        aift aiftVar = new aift(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.fee feeVar = (defpackage.fee) it.next();
            if (feeVar.e(context, eqgVar)) {
                aiftVar.i(feeVar);
            }
        }
        return aiftVar.h();
    }

    public static java.lang.String c(defpackage.eqg eqgVar) {
        defpackage.etd etdVarC;
        java.lang.String str = eqgVar.p;
        if ("audio/eac3-joc".equals(str)) {
            if (!j$.util.Objects.equals(android.os.Build.MANUFACTURER, "Google")) {
                return "audio/eac3";
            }
        } else {
            if ("audio/vnd.dts.hd".equals(str) || "audio/vnd.dts.uhd;profile=p2".equals(str)) {
                return "audio/vnd.dts";
            }
            if ("video/dolby-vision".equals(str) && (etdVarC = defpackage.ete.c(eqgVar)) != null && etdVarC.b) {
                int iB = etdVarC.b();
                if (iB != 16 && iB != 256) {
                    if (iB == 512) {
                        return "video/avc";
                    }
                    if (iB == 1024) {
                        defpackage.epy epyVar = eqgVar.F;
                        if (epyVar == null || epyVar.d != 6 || epyVar.c != 1) {
                            return "video/av01";
                        }
                    }
                }
                return "video/hevc";
            }
            if ("video/mv-hevc".equals(str)) {
                return "video/hevc";
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0128 A[Catch: Exception -> 0x01fc, all -> 0x0287, TryCatch #1 {Exception -> 0x01fc, blocks: (B:59:0x00ec, B:64:0x0107, B:70:0x011b, B:72:0x0128, B:74:0x012e, B:76:0x0136, B:78:0x0142, B:80:0x014a, B:85:0x0159, B:89:0x016f), top: B:152:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:74:0x012e A[Catch: Exception -> 0x01fc, all -> 0x0287, TryCatch #1 {Exception -> 0x01fc, blocks: (B:59:0x00ec, B:64:0x0107, B:70:0x011b, B:72:0x0128, B:74:0x012e, B:76:0x0136, B:78:0x0142, B:80:0x014a, B:85:0x0159, B:89:0x016f), top: B:152:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x0159 A[Catch: Exception -> 0x01fc, all -> 0x0287, TryCatch #1 {Exception -> 0x01fc, blocks: (B:59:0x00ec, B:64:0x0107, B:70:0x011b, B:72:0x0128, B:74:0x012e, B:76:0x0136, B:78:0x0142, B:80:0x014a, B:85:0x0159, B:89:0x016f), top: B:152:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0177 A[ADDED_TO_REGION] */
    public static synchronized java.util.List d(java.lang.String str, boolean z, boolean z2) {
        java.util.List listN;
        android.media.MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i2;
        java.lang.String str2;
        java.lang.String str3;
        boolean zIsFeatureSupported;
        boolean zIsFeatureRequired;
        boolean zM$1;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.Integer num;
        defpackage.fen fenVar = new defpackage.fen(str, z, z2);
        java.util.HashMap map = b;
        listN = (java.util.List) map.get(fenVar);
        if (listN == null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str4 = fenVar.a;
                boolean zEquals = str4.equals("video/mv-hevc");
                boolean z6 = fenVar.b;
                int i3 = 0;
                android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList((z6 || fenVar.c || zEquals) ? 1 : 0).getCodecInfos();
                int length = codecInfos.length;
                int i4 = 0;
                while (i4 < length) {
                    android.media.MediaCodecInfo mediaCodecInfo = codecInfos[i4];
                    if (fn$.ExternalSyntheticApiModelOutline0.m(mediaCodecInfo)) {
                        mediaCodecInfoArr = codecInfos;
                        length = length;
                        i = i4;
                        z6 = z6;
                        i2 = i3;
                    } else {
                        int i5 = i3;
                        java.lang.String name = mediaCodecInfo.getName();
                        if (mediaCodecInfo.isEncoder()) {
                            mediaCodecInfoArr = codecInfos;
                            length = length;
                            i = i4;
                            z6 = z6;
                            i2 = i5;
                        } else {
                            java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                            int length2 = supportedTypes.length;
                            while (true) {
                                if (i5 >= length2) {
                                    str2 = null;
                                    if (!str4.equals("video/dolby-vision")) {
                                        if (!str4.equals("video/mv-hevc")) {
                                            if (!str4.equals("audio/alac") || !"OMX.lge.alac.decoder".equals(name)) {
                                                if (!str4.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(name)) {
                                                    if (!str4.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                                        break;
                                                        break;
                                                    }
                                                    str2 = "audio/lg-ac3";
                                                    break;
                                                }
                                                str2 = "audio/x-lg-flac";
                                                break;
                                            }
                                            str2 = "audio/x-lg-alac";
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                            break;
                                        }
                                        str2 = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            break;
                                        }
                                        str2 = "video/dv_hevc";
                                        break;
                                    }
                                    str2 = "video/hevcdv";
                                    break;
                                }
                                str2 = supportedTypes[i5];
                                if (str2.equalsIgnoreCase(str4)) {
                                    break;
                                }
                                i5++;
                            }
                            if (str2 != null) {
                                i = i4;
                                try {
                                    android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str2);
                                    boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("tunneled-playback");
                                    boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("tunneled-playback");
                                    mediaCodecInfoArr = codecInfos;
                                    if (fenVar.c) {
                                        if (zIsFeatureSupported2) {
                                            zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                            zIsFeatureRequired = capabilitiesForType.isFeatureRequired("secure-playback");
                                            if (z6) {
                                                if (zIsFeatureSupported) {
                                                    zIsFeatureSupported = true;
                                                    zM$1 = fn$.ExternalSyntheticApiModelOutline0.m$1(mediaCodecInfo);
                                                    fn$.ExternalSyntheticApiModelOutline0.m$2(mediaCodecInfo);
                                                    fn$.ExternalSyntheticApiModelOutline0.m$3(mediaCodecInfo);
                                                    if (z6 == zIsFeatureSupported) {
                                                        ahzi ahziVar = defpackage.fee.a;
                                                        if (capabilitiesForType == null) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (capabilitiesForType != null) {
                                                            capabilitiesForType.isFeatureSupported("tunneled-playback");
                                                            if (capabilitiesForType.isFeatureSupported("secure-playback")) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (android.os.Build.VERSION.SDK_INT >= 35) {
                                                            str3 = str2;
                                                            z5 = false;
                                                            i2 = 0;
                                                            arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                        } else {
                                                            str3 = str2;
                                                            z5 = false;
                                                            i2 = 0;
                                                            arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } else if (!zIsFeatureRequired) {
                                                zM$1 = fn$.ExternalSyntheticApiModelOutline0.m$1(mediaCodecInfo);
                                                fn$.ExternalSyntheticApiModelOutline0.m$2(mediaCodecInfo);
                                                fn$.ExternalSyntheticApiModelOutline0.m$3(mediaCodecInfo);
                                                if (z6 == zIsFeatureSupported) {
                                                    ahzi ahziVar2 = defpackage.fee.a;
                                                    if (capabilitiesForType == null) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (capabilitiesForType != null) {
                                                        capabilitiesForType.isFeatureSupported("tunneled-playback");
                                                        if (capabilitiesForType.isFeatureSupported("secure-playback")) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                                                        str3 = str2;
                                                        z5 = false;
                                                        i2 = 0;
                                                        arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                    } else {
                                                        str3 = str2;
                                                        z5 = false;
                                                        i2 = 0;
                                                        arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                    } else if (!zIsFeatureRequired2) {
                                        zIsFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                                        zIsFeatureRequired = capabilitiesForType.isFeatureRequired("secure-playback");
                                        if (z6) {
                                            if (!zIsFeatureRequired) {
                                                zM$1 = fn$.ExternalSyntheticApiModelOutline0.m$1(mediaCodecInfo);
                                                fn$.ExternalSyntheticApiModelOutline0.m$2(mediaCodecInfo);
                                                fn$.ExternalSyntheticApiModelOutline0.m$3(mediaCodecInfo);
                                                if (z6 == zIsFeatureSupported) {
                                                    ahzi ahziVar3 = defpackage.fee.a;
                                                    if (capabilitiesForType == null && capabilitiesForType.isFeatureSupported("adaptive-playback")) {
                                                        int i6 = defpackage.equ.a;
                                                        if (android.os.Build.MODEL.equals("MiTV-AYFR0") && (name.equals("OMX.amlogic.avc.decoder.awesome2") || name.equals("OMX.amlogic.avc.decoder.awesome2.secure"))) {
                                                            z3 = false;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (capabilitiesForType != null) {
                                                        capabilitiesForType.isFeatureSupported("tunneled-playback");
                                                        if (capabilitiesForType.isFeatureSupported("secure-playback")) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (android.os.Build.VERSION.SDK_INT >= 35 || capabilitiesForType == null) {
                                                        str3 = str2;
                                                        z5 = false;
                                                    } else {
                                                        try {
                                                            if (!capabilitiesForType.isFeatureSupported("detached-surface") || ((num = (java.lang.Integer) defpackage.fee.a.eZ()) != null && num.intValue() <= 202604 && (android.os.Build.MANUFACTURER.equals("Xiaomi") || android.os.Build.MANUFACTURER.equals("OPPO") || android.os.Build.MANUFACTURER.equals("realme") || android.os.Build.MANUFACTURER.equals("motorola") || android.os.Build.MANUFACTURER.equals("LENOVO") || android.os.Build.MANUFACTURER.equals("Fairphone")))) {
                                                                str3 = str2;
                                                                z5 = false;
                                                            } else {
                                                                str3 = str2;
                                                                z5 = true;
                                                            }
                                                        } catch (java.lang.Exception e) {
                                                            e = e;
                                                            str3 = str2;
                                                            name = name;
                                                            defpackage.etr.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str3 + ')');
                                                            throw e;
                                                        }
                                                    }
                                                    i2 = 0;
                                                    try {
                                                        arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                    } catch (java.lang.Exception e2) {
                                                        e = e2;
                                                        defpackage.etr.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str3 + ')');
                                                        throw e;
                                                    }
                                                }
                                            }
                                        } else if (zIsFeatureSupported) {
                                            zIsFeatureSupported = true;
                                            zM$1 = fn$.ExternalSyntheticApiModelOutline0.m$1(mediaCodecInfo);
                                            fn$.ExternalSyntheticApiModelOutline0.m$2(mediaCodecInfo);
                                            fn$.ExternalSyntheticApiModelOutline0.m$3(mediaCodecInfo);
                                            if (z6 == zIsFeatureSupported) {
                                                ahzi ahziVar4 = defpackage.fee.a;
                                                if (capabilitiesForType == null) {
                                                    z3 = false;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (capabilitiesForType != null) {
                                                    capabilitiesForType.isFeatureSupported("tunneled-playback");
                                                    if (capabilitiesForType.isFeatureSupported("secure-playback")) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else {
                                                    z4 = false;
                                                }
                                                if (android.os.Build.VERSION.SDK_INT >= 35) {
                                                    str3 = str2;
                                                    z5 = false;
                                                    i2 = 0;
                                                    arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                } else {
                                                    str3 = str2;
                                                    z5 = false;
                                                    i2 = 0;
                                                    arrayList.add(new defpackage.fee(name, str4, str3, capabilitiesForType, zM$1, z3, z4, z5));
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    i = i;
                                } catch (java.lang.Exception e3) {
                                    e = e3;
                                    str3 = str2;
                                }
                            } else {
                                mediaCodecInfoArr = codecInfos;
                                i = i4;
                            }
                            z6 = z6;
                            i2 = 0;
                        }
                    }
                    i4 = i + 1;
                    i3 = i2;
                    length = length;
                    codecInfos = mediaCodecInfoArr;
                    z6 = z6;
                }
                int i7 = i3;
                if ("audio/raw".equals(str)) {
                    f(arrayList, new defpackage.fem());
                }
                if (android.os.Build.VERSION.SDK_INT < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((defpackage.fee) arrayList.get(i7)).b)) {
                    arrayList.add((defpackage.fee) arrayList.remove(i7));
                }
                listN = aify.n(arrayList);
                map.put(fenVar, listN);
            } catch (java.lang.Exception e4) {
                throw new defpackage.feo(e4);
            }
        }
        return listN;
    }

    public static java.util.List e(final android.content.Context context, java.util.List list, final defpackage.eqg eqgVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        f(arrayList, new defpackage.fep() { // from class: fel
            @Override // defpackage.fep
            public final int a(java.lang.Object obj) {
                defpackage.fee feeVar = (defpackage.fee) obj;
                int i = defpackage.feq.a;
                defpackage.eqg eqgVar2 = eqgVar;
                return (feeVar.f(eqgVar2) && feeVar.c(context, eqgVar2, false) && feeVar.d(eqgVar2)) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static void f(java.util.List list, defpackage.fep fepVar) {
        j$.util.List.-EL.sort(list, new defpackage.bdt(fepVar, 10, null));
    }

    public static defpackage.fee g() {
        java.util.List listD = d("audio/raw", false, false);
        if (listD.isEmpty()) {
            return null;
        }
        return (defpackage.fee) listD.get(0);
    }

    public static java.util.List h(defpackage.eqg eqgVar, boolean z, boolean z2) {
        java.lang.String strC = c(eqgVar);
        return strC == null ? aike.a : d(strC, z, z2);
    }

    public static java.util.List i(android.content.Context context, defpackage.eqg eqgVar, boolean z, boolean z2) {
        java.lang.String strC = c(eqgVar);
        return strC == null ? aike.a : b(context, d(strC, z, z2), eqgVar);
    }

    public static java.util.List j(defpackage.eqg eqgVar, boolean z, boolean z2) {
        java.util.List listD = d(eqgVar.p, z, z2);
        java.util.List listH = h(eqgVar, z, z2);
        aift aiftVar = new aift(4);
        aiftVar.k(listD);
        aiftVar.k(listH);
        return aiftVar.h();
    }
}
