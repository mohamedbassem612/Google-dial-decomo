package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fai {
    public static final defpackage.fai a;
    static final aigf b;
    private static final aify e;
    private static final aify f;
    private static final aify g;
    public final aify c;
    public final aify d;
    private final android.util.SparseArray h = new android.util.SparseArray();
    private final int i;

    static {
        aify aifyVarP = aify.p(12);
        e = aifyVarP;
        aify aifyVar = aike.a;
        f = aifyVar;
        a = new defpackage.fai(aify.p(defpackage.fah.a), aifyVarP, aifyVar);
        g = aify.r(2, 5, 6);
        aigb aigbVar = new aigb(4);
        aigbVar.i(5, 6);
        aigbVar.i(17, 6);
        aigbVar.i(7, 6);
        aigbVar.i(30, 10);
        aigbVar.i(18, 6);
        aigbVar.i(6, 8);
        aigbVar.i(8, 8);
        aigbVar.i(14, 8);
        b = aigbVar.e(true);
    }

    public fai(java.util.List list, java.util.List list2, java.util.List list3) {
        for (int i = 0; i < ((aike) list).d; i++) {
            defpackage.fah fahVar = (defpackage.fah) list.get(i);
            this.h.put(fahVar.b, fahVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            iMax = java.lang.Math.max(iMax, ((defpackage.fah) this.h.valueAt(i2)).c);
        }
        this.i = iMax;
        this.c = aify.n(list2);
        this.d = aify.n(list3);
    }

    static defpackage.fai b(android.content.Context context, defpackage.epu epuVar, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List list) {
        return c(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), epuVar, audioDeviceInfo, list);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e7  */
    static defpackage.fai c(android.content.Context context, android.content.Intent intent, defpackage.epu epuVar, android.media.AudioDeviceInfo audioDeviceInfo, java.util.List list) {
        android.media.AudioDeviceInfo audioDeviceInfo2;
        int i;
        aify aifyVarA;
        android.media.AudioDeviceInfo[] devices;
        defpackage.fai faiVar;
        int type;
        aify aifyVarN;
        int i2;
        int speakerLayoutChannelMask;
        android.media.AudioManager audioManagerAH = defpackage.hgt.aH(context);
        int i3 = 0;
        if (audioDeviceInfo == null) {
            audioDeviceInfo2 = null;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                try {
                    java.util.List listM = ae$.ExternalSyntheticApiModelOutline0.m(audioManagerAH, epuVar.a());
                    if (!listM.isEmpty()) {
                        audioDeviceInfo2 = (android.media.AudioDeviceInfo) listM.get(0);
                    }
                } catch (java.lang.RuntimeException unused) {
                }
            }
        } else {
            audioDeviceInfo2 = audioDeviceInfo;
        }
        if (audioDeviceInfo2 != null) {
            aify aifyVar = defpackage.fcd.a;
            if (defpackage.hgu.ax(audioDeviceInfo2.getType())) {
                aifyVarA = defpackage.fcd.a;
            } else if (audioDeviceInfo2.getType() == 1) {
                aifyVarA = aify.p(4);
            } else {
                int type2 = audioDeviceInfo2.getType();
                int i4 = android.os.Build.VERSION.SDK_INT;
                if (type2 == 2) {
                    if (i4 < 36 || (speakerLayoutChannelMask = audioDeviceInfo2.getSpeakerLayoutChannelMask()) == 0 || speakerLayoutChannelMask == 1) {
                        defpackage.etr.f("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                        aifyVarA = defpackage.fcd.a;
                    } else {
                        aifyVarA = aify.p(java.lang.Integer.valueOf(speakerLayoutChannelMask));
                    }
                } else if (i4 >= 31 && audioDeviceInfo2.getType() == 10) {
                    aifyVarA = defpackage.fcd.a(audioDeviceInfo2);
                    if (aifyVarA.isEmpty()) {
                        aifyVarA = defpackage.hgt.as(mp$.ExternalSyntheticApiModelOutline0.m(audioDeviceInfo2));
                        if (aifyVarA.isEmpty()) {
                            aifyVarA = defpackage.fcd.a;
                        }
                    }
                } else if (android.os.Build.VERSION.SDK_INT >= 31) {
                    int type3 = audioDeviceInfo2.getType();
                    if (android.os.Build.VERSION.SDK_INT < 31 || type3 != 29) {
                        i = 0;
                        if (android.os.Build.VERSION.SDK_INT >= 31 || !((type = audioDeviceInfo2.getType()) == 11 || type == 12 || (android.os.Build.VERSION.SDK_INT >= 31 && type == 22))) {
                            aifyVarA = defpackage.fcd.a;
                        } else {
                            aifyVarA = defpackage.fcd.a(audioDeviceInfo2);
                            if (aifyVarA.isEmpty()) {
                                aifyVarA = defpackage.fcd.a;
                            }
                        }
                    } else {
                        aifyVarA = defpackage.fcd.a(audioDeviceInfo2);
                        if (aifyVarA.isEmpty()) {
                            java.util.List listM2 = mp$.ExternalSyntheticApiModelOutline0.m(audioDeviceInfo2);
                            if (android.os.Build.VERSION.SDK_INT >= 34) {
                                if (android.os.Build.VERSION.SDK_INT < 34 || listM2 == null) {
                                    i = 0;
                                    aifyVarN = aike.a;
                                } else {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.util.Iterator it = listM2.iterator();
                                    while (it.hasNext()) {
                                        android.media.AudioDescriptor audioDescriptorM = mp$.ExternalSyntheticApiModelOutline0.m(it.next());
                                        if (mp$.ExternalSyntheticApiModelOutline0.m(audioDescriptorM) == 2) {
                                            byte[] bArrM = mp$.ExternalSyntheticApiModelOutline0.m(audioDescriptorM);
                                            int length = bArrM.length;
                                            int i5 = i3;
                                            if (length != 3) {
                                                defpackage.etr.f("AudioDescriptorUtil", "Invalid SADB length: " + length);
                                            } else {
                                                if (android.os.Build.VERSION.SDK_INT >= 34) {
                                                    byte b2 = bArrM[i5];
                                                    i2 = 1 != (b2 & 1) ? i5 : 12;
                                                    if ((b2 & 2) != 0) {
                                                        i2 |= 32;
                                                    }
                                                    if ((b2 & 4) != 0) {
                                                        i2 |= 16;
                                                    }
                                                    if ((b2 & 8) != 0) {
                                                        i2 |= 192;
                                                    }
                                                    if ((b2 & 16) != 0) {
                                                        i2 |= 1024;
                                                    }
                                                    if ((b2 & 32) != 0) {
                                                        i2 |= 768;
                                                    }
                                                    if ((b2 & 128) != 0) {
                                                        i2 |= 201326592;
                                                    }
                                                    byte b3 = bArrM[1];
                                                    if ((b3 & 1) != 0) {
                                                        i2 |= 81920;
                                                    }
                                                    if ((b3 & 2) != 0) {
                                                        i2 |= 8192;
                                                    }
                                                    if ((b3 & 4) != 0) {
                                                        i2 |= 32768;
                                                    }
                                                    if ((b3 & 8) != 0) {
                                                        i2 |= 6144;
                                                    }
                                                    if ((b3 & 16) != 0) {
                                                        i2 |= 33554432;
                                                    }
                                                    if ((b3 & 32) != 0) {
                                                        i2 |= 262144;
                                                    }
                                                    if ((b3 & 64) != 0) {
                                                        i2 |= 6144;
                                                    }
                                                    if ((b3 & 128) != 0) {
                                                        i2 |= 3145728;
                                                    }
                                                    byte b4 = bArrM[2];
                                                    if ((b4 & 1) != 0) {
                                                        i2 |= 655360;
                                                    }
                                                    if ((b4 & 2) != 0) {
                                                        i2 |= 8388608;
                                                    }
                                                    if ((b4 & 4) != 0) {
                                                        i2 |= 20971520;
                                                    }
                                                } else {
                                                    i2 = i5;
                                                }
                                                arrayList.add(java.lang.Integer.valueOf(i2));
                                            }
                                            i3 = i5;
                                        }
                                    }
                                    i = i3;
                                    j$.util.List.-EL.sort(arrayList, new defpackage.djh(6));
                                    aifyVarN = aify.n(arrayList);
                                }
                                if (!aifyVarN.isEmpty()) {
                                    aifyVarA = aifyVarN;
                                }
                            } else {
                                i = 0;
                            }
                            aifyVarA = defpackage.hgt.as(listM2);
                            if (aifyVarA.isEmpty()) {
                                aifyVarA = defpackage.fcd.a;
                            }
                        }
                    }
                } else {
                    i = 0;
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        aifyVarA = defpackage.fcd.a;
                    } else {
                        aifyVarA = defpackage.fcd.a;
                    }
                }
            }
            i = 0;
        } else {
            i = 0;
            aifyVarA = e;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && (eum.X(context) || eum.T(context))) {
            java.util.List listM$1 = ae$.ExternalSyntheticApiModelOutline0.m$1(audioManagerAH, epuVar.a());
            java.util.HashMap map = new java.util.HashMap();
            map.put(2, new java.util.HashSet(aiql.U(new int[]{12})));
            for (int i6 = i; i6 < listM$1.size(); i6++) {
                android.media.AudioProfile audioProfileM = mp$.ExternalSyntheticApiModelOutline0.m(listM$1.get(i6));
                if (mp$.ExternalSyntheticApiModelOutline0.m(audioProfileM) != 1) {
                    int iM$1 = mp$.ExternalSyntheticApiModelOutline0.m$1(audioProfileM);
                    if (eum.U(iM$1) || b.containsKey(java.lang.Integer.valueOf(iM$1))) {
                        ((java.util.Set) j$.util.Map.-EL.computeIfAbsent(map, java.lang.Integer.valueOf(iM$1), new defpackage.etw(2))).addAll(aiql.U(mp$.ExternalSyntheticApiModelOutline0.m(audioProfileM)));
                    }
                }
            }
            aift aiftVar = new aift(4);
            for (java.util.Map.Entry entry : map.entrySet()) {
                aiftVar.i(new defpackage.fah(((java.lang.Integer) entry.getKey()).intValue(), (java.util.Set) entry.getValue()));
            }
            return new defpackage.fai(aiftVar.h(), aifyVarA, list);
        }
        if (audioDeviceInfo2 == null) {
            devices = audioManagerAH.getDevices(2);
        } else {
            devices = new android.media.AudioDeviceInfo[1];
            devices[i] = audioDeviceInfo2;
        }
        int length2 = devices.length;
        for (int i7 = i; i7 < length2; i7++) {
            if (defpackage.hgu.ax(devices[i7].getType())) {
                return new defpackage.fai(aify.p(defpackage.fah.a), aifyVarA, list);
            }
        }
        aihb aihbVar = new aihb();
        aihbVar.i(2);
        if (eum.X(context) || eum.T(context)) {
            aift aiftVar2 = new aift(4);
            ailj ailjVarK = b.f().k();
            while (ailjVarK.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) ailjVarK.next();
                int iIntValue = num.intValue();
                if (android.os.Build.VERSION.SDK_INT >= eum.f(iIntValue) && fn$.ExternalSyntheticApiModelOutline0.m(new android.media.AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), epuVar.a())) {
                    aiftVar2.i(num);
                }
            }
            aiftVar2.i(2);
            aihbVar.k(aiftVar2.h());
            faiVar = new defpackage.fai(f(aiql.W(aihbVar.h()), 10), aifyVarA, list);
        } else {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            int i8 = i;
            int i9 = android.provider.Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", i8) == 1 ? 1 : i8;
            if ((i9 != 0 || d()) && android.provider.Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", i8) == 1) {
                aihbVar.k(g);
            }
            if (intent != null && i9 == 0 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i8) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    aihbVar.k(aiql.U(intArrayExtra));
                }
                return new defpackage.fai(f(aiql.W(aihbVar.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), aifyVarA, list);
            }
            faiVar = new defpackage.fai(f(aiql.W(aihbVar.h()), 10), aifyVarA, list);
        }
        return faiVar;
    }

    public static boolean d() {
        return android.os.Build.MANUFACTURER.equals("Amazon") || android.os.Build.MANUFACTURER.equals("Xiaomi");
    }

    private static aify f(int[] iArr, int i) {
        aift aiftVar = new aift(4);
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            aiftVar.i(new defpackage.fah(i2, i));
        }
        return aiftVar.h();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[PHI: r1
      0x0030: PHI (r1v3 int) = (r1v2 int), (r1v6 int) binds: [B:11:0x0027, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r3 <= 10) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r3 <= r7.c) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r9.contains(java.lang.Integer.valueOf(r7)) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        r7 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(defpackage.eqg r8, defpackage.epu r9) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fai.a(eqg, epu):android.util.Pair");
    }

    public final boolean e(int i) {
        return eum.Q(this.h, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fai) {
            defpackage.fai faiVar = (defpackage.fai) obj;
            android.util.SparseArray sparseArray = this.h;
            android.util.SparseArray sparseArray2 = faiVar.h;
            java.lang.String str = eum.a;
            if (android.os.Build.VERSION.SDK_INT < 31) {
                int size = sparseArray.size();
                if (size == sparseArray2.size()) {
                    for (int i = 0; i < size; i++) {
                        if (j$.util.Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                        }
                    }
                    if (this.i == faiVar.i) {
                        return true;
                    }
                }
            } else if (mp$.ExternalSyntheticApiModelOutline0.m(sparseArray, sparseArray2)) {
                if (this.i == faiVar.i && j$.util.Objects.equals(this.c, faiVar.c) && j$.util.Objects.equals(this.d, faiVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM;
        java.lang.String str = eum.a;
        int i = android.os.Build.VERSION.SDK_INT;
        android.util.SparseArray sparseArray = this.h;
        if (i >= 31) {
            iM = mp$.ExternalSyntheticApiModelOutline0.m(sparseArray);
        } else {
            int iKeyAt = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i2)) * 31) + j$.util.Objects.hashCode(sparseArray.valueAt(i2));
            }
            iM = iKeyAt;
        }
        return (((((this.i * 31) + iM) * 31) + j$.util.Objects.hashCode(this.c)) * 31) + j$.util.Objects.hashCode(this.d);
    }

    public final java.lang.String toString() {
        aify aifyVar = this.d;
        aify aifyVar2 = this.c;
        return "AudioCapabilities[maxChannelCount=" + this.i + ", audioProfiles=" + this.h.toString() + ", speakerLayoutChannelMasks=" + java.lang.String.valueOf(aifyVar2) + ", spatializerChannelMasks=" + java.lang.String.valueOf(aifyVar) + ']';
    }
}
