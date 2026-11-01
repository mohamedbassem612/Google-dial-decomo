package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rtg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/marquee/impl/service/MarqueeDecider");
    public final defpackage.aolr b;
    public final defpackage.rsy c;
    public final defpackage.zzx d;
    private final defpackage.aoin e;
    private final defpackage.aoir f;

    public rtg(defpackage.aolr aolrVar, defpackage.zzx zzxVar, defpackage.rsy rsyVar, defpackage.aazc aazcVar, defpackage.aoin aoinVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = aolrVar;
        this.d = zzxVar;
        this.c = rsyVar;
        this.e = aoinVar;
        this.f = new defpackage.aoiy(new defpackage.mbe(this, 18));
    }

    private static final long g(j$.time.Instant instant, j$.time.Instant instant2) {
        return j$.time.Duration.between(instant, instant2).toDays();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [rrz] */
    public final java.lang.Object a(defpackage.rrz rrzVar, defpackage.aoln aolnVar) {
        rta rtaVar;
        int i;
        ?? r0;
        j$.time.Instant instant;
        j$.time.Instant instantAw;
        if (aolnVar instanceof rta) {
            rtaVar = (rta) aolnVar;
            int i2 = rtaVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtaVar.e = i2 - Integer.MIN_VALUE;
            } else {
                rtaVar = new rta(this, aolnVar);
            }
        } else {
            rtaVar = new rta(this, aolnVar);
        }
        java.lang.Object obj = rtaVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = rtaVar.e;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            if (!(rrzVar.a().a instanceof rsm)) {
                return java.lang.Boolean.FALSE;
            }
            int i4 = rrzVar.a().a.a;
            defpackage.rsy rsyVar = this.c;
            j$.time.Instant instantNow = j$.time.Instant.now();
            defpackage.rsd rsdVarB = rrzVar.b();
            rtaVar.a = rrzVar;
            rtaVar.f = instantNow;
            rtaVar.b = i4;
            rtaVar.e = 1;
            java.lang.Object objA = rsyVar.a(rsdVarB, rtaVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj = objA;
            i = i4;
            r0 = rrzVar;
            instant = instantNow;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = rtaVar.b;
            instant = rtaVar.f;
            java.lang.Object obj2 = rtaVar.a;
            defpackage.aooc.af(obj);
            r0 = obj2;
        }
        defpackage.alcf alcfVar = (defpackage.alcf) obj;
        if (alcfVar == null || (instantAw = defpackage.aooc.aw(alcfVar)) == null) {
            throw new java.lang.IllegalStateException("null timestamp should be caught in hasElapsedCooldown()");
        }
        defpackage.aooh.c(instant);
        if (g(instantAw, instant) < i) {
            return java.lang.Boolean.FALSE;
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/marquee/impl/service/MarqueeDecider", "hasCooldownElapsed", 130, "MarqueeDecider.kt")).G("%s cooldown period (%d days) has already passed", r0.b().toString(), i);
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [rrz] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final java.lang.Object b(defpackage.rrz rrzVar, defpackage.aoln aolnVar) {
        rtb rtbVar;
        ?? r5;
        java.lang.Object obj;
        if (aolnVar instanceof rtb) {
            rtbVar = (rtb) aolnVar;
            int i = rtbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rtbVar.d = i - Integer.MIN_VALUE;
            } else {
                rtbVar = new rtb(this, aolnVar);
            }
        } else {
            rtbVar = new rtb(this, aolnVar);
        }
        java.lang.Object objA = rtbVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rtbVar.d;
        boolean z = true;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.rsy rsyVar = this.c;
            defpackage.rsd rsdVarB = rrzVar.b();
            rtbVar.a = rrzVar;
            rtbVar.d = 1;
            objA = rsyVar.a(rsdVarB, rtbVar);
            if (objA == aoluVar) {
                r5 = rrzVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = rtbVar.a;
            defpackage.aooc.af(objA);
        }
        if (objA == null) {
            r5 = obj;
            ((defpackage.aimw) a.b().l("com/android/dialer/marquee/impl/service/MarqueeDecider", "hasNotDisplayed", 101, "MarqueeDecider.kt")).y("%s has not been displayed before", r5.b().toString());
        } else {
            r5 = obj;
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [rrz] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, rrz] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final java.lang.Object c(defpackage.rrz rrzVar, int i, defpackage.aoln aolnVar) {
        defpackage.rtc rtcVar;
        ?? r13;
        j$.time.Instant instantNow;
        ?? r0;
        long j;
        defpackage.alcf alcfVar;
        j$.time.Instant instantAw;
        if (aolnVar instanceof defpackage.rtc) {
            rtcVar = (defpackage.rtc) aolnVar;
            int i2 = rtcVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rtcVar.f = i2 - Integer.MIN_VALUE;
            } else {
                rtcVar = new defpackage.rtc(this, aolnVar);
            }
        } else {
            rtcVar = new defpackage.rtc(this, aolnVar);
        }
        java.lang.Object objB = rtcVar.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = rtcVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                i = rtcVar.b;
                java.lang.Object obj = rtcVar.a;
                defpackage.aooc.af(objB);
                r13 = obj;
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = rtcVar.c;
                instantNow = rtcVar.g;
                java.lang.Object obj2 = rtcVar.a;
                defpackage.aooc.af(objB);
                r0 = obj2;
            }
            alcfVar = (defpackage.alcf) objB;
            if (alcfVar != null || (instantAw = defpackage.aooc.aw(alcfVar)) == null) {
                return java.lang.Boolean.FALSE;
            }
            if (instantNow == null) {
                defpackage.aooh.g();
            }
            if (g(instantAw, instantNow) < j) {
                return java.lang.Boolean.FALSE;
            }
            ((defpackage.aimw) a.b().l("com/android/dialer/marquee/impl/service/MarqueeDecider", "hasNotReachedShowCount", 172, "MarqueeDecider.kt")).H("%s cooldown period (%d days) has already passed", r0.b().toString(), j);
            return java.lang.Boolean.TRUE;
        }
        defpackage.aooc.af(objB);
        if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        defpackage.rsy rsyVar = this.c;
        defpackage.rsd rsdVarB = rrzVar.b();
        rtcVar.a = rrzVar;
        rtcVar.b = i;
        rtcVar.f = 1;
        objB = rsyVar.b(rsdVarB, rtcVar);
        if (objB == aoluVar) {
            r13 = rrzVar;
            return aoluVar;
        }
        r13 = rrzVar;
        if (((java.lang.Number) objB).intValue() < i) {
            return java.lang.Boolean.TRUE;
        }
        defpackage.rsy rsyVar2 = this.c;
        instantNow = j$.time.Instant.now();
        defpackage.rsd rsdVarB2 = r13.b();
        rtcVar.a = r13;
        rtcVar.g = instantNow;
        rtcVar.c = 30L;
        rtcVar.f = 2;
        objB = defpackage.aoov.aj(rsyVar2.c, new rka(rsyVar2, rsdVarB2, (defpackage.aoln) null, 5, (byte[]) null), rtcVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        r0 = r13;
        j = 30;
        alcfVar = (defpackage.alcf) objB;
        if (alcfVar != null) {
        }
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, rrz] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3, types: [rrz] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [rtg] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b6 -> B:32:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.List r10, defpackage.aoln r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtg.d(java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [rtg] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ed -> B:34:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0107 -> B:41:0x0108). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.List r18, java.util.Map r19, defpackage.aoln r20) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtg.e(java.util.List, java.util.Map, aoln):java.lang.Object");
    }

    public final java.util.List f() {
        return (java.util.List) this.f.a();
    }
}
