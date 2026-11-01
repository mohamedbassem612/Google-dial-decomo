package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggq {
    public static final /* synthetic */ int h = 0;
    private static final java.lang.String[] i = {"INSERT", "UPDATE", "DELETE"};
    public final defpackage.gfy a;
    public final java.util.Map b;
    public final boolean c;
    public final defpackage.gfq e;
    public final defpackage.ipc g;
    private final java.util.Map j;
    private final defpackage.aonj k;
    private final java.lang.String[] l;
    private final java.util.concurrent.atomic.AtomicBoolean m = new java.util.concurrent.atomic.AtomicBoolean(false);
    public defpackage.aomy f = new defpackage.cbz(19);
    public final java.util.Map d = new java.util.LinkedHashMap();

    public ggq(defpackage.gfy gfyVar, java.util.Map map, java.util.Map map2, java.lang.String[] strArr, boolean z, defpackage.aonj aonjVar) {
        java.lang.String lowerCase;
        this.a = gfyVar;
        this.j = map;
        this.b = map2;
        this.c = z;
        this.k = aonjVar;
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i2 = 0; i2 < length; i2++) {
            java.lang.String lowerCase2 = strArr[i2].toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase2, "toLowerCase(...)");
            this.d.put(lowerCase2, java.lang.Integer.valueOf(i2));
            java.lang.String str = (java.lang.String) this.j.get(strArr[i2]);
            if (str != null) {
                lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                defpackage.aooh.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
        }
        this.l = strArr2;
        for (java.util.Map.Entry entry : this.j.entrySet()) {
            java.lang.String lowerCase3 = ((java.lang.String) entry.getValue()).toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase3, "toLowerCase(...)");
            if (this.d.containsKey(lowerCase3)) {
                java.lang.String lowerCase4 = ((java.lang.String) entry.getKey()).toLowerCase(java.util.Locale.ROOT);
                defpackage.aooh.e(lowerCase4, "toLowerCase(...)");
                java.util.Map map3 = this.d;
                map3.put(lowerCase4, defpackage.ajsz.aK(map3, lowerCase3));
            }
        }
        this.e = new defpackage.gfq(this.l.length);
        this.g = new defpackage.ipc(this.l.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.gfs gfsVar, defpackage.aoln aolnVar) {
        defpackage.ggh gghVar;
        if (aolnVar instanceof defpackage.ggh) {
            gghVar = (defpackage.ggh) aolnVar;
            int i2 = gghVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gghVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gghVar = new defpackage.ggh(this, aolnVar);
            }
        } else {
            gghVar = new defpackage.ggh(this, aolnVar);
        }
        java.lang.Object objA = gghVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = gghVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objA);
            defpackage.een eenVar = new defpackage.een(7);
            gghVar.a = gfsVar;
            gghVar.d = 1;
            objA = gfsVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", eenVar, gghVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.util.Set set = (java.util.Set) gghVar.a;
                defpackage.aooc.af(objA);
                return set;
            }
            gfsVar = (defpackage.gfs) gghVar.a;
            defpackage.aooc.af(objA);
        }
        java.util.Set set2 = (java.util.Set) objA;
        if (!set2.isEmpty()) {
            gghVar.a = set2;
            gghVar.d = 2;
            if (defpackage.dez.s(gfsVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", gghVar) == aoluVar) {
                return aoluVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.ggl gglVar;
        defpackage.rsr rsrVar;
        java.lang.Object objC;
        int[] iArr;
        if (aolnVar instanceof defpackage.ggl) {
            gglVar = (defpackage.ggl) aolnVar;
            int i2 = gglVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gglVar.c = i2 - Integer.MIN_VALUE;
            } else {
                gglVar = new defpackage.ggl(this, aolnVar);
            }
        } else {
            gglVar = new defpackage.ggl(this, aolnVar);
        }
        java.lang.Object objW = gglVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = gglVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objW);
            defpackage.gfy gfyVar = this.a;
            defpackage.rsr rsrVar2 = gfyVar.l;
            if (!rsrVar2.aw()) {
                return defpackage.aoke.a;
            }
            try {
                if (!this.m.compareAndSet(true, false) || !((java.lang.Boolean) this.f.a()).booleanValue()) {
                    defpackage.aoke aokeVar = defpackage.aoke.a;
                    rsrVar2.av();
                    return aokeVar;
                }
                defpackage.eee eeeVar = new defpackage.eee(this, (defpackage.aoln) null, 6, (byte[]) null);
                gglVar.d = rsrVar2;
                gglVar.c = 1;
                objW = gfyVar.w(eeeVar, gglVar);
                if (objW == aoluVar) {
                    return aoluVar;
                }
                rsrVar = rsrVar2;
            } catch (java.lang.Throwable th) {
                th = th;
                rsrVar = rsrVar2;
                rsrVar.av();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rsrVar = gglVar.d;
            try {
                defpackage.aooc.af(objW);
            } catch (java.lang.Throwable th2) {
                th = th2;
                rsrVar.av();
                throw th;
            }
        }
        java.util.Set set = (java.util.Set) objW;
        if (!set.isEmpty()) {
            defpackage.ipc ipcVar = this.g;
            if (set == null) {
                defpackage.aooh.i("tableIds");
            }
            if (!set.isEmpty()) {
                java.lang.Object obj = ipcVar.a;
                do {
                    objC = ((defpackage.aozj) obj).c();
                    int[] iArr2 = (int[]) objC;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr[i4] = set.contains(java.lang.Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                    }
                } while (!((defpackage.aozj) obj).f(objC, iArr));
            }
            this.k.a(set);
        }
        rsrVar.av();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c8 -> B:26:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.gfs r13, int r14, defpackage.aoln r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggq.c(gfs, int, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:18:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.gfs r9, int r10, defpackage.aoln r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ggn
            if (r0 == 0) goto L13
            r0 = r11
            ggn r0 = (ggn) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ggn r0 = new ggn
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.b
            int r9 = r0.a
            java.lang.String[] r10 = r0.g
            java.lang.String r2 = r0.f
            gha r4 = r0.h
            defpackage.aooc.af(r11)
            r11 = r10
            r10 = r4
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.aooc.af(r11)
            java.lang.String[] r8 = r8.l
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.ggq.i
            r11 = 3
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L4c:
            if (r9 >= r8) goto L7e
            r4 = r11[r9]
            java.lang.String r4 = defpackage.dez.r(r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = r10
            gha r5 = (defpackage.gha) r5
            r0.h = r5
            r0.f = r2
            r0.g = r11
            r0.a = r9
            r0.b = r8
            r0.e = r3
            java.lang.Object r4 = defpackage.dez.s(r10, r4, r0)
            if (r4 == r1) goto L80
        L7c:
            int r9 = r9 + r3
            goto L4c
        L7e:
            aojh r1 = defpackage.aojh.a
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggq.d(gfs, int, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        defpackage.ggo ggoVar;
        java.lang.Throwable th;
        defpackage.rsr rsrVar;
        if (aolnVar instanceof defpackage.ggo) {
            ggoVar = (defpackage.ggo) aolnVar;
            int i2 = ggoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ggoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ggoVar = new defpackage.ggo(this, aolnVar);
            }
        } else {
            ggoVar = new defpackage.ggo(this, aolnVar);
        }
        java.lang.Object obj = ggoVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = ggoVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(obj);
            defpackage.gfy gfyVar = this.a;
            defpackage.rsr rsrVar2 = gfyVar.l;
            if (rsrVar2.aw()) {
                try {
                    defpackage.fyx fyxVar = new defpackage.fyx(this, (defpackage.aoln) null, 2);
                    ggoVar.d = rsrVar2;
                    ggoVar.c = 1;
                    if (gfyVar.w(fyxVar, ggoVar) == aoluVar) {
                        return aoluVar;
                    }
                    rsrVar = rsrVar2;
                    rsrVar.av();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    rsrVar = rsrVar2;
                    rsrVar.av();
                    throw th;
                }
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rsrVar = ggoVar.d;
            try {
                defpackage.aooc.af(obj);
                rsrVar.av();
            } catch (java.lang.Throwable th3) {
                th = th3;
                rsrVar.av();
                throw th;
            }
        }
        return defpackage.aojh.a;
    }

    public final void f(defpackage.aomy aomyVar, defpackage.aomy aomyVar2) {
        if (aomyVar == null) {
            defpackage.aooh.i("onRefreshScheduled");
        }
        if (aomyVar2 == null) {
            defpackage.aooh.i("onRefreshCompleted");
        }
        if (this.m.compareAndSet(false, true)) {
            aomyVar.a();
            defpackage.aoov.an(this.a.l(), new defpackage.aosr("Room Invalidation Tracker Refresh"), 0, new defpackage.bur(this, aomyVar2, (defpackage.aoln) null, 11), 2);
        }
    }
}
