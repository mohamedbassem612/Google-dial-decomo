package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class neu {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider");
    private final mtd b;
    private final mvz c;
    private final mvy d;
    private final rsr e;

    public neu(android.content.Context context, mtd mtdVar, mvz mvzVar, rsr rsrVar, mvy mvyVar) {
        aooh.f(context, "appContext");
        aooh.f(mtdVar, "latestVoteStorage");
        aooh.f(mvyVar, "dobbySingletonLocaleProvider");
        this.b = mtdVar;
        this.c = mvzVar;
        this.e = rsrVar;
        this.d = mvyVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) throws aois {
        defpackage.nem nemVar;
        if (aolnVar instanceof defpackage.nem) {
            nemVar = (defpackage.nem) aolnVar;
            int i = nemVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nemVar.c = i - Integer.MIN_VALUE;
            } else {
                nemVar = new defpackage.nem(this, aolnVar);
            }
        } else {
            nemVar = new defpackage.nem(this, aolnVar);
        }
        java.lang.Object objC = nemVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nemVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            nemVar.c = 1;
            objC = c(nemVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        int iOrdinal = ((defpackage.nev) objC).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return "dobby_manual_screen_chip";
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        return "dobby_default_manual_screen_chip";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) throws aois {
        defpackage.nen nenVar;
        if (aolnVar instanceof defpackage.nen) {
            nenVar = (defpackage.nen) aolnVar;
            int i = nenVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nenVar.c = i - Integer.MIN_VALUE;
            } else {
                nenVar = new defpackage.nen(this, aolnVar);
            }
        } else {
            nenVar = new defpackage.nen(this, aolnVar);
        }
        java.lang.Object objC = nenVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nenVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            nenVar.c = 1;
            objC = c(nenVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        int iOrdinal = ((defpackage.nev) objC).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return this.d.c();
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        return this.d.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.neo neoVar;
        if (aolnVar instanceof defpackage.neo) {
            neoVar = (defpackage.neo) aolnVar;
            int i = neoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                neoVar.c = i - Integer.MIN_VALUE;
            } else {
                neoVar = new defpackage.neo(this, aolnVar);
            }
        } else {
            neoVar = new defpackage.neo(this, aolnVar);
        }
        java.lang.Object objF = neoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = neoVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            neoVar.c = 1;
            objF = f(neoVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        return ((java.lang.Boolean) objF).booleanValue() ? defpackage.nev.TYPE_ASK_IF_URGENT : defpackage.nev.TYPE_DEFAULT;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
    
        if (r5.equals("hi-IN") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r5.equals("en-IN") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        r1 = r4.b.getString(2132020034);
        aooh.e(r1, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aoln r5) throws aois {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.nep
            if (r0 == 0) goto L13
            r0 = r5
            nep r0 = (defpackage.nep) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nep r0 = new nep
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            aolu r1 = aolu.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            aooc.af(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            aooc.af(r5)
            r0.c = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 == r1) goto Lb5
        L3a:
            nev r5 = (defpackage.nev) r5
            int r5 = r5.ordinal()
            if (r5 == 0) goto L57
            if (r5 == r3) goto L57
            r0 = 2
            if (r5 == r0) goto L50
            r0 = 3
            if (r5 == r0) goto L57
            aois r4 = new aois
            r4.<init>()
            throw r4
        L50:
            mvy r4 = r4.d
            java.lang.String r1 = r4.c()
            goto Lb5
        L57:
            mvy r4 = r4.d
            aoir r5 = r4.j
            java.lang.Object r5 = r5.a()
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r5.hashCode()
            r1 = 96598217(0x5c1f8c9, float:1.8241022E-35)
            java.lang.String r2 = "getString(...)"
            if (r0 == r1) goto L94
            r1 = 99219825(0x5e9f971, float:2.2002845E-35)
            if (r0 == r1) goto L8b
            r1 = 100828572(0x602859c, float:2.4548443E-35)
            if (r0 != r1) goto L9c
            java.lang.String r0 = "ja-JP"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L9c
            android.content.Context r4 = r4.b
            r5 = 2132020037(0x7f140b45, float:1.9678426E38)
            java.lang.String r1 = r4.getString(r5)
            aooh.e(r1, r2)
            goto Lb5
        L8b:
            java.lang.String r0 = "hi-IN"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L9c
            goto La9
        L94:
            java.lang.String r0 = "en-IN"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La9
        L9c:
            android.content.Context r4 = r4.b
            r5 = 2132020032(0x7f140b40, float:1.9678416E38)
            java.lang.String r1 = r4.getString(r5)
            aooh.e(r1, r2)
            goto Lb5
        La9:
            android.content.Context r4 = r4.b
            r5 = 2132020034(0x7f140b42, float:1.967842E38)
            java.lang.String r1 = r4.getString(r5)
            aooh.e(r1, r2)
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neu.d(aoln):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) throws aois {
        defpackage.neq neqVar;
        if (aolnVar instanceof defpackage.neq) {
            neqVar = (defpackage.neq) aolnVar;
            int i = neqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                neqVar.c = i - Integer.MIN_VALUE;
            } else {
                neqVar = new defpackage.neq(this, aolnVar);
            }
        } else {
            neqVar = new defpackage.neq(this, aolnVar);
        }
        java.lang.Object objC = neqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = neqVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            neqVar.c = 1;
            objC = c(neqVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        int iOrdinal = ((defpackage.nev) objC).ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return alxi.b;
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        return alxi.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.ner nerVar;
        boolean z;
        if (aolnVar instanceof defpackage.ner) {
            nerVar = (defpackage.ner) aolnVar;
            int i = nerVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nerVar.d = i - Integer.MIN_VALUE;
            } else {
                nerVar = new defpackage.ner(this, aolnVar);
            }
        } else {
            nerVar = new defpackage.ner(this, aolnVar);
        }
        java.lang.Object objG = nerVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nerVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = nerVar.a;
                aooc.af(objG);
            }
            java.lang.Boolean bool = (java.lang.Boolean) objG;
            boolean zBooleanValue = bool.booleanValue();
            aimz aimzVar = a;
            aimzVar.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isAskIfUrgentApplicable", 92, "DobbyManualScreenConfigProvider.kt").y("isContact: [%s]", java.lang.Boolean.valueOf(z));
            aimzVar.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isAskIfUrgentApplicable", 96, "DobbyManualScreenConfigProvider.kt").y("isDuplexModelAvailable: [%s]", bool);
            return java.lang.Boolean.valueOf(!z && zBooleanValue);
        }
        aooc.af(objG);
        nerVar.d = 1;
        objG = g(nerVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objG).booleanValue();
        nerVar.a = zBooleanValue2;
        nerVar.d = 2;
        java.lang.Object objH = h(nerVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        objG = objH;
        z = zBooleanValue2;
        java.lang.Boolean bool2 = (java.lang.Boolean) objG;
        boolean zBooleanValue3 = bool2.booleanValue();
        aimz aimzVar2 = a;
        aimzVar2.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isAskIfUrgentApplicable", 92, "DobbyManualScreenConfigProvider.kt").y("isContact: [%s]", java.lang.Boolean.valueOf(z));
        aimzVar2.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isAskIfUrgentApplicable", 96, "DobbyManualScreenConfigProvider.kt").y("isDuplexModelAvailable: [%s]", bool2);
        return java.lang.Boolean.valueOf(!z && zBooleanValue3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.nes nesVar;
        aimw aimwVarL;
        java.lang.String str;
        aimw aimwVar;
        if (aolnVar instanceof defpackage.nes) {
            nesVar = (defpackage.nes) aolnVar;
            int i = nesVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nesVar.d = i - Integer.MIN_VALUE;
            } else {
                nesVar = new defpackage.nes(this, aolnVar);
            }
        } else {
            nesVar = new defpackage.nes(this, aolnVar);
        }
        java.lang.Object objA = nesVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nesVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                str = nesVar.e;
                java.lang.Object obj = nesVar.a;
                aooc.af(objA);
                aimwVar = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            defpackage.mta mtaVar = (defpackage.mta) objA;
            return java.lang.Boolean.valueOf((mtaVar != null ? mtaVar.b : null) == defpackage.msz.e);
        }
        aooc.af(objA);
        aimwVarL = a.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isContact", 105, "DobbyManualScreenConfigProvider.kt");
        mtd mtdVar = this.b;
        nesVar.a = aimwVarL;
        str = "Latest vote reason was [%s]";
        nesVar.e = "Latest vote reason was [%s]";
        nesVar.d = 1;
        objA = mtdVar.a(nesVar);
        if (objA == aoluVar) {
            aimwVar = aimwVarL;
            return aoluVar;
        }
        aimwVar = aimwVarL;
        defpackage.mta mtaVar2 = (defpackage.mta) objA;
        aimwVar.y(str, mtaVar2 != null ? mtaVar2.b : null);
        mtd mtdVar2 = this.b;
        nesVar.a = null;
        nesVar.e = null;
        nesVar.d = 2;
        objA = mtdVar2.a(nesVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.mta mtaVar3 = (defpackage.mta) objA;
        return java.lang.Boolean.valueOf((mtaVar3 != null ? mtaVar3.b : null) == defpackage.msz.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.net netVar;
        acux acuxVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.net) {
            netVar = (defpackage.net) aolnVar;
            int i = netVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                netVar.c = i - Integer.MIN_VALUE;
            } else {
                netVar = new defpackage.net(this, aolnVar);
            }
        } else {
            netVar = new defpackage.net(this, aolnVar);
        }
        java.lang.Object obj = netVar.a;
        aolu aoluVar = aolu.a;
        int i2 = netVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            acux acuxVarA = this.c.a();
            java.lang.String str2 = acuxVarA.c;
            aooh.e(str2, "getGroupName(...)");
            acvm acvmVarA = acvn.a();
            acvmVarA.b(str2);
            acvn acvnVarA = acvmVarA.a();
            rsr rsrVar = this.e;
            netVar.d = acuxVarA;
            netVar.e = str2;
            netVar.c = 1;
            java.lang.Object objJ = rsrVar.J(acvnVarA, netVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            acuxVar = acuxVarA;
            obj = objJ;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = netVar.e;
            acuxVar = netVar.d;
            aooc.af(obj);
        }
        acui acuiVar = (acui) obj;
        if (acuiVar == null) {
            a.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isDuplexModelAvailable", 119, "DobbyManualScreenConfigProvider.kt").G("No Duplex Model for group '%s' Available, request version (%d)", str, acuxVar.e);
            return java.lang.Boolean.FALSE;
        }
        int i3 = acuiVar.f;
        aimz aimzVar = a;
        if (i3 >= 1681042635) {
            aimzVar.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isDuplexModelAvailable", 131, "DobbyManualScreenConfigProvider.kt").M("Downloaded Duplex Model (%d) meets minimum version (%d), request version(%d)", new java.lang.Integer(acuiVar.f), new java.lang.Integer(1681042635), new java.lang.Integer(acuxVar.e));
            return java.lang.Boolean.TRUE;
        }
        aimzVar.b().g(30, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/dobby/impl/service/DobbyManualScreenConfigProvider", "isDuplexModelAvailable", 143, "DobbyManualScreenConfigProvider.kt").M("Downloaded Duplex Model (%d) does NOT meet minimum version (%d), request version (%d)", new java.lang.Integer(acuiVar.f), new java.lang.Integer(1681042635), new java.lang.Integer(acuxVar.e));
        return java.lang.Boolean.FALSE;
    }
}
