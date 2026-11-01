package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class irg implements znv {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/BeeslyCallRingingStartedListener");
    public final ajcu b;
    public final aoss c;
    public final defpackage.iwy d;
    public final aoin e;
    public final iqm f;
    public final java.lang.String g;
    public final defpackage.mba h;
    public final zij i;
    public final defpackage.iqp j;
    public final jbm k;
    public final defpackage.jif l;
    public final defpackage.jfc m;
    public final qbe n;
    private final jcg o;
    private final zjl p;
    private final aoin q;
    private final zjm r;
    private final afpl s;

    public irg(ajcu ajcuVar, aoss aossVar, defpackage.iwy iwyVar, jcg jcgVar, aoin aoinVar, iqm iqmVar, java.lang.String str, afpl afplVar, qbe qbeVar, defpackage.mba mbaVar, zij zijVar, zjm zjmVar, defpackage.iqp iqpVar, jbm jbmVar, defpackage.jif jifVar, aazc aazcVar, defpackage.jfc jfcVar, zjl zjlVar, aoin aoinVar2) {
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(aossVar, "coroutineScope");
        aooh.f(aoinVar, "enableTimeoutAlgorithmI18n");
        aooh.f(str, "callId");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(jbmVar, "beeslySettings");
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        aooh.f(aazcVar, "clock");
        aooh.f(jfcVar, "beeslyLifecycleControllerV2");
        this.b = ajcuVar;
        this.c = aossVar;
        this.d = iwyVar;
        this.o = jcgVar;
        this.e = aoinVar;
        this.f = iqmVar;
        this.g = str;
        this.s = afplVar;
        this.n = qbeVar;
        this.h = mbaVar;
        this.i = zijVar;
        this.r = zjmVar;
        this.j = iqpVar;
        this.k = jbmVar;
        this.l = jifVar;
        this.m = jfcVar;
        this.p = zjlVar;
        this.q = aoinVar2;
    }

    public static final defpackage.jhv h(int i) {
        defpackage.hgw hgwVarO = defpackage.hhk.o(defpackage.jhv.a.m());
        hgwVarO.f(i);
        return hgwVarO.e();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [iqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [iqx] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [irg] */
    public final java.lang.Object a(defpackage.iqx iqxVar, aoln aolnVar) {
        defpackage.iqy iqyVar;
        ?? r10;
        ?? r11;
        java.lang.String str;
        java.lang.Long lC;
        java.lang.Object objF;
        java.lang.Object objF2;
        if (aolnVar instanceof defpackage.iqy) {
            iqyVar = (defpackage.iqy) aolnVar;
            int i = iqyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqyVar.d = i - Integer.MIN_VALUE;
            } else {
                iqyVar = new defpackage.iqy(this, aolnVar);
            }
        } else {
            iqyVar = new defpackage.iqy(this, aolnVar);
        }
        java.lang.Object objD = iqyVar.b;
        aolu aoluVar = aolu.a;
        int i2 = iqyVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarS = iqxVar.S();
            iqyVar.a = iqxVar;
            iqyVar.d = 1;
            objD = aosv.D(ajcqVarS, iqyVar);
            if (objD != aoluVar) {
            }
            r10 = iqxVar;
            r11 = r10;
            return aoluVar;
        }
        if (i2 == 1) {
            java.lang.Object obj = iqyVar.a;
            aooc.af(objD);
            r10 = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4 && i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
                return objD;
            }
            java.lang.Object obj2 = iqyVar.a;
            aooc.af(objD);
            r11 = obj2;
        }
        r11 = r10;
        str = (java.lang.String) objD;
        if (str != null) {
            lC = this.o.c(str);
        } else {
            lC = null;
        }
        if (lC != null) {
            long jLongValue = lC.longValue();
            iqyVar.a = null;
            iqyVar.d = 3;
            objF2 = f(r11, jLongValue, iqyVar);
            if (objF2 != aoluVar) {
                return objF2;
            }
        } else {
            long jA = this.o.a();
            iqyVar.a = null;
            iqyVar.d = 4;
            objF = f(r11, jA, iqyVar);
            if (objF != aoluVar) {
                return objF;
            }
        }
        r10 = iqxVar;
        r11 = r10;
        return aoluVar;
        r10 = iqxVar;
        oko okoVar = (oko) objD;
        if (this.f.d()) {
            iqyVar.a = r10;
            iqyVar.d = 2;
            objD = okoVar.I(iqyVar);
            if (objD != aoluVar) {
                r11 = r10;
                str = (java.lang.String) objD;
                if (str != null) {
                    lC = this.o.c(str);
                } else {
                    lC = null;
                }
                if (lC != null) {
                    long jLongValue2 = lC.longValue();
                    iqyVar.a = null;
                    iqyVar.d = 3;
                    objF2 = f(r11, jLongValue2, iqyVar);
                    if (objF2 != aoluVar) {
                        return objF2;
                    }
                } else {
                    long jA2 = this.o.a();
                    iqyVar.a = null;
                    iqyVar.d = 4;
                    objF = f(r11, jA2, iqyVar);
                    if (objF != aoluVar) {
                        return objF;
                    }
                }
            }
        } else {
            iqyVar.a = null;
            iqyVar.d = 5;
            java.lang.Object objE = e(r10, iqyVar);
            if (objE != aoluVar) {
                return objE;
            }
        }
        r10 = iqxVar;
        r11 = r10;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.iqz iqzVar;
        if (aolnVar instanceof defpackage.iqz) {
            iqzVar = (defpackage.iqz) aolnVar;
            int i = iqzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqzVar.c = i - Integer.MIN_VALUE;
            } else {
                iqzVar = new defpackage.iqz(this, aolnVar);
            }
        } else {
            iqzVar = new defpackage.iqz(this, aolnVar);
        }
        java.lang.Object objD = iqzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iqzVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.s.X();
            iqzVar.c = 1;
            objD = aosv.D(ajcqVarX, iqzVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.iqx.class);
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
    /* JADX WARN: Type inference failed for: r5v14, types: [iqx] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [iqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5, types: [iqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [iqx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [iqx, java.lang.Object] */
    public final java.lang.Object c(defpackage.iqx iqxVar, aoln aolnVar) {
        defpackage.ira iraVar;
        java.lang.Object obj;
        int i;
        ?? r6;
        java.lang.Object obj2;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r5;
        boolean z;
        if (aolnVar instanceof defpackage.ira) {
            iraVar = (defpackage.ira) aolnVar;
            int i2 = iraVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iraVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iraVar = new defpackage.ira(this, aolnVar);
            }
        } else {
            iraVar = new defpackage.ira(this, aolnVar);
        }
        java.lang.Object objC = iraVar.c;
        aolu aoluVar = aolu.a;
        switch (iraVar.e) {
            case 0:
                aooc.af(objC);
                obj = iqxVar;
                if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                    zjl zjlVar = this.p;
                    iraVar.a = iqxVar;
                    iraVar.e = 1;
                    objC = zjlVar.c(iraVar);
                    if (objC == aoluVar) {
                        obj2 = iqxVar;
                        return aoluVar;
                    }
                    obj2 = iqxVar;
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
                iraVar.a = r6;
                iraVar.b = i;
                iraVar.e = 2;
                objC = aosv.D(ajcqVarAM, iraVar);
                r7 = r6;
                if (objC == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAG = r7.aG();
                    iraVar.a = r7;
                    iraVar.b = i;
                    iraVar.e = 3;
                    objC = aosv.D(ajcqVarAG, iraVar);
                    if (objC == aoluVar) {
                        r8 = r7;
                        return aoluVar;
                    }
                    r8 = r7;
                    if (!((java.lang.Boolean) objC).booleanValue()) {
                        ajcq ajcqVarAH = r8.aH();
                        iraVar.a = r8;
                        iraVar.b = i;
                        iraVar.e = 4;
                        objC = aosv.D(ajcqVarAH, iraVar);
                        if (objC == aoluVar) {
                            r9 = r8;
                            return aoluVar;
                        }
                        r9 = r8;
                        if (((java.lang.Boolean) objC).booleanValue() && i != 0) {
                            ajcq ajcqVarAC = r9.aC();
                            iraVar.a = r9;
                            iraVar.e = 5;
                            objC = aosv.D(ajcqVarAC, iraVar);
                            if (objC == aoluVar) {
                                return aoluVar;
                            }
                            r5 = r9;
                            if (!((java.lang.Boolean) objC).booleanValue()) {
                                ajcq ajcqVarAN = r5.aN();
                                iraVar.a = null;
                                iraVar.e = 6;
                                objC = aosv.D(ajcqVarAN, iraVar);
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
                java.lang.Object obj3 = iraVar.a;
                aooc.af(objC);
                obj2 = obj3;
                obj2 = iqxVar;
                obj = obj2;
                if (((java.lang.Boolean) objC).booleanValue()) {
                    i = 0;
                    r6 = obj2;
                } else {
                    i = 1;
                    r6 = obj;
                }
                ajcq ajcqVarAM2 = r6.aM();
                iraVar.a = r6;
                iraVar.b = i;
                iraVar.e = 2;
                objC = aosv.D(ajcqVarAM2, iraVar);
                r7 = r6;
                if (objC == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAG2 = r7.aG();
                    iraVar.a = r7;
                    iraVar.b = i;
                    iraVar.e = 3;
                    objC = aosv.D(ajcqVarAG2, iraVar);
                    if (objC == aoluVar) {
                        r8 = r7;
                        return aoluVar;
                    }
                    r8 = r7;
                    if (!((java.lang.Boolean) objC).booleanValue()) {
                        ajcq ajcqVarAH2 = r8.aH();
                        iraVar.a = r8;
                        iraVar.b = i;
                        iraVar.e = 4;
                        objC = aosv.D(ajcqVarAH2, iraVar);
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
                i = iraVar.b;
                java.lang.Object obj4 = iraVar.a;
                aooc.af(objC);
                r7 = obj4;
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAG3 = r7.aG();
                    iraVar.a = r7;
                    iraVar.b = i;
                    iraVar.e = 3;
                    objC = aosv.D(ajcqVarAG3, iraVar);
                    if (objC == aoluVar) {
                        r8 = r7;
                        return aoluVar;
                    }
                    r8 = r7;
                    if (!((java.lang.Boolean) objC).booleanValue()) {
                        ajcq ajcqVarAH3 = r8.aH();
                        iraVar.a = r8;
                        iraVar.b = i;
                        iraVar.e = 4;
                        objC = aosv.D(ajcqVarAH3, iraVar);
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
                i = iraVar.b;
                java.lang.Object obj5 = iraVar.a;
                aooc.af(objC);
                r8 = obj5;
                r8 = r7;
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAH4 = r8.aH();
                    iraVar.a = r8;
                    iraVar.b = i;
                    iraVar.e = 4;
                    objC = aosv.D(ajcqVarAH4, iraVar);
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
                i = iraVar.b;
                java.lang.Object obj6 = iraVar.a;
                aooc.af(objC);
                r9 = obj6;
                r9 = r8;
                if (((java.lang.Boolean) objC).booleanValue()) {
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                java.lang.Object obj7 = iraVar.a;
                aooc.af(objC);
                r5 = obj7;
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    ajcq ajcqVarAN2 = r5.aN();
                    iraVar.a = null;
                    iraVar.e = 6;
                    objC = aosv.D(ajcqVarAN2, iraVar);
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

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [irg] */
    /* JADX WARN: Type inference failed for: r9v2, types: [iqx] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final java.lang.Object e(defpackage.iqx iqxVar, aoln aolnVar) {
        defpackage.irb irbVar;
        java.lang.Object obj;
        ?? r9;
        jcg jcgVar;
        java.lang.Long lB;
        java.lang.Object objF;
        java.lang.Object objF2;
        if (aolnVar instanceof defpackage.irb) {
            irbVar = (defpackage.irb) aolnVar;
            int i = irbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                irbVar.d = i - Integer.MIN_VALUE;
            } else {
                irbVar = new defpackage.irb(this, aolnVar);
            }
        } else {
            irbVar = new defpackage.irb(this, aolnVar);
        }
        java.lang.Object objD = irbVar.b;
        aolu aoluVar = aolu.a;
        int i2 = irbVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarS = iqxVar.S();
            irbVar.a = iqxVar;
            irbVar.d = 1;
            objD = aosv.D(ajcqVarS, irbVar);
            if (objD != aoluVar) {
            }
            obj = iqxVar;
            return aoluVar;
        }
        if (i2 == 1) {
            java.lang.Object obj2 = irbVar.a;
            aooc.af(objD);
            obj = obj2;
        } else {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
                return objD;
            }
            java.lang.Object obj3 = irbVar.a;
            aooc.af(objD);
            r9 = obj3;
        }
        int iIntValue = ((java.lang.Number) objD).intValue();
        jcgVar = this.o;
        lB = jcgVar.b(iIntValue);
        if (lB != null) {
            long jLongValue = lB.longValue();
            irbVar.a = null;
            irbVar.d = 3;
            objF2 = f(r9, jLongValue, irbVar);
            if (objF2 != aoluVar) {
                return objF2;
            }
        } else {
            long jA = jcgVar.a();
            irbVar.a = null;
            irbVar.d = 4;
            objF = f(r9, jA, irbVar);
            if (objF != aoluVar) {
                return objF;
            }
        }
        obj = iqxVar;
        return aoluVar;
        obj = iqxVar;
        irbVar.a = obj;
        irbVar.d = 2;
        objD = ((oko) objD).J(irbVar);
        r9 = obj;
        if (objD != aoluVar) {
            int iIntValue2 = ((java.lang.Number) objD).intValue();
            jcgVar = this.o;
            lB = jcgVar.b(iIntValue2);
            if (lB != null) {
                long jLongValue2 = lB.longValue();
                irbVar.a = null;
                irbVar.d = 3;
                objF2 = f(r9, jLongValue2, irbVar);
                if (objF2 != aoluVar) {
                    return objF2;
                }
            } else {
                long jA2 = jcgVar.a();
                irbVar.a = null;
                irbVar.d = 4;
                objF = f(r9, jA2, irbVar);
                if (objF != aoluVar) {
                    return objF;
                }
            }
        }
        obj = iqxVar;
        return aoluVar;
    }

    public final ajcq ej() {
        aoov.an(this.c, (aolr) null, 0, new defpackage.irf(this, null), 3);
        return ajcm.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.iqx iqxVar, long j, aoln aolnVar) {
        defpackage.irc ircVar;
        if (aolnVar instanceof defpackage.irc) {
            ircVar = (defpackage.irc) aolnVar;
            int i = ircVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ircVar.d = i - Integer.MIN_VALUE;
            } else {
                ircVar = new defpackage.irc(this, aolnVar);
            }
        } else {
            ircVar = new defpackage.irc(this, aolnVar);
        }
        java.lang.Object objD = ircVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ircVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = ircVar.a;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            j = aorh.i(aooh.B(((java.lang.Number) objD).longValue(), aorj.c));
            return new java.lang.Long(j);
        }
        aooc.af(objD);
        ajcq ajcqVarBe = iqxVar.be();
        ircVar.a = j;
        ircVar.d = 1;
        objD = aosv.D(ajcqVarBe, ircVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objD);
        if (((java.lang.Boolean) this.e.a()).booleanValue() && phoneAccountHandle != null) {
            long j2 = aorh.a;
            jbm jbmVar = this.k;
            ircVar.d = 2;
            objD = jbmVar.c(phoneAccountHandle, ircVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            j = aorh.i(aooh.B(((java.lang.Number) objD).longValue(), aorj.c));
        }
        return new java.lang.Long(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.ird irdVar;
        if (aolnVar instanceof defpackage.ird) {
            irdVar = (defpackage.ird) aolnVar;
            int i = irdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irdVar.c = i - Integer.MIN_VALUE;
            } else {
                irdVar = new defpackage.ird(this, aolnVar);
            }
        } else {
            irdVar = new defpackage.ird(this, aolnVar);
        }
        java.lang.Object objC = irdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = irdVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            j$.util.Optional optionalG = this.r.g();
            aooh.e(optionalG, "getFeature(...)");
            mnp mnpVar = (mnp) aooh.q(optionalG);
            if (mnpVar == null) {
                return java.lang.Boolean.FALSE;
            }
            java.lang.String str = this.g;
            irdVar.c = 1;
            objC = mnpVar.c(str, irdVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        aooc.af(objC);
        if (!((java.lang.Boolean) objC).booleanValue()) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.iwy iwyVar = this.d;
        java.lang.String str2 = this.g;
        irdVar.c = 2;
        java.lang.Object objA = iwyVar.a(str2, true, irdVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }
}
