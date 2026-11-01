package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gou {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    /* JADX WARN: Type inference failed for: r6v1, types: [aoxh, java.lang.Object] */
    public gou(defpackage.kgl kglVar, defpackage.jzy jzyVar, defpackage.aoss aossVar) {
        this.c = aossVar;
        defpackage.aozj aozjVarA = defpackage.aozk.a(null);
        this.e = aozjVarA;
        defpackage.aozj aozjVarA2 = defpackage.aozk.a(null);
        this.a = aozjVarA2;
        this.d = new defpackage.aoys(aozjVarA, null);
        this.b = defpackage.aoov.as(new defpackage.aoyp(aozjVarA2, kglVar.b, new defpackage.jzo(jzyVar, (defpackage.aoln) null, 0)), aossVar, new defpackage.aozg(5000L, Long.MAX_VALUE), null);
    }

    public static void B(defpackage.zzn zznVar, defpackage.ahzi ahziVar, defpackage.ahyc ahycVar) {
        java.lang.String str;
        int[] iArr;
        int[] iArr2;
        byte[][] bArr;
        byte[][] bArr2;
        byte[] bArr3;
        int[] iArr3;
        int[] iArr4;
        byte[][] bArr4;
        byte[][] bArr5;
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens;
        byte[][] bArr6;
        int[] iArr5;
        byte[][] bArr7;
        int[] iArr6;
        java.util.ArrayList<com.google.android.gms.phenotype.ExperimentTokens> arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        defpackage.zyy zyyVar = (defpackage.zyy) zznVar;
        if (!zyyVar.j.isEmpty()) {
            for (defpackage.aeyp aeypVar : (java.util.Set) ahziVar.eZ()) {
                arrayList.add(aeypVar.a);
                hashSet.add(aeypVar.b);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = zyyVar.e;
        if (arrayList2 != null) {
            for (java.lang.String str2 : arrayList2) {
                defpackage.aeyp aeypVar2 = (defpackage.aeyp) ahycVar.apply(str2);
                if (aeypVar2 != null) {
                    arrayList.add(aeypVar2.a);
                    hashSet.add(str2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            experimentTokens = com.google.android.gms.phenotype.ExperimentTokens.b;
        } else {
            final int i = 1;
            final int i2 = 0;
            if (arrayList.size() == 1) {
                experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0);
            } else {
                if (arrayList.isEmpty()) {
                    str = ((com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0)).c;
                    break;
                }
                java.lang.String str3 = ((com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0)).c;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!defpackage.anty.H(str3, ((com.google.android.gms.phenotype.ExperimentTokens) it.next()).c)) {
                            str = "";
                            break;
                        }
                    } else {
                        str = ((com.google.android.gms.phenotype.ExperimentTokens) arrayList.get(0)).c;
                        break;
                    }
                }
                java.lang.String str4 = str;
                byte[][] bArrA = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.aasn() { // from class: aasm
                    @Override // defpackage.aasn
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i3 = i;
                        if (i3 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i3 != 1) {
                            return i3 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                byte[][] bArrA2 = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.aasn() { // from class: aasm
                    @Override // defpackage.aasn
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i3 = i2;
                        if (i3 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i3 != 1) {
                            return i3 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                final int i3 = 2;
                byte[][] bArrA3 = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.aasn() { // from class: aasm
                    @Override // defpackage.aasn
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i4 = i3;
                        if (i4 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i4 != 1) {
                            return i4 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                final int i4 = 3;
                byte[][] bArrA4 = com.google.android.gms.phenotype.ExperimentTokens.a(arrayList, new defpackage.aasn() { // from class: aasm
                    @Override // defpackage.aasn
                    public final byte[][] a(com.google.android.gms.phenotype.ExperimentTokens experimentTokens2) {
                        int i5 = i4;
                        if (i5 == 0) {
                            return experimentTokens2.f;
                        }
                        if (i5 != 1) {
                            return i5 != 2 ? experimentTokens2.h : experimentTokens2.g;
                        }
                        return experimentTokens2.e;
                    }
                });
                boolean z = true;
                int length = 0;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens2 : arrayList) {
                    if (experimentTokens2 != null && (iArr6 = experimentTokens2.i) != null) {
                        length += iArr6.length;
                        z = false;
                    }
                }
                if (z) {
                    iArr = null;
                } else {
                    int[] iArr7 = new int[length];
                    int i5 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens3 : arrayList) {
                        if (experimentTokens3 != null && (iArr2 = experimentTokens3.i) != null) {
                            int i6 = 0;
                            while (i6 < iArr2.length) {
                                iArr7[i5] = iArr2[i6];
                                i6++;
                                i5++;
                            }
                        }
                    }
                    iArr = iArr7;
                }
                int length2 = 0;
                boolean z2 = true;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens4 : arrayList) {
                    if (experimentTokens4 != null && experimentTokens4.d != null) {
                        length2++;
                        z2 = false;
                    }
                    if (experimentTokens4 != null && (bArr7 = experimentTokens4.j) != null) {
                        length2 += bArr7.length;
                        z2 = false;
                    }
                }
                if (z2) {
                    bArr = null;
                } else {
                    byte[][] bArr8 = new byte[length2][];
                    int i7 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens5 : arrayList) {
                        if (experimentTokens5 != null && (bArr3 = experimentTokens5.d) != null) {
                            bArr8[i7] = bArr3;
                            i7++;
                        }
                        if (experimentTokens5 != null && (bArr2 = experimentTokens5.j) != null) {
                            int i8 = i2;
                            while (i8 < bArr2.length) {
                                bArr8[i7] = bArr2[i8];
                                i8++;
                                i7++;
                            }
                        }
                        i2 = 0;
                    }
                    bArr = bArr8;
                }
                boolean z3 = true;
                int length3 = 0;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens6 : arrayList) {
                    if (experimentTokens6 != null && (iArr5 = experimentTokens6.k) != null) {
                        length3 += iArr5.length;
                        z3 = false;
                    }
                }
                if (z3) {
                    iArr3 = null;
                } else {
                    int[] iArr8 = new int[length3];
                    int i9 = 0;
                    for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens7 : arrayList) {
                        if (experimentTokens7 != null && (iArr4 = experimentTokens7.k) != null) {
                            int i10 = 0;
                            while (i10 < iArr4.length) {
                                iArr8[i9] = iArr4[i10];
                                i10++;
                                i9++;
                            }
                        }
                        arrayList = arrayList;
                    }
                    iArr3 = iArr8;
                }
                java.util.ArrayList<com.google.android.gms.phenotype.ExperimentTokens> arrayList3 = arrayList;
                int length4 = 0;
                boolean z4 = true;
                for (com.google.android.gms.phenotype.ExperimentTokens experimentTokens8 : arrayList3) {
                    if (experimentTokens8 != null && (bArr6 = experimentTokens8.l) != null) {
                        length4 += bArr6.length;
                        z4 = false;
                    }
                }
                if (z4) {
                    bArr4 = null;
                } else {
                    byte[][] bArr9 = new byte[length4][];
                    int i11 = 0;
                    for (java.util.Iterator it2 = arrayList3.iterator(); it2.hasNext(); it2 = it2) {
                        com.google.android.gms.phenotype.ExperimentTokens experimentTokens9 = (com.google.android.gms.phenotype.ExperimentTokens) it2.next();
                        if (experimentTokens9 != null && (bArr5 = experimentTokens9.l) != null) {
                            for (byte[] bArr10 : bArr5) {
                                if (bArr10 != null) {
                                    bArr9[i11] = bArr10;
                                    i11++;
                                }
                            }
                        }
                    }
                    bArr4 = bArr9;
                }
                experimentTokens = new com.google.android.gms.phenotype.ExperimentTokens(str4, null, bArrA, bArrA2, bArrA3, bArrA4, iArr, bArr, iArr3, bArr4);
            }
        }
        defpackage.zyx zyxVar = zyyVar.a;
        if (zyxVar.d()) {
            throw new java.lang.IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (zyyVar.h == null) {
            zyyVar.h = new java.util.HashSet();
        }
        zyyVar.h.addAll(hashSet);
        if (zyxVar.d()) {
            throw new java.lang.IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (experimentTokens != null) {
            if (zyyVar.g == null) {
                zyyVar.g = new java.util.ArrayList();
            }
            zyyVar.g.add(experimentTokens);
        }
    }

    public static final defpackage.aihd C(java.lang.String str, java.util.concurrent.atomic.AtomicReference atomicReference) {
        if (str == null || atomicReference == null) {
            return defpackage.aikn.a;
        }
        defpackage.aihb aihbVar = new defpackage.aihb();
        java.lang.Object obj = atomicReference.get();
        if (obj instanceof defpackage.aeyq) {
            int i = defpackage.aeyq.b;
            ((defpackage.aeyq) obj).b(str, aihbVar);
        } else {
            for (defpackage.aeyq aeyqVar : (defpackage.aeyq[]) obj) {
                int i2 = defpackage.aeyq.b;
                aeyqVar.b(str, aihbVar);
            }
        }
        return aihbVar.g();
    }

    private static void E(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, byte[] bArr, boolean z) {
        if (z) {
            concurrentMap.put(obj, bArr);
        } else {
            j$.util.concurrent.ConcurrentMap.-EL.compute(concurrentMap, obj, new defpackage.zau(bArr, 2));
        }
    }

    private static void F(java.util.concurrent.ConcurrentMap concurrentMap, java.lang.Object obj, java.lang.String str, byte[] bArr, boolean z) {
        java.lang.Object obj2;
        defpackage.aeyq[] aeyqVarArr;
        defpackage.aeyq[] aeyqVarArr2;
        java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) concurrentMap.putIfAbsent(obj, new java.util.concurrent.atomic.AtomicReference(new defpackage.aeyq(str, bArr)));
        if (atomicReference != null) {
            do {
                obj2 = atomicReference.get();
                if (obj2 instanceof defpackage.aeyq) {
                    defpackage.aeyq aeyqVar = (defpackage.aeyq) obj2;
                    java.lang.String str2 = aeyqVar.a;
                    if (str.equals(str2)) {
                        aeyqVar.a(bArr, z);
                        return;
                    } else {
                        defpackage.aeyq aeyqVar2 = new defpackage.aeyq(str, bArr);
                        aeyqVarArr2 = str.compareTo(str2) < 0 ? new defpackage.aeyq[]{aeyqVar2, aeyqVar} : new defpackage.aeyq[]{aeyqVar, aeyqVar2};
                    }
                } else {
                    defpackage.aeyq[] aeyqVarArr3 = (defpackage.aeyq[]) obj2;
                    int iBinarySearch = java.util.Arrays.binarySearch(aeyqVarArr3, str);
                    if (iBinarySearch >= 0) {
                        aeyqVarArr3[iBinarySearch].a(bArr, z);
                        return;
                    }
                    int i = ~iBinarySearch;
                    int length = aeyqVarArr3.length;
                    int i2 = length + 1;
                    int i3 = length - i;
                    if (i3 == 0) {
                        aeyqVarArr = (defpackage.aeyq[]) java.util.Arrays.copyOf(aeyqVarArr3, i2);
                    } else {
                        defpackage.aeyq[] aeyqVarArr4 = new defpackage.aeyq[i2];
                        java.lang.System.arraycopy(aeyqVarArr3, 0, aeyqVarArr4, 0, i);
                        java.lang.System.arraycopy(aeyqVarArr3, i, aeyqVarArr4, i + 1, i3);
                        aeyqVarArr = aeyqVarArr4;
                    }
                    aeyqVarArr[i] = new defpackage.aeyq(str, bArr);
                    aeyqVarArr2 = aeyqVarArr;
                }
            } while (!defpackage.anty.Q(atomicReference, obj2, aeyqVarArr2));
        }
    }

    public static knt c(android.content.Context context, defpackage.kiu kiuVar) {
        defpackage.akzx akzxVarM = kmc.a.m();
        akzxVarM.u();
        kmc kmcVar = akzxVarM.b;
        kmcVar.e = 4;
        kmcVar.b |= 1;
        akzxVarM.u();
        kmc kmcVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(kiuVar);
        kmcVar2.d = kiuVar;
        kmcVar2.c = 3;
        return new knt(context, akzxVarM.r());
    }

    public static /* synthetic */ tbe k(int i) {
        int i2 = i - 1;
        return (i2 == 0 || i2 == 1) ? tbe.b : tbe.c;
    }

    public static final java.lang.Exception w(defpackage.aaum aaumVar) {
        return aaumVar.f() != null ? aaumVar.f() : new java.util.concurrent.ExecutionException(new java.lang.RuntimeException("Unexpected Error"));
    }

    public static defpackage.aeyp z(java.lang.String str, java.lang.String str2, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        byte[][] bArr2 = com.google.android.gms.phenotype.ExperimentTokens.a;
        return new defpackage.aeyp(new com.google.android.gms.phenotype.ExperimentTokens(str, bArr, bArr2, bArr2, bArr2, bArr2, null, null, null, null), str2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final void A(defpackage.akzc akzcVar, java.util.Set set, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        if (!set.isEmpty() && !((java.util.concurrent.atomic.AtomicBoolean) this.e).getAndSet(true)) {
            defpackage.zzx zzxVarA = defpackage.zzx.a();
            zzxVarA.a.add(0, new defpackage.zzx(this));
        }
        byte[] bArrD = akzcVar.D();
        if (z) {
            E(this.b, new defpackage.ahyo(str2, str), bArrD, z2);
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                F(this.d, new defpackage.ahyo((java.lang.String) it.next(), str), str2, bArrD, z2);
            }
            return;
        }
        E(this.c, str2, bArrD, z2);
        java.util.Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            F(this.a, (java.lang.String) it2.next(), str2, bArrD, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aoin, java.lang.Object] */
    public final defpackage.aequ D(java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.aoin aoinVar) {
        defpackage.aeqs aeqsVar = (defpackage.aeqs) this.d.a();
        aeqsVar.getClass();
        defpackage.aent aentVar = (defpackage.aent) this.e.a();
        aentVar.getClass();
        defpackage.ahbz ahbzVar = (defpackage.ahbz) this.a.a();
        ahbzVar.getClass();
        executor.getClass();
        amwuVar.getClass();
        return new defpackage.aequ(aeqsVar, this.c, aentVar, ahbzVar, this.b, executor, amwuVar, aoinVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.window.extensions.embedding.ActivityEmbeddingComponent, java.lang.Object] */
    public final void a(final defpackage.gov govVar) {
        ddz$.ExternalSyntheticApiModelOutline0.m((androidx.window.extensions.embedding.ActivityEmbeddingComponent) this.a, new androidx.window.reflection.Consumer2() { // from class: gos
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                java.util.List list = (java.util.List) obj;
                defpackage.aooh.f(list, "splitInfoList");
                govVar.a(((defpackage.goe) this.b).d(list));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gyt, java.lang.Object] */
    public final /* synthetic */ void b(java.lang.Runnable runnable) {
        this.e.execute(runnable);
    }

    public final oqy d(defpackage.kiu kiuVar) {
        defpackage.akzx akzxVarM = oqy.a.m();
        kis kisVar = kiuVar.u;
        if (kisVar == null) {
            kisVar = kis.a;
        }
        if (kisVar.d.size() > 0) {
            kis kisVar2 = kiuVar.u;
            if (kisVar2 == null) {
                kisVar2 = kis.a;
            }
            long jA = kisVar2.d.a(0);
            akzxVarM.u();
            oqy oqyVar = akzxVarM.b;
            oqyVar.b |= 131072;
            oqyVar.t = jA;
        }
        j$.util.Optional optionalG = ((defpackage.zjm) this.e).g();
        kdb kdbVar = new kdb(kiuVar, 5);
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.tkl) optionalG.get()).a((defpackage.kiu) kdbVar.a));
        }
        defpackage.tkj tkjVar = (defpackage.tkj) optionalG.orElse(defpackage.tkj.a);
        akzxVarM.u();
        oqy oqyVar2 = akzxVarM.b;
        oqyVar2.u = 1;
        oqyVar2.b |= 262144;
        java.lang.String str = kiuVar.g;
        akzxVarM.u();
        oqy oqyVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        oqyVar3.b |= 1;
        oqyVar3.c = str;
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        java.lang.String str2 = hkdVar.c;
        akzxVarM.u();
        oqy oqyVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        oqyVar4.b |= 2;
        oqyVar4.d = str2;
        hkd hkdVar2 = kiuVar.f;
        if (hkdVar2 == null) {
            hkdVar2 = hkd.a;
        }
        java.lang.String str3 = hkdVar2.d;
        akzxVarM.u();
        oqy oqyVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        oqyVar5.b |= 8;
        oqyVar5.f = str3;
        java.lang.Object obj = this.c;
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        java.lang.String strA = ((defpackage.kaw) obj).a(kiwVar);
        akzxVarM.u();
        oqy oqyVar6 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strA);
        oqyVar6.b |= 16;
        oqyVar6.g = strA;
        int i = kiuVar.q;
        akzxVarM.u();
        oqy oqyVar7 = akzxVarM.b;
        oqyVar7.b |= 32;
        oqyVar7.h = i;
        int i2 = kiuVar.o;
        akzxVarM.u();
        oqy oqyVar8 = akzxVarM.b;
        oqyVar8.b |= 64;
        oqyVar8.i = i2;
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        java.lang.String str4 = kiwVar2.g;
        akzxVarM.u();
        oqy oqyVar9 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str4);
        oqyVar9.b |= 128;
        oqyVar9.j = str4;
        java.lang.String str5 = kiuVar.m;
        akzxVarM.u();
        oqy oqyVar10 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str5);
        oqyVar10.b |= 256;
        oqyVar10.k = str5;
        kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = kiw.a;
        }
        boolean z = !android.text.TextUtils.isEmpty(kiwVar3.g);
        akzxVarM.u();
        oqy oqyVar11 = akzxVarM.b;
        oqyVar11.b |= 512;
        oqyVar11.l = z;
        kiw kiwVar4 = kiuVar.r;
        if (kiwVar4 == null) {
            kiwVar4 = kiw.a;
        }
        boolean z2 = kiwVar4.p;
        akzxVarM.u();
        oqy oqyVar12 = akzxVarM.b;
        oqyVar12.b |= 1024;
        oqyVar12.m = z2;
        kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = kiw.a;
        }
        boolean z3 = kiwVar5.j;
        akzxVarM.u();
        oqy oqyVar13 = akzxVarM.b;
        oqyVar13.b |= 2048;
        oqyVar13.n = z3;
        kiw kiwVar6 = kiuVar.r;
        if (kiwVar6 == null) {
            kiwVar6 = kiw.a;
        }
        boolean z4 = kiwVar6.r;
        akzxVarM.u();
        oqy oqyVar14 = akzxVarM.b;
        oqyVar14.b |= 32768;
        oqyVar14.r = z4;
        defpackage.tkl tklVar = (defpackage.tkl) this.d;
        boolean zV = tklVar.v(kiuVar);
        akzxVarM.u();
        oqy oqyVar15 = akzxVarM.b;
        oqyVar15.b |= 4096;
        oqyVar15.o = zV;
        boolean z5 = kiuVar.s;
        akzxVarM.u();
        oqy oqyVar16 = akzxVarM.b;
        oqyVar16.b |= 8192;
        oqyVar16.p = z5;
        kiw kiwVar7 = kiuVar.r;
        if (kiwVar7 == null) {
            kiwVar7 = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar7.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        akzxVarM.u();
        oqy oqyVar17 = akzxVarM.b;
        oqyVar17.q = rmtVarB.q;
        oqyVar17.b |= 16384;
        int i3 = kiuVar.y;
        akzxVarM.u();
        oqy oqyVar18 = akzxVarM.b;
        oqyVar18.b |= 65536;
        oqyVar18.s = i3;
        java.lang.String str6 = kiuVar.h;
        akzxVarM.u();
        oqy oqyVar19 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str6);
        oqyVar19.b |= 4;
        oqyVar19.e = str6;
        boolean zT = tklVar.t(kiuVar);
        akzxVarM.u();
        oqy oqyVar20 = akzxVarM.b;
        oqyVar20.b |= 1048576;
        oqyVar20.w = zT;
        akzxVarM.u();
        oqy oqyVar21 = akzxVarM.b;
        j$.util.Objects.requireNonNull(tkjVar);
        oqyVar21.x = tkjVar;
        oqyVar21.b |= 2097152;
        return akzxVarM.r();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq e() {
        return defpackage.ahvr.I(((defpackage.aogc) this.c).bk(), new tai(this, 18), this.b);
    }

    public final defpackage.ajcq f() {
        return defpackage.ahvr.H(((defpackage.aogc) this.c).bk(), new syf(20), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq g() {
        return defpackage.ahvr.H(((defpackage.aogc) this.c).bk(), new syf(15), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq h() {
        return defpackage.ahvr.H(e(), new syf(16), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq i() {
        return defpackage.ahvr.H(((defpackage.uhs) this.e).b(), new soi(this, 18), this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq j() {
        return defpackage.ahvr.H(((defpackage.uhs) this.e).b(), new soi(this, 17), this.b);
    }

    public final void l(android.app.Activity activity) {
        ((defpackage.tvn) this.a).r(activity, 2132084610);
        ((defpackage.gpd) this.d).i(null).b(defpackage.mce.PRE_CALL_UI_SHOWN);
    }

    public final void m() {
        ((defpackage.gpd) this.d).i(null).b(defpackage.mce.PRE_CALL_ACTION_FINISHED);
    }

    public final void n() {
        ((defpackage.gpd) this.d).i(null).b(defpackage.mce.PRE_CALL_ACTION_INITIATED);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ruc] */
    public final void o(zrx zrxVar, int i) {
        defpackage.aooh.f(zrxVar, "callParameter");
        int i2 = i - 1;
        if (i2 == 0) {
            ?? r2 = this.b;
            r2.j(defpackage.ruc.c);
            r2.j(defpackage.ruc.d);
            this.e.o(defpackage.rmx.TIDEPODS_PLACE_OUTGOING_CALL);
            return;
        }
        if (i2 == 1) {
            java.lang.Object obj = this.c;
            jxb jxbVar = (zrxVar.c == 2 ? (zsf) zrxVar.d : zsf.a).d;
            if (jxbVar == null) {
                jxbVar = jxb.b;
            }
            defpackage.agsm.i(838, ((defpackage.gat) obj).i(jxbVar.y, jxn.l), "Emitting event PRE_CALL_ACTION_REQUIRES_UI failed.", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final defpackage.aify p() {
        if (((java.lang.Boolean) this.e.a()).booleanValue()) {
            java.util.Set setKeySet = ((defpackage.zzx) this.d).k().keySet();
            defpackage.aooh.e(setKeySet, "<get-keys>(...)");
            return defpackage.ahvr.bv(defpackage.ajsz.bX(setKeySet, new hte(12)));
        }
        java.util.Set setKeySet2 = ((defpackage.zzx) this.a).k().keySet();
        defpackage.aooh.e(setKeySet2, "<get-keys>(...)");
        return defpackage.ahvr.bv(defpackage.ajsz.bX(setKeySet2, new hte(13)));
    }

    public final int q() {
        return ((defpackage.aoro) this.e).b - ((defpackage.aoro) this.c).b;
    }

    public final defpackage.apdc r(defpackage.apdc apdcVar) {
        if (q() == 127) {
            return apdcVar;
        }
        if (apdcVar.h) {
            ((defpackage.aoro) this.b).b();
        }
        defpackage.aoro aoroVar = (defpackage.aoro) this.e;
        int i = aoroVar.b & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = (java.util.concurrent.atomic.AtomicReferenceArray) this.d;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, apdcVar);
                aoroVar.b();
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    public final defpackage.apdc s() {
        defpackage.apdc apdcVar;
        while (true) {
            java.lang.Object obj = this.c;
            java.lang.Object obj2 = this.e;
            defpackage.aoro aoroVar = (defpackage.aoro) obj;
            int i = aoroVar.b;
            apdcVar = null;
            if (i - ((defpackage.aoro) obj2).b == 0) {
                break;
            }
            int i2 = i & 127;
            if (aoroVar.c(i, i + 1) && (apdcVar = (defpackage.apdc) ((java.util.concurrent.atomic.AtomicReferenceArray) this.d).getAndSet(i2, null)) != null) {
                if (!apdcVar.h) {
                    break;
                }
                ((defpackage.aoro) this.b).a();
                boolean z = defpackage.aosu.a;
                break;
            }
        }
        return apdcVar;
    }

    public final defpackage.apdc t(int i, boolean z) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = (java.util.concurrent.atomic.AtomicReferenceArray) this.d;
        int i2 = i & 127;
        defpackage.apdc apdcVar = (defpackage.apdc) atomicReferenceArray.get(i2);
        if (apdcVar != null && apdcVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, apdcVar, null)) {
                if (atomicReferenceArray.get(i2) != apdcVar) {
                }
            }
            if (!z) {
                return apdcVar;
            }
            ((defpackage.aoro) this.b).a();
            return apdcVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ajwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ajwe, java.lang.Object] */
    public final defpackage.aaum u() {
        defpackage.aaum aaumVarR;
        int iB;
        boolean zV = v();
        if (zV && ((defpackage.ajxo) this.a).a() >= 261200000) {
            ?? r0 = this.c;
            java.util.concurrent.ExecutorService executorServiceG = defpackage.ajsz.G();
            return r0.l().c(executorServiceG, new aaab(this, executorServiceG, 4, (byte[]) null)).c(executorServiceG, new aaab(this, executorServiceG, 5, (byte[]) null));
        }
        java.lang.Object obj = this.d;
        defpackage.ajxm ajxmVar = (defpackage.ajxm) obj;
        java.lang.Object obj2 = ajxmVar.a;
        java.lang.String strF = defpackage.a.f((defpackage.ajtc) obj2);
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putString("scope", "*");
            bundle.putString("sender", strF);
            bundle.putString("subtype", strF);
            bundle.putString("gmp_app_id", ((defpackage.ajtc) obj2).c().b);
            java.lang.Object obj3 = ((defpackage.ajxm) obj).b;
            bundle.putString("gmsv", java.lang.Integer.toString(((defpackage.ajxo) obj3).a()));
            bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
            bundle.putString("app_ver", ((defpackage.ajxo) obj3).c());
            bundle.putString("app_ver_name", ((defpackage.ajxo) obj3).d());
            bundle.putString("firebase-app-name-hash", ((defpackage.ajxm) obj).a());
            if (zV) {
                bundle.putString("Goog-Api-Key", ((defpackage.ajtc) obj2).c().a);
            }
            try {
                java.lang.String str = ((ajwm) defpackage.aazc.t(((defpackage.ajxm) obj).f.l())).a;
                if (android.text.TextUtils.isEmpty(str)) {
                    android.util.Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", str);
                }
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                android.util.Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (java.lang.String) defpackage.aazc.t(((defpackage.ajxm) obj).f.a()));
            bundle.putString("cliv", "fcm-25.1.2_1p");
            defpackage.ajvt ajvtVar = (defpackage.ajvt) ((defpackage.ajxm) obj).e.a();
            defpackage.ajyn ajynVar = (defpackage.ajyn) ((defpackage.ajxm) obj).d.a();
            if (ajvtVar != null && ajynVar != null && (iB = ajvtVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", java.lang.Integer.toString(iB - 1));
                bundle.putString("Firebase-Client", ajynVar.a());
            }
            aaumVarR = ((defpackage.aabo) ajxmVar.c).b(bundle);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
            aaumVarR = defpackage.aazc.r(e2);
        }
        return aaumVarR.b(new fjq(9), new aabm(6));
    }

    public final boolean v() {
        android.content.Context contextA = ((defpackage.ajtc) this.b).a();
        try {
            android.content.pm.PackageManager packageManager = contextA.getPackageManager();
            if (packageManager != null) {
                android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128);
                if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_installation_id_enabled")) {
                    return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [akaw, java.lang.Object] */
    public final defpackage.anmc x(defpackage.ahjz ahjzVar) {
        defpackage.anmc anmcVarA = ((defpackage.ajyz) this.d).a(ahjzVar.c);
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(new defpackage.akbq(new defpackage.aeur(new defpackage.aeur(this, 4), 8), defpackage.albh.class, defpackage.albh.class)));
        java.util.Collections.reverse(arrayList);
        defpackage.anmc anmcVarDs = defpackage.ajsz.ds(anmcVarA, arrayList);
        if (ahjzVar.a != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(new ahka(this, ahjzVar, 0)));
            java.util.Collections.reverse(arrayList2);
            anmcVarDs = defpackage.ajsz.ds(anmcVarDs, arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(java.util.Arrays.asList(new defpackage.ahjy(this.c), this.a, this.e));
        java.util.Collections.reverse(arrayList3);
        return defpackage.ajsz.ds(anmcVarDs, arrayList3);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v3, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v1, types: [amwu, java.lang.Object] */
    public final defpackage.ajcq y(java.lang.String str) {
        defpackage.ajcq ajcqVar;
        defpackage.ajas ajasVarB;
        defpackage.ajcq ajcqVarG;
        defpackage.ajcq ajcqVar2;
        defpackage.ajas ajasVarA;
        defpackage.aooh.f(str, "configPackage");
        java.lang.String strC = ((defpackage.apnt) this.a).c(str);
        defpackage.ajas ajasVar = (defpackage.ajas) ((java.util.Map) this.d.a()).get(strC);
        defpackage.ahcv ahcvVar = (defpackage.ahcv) ((java.util.Map) this.c.a()).get(strC);
        defpackage.ajcq ajcqVarH = null;
        if (ajasVar == null) {
            if (ahcvVar == null || (ajasVarB = ahcvVar.b()) == null) {
                ajcqVar = null;
            } else {
                ajcqVarG = defpackage.ahvr.G(ajasVarB, this.b);
            }
            if (ahcvVar != null && (ajasVarA = ahcvVar.a()) != null) {
                ajcqVarH = defpackage.ahvr.H(defpackage.ahvr.G(ajasVarA, this.b), new agnw(ahci.a, 19), defpackage.ajbm.INSTANCE);
            }
            ajcqVar2 = ajcqVarH;
            if (ajcqVar != null && ajcqVar2 == null) {
                return defpackage.ajcm.a;
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            defpackage.ajsz.di(new defpackage.ajcq[]{ajcqVar, ajcqVar2}, linkedHashSet);
            return defpackage.ahvr.ah(linkedHashSet).p(new defpackage.adlp(this, strC, ajcqVar, ajcqVar2, 4), defpackage.ajbm.INSTANCE);
        }
        ajcqVarG = defpackage.ahvr.G(ajasVar, this.b);
        ajcqVar = ajcqVarG;
        if (ahcvVar != null) {
            ajcqVarH = defpackage.ahvr.H(defpackage.ahvr.G(ajasVarA, this.b), new agnw(ahci.a, 19), defpackage.ajbm.INSTANCE);
        }
        ajcqVar2 = ajcqVarH;
        if (ajcqVar != null) {
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        defpackage.ajsz.di(new defpackage.ajcq[]{ajcqVar, ajcqVar2}, linkedHashSet2);
        return defpackage.ahvr.ah(linkedHashSet2).p(new defpackage.adlp(this, strC, ajcqVar, ajcqVar2, 4), defpackage.ajbm.INSTANCE);
    }

    public gou(defpackage.aexi aexiVar, defpackage.apnt apntVar, defpackage.amwu amwuVar, defpackage.amwu amwuVar2, java.util.concurrent.Executor executor) {
        defpackage.aooh.f(aexiVar, "phenotypeClient");
        defpackage.aooh.f(apntVar, "subpackager");
        defpackage.aooh.f(amwuVar, "runtimeProperties");
        defpackage.aooh.f(amwuVar2, "runtimePropertiesWithFallback");
        defpackage.aooh.f(executor, "executor");
        this.e = aexiVar;
        this.a = apntVar;
        this.d = amwuVar;
        this.c = amwuVar2;
        this.b = executor;
    }

    public gou(defpackage.aogc aogcVar, defpackage.kaw kawVar, defpackage.uhs uhsVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.c = aogcVar;
        this.d = kawVar;
        this.e = uhsVar;
        this.a = executor;
        this.b = executor2;
    }

    public gou(defpackage.aoin aoinVar, defpackage.ajyz ajyzVar, defpackage.ahsc ahscVar, defpackage.akaw akawVar, defpackage.ahkg ahkgVar) {
        this.b = aoinVar;
        this.d = ajyzVar;
        this.a = ahscVar;
        this.c = akawVar;
        this.e = ahkgVar;
    }

    public gou(android.content.Context context, defpackage.ajtc ajtcVar, defpackage.ajwi ajwiVar, defpackage.ajxm ajxmVar, defpackage.ajxo ajxoVar) {
        this.e = new defpackage.aabs(context);
        this.b = ajtcVar;
        this.c = ajwiVar;
        this.d = ajxmVar;
        this.a = ajxoVar;
    }

    public gou(androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent, defpackage.goe goeVar, defpackage.gne gneVar, android.content.Context context) {
        if (activityEmbeddingComponent == null) {
            defpackage.aooh.i("embeddingExtension");
        }
        if (context == null) {
            defpackage.aooh.i("applicationContext");
        }
        this.a = activityEmbeddingComponent;
        this.b = goeVar;
        this.c = gneVar;
        this.d = context;
        this.e = new defpackage.gms();
    }

    public gou(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        aoinVar.getClass();
        this.d = aoinVar;
        aoinVar2.getClass();
        this.c = aoinVar2;
        aoinVar3.getClass();
        this.e = aoinVar3;
        aoinVar4.getClass();
        this.a = aoinVar4;
        aoinVar5.getClass();
        this.b = aoinVar5;
    }

    public gou(defpackage.aoss aossVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.aogc aogcVar, defpackage.aoin aoinVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableAudioInjectorInCallRecording");
        }
        this.c = aossVar;
        this.a = zzxVar;
        this.d = zzxVar2;
        this.b = aogcVar;
        this.e = aoinVar;
    }

    public gou(android.content.SharedPreferences sharedPreferences, java.util.concurrent.Executor executor) {
        this.d = new java.util.ArrayDeque();
        this.e = sharedPreferences;
        this.c = "topic_operation_queue";
        this.b = ",";
        this.a = executor;
    }

    public gou(defpackage.ipc ipcVar, defpackage.aoin aoinVar, java.lang.Long l, defpackage.rkt rktVar, java.lang.Object obj) {
        if (aoinVar == null) {
            defpackage.aooh.i("rolloutFlag");
        }
        if (rktVar == null) {
            defpackage.aooh.i("condition");
        }
        this.d = ipcVar;
        this.c = aoinVar;
        this.a = l;
        this.b = rktVar;
        this.e = obj;
    }

    public gou() {
        this.d = new java.util.concurrent.atomic.AtomicReferenceArray(128);
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.a = new defpackage.aorq(null, aorrVar);
        this.e = new defpackage.aoro(0, aorrVar);
        this.c = new defpackage.aoro(0, aorrVar);
        this.b = new defpackage.aoro(0, aorrVar);
    }

    public gou(defpackage.gpd gpdVar, defpackage.tvn tvnVar, defpackage.ruc rucVar, defpackage.rlv rlvVar, defpackage.gat gatVar) {
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gatVar == null) {
            defpackage.aooh.i("placeOutgoingCallInteractionContextRegistry");
        }
        this.d = gpdVar;
        this.a = tvnVar;
        this.b = rucVar;
        this.e = rlvVar;
        this.c = gatVar;
    }

    public gou(java.util.concurrent.Executor executor) {
        this.d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.c = new defpackage.aajr(this, 1);
        defpackage.gyl gylVar = new defpackage.gyl(executor);
        this.e = gylVar;
        defpackage.aosp aospVarAc = defpackage.aooc.ac(gylVar);
        this.b = aospVarAc;
        defpackage.aooc.ac(new defpackage.gyl(executor));
        this.a = defpackage.aosv.n(aospVarAc);
    }

    public gou(byte[] bArr) {
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new j$.util.concurrent.ConcurrentHashMap();
        this.c = new j$.util.concurrent.ConcurrentHashMap();
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public gou(defpackage.aeqx aeqxVar, defpackage.ssq ssqVar, defpackage.kaw kawVar, defpackage.zjm zjmVar, defpackage.tkl tklVar) {
        this.b = aeqxVar;
        this.a = ssqVar;
        this.c = kawVar;
        this.e = zjmVar;
        this.d = tklVar;
    }
}
