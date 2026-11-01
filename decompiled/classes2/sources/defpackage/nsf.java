package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nsf {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/storage/DobbyWavAudioRecordingMerger");
    public final aoin b;
    public final aolr c;
    public final zjm d;
    private final defpackage.nsa e;
    private final aoin f;

    public nsf(defpackage.nsa nsaVar, aoin aoinVar, aoin aoinVar2, aolr aolrVar, zjm zjmVar) {
        aooh.f(aoinVar, "downlinkAudioVolumeMultiplierProvider");
        aooh.f(aoinVar2, "setCustomGreetingDuration");
        aooh.f(aolrVar, "lightweightContext");
        this.e = nsaVar;
        this.f = aoinVar;
        this.b = aoinVar2;
        this.c = aolrVar;
        this.d = zjmVar;
    }

    private static final int d(long j, int i) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        return (int) ((j * ((long) i)) / 1000);
    }

    private static final boolean e(defpackage.nmp nmpVar) {
        java.lang.String str = nmpVar.d;
        aooh.e(str, "getFilePath(...)");
        if (!aoov.r(str, ".amr", false)) {
            java.lang.String str2 = nmpVar.d;
            aooh.e(str2, "getFilePath(...)");
            if (!aoov.r(str2, ".m4a", false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8 A[ADDED_TO_REGION, EDGE_INSN: B:45:0x00b8->B:41:0x00b8 BREAK  A[LOOP:0: B:33:0x009d->B:40:0x00af], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0071 -> B:12:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(short[] r11, java.util.List r12, int r13, aoln r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.nsb
            if (r0 == 0) goto L13
            r0 = r14
            nsb r0 = (defpackage.nsb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            nsb r0 = new nsb
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.c
            aolu r1 = aolu.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r11 = r0.b
            nmp r12 = r0.g
            java.lang.Object r13 = r0.a
            short[] r2 = r0.f
            aooc.af(r14)
            r9 = r13
            r13 = r11
            r11 = r2
            r2 = r14
        L32:
            r14 = r9
            goto L75
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            aooc.af(r14)
            java.util.Iterator r12 = r12.iterator()
            r9 = r13
            r13 = r12
            r12 = r9
        L46:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lbb
            java.lang.Object r14 = r13.next()
            nmp r14 = (defpackage.nmp) r14
            boolean r2 = e(r14)
            if (r2 != 0) goto L46
            nsa r2 = r10.e
            java.lang.String r4 = r14.d
            java.lang.String r5 = "getFilePath(...)"
            aooh.e(r4, r5)
            r0.f = r11
            r0.a = r13
            r0.g = r14
            r0.b = r12
            r0.e = r3
            java.lang.Object r2 = r2.a(r4, r12, r0)
            if (r2 == r1) goto Lbd
            r9 = r13
            r13 = r12
            r12 = r14
            goto L32
        L75:
            short[] r2 = (short[]) r2
            if (r2 == 0) goto Lbb
            int r4 = r12.b
            r4 = r4 & r3
            r5 = 0
            if (r4 == 0) goto L87
            long r6 = r12.f
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            goto L88
        L87:
            r4 = r5
        L88:
            long r6 = r12.c
            int r12 = d(r6, r13)
            if (r4 == 0) goto L9c
            long r4 = r4.longValue()
            int r4 = d(r4, r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
        L9c:
            r4 = 0
        L9d:
            int r6 = r2.length
            if (r4 >= r6) goto Lb8
            short r6 = r2[r4]
            int r7 = r12 << 1
            int r8 = r11.length
            if (r7 >= r8) goto Lb8
            if (r5 == 0) goto Laf
            int r8 = r5.intValue()
            if (r12 >= r8) goto Lb8
        Laf:
            int r7 = r7 + 1
            r11[r7] = r6
            int r12 = r12 + 1
            int r4 = r4 + 1
            goto L9d
        Lb8:
            r12 = r13
            r13 = r14
            goto L46
        Lbb:
            aojh r1 = aojh.a
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsf.a(short[], java.util.List, int, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0104 A[LOOP:0: B:37:0x0102->B:38:0x0104, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    public final java.lang.Object b(akzb akzbVar, int i, java.util.List list, aoln aolnVar) {
        defpackage.nsc nscVar;
        short[] sArr;
        short[] sArr2;
        int i2;
        int iIntValue;
        short[] sArr3;
        int length;
        java.lang.Double d;
        if (aolnVar instanceof defpackage.nsc) {
            nscVar = (defpackage.nsc) aolnVar;
            int i3 = nscVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nscVar.e = i3 - Integer.MIN_VALUE;
            } else {
                nscVar = new defpackage.nsc(this, aolnVar);
            }
        } else {
            nscVar = new defpackage.nsc(this, aolnVar);
        }
        java.lang.Object obj = nscVar.c;
        short[] sArr4 = aolu.a;
        int i4 = nscVar.e;
        if (i4 != 0) {
            if (i4 == 1) {
                i = nscVar.a;
                sArr2 = nscVar.f;
                list = (java.util.List) nscVar.b;
                aooc.af(obj);
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = nscVar.a;
                sArr3 = (short[]) nscVar.b;
                aooc.af(obj);
            }
            iIntValue = ((java.lang.Number) obj).intValue();
            sArr = sArr3;
            length = sArr.length;
            sArr4 = new short[java.lang.Math.max(length, i2 + iIntValue) << 1];
            d = (java.lang.Double) this.f.a();
            for (int i5 = 0; i5 < length; i5++) {
                sArr4[i5 << 1] = (short) aopc.h(d.doubleValue() * ((double) sArr[i5]));
            }
            return sArr4;
        }
        aooc.af(obj);
        if (akzbVar.a() % 2 != 0) {
            ((aimw) ((aimw) a.d()).i(zct.b).l("com/android/dialer/dobby/impl/storage/DobbyWavAudioRecordingMerger", "createOutputArray", 218, "DobbyWavAudioRecordingMerger.kt")).v("audio byte size does not meet requirements");
            return null;
        }
        sArr = new short[akzbVar.a() / 2];
        java.nio.ByteBuffer.wrap(akzbVar.b().D()).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
        if (list.isEmpty()) {
            i2 = 0;
            if (!list.isEmpty() || list.size() == 1) {
                iIntValue = 0;
                length = sArr.length;
                sArr4 = new short[java.lang.Math.max(length, i2 + iIntValue) << 1];
                d = (java.lang.Double) this.f.a();
                while (i5 < length) {
                    sArr4[i5 << 1] = (short) aopc.h(d.doubleValue() * ((double) sArr[i5]));
                }
            } else {
                defpackage.nmp nmpVar = (defpackage.nmp) list.get(list.size() - 1);
                nscVar.b = sArr;
                nscVar.f = null;
                nscVar.a = i2;
                nscVar.e = 2;
                java.lang.Object objC = c(i, nmpVar, nscVar);
                if (objC != sArr4) {
                    short[] sArr5 = sArr;
                    obj = objC;
                    sArr3 = sArr5;
                    iIntValue = ((java.lang.Number) obj).intValue();
                    sArr = sArr3;
                    length = sArr.length;
                    sArr4 = new short[java.lang.Math.max(length, i2 + iIntValue) << 1];
                    d = (java.lang.Double) this.f.a();
                    while (i5 < length) {
                        sArr4[i5 << 1] = (short) aopc.h(d.doubleValue() * ((double) sArr[i5]));
                    }
                }
            }
        } else {
            defpackage.nmp nmpVar2 = (defpackage.nmp) list.get(0);
            nscVar.b = list;
            nscVar.f = sArr;
            nscVar.a = i;
            nscVar.e = 1;
            java.lang.Object objC2 = c(i, nmpVar2, nscVar);
            if (objC2 != sArr4) {
                obj = objC2;
                sArr2 = sArr;
            }
        }
        return sArr4;
        int iIntValue2 = ((java.lang.Number) obj).intValue();
        sArr = sArr2;
        i2 = iIntValue2;
        if (list.isEmpty()) {
        }
        iIntValue = 0;
        length = sArr.length;
        sArr4 = new short[java.lang.Math.max(length, i2 + iIntValue) << 1];
        d = (java.lang.Double) this.f.a();
        while (i5 < length) {
            sArr4[i5 << 1] = (short) aopc.h(d.doubleValue() * ((double) sArr[i5]));
        }
        return sArr4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(int i, defpackage.nmp nmpVar, aoln aolnVar) {
        defpackage.nsd nsdVar;
        if (aolnVar instanceof defpackage.nsd) {
            nsdVar = (defpackage.nsd) aolnVar;
            int i2 = nsdVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nsdVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nsdVar = new defpackage.nsd(this, aolnVar);
            }
        } else {
            nsdVar = new defpackage.nsd(this, aolnVar);
        }
        java.lang.Object objA = nsdVar.a;
        aolu aoluVar = aolu.a;
        int i3 = nsdVar.c;
        int iD = 0;
        if (i3 == 0) {
            aooc.af(objA);
            if ((nmpVar.b & 1) != 0) {
                iD = d(nmpVar.f, i) - d(nmpVar.c, i);
            } else if (!e(nmpVar)) {
                defpackage.nsa nsaVar = this.e;
                java.lang.String str = nmpVar.d;
                aooh.e(str, "getFilePath(...)");
                nsdVar.c = 1;
                objA = nsaVar.a(str, i, nsdVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            return new java.lang.Integer(iD);
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        short[] sArr = (short[]) objA;
        if (sArr != null) {
            iD = sArr.length;
        }
        return new java.lang.Integer(iD);
    }
}
