package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class icm implements znp {
    public static final aimz a = aimz.i("com/android/dialer/audio/recorder/impl/RecorderFactoryImpl");
    public final aoss b;
    public final ajct c;
    public final aoss d;
    public final java.util.Map e;
    public final j$.util.concurrent.ConcurrentHashMap f;
    public boolean g;
    public final defpackage.idh h;
    public final defpackage.inw i;
    public final defpackage.inw j;
    public final apdp k;
    public final ahda l;
    public final apni m;
    public final rai n;

    public icm(rai raiVar, defpackage.idh idhVar, defpackage.inw inwVar, defpackage.inw inwVar2, apni apniVar, aoss aossVar, ajct ajctVar, aoss aossVar2) {
        aooh.f(raiVar, "recorderImplFactory");
        aooh.f(idhVar, "callAudio");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aossVar2, "backgroundScope");
        this.n = raiVar;
        this.h = idhVar;
        this.i = inwVar;
        this.j = inwVar2;
        this.m = apniVar;
        this.b = aossVar;
        this.c = ajctVar;
        this.d = aossVar2;
        this.l = new ahda((byte[]) null);
        this.k = new apdp();
        this.e = ajsz.aP(new aoiu[]{new aoiu(defpackage.icc.a, (java.lang.Object) null), new aoiu(defpackage.icc.b, (java.lang.Object) null)});
        this.f = new j$.util.concurrent.ConcurrentHashMap();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean g(j$.util.concurrent.ConcurrentHashMap concurrentHashMap, defpackage.icc iccVar) throws aois {
        int iOrdinal = iccVar.ordinal();
        if (iOrdinal == 0) {
            java.util.Collection collectionValues = concurrentHashMap.values();
            aooh.e(collectionValues, "<get-values>(...)");
            if (!collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((defpackage.icv) it.next()).a) {
                        return true;
                    }
                }
            }
        } else {
            if (iOrdinal != 1) {
                throw new aois();
            }
            java.util.Collection<defpackage.icv> collectionValues2 = concurrentHashMap.values();
            aooh.e(collectionValues2, "<get-values>(...)");
            if (!collectionValues2.isEmpty()) {
                for (defpackage.icv icvVar : collectionValues2) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final java.lang.Object i(defpackage.icc iccVar, defpackage.icu icuVar, akzc akzcVar, aoln aolnVar) throws aois {
        java.lang.Object objF;
        aolu aoluVar;
        int iOrdinal = iccVar.ordinal();
        if (iOrdinal == 0) {
            objF = icuVar.f(icuVar.k, akzcVar, aolnVar);
            aoluVar = aolu.a;
            if (objF != aoluVar) {
                objF = aojh.a;
            }
        } else {
            if (iOrdinal != 1) {
                throw new aois();
            }
            objF = icuVar.f(icuVar.l, akzcVar, aolnVar);
            aoluVar = aolu.a;
            if (objF != aoluVar) {
                objF = aojh.a;
            }
        }
        return objF != aoluVar ? aojh.a : objF;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.icc iccVar, aoln aolnVar) throws aois {
        defpackage.icd icdVar;
        java.lang.Object objD;
        if (aolnVar instanceof defpackage.icd) {
            icdVar = (defpackage.icd) aolnVar;
            int i = icdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                icdVar.c = i - Integer.MIN_VALUE;
            } else {
                icdVar = new defpackage.icd(this, aolnVar);
            }
        } else {
            icdVar = new defpackage.icd(this, aolnVar);
        }
        java.lang.Object obj = icdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = icdVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!g(this.f, iccVar)) {
                return java.lang.Boolean.FALSE;
            }
            if (this.e.get(iccVar) != null) {
                return java.lang.Boolean.FALSE;
            }
            icdVar.d = iccVar;
            icdVar.c = 1;
            objD = d(iccVar, icdVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iccVar = icdVar.d;
            aooc.af(obj);
            objD = ((aoiw) obj).a;
        }
        defpackage.icc iccVar2 = iccVar;
        java.lang.Throwable thC = aoiw.c(objD);
        if (thC != null) {
            return aooc.ae(thC);
        }
        this.e.put(iccVar2, aoov.am(this.b, 0, new sfy((aosy) objD, this, iccVar2, (aoln) null, 1), 3));
        return java.lang.Boolean.TRUE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) throws aois {
        defpackage.icf icfVar;
        java.lang.Object objB;
        java.lang.Object objB2;
        java.lang.Throwable thC;
        if (aolnVar instanceof defpackage.icf) {
            icfVar = (defpackage.icf) aolnVar;
            int i = icfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                icfVar.c = i - Integer.MIN_VALUE;
            } else {
                icfVar = new defpackage.icf(this, aolnVar);
            }
        } else {
            icfVar = new defpackage.icf(this, aolnVar);
        }
        java.lang.Object obj = icfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = icfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
                objB = ((aoiw) obj).a;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
                objB2 = ((aoiw) obj).a;
            }
            thC = aoiw.c(objB2);
            if (thC == null) {
                return aooc.ae(thC);
            }
            ((java.lang.Boolean) objB2).booleanValue();
            return aojh.a;
        }
        aooc.af(obj);
        if (this.g) {
            return aojh.a;
        }
        defpackage.icc iccVar = defpackage.icc.a;
        icfVar.c = 1;
        objB = b(iccVar, icfVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        java.lang.Throwable thC2 = aoiw.c(objB);
        if (thC2 != null) {
            return aooc.ae(thC2);
        }
        ((java.lang.Boolean) objB).booleanValue();
        defpackage.icc iccVar2 = defpackage.icc.b;
        icfVar.c = 2;
        objB2 = b(iccVar2, icfVar);
        if (objB2 == aoluVar) {
            return aoluVar;
        }
        thC = aoiw.c(objB2);
        if (thC == null) {
            return aooc.ae(thC);
        }
        ((java.lang.Boolean) objB2).booleanValue();
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.icc iccVar, aoln aolnVar) throws aois {
        defpackage.ich ichVar;
        aoot aootVar;
        defpackage.icc iccVar2;
        aoot aootVar2;
        if (aolnVar instanceof defpackage.ich) {
            ichVar = (defpackage.ich) aolnVar;
            int i = ichVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ichVar.c = i - Integer.MIN_VALUE;
            } else {
                ichVar = new defpackage.ich(this, aolnVar);
            }
        } else {
            ichVar = new defpackage.ich(this, aolnVar);
        }
        java.lang.Object obj = ichVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ichVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aoot aootVar3 = new aoot();
            defpackage.idh idhVar = this.h;
            ichVar.d = iccVar;
            ichVar.e = aootVar3;
            ichVar.f = aootVar3;
            ichVar.c = 1;
            java.lang.Object objF = f(idhVar, iccVar, ichVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
            aootVar = aootVar3;
            obj = objF;
            iccVar2 = iccVar;
            aootVar2 = aootVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aootVar2 = ichVar.f;
            aootVar = ichVar.e;
            iccVar2 = ichVar.d;
            aooc.af(obj);
        }
        defpackage.hzb hzbVar = (defpackage.hzb) obj;
        if (hzbVar == null) {
            return aooc.ae(new java.lang.IllegalStateException(a.bg(iccVar2, "unable to create ", " tee")));
        }
        aootVar2.a = hzbVar;
        a.b().l("com/android/dialer/audio/recorder/impl/RecorderFactoryImpl", "read", 132, "RecorderFactoryImpl.kt").y("%s tee  created", iccVar2);
        return aoov.am(this.b, 0, new defpackage.ici(aootVar, this, iccVar2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r6 != r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.icu r7, defpackage.icv r8, aoln r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.icl
            if (r0 == 0) goto L13
            r0 = r9
            icl r0 = (defpackage.icl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            icl r0 = new icl
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.a
            apdp r6 = (apdp) r6
            aooc.af(r9)     // Catch: java.lang.Throwable -> L33
            aoiw r9 = (aoiw) r9     // Catch: java.lang.Throwable -> L33
            java.lang.Object r7 = r9.a     // Catch: java.lang.Throwable -> L33
            r1 = r7
            goto L7c
        L33:
            r7 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            apdp r7 = r0.e
            java.lang.Object r8 = r0.a
            icv r8 = (defpackage.icv) r8
            aooc.af(r9)
            goto L5d
        L47:
            aooc.af(r9)
            j$.util.concurrent.ConcurrentHashMap r9 = r6.f
            r9.put(r7, r8)
            apdp r7 = r6.k
            r0.a = r8
            r0.e = r7
            r0.d = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 == r1) goto L88
        L5d:
            boolean r9 = r6.g     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto L64
            aojh r6 = aojh.a     // Catch: java.lang.Throwable -> L80
            goto L7a
        L64:
            boolean r8 = defpackage.hgu.e(r8)     // Catch: java.lang.Throwable -> L80
            if (r8 == 0) goto L6d
            aojh r6 = aojh.a     // Catch: java.lang.Throwable -> L80
            goto L7a
        L6d:
            r0.a = r7     // Catch: java.lang.Throwable -> L80
            r8 = 0
            r0.e = r8     // Catch: java.lang.Throwable -> L80
            r0.d = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Throwable -> L80
            if (r6 == r1) goto L88
        L7a:
            r1 = r6
            r6 = r7
        L7c:
            r6.d()
            goto L88
        L80:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L84:
            r6.d()
            throw r7
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icm.e(icu, icv, aoln):java.lang.Object");
    }

    public final ajcq ek() {
        aosy aosyVarAm = aoov.am(this.b, 0, new defpackage.hnj(this, (aoln) null, 2), 3);
        this.m.i(aosyVarAm);
        return aosv.C(aosyVarAm);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.idh idhVar, defpackage.icc iccVar, aoln aolnVar) throws aois {
        defpackage.ice iceVar;
        ajcq ajcqVarA;
        if (aolnVar instanceof defpackage.ice) {
            iceVar = (defpackage.ice) aolnVar;
            int i = iceVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iceVar.c = i - Integer.MIN_VALUE;
            } else {
                iceVar = new defpackage.ice(this, aolnVar);
            }
        } else {
            iceVar = new defpackage.ice(this, aolnVar);
        }
        java.lang.Object objD = iceVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iceVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            int iOrdinal = iccVar.ordinal();
            if (iOrdinal == 0) {
                ajcqVarA = idhVar.a(j$.time.Duration.ofSeconds(1L));
            } else {
                if (iOrdinal != 1) {
                    throw new aois();
                }
                ajcqVarA = idhVar.b(j$.time.Duration.ofSeconds(1L));
            }
            iceVar.c = 1;
            objD = aosv.D(ajcqVarA, iceVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.icc iccVar, aoln aolnVar) throws aois {
        defpackage.icg icgVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.icg) {
            icgVar = (defpackage.icg) aolnVar;
            int i = icgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                icgVar.c = i - Integer.MIN_VALUE;
            } else {
                icgVar = new defpackage.icg(this, aolnVar);
            }
        } else {
            icgVar = new defpackage.icg(this, aolnVar);
        }
        java.lang.Object obj = icgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = icgVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            int iOrdinal = iccVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new aois();
                }
                apdpVar = this.k;
                icgVar.d = apdpVar;
                icgVar.c = 1;
                if (apdpVar.b(icgVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        apdpVar = icgVar.d;
        aooc.af(obj);
        apdpVar.d();
        return null;
    }
}
