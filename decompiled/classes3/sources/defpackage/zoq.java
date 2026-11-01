package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zoq {
    public final aonj a;
    final /* synthetic */ defpackage.zot b;
    public final apdp c;
    public aehj d;
    private java.lang.Object e;

    public zoq(defpackage.zot zotVar, aonj aonjVar) {
        aooh.f(aonjVar, "computation");
        this.b = zotVar;
        this.a = aonjVar;
        this.c = new apdp();
        this.e = new defpackage.zpa();
        this.d = new defpackage.zox(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r12 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, defpackage.zpc r11, aoln r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.zoj
            if (r0 == 0) goto L13
            r0 = r12
            zoj r0 = (defpackage.zoj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zoj r0 = new zoj
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            aooc.af(r12)
            goto La1
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r9 = r0.a
            aooc.af(r12)     // Catch: aovk -> L78
            goto La1
        L3c:
            long r9 = r0.a
            aooc.af(r12)
            goto L60
        L42:
            aooc.af(r12)
            zot r12 = r8.b
            ytl r2 = new ytl
            r7 = 16
            r2.<init>(r8, r11, r3, r7)
            aoss r11 = r12.b
            ahda r12 = r12.e
            aosy r11 = ahvr.ag(r11, r12, r2)
            r0.a = r9
            r0.d = r6
            java.lang.Object r12 = r11.a(r0)
            if (r12 == r1) goto La0
        L60:
            aehj r12 = (aehj) r12
            boolean r11 = r12 instanceof defpackage.zov
            if (r11 == 0) goto La1
            ytl r11 = new ytl     // Catch: aovk -> L78
            r2 = 15
            r11.<init>(r12, r8, r3, r2)     // Catch: aovk -> L78
            r0.a = r9     // Catch: aovk -> L78
            r0.d = r5     // Catch: aovk -> L78
            java.lang.Object r12 = aooh.K(r9, r11, r0)     // Catch: aovk -> L78
            if (r12 != r1) goto La1
            goto La0
        L78:
            r11 = move-exception
            aimz r12 = defpackage.zot.a
            ainm r12 = r12.b()
            aimw r12 = (aimw) r12
            ainm r11 = r12.k(r11)
            r12 = 212(0xd4, float:2.97E-43)
            java.lang.String r2 = "BlockingInCallCache.kt"
            java.lang.String r3 = "com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache$CachedComputation"
            java.lang.String r5 = "getCacheComputationResult"
            ainm r11 = r11.l(r3, r5, r12, r2)
            aimw r11 = (aimw) r11
            java.lang.String r12 = "Timeout: Computation exceeded %s milliseconds."
            r11.x(r12, r9)
            r0.d = r4
            java.lang.Object r12 = r8.b(r0)
            if (r12 != r1) goto La1
        La0:
            r12 = r1
        La1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoq.a(long, zpc, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.zok zokVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.zok) {
            zokVar = (defpackage.zok) aolnVar;
            int i = zokVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zokVar.c = i - Integer.MIN_VALUE;
            } else {
                zokVar = new defpackage.zok(this, aolnVar);
            }
        } else {
            zokVar = new defpackage.zok(this, aolnVar);
        }
        java.lang.Object obj = zokVar.a;
        aehj aehjVar = aolu.a;
        int i2 = zokVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.c;
                zokVar.d = apdpVar2;
                zokVar.c = 1;
                if (apdpVar2.b(zokVar) != aehjVar) {
                    apdpVar = apdpVar2;
                }
                return aehjVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = zokVar.d;
            aooc.af(obj);
            aehjVar = this.d;
            return aehjVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.zol zolVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.zol) {
            zolVar = (defpackage.zol) aolnVar;
            int i = zolVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zolVar.c = i - Integer.MIN_VALUE;
            } else {
                zolVar = new defpackage.zol(this, aolnVar);
            }
        } else {
            zolVar = new defpackage.zol(this, aolnVar);
        }
        java.lang.Object obj = zolVar.a;
        java.lang.Object obj2 = aolu.a;
        int i2 = zolVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.c;
                zolVar.d = apdpVar2;
                zolVar.c = 1;
                if (apdpVar2.b(zolVar) != obj2) {
                    apdpVar = apdpVar2;
                }
                return obj2;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = zolVar.d;
            aooc.af(obj);
            obj2 = this.e;
            return obj2;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.Object obj, aoln aolnVar) {
        defpackage.zon zonVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.zon) {
            zonVar = (defpackage.zon) aolnVar;
            int i = zonVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zonVar.d = i - Integer.MIN_VALUE;
            } else {
                zonVar = new defpackage.zon(this, aolnVar);
            }
        } else {
            zonVar = new defpackage.zon(this, aolnVar);
        }
        java.lang.Object obj2 = zonVar.b;
        aojh aojhVar = aolu.a;
        int i2 = zonVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                apdpVar = this.c;
                zonVar.a = obj;
                zonVar.e = apdpVar;
                zonVar.d = 1;
                if (apdpVar.b(zonVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = zonVar.e;
            java.lang.Object obj3 = zonVar.a;
            aooc.af(obj2);
            apdpVar = apdpVar2;
            obj = obj3;
            if (!defpackage.zpb.b(this.e)) {
                this.e = obj;
            }
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.zpc zpcVar, aoln aolnVar) {
        defpackage.zoo zooVar;
        defpackage.zpc zpcVar2;
        apdp apdpVar;
        defpackage.zot zotVar;
        if (aolnVar instanceof defpackage.zoo) {
            zooVar = (defpackage.zoo) aolnVar;
            int i = zooVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zooVar.c = i - Integer.MIN_VALUE;
            } else {
                zooVar = new defpackage.zoo(this, aolnVar);
            }
        } else {
            zooVar = new defpackage.zoo(this, aolnVar);
        }
        java.lang.Object obj = zooVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zooVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar2 = this.c;
            defpackage.zot zotVar2 = this.b;
            zooVar.d = zpcVar;
            zooVar.f = apdpVar2;
            zooVar.e = zotVar2;
            zooVar.c = 1;
            if (apdpVar2.b(zooVar) == aoluVar) {
                return aoluVar;
            }
            zpcVar2 = zpcVar;
            apdpVar = apdpVar2;
            zotVar = zotVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zotVar = zooVar.e;
            apdpVar = zooVar.f;
            zpcVar2 = zooVar.d;
            aooc.af(obj);
        }
        try {
            defpackage.zov zovVar = new defpackage.zov(aoov.an(zotVar.b, (aolr) null, 0, new defpackage.zop(zpcVar2, this, zotVar, null), 3));
            this.d = zovVar;
            return zovVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(long j, aoln aolnVar) {
        defpackage.zom zomVar;
        java.lang.Object objC;
        if (aolnVar instanceof defpackage.zom) {
            zomVar = (defpackage.zom) aolnVar;
            int i = zomVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zomVar.d = i - Integer.MIN_VALUE;
            } else {
                zomVar = new defpackage.zom(this, aolnVar);
            }
        } else {
            zomVar = new defpackage.zom(this, aolnVar);
        }
        java.lang.Object objK = zomVar.b;
        aolu aoluVar = aolu.a;
        int i2 = zomVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j = zomVar.a;
                    aooc.af(objK);
                    objC = ((defpackage.zpb) objK).a;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aooc.af(objK);
                            return ((defpackage.zpb) objK).a;
                        }
                        aooc.af(objK);
                        zomVar.d = 4;
                        java.lang.Object objC2 = c(zomVar);
                        return objC2 != aoluVar ? objC2 : aoluVar;
                    }
                    j = zomVar.a;
                    aooc.af(objK);
                }
                return ((defpackage.zpb) objK).a;
            }
            aooc.af(objK);
            zomVar.a = j;
            zomVar.d = 1;
            objC = c(zomVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            if (defpackage.zpb.b(objC)) {
                return objC;
            }
            if (objC instanceof defpackage.zoy) {
                java.lang.Throwable thA = defpackage.zpb.a(objC);
                if (thA != null) {
                    return new defpackage.zoy(thA);
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            defpackage.zot zotVar = this.b;
            defpackage.xtn xtnVar = new defpackage.xtn(aoov.am(zotVar.b, 0, new ytl(this, zotVar, (aoln) null, 17), 3), (aoln) null, 17);
            zomVar.a = j;
            zomVar.d = 2;
            objK = aooh.K(j, xtnVar, zomVar);
            if (objK == aoluVar) {
                return aoluVar;
            }
            return ((defpackage.zpb) objK).a;
        } catch (java.lang.Exception e) {
            if (e instanceof aovk) {
                defpackage.zot.a.b().k(e).l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache$CachedComputation", "getResult", 173, "BlockingInCallCache.kt").x("Timeout: Computation exceeded %s milliseconds.", j);
            } else {
                defpackage.zot.a.d().k(e).l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache$CachedComputation", "getResult", 176, "BlockingInCallCache.kt").v("Computation failed.");
            }
            defpackage.zoy zoyVar = new defpackage.zoy(e);
            zomVar.d = 3;
            if (d(zoyVar, zomVar) == aoluVar) {
                return aoluVar;
            }
        }
    }
}
