package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahro implements java.lang.Runnable {
    public final defpackage.ahqm a;
    public final java.util.UUID b;
    public final java.lang.String c;
    public final boolean d;
    public final defpackage.ahqy e;
    public final java.util.concurrent.atomic.AtomicReference f;
    public defpackage.ajcq g;
    private final long i;
    private final java.util.Set j = new java.util.HashSet();
    int h = 0;
    private final boolean k = false;

    public ahro(defpackage.ahqm ahqmVar, java.util.UUID uuid, java.lang.String str, defpackage.ahqy ahqyVar, defpackage.ahrn ahrnVar, long j, boolean z, boolean z2) {
        this.a = ahqmVar;
        this.b = uuid;
        this.c = str;
        this.e = ahqyVar;
        this.i = j;
        this.d = z;
        this.f = new java.util.concurrent.atomic.AtomicReference(ahrnVar);
    }

    public final long a() {
        return defpackage.aazc.b() - this.i;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    final defpackage.ahra b() {
        int i;
        defpackage.ahrn[] ahrnVarArr;
        int i2;
        int i3;
        defpackage.ahra ahraVar;
        synchronized (this) {
            defpackage.ahrn ahrnVar = (defpackage.ahrn) this.f.get();
            int i4 = 1;
            int i5 = ahrnVar.h + 1;
            defpackage.ahrn[] ahrnVarArr2 = new defpackage.ahrn[i5];
            while (ahrnVar != null) {
                int i6 = ahrnVar.h;
                if (i6 < 0) {
                    break;
                }
                ahrnVarArr2[i6] = ahrnVar;
                ahrnVar = ahrnVar.i;
            }
            defpackage.akzx akzxVarL = this.e.L();
            android.util.SparseArray sparseArray = new android.util.SparseArray(i5);
            int i7 = 0;
            defpackage.ahrn ahrnVar2 = ahrnVarArr2[0];
            java.util.HashMap map = new java.util.HashMap();
            java.util.HashMap map2 = new java.util.HashMap();
            defpackage.ahrn ahrnVar3 = null;
            int i8 = 0;
            while (true) {
                i = -1;
                if (i8 >= i5) {
                    break;
                }
                defpackage.ahrn ahrnVar4 = ahrnVarArr2[i8];
                defpackage.ahou ahouVar = ahrnVar4.g;
                defpackage.ahor ahorVarJ = defpackage.ahou.j(defpackage.ahpc.c, ahouVar);
                if (ahorVarJ.b()) {
                    ((defpackage.ahnu) ahorVarJ.a()).a();
                    if (ahrnVar4 != ahrnVar2) {
                        ahrnVar3 = ahrnVar4;
                    }
                }
                int i9 = i4;
                sparseArray.append(ahrnVar4.h, defpackage.ahou.e(ahouVar, ahrnVar4.c()));
                java.lang.String str = ahrnVar4.d;
                str.isEmpty();
                if (map.containsKey(str)) {
                    i7 = i7;
                } else {
                    akzxVarL.u();
                    defpackage.ahqy ahqyVar = (defpackage.ahqy) akzxVarL.b;
                    j$.util.Objects.requireNonNull(str);
                    defpackage.alat alatVar = ahqyVar.k;
                    if (!alatVar.c()) {
                        ahqyVar.k = alatVar.d(alatVar.size() << 1);
                    }
                    ahqyVar.k.add(str);
                    map.put(str, java.lang.Integer.valueOf(((defpackage.ahqy) akzxVarL.b).k.size() - 1));
                }
                java.lang.String str2 = ahrnVar4.e;
                str2.isEmpty();
                if (!map2.containsKey(str2)) {
                    akzxVarL.u();
                    defpackage.ahqy ahqyVar2 = (defpackage.ahqy) akzxVarL.b;
                    j$.util.Objects.requireNonNull(str2);
                    defpackage.alat alatVar2 = ahqyVar2.l;
                    if (!alatVar2.c()) {
                        ahqyVar2.l = alatVar2.d(alatVar2.size() << 1);
                    }
                    ahqyVar2.l.add(str2);
                    map2.put(str2, java.lang.Integer.valueOf(((defpackage.ahqy) akzxVarL.b).l.size() - 1));
                }
                i8++;
                i4 = i9;
                i7 = i7;
            }
            int i10 = i4;
            int i11 = i7;
            java.util.Set set = this.j;
            if (set.isEmpty()) {
                ahrnVarArr = ahrnVarArr2;
                i2 = i11;
                i3 = i2;
            } else {
                int[] iArrA = new int[i5];
                for (int i12 = i11; i12 < i5; i12++) {
                    defpackage.ahrn ahrnVar5 = ahrnVarArr2[i12];
                    iArrA[ahrnVar5.h] = ahrnVar5.a();
                }
                if (ahrnVar3 != null) {
                    int i13 = ahrnVar3.h;
                    iArrA[i13] = -1;
                    iArrA[i11] = i13;
                }
                java.util.Iterator it = set.iterator();
                while (it.hasNext()) {
                    iArrA = ((ahov) it.next()).a();
                }
                if (iArrA != null) {
                    java.util.BitSet bitSet = new java.util.BitSet(i5);
                    int i14 = i11;
                    int i15 = i14;
                    while (i14 < i5) {
                        defpackage.ahrn ahrnVar6 = ahrnVarArr2[i14];
                        int i16 = ahrnVar6.h;
                        defpackage.ahrn[] ahrnVarArr3 = ahrnVarArr2;
                        if (iArrA[i16] == i) {
                            if (i15 != 0) {
                                throw new java.lang.IllegalArgumentException("Can't have more than one root in the trace tree");
                            }
                            i15 = i10;
                        }
                        while (true) {
                            i16 = iArrA[i16];
                            if (i16 == i || bitSet.get(i16)) {
                                break;
                            }
                            defpackage.ahvr.bR(i16 != ahrnVar6.h ? i10 : i11, "Detected loop in the newly constructed graph! Span %s is in the loop", ahrnVar6.c);
                            bitSet.set(i16);
                            iArrA = iArrA;
                            i = -1;
                        }
                        bitSet.set(ahrnVar6.h);
                        i14++;
                        ahrnVarArr2 = ahrnVarArr3;
                        iArrA = iArrA;
                        i = -1;
                    }
                    ahrnVarArr = ahrnVarArr2;
                    int[] iArr = iArrA;
                    int i17 = i11;
                    i3 = i17;
                    while (i17 < i5) {
                        defpackage.ahrn ahrnVar7 = ahrnVarArr[i17];
                        akzxVarL.as(ahrnVar7.b(this.d, iArr[ahrnVar7.h], map, map2));
                        if (!ahrnVar7.e()) {
                            i3++;
                        }
                        i17++;
                    }
                    i2 = i10;
                } else {
                    ahrnVarArr = ahrnVarArr2;
                    i2 = i11;
                    i3 = i2;
                }
            }
            if (i2 == 0) {
                for (int i18 = i11; i18 < i5; i18++) {
                    defpackage.ahrn ahrnVar8 = ahrnVarArr[i18];
                    akzxVarL.as(ahrnVar8 == ahrnVar3 ? ahrnVar8.b(this.d, -1, map, map2) : (ahrnVar3 == null || ahrnVar8 != ahrnVar2) ? ahrnVar8.b(this.d, ahrnVar8.a(), map, map2) : ahrnVar8.b(this.d, ahrnVar3.h, map, map2));
                    if (!ahrnVar8.e()) {
                        i3++;
                    }
                }
            }
            int i19 = i3;
            if (this.h != 0) {
                defpackage.akzx akzxVarM = defpackage.ahna.a.m();
                defpackage.akzx akzxVarM2 = ahmz.a.m();
                int i20 = this.h;
                akzxVarM2.u();
                ahmz ahmzVar = akzxVarM2.b;
                ahmzVar.b |= 1;
                ahmzVar.c = i20;
                ahmz ahmzVarR = akzxVarM2.r();
                akzxVarM.u();
                defpackage.ahna ahnaVar = (defpackage.ahna) akzxVarM.b;
                j$.util.Objects.requireNonNull(ahmzVarR);
                ahnaVar.c = ahmzVarR;
                ahnaVar.b |= 1;
                defpackage.ahna ahnaVar2 = (defpackage.ahna) akzxVarM.r();
                akzxVarL.u();
                defpackage.ahqy ahqyVar3 = (defpackage.ahqy) akzxVarL.b;
                j$.util.Objects.requireNonNull(ahnaVar2);
                ahqyVar3.i = ahnaVar2;
                ahqyVar3.b |= 32;
            }
            java.lang.String str3 = ahrnVarArr[i11].c;
            java.util.UUID uuid = this.b;
            defpackage.ahqy ahqyVar4 = (defpackage.ahqy) akzxVarL.r();
            if (str3 == null) {
                throw new java.lang.NullPointerException("Null name");
            }
            if (ahqyVar4 == null) {
                throw new java.lang.NullPointerException("Null record");
            }
            ahraVar = new defpackage.ahra(str3, uuid, ahqyVar4, sparseArray, i19);
        }
        return ahraVar;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01eb  */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        defpackage.ahqm ahqmVar;
        defpackage.ahqm ahqmVar2;
        defpackage.ajcq ajcqVar = this.g;
        defpackage.ahra ahraVarB = b();
        boolean zIsCancelled = ajcqVar.isCancelled();
        defpackage.ahqm ahqmVar3 = this.a;
        try {
            if (zIsCancelled) {
                defpackage.ahqy ahqyVar = ahraVarB.c;
                defpackage.ahna ahnaVar = ahqyVar.i;
                if (ahnaVar == null) {
                    ahnaVar = defpackage.ahna.a;
                }
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - ahqyVar.g;
                defpackage.akzx akzxVarL = ahqyVar.L();
                defpackage.akzx akzxVarL2 = ahnaVar.L();
                defpackage.akzx akzxVarM = ahmy.a.m();
                int i = ahraVarB.e;
                akzxVarM.u();
                ahmy ahmyVar = akzxVarM.b;
                ahmyVar.b |= 2;
                ahmyVar.d = i;
                akzxVarM.u();
                ahmy ahmyVar2 = akzxVarM.b;
                ahmyVar2.b |= 1;
                ahmyVar2.c = jElapsedRealtime;
                ahmy ahmyVarR = akzxVarM.r();
                akzxVarL2.u();
                defpackage.ahna ahnaVar2 = (defpackage.ahna) akzxVarL2.b;
                j$.util.Objects.requireNonNull(ahmyVarR);
                ahnaVar2.d = ahmyVarR;
                ahnaVar2.b |= 2;
                defpackage.ahna ahnaVar3 = (defpackage.ahna) akzxVarL2.r();
                akzxVarL.u();
                defpackage.ahqy ahqyVar2 = (defpackage.ahqy) akzxVarL.b;
                j$.util.Objects.requireNonNull(ahnaVar3);
                ahqyVar2.i = ahnaVar3;
                ahqyVar2.b |= 32;
                defpackage.ahqy ahqyVar3 = (defpackage.ahqy) akzxVarL.r();
                int size = ahqyVar3.e.size() - 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i2 = -1; size != i2; i2 = -1) {
                    try {
                        defpackage.ahop ahopVar = (defpackage.ahop) ahqyVar3.e.get(size);
                        ahqmVar2 = ahqmVar3;
                        try {
                            arrayList.add(new java.lang.StackTraceElement("tk_trace", java.lang.String.valueOf(ahopVar.c).concat((ahopVar.b & 32) == 0 ? " (Timed Out)" : ""), "Started After", (int) (ahopVar.f / 1000)));
                            size = ((defpackage.ahop) ahqyVar3.e.get(size)).e;
                            ahqmVar3 = ahqmVar2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            ahqmVar = ahqmVar2;
                            if (((defpackage.ahro) ahqmVar.c.remove(ahraVarB.b)) != null) {
                                throw th;
                            }
                            throw new java.lang.IllegalStateException();
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ahqmVar2 = ahqmVar3;
                        ahqmVar = ahqmVar2;
                        if (((defpackage.ahro) ahqmVar.c.remove(ahraVarB.b)) != null) {
                            throw th;
                        }
                        throw new java.lang.IllegalStateException();
                    }
                }
                ahqmVar2 = ahqmVar3;
                defpackage.ahrc ahrcVar = new defpackage.ahrc(null, (java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]));
                defpackage.ahrc.j(ahqyVar3, java.util.Collections.singletonMap(0, ahrcVar), 0, new java.util.HashMap());
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahqm.a.c()).k(ahrcVar)).l("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 372, "TraceManagerImpl.java");
                java.lang.String str = ahraVarB.a;
                aimwVar.M("Trace %s timed out after %d ms. Complete trace: %s", str, java.lang.Long.valueOf(jElapsedRealtime), ahqyVar3);
                ahqmVar = ahqmVar2;
                try {
                    ahqmVar.e(ahqyVar3, ahraVarB.d, str);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (((defpackage.ahro) ahqmVar.c.remove(ahraVarB.b)) != null) {
                        throw th;
                    }
                }
            } else {
                try {
                    defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                    defpackage.a.h(ajcqVar);
                    defpackage.ahqy ahqyVar4 = ahraVarB.c;
                    long j = ahqyVar4.g;
                    while (true) {
                        java.util.concurrent.atomic.AtomicLong atomicLong = ahqmVar3.d;
                        long j2 = atomicLong.get();
                        if (j <= j2) {
                            break;
                        }
                        if (atomicLong.compareAndSet(j2, 300000 + j)) {
                            long j3 = j - ((long) ahqmVar3.f);
                            for (defpackage.ahro ahroVar : ahqmVar3.c.values()) {
                                if (ahroVar.e.g < j3) {
                                    defpackage.ajcs ajcsVarSchedule = ((defpackage.ajcu) ahqmVar3.b.a()).schedule(new ahlo(3), 10L, java.util.concurrent.TimeUnit.SECONDS);
                                    j$.util.Objects.requireNonNull(ahroVar);
                                    ajcsVarSchedule.c(new agdr(ahroVar, 19), defpackage.ajbm.INSTANCE);
                                }
                            }
                            break;
                        }
                    }
                    ahqmVar3.e(ahqyVar4, ahraVarB.d, ahraVarB.a);
                } catch (java.util.concurrent.ExecutionException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahqm.a.c()).k(e.getCause())).l("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 323, "TraceManagerImpl.java")).y("Trace %s failed collection", ahraVarB.a);
                }
                ahqmVar = ahqmVar3;
            }
            if (((defpackage.ahro) ahqmVar.c.remove(ahraVarB.b)) != null) {
                return;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahqmVar = ahqmVar3;
            if (((defpackage.ahro) ahqmVar.c.remove(ahraVarB.b)) != null) {
                throw th;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    public final java.lang.String toString() {
        return "UnfinishedTrace@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + '[' + b().a + ']';
    }
}
