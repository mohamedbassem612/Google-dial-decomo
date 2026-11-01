package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ipc {
    public final java.lang.Object a;

    public ipc(defpackage.gou... gouVarArr) {
        java.util.List listAsList = java.util.Arrays.asList(gouVarArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        if (listAsList == null) {
            defpackage.aooh.i("values");
        }
        defpackage.med medVar = new defpackage.med(20);
        java.util.Iterator it = listAsList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((java.lang.Boolean) medVar.a(it.next())).booleanValue()) {
                break;
            } else {
                i++;
            }
        }
        java.util.Collection collectionSubList = i == -1 ? defpackage.aokc.a : listAsList.subList(i, listAsList.size());
        if (!(collectionSubList instanceof java.util.Collection) || !collectionSubList.isEmpty()) {
            java.util.Iterator it2 = collectionSubList.iterator();
            while (it2.hasNext()) {
                if (!defpackage.aooh.n(((defpackage.gou) it2.next()).d, defpackage.rkw.b)) {
                    throw new java.lang.IllegalArgumentException("ConditionFlagExemption.lowestPriority() can only appear at the end of the list");
                }
            }
        }
        this.a = listAsList;
    }

    public static int ah(defpackage.kgl kglVar, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.ehb.a((defpackage.eja) kglVar.a, 1, obj) + defpackage.ehb.a((defpackage.eja) kglVar.c, 2, obj2);
    }

    public static void ai(defpackage.egv egvVar, defpackage.kgl kglVar, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ehb.d(egvVar, (defpackage.eja) kglVar.a, 1, obj);
        defpackage.ehb.d(egvVar, (defpackage.eja) kglVar.c, 2, obj2);
    }

    public static final defpackage.akzm be() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - aa$.ExternalSyntheticApiModelOutline1.m();
        defpackage.akzm akzmVarF = defpackage.aldf.f(jElapsedRealtime / 1000, (int) ((jElapsedRealtime % 1000) * 1000000));
        defpackage.aooh.e(akzmVarF, "fromMillis(...)");
        return akzmVarF;
    }

    public static void bi(java.io.File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (java.io.File file2 : file.listFiles()) {
                    bi(file2);
                }
            }
            file.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final void bo(java.lang.String str, java.lang.Object obj) {
        this.a.put(str, obj);
    }

    private static final scy bp(sdl sdlVar) {
        return new scy(sdlVar.a, sdlVar.b, sdlVar.c, sdlVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ruc] */
    private final void bq(defpackage.aenj aenjVar) {
        ?? r0 = this.a;
        r0.m(aenjVar);
        r0.o(aenjVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void A(defpackage.ghg ghgVar) {
        if (ghgVar == null) {
            defpackage.aooh.i("migration");
        }
        ?? r3 = this.a;
        int i = ghgVar.a;
        int i2 = ghgVar.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Object treeMap = r3.get(numValueOf);
        if (treeMap == null) {
            treeMap = new java.util.TreeMap();
            r3.put(numValueOf, treeMap);
        }
        java.util.TreeMap treeMap2 = (java.util.TreeMap) treeMap;
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
        if (treeMap2.containsKey(numValueOf2)) {
            android.util.Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + ghgVar);
        }
        treeMap2.put(numValueOf2, ghgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object B(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) {
        defpackage.gfr gfrVar;
        if (aolnVar instanceof defpackage.gfr) {
            gfrVar = (defpackage.gfr) aolnVar;
            int i = gfrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gfrVar.b = i - Integer.MIN_VALUE;
            } else {
                gfrVar = new defpackage.gfr(this, aolnVar);
            }
        } else {
            gfrVar = new defpackage.gfr(this, aolnVar);
        }
        java.lang.Object obj = gfrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gfrVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj2 = this.a;
            gfrVar.b = 1;
            if (((defpackage.aozj) obj2).fM(aoxiVar, gfrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        throw new defpackage.aoiq();
    }

    public final defpackage.gdq C() {
        return (defpackage.gdq) ((defpackage.uqz) this.a).c;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aoxh, java.lang.Object] */
    public final defpackage.aoxh D(defpackage.gac gacVar) {
        int iOrdinal = gacVar.ordinal();
        if (iOrdinal == 1) {
            return ((defpackage.aaha) ((defpackage.uqz) this.a).b).a;
        }
        if (iOrdinal == 2) {
            return ((defpackage.aaha) ((defpackage.uqz) this.a).a).a;
        }
        throw new java.lang.IllegalArgumentException("invalid load type for hints");
    }

    public final void E(defpackage.gac gacVar, defpackage.gds gdsVar) {
        defpackage.aooh.f(gacVar, "loadType");
        if (gacVar != defpackage.gac.b && gacVar != defpackage.gac.c) {
            java.util.Objects.toString(gacVar);
            throw new java.lang.IllegalArgumentException("invalid load type for reset: ".concat(java.lang.String.valueOf(gacVar)));
        }
        ((defpackage.uqz) this.a).c(null, new dqv(gacVar, gdsVar, 6, (byte[]) null));
    }

    public final java.lang.Object F() {
        return ((java.lang.ref.WeakReference) this.a).get();
    }

    public final void G(int i, boolean z) {
        ((defpackage.egv) this.a).e(i, z);
    }

    public final void H(int i, defpackage.egm egmVar) {
        ((defpackage.egv) this.a).f(i, egmVar);
    }

    public final void I(int i, double d) {
        ((defpackage.egv) this.a).L(i, d);
    }

    public final void J(int i, int i2) {
        ((defpackage.egv) this.a).l(i, i2);
    }

    public final void K(int i, int i2) {
        ((defpackage.egv) this.a).h(i, i2);
    }

    public final void L(int i, long j) {
        ((defpackage.egv) this.a).j(i, j);
    }

    public final void M(int i, float f) {
        ((defpackage.egv) this.a).N(i, f);
    }

    public final void N(int i, java.lang.Object obj, defpackage.eig eigVar) {
        defpackage.egv egvVar = (defpackage.egv) this.a;
        egvVar.s(i, 3);
        eigVar.i((defpackage.egb) obj, this);
        egvVar.s(i, 4);
    }

    public final void O(int i, int i2) {
        ((defpackage.egv) this.a).l(i, i2);
    }

    public final void P(int i, long j) {
        ((defpackage.egv) this.a).v(i, j);
    }

    public final void Q(int i, java.lang.Object obj, defpackage.eig eigVar) {
        defpackage.egb egbVar = (defpackage.egb) obj;
        defpackage.egv egvVar = (defpackage.egv) this.a;
        egvVar.s(i, 2);
        egvVar.u(egbVar.c(eigVar));
        eigVar.i(egbVar, this);
    }

    public final void R(int i, int i2) {
        ((defpackage.egv) this.a).h(i, i2);
    }

    public final void S(int i, long j) {
        ((defpackage.egv) this.a).j(i, j);
    }

    public final void T(int i, int i2) {
        ((defpackage.egv) this.a).t(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void U(int i, long j) {
        ((defpackage.egv) this.a).v(i, (j << 1) ^ (j >> 63));
    }

    public final void V(int i, int i2) {
        ((defpackage.egv) this.a).t(i, i2);
    }

    public final void W(int i, long j) {
        ((defpackage.egv) this.a).v(i, j);
    }

    public final defpackage.efd X() {
        return (defpackage.efd) ((defpackage.aozj) this.a).c();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    public final defpackage.efd Y(defpackage.efd efdVar) {
        defpackage.aozj aozjVar;
        java.lang.Object objC;
        defpackage.efd efdVar2;
        if (efdVar == null) {
            defpackage.aooh.i("newState");
        }
        java.lang.Object obj = this.a;
        do {
            aozjVar = (defpackage.aozj) obj;
            objC = aozjVar.c();
            efdVar2 = (defpackage.efd) objC;
            if ((efdVar2 instanceof defpackage.eex) || defpackage.aooh.n(efdVar2, defpackage.efg.a)) {
                efdVar2 = efdVar;
            } else if (efdVar2 instanceof defpackage.ecr) {
                if (efdVar.c > ((defpackage.ecr) efdVar2).c) {
                    efdVar2 = efdVar;
                }
            } else if (!(efdVar2 instanceof defpackage.eeu)) {
                if (efdVar2 instanceof defpackage.eev) {
                    throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new defpackage.aois();
            }
        } while (!aozjVar.f(objC, efdVar2));
        return efdVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r7 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(defpackage.dmp r6, defpackage.aoln r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dmd
            if (r0 == 0) goto L13
            r0 = r7
            dmd r0 = (dmd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmd r0 = new dmd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.aooc.af(r7)
            goto L80
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.aooc.af(r7)
            goto L90
        L38:
            defpackage.aooc.af(r7)
            boolean r7 = r6 instanceof defpackage.dmc
            if (r7 == 0) goto L53
            dmc r6 = (defpackage.dmc) r6
            dmb r7 = r6.a
            java.lang.Object r5 = r5.a
            r2 = 0
            r0.a = r2
            r0.c = r4
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r7.b(r5, r6, r0)
            if (r7 != r1) goto L90
            goto L7e
        L53:
            boolean r7 = r6 instanceof defpackage.dnh
            if (r7 == 0) goto L91
            r7 = r6
            dnh r7 = (defpackage.dnh) r7
            java.lang.Object r2 = r5.a
            r0.a = r6
            r0.c = r3
            aosc r3 = new aosc
            aoln r0 = defpackage.ajsz.ap(r0)
            r3.<init>(r0, r4)
            r3.z()
            int r0 = r7.a
            dme r4 = new dme
            r4.<init>(r3, r7)
            android.content.Context r2 = (android.content.Context) r2
            defpackage.dwk.c(r2, r0, r4)
            java.lang.Object r7 = r3.k()
            if (r7 != r1) goto L80
        L7e:
            r7 = r1
            goto L90
        L80:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            dnh r6 = (defpackage.dnh) r6
            dnb r6 = r6.b
            java.lang.Object r5 = r5.a
            int r0 = defpackage.dni.a
            android.content.Context r5 = (android.content.Context) r5
            android.graphics.Typeface r7 = defpackage.dni.a(r7, r6, r5)
        L90:
            return r7
        L91:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Unknown font type: "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipc.Z(dmp, aoln):java.lang.Object");
    }

    public final /* synthetic */ defpackage.ipb a() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.ipb) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aA(defpackage.aoln aolnVar) {
        defpackage.six sixVar;
        if (aolnVar instanceof defpackage.six) {
            sixVar = (defpackage.six) aolnVar;
            int i = sixVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sixVar.b = i - Integer.MIN_VALUE;
            } else {
                sixVar = new defpackage.six(this, aolnVar);
            }
        } else {
            sixVar = new defpackage.six(this, aolnVar);
        }
        java.lang.Object objD = sixVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sixVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = this.a;
            sixVar.b = 1;
            objD = ((defpackage.tkl) obj).d(sixVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        defpackage.aooc.af(objD);
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            defpackage.abvh abvhVar = ((defpackage.shg) shhVar).a;
            sixVar.b = 2;
            java.lang.Object objAj = defpackage.aoov.aj(abvhVar.d, new defpackage.zhb(abvhVar, (defpackage.aoln) null, 20), sixVar);
            if (objAj != aoluVar) {
                return objAj;
            }
        } else {
            if (iO != 1) {
                throw new defpackage.aois();
            }
            defpackage.abvp abvpVar = shhVar.a;
            sixVar.b = 3;
            java.lang.Object objB = abvpVar.b(sixVar);
            if (objB != aoluVar) {
                return objB;
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aB(defpackage.aoln aolnVar) {
        siy siyVar;
        if (aolnVar instanceof siy) {
            siyVar = (siy) aolnVar;
            int i = siyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                siyVar.b = i - Integer.MIN_VALUE;
            } else {
                siyVar = new siy(this, aolnVar);
            }
        } else {
            siyVar = new siy(this, aolnVar);
        }
        java.lang.Object objD = siyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = siyVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = this.a;
            siyVar.b = 1;
            objD = ((defpackage.tkl) obj).d(siyVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        defpackage.aooc.af(objD);
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        siyVar.b = 2;
        java.lang.Object objAj = defpackage.aoov.aj(abvpVar.d, new abvk(abvpVar, (defpackage.aoln) null, 1, (byte[]) null), siyVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aC(defpackage.aoln aolnVar) {
        siz sizVar;
        if (aolnVar instanceof siz) {
            sizVar = (siz) aolnVar;
            int i = sizVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sizVar.b = i - Integer.MIN_VALUE;
            } else {
                sizVar = new siz(this, aolnVar);
            }
        } else {
            sizVar = new siz(this, aolnVar);
        }
        java.lang.Object objD = sizVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sizVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = this.a;
            sizVar.b = 1;
            objD = ((defpackage.tkl) obj).d(sizVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        defpackage.aooc.af(objD);
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        sizVar.b = 2;
        java.lang.Object objC = abvpVar.c(sizVar);
        if (objC != aoluVar) {
            return objC;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object aD(java.lang.String str, android.net.Uri uri, amjp amjpVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, afaw afawVar, defpackage.aoln aolnVar) {
        sja sjaVar;
        java.lang.String str5;
        afaw afawVar2;
        java.lang.String str6;
        amjp amjpVar2;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Object obj;
        if (aolnVar instanceof sja) {
            sjaVar = (sja) aolnVar;
            int i = sjaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjaVar.c = i - Integer.MIN_VALUE;
            } else {
                sjaVar = new sja(this, aolnVar);
            }
        } else {
            sjaVar = new sja(this, aolnVar);
        }
        java.lang.Object obj2 = sjaVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sjaVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            java.lang.Object obj3 = this.a;
            sjaVar.d = str;
            sjaVar.a = uri;
            sjaVar.e = amjpVar;
            str5 = str2;
            sjaVar.f = str5;
            sjaVar.g = str3;
            sjaVar.h = str4;
            sjaVar.i = afawVar;
            sjaVar.c = 1;
            java.lang.Object objD = ((defpackage.tkl) obj3).d(sjaVar);
            if (objD != aoluVar) {
                obj2 = objD;
                afawVar2 = afawVar;
                str6 = str;
                amjpVar2 = amjpVar;
                str7 = str3;
                str8 = str4;
                obj = uri;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj2);
            return obj2;
        }
        afawVar2 = sjaVar.i;
        java.lang.String str9 = sjaVar.h;
        java.lang.String str10 = sjaVar.g;
        str5 = sjaVar.f;
        amjp amjpVar3 = sjaVar.e;
        obj = sjaVar.a;
        str6 = sjaVar.d;
        defpackage.aooc.af(obj2);
        str8 = str9;
        str7 = str10;
        amjpVar2 = amjpVar3;
        java.lang.String str11 = str5;
        shh shhVar = (defpackage.snl) obj2;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            throw new java.lang.IllegalStateException("createMccCallingCard requires CallingCardRepositoryWrapper.V2");
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        sjaVar.d = null;
        sjaVar.a = null;
        sjaVar.e = null;
        sjaVar.f = null;
        sjaVar.g = null;
        sjaVar.h = null;
        sjaVar.i = null;
        sjaVar.c = 2;
        java.lang.Object objAj = defpackage.aoov.aj(abvpVar.d, new abvn(abvpVar, (android.net.Uri) obj, afawVar2, str6, amjpVar2, str11, str7, str8, (defpackage.aoln) null), sjaVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object aE(java.lang.String str, java.lang.String str2, android.net.Uri uri, amjp amjpVar, java.lang.String str3, afaw afawVar, defpackage.aoln aolnVar) {
        sjb sjbVar;
        amjp amjpVar2;
        java.lang.String str4;
        afaw afawVar2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Object obj;
        if (aolnVar instanceof sjb) {
            sjbVar = (sjb) aolnVar;
            int i = sjbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjbVar.c = i - Integer.MIN_VALUE;
            } else {
                sjbVar = new sjb(this, aolnVar);
            }
        } else {
            sjbVar = new sjb(this, aolnVar);
        }
        java.lang.Object obj2 = sjbVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sjbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            java.lang.Object obj3 = this.a;
            sjbVar.d = str;
            sjbVar.e = str2;
            sjbVar.a = uri;
            sjbVar.f = amjpVar;
            sjbVar.g = str3;
            sjbVar.h = afawVar;
            sjbVar.c = 1;
            java.lang.Object objD = ((defpackage.tkl) obj3).d(sjbVar);
            if (objD != aoluVar) {
                amjpVar2 = amjpVar;
                str4 = str3;
                afawVar2 = afawVar;
                str5 = str;
                str6 = str2;
                obj = uri;
                obj2 = objD;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj2);
            return obj2;
        }
        afaw afawVar3 = sjbVar.h;
        java.lang.String str7 = sjbVar.g;
        amjp amjpVar3 = sjbVar.f;
        obj = sjbVar.a;
        str6 = sjbVar.e;
        str5 = sjbVar.d;
        defpackage.aooc.af(obj2);
        afawVar2 = afawVar3;
        str4 = str7;
        amjpVar2 = amjpVar3;
        shh shhVar = (defpackage.snl) obj2;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            throw new java.lang.IllegalStateException("createSelfMyCallingCard requires CallingCardRepositoryWrapper.V2");
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        abur aburVar = new abur(str5, str6, (java.lang.String) null);
        sjbVar.d = null;
        sjbVar.e = null;
        sjbVar.a = null;
        sjbVar.f = null;
        sjbVar.g = null;
        sjbVar.h = null;
        sjbVar.c = 2;
        java.lang.Object objAj = defpackage.aoov.aj(abvpVar.d, new abve(abvpVar, (android.net.Uri) obj, afawVar2, aburVar, amjpVar2, str4, (defpackage.aoln) null, 2), sjbVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, sdg] */
    public final java.lang.Object aF(java.lang.String str, defpackage.aoln aolnVar) {
        sdn sdnVar;
        if (aolnVar instanceof sdn) {
            sdnVar = (sdn) aolnVar;
            int i = sdnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdnVar.b = i - Integer.MIN_VALUE;
            } else {
                sdnVar = new sdn(this, aolnVar);
            }
        } else {
            sdnVar = new sdn(this, aolnVar);
        }
        java.lang.Object objB = sdnVar.a;
        java.lang.Object arrayList = defpackage.aolu.a;
        int i2 = sdnVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            ?? r4 = this.a;
            sdnVar.b = 1;
            objB = r4.b(str, sdnVar);
            if (objB != arrayList) {
            }
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objB);
        java.lang.Iterable iterable = (java.lang.Iterable) objB;
        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bp((sdl) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, sdg] */
    public final java.lang.Object aG(defpackage.aoln aolnVar) {
        sdo sdoVar;
        if (aolnVar instanceof sdo) {
            sdoVar = (sdo) aolnVar;
            int i = sdoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdoVar.b = i - Integer.MIN_VALUE;
            } else {
                sdoVar = new sdo(this, aolnVar);
            }
        } else {
            sdoVar = new sdo(this, aolnVar);
        }
        java.lang.Object objA = sdoVar.a;
        java.lang.Object arrayList = defpackage.aolu.a;
        int i2 = sdoVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            ?? r4 = this.a;
            sdoVar.b = 1;
            objA = r4.a(sdoVar);
            if (objA != arrayList) {
            }
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objA);
        java.lang.Iterable iterable = (java.lang.Iterable) objA;
        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(bp((sdl) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, sdg] */
    public final java.lang.Object aH(java.lang.String str, java.lang.String str2, scx scxVar, defpackage.aoln aolnVar) {
        sdp sdpVar;
        if (aolnVar instanceof sdp) {
            sdpVar = (sdp) aolnVar;
            int i = sdpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdpVar.b = i - Integer.MIN_VALUE;
            } else {
                sdpVar = new sdp(this, aolnVar);
            }
        } else {
            sdpVar = new sdp(this, aolnVar);
        }
        java.lang.Object objC = sdpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sdpVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            ?? r5 = this.a;
            j$.time.Instant instantNow = j$.time.Instant.now();
            defpackage.aooh.e(instantNow, "instant(...)");
            sdl sdlVar = new sdl(str, str2, scxVar, instantNow);
            sdpVar.b = 1;
            objC = r5.c(sdlVar, sdpVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
        }
        return java.lang.Boolean.valueOf(((java.lang.Number) objC).longValue() != -1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object aI(defpackage.aoln aolnVar) {
        scz sczVar;
        if (aolnVar instanceof scz) {
            sczVar = (scz) aolnVar;
            int i = sczVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sczVar.b = i - Integer.MIN_VALUE;
            } else {
                sczVar = new scz(this, aolnVar);
            }
        } else {
            sczVar = new scz(this, aolnVar);
        }
        java.lang.Object obj = sczVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sczVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r5 = this.a;
            bbf bbfVar = new bbf((defpackage.aoln) null, 11, (boolean[][]) null);
            sczVar.b = 1;
            if (r5.a(bbfVar, sczVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object aJ(defpackage.aoln aolnVar) {
        sda sdaVar;
        if (aolnVar instanceof sda) {
            sdaVar = (sda) aolnVar;
            int i = sdaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdaVar.b = i - Integer.MIN_VALUE;
            } else {
                sdaVar = new sda(this, aolnVar);
            }
        } else {
            sdaVar = new sda(this, aolnVar);
        }
        java.lang.Object objAu = sdaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sdaVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.aoxh aoxhVarB = this.a.b();
            sdaVar.b = 1;
            objAu = defpackage.aoov.au(aoxhVarB, sdaVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAu);
        }
        defpackage.sdc sdcVar = (defpackage.sdc) objAu;
        if (defpackage.aooh.n(sdcVar, defpackage.sdc.a)) {
            return null;
        }
        return sdcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object aK(defpackage.sdc sdcVar, defpackage.aoln aolnVar) {
        sdb sdbVar;
        if (aolnVar instanceof sdb) {
            sdbVar = (sdb) aolnVar;
            int i = sdbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdbVar.b = i - Integer.MIN_VALUE;
            } else {
                sdbVar = new sdb(this, aolnVar);
            }
        } else {
            sdbVar = new sdb(this, aolnVar);
        }
        java.lang.Object obj = sdbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sdbVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r4 = this.a;
            sfo sfoVar = new sfo(sdcVar, (defpackage.aoln) null, 1);
            sdbVar.b = 1;
            if (r4.a(sfoVar, sdbVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final android.content.Intent aL(rvq rvqVar) {
        android.content.Intent intent = new android.content.Intent((android.content.Context) this.a, (java.lang.Class<?>) com.android.dialer.multibindingsettings.impl.DialerSettingsActivity.class);
        akmr.t(intent, "extra_settings_launch_config", rvqVar);
        intent.setFlags(536870912);
        return intent;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ruc] */
    public final void aM(defpackage.aeun aeunVar, defpackage.aenj aenjVar) {
        defpackage.aooh.f(aeunVar, "timerEvent");
        this.a.p(aeunVar, aenjVar);
    }

    public final void aN(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            bq(defpackage.ruc.K);
            return;
        }
        if (i2 == 1) {
            bq(defpackage.ruc.L);
        } else if (i2 != 2) {
            bq(defpackage.ruc.N);
        } else {
            bq(defpackage.ruc.M);
        }
    }

    public final void aO(defpackage.aenj aenjVar, long j, long j2) {
        ((defpackage.aenl) this.a).d(aenjVar, j, j2);
    }

    public final /* synthetic */ defpackage.rtl aP() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.rtl) aladVarP;
    }

    public final void aQ(java.lang.String str, defpackage.rtk rtkVar) {
        defpackage.aooh.f(str, "key");
        defpackage.aooh.f(rtkVar, "value");
        j$.util.Objects.requireNonNull(str);
        j$.util.Objects.requireNonNull(rtkVar);
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rtl rtlVar = (defpackage.rtl) akzxVar.b;
        defpackage.rtl rtlVar2 = defpackage.rtl.a;
        defpackage.albe albeVar = rtlVar.b;
        if (!albeVar.b) {
            rtlVar.b = albeVar.a();
        }
        rtlVar.b.put(str, rtkVar);
    }

    public final /* synthetic */ void aR() {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.rtl) ((defpackage.akzx) this.a).b).b));
        defpackage.aooh.e(mapUnmodifiableMap, "getMarqueeKeyToInfoMap(...)");
        new alcv(mapUnmodifiableMap);
    }

    public final void aS() {
        ((defpackage.aogc) this.a).s(defpackage.ajcm.a, defpackage.rpl.a);
    }

    public final /* synthetic */ defpackage.rob aT() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.rob) aladVarP;
    }

    public final void aU(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rob robVar = (defpackage.rob) akzxVar.b;
        defpackage.rob robVar2 = defpackage.rob.a;
        robVar.f = z;
    }

    public final void aV(defpackage.roc rocVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rob robVar = (defpackage.rob) akzxVar.b;
        defpackage.rob robVar2 = defpackage.rob.a;
        robVar.c = rocVar.a();
    }

    public final void aW(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rob robVar = (defpackage.rob) akzxVar.b;
        defpackage.rob robVar2 = defpackage.rob.a;
        robVar.d = z;
    }

    public final /* synthetic */ defpackage.rny aX() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.rny) aladVarP;
    }

    public final void aY(defpackage.rnz rnzVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rny rnyVar = (defpackage.rny) akzxVar.b;
        defpackage.rny rnyVar2 = defpackage.rny.a;
        rnyVar.b = rnzVar.a();
    }

    public final void aZ(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rny rnyVar = (defpackage.rny) akzxVar.b;
        defpackage.rny rnyVar2 = defpackage.rny.a;
        rnyVar.d = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object aa(defpackage.dmp dmpVar) {
        if (dmpVar instanceof defpackage.dmc) {
            defpackage.dmc dmcVar = (defpackage.dmc) dmpVar;
            return dmcVar.a.a((android.content.Context) this.a, dmcVar);
        }
        if (!(dmpVar instanceof defpackage.dnh)) {
            return null;
        }
        defpackage.dnh dnhVar = (defpackage.dnh) dmpVar;
        int i = dnhVar.c;
        android.content.Context context = (android.content.Context) this.a;
        android.graphics.Typeface typefaceB = defpackage.dwk.b(context, dnhVar.a);
        if (typefaceB == null) {
            defpackage.aooh.g();
        }
        defpackage.dnb dnbVar = dnhVar.b;
        int i2 = defpackage.dni.a;
        return defpackage.dni.a(typefaceB, dnbVar, context);
    }

    public final defpackage.dpo ab() {
        return defpackage.cfd.C(((android.graphics.Region) this.a).getBounds());
    }

    public final void ac(defpackage.dpo dpoVar) {
        ((android.graphics.Region) this.a).set(dpoVar.b, dpoVar.c, dpoVar.d, dpoVar.e);
    }

    public final boolean ad() {
        return ((android.graphics.Region) this.a).isEmpty();
    }

    public final void ae(defpackage.dpo dpoVar) {
        ((android.graphics.Region) this.a).op(dpoVar.b, dpoVar.c, dpoVar.d, dpoVar.e, android.graphics.Region.Op.DIFFERENCE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ccp, java.lang.Object] */
    public final void af(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    public final void ag() {
        synchronized (this) {
            ((defpackage.aco) this.a).f();
        }
    }

    public final boolean aj(defpackage.ipc ipcVar) {
        java.lang.Object obj = this.a;
        return ((android.graphics.Region) obj).op((android.graphics.Region) ipcVar.a, android.graphics.Region.Op.INTERSECT);
    }

    public final /* synthetic */ defpackage.tch ak() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.tch) aladVarP;
    }

    public final void al(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.tch tchVar = (defpackage.tch) akzxVar.b;
        defpackage.tch tchVar2 = defpackage.tch.a;
        tchVar.b |= 2;
        tchVar.c = z;
    }

    public final void am(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.tch tchVar = (defpackage.tch) akzxVar.b;
        defpackage.tch tchVar2 = defpackage.tch.a;
        tchVar.b |= 4;
        tchVar.d = z;
    }

    public final void an() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.tch tchVar = (defpackage.tch) akzxVar.b;
        defpackage.tch tchVar2 = defpackage.tch.a;
        tchVar.b |= 8;
        tchVar.e = true;
    }

    public final void ao() {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.tch tchVar = (defpackage.tch) akzxVar.b;
        defpackage.tch tchVar2 = defpackage.tch.a;
        tchVar.b |= 16;
        tchVar.f = true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.CharSequence ap(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        ?? r3 = this.a;
        java.lang.String string = charSequence.toString();
        android.text.style.TtsSpan ttsSpanCreateTtsSpan = (android.text.style.TtsSpan) r3.get(string);
        if (ttsSpanCreateTtsSpan == null) {
            ttsSpanCreateTtsSpan = android.telephony.PhoneNumberUtils.createTtsSpan(string);
            r3.put(string, ttsSpanCreateTtsSpan);
        }
        android.text.Spannable spannableNewSpannable = android.text.Spannable.Factory.getInstance().newSpannable(charSequence);
        spannableNewSpannable.setSpan(ttsSpanCreateTtsSpan, 0, spannableNewSpannable.length(), 33);
        return spannableNewSpannable;
    }

    public final defpackage.aigf aq(defpackage.aigf aigfVar) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        defpackage.ailj it = aigfVar.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            hkd hkdVar = (hkd) entry.getKey();
            spe speVar = (spe) entry.getValue();
            defpackage.akzx akzxVarP = speVar.L();
            akzxVarP.u();
            akzxVarP.b.b = defpackage.albq.a;
            for (spd spdVar : speVar.b) {
                defpackage.akzx akzxVarP2 = spdVar.L();
                as(spdVar.i, spdVar.h, akzxVarP2);
                akzxVarP.P((spd) akzxVarP2.r());
            }
            aigbVar.i(hkdVar, akzxVarP.r());
        }
        return aigbVar.e(true);
    }

    public final java.lang.String ar() {
        return aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(((android.content.Context) this.a).getResources().getConfiguration()), 0).toLanguageTag();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.Object] */
    public final void as(int i, java.lang.String str, defpackage.akzx akzxVar) {
        j$.util.Optional optionalBU = defpackage.mni.bU(((android.content.Context) this.a).getResources(), i, str);
        rhb rhbVar = new rhb(akzxVar, 11);
        if (true == optionalBU.isPresent()) {
            ?? r0 = optionalBU.get();
            java.lang.Object obj = rhbVar.a;
            java.lang.String string = r0.toString();
            defpackage.akzx akzxVar2 = (defpackage.akzx) obj;
            akzxVar2.u();
            spd spdVar = akzxVar2.b;
            spd spdVar2 = spd.a;
            j$.util.Objects.requireNonNull(string);
            spdVar.b |= 32;
            spdVar.h = string;
        }
    }

    public final /* synthetic */ defpackage.sqd at() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.sqd) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object au(android.net.Uri uri, abuc abucVar, amjp amjpVar, afaw afawVar, defpackage.aoln aolnVar) {
        sir sirVar;
        java.lang.Object obj;
        java.lang.Object objD;
        abuc abucVar2;
        amjp amjpVar2;
        afaw afawVar2;
        if (aolnVar instanceof sir) {
            sirVar = (sir) aolnVar;
            int i = sirVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sirVar.c = i - Integer.MIN_VALUE;
            } else {
                sirVar = new sir(this, aolnVar);
            }
        } else {
            sirVar = new sir(this, aolnVar);
        }
        java.lang.Object obj2 = sirVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sirVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            java.lang.Object obj3 = this.a;
            obj = uri;
            sirVar.a = obj;
            sirVar.d = abucVar;
            sirVar.e = amjpVar;
            sirVar.f = afawVar;
            sirVar.c = 1;
            objD = ((defpackage.tkl) obj3).d(sirVar);
            if (objD != aoluVar) {
                abucVar2 = abucVar;
                amjpVar2 = amjpVar;
                afawVar2 = afawVar;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj2);
            return obj2;
        }
        afaw afawVar3 = sirVar.f;
        amjp amjpVar3 = sirVar.e;
        abuc abucVar3 = sirVar.d;
        java.lang.Object obj4 = sirVar.a;
        defpackage.aooc.af(obj2);
        afawVar2 = afawVar3;
        objD = obj2;
        amjpVar2 = amjpVar3;
        abucVar2 = abucVar3;
        obj = obj4;
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            defpackage.abvh abvhVar = ((defpackage.shg) shhVar).a;
            abup abupVar = abup.b;
            sirVar.a = null;
            sirVar.d = null;
            sirVar.e = null;
            sirVar.f = null;
            sirVar.c = 2;
            java.lang.Object objAj = defpackage.aoov.aj(abvhVar.d, new abve(abvhVar, (android.net.Uri) obj, afawVar2, abucVar2, abupVar, amjpVar2, (defpackage.aoln) null, 0), sirVar);
            if (objAj != aoluVar) {
                return objAj;
            }
        } else {
            if (iO != 1) {
                throw new defpackage.aois();
            }
            defpackage.abvp abvpVar = shhVar.a;
            sirVar.a = null;
            sirVar.d = null;
            sirVar.e = null;
            sirVar.f = null;
            sirVar.c = 3;
            java.lang.Object objAj2 = defpackage.aoov.aj(abvpVar.d, new uhy(abvpVar, (android.net.Uri) obj, afawVar2, amjpVar2, (defpackage.aoln) null, 4), sirVar);
            if (objAj2 != aoluVar) {
                return objAj2;
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r14 != r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object av(long[] r13, defpackage.aoln r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof sis
            if (r0 == 0) goto L13
            r0 = r14
            sis r0 = (sis) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            sis r0 = new sis
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aooc.af(r14)
            goto La4
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.aooc.af(r14)
            goto L9e
        L39:
            long[] r13 = r0.c
            defpackage.aooc.af(r14)
            goto L50
        L3f:
            defpackage.aooc.af(r14)
            java.lang.Object r12 = r12.a
            r0.c = r13
            r0.b = r5
            tkl r12 = (defpackage.tkl) r12
            java.lang.Object r14 = r12.d(r0)
            if (r14 == r1) goto La3
        L50:
            snl r14 = (defpackage.snl) r14
            int r12 = defpackage.snl.o(r14)
            r2 = 0
            if (r12 == 0) goto L81
            if (r12 != r5) goto L7b
            shh r14 = (shh) r14
            abvp r12 = r14.a
            java.util.ArrayList r14 = new java.util.ArrayList
            int r4 = r13.length
            r14.<init>(r5)
            r4 = 0
            r4 = r13[r4]
            abuu r13 = new abuu
            r13.<init>(r4)
            r14.add(r13)
            r0.c = r2
            r0.b = r3
            java.lang.Object r14 = r12.i(r14, r0)
            if (r14 != r1) goto La4
            goto La3
        L7b:
            aois r12 = new aois
            r12.<init>()
            throw r12
        L81:
            shg r14 = (defpackage.shg) r14
            abvh r8 = r14.a
            int r12 = r13.length
            long[] r7 = java.util.Arrays.copyOf(r13, r5)
            r0.c = r2
            r0.b = r4
            aolr r12 = r8.d
            abvg r6 = new abvg
            r10 = 1
            r11 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r14 = defpackage.aoov.aj(r12, r6, r0)
            if (r14 == r1) goto La3
        L9e:
            java.util.List r14 = defpackage.ajsz.aY(r14)
            goto La4
        La3:
            r14 = r1
        La4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipc.av(long[], aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final java.lang.Object aw(java.util.List list, defpackage.aoln aolnVar) {
        sit sitVar;
        ?? r9;
        abur abuvVar;
        if (aolnVar instanceof sit) {
            sitVar = (sit) aolnVar;
            int i = sitVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sitVar.c = i - Integer.MIN_VALUE;
            } else {
                sitVar = new sit(this, aolnVar);
            }
        } else {
            sitVar = new sit(this, aolnVar);
        }
        java.lang.Object objD = sitVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sitVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = this.a;
            sitVar.a = list;
            sitVar.c = 1;
            objD = ((defpackage.tkl) obj).d(sitVar);
            if (objD != aoluVar) {
            }
            r9 = list;
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        java.lang.Object obj2 = sitVar.a;
        defpackage.aooc.af(objD);
        r9 = obj2;
        r9 = list;
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            throw new java.lang.IllegalStateException("deleteMyCallingCard requires CallingCardRepositoryWrapper.V2");
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(r9, 10));
        for (sio sioVar : r9) {
            int iN = defpackage.snl.n(sioVar);
            if (iN == 0) {
                sip sipVar = (sip) sioVar;
                abuvVar = new abuv(sipVar.a, sipVar.b);
            } else {
                if (iN != 1) {
                    throw new defpackage.aois();
                }
                sio sioVar2 = sioVar;
                abuvVar = new abur(sioVar2.a, sioVar2.b, (java.lang.String) null);
            }
            arrayList.add(abuvVar);
        }
        sitVar.a = null;
        sitVar.c = 2;
        java.lang.Object objI = abvpVar.i(arrayList, sitVar);
        if (objI != aoluVar) {
            return objI;
        }
        r9 = list;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object ax(defpackage.aoln aolnVar) {
        siu siuVar;
        if (aolnVar instanceof siu) {
            siuVar = (siu) aolnVar;
            int i = siuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                siuVar.b = i - Integer.MIN_VALUE;
            } else {
                siuVar = new siu(this, aolnVar);
            }
        } else {
            siuVar = new siu(this, aolnVar);
        }
        java.lang.Object objD = siuVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = siuVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = this.a;
            siuVar.b = 1;
            objD = ((defpackage.tkl) obj).d(siuVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        defpackage.aooc.af(objD);
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            throw new java.lang.IllegalStateException("deleteSelfMyCallingCards requires CallingCardRepositoryWrapper.V2");
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        siuVar.b = 2;
        java.lang.Object objAj = defpackage.aoov.aj(abvpVar.d, new abgk(abvpVar, (defpackage.aoln) null, 20, (byte[]) null), siuVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r9 != r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ay(long[] r8, defpackage.aoln r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof siv
            if (r0 == 0) goto L13
            r0 = r9
            siv r0 = (siv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            siv r0 = new siv
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            aolu r1 = defpackage.aolu.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aooc.af(r9)
            goto La1
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.aooc.af(r9)
            goto L9b
        L39:
            long[] r8 = r0.c
            defpackage.aooc.af(r9)
            goto L50
        L3f:
            defpackage.aooc.af(r9)
            java.lang.Object r7 = r7.a
            r0.c = r8
            r0.b = r5
            tkl r7 = (defpackage.tkl) r7
            java.lang.Object r9 = r7.d(r0)
            if (r9 == r1) goto La0
        L50:
            snl r9 = (defpackage.snl) r9
            int r7 = defpackage.snl.o(r9)
            r2 = 0
            r6 = 0
            if (r7 == 0) goto L81
            if (r7 != r5) goto L7b
            shh r9 = (shh) r9
            abvp r7 = r9.a
            java.util.ArrayList r9 = new java.util.ArrayList
            int r4 = r8.length
            r9.<init>(r5)
            r4 = r8[r2]
            abuu r8 = new abuu
            r8.<init>(r4)
            r9.add(r8)
            r0.c = r6
            r0.b = r3
            java.lang.Object r9 = r7.j(r9, r0)
            if (r9 != r1) goto La1
            goto La0
        L7b:
            aois r7 = new aois
            r7.<init>()
            throw r7
        L81:
            shg r9 = (defpackage.shg) r9
            abvh r7 = r9.a
            int r9 = r8.length
            long[] r8 = java.util.Arrays.copyOf(r8, r5)
            r0.c = r6
            r0.b = r4
            aolr r9 = r7.d
            abvg r3 = new abvg
            r3.<init>(r8, r7, r6, r2)
            java.lang.Object r9 = defpackage.aoov.aj(r9, r3, r0)
            if (r9 == r1) goto La0
        L9b:
            java.util.List r9 = defpackage.ajsz.aY(r9)
            goto La1
        La0:
            r9 = r1
        La1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipc.ay(long[], aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object az(siq[] siqVarArr, defpackage.aoln aolnVar) {
        siw siwVar;
        abur abuvVar;
        if (aolnVar instanceof siw) {
            siwVar = (siw) aolnVar;
            int i = siwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                siwVar.b = i - Integer.MIN_VALUE;
            } else {
                siwVar = new siw(this, aolnVar);
            }
        } else {
            siwVar = new siw(this, aolnVar);
        }
        java.lang.Object objD = siwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = siwVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.lang.Object obj = this.a;
            siwVar.c = siqVarArr;
            siwVar.b = 1;
            objD = ((defpackage.tkl) obj).d(siwVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
            return objD;
        }
        siqVarArr = siwVar.c;
        defpackage.aooc.af(objD);
        shh shhVar = (defpackage.snl) objD;
        int iO = defpackage.snl.o(shhVar);
        if (iO == 0) {
            throw new java.lang.IllegalStateException("getMyCallingCard requires CallingCardRepositoryWrapper.V2");
        }
        if (iO != 1) {
            throw new defpackage.aois();
        }
        defpackage.abvp abvpVar = shhVar.a;
        int length = siqVarArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        siq siqVar = siqVarArr[0];
        int iN = defpackage.snl.n(siqVar);
        if (iN == 0) {
            sip sipVar = (sip) siqVar;
            abuvVar = new abuv(sipVar.a, sipVar.b);
        } else {
            if (iN != 1) {
                throw new defpackage.aois();
            }
            sio sioVar = (sio) siqVar;
            abuvVar = new abur(sioVar.a, sioVar.b, (java.lang.String) null);
        }
        arrayList.add(abuvVar);
        siwVar.c = null;
        siwVar.b = 2;
        java.lang.Object objJ = abvpVar.j(arrayList, siwVar);
        if (objJ != aoluVar) {
            return objJ;
        }
        return aoluVar;
    }

    public final /* synthetic */ defpackage.igf b() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.igf) aladVarP;
    }

    public final void ba(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rny rnyVar = (defpackage.rny) akzxVar.b;
        defpackage.rny rnyVar2 = defpackage.rny.a;
        rnyVar.e = i;
    }

    public final void bb(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.rny rnyVar = (defpackage.rny) akzxVar.b;
        defpackage.rny rnyVar2 = defpackage.rny.a;
        rnyVar.c = i;
    }

    public final android.content.Intent bc(int i) {
        android.content.Intent intent = new android.content.Intent("ACTION_SHOW_TAB");
        intent.setComponent(new android.content.ComponentName((android.content.Context) this.a, "com.android.dialer.main.impl.MainActivity"));
        intent.putExtra("EXTRA_SHOW_TAB", i);
        return intent;
    }

    public final defpackage.ampw bd() {
        defpackage.akzx akzxVarM = defpackage.ampw.a.m();
        if (akzxVarM == null) {
            defpackage.aooh.i("builder");
        }
        java.lang.Object obj = this.a;
        if (obj == null) {
            defpackage.aooh.i("value");
        }
        akzxVarM.u();
        defpackage.ampw ampwVar = (defpackage.ampw) akzxVarM.b;
        j$.util.Objects.requireNonNull(obj);
        ampwVar.b |= 1;
        ampwVar.c = (java.lang.String) obj;
        defpackage.akzm akzmVarBe = be();
        if (akzmVarBe == null) {
            defpackage.aooh.i("value");
        }
        akzxVarM.u();
        defpackage.ampw ampwVar2 = (defpackage.ampw) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarBe);
        ampwVar2.d = akzmVarBe;
        ampwVar2.b |= 2;
        defpackage.alad aladVarP = akzxVarM.r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.ampw) aladVarP;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final boolean bf() {
        java.lang.Object objA = this.a.a();
        defpackage.aooh.e(objA, "get(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    public final java.lang.Object bg(rim rimVar, defpackage.aoln aolnVar) {
        java.lang.Object objC = ((defpackage.rjb) this.a).c(rimVar, aolnVar);
        return objC != defpackage.aolu.a ? defpackage.aojh.a : objC;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq bh(java.io.InputStream inputStream, java.lang.String str) {
        return defpackage.ahvr.F(new qfb(str, inputStream, 9, (byte[]) null), this.a);
    }

    public final j$.util.Optional bj(qjd qjdVar) {
        j$.util.Optional optionalE = ((defpackage.zpm) this.a).e(qjdVar.b);
        return true == optionalE.isPresent() ? j$.util.Optional.ofNullable(((qkp) ((apqr) optionalE.get()).a(qkp.class)).al()) : optionalE;
    }

    public final android.content.Intent bk(otd otdVar) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        intent.setFlags(268697600);
        intent.setClass((android.content.Context) this.a, com.android.dialer.incall.activity.ui.InCallActivity.class);
        intent.putExtra("InCallActivity.show_dialpad", otdVar.a);
        intent.putExtra("InCallActivity.new_outgoing_call", otdVar.b);
        intent.putExtra("InCallActivity.for_full_screen", otdVar.c);
        intent.putExtra("InCallActivity.for_notification_button", otdVar.d);
        intent.putExtra("InCallActivity.for_notification_content", otdVar.e);
        intent.putExtra("InCallActivity.notification_model_priority", otdVar.f.m);
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(otdVar.h);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        orq orqVar = new orq(intent, 3);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj = optionalOfNullable.get();
            ((android.content.Intent) orqVar.a).putExtra("InCallActivity.callId", (java.lang.String) obj);
        }
        j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(otdVar.g);
        defpackage.aooh.e(optionalOfNullable2, "ofNullable(...)");
        orq orqVar2 = new orq(intent, 4);
        if (true == optionalOfNullable2.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable2.get();
            ((android.content.Intent) orqVar2.a).putExtra("InCallActivity.callee_id", ((abvz) obj2).i());
        }
        j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(otdVar.i);
        defpackage.aooh.e(optionalOfNullable3, "ofNullable(...)");
        orq orqVar3 = new orq(intent, 5);
        if (true == optionalOfNullable3.isPresent()) {
            java.lang.Object obj3 = optionalOfNullable3.get();
            ((android.content.Intent) orqVar3.a).putExtra("InCallActivity.outgoing_call_request_id", (java.lang.Long) obj3);
        }
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026a A[Catch: all -> 0x05dc, TryCatch #1 {, blocks: (B:4:0x0016, B:6:0x0043, B:15:0x005a, B:22:0x007f, B:19:0x0078, B:20:0x007d, B:11:0x0051, B:12:0x0056, B:23:0x0091, B:25:0x0097, B:27:0x009f, B:28:0x00a8, B:29:0x00b8, B:31:0x00ba, B:33:0x00c0, B:35:0x00cf, B:37:0x00e4, B:39:0x0109, B:40:0x0123, B:42:0x0125, B:44:0x012e, B:46:0x0134, B:47:0x0150, B:49:0x0152, B:51:0x0158, B:52:0x0174, B:54:0x0176, B:56:0x017a, B:67:0x01cb, B:68:0x01e0, B:57:0x0182, B:59:0x018a, B:61:0x01a3, B:62:0x01b2, B:64:0x01b6, B:66:0x01bc, B:70:0x01e2, B:72:0x01f0, B:74:0x01f6, B:76:0x01fc, B:77:0x01fe, B:82:0x0212, B:83:0x0217, B:90:0x023c, B:92:0x0242, B:93:0x0244, B:96:0x0255, B:101:0x026a, B:102:0x027d, B:97:0x025c, B:98:0x0261, B:99:0x0262, B:84:0x0218, B:87:0x0227, B:88:0x023a, B:85:0x021f, B:104:0x027f, B:106:0x0287, B:108:0x028e, B:110:0x02b0, B:113:0x02bb, B:115:0x02c1, B:117:0x02d0, B:119:0x031e, B:120:0x0324, B:121:0x032e, B:123:0x0336, B:125:0x0341, B:127:0x0349, B:128:0x034c, B:132:0x035b, B:134:0x0390, B:136:0x0396, B:141:0x03ac, B:143:0x03b8, B:145:0x03bc, B:146:0x03be, B:148:0x03c2, B:209:0x048c, B:210:0x049c, B:149:0x03cb, B:150:0x03d1, B:152:0x03d7, B:176:0x042a, B:180:0x0433, B:182:0x0437, B:184:0x043e, B:188:0x0449, B:190:0x0451, B:192:0x0458, B:208:0x047e, B:191:0x0456, B:183:0x043c, B:156:0x03ea, B:159:0x03f2, B:175:0x041a, B:213:0x04a2, B:214:0x04dd, B:216:0x04df, B:218:0x04e7, B:219:0x0503, B:221:0x0505, B:223:0x0519, B:225:0x0588, B:226:0x0593, B:224:0x0581, B:139:0x03a5, B:140:0x03aa, B:131:0x0354, B:111:0x02b7, B:107:0x028a, B:228:0x0595, B:229:0x05c0, B:36:0x00d2, B:231:0x05c2, B:232:0x05d9), top: B:240:0x0016, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0409  */
    /* JADX WARN: Code duplicated, block: B:202:0x046d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0242 A[Catch: all -> 0x05dc, TryCatch #1 {, blocks: (B:4:0x0016, B:6:0x0043, B:15:0x005a, B:22:0x007f, B:19:0x0078, B:20:0x007d, B:11:0x0051, B:12:0x0056, B:23:0x0091, B:25:0x0097, B:27:0x009f, B:28:0x00a8, B:29:0x00b8, B:31:0x00ba, B:33:0x00c0, B:35:0x00cf, B:37:0x00e4, B:39:0x0109, B:40:0x0123, B:42:0x0125, B:44:0x012e, B:46:0x0134, B:47:0x0150, B:49:0x0152, B:51:0x0158, B:52:0x0174, B:54:0x0176, B:56:0x017a, B:67:0x01cb, B:68:0x01e0, B:57:0x0182, B:59:0x018a, B:61:0x01a3, B:62:0x01b2, B:64:0x01b6, B:66:0x01bc, B:70:0x01e2, B:72:0x01f0, B:74:0x01f6, B:76:0x01fc, B:77:0x01fe, B:82:0x0212, B:83:0x0217, B:90:0x023c, B:92:0x0242, B:93:0x0244, B:96:0x0255, B:101:0x026a, B:102:0x027d, B:97:0x025c, B:98:0x0261, B:99:0x0262, B:84:0x0218, B:87:0x0227, B:88:0x023a, B:85:0x021f, B:104:0x027f, B:106:0x0287, B:108:0x028e, B:110:0x02b0, B:113:0x02bb, B:115:0x02c1, B:117:0x02d0, B:119:0x031e, B:120:0x0324, B:121:0x032e, B:123:0x0336, B:125:0x0341, B:127:0x0349, B:128:0x034c, B:132:0x035b, B:134:0x0390, B:136:0x0396, B:141:0x03ac, B:143:0x03b8, B:145:0x03bc, B:146:0x03be, B:148:0x03c2, B:209:0x048c, B:210:0x049c, B:149:0x03cb, B:150:0x03d1, B:152:0x03d7, B:176:0x042a, B:180:0x0433, B:182:0x0437, B:184:0x043e, B:188:0x0449, B:190:0x0451, B:192:0x0458, B:208:0x047e, B:191:0x0456, B:183:0x043c, B:156:0x03ea, B:159:0x03f2, B:175:0x041a, B:213:0x04a2, B:214:0x04dd, B:216:0x04df, B:218:0x04e7, B:219:0x0503, B:221:0x0505, B:223:0x0519, B:225:0x0588, B:226:0x0593, B:224:0x0581, B:139:0x03a5, B:140:0x03aa, B:131:0x0354, B:111:0x02b7, B:107:0x028a, B:228:0x0595, B:229:0x05c0, B:36:0x00d2, B:231:0x05c2, B:232:0x05d9), top: B:240:0x0016, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0253 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0255 A[Catch: all -> 0x05dc, TryCatch #1 {, blocks: (B:4:0x0016, B:6:0x0043, B:15:0x005a, B:22:0x007f, B:19:0x0078, B:20:0x007d, B:11:0x0051, B:12:0x0056, B:23:0x0091, B:25:0x0097, B:27:0x009f, B:28:0x00a8, B:29:0x00b8, B:31:0x00ba, B:33:0x00c0, B:35:0x00cf, B:37:0x00e4, B:39:0x0109, B:40:0x0123, B:42:0x0125, B:44:0x012e, B:46:0x0134, B:47:0x0150, B:49:0x0152, B:51:0x0158, B:52:0x0174, B:54:0x0176, B:56:0x017a, B:67:0x01cb, B:68:0x01e0, B:57:0x0182, B:59:0x018a, B:61:0x01a3, B:62:0x01b2, B:64:0x01b6, B:66:0x01bc, B:70:0x01e2, B:72:0x01f0, B:74:0x01f6, B:76:0x01fc, B:77:0x01fe, B:82:0x0212, B:83:0x0217, B:90:0x023c, B:92:0x0242, B:93:0x0244, B:96:0x0255, B:101:0x026a, B:102:0x027d, B:97:0x025c, B:98:0x0261, B:99:0x0262, B:84:0x0218, B:87:0x0227, B:88:0x023a, B:85:0x021f, B:104:0x027f, B:106:0x0287, B:108:0x028e, B:110:0x02b0, B:113:0x02bb, B:115:0x02c1, B:117:0x02d0, B:119:0x031e, B:120:0x0324, B:121:0x032e, B:123:0x0336, B:125:0x0341, B:127:0x0349, B:128:0x034c, B:132:0x035b, B:134:0x0390, B:136:0x0396, B:141:0x03ac, B:143:0x03b8, B:145:0x03bc, B:146:0x03be, B:148:0x03c2, B:209:0x048c, B:210:0x049c, B:149:0x03cb, B:150:0x03d1, B:152:0x03d7, B:176:0x042a, B:180:0x0433, B:182:0x0437, B:184:0x043e, B:188:0x0449, B:190:0x0451, B:192:0x0458, B:208:0x047e, B:191:0x0456, B:183:0x043c, B:156:0x03ea, B:159:0x03f2, B:175:0x041a, B:213:0x04a2, B:214:0x04dd, B:216:0x04df, B:218:0x04e7, B:219:0x0503, B:221:0x0505, B:223:0x0519, B:225:0x0588, B:226:0x0593, B:224:0x0581, B:139:0x03a5, B:140:0x03aa, B:131:0x0354, B:111:0x02b7, B:107:0x028a, B:228:0x0595, B:229:0x05c0, B:36:0x00d2, B:231:0x05c2, B:232:0x05d9), top: B:240:0x0016, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x025c A[Catch: all -> 0x05dc, TryCatch #1 {, blocks: (B:4:0x0016, B:6:0x0043, B:15:0x005a, B:22:0x007f, B:19:0x0078, B:20:0x007d, B:11:0x0051, B:12:0x0056, B:23:0x0091, B:25:0x0097, B:27:0x009f, B:28:0x00a8, B:29:0x00b8, B:31:0x00ba, B:33:0x00c0, B:35:0x00cf, B:37:0x00e4, B:39:0x0109, B:40:0x0123, B:42:0x0125, B:44:0x012e, B:46:0x0134, B:47:0x0150, B:49:0x0152, B:51:0x0158, B:52:0x0174, B:54:0x0176, B:56:0x017a, B:67:0x01cb, B:68:0x01e0, B:57:0x0182, B:59:0x018a, B:61:0x01a3, B:62:0x01b2, B:64:0x01b6, B:66:0x01bc, B:70:0x01e2, B:72:0x01f0, B:74:0x01f6, B:76:0x01fc, B:77:0x01fe, B:82:0x0212, B:83:0x0217, B:90:0x023c, B:92:0x0242, B:93:0x0244, B:96:0x0255, B:101:0x026a, B:102:0x027d, B:97:0x025c, B:98:0x0261, B:99:0x0262, B:84:0x0218, B:87:0x0227, B:88:0x023a, B:85:0x021f, B:104:0x027f, B:106:0x0287, B:108:0x028e, B:110:0x02b0, B:113:0x02bb, B:115:0x02c1, B:117:0x02d0, B:119:0x031e, B:120:0x0324, B:121:0x032e, B:123:0x0336, B:125:0x0341, B:127:0x0349, B:128:0x034c, B:132:0x035b, B:134:0x0390, B:136:0x0396, B:141:0x03ac, B:143:0x03b8, B:145:0x03bc, B:146:0x03be, B:148:0x03c2, B:209:0x048c, B:210:0x049c, B:149:0x03cb, B:150:0x03d1, B:152:0x03d7, B:176:0x042a, B:180:0x0433, B:182:0x0437, B:184:0x043e, B:188:0x0449, B:190:0x0451, B:192:0x0458, B:208:0x047e, B:191:0x0456, B:183:0x043c, B:156:0x03ea, B:159:0x03f2, B:175:0x041a, B:213:0x04a2, B:214:0x04dd, B:216:0x04df, B:218:0x04e7, B:219:0x0503, B:221:0x0505, B:223:0x0519, B:225:0x0588, B:226:0x0593, B:224:0x0581, B:139:0x03a5, B:140:0x03aa, B:131:0x0354, B:111:0x02b7, B:107:0x028a, B:228:0x0595, B:229:0x05c0, B:36:0x00d2, B:231:0x05c2, B:232:0x05d9), top: B:240:0x0016, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0262 A[Catch: all -> 0x05dc, TryCatch #1 {, blocks: (B:4:0x0016, B:6:0x0043, B:15:0x005a, B:22:0x007f, B:19:0x0078, B:20:0x007d, B:11:0x0051, B:12:0x0056, B:23:0x0091, B:25:0x0097, B:27:0x009f, B:28:0x00a8, B:29:0x00b8, B:31:0x00ba, B:33:0x00c0, B:35:0x00cf, B:37:0x00e4, B:39:0x0109, B:40:0x0123, B:42:0x0125, B:44:0x012e, B:46:0x0134, B:47:0x0150, B:49:0x0152, B:51:0x0158, B:52:0x0174, B:54:0x0176, B:56:0x017a, B:67:0x01cb, B:68:0x01e0, B:57:0x0182, B:59:0x018a, B:61:0x01a3, B:62:0x01b2, B:64:0x01b6, B:66:0x01bc, B:70:0x01e2, B:72:0x01f0, B:74:0x01f6, B:76:0x01fc, B:77:0x01fe, B:82:0x0212, B:83:0x0217, B:90:0x023c, B:92:0x0242, B:93:0x0244, B:96:0x0255, B:101:0x026a, B:102:0x027d, B:97:0x025c, B:98:0x0261, B:99:0x0262, B:84:0x0218, B:87:0x0227, B:88:0x023a, B:85:0x021f, B:104:0x027f, B:106:0x0287, B:108:0x028e, B:110:0x02b0, B:113:0x02bb, B:115:0x02c1, B:117:0x02d0, B:119:0x031e, B:120:0x0324, B:121:0x032e, B:123:0x0336, B:125:0x0341, B:127:0x0349, B:128:0x034c, B:132:0x035b, B:134:0x0390, B:136:0x0396, B:141:0x03ac, B:143:0x03b8, B:145:0x03bc, B:146:0x03be, B:148:0x03c2, B:209:0x048c, B:210:0x049c, B:149:0x03cb, B:150:0x03d1, B:152:0x03d7, B:176:0x042a, B:180:0x0433, B:182:0x0437, B:184:0x043e, B:188:0x0449, B:190:0x0451, B:192:0x0458, B:208:0x047e, B:191:0x0456, B:183:0x043c, B:156:0x03ea, B:159:0x03f2, B:175:0x041a, B:213:0x04a2, B:214:0x04dd, B:216:0x04df, B:218:0x04e7, B:219:0x0503, B:221:0x0505, B:223:0x0519, B:225:0x0588, B:226:0x0593, B:224:0x0581, B:139:0x03a5, B:140:0x03aa, B:131:0x0354, B:111:0x02b7, B:107:0x028a, B:228:0x0595, B:229:0x05c0, B:36:0x00d2, B:231:0x05c2, B:232:0x05d9), top: B:240:0x0016, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [amwu, java.lang.Object] */
    public final void bl(afjb afjbVar) {
        long jLongValue;
        int iAb;
        java.lang.String str;
        java.lang.String str2;
        boolean zContains;
        amhz amhzVar;
        defpackage.alam alamVar;
        int iOrdinal;
        boolean zContains2;
        int i;
        int i2;
        afjh afjhVar = afjh.a;
        defpackage.apdh apdhVar = new defpackage.apdh();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = afjh.b;
        synchronized (atomicBoolean) {
            defpackage.akzx akzxVarM = algv.a.m();
            afjbVar.c.intValue();
            akzxVarM.u();
            algv algvVar = akzxVarM.b;
            int i3 = 1;
            algvVar.b |= 1;
            algvVar.c = 340;
            defpackage.aehj aehjVar = afjy.c;
            if (afjy.c(anlf.c(afjy.b))) {
                int iOrdinal2 = afjbVar.g.ordinal();
                if (iOrdinal2 == 0) {
                    i = 3;
                } else if (iOrdinal2 == 1) {
                    i = 4;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    i = 2;
                }
                akzxVarM.u();
                algv algvVar2 = akzxVarM.b;
                algvVar2.e = defpackage.a.T(i);
                algvVar2.b |= 2;
                int iOrdinal3 = afjbVar.f.ordinal();
                if (iOrdinal3 == 0) {
                    i2 = 4;
                } else {
                    if (iOrdinal3 != 1) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    i2 = 3;
                }
                akzxVarM.u();
                algv algvVar3 = akzxVarM.b;
                algvVar3.f = defpackage.a.T(i2);
                algvVar3.b |= 4;
            }
            if (atomicBoolean.get()) {
                long j = afjz.a;
                com.google.android.libraries.surveys.SurveyData surveyData = afjbVar.d;
                if (surveyData instanceof com.google.android.libraries.surveys.internal.model.SurveyDataImpl) {
                    defpackage.gus.af(surveyData.a(), afiy.h);
                }
                akzxVarM.aK(algu.j);
                afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                return;
            }
            com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImpl = afjbVar.d;
            if (!(surveyDataImpl instanceof com.google.android.libraries.surveys.internal.model.SurveyDataImpl)) {
                akzxVarM.aK(algu.h);
                afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                throw new java.lang.IllegalArgumentException("Survey data is not the correct type.");
            }
            com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImpl2 = surveyDataImpl;
            afjhVar.d = surveyDataImpl2;
            afjk afjkVar = afjk.b;
            afji afjiVar = afjhVar.c;
            if (surveyDataImpl2.b() == null) {
                long j2 = afjz.a;
            } else {
                afjiVar.d.put(surveyDataImpl2.b(), surveyDataImpl2);
                afjiVar.e.put(surveyDataImpl2.b(), afjkVar);
            }
            java.lang.String strB = surveyDataImpl2.b();
            defpackage.gus gusVar = afjbVar.h;
            afjiVar.f.put(strB, gusVar);
            afjhVar.l = gusVar;
            android.app.Activity activity = afjbVar.a;
            defpackage.aazc aazcVar = afjhVar.k;
            long j3 = surveyDataImpl2.e;
            long j4 = afjz.a;
            if (j$.time.Instant.now().toEpochMilli() - j3 > afjz.a) {
                android.util.Log.w("SurveyController", "Cancelling show request since SurveyData was expired.");
                afjhVar.c(afiy.i, surveyDataImpl2);
                akzxVarM.aK(algu.k);
                afjhVar.d(akzxVarM.r(), apdhVar, activity);
                return;
            }
            activity.getPackageName();
            if (afjhVar.i > j3) {
                defpackage.aehj aehjVar2 = afjy.c;
                afjy.c(anli.a.b().a(afjy.b));
                android.util.Log.w("SurveyController", "Cancelling show request since SurveyData was older than oldest valid trigger request.");
                afjhVar.c(afiy.i, surveyDataImpl2);
                akzxVarM.aK(algu.k);
                afjhVar.d(akzxVarM.r(), apdhVar, activity);
                return;
            }
            if (activity.isFinishing()) {
                android.util.Log.w("SurveyController", "Cancelling show request since activity was finishing.");
                afjhVar.c(afiy.b, surveyDataImpl2);
                akzxVarM.aK(algu.c);
                afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                return;
            }
            if (activity.isDestroyed()) {
                android.util.Log.w("SurveyController", "Cancelling show request since activity was destroyed.");
                afjhVar.c(afiy.a, surveyDataImpl2);
                akzxVarM.aK(algu.b);
                afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                return;
            }
            amip amipVar = surveyDataImpl2.b;
            if (amipVar == null) {
                android.util.Log.w("SurveyController", "Survey payload was null.");
            } else {
                if (amipVar.g.size() != 0) {
                    defpackage.aehj aehjVar3 = afjy.c;
                    if (afjy.c(anlf.c(afjy.b)) && !afjz.m(activity)) {
                        afiz afizVar = afjbVar.g;
                        amhw amhwVar = amipVar.d;
                        if (amhwVar == null) {
                            amhwVar = amhw.b;
                        }
                        defpackage.alam alamVar2 = new defpackage.alam(amhwVar.f, amhw.a);
                        int iOrdinal4 = afizVar.ordinal();
                        if (iOrdinal4 != 0) {
                            if (iOrdinal4 == 1) {
                                zContains = alamVar2.contains(amhv.c);
                            } else if (iOrdinal4 != 2) {
                                throw new java.lang.RuntimeException(null, null);
                            }
                            afja afjaVar = afjbVar.f;
                            amhzVar = amipVar.e;
                            if (amhzVar == null) {
                                amhzVar = amhz.b;
                            }
                            alamVar = new defpackage.alam(amhzVar.f, amhz.a);
                            iOrdinal = afjaVar.ordinal();
                            if (iOrdinal != 0) {
                                zContains2 = alamVar.contains(amhy.c);
                            } else {
                                if (iOrdinal == 1) {
                                    throw new java.lang.RuntimeException(null, null);
                                }
                                zContains2 = alamVar.contains(amhy.b);
                            }
                            if (!zContains2) {
                                afjhVar.c(afiy.e, surveyDataImpl2);
                                akzxVarM.aK(algu.g);
                                afjhVar.d(akzxVarM.r(), apdhVar, activity);
                                return;
                            }
                        } else {
                            zContains = alamVar2.contains(amhv.b);
                        }
                        if (!zContains) {
                            afjhVar.c(afiy.d, surveyDataImpl2);
                            akzxVarM.aK(algu.f);
                            afjhVar.d(akzxVarM.r(), apdhVar, activity);
                            return;
                        }
                        afja afjaVar2 = afjbVar.f;
                        amhzVar = amipVar.e;
                        if (amhzVar == null) {
                            amhzVar = amhz.b;
                        }
                        alamVar = new defpackage.alam(amhzVar.f, amhz.a);
                        iOrdinal = afjaVar2.ordinal();
                        if (iOrdinal != 0) {
                            zContains2 = alamVar.contains(amhy.c);
                        } else {
                            if (iOrdinal == 1) {
                                throw new java.lang.RuntimeException(null, null);
                            }
                            zContains2 = alamVar.contains(amhy.b);
                        }
                        if (!zContains2) {
                            afjhVar.c(afiy.e, surveyDataImpl2);
                            akzxVarM.aK(algu.g);
                            afjhVar.d(akzxVarM.r(), apdhVar, activity);
                            return;
                        }
                    }
                    afjhVar.e = "";
                    java.util.List list = afjbVar.e;
                    afjhVar.f = list == null ? defpackage.aike.a : defpackage.aify.n(list);
                    java.lang.String strB2 = surveyDataImpl2.b();
                    defpackage.aify aifyVar = afjhVar.f;
                    java.util.Map map = afjiVar.b;
                    map.put(strB2, aifyVar);
                    java.lang.String str3 = surveyDataImpl2.a;
                    java.lang.String strB3 = surveyDataImpl2.b();
                    android.os.Parcelable answer = new com.google.android.libraries.surveys.internal.model.Answer();
                    ((com.google.android.libraries.surveys.internal.model.Answer) answer).b = afjhVar.e;
                    defpackage.aify aifyVar2 = afjy.d() ? (defpackage.aify) map.get(strB3) : afjhVar.f;
                    if (aifyVar2 != null && !aifyVar2.isEmpty()) {
                        defpackage.akzx akzxVarM2 = amis.a.m();
                        int size = aifyVar2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            defpackage.dxy dxyVar = (defpackage.dxy) aifyVar2.get(i4);
                            defpackage.akzx akzxVarM3 = amir.a.m();
                            defpackage.aify aifyVar3 = aifyVar2;
                            java.lang.Object obj = dxyVar.a;
                            akzxVarM3.u();
                            amir amirVar = akzxVarM3.b;
                            j$.util.Objects.requireNonNull(obj);
                            int i5 = i4;
                            amirVar.b = (java.lang.String) obj;
                            java.lang.String str4 = (java.lang.String) dxyVar.b;
                            akzxVarM3.u();
                            amir amirVar2 = akzxVarM3.b;
                            j$.util.Objects.requireNonNull(str4);
                            amirVar2.c = str4;
                            amir amirVarP = akzxVarM3.r();
                            akzxVarM2.u();
                            amis amisVar = akzxVarM2.b;
                            j$.util.Objects.requireNonNull(amirVarP);
                            defpackage.alat alatVar = amisVar.b;
                            if (!alatVar.c()) {
                                amisVar.b = defpackage.alad.J(alatVar);
                            }
                            amisVar.b.add(amirVarP);
                            i4 = i5 + 1;
                            aifyVar2 = aifyVar3;
                        }
                        android.content.pm.PackageManager packageManager = activity.getPackageManager();
                        java.lang.String string = "Unknown";
                        if (packageManager != null) {
                            try {
                                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0);
                                if (packageInfo != null) {
                                    string = !android.text.TextUtils.isEmpty(packageInfo.versionName) ? packageInfo.versionName : java.lang.Integer.toString(packageInfo.versionCode);
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                                android.util.Log.e("SurveyUtils", "Exception while retrieving application information.", e);
                            }
                        }
                        defpackage.akzx akzxVarM4 = amit.a.m();
                        amis amisVarP = akzxVarM2.r();
                        akzxVarM4.u();
                        amit amitVar = akzxVarM4.b;
                        j$.util.Objects.requireNonNull(amisVarP);
                        amitVar.c = amisVarP;
                        amitVar.b |= 1;
                        akzxVarM4.u();
                        amit amitVar2 = akzxVarM4.b;
                        j$.util.Objects.requireNonNull(string);
                        amitVar2.d = string;
                        ((com.google.android.libraries.surveys.internal.model.Answer) answer).c = akzxVarM4.r();
                    }
                    if (afjy.d()) {
                        java.lang.Long l = (java.lang.Long) afjhVar.c.c.get(str3);
                        jLongValue = l == null ? 0L : l.longValue();
                    } else {
                        jLongValue = afjhVar.g;
                    }
                    ((com.google.android.libraries.surveys.internal.model.Answer) answer).d = jLongValue;
                    ((com.google.android.libraries.surveys.internal.model.Answer) answer).f = afjhVar.h;
                    if (!afjz.m(activity)) {
                        int i6 = afjbVar.b;
                        if (activity.findViewById(i6) == null) {
                            android.util.Log.w("SurveyController", "Cancelling show request since parent view was not found.");
                            afjhVar.c(afiy.k, surveyDataImpl2);
                            akzxVarM.aK(algu.l);
                            afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                            return;
                        }
                        afjh.b();
                        java.lang.String str5 = afjhVar.j;
                        defpackage.bo boVarA = ((defpackage.az) activity).a();
                        if (boVarA.e("com.google.android.libraries.surveys.internal.PromptDialogFragment") == null) {
                            java.lang.String str6 = surveyDataImpl2.a;
                            amje amjeVar = surveyDataImpl2.c;
                            java.io.Serializable serializable = afjbVar.g;
                            java.io.Serializable serializable2 = afjbVar.f;
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("TriggerId", str6);
                            bundle.putByteArray("SurveyPayload", amipVar.i());
                            bundle.putByteArray("SurveySession", amjeVar.i());
                            bundle.putParcelable("Answer", answer);
                            bundle.putInt("LogoResId", 0);
                            bundle.putSerializable("SurveyCompletionCode", serializable);
                            bundle.putSerializable("SurveyPromptCode", serializable2);
                            bundle.putString("SurveyActivityClassName", str5);
                            bundle.putBoolean("keepNextButtonForLastQuestion", false);
                            bundle.putBoolean("isCarDisplayFullyReachable", true);
                            bundle.putBoolean("isCarDisplayRightOfUser", true);
                            defpackage.aw awVarF = defpackage.aw.F(activity, "com.google.android.libraries.surveys.internal.view.PromptDialogFragment", bundle);
                            defpackage.u uVar = new defpackage.u(boVarA);
                            uVar.q(i6, awVarF, "com.google.android.libraries.surveys.internal.PromptDialogFragment");
                            uVar.i(true, true);
                        } else {
                            android.util.Log.w("SurveyNavigator", "PromptDialog was already open, bailing out.");
                        }
                        afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                        return;
                    }
                    amil amilVar = amipVar.c;
                    if (amilVar == null) {
                        amilVar = amil.a;
                    }
                    if (amilVar.b) {
                        android.util.Log.e("WearPayloadValidator", "Invitation card is not supported for wear surveys.");
                    } else {
                        java.util.Iterator it = amipVar.g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                afjh.b();
                                java.lang.String str7 = surveyDataImpl2.a;
                                amje amjeVar2 = surveyDataImpl2.c;
                                android.content.Intent intent = new android.content.Intent();
                                intent.setClassName(activity, "com.google.android.libraries.surveys.internal.wear.view.SurveyWearActivity");
                                intent.putExtra("TriggerId", str7);
                                intent.putExtra("SurveyPayload", amipVar.i());
                                intent.putExtra("SurveySession", amjeVar2.i());
                                intent.putExtra("Answer", answer);
                                activity.startActivity(intent);
                                afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                                return;
                            }
                            amiv amivVar = (amiv) it.next();
                            int i7 = amivVar.i;
                            int iAb2 = defpackage.a.ab(i7);
                            if ((iAb2 == 0 || iAb2 != 3) && ((iAb = defpackage.a.ab(i7)) == 0 || iAb != 5)) {
                                int iAb3 = defpackage.a.ab(i7);
                                if (iAb3 == 0) {
                                    str = "UNRECOGNIZED";
                                } else if (iAb3 == 2) {
                                    str = "QUESTION_TYPE_UNKNOWN";
                                } else if (iAb3 == 3) {
                                    str = "QUESTION_TYPE_SINGLE_SELECT";
                                } else if (iAb3 == 4) {
                                    str = "QUESTION_TYPE_MULTI_SELECT";
                                } else if (iAb3 == 5) {
                                    str = "QUESTION_TYPE_RATING";
                                } else if (iAb3 != 6) {
                                    str = "UNRECOGNIZED";
                                } else {
                                    str = "QUESTION_TYPE_OPEN_TEXT";
                                }
                                java.lang.Object[] objArr = new java.lang.Object[i3];
                                objArr[0] = str;
                                android.util.Log.e("WearPayloadValidator", java.lang.String.format("Question type %s is not supported for wear surveys.", objArr));
                                break;
                            }
                            int iAb4 = defpackage.a.ab(i7);
                            if (iAb4 == 0) {
                                iAb4 = 1;
                            }
                            if (iAb4 == 5) {
                                int iAb5 = defpackage.a.ab((amivVar.c == 6 ? (amix) amivVar.d : amix.a).b);
                                if (iAb5 == 0) {
                                    iAb5 = 1;
                                }
                                if (iAb5 != 6) {
                                    int iAb6 = defpackage.a.ab((amivVar.c == 6 ? (amix) amivVar.d : amix.a).b);
                                    if (iAb6 == 0) {
                                        str2 = "UNRECOGNIZED";
                                    } else if (iAb6 == 2) {
                                        str2 = "RATING_TYPE_UNKNOWN";
                                    } else if (iAb6 == 3) {
                                        str2 = "RATING_TYPE_SMILEYS";
                                    } else if (iAb6 == 4) {
                                        str2 = "RATING_TYPE_STARS";
                                    } else if (iAb6 == 5) {
                                        str2 = "RATING_TYPE_NUMBERS";
                                    } else if (iAb6 != 6) {
                                        str2 = "UNRECOGNIZED";
                                    } else {
                                        str2 = "RATING_TYPE_THUMBS_UP_THUMBS_DOWN";
                                    }
                                    android.util.Log.e("WearPayloadValidator", java.lang.String.format("Rating type %s is not supported for wear surveys.", str2));
                                    break;
                                }
                            }
                            i3 = 1;
                        }
                    }
                    akzxVarM.aK(algu.i);
                    afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
                    return;
                }
                android.util.Log.w("SurveyController", "Survey contains no questions. Survey trigger id: ".concat(java.lang.String.valueOf(surveyDataImpl2.a)));
                java.lang.String str8 = surveyDataImpl2.d;
                if (!android.text.TextUtils.isEmpty(str8)) {
                    android.util.Log.w("SurveyController", "No survey available reason: ".concat(java.lang.String.valueOf(str8)));
                }
                defpackage.aify aifyVar4 = surveyDataImpl2.f;
                if (aifyVar4 != null && !aifyVar4.isEmpty()) {
                    android.util.Log.w("SurveyController", "Backend errors are: ".concat(aifyVar4.toString()));
                }
            }
            afjhVar.c(afiy.g, surveyDataImpl2);
            akzxVarM.aK(algu.i);
            afjhVar.d(akzxVarM.r(), apdhVar, afjbVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ajct, java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [aduj, java.lang.Object] */
    public final void bm(defpackage.rmu rmuVar) {
        if (rmuVar == null) {
            defpackage.aooh.i("event");
        }
        java.lang.Object obj = this.a;
        defpackage.akzx akzxVarM = defpackage.akiq.a.m();
        akzxVarM.u();
        defpackage.akiq akiqVar = (defpackage.akiq) akzxVarM.b;
        akiqVar.b |= 1;
        akiqVar.c = 176;
        akzxVarM.u();
        defpackage.akiq akiqVar2 = (defpackage.akiq) akzxVarM.b;
        akiqVar2.b |= 2;
        akiqVar2.d = rmuVar.W;
        defpackage.ahbq ahbqVar = (defpackage.ahbq) obj;
        java.lang.String strA = defpackage.akhr.a((java.lang.String) ahbqVar.a, defpackage.akhr.a);
        akzxVarM.u();
        defpackage.akiq akiqVar3 = (defpackage.akiq) akzxVarM.b;
        j$.util.Objects.requireNonNull(strA);
        akiqVar3.b |= 4;
        akiqVar3.e = strA;
        defpackage.akiq akiqVar4 = (defpackage.akiq) akzxVarM.r();
        java.lang.Object obj2 = ahbqVar.b;
        j$.util.Objects.requireNonNull(obj2);
        defpackage.vcz vczVar = new defpackage.vcz(obj2, 4);
        ?? r0 = ahbqVar.d;
        defpackage.ajck.w(defpackage.ajck.w(r0.submit(vczVar)).y(ahbqVar.c.c(new defpackage.vmn(akiqVar4, 10)), r0)).x(new defpackage.kvf(14), r0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final opk bn(int i, float f) {
        android.content.Context context = (android.content.Context) this.a.a();
        context.getClass();
        return new opk(context, i, f);
    }

    public final void c(defpackage.ifz ifzVar) {
        if (ifzVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.igf igfVar = (defpackage.igf) akzxVar.b;
        defpackage.igf igfVar2 = defpackage.igf.a;
        j$.util.Objects.requireNonNull(ifzVar);
        igfVar.e = ifzVar;
        igfVar.b |= 2;
    }

    public final void d(defpackage.ige igeVar) {
        if (igeVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.igf igfVar = (defpackage.igf) akzxVar.b;
        defpackage.igf igfVar2 = defpackage.igf.a;
        j$.util.Objects.requireNonNull(igeVar);
        igfVar.d = igeVar;
        igfVar.b |= 1;
    }

    public final void e(defpackage.igs igsVar) {
        defpackage.aooh.f(igsVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.igf igfVar = (defpackage.igf) akzxVar.b;
        defpackage.igf igfVar2 = defpackage.igf.a;
        j$.util.Objects.requireNonNull(igsVar);
        igfVar.f = igsVar;
        igfVar.b |= 4;
    }

    public final void f(defpackage.igj igjVar) {
        defpackage.aooh.f(igjVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.igf igfVar = (defpackage.igf) akzxVar.b;
        defpackage.igf igfVar2 = defpackage.igf.a;
        j$.util.Objects.requireNonNull(igjVar);
        igfVar.g = igjVar;
        igfVar.b |= 8;
    }

    public final void g(defpackage.ifv ifvVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.igf igfVar = (defpackage.igf) akzxVar.b;
        defpackage.igf igfVar2 = defpackage.igf.a;
        igfVar.c = ifvVar.a();
    }

    public final /* synthetic */ defpackage.ige h() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.ige) aladVarP;
    }

    public final void i(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.ige igeVar = (defpackage.ige) akzxVar.b;
        defpackage.ige igeVar2 = defpackage.ige.a;
        igeVar.b = i - 2;
    }

    public final /* synthetic */ defpackage.ifz j() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.ifz) aladVarP;
    }

    public final void k(defpackage.ify ifyVar) {
        if (ifyVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.ifz ifzVar = (defpackage.ifz) akzxVar.b;
        defpackage.ifz ifzVar2 = defpackage.ifz.a;
        j$.util.Objects.requireNonNull(ifyVar);
        ifzVar.c = ifyVar;
        ifzVar.b |= 1;
    }

    public final /* synthetic */ defpackage.ify l() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.ify) aladVarP;
    }

    public final void m(defpackage.ifx ifxVar) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.ify ifyVar = (defpackage.ify) akzxVar.b;
        defpackage.ify ifyVar2 = defpackage.ify.a;
        ifyVar.b = ifxVar.a();
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq n(idt idtVar, defpackage.akzc akzcVar) {
        j$.util.Optional optionalOfNullable;
        int i = idtVar.c;
        int i2 = 3;
        if (i != 0) {
            if (i != 2) {
                i2 = i != 3 ? 0 : 2;
            } else {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            optionalOfNullable = i3 != 1 ? j$.util.Optional.empty() : j$.util.Optional.ofNullable((defpackage.ido) this.a.get(defpackage.idu.WAV));
        } else {
            optionalOfNullable = j$.util.Optional.ofNullable((defpackage.ido) this.a.get(defpackage.idu.SYSTEM));
        }
        return optionalOfNullable.isPresent() ? ((defpackage.ido) optionalOfNullable.orElseThrow()).a(idtVar, akzcVar) : defpackage.aiql.y(new java.lang.IllegalArgumentException("no encoder found for the config"));
    }

    public final /* synthetic */ defpackage.hme o() {
        defpackage.alad aladVarP = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.hme) aladVarP;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object] */
    public final defpackage.aoxh p(defpackage.gxl gxlVar) {
        defpackage.aooh.f(gxlVar, "spec");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.a) {
            if (((defpackage.gvw) obj).b(gxlVar)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((defpackage.gvw) it.next()).a(gxlVar.k));
        }
        return defpackage.aoxo.a(new defpackage.edg((defpackage.aoxh[]) defpackage.ajsz.bZ(arrayList2).toArray(new defpackage.aoxh[0]), 2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.grp q() {
        defpackage.grp grpVar = new defpackage.grp((java.util.Map) this.a);
        defpackage.gus.A(grpVar);
        return grpVar;
    }

    public final void r(defpackage.grp grpVar) {
        if (grpVar == null) {
            defpackage.aooh.i("data");
        }
        defpackage.grp grpVar2 = defpackage.grp.a;
        s(grpVar.b);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void s(java.util.Map map) {
        java.lang.Object[] objArr;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (str == null) {
                defpackage.aooh.i("key");
            }
            ?? r2 = this.a;
            if (value == null) {
                value = null;
            } else {
                defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                defpackage.aooa aooaVar = new defpackage.aooa(value.getClass());
                if (!defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Boolean.TYPE)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Byte.TYPE)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Integer.TYPE)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Long.TYPE)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Float.TYPE)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Double.TYPE)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.String.class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Boolean[].class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Byte[].class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Integer[].class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Long[].class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Float[].class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.Double[].class)) && !defpackage.aooh.n(aooaVar, new defpackage.aooa(java.lang.String[].class))) {
                    int i = 0;
                    if (defpackage.aooh.n(aooaVar, new defpackage.aooa(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        java.lang.String str2 = defpackage.grq.a;
                        objArr = new java.lang.Boolean[length];
                        while (i < length) {
                            objArr[i] = java.lang.Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(byte[].class))) {
                        value = defpackage.grq.a((byte[]) value);
                    } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length2 = iArr.length;
                        java.lang.String str3 = defpackage.grq.a;
                        objArr = new java.lang.Integer[length2];
                        while (i < length2) {
                            objArr[i] = java.lang.Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(long[].class))) {
                        value = defpackage.grq.b((long[]) value);
                    } else if (defpackage.aooh.n(aooaVar, new defpackage.aooa(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length3 = fArr.length;
                        java.lang.String str4 = defpackage.grq.a;
                        objArr = new java.lang.Float[length3];
                        while (i < length3) {
                            objArr[i] = java.lang.Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!defpackage.aooh.n(aooaVar, new defpackage.aooa(double[].class))) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bo(aooaVar, str, "Key ", " has invalid type "));
                        }
                        double[] dArr = (double[]) value;
                        int length4 = dArr.length;
                        java.lang.String str5 = defpackage.grq.a;
                        objArr = new java.lang.Double[length4];
                        while (i < length4) {
                            objArr[i] = java.lang.Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            r2.put(str, value);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void t(long[] jArr) {
        this.a.put("timestamps_ms", defpackage.grq.b(jArr));
    }

    public final void u(java.lang.String str, boolean z) {
        bo(str, java.lang.Boolean.valueOf(z));
    }

    public final void v(java.lang.String str, int i) {
        bo(str, java.lang.Integer.valueOf(i));
    }

    public final void w(java.lang.String str, long j) {
        bo(str, java.lang.Long.valueOf(j));
    }

    public final void x(java.lang.String str, java.lang.String str2) {
        defpackage.aooh.f(str, "key");
        bo(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gom, java.lang.Object] */
    public final defpackage.gpn y() {
        return this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gom, java.lang.Object] */
    public final void z(defpackage.gow gowVar) {
        this.a.c(gowVar);
    }

    public ipc(defpackage.eja ejaVar, defpackage.eja ejaVar2, java.lang.Object obj) {
        this.a = new defpackage.kgl(ejaVar, ejaVar2, obj);
    }

    public ipc(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ipc(java.lang.Object obj, char[] cArr) {
        this.a = obj;
    }

    public ipc(java.util.List list) {
        defpackage.aooh.f(list, "tags");
        this.a = list;
    }

    public ipc(defpackage.ruc rucVar) {
        defpackage.aooh.f(rucVar, "metrics");
        this.a = rucVar;
    }

    public ipc(defpackage.aoin aoinVar, byte[] bArr) {
        aoinVar.getClass();
        this.a = aoinVar;
    }

    public ipc(defpackage.gxd gxdVar) {
        if (gxdVar == null) {
            defpackage.aooh.i("id");
        }
        this.a = gxdVar;
    }

    public ipc(java.lang.Object obj) {
        this.a = new java.lang.ref.WeakReference(obj);
    }

    public ipc(byte[] bArr, byte[] bArr2) {
        this.a = defpackage.aozk.a(null);
    }

    public ipc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = new defpackage.aco(6);
    }

    public ipc(byte[] bArr, short[] sArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public ipc(defpackage.ahbq ahbqVar) {
        if (ahbqVar == null) {
            defpackage.aooh.i("growthKitEventManager");
        }
        this.a = ahbqVar;
    }

    public ipc(defpackage.ecx ecxVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("verificationErrorDataStore");
        }
        this.a = ecxVar;
    }

    public ipc(defpackage.kgl kglVar) {
        if (kglVar == null) {
            defpackage.aooh.i("trackers");
        }
        java.lang.String str = defpackage.gvs.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(new defpackage.aojv(new defpackage.gvw[]{new defpackage.gvu((defpackage.gwf) kglVar.d), new defpackage.gvv((defpackage.gwa) kglVar.a), new defpackage.gvx((defpackage.gwf) kglVar.c)}, true));
        java.lang.Object obj = kglVar.b;
        if (obj == null) {
            defpackage.aooh.i("context");
        }
        java.lang.Object systemService = ((android.content.Context) obj).getSystemService("connectivity");
        if (systemService == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        arrayList.add(new defpackage.gvo((android.net.ConnectivityManager) systemService));
        this.a = arrayList;
    }

    public ipc(byte[] bArr) {
        this.a = defpackage.aoyx.c(1, 0, 0, 6);
    }

    public ipc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new defpackage.uqz();
    }

    public ipc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
    }

    public ipc(int i) {
        this.a = new defpackage.aozj(new int[i]);
    }

    public ipc(android.content.Context context, byte[] bArr) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.a = context;
    }

    public ipc(defpackage.sdg sdgVar, defpackage.aazc aazcVar) {
        if (sdgVar == null) {
            defpackage.aooh.i("whitePagesDao");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.a = sdgVar;
    }

    public ipc(char[] cArr, char[] cArr2) {
        this.a = new java.util.Random();
    }

    public ipc() {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public ipc(defpackage.rjb rjbVar) {
        if (rjbVar == null) {
            defpackage.aooh.i("joyballConsentStatusNotifier");
        }
        this.a = rjbVar;
    }

    public ipc(byte[] bArr, char[] cArr) {
        this.a = new java.util.LinkedHashMap();
    }

    public ipc(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new android.graphics.Region();
    }

    public ipc(short[] sArr) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public ipc(android.content.Context context, char[] cArr) {
        this.a = context.getApplicationContext();
    }

    public ipc(defpackage.gom gomVar, byte[] bArr) {
        if (gomVar == null) {
            defpackage.aooh.i("embeddingBackend");
        }
        this.a = gomVar;
    }

    public ipc(android.content.Context context) {
        defpackage.aooh.f(context, "appContext");
        this.a = context;
    }

    public ipc(defpackage.gom gomVar) {
        if (gomVar == null) {
            defpackage.aooh.i("embeddingBackend");
        }
        this.a = gomVar;
    }

    public ipc(char[] cArr, byte[] bArr) {
        this.a = new defpackage.aozj(defpackage.efg.a);
    }

    public ipc(boolean z) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(z);
    }

    public ipc(char[] cArr) {
        this.a = new java.util.LinkedHashMap();
    }

    public ipc(defpackage.egv egvVar) {
        byte[] bArr = defpackage.ehl.a;
        this.a = egvVar;
        egvVar.b = this;
    }

    public ipc(androidx.work.impl.WorkDatabase workDatabase, byte[] bArr) {
        if (workDatabase == null) {
            defpackage.aooh.i("workDatabase");
        }
        this.a = workDatabase;
    }

    public ipc(defpackage.aazc aazcVar) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        java.lang.String string = java.util.UUID.randomUUID().toString();
        defpackage.aooh.e(string, "toString(...)");
        this.a = string;
    }

    public ipc(android.content.Context context, char[] cArr, byte[] bArr) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.a = context;
    }

    public ipc(defpackage.aogc aogcVar) {
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        this.a = aogcVar;
    }

    public ipc(defpackage.rtg rtgVar) {
        this.a = new defpackage.fzh(new defpackage.gdc(new defpackage.fzh(rtgVar.c.b.b(), 9), rtgVar, 3), 10);
    }
}
