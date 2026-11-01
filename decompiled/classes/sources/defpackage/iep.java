package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iep {
    public static final java.util.List a;
    public static final java.util.Set b;
    public static final java.util.Map c;
    public static final defpackage.agxj d;
    private static final defpackage.aimz h = defpackage.aimz.i("com/android/dialer/audioplayback/impl/player/AudioDeviceController");
    public final defpackage.aoss e;
    public final defpackage.oju f;
    public final java.util.concurrent.atomic.AtomicBoolean g;
    private final android.content.Context i;
    private final defpackage.aoss j;
    private final defpackage.ifi k;
    private final defpackage.ahda l;
    private final defpackage.apni m;

    static {
        java.util.List listBb = defpackage.ajsz.bb(23, 3, 4, 22, 7, 26, 1, 2);
        a = listBb;
        b = defpackage.ajsz.cf(listBb);
        java.lang.Iterable<defpackage.aokg> iterableBC = defpackage.ajsz.bC(listBb);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(iterableBC, 10)), 16));
        for (defpackage.aokg aokgVar : iterableBC) {
            defpackage.aoiu aoiuVar = new defpackage.aoiu(java.lang.Integer.valueOf(((java.lang.Number) aokgVar.b).intValue()), java.lang.Integer.valueOf(aokgVar.a));
            linkedHashMap.put(aoiuVar.a, aoiuVar.b);
        }
        c = linkedHashMap;
        d = new defpackage.agxj("availableAudioOutputDeviceEntries");
    }

    public iep(android.content.Context context, defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.oju ojuVar, defpackage.apni apniVar, defpackage.ifi ifiVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (ojuVar == null) {
            defpackage.aooh.i("dialerAudioManager");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        this.i = context;
        this.j = aossVar;
        this.e = aossVar2;
        this.f = ojuVar;
        this.m = apniVar;
        this.k = ifiVar;
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.l = new defpackage.ahda((byte[]) null);
    }

    public final android.media.AudioManager a() {
        java.lang.Object systemService = this.i.getSystemService((java.lang.Class<java.lang.Object>) android.media.AudioManager.class);
        defpackage.aooh.e(systemService, "getSystemService(...)");
        return (android.media.AudioManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e1 -> B:41:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.aoln r13) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iep.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.Collection] */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        iem iemVar;
        if (aolnVar instanceof iem) {
            iemVar = (iem) aolnVar;
            int i = iemVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iemVar.c = i - Integer.MIN_VALUE;
            } else {
                iemVar = new iem(this, aolnVar);
            }
        } else {
            iemVar = new iem(this, aolnVar);
        }
        java.lang.Object objAj = iemVar.a;
        java.lang.Object arrayList = defpackage.aolu.a;
        int i2 = iemVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            int i3 = android.os.Build.VERSION.SDK_INT;
            defpackage.oju ojuVar = this.f;
            if (i3 >= 31) {
                iemVar.c = 1;
                objAj = defpackage.aoov.aj(ojuVar.c, new defpackage.ohg(ojuVar, (defpackage.aoln) null, 6, (byte[]) null), iemVar);
                if (objAj != arrayList) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : (java.lang.Iterable) objAj) {
                        if (defpackage.kcq.I((android.media.AudioDeviceInfo) obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else {
                iemVar.c = 2;
                objAj = defpackage.aoov.aj(ojuVar.c, new defpackage.ohg(ojuVar, (defpackage.aoln) null, 7, (char[]) null), iemVar);
                if (objAj != arrayList) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : (java.lang.Iterable) objAj) {
                        if (defpackage.kcq.I((android.media.AudioDeviceInfo) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                }
            }
        } else if (i2 == 1) {
            defpackage.aooc.af(objAj);
            arrayList = new java.util.ArrayList();
            while (r6.hasNext()) {
                if (defpackage.kcq.I((android.media.AudioDeviceInfo) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
            arrayList = new java.util.ArrayList();
            while (r6.hasNext()) {
                if (defpackage.kcq.I((android.media.AudioDeviceInfo) obj2)) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final java.lang.Object d(android.media.AudioDeviceInfo audioDeviceInfo, boolean z, defpackage.aoln aolnVar) {
        defpackage.ieo ieoVar;
        android.media.AudioDeviceInfo audioDeviceInfo2;
        boolean z2;
        android.media.AudioDeviceInfo audioDeviceInfo3;
        defpackage.oju ojuVar;
        java.lang.Object objAj;
        boolean z3;
        java.lang.Object objAj2;
        android.media.AudioDeviceInfo audioDeviceInfo4 = audioDeviceInfo;
        boolean z4 = z;
        if (aolnVar instanceof defpackage.ieo) {
            ieoVar = (defpackage.ieo) aolnVar;
            int i = ieoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ieoVar.d = i - Integer.MIN_VALUE;
            } else {
                ieoVar = new defpackage.ieo(this, aolnVar);
            }
        } else {
            ieoVar = new defpackage.ieo(this, aolnVar);
        }
        java.lang.Object objAj3 = ieoVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        switch (ieoVar.d) {
            case 0:
                defpackage.aooc.af(objAj3);
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    if (audioDeviceInfo4 == null) {
                        audioDeviceInfo4 = null;
                    } else if (audioDeviceInfo4.getType() == 7 && z4) {
                        defpackage.oju ojuVar2 = this.f;
                        ieoVar.e = audioDeviceInfo4;
                        ieoVar.a = true;
                        ieoVar.d = 3;
                        java.lang.Object objAj4 = defpackage.aoov.aj(ojuVar2.c, new defpackage.ohg(ojuVar2, (defpackage.aoln) null, 10, (boolean[]) null), ieoVar);
                        if (objAj4 != aoluVar) {
                            objAj4 = defpackage.aojh.a;
                        }
                        if (objAj4 == aoluVar) {
                            return aoluVar;
                        }
                        ojuVar = this.f;
                        ieoVar.e = audioDeviceInfo4;
                        ieoVar.a = z4;
                        ieoVar.d = 4;
                        if (ojuVar.g(true, ieoVar) != aoluVar) {
                            return aoluVar;
                        }
                        boolean z5 = z4;
                        audioDeviceInfo2 = audioDeviceInfo4;
                        z2 = z5;
                        defpackage.oju ojuVar3 = this.f;
                        if (audioDeviceInfo2 == null && audioDeviceInfo2.getType() == 2 && z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ieoVar.e = null;
                        ieoVar.d = 8;
                        objAj2 = defpackage.aoov.aj(ojuVar3.c, new jcm(ojuVar3, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                        if (objAj2 != aoluVar) {
                            objAj2 = defpackage.aojh.a;
                        }
                        if (objAj2 == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.oju ojuVar4 = this.f;
                    ieoVar.e = audioDeviceInfo4;
                    ieoVar.a = z4;
                    ieoVar.d = 5;
                    if (ojuVar4.g(false, ieoVar) == aoluVar) {
                        return aoluVar;
                    }
                    audioDeviceInfo2 = audioDeviceInfo4;
                    z2 = z4;
                    defpackage.oju ojuVar5 = this.f;
                    ieoVar.e = audioDeviceInfo2;
                    ieoVar.a = z2;
                    ieoVar.d = 6;
                    objAj3 = defpackage.aoov.aj(ojuVar5.c, new defpackage.ohg(ojuVar5, (defpackage.aoln) null, 9, (int[]) null), ieoVar);
                    if (objAj3 == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objAj3).booleanValue()) {
                        defpackage.oju ojuVar6 = this.f;
                        ieoVar.e = audioDeviceInfo2;
                        ieoVar.a = z2;
                        ieoVar.d = 7;
                        objAj = defpackage.aoov.aj(ojuVar6.c, new defpackage.ohg(ojuVar6, (defpackage.aoln) null, 11, (float[]) null), ieoVar);
                        if (objAj != aoluVar) {
                            objAj = defpackage.aojh.a;
                        }
                        if (objAj == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.oju ojuVar7 = this.f;
                    if (audioDeviceInfo2 == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    ieoVar.e = null;
                    ieoVar.d = 8;
                    objAj2 = defpackage.aoov.aj(ojuVar7.c, new jcm(ojuVar7, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                    if (objAj2 != aoluVar) {
                        objAj2 = defpackage.aojh.a;
                    }
                    if (objAj2 == aoluVar) {
                        return aoluVar;
                    }
                } else if (audioDeviceInfo4 == null || !z4) {
                    defpackage.oju ojuVar8 = this.f;
                    ieoVar.d = 1;
                    java.lang.Object objAj5 = defpackage.aoov.aj(ojuVar8.c, new defpackage.ohg(ojuVar8, (defpackage.aoln) null, 5), ieoVar);
                    if (objAj5 != aoluVar) {
                        objAj5 = defpackage.aojh.a;
                    }
                    if (objAj5 == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.oju ojuVar9 = this.f;
                    ieoVar.e = audioDeviceInfo4;
                    ieoVar.d = 2;
                    objAj3 = defpackage.aoov.aj(ojuVar9.c, new ofa(ojuVar9, audioDeviceInfo4, (defpackage.aoln) null, 5), ieoVar);
                    if (objAj3 == aoluVar) {
                        return aoluVar;
                    }
                    audioDeviceInfo3 = audioDeviceInfo4;
                    if (!((java.lang.Boolean) objAj3).booleanValue()) {
                        ((defpackage.aimw) h.d().l("com/android/dialer/audioplayback/impl/player/AudioDeviceController", "prepareAudioDeviceInternal", 136, "AudioDeviceController.kt")).w("Failed to set audio device(%d) as communication device", audioDeviceInfo3.getType());
                    }
                }
                return defpackage.aojh.a;
            case 1:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(objAj3);
                return defpackage.aojh.a;
            case 2:
                audioDeviceInfo3 = ieoVar.e;
                defpackage.aooc.af(objAj3);
                if (!((java.lang.Boolean) objAj3).booleanValue()) {
                    ((defpackage.aimw) h.d().l("com/android/dialer/audioplayback/impl/player/AudioDeviceController", "prepareAudioDeviceInternal", 136, "AudioDeviceController.kt")).w("Failed to set audio device(%d) as communication device", audioDeviceInfo3.getType());
                }
                return defpackage.aojh.a;
            case 3:
                boolean z6 = ieoVar.a;
                android.media.AudioDeviceInfo audioDeviceInfo5 = ieoVar.e;
                defpackage.aooc.af(objAj3);
                z4 = z6;
                audioDeviceInfo4 = audioDeviceInfo5;
                ojuVar = this.f;
                ieoVar.e = audioDeviceInfo4;
                ieoVar.a = z4;
                ieoVar.d = 4;
                if (ojuVar.g(true, ieoVar) != aoluVar) {
                    return aoluVar;
                }
                boolean z7 = z4;
                audioDeviceInfo2 = audioDeviceInfo4;
                z2 = z7;
                defpackage.oju ojuVar10 = this.f;
                if (audioDeviceInfo2 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ieoVar.e = null;
                ieoVar.d = 8;
                objAj2 = defpackage.aoov.aj(ojuVar10.c, new jcm(ojuVar10, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                if (objAj2 != aoluVar) {
                    objAj2 = defpackage.aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            case 4:
                z2 = ieoVar.a;
                audioDeviceInfo2 = ieoVar.e;
                defpackage.aooc.af(objAj3);
                defpackage.oju ojuVar11 = this.f;
                if (audioDeviceInfo2 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ieoVar.e = null;
                ieoVar.d = 8;
                objAj2 = defpackage.aoov.aj(ojuVar11.c, new jcm(ojuVar11, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                if (objAj2 != aoluVar) {
                    objAj2 = defpackage.aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            case 5:
                z2 = ieoVar.a;
                audioDeviceInfo2 = ieoVar.e;
                defpackage.aooc.af(objAj3);
                defpackage.oju ojuVar12 = this.f;
                ieoVar.e = audioDeviceInfo2;
                ieoVar.a = z2;
                ieoVar.d = 6;
                objAj3 = defpackage.aoov.aj(ojuVar12.c, new defpackage.ohg(ojuVar12, (defpackage.aoln) null, 9, (int[]) null), ieoVar);
                if (objAj3 == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objAj3).booleanValue()) {
                    defpackage.oju ojuVar13 = this.f;
                    ieoVar.e = audioDeviceInfo2;
                    ieoVar.a = z2;
                    ieoVar.d = 7;
                    objAj = defpackage.aoov.aj(ojuVar13.c, new defpackage.ohg(ojuVar13, (defpackage.aoln) null, 11, (float[]) null), ieoVar);
                    if (objAj != aoluVar) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.oju ojuVar14 = this.f;
                if (audioDeviceInfo2 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ieoVar.e = null;
                ieoVar.d = 8;
                objAj2 = defpackage.aoov.aj(ojuVar14.c, new jcm(ojuVar14, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                if (objAj2 != aoluVar) {
                    objAj2 = defpackage.aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                z2 = ieoVar.a;
                audioDeviceInfo2 = ieoVar.e;
                defpackage.aooc.af(objAj3);
                if (((java.lang.Boolean) objAj3).booleanValue()) {
                    defpackage.oju ojuVar15 = this.f;
                    ieoVar.e = audioDeviceInfo2;
                    ieoVar.a = z2;
                    ieoVar.d = 7;
                    objAj = defpackage.aoov.aj(ojuVar15.c, new defpackage.ohg(ojuVar15, (defpackage.aoln) null, 11, (float[]) null), ieoVar);
                    if (objAj != aoluVar) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.oju ojuVar16 = this.f;
                if (audioDeviceInfo2 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ieoVar.e = null;
                ieoVar.d = 8;
                objAj2 = defpackage.aoov.aj(ojuVar16.c, new jcm(ojuVar16, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                if (objAj2 != aoluVar) {
                    objAj2 = defpackage.aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                z2 = ieoVar.a;
                audioDeviceInfo2 = ieoVar.e;
                defpackage.aooc.af(objAj3);
                defpackage.oju ojuVar17 = this.f;
                if (audioDeviceInfo2 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                ieoVar.e = null;
                ieoVar.d = 8;
                objAj2 = defpackage.aoov.aj(ojuVar17.c, new jcm(ojuVar17, z3, (defpackage.aoln) null, 5, (byte[]) null), ieoVar);
                if (objAj2 != aoluVar) {
                    objAj2 = defpackage.aojh.a;
                }
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void e(android.media.AudioDeviceInfo audioDeviceInfo, boolean z) {
        this.m.i(defpackage.ahvr.ag(this.j, this.l, new defpackage.icp(new defpackage.ien(this, audioDeviceInfo, z, null), (defpackage.aoln) null, 3)));
    }

    public final void f(android.media.AudioDeviceCallback audioDeviceCallback) {
        defpackage.aooh.f(audioDeviceCallback, "audioDeviceCallback");
        if (this.g.getAndSet(true)) {
            return;
        }
        a().registerAudioDeviceCallback(audioDeviceCallback, null);
    }
}
