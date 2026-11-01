package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iqw implements znr {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/BeeslyCallMissedListener");
    public final jbm b;
    public final aoin c;
    public final aoin d;
    public final qbe e;
    private final aoss f;
    private final defpackage.iwy g;
    private final java.lang.String h;
    private final zjl i;
    private final aoin j;
    private final iqm k;
    private final afpl l;

    public iqw(aoss aossVar, afpl afplVar, qbe qbeVar, defpackage.iwy iwyVar, java.lang.String str, aazc aazcVar, jbm jbmVar, zjl zjlVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, iqm iqmVar) {
        aooh.f(aossVar, "coroutineScope");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(str, "callId");
        aooh.f(aazcVar, "clock");
        aooh.f(jbmVar, "beeslySettings");
        aooh.f(aoinVar2, "enableTimeoutAlgorithmI18n");
        this.f = aossVar;
        this.l = afplVar;
        this.e = qbeVar;
        this.g = iwyVar;
        this.h = str;
        this.b = jbmVar;
        this.i = zjlVar;
        this.j = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.k = iqmVar;
    }

    public final ajcq a() {
        return aosv.F(this.f, 0, new defpackage.hqi(this, (aoln) null, 5), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.iqr iqrVar;
        if (aolnVar instanceof defpackage.iqr) {
            iqrVar = (defpackage.iqr) aolnVar;
            int i = iqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqrVar.c = i - Integer.MIN_VALUE;
            } else {
                iqrVar = new defpackage.iqr(this, aolnVar);
            }
        } else {
            iqrVar = new defpackage.iqr(this, aolnVar);
        }
        java.lang.Object objD = iqrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iqrVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.l.X();
            iqrVar.c = 1;
            objD = aosv.D(ajcqVarX, iqrVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.iqq.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[PHI: r6
      0x007d: PHI (r6v1 java.lang.Object) = (r6v22 java.lang.Object), (r6v23 java.lang.Object) binds: [B:19:0x0065, B:23:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [iqq] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [iqq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5, types: [iqq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [iqq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [iqq, java.lang.Object] */
    public final java.lang.Object c(defpackage.iqq iqqVar, aoln aolnVar) {
        defpackage.iqs iqsVar;
        java.lang.Object obj;
        int i;
        ?? r6;
        java.lang.Object obj2;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r5;
        boolean z;
        if (aolnVar instanceof defpackage.iqs) {
            iqsVar = (defpackage.iqs) aolnVar;
            int i2 = iqsVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iqsVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iqsVar = new defpackage.iqs(this, aolnVar);
            }
        } else {
            iqsVar = new defpackage.iqs(this, aolnVar);
        }
        java.lang.Object objC = iqsVar.c;
        aolu aoluVar = aolu.a;
        switch (iqsVar.e) {
            case 0:
                aooc.af(objC);
                obj = iqqVar;
                if (((java.lang.Boolean) this.j.a()).booleanValue()) {
                    zjl zjlVar = this.i;
                    iqsVar.a = iqqVar;
                    iqsVar.e = 1;
                    objC = zjlVar.c(iqsVar);
                    if (objC == aoluVar) {
                        obj2 = iqqVar;
                        return aoluVar;
                    }
                    obj2 = iqqVar;
                    obj = obj2;
                    if (((java.lang.Boolean) objC).booleanValue()) {
                        i = 0;
                        r6 = obj2;
                    } else {
                        i = 1;
                        r6 = obj;
                    }
                } else {
                    i = 1;
                    r6 = obj;
                }
                ajcq ajcqVarAM = r6.aM();
                iqsVar.a = r6;
                iqsVar.b = i;
                iqsVar.e = 2;
                objC = aosv.D(ajcqVarAM, iqsVar);
                r7 = r6;
                if (objC == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAG = r7.aG();
                    iqsVar.a = r7;
                    iqsVar.b = i;
                    iqsVar.e = 3;
                    objC = aosv.D(ajcqVarAG, iqsVar);
                    if (objC == aoluVar) {
                        r8 = r7;
                        return aoluVar;
                    }
                    r8 = r7;
                    if (!((java.lang.Boolean) objC).booleanValue()) {
                        ajcq ajcqVarAH = r8.aH();
                        iqsVar.a = r8;
                        iqsVar.b = i;
                        iqsVar.e = 4;
                        objC = aosv.D(ajcqVarAH, iqsVar);
                        if (objC == aoluVar) {
                            r9 = r8;
                            return aoluVar;
                        }
                        r9 = r8;
                        if (((java.lang.Boolean) objC).booleanValue() && i != 0) {
                            ajcq ajcqVarAC = r9.aC();
                            iqsVar.a = r9;
                            iqsVar.e = 5;
                            objC = aosv.D(ajcqVarAC, iqsVar);
                            if (objC == aoluVar) {
                                return aoluVar;
                            }
                            r5 = r9;
                            if (!((java.lang.Boolean) objC).booleanValue()) {
                                ajcq ajcqVarAN = r5.aN();
                                iqsVar.a = null;
                                iqsVar.e = 6;
                                objC = aosv.D(ajcqVarAN, iqsVar);
                                if (objC == aoluVar) {
                                    return aoluVar;
                                }
                                z = ((java.lang.Boolean) objC).booleanValue() ? false : true;
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                java.lang.Object obj3 = iqsVar.a;
                aooc.af(objC);
                obj2 = obj3;
                obj2 = iqqVar;
                obj = obj2;
                if (((java.lang.Boolean) objC).booleanValue()) {
                    i = 0;
                    r6 = obj2;
                } else {
                    i = 1;
                    r6 = obj;
                }
                ajcq ajcqVarAM2 = r6.aM();
                iqsVar.a = r6;
                iqsVar.b = i;
                iqsVar.e = 2;
                objC = aosv.D(ajcqVarAM2, iqsVar);
                r7 = r6;
                if (objC == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAG2 = r7.aG();
                    iqsVar.a = r7;
                    iqsVar.b = i;
                    iqsVar.e = 3;
                    objC = aosv.D(ajcqVarAG2, iqsVar);
                    if (objC == aoluVar) {
                        r8 = r7;
                        return aoluVar;
                    }
                    r8 = r7;
                    if (!((java.lang.Boolean) objC).booleanValue()) {
                        ajcq ajcqVarAH2 = r8.aH();
                        iqsVar.a = r8;
                        iqsVar.b = i;
                        iqsVar.e = 4;
                        objC = aosv.D(ajcqVarAH2, iqsVar);
                        if (objC == aoluVar) {
                            r9 = r8;
                            return aoluVar;
                        }
                        r9 = r8;
                        if (((java.lang.Boolean) objC).booleanValue()) {
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                i = iqsVar.b;
                java.lang.Object obj4 = iqsVar.a;
                aooc.af(objC);
                r7 = obj4;
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAG3 = r7.aG();
                    iqsVar.a = r7;
                    iqsVar.b = i;
                    iqsVar.e = 3;
                    objC = aosv.D(ajcqVarAG3, iqsVar);
                    if (objC == aoluVar) {
                        r8 = r7;
                        return aoluVar;
                    }
                    r8 = r7;
                    if (!((java.lang.Boolean) objC).booleanValue()) {
                        ajcq ajcqVarAH3 = r8.aH();
                        iqsVar.a = r8;
                        iqsVar.b = i;
                        iqsVar.e = 4;
                        objC = aosv.D(ajcqVarAH3, iqsVar);
                        if (objC == aoluVar) {
                            r9 = r8;
                            return aoluVar;
                        }
                        r9 = r8;
                        if (((java.lang.Boolean) objC).booleanValue()) {
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                i = iqsVar.b;
                java.lang.Object obj5 = iqsVar.a;
                aooc.af(objC);
                r8 = obj5;
                r8 = r7;
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAH4 = r8.aH();
                    iqsVar.a = r8;
                    iqsVar.b = i;
                    iqsVar.e = 4;
                    objC = aosv.D(ajcqVarAH4, iqsVar);
                    if (objC == aoluVar) {
                        r9 = r8;
                        return aoluVar;
                    }
                    r9 = r8;
                    if (((java.lang.Boolean) objC).booleanValue()) {
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 4:
                i = iqsVar.b;
                java.lang.Object obj6 = iqsVar.a;
                aooc.af(objC);
                r9 = obj6;
                r9 = r8;
                if (((java.lang.Boolean) objC).booleanValue()) {
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                java.lang.Object obj7 = iqsVar.a;
                aooc.af(objC);
                r5 = obj7;
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAN2 = r5.aN();
                    iqsVar.a = null;
                    iqsVar.e = 6;
                    objC = aosv.D(ajcqVarAN2, iqsVar);
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objC).booleanValue()) {
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 6:
                aooc.af(objC);
                if (((java.lang.Boolean) objC).booleanValue()) {
                }
                return java.lang.Boolean.valueOf(z);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8 != r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.iqq r7, aoln r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.iqt
            if (r0 == 0) goto L13
            r0 = r8
            iqt r0 = (defpackage.iqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iqt r0 = new iqt
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            aolu r1 = aolu.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            aooc.af(r8)
            goto L75
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            aooc.af(r8)
            goto L5e
        L39:
            aooc.af(r8)
            goto L54
        L3d:
            aooc.af(r8)
            iqm r8 = r6.k
            boolean r8 = r8.b()
            if (r8 == 0) goto L67
            ajcq r6 = r7.an()
            r0.c = r5
            java.lang.Object r8 = aosv.D(r6, r0)
            if (r8 == r1) goto L74
        L54:
            izg r8 = (izg) r8
            r0.c = r4
            java.lang.Object r8 = r8.j(r0)
            if (r8 == r1) goto L74
        L5e:
            jhc r8 = (defpackage.jhc) r8
            boolean r6 = r8.e
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            goto L75
        L67:
            iwy r7 = r6.g
            java.lang.String r6 = r6.h
            r0.c = r3
            r8 = 0
            java.lang.Object r8 = r7.a(r6, r8, r0)
            if (r8 != r1) goto L75
        L74:
            r8 = r1
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqw.d(iqq, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.iqq iqqVar, aoln aolnVar) {
        defpackage.iqu iquVar;
        if (aolnVar instanceof defpackage.iqu) {
            iquVar = (defpackage.iqu) aolnVar;
            int i = iquVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iquVar.c = i - Integer.MIN_VALUE;
            } else {
                iquVar = new defpackage.iqu(this, aolnVar);
            }
        } else {
            iquVar = new defpackage.iqu(this, aolnVar);
        }
        java.lang.Object objD = iquVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iquVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarP = iqqVar.p();
            iquVar.c = 1;
            objD = aosv.D(ajcqVarP, iquVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        boolean z = j$.time.Instant.now().toEpochMilli() - ((java.lang.Number) objD).longValue() > 13000;
        if (!z) {
            a.b().l("com/android/dialer/beesly/impl/BeeslyCallMissedListener", "isCallReasonablyLong", 90, "BeeslyCallMissedListener.kt").v("Call was too short to be considered eligible for Beesly logging.");
            this.e.a(qbc.cn);
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.iqq iqqVar, aoln aolnVar) {
        defpackage.iqv iqvVar;
        if (aolnVar instanceof defpackage.iqv) {
            iqvVar = (defpackage.iqv) aolnVar;
            int i = iqvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqvVar.c = i - Integer.MIN_VALUE;
            } else {
                iqvVar = new defpackage.iqv(this, aolnVar);
            }
        } else {
            iqvVar = new defpackage.iqv(this, aolnVar);
        }
        java.lang.Object objD = iqvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iqvVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarW = iqqVar.W();
            iqvVar.c = 1;
            objD = aosv.D(ajcqVarW, iqvVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) aooh.q((j$.util.Optional) objD);
        if (disconnectCause == null) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(disconnectCause.getCode() == 5);
    }
}
