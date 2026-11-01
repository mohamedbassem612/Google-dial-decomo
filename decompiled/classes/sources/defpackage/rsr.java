package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rsr {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public rsr(defpackage.aihd aihdVar) {
        defpackage.gus.aJ();
        defpackage.aca acaVar = new defpackage.aca();
        defpackage.aca acaVar2 = new defpackage.aca();
        defpackage.ailj ailjVarK = aihdVar.iterator();
        while (ailjVarK.hasNext()) {
            hkd hkdVar = (hkd) ailjVarK.next();
            if (hkdVar.e && hkdVar.f.isEmpty()) {
                java.lang.String str = hkdVar.c;
                java.util.Set accVar = (java.util.Set) acaVar.get(str);
                if (accVar == null) {
                    accVar = new defpackage.acc(0);
                    acaVar.put(str, accVar);
                }
                accVar.add(hkdVar);
            } else {
                java.lang.String str2 = hkdVar.c;
                java.util.Set accVar2 = (java.util.Set) acaVar2.get(str2);
                if (accVar2 == null) {
                    accVar2 = new defpackage.acc(0);
                    acaVar2.put(str2, accVar2);
                }
                accVar2.add(hkdVar);
            }
        }
        this.b = aE(acaVar);
        this.a = aE(acaVar2);
    }

    public static java.lang.String S(java.lang.String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (!str.startsWith("(")) {
            return "(" + str + ')';
        }
        int i = 1;
        for (int i2 = 1; i2 < str.length() - 1; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '(') {
                i++;
            } else if (cCharAt == ')' && (i = i - 1) == 0) {
                return "(" + str + ')';
            }
        }
        if (i != 1) {
            throw new java.lang.IllegalArgumentException();
        }
        return str;
    }

    public static defpackage.rsr aA(defpackage.rsr rsrVar) {
        if (rsrVar.T()) {
            throw new java.lang.IllegalArgumentException();
        }
        return az("NOT ".concat((java.lang.String) rsrVar.b), (java.lang.String[]) rsrVar.a);
    }

    private static defpackage.aigf aE(java.util.Map map) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (java.util.Map.Entry entry : map.entrySet()) {
            aigbVar.i(entry.getKey(), defpackage.aihd.o((java.util.Collection) entry.getValue()));
        }
        return aigbVar.e(true);
    }

    private static java.lang.String aF(java.lang.String str, java.lang.String str2) {
        return java.lang.String.format(java.util.Locale.US, "%s:%s", str, str2);
    }

    private final afpl aG(java.lang.String str, spn spnVar, java.lang.Long l) {
        return new afpl(str, new abjg(spnVar, str, l, this, (defpackage.aoln) null, 1), (char[]) null);
    }

    public static final jrz ak(jrz jrzVar) {
        defpackage.akzx akzxVarP = jrzVar.L();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVarP.u();
        jrz jrzVar2 = akzxVarP.b;
        jrzVar2.b |= 4;
        jrzVar2.e = epochMilli;
        return akzxVarP.r();
    }

    public static final al al(jrz jrzVar) {
        jrz jrzVarAk = ak(jrzVar);
        jug jugVar = new jug();
        defpackage.amxr.g(jugVar);
        defpackage.ahgl.b(jugVar, jrzVarAk);
        return jugVar;
    }

    public static final al am(jrz jrzVar) {
        return juk.aU(ak(jrzVar));
    }

    public static final al an(jrz jrzVar) {
        jrz jrzVarAk = ak(jrzVar);
        jup jupVar = new jup();
        defpackage.amxr.g(jupVar);
        defpackage.ahgl.b(jupVar, jrzVarAk);
        return jupVar;
    }

    public static final al ao(jrz jrzVar) {
        return jvf.aU(ak(jrzVar));
    }

    public static final java.lang.String ap(java.lang.String str) {
        defpackage.aooh.f(str, "number");
        return defpackage.aoov.Q(str, " ", " ");
    }

    public static defpackage.rsr az(java.lang.String str, java.lang.String... strArr) {
        return new defpackage.rsr(str, (java.util.Collection) (strArr == null ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(strArr))).aB();
    }

    public static int p(zna znaVar) {
        int iOrdinal = znaVar.ordinal();
        if (iOrdinal == 0) {
            return 3;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 4;
                }
                throw new java.lang.AssertionError("Unsupported CallPresentation: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(znaVar))));
            }
        }
        return i;
    }

    public static java.lang.String y(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return aF(phoneAccountHandle.getComponentName().flattenToString(), phoneAccountHandle.getId());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aoin, java.lang.Object] */
    public final abtr A(defpackage.vcg vcgVar, j$.util.Optional optional, defpackage.vcc vccVar) {
        defpackage.vee veeVar = (defpackage.vee) this.b.a();
        veeVar.getClass();
        defpackage.vew vewVar = (defpackage.vew) this.a.a();
        vewVar.getClass();
        vcgVar.getClass();
        optional.getClass();
        vccVar.getClass();
        return new abtr(veeVar, vewVar, vcgVar, optional, vccVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    public final abtr B(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            return (abtr) ((j$.util.concurrent.ConcurrentHashMap) this.b).get(phoneAccountHandle);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    public final void C(android.telecom.PhoneAccountHandle phoneAccountHandle, abtr abtrVar) {
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            ((j$.util.concurrent.ConcurrentHashMap) this.b).put(phoneAccountHandle, abtrVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final opn D(opl oplVar, java.lang.String str) {
        ((android.content.Context) this.b.a()).getClass();
        pgi pgiVar = (pgi) this.a.a();
        pgiVar.getClass();
        return new opn(pgiVar, oplVar, str);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    public final defpackage.ajcq E(acuo acuoVar) {
        defpackage.zjv.i((defpackage.zjv) this.b, defpackage.mgv.MDD_ADD_FILE_GROUP, defpackage.ajsz.aY(defpackage.gus.aw(acuoVar.a.c)), null, 0, 28);
        defpackage.ajcq ajcqVarA = ((defpackage.acwi) this.a.a()).a(acuoVar);
        defpackage.aooh.e(ajcqVarA, "addFileGroup(...)");
        return ajcqVarA;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    public final defpackage.ajcq F(acvj acvjVar) {
        defpackage.zjv.i((defpackage.zjv) this.b, defpackage.mgv.MDD_DOWNLOAD_FILE_GROUP, defpackage.ajsz.aY(defpackage.gus.aw(acvjVar.a)), null, 0, 28);
        return ((defpackage.acwi) this.a.a()).b(acvjVar);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    public final defpackage.ajcq G(acvn acvnVar) {
        defpackage.zjv.i((defpackage.zjv) this.b, defpackage.mgv.MDD_GET_FILE_GROUP, defpackage.ajsz.aY(defpackage.gus.aw(acvnVar.a)), null, 0, 28);
        defpackage.ajcq ajcqVarD = ((defpackage.acwi) this.a.a()).d(acvnVar);
        defpackage.aooh.e(ajcqVarD, "getFileGroup(...)");
        return ajcqVarD;
    }

    public final java.lang.Object H(acuo acuoVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.D(E(acuoVar), aolnVar);
    }

    public final java.lang.Object I(acvj acvjVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.D(F(acvjVar), aolnVar);
    }

    public final java.lang.Object J(acvn acvnVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.D(G(acvnVar), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object K(java.lang.String str, defpackage.aoln aolnVar) {
        oec oecVar;
        if (aolnVar instanceof oec) {
            oecVar = (oec) aolnVar;
            int i = oecVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oecVar.b = i - Integer.MIN_VALUE;
            } else {
                oecVar = new oec(this, aolnVar);
            }
        } else {
            oecVar = new oec(this, aolnVar);
        }
        java.lang.Object obj = oecVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = oecVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r8 = this.a;
            nrw nrwVar = new nrw(this, str, (defpackage.aoln) null, 16);
            oecVar.b = 1;
            if (defpackage.aoov.aj(r8, nrwVar, oecVar) == aoluVar) {
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
    /* JADX WARN: Type inference failed for: r15v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object L(long j, oet oetVar, defpackage.aoln aolnVar) {
        oed oedVar;
        if (aolnVar instanceof oed) {
            oedVar = (oed) aolnVar;
            int i = oedVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oedVar.b = i - Integer.MIN_VALUE;
            } else {
                oedVar = new oed(this, aolnVar);
            }
        } else {
            oedVar = new oed(this, aolnVar);
        }
        java.lang.Object obj = oedVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = oedVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r15 = this.a;
            klr klrVar = new klr(this, j, oetVar, (defpackage.aoln) null, 7);
            oedVar.b = 1;
            if (defpackage.aoov.aj(r15, klrVar, oedVar) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ac -> B:21:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object M(defpackage.aoln r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mzt
            if (r0 == 0) goto L13
            r0 = r7
            mzt r0 = (mzt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mzt r0 = new mzt
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            aolu r1 = defpackage.aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.aooc.af(r7)
            goto L7d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            pqm r6 = r0.d
            java.lang.Object r2 = r0.a
            defpackage.aooc.af(r7)
            goto L9b
        L3c:
            defpackage.aooc.af(r7)
            java.lang.Object r6 = r6.b
            zpo r7 = zpo.l
            zpm r6 = (defpackage.zpm) r6
            aihd r6 = r6.b(r7)
            java.lang.String r7 = "getCallScopesWithState(...)"
            defpackage.aooh.e(r6, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ajsz.bl(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r6.next()
            apqr r2 = (apqr) r2
            java.lang.Class<mzs> r5 = mzs.class
            java.lang.Object r2 = r2.a(r5)
            mzs r2 = (mzs) r2
            pqm r2 = r2.cq()
            r7.add(r2)
            goto L5d
        L79:
            java.util.Iterator r6 = r7.iterator()
        L7d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lae
            java.lang.Object r7 = r6.next()
            pqm r7 = (pqm) r7
            ajcq r2 = r7.k()
            r0.a = r6
            r0.d = r7
            r0.c = r4
            java.lang.Object r2 = defpackage.aosv.D(r2, r0)
            if (r2 == r1) goto Lb0
            r2 = r6
            r6 = r7
        L9b:
            ajcq r6 = r6.f()
            r0.a = r2
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r6 = defpackage.aosv.D(r6, r0)
            if (r6 == r1) goto Lb0
            r6 = r2
            goto L7d
        Lae:
            aojh r1 = defpackage.aojh.a
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsr.M(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final java.lang.Object N(defpackage.aoln aolnVar) {
        mzu mzuVar;
        ?? it;
        if (aolnVar instanceof mzu) {
            mzuVar = (mzu) aolnVar;
            int i = mzuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mzuVar.c = i - Integer.MIN_VALUE;
            } else {
                mzuVar = new mzu(this, aolnVar);
            }
        } else {
            mzuVar = new mzu(this, aolnVar);
        }
        java.lang.Object obj = mzuVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mzuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aihd aihdVarB = ((defpackage.zpm) this.b).b(zpo.d);
            defpackage.aooh.e(aihdVarB, "getCallScopesWithState(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aihdVarB, 10));
            java.util.Iterator it2 = aihdVarB.iterator();
            while (it2.hasNext()) {
                arrayList.add(((mzs) ((apqr) it2.next()).a(mzs.class)).cq());
            }
            it = arrayList.iterator();
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = mzuVar.a;
            defpackage.aooc.af(obj);
            it = obj2;
        }
        while (it.hasNext()) {
            defpackage.ajcq ajcqVarH = ((pqm) it.next()).h();
            mzuVar.a = it;
            mzuVar.c = 1;
            if (defpackage.aosv.D(ajcqVarH, mzuVar) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kel] */
    public final defpackage.mmy O(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "row");
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            defpackage.mmy mmyVar = (defpackage.mmy) hgt.w(kiuVar, (defpackage.kel) this.b);
            return mmyVar == null ? defpackage.mni.Z(defpackage.mmy.a.m()).L() : mmyVar;
        }
        defpackage.mmy mmyVar2 = kiuVar.K;
        if (mmyVar2 == null) {
            mmyVar2 = defpackage.mmy.a;
        }
        defpackage.aooh.c(mmyVar2);
        return mmyVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final defpackage.mgu P(defpackage.mfv mfvVar, java.util.function.Function function) {
        mfvVar.getClass();
        function.getClass();
        ((defpackage.ajct) this.a.a()).getClass();
        return new defpackage.mgu(mfvVar, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object Q(java.lang.String str, ltj ltjVar, defpackage.aoln aolnVar) {
        lro lroVar;
        if (aolnVar instanceof lro) {
            lroVar = (lro) aolnVar;
            int i = lroVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lroVar.b = i - Integer.MIN_VALUE;
            } else {
                lroVar = new lro(this, aolnVar);
            }
        } else {
            lroVar = new lro(this, aolnVar);
        }
        java.lang.Object obj = lroVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = lroVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r13 = this.a;
            hyq hyqVar = new hyq(this, str, ltjVar, (defpackage.aoln) null, 18);
            lroVar.b = 1;
            if (defpackage.aoov.aj(r13, hyqVar, lroVar) == aoluVar) {
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
    /* JADX WARN: Type inference failed for: r15v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object R(long j, java.lang.String str, defpackage.aoln aolnVar) {
        lrp lrpVar;
        if (aolnVar instanceof lrp) {
            lrpVar = (lrp) aolnVar;
            int i = lrpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrpVar.b = i - Integer.MIN_VALUE;
            } else {
                lrpVar = new lrp(this, aolnVar);
            }
        } else {
            lrpVar = new lrp(this, aolnVar);
        }
        java.lang.Object obj = lrpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = lrpVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r15 = this.a;
            klr klrVar = new klr(this, j, str, (defpackage.aoln) null, 2);
            lrpVar.b = 1;
            if (defpackage.aoov.aj(r15, klrVar, lrpVar) == aoluVar) {
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

    public final boolean T() {
        return ((java.lang.String) this.b).isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoir, java.lang.Object] */
    public final kod U(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "row");
        java.util.Iterator it = ((java.util.List) this.a.a()).iterator();
        while (it.hasNext()) {
            kod kodVarA = ((koe) ((defpackage.aoin) it.next()).a()).a(kiuVar);
            if (kodVarA != null) {
                return kodVarA;
            }
        }
        return null;
    }

    public final jye V(jyf jyfVar) {
        defpackage.aoin aoinVar = (defpackage.aoin) ((defpackage.zzx) this.b).k().get(jyfVar);
        jye jyeVar = aoinVar != null ? (jye) aoinVar.a() : null;
        if (jyeVar != null) {
            return jyeVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(jyfVar, "CallLogChipIntegration corresponding to the key ", " not injected"));
    }

    public final void W(jyf jyfVar, jyg jygVar) {
        defpackage.aooh.f(jyfVar, "chipKey");
        V(jyfVar).b(jygVar);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq X(long j, java.lang.String str) {
        defpackage.aooh.f(str, "audioFilePath");
        return defpackage.aosv.F(this.b, 0, new klr(this, j, str, (defpackage.aoln) null, 0, (byte[]) null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq Y() {
        defpackage.guy guyVar = new defpackage.guy(this, 3);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
        this.a.execute(ajdkVar);
        return ajdkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.EnumMap Z() {
        return (java.util.EnumMap) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.a, 0, new defpackage.oxe(this, (defpackage.aoln) null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final defpackage.rsr aB() {
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.b;
        if (sb.length() == 0) {
            return new defpackage.rsr("", new java.lang.String[0], (byte[]) null);
        }
        java.lang.String strS = S(sb.toString());
        ?? r4 = this.a;
        return new defpackage.rsr(strS, (java.lang.String[]) r4.toArray(new java.lang.String[r4.size()]), (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    public final void aC(defpackage.rsr rsrVar) {
        if (rsrVar.T()) {
            return;
        }
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.b;
        if (sb.length() > 0) {
            sb.append(" AND ");
        }
        sb.append((java.lang.String) rsrVar.b);
        java.util.Collections.addAll(this.a, (java.lang.Object[]) rsrVar.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    public final void aD(defpackage.rsr rsrVar) {
        if (rsrVar.T()) {
            return;
        }
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.b;
        if (sb.length() > 0) {
            sb.append(" OR ");
        }
        sb.append((java.lang.String) rsrVar.b);
        java.util.Collections.addAll(this.a, (java.lang.Object[]) rsrVar.a);
    }

    public final boolean aa(defpackage.ken kenVar, defpackage.akzc akzcVar, defpackage.akzc akzcVar2) {
        defpackage.aooh.f(kenVar, "key");
        defpackage.aooh.f(akzcVar, "byteString");
        defpackage.kel kelVar = (defpackage.kel) Z().get(kenVar);
        if (kelVar == null) {
            return true;
        }
        return kelVar.c(kelVar.d().a(akzcVar), akzcVar2 != null ? kelVar.d().a(akzcVar2) : null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq ab(java.util.Set set) {
        defpackage.aooh.f(set, "ids");
        return defpackage.aosv.F(this.a, 0, new jpj(this, set, (defpackage.aoln) null, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq ac(java.util.Set set) {
        if (set == null) {
            defpackage.aooh.i("timestamps");
        }
        return defpackage.aosv.F(this.a, 0, new defpackage.bur(this, set, (defpackage.aoln) null, 15), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object ad(defpackage.kfj kfjVar, defpackage.aoln aolnVar) {
        defpackage.kdg kdgVar;
        if (aolnVar instanceof defpackage.kdg) {
            kdgVar = (defpackage.kdg) aolnVar;
            int i = kdgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdgVar.b = i - Integer.MIN_VALUE;
            } else {
                kdgVar = new defpackage.kdg(this, aolnVar);
            }
        } else {
            kdgVar = new defpackage.kdg(this, aolnVar);
        }
        java.lang.Object obj = kdgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kdgVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
            java.util.Map map = kfkVar.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                defpackage.aooh.e(value, "<get-value>(...)");
                android.content.ContentValues contentValues = (android.content.ContentValues) value;
                java.lang.Object key2 = entry.getKey();
                defpackage.aooh.e(key2, "<get-key>(...)");
                long jLongValue = ((java.lang.Number) key2).longValue();
                if (contentValues.containsKey("_id")) {
                    java.lang.Long asLong = contentValues.getAsLong("_id");
                    if (asLong == null || asLong.longValue() != jLongValue) {
                        throw new java.lang.IllegalArgumentException("Id does not match");
                    }
                } else {
                    contentValues.put("_id", java.lang.Long.valueOf(jLongValue));
                }
                arrayList.add(new afpl(key, hgt.z(contentValues)));
            }
            java.util.Map map2 = kfkVar.b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map2.size());
            for (java.util.Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(new afpl((java.lang.Long) entry2.getKey(), new defpackage.bpj((android.content.ContentValues) entry2.getValue(), (defpackage.aoln) null, 14), (byte[]) null));
            }
            java.util.Set set = kfkVar.c;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(set.size());
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList3.add(new afpl((java.lang.Long) it.next()));
            }
            java.lang.Object obj2 = this.b;
            java.util.List listBT = defpackage.ajsz.bT(defpackage.ajsz.bT(arrayList, arrayList2), arrayList3);
            kdgVar.b = 1;
            if (((defpackage.kdw) obj2).a(listBT, kdgVar) == aoluVar) {
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

    public final java.lang.Object ae(defpackage.aoln aolnVar) {
        return ((defpackage.kdw) this.b).b(aolnVar);
    }

    public final java.lang.Object af(java.util.Set set, defpackage.aoln aolnVar) {
        return ((defpackage.kdw) this.b).d(set, aolnVar);
    }

    public final java.lang.Object ag(long j, defpackage.aoln aolnVar) {
        return ((defpackage.kdw) this.b).e(j, aolnVar);
    }

    public final java.lang.Object ah(java.util.Set set, defpackage.aoln aolnVar) {
        return ((defpackage.kdw) this.b).f(set, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00aa -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b2 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cf -> B:32:0x00d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ai(long r12, defpackage.aoln r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsr.ai(long, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object aj(hkl hklVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        jxh jxhVar;
        if (aolnVar instanceof jxh) {
            jxhVar = (jxh) aolnVar;
            int i = jxhVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jxhVar.b = i - Integer.MIN_VALUE;
            } else {
                jxhVar = new jxh(this, aolnVar);
            }
        } else {
            jxhVar = new jxh(this, aolnVar);
        }
        java.lang.Object objD = jxhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jxhVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarBb = ((jxg) defpackage.aooc.ar(hklVar, jxg.class)).bb();
            jxhVar.b = 1;
            objD = defpackage.aosv.D(ajcqVarBb, jxhVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        return defpackage.aooh.q((j$.util.Optional) objD);
    }

    public final jjx aq(defpackage.kiu kiuVar, int i) {
        defpackage.tkj tkjVarA;
        defpackage.aooh.f(kiuVar, "coalescedRow");
        jhw jhwVarD = hht.d(jjx.a.m());
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        java.lang.String str = hkdVar.c;
        defpackage.aooh.e(str, "getNormalizedNumber(...)");
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) jhwVarD.a;
        akzxVar.u();
        jjx jjxVar = akzxVar.b;
        j$.util.Objects.requireNonNull(str);
        jjxVar.b |= 1;
        jjxVar.c = str;
        java.lang.String str2 = kiuVar.h;
        defpackage.aooh.e(str2, "getFormattedNumber(...)");
        defpackage.aooh.f(str2, "value");
        akzxVar.u();
        jjx jjxVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull(str2);
        jjxVar2.b |= 2;
        jjxVar2.d = str2;
        hkd hkdVar2 = kiuVar.f;
        if (hkdVar2 == null) {
            hkdVar2 = hkd.a;
        }
        java.lang.String str3 = hkdVar2.d;
        defpackage.aooh.e(str3, "getCountryIso(...)");
        defpackage.aooh.f(str3, "value");
        akzxVar.u();
        jjx jjxVar3 = akzxVar.b;
        j$.util.Objects.requireNonNull(str3);
        jjxVar3.b |= 4;
        jjxVar3.e = str3;
        int i2 = kiuVar.q;
        akzxVar.u();
        jjx jjxVar4 = akzxVar.b;
        jjxVar4.b |= 8;
        jjxVar4.f = i2;
        akzxVar.u();
        jjx jjxVar5 = akzxVar.b;
        jjxVar5.g = i - 1;
        jjxVar5.b |= 16;
        defpackage.tkl tklVar = (defpackage.tkl) this.b;
        boolean zU = tklVar.u(kiuVar);
        akzxVar.u();
        jjx jjxVar6 = akzxVar.b;
        jjxVar6.b |= 1024;
        jjxVar6.q = zU;
        boolean zT = tklVar.t(kiuVar);
        akzxVar.u();
        jjx jjxVar7 = akzxVar.b;
        jjxVar7.b |= 2048;
        jjxVar7.r = zT;
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
            akzxVar.u();
            jjx jjxVar8 = akzxVar.b;
            jjxVar8.b |= 256;
            jjxVar8.k = jA;
        }
        if ((kiuVar.b & 1073741824) != 0) {
            long j = kiuVar.H;
            akzxVar.u();
            jjx jjxVar9 = akzxVar.b;
            jjxVar9.b |= 4096;
            jjxVar9.s = j;
        }
        j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        defpackage.tkl tklVar2 = (defpackage.tkl) defpackage.aooh.q(optionalG);
        if (tklVar2 != null && (tkjVarA = tklVar2.a(kiuVar)) != null) {
            akzxVar.u();
            jjx jjxVar10 = akzxVar.b;
            j$.util.Objects.requireNonNull(tkjVarA);
            jjxVar10.l = tkjVarA;
            jjxVar10.b |= 512;
        }
        return jhwVarD.b();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object ar(defpackage.igs igsVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new blj(igsVar, this, (defpackage.aoln) null, 15), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq as() {
        return defpackage.aosv.F(this.a, 0, new defpackage.dgz(this, (defpackage.aoln) null, 11), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object at(defpackage.aoln aolnVar) {
        defpackage.hqx hqxVar;
        defpackage.adae adaeVar;
        defpackage.adae adaeVar2;
        if (aolnVar instanceof defpackage.hqx) {
            hqxVar = (defpackage.hqx) aolnVar;
            int i = hqxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqxVar.b = i - Integer.MIN_VALUE;
            } else {
                hqxVar = new defpackage.hqx(this, aolnVar);
            }
        } else {
            hqxVar = new defpackage.hqx(this, aolnVar);
        }
        java.lang.Object objAu = hqxVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = hqxVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAu);
            defpackage.akzx akzxVarM = defpackage.amnr.a.m();
            if (akzxVarM == null) {
                defpackage.aooh.i("builder");
            }
            defpackage.adae adaeVar3 = new defpackage.adae(akzxVarM);
            hqxVar.c = adaeVar3;
            hqxVar.d = adaeVar3;
            hqxVar.b = 1;
            objAu = au(hqxVar);
            if (objAu == obj) {
                return obj;
            }
            adaeVar = adaeVar3;
            adaeVar2 = adaeVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adaeVar = hqxVar.d;
            adaeVar2 = hqxVar.c;
            defpackage.aooc.af(objAu);
        }
        defpackage.amnq amnqVar = (defpackage.amnq) objAu;
        if (amnqVar == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) adaeVar.a;
        akzxVar.u();
        defpackage.amnr amnrVar = (defpackage.amnr) akzxVar.b;
        defpackage.amnr amnrVar2 = defpackage.amnr.a;
        amnrVar.c = amnqVar.d;
        amnrVar.b |= 1;
        defpackage.alad aladVarP = ((defpackage.akzx) adaeVar2.a).r();
        defpackage.aooh.e(aladVarP, "build(...)");
        return (defpackage.amnr) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object au(defpackage.aoln aolnVar) {
        defpackage.hqy hqyVar;
        java.lang.Boolean bool;
        if (aolnVar instanceof defpackage.hqy) {
            hqyVar = (defpackage.hqy) aolnVar;
            int i = hqyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqyVar.b = i - Integer.MIN_VALUE;
            } else {
                hqyVar = new defpackage.hqy(this, aolnVar);
            }
        } else {
            hqyVar = new defpackage.hqy(this, aolnVar);
        }
        java.lang.Object objB = hqyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hqyVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            j$.util.Optional optionalG = ((defpackage.zjm) this.b).g();
            defpackage.aooh.e(optionalG, "getFeature(...)");
            if (optionalG == null) {
                defpackage.aooh.i("<this>");
            }
            bool = null;
            defpackage.hrb hrbVar = (defpackage.hrb) optionalG.orElse((java.lang.Object) null);
            if (hrbVar != null) {
                hqyVar.b = 1;
                objB = hrbVar.b(hqyVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
            }
            if (defpackage.aooh.n(bool, java.lang.Boolean.TRUE)) {
                return defpackage.amnq.ANDROID_AUTO_CONNECTED_IN_PROJECTION_MODE;
            }
            return defpackage.aooh.n(bool, java.lang.Boolean.FALSE) ? defpackage.amnq.ANDROID_AUTO_NOT_CONNECTED_IN_PROJECTION_MODE : defpackage.amnq.ANDROID_AUTO_CONNECTION_STATUS_UNKNOWN;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objB);
        bool = (java.lang.Boolean) objB;
        if (defpackage.aooh.n(bool, java.lang.Boolean.TRUE)) {
            return defpackage.amnq.ANDROID_AUTO_CONNECTED_IN_PROJECTION_MODE;
        }
        if (defpackage.aooh.n(bool, java.lang.Boolean.FALSE)) {
        }
    }

    public final void av() {
        synchronized (this) {
            java.lang.Object obj = this.a;
            ((java.util.concurrent.atomic.AtomicInteger) obj).decrementAndGet();
            if (((java.util.concurrent.atomic.AtomicInteger) obj).get() < 0) {
                throw new java.lang.IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean aw() {
        synchronized (this) {
            if (((java.util.concurrent.atomic.AtomicBoolean) this.b).get()) {
                return false;
            }
            ((java.util.concurrent.atomic.AtomicInteger) this.a).incrementAndGet();
            return true;
        }
    }

    public final void ax(defpackage.ipc ipcVar, defpackage.gus gusVar) {
        ((defpackage.gou) this.a).b(new defpackage.gsb(this, ipcVar, gusVar, 3, (char[]) null));
    }

    public final void ay(defpackage.ipc ipcVar, int i) {
        defpackage.aooh.f(ipcVar, "workSpecId");
        ((defpackage.gou) this.a).b(new gym((defpackage.gtr) this.b, ipcVar, false, i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.rlp rlpVar;
        if (aolnVar instanceof defpackage.rlp) {
            rlpVar = (defpackage.rlp) aolnVar;
            int i = rlpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlpVar.b = i - Integer.MIN_VALUE;
            } else {
                rlpVar = new defpackage.rlp(this, aolnVar);
            }
        } else {
            rlpVar = new defpackage.rlp(this, aolnVar);
        }
        java.lang.Object objC = rlpVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = rlpVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            rlpVar.b = 1;
            objC = c(rlpVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
        }
        java.lang.String country = (java.lang.String) objC;
        if (country == null) {
            country = "";
        }
        if (android.text.TextUtils.isEmpty(country)) {
            country = java.util.Locale.getDefault().getCountry();
            defpackage.aooh.e(country, "getCountry(...)");
        }
        if (true == android.text.TextUtils.isEmpty(country)) {
            country = "US";
        }
        java.lang.String upperCase = country.toUpperCase(java.util.Locale.ROOT);
        defpackage.aooh.e(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.rlq rlqVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.rlq) {
            rlqVar = (defpackage.rlq) aolnVar;
            int i = rlqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlqVar.b = i - Integer.MIN_VALUE;
            } else {
                rlqVar = new defpackage.rlq(this, aolnVar);
            }
        } else {
            rlqVar = new defpackage.rlq(this, aolnVar);
        }
        java.lang.Object objD = rlqVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = rlqVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objD);
            } else {
                if (i2 == 2) {
                    defpackage.aooc.af(objD);
                    str = (java.lang.String) objD;
                    if (android.text.TextUtils.isEmpty(str)) {
                        java.lang.Object obj2 = this.b;
                        rlqVar.b = 3;
                        objD = ((defpackage.oko) obj2).I(rlqVar);
                        if (objD == obj) {
                            return obj;
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str) || str == null) {
                        return null;
                    }
                    java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
                    defpackage.aooh.e(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            str = (java.lang.String) objD;
            if (android.text.TextUtils.isEmpty(str)) {
            }
            return null;
        }
        defpackage.aooc.af(objD);
        rlqVar.b = 1;
        objD = d(rlqVar);
        if (objD == obj) {
            return obj;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            java.lang.Object obj3 = this.b;
            rlqVar.b = 2;
            objD = ((defpackage.oko) obj3).G(rlqVar);
            if (objD == obj) {
                return obj;
            }
            str = (java.lang.String) objD;
        } else {
            str = null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object obj4 = this.b;
            rlqVar.b = 3;
            objD = ((defpackage.oko) obj4).I(rlqVar);
            if (objD == obj) {
                return obj;
            }
            str = (java.lang.String) objD;
        }
        if (android.text.TextUtils.isEmpty(str)) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.rlr rlrVar;
        if (aolnVar instanceof defpackage.rlr) {
            rlrVar = (defpackage.rlr) aolnVar;
            int i = rlrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlrVar.b = i - Integer.MIN_VALUE;
            } else {
                rlrVar = new defpackage.rlr(this, aolnVar);
            }
        } else {
            rlrVar = new defpackage.rlr(this, aolnVar);
        }
        java.lang.Object objAj = rlrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = rlrVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            java.lang.Object obj = this.b;
            rlrVar.b = 1;
            defpackage.oko okoVar = (defpackage.oko) obj;
            objAj = defpackage.aoov.aj(okoVar.e, new defpackage.okl(okoVar, (defpackage.aoln) null, 2, (char[]) null), rlrVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        return java.lang.Boolean.valueOf(((java.lang.Number) objAj).intValue() == 1);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoss, java.lang.Object] */
    public final defpackage.ajcq e(java.lang.String str, spn spnVar) {
        defpackage.aooh.f(str, "normalizedNumber");
        defpackage.aooh.f(spnVar, "info");
        return defpackage.aosv.F(this.a, 0, new rjk(this, str, spnVar, (defpackage.aoln) null, 11), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.util.Map map, java.util.Set set, defpackage.aoln aolnVar) {
        defpackage.sqy sqyVar;
        long j;
        if (aolnVar instanceof defpackage.sqy) {
            sqyVar = (defpackage.sqy) aolnVar;
            int i = sqyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqyVar.c = i - Integer.MIN_VALUE;
            } else {
                sqyVar = new defpackage.sqy(this, aolnVar);
            }
        } else {
            sqyVar = new defpackage.sqy(this, aolnVar);
        }
        java.lang.Object objB = sqyVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sqyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            java.lang.Object obj = this.b;
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(aG((java.lang.String) entry.getKey(), (spn) entry.getValue(), new java.lang.Long(epochMilli)));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(set, 10));
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(aG((java.lang.String) it.next(), null, new java.lang.Long(epochMilli)));
            }
            java.util.List listBT = defpackage.ajsz.bT(arrayList, arrayList2);
            sqyVar.a = epochMilli;
            sqyVar.c = 1;
            objB = ((defpackage.srl) obj).b(listBT, sqyVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            j = epochMilli;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = sqyVar.a;
            defpackage.aooc.af(objB);
        }
        if (((java.lang.Boolean) objB).booleanValue()) {
            return new java.lang.Long(j);
        }
        return null;
    }

    public final java.lang.Object g(java.lang.String str, defpackage.aoln aolnVar) {
        return ((defpackage.srl) this.b).c(str, aolnVar);
    }

    public final java.lang.Object h(defpackage.aoln aolnVar) {
        return ((defpackage.srl) this.b).e(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.lang.String str, spn spnVar, defpackage.aoln aolnVar) {
        sqz sqzVar;
        if (aolnVar instanceof sqz) {
            sqzVar = (sqz) aolnVar;
            int i = sqzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqzVar.b = i - Integer.MIN_VALUE;
            } else {
                sqzVar = new sqz(this, aolnVar);
            }
        } else {
            sqzVar = new sqz(this, aolnVar);
        }
        java.lang.Object obj = sqzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sqzVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj2 = this.b;
            afpl afplVarAG = aG(str, spnVar, null);
            sqzVar.b = 1;
            if (((defpackage.srl) obj2).h(afplVarAG, sqzVar) == aoluVar) {
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

    public final void j() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_emergency_call", ((android.content.Context) this.b).getText(2132019505), 4);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, new android.media.AudioAttributes.Builder().setUsage(5).build());
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) this.a, notificationChannel);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final java.lang.String k() {
        android.content.ContentResolver contentResolver = ((android.content.Context) this.b).getContentResolver();
        java.lang.String str = (java.lang.String) this.a.a();
        return zhu.b(contentResolver).a(str).a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List l(java.util.Map map) {
        defpackage.gus.aJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(((defpackage.aec) map).d);
        for (tvb tvbVar : map.values()) {
            android.content.Intent intent = new android.content.Intent();
            android.content.Context context = (android.content.Context) this.b;
            intent.setClassName(context, "com.android.dialer.shortcuts.CallContactActivity");
            intent.setData(tvbVar.a());
            intent.setAction("com.android.dialer.shortcuts.CALL_CONTACT");
            intent.putExtra("contactId", tvbVar.a);
            java.lang.String str = tvbVar.b;
            android.content.pm.ShortcutInfo.Builder builderM = hq$.ExternalSyntheticApiModelOutline1.m(new android.content.pm.ShortcutInfo.Builder(context, str), intent);
            java.lang.String str2 = tvbVar.c;
            android.content.pm.ShortcutInfo.Builder builderM$1 = hq$.ExternalSyntheticApiModelOutline1.m$1(hq$.ExternalSyntheticApiModelOutline1.m(builderM, str2), str2);
            java.lang.Object obj = this.a;
            defpackage.lpb.a();
            android.content.pm.ShortcutInfo.Builder builderM2 = hq$.ExternalSyntheticApiModelOutline1.m(builderM$1, ((defpackage.tve) obj).a(tvbVar.a(), str2, str));
            int i = tvbVar.d;
            if (i != -1) {
                hq$.ExternalSyntheticApiModelOutline1.m(builderM2, i);
            }
            arrayList.add(hq$.ExternalSyntheticApiModelOutline1.m(builderM2));
        }
        return arrayList;
    }

    public final java.lang.Object m(j$.time.Instant instant, tki tkiVar, defpackage.aoln aolnVar) {
        int i;
        defpackage.aooh.f(tkiVar, "<this>");
        tue tueVar = tue.a;
        tud tudVar = tud.a;
        int iOrdinal = tkiVar.ordinal();
        int i2 = 1;
        if (iOrdinal == 0) {
            i = i2;
        } else if (iOrdinal == 1) {
            i = 2;
        } else {
            if (iOrdinal != 2) {
                throw new java.lang.IllegalArgumentException("Invalid value for SharpieCallLogDetails.ScamVerdict");
            }
            i2 = 3;
            i = i2;
        }
        defpackage.tts ttsVar = (defpackage.tts) this.b;
        java.lang.Object objAj = defpackage.aoov.aj(ttsVar.b, new kgx(instant, ttsVar, i, (defpackage.aoln) null, 6), aolnVar);
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (objAj != aoluVar) {
            objAj = defpackage.aojh.a;
        }
        return objAj != aoluVar ? defpackage.aojh.a : objAj;
    }

    public final android.app.PendingIntent n(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i) {
        intent.putExtra("oplus_mini_app_intent", pendingIntent);
        return afap.b((android.content.Context) this.b, i, intent, 201326592);
    }

    public final j$.util.Optional o(j$.util.Optional optional, int i) {
        defpackage.aooh.f(optional, "inCallIntent");
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) defpackage.aooh.q(optional);
        if (pendingIntent == null) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        java.lang.Object obj = this.a;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass((android.content.Context) ((defpackage.ipc) obj).a, com.android.dialer.incall.activity.ui.InCallActivity.class);
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(n(pendingIntent, intent, i));
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional q(zna znaVar) {
        return r(p(znaVar));
    }

    public final j$.util.Optional r(int i) {
        if (i == 3) {
            return j$.util.Optional.of(((android.content.Context) this.b).getResources().getString(2132020648));
        }
        if (i == 2) {
            return j$.util.Optional.of(((defpackage.ssq) this.a).b());
        }
        return i == 4 ? j$.util.Optional.of(((android.content.Context) this.b).getResources().getString(2132019752)) : j$.util.Optional.empty();
    }

    public final void s(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.Object obj = this.b;
        defpackage.agsm.i(994, defpackage.ahvr.E(new rqy(obj, phoneAccountHandle, 18), ((defpackage.vnk) obj).b), "failed to fully schedule the transcription backfill work", new java.lang.Object[0]);
    }

    public final void t(android.net.Uri uri, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.vnu) this.a).b(uri, phoneAccountHandle, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq u() {
        return ((defpackage.afhf) this.b).a(new vmj(6), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq v(vgm vgmVar) {
        return ((defpackage.afhf) this.a).a(new vfp(aF(vgmVar.c, vgmVar.d), vgmVar, 5), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq w(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((defpackage.afhf) this.a).a(new vfw(y(phoneAccountHandle), 7), this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq x(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(((defpackage.afhf) this.a).c(), new vfw(phoneAccountHandle, 6), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    public final void z(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            ((j$.util.concurrent.ConcurrentHashMap) this.b).remove(phoneAccountHandle);
        }
    }

    public rsr(defpackage.gpd gpdVar, defpackage.aolr aolrVar, byte[] bArr) {
        defpackage.aooh.f(gpdVar, "callLogRepository");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        this.b = gpdVar;
        this.a = aolrVar;
    }

    public rsr(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public rsr(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public rsr(java.lang.Object obj, java.lang.Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public rsr(java.lang.String str, defpackage.aonj aonjVar) {
        this.a = str;
        this.b = new defpackage.ddz(aonjVar, 15);
    }

    public rsr(java.util.Set set, defpackage.rln rlnVar) {
        defpackage.aooh.f(set, "eligibleIdProviders");
        defpackage.aooh.f(rlnVar, "snapshot");
        this.a = set;
        this.b = rlnVar;
    }

    public rsr(defpackage.kaw kawVar, defpackage.kaw kawVar2) {
        this.a = kawVar;
        this.b = kawVar2;
    }

    public rsr(android.content.Context context, defpackage.aoss aossVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = context;
        this.a = aossVar;
    }

    public rsr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, char[] cArr, byte[] bArr) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
    }

    public rsr(defpackage.aoss aossVar, defpackage.oko okoVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = aossVar;
        this.b = okoVar;
    }

    public rsr(defpackage.aoss aossVar, defpackage.zpm zpmVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        this.a = aossVar;
        this.b = zpmVar;
    }

    public rsr(defpackage.gbr gbrVar, defpackage.aomy aomyVar) {
        defpackage.gat gatVar = new defpackage.gat(aomyVar instanceof defpackage.gdn ? new defpackage.gbp((defpackage.gdn) aomyVar, 0) : new defpackage.gbq(aomyVar, null), gbrVar);
        this.a = gatVar;
        this.b = gatVar.e;
    }

    public rsr(defpackage.tts ttsVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = ttsVar;
        this.a = aossVar;
    }

    public rsr(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public rsr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public rsr(defpackage.aw awVar, defpackage.ajwr ajwrVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        this.b = awVar;
        this.a = ajwrVar;
    }

    public rsr(defpackage.kdw kdwVar, defpackage.aoss aossVar) {
        if (kdwVar == null) {
            defpackage.aooh.i("dataRepository");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = kdwVar;
        this.a = aossVar;
    }

    public rsr(defpackage.tvd tvdVar) {
        this.a = new defpackage.ajwr();
        this.b = tvdVar;
    }

    public rsr(defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableVvmServiceObjectCache");
        }
        this.a = aoinVar;
        this.b = new j$.util.concurrent.ConcurrentHashMap();
    }

    public rsr(defpackage.aoin aoinVar, defpackage.moe moeVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallLogIntegration");
        }
        if (moeVar == null) {
            defpackage.aooh.i("dobbyCallLogDataIntegration");
        }
        this.a = aoinVar;
        this.b = moeVar;
    }

    public rsr(defpackage.rlv rlvVar, defpackage.gpd gpdVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.a = rlvVar;
        this.b = gpdVar;
    }

    public rsr(defpackage.rsr rsrVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = rsrVar;
        this.a = aossVar;
    }

    public rsr(byte[] bArr) {
        this.b = new defpackage.acc(0);
        this.a = new java.util.HashMap();
    }

    public rsr(android.content.Context context, android.app.NotificationManager notificationManager) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.b = context;
        this.a = notificationManager;
    }

    public rsr(defpackage.aoss aossVar, defpackage.zpm zpmVar, defpackage.aoin aoinVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("useCoroutinesLaunch");
        }
        this.a = aossVar;
        this.b = zpmVar;
    }

    public rsr(defpackage.gtr gtrVar, defpackage.gou gouVar) {
        if (gtrVar == null) {
            defpackage.aooh.i("processor");
        }
        if (gouVar == null) {
            defpackage.aooh.i("workTaskExecutor");
        }
        this.b = gtrVar;
        this.a = gouVar;
    }

    public rsr(defpackage.zzx zzxVar, defpackage.kaw kawVar) {
        this.a = kawVar;
        this.b = new defpackage.aoiy(new defpackage.jza(zzxVar, 14));
    }

    public rsr(defpackage.aogc aogcVar, defpackage.aoin aoinVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableNationalFormatPhoneLookup");
        }
        this.a = aogcVar;
        this.b = aoinVar;
    }

    public rsr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, byte[] bArr, byte[] bArr2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public rsr(defpackage.aolr aolrVar, android.content.pm.PackageManager packageManager) {
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (packageManager == null) {
            defpackage.aooh.i("packageManager");
        }
        this.b = aolrVar;
        this.a = packageManager;
    }

    public rsr(defpackage.gpd gpdVar, defpackage.aolr aolrVar) {
        if (gpdVar == null) {
            defpackage.aooh.i("callLogRepository");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = gpdVar;
        this.a = aolrVar;
    }

    public rsr(java.lang.String str, java.lang.String str2, byte[] bArr) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        if (str2 == null) {
            defpackage.aooh.i("workSpecId");
        }
        this.b = str;
        this.a = str2;
    }

    public rsr(defpackage.aoin aoinVar, defpackage.zjv zjvVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("mobileDataDownload");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("singletonScopedExternalsLogging");
        }
        this.a = aoinVar;
        this.b = zjvVar;
    }

    public rsr(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            defpackage.aooh.i("tag");
        }
        if (str2 == null) {
            defpackage.aooh.i("workSpecId");
        }
        this.b = str;
        this.a = str2;
    }

    public rsr(defpackage.srl srlVar, defpackage.aoss aossVar, defpackage.aazc aazcVar) {
        if (srlVar == null) {
            defpackage.aooh.i("dataRepository");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = srlVar;
        this.a = aossVar;
    }

    public rsr(defpackage.zjm zjmVar, defpackage.aoss aossVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        this.a = zjmVar;
        this.b = aossVar;
    }

    public rsr(android.content.Context context, defpackage.ipc ipcVar) {
        defpackage.aooh.f(context, "appContext");
        this.b = context;
        this.a = ipcVar;
    }

    public rsr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, byte[] bArr) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
    }

    public rsr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, byte[] bArr, char[] cArr) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public rsr(defpackage.aoss aossVar, defpackage.zzx zzxVar) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = aossVar;
        this.b = zzxVar;
    }

    public rsr(defpackage.zjm zjmVar, defpackage.aoss aossVar, byte[] bArr) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = zjmVar;
        this.a = aossVar;
    }

    public rsr(defpackage.aolr aolrVar, java.util.Map map) {
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.a = aolrVar;
        this.b = map;
    }

    public rsr(defpackage.zzx zzxVar) {
        this.b = zzxVar;
        this.a = new defpackage.aoiy(new defpackage.jza(this, 20));
    }

    public rsr() {
        this.b = new java.lang.StringBuilder();
        this.a = new java.util.ArrayList();
    }

    public rsr(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, char[] cArr) {
        aoinVar.getClass();
        this.b = aoinVar;
        this.a = aoinVar2;
    }

    public rsr(defpackage.rsr rsrVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.b = sb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        sb.append((java.lang.String) rsrVar.b);
        java.util.Collections.addAll(arrayList, (java.lang.Object[]) rsrVar.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public rsr(java.lang.String str, java.util.Collection collection) {
        this.b = new java.lang.StringBuilder();
        this.a = new java.util.ArrayList();
        if (str != null) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == '?') {
                    i++;
                }
            }
            if (i == (collection != null ? collection.size() : 0)) {
                ((java.lang.StringBuilder) this.b).append(S(str));
                if (collection != null) {
                    this.a.addAll(collection);
                    return;
                }
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }
    }
}
