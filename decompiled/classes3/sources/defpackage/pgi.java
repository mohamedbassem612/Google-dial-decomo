package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgi {
    public final java.lang.Object a;
    public final java.lang.Object b;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Iterable, java.lang.Object] */
    public pgi(java.util.Set set, byte[] bArr) {
        aooh.f(set, "definingEventSet");
        this.b = set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ajsz.bv(arrayList, (java.lang.Iterable) ((aacy) it.next()).b);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(arrayList, 10)), 16));
        for (java.lang.Object obj : arrayList) {
            linkedHashMap.put(obj, java.lang.Boolean.FALSE);
        }
        this.a = ajsz.aT(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecx, java.lang.Object] */
    private final java.lang.Object C(aoln aolnVar) {
        return aoov.au(this.b.b(), aolnVar);
    }

    private final defpackage.acuh D(java.lang.String str) {
        for (defpackage.acuh acuhVar : ((defpackage.acui) this.a).h) {
            if (acuhVar.c.equals(str)) {
                return acuhVar;
            }
        }
        throw new java.lang.IllegalStateException("no ClientFile for ".concat(java.lang.String.valueOf(str)));
    }

    public final java.lang.String A() {
        return ((llv) this.b).b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq B(java.lang.String str) {
        return ahvr.E(new jnv(this, str, 20, (byte[]) null), (java.util.concurrent.Executor) this.b);
    }

    public final void a() {
        ((java.util.concurrent.atomic.AtomicBoolean) this.a).set(false);
        ((zpz) this.b).a(ajcm.a);
    }

    public final boolean b() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final ajcq c() {
        return aosv.F((aoss) this.a, 0, new oxe(this, (aoln) null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.oxd oxdVar;
        if (aolnVar instanceof defpackage.oxd) {
            oxdVar = (defpackage.oxd) aolnVar;
            int i = oxdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxdVar.b = i - Integer.MIN_VALUE;
            } else {
                oxdVar = new defpackage.oxd(this, aolnVar);
            }
        } else {
            oxdVar = new defpackage.oxd(this, aolnVar);
        }
        java.lang.Object objAu = oxdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oxdVar.b;
        if (i2 == 0) {
            aooc.af(objAu);
            aoxh aoxhVarB = this.b.b();
            oxdVar.b = 1;
            objAu = aoov.au(aoxhVarB, oxdVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAu);
        }
        defpackage.owy owyVarB = defpackage.owy.b(((owz) objAu).b);
        return owyVarB == null ? defpackage.owy.UNRECOGNIZED : owyVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object e(defpackage.owy owyVar, aoln aolnVar) {
        defpackage.oxf oxfVar;
        if (aolnVar instanceof defpackage.oxf) {
            oxfVar = (defpackage.oxf) aolnVar;
            int i = oxfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxfVar.b = i - Integer.MIN_VALUE;
            } else {
                oxfVar = new defpackage.oxf(this, aolnVar);
            }
        } else {
            oxfVar = new defpackage.oxf(this, aolnVar);
        }
        java.lang.Object obj = oxfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oxfVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r5 = this.b;
            nut nutVar = new nut(owyVar, (aoln) null, 2);
            oxfVar.b = 1;
            if (r5.a(nutVar, oxfVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        oim oimVar;
        if (aolnVar instanceof oim) {
            oimVar = (oim) aolnVar;
            int i = oimVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oimVar.b = i - Integer.MIN_VALUE;
            } else {
                oimVar = new oim(this, aolnVar);
            }
        } else {
            oimVar = new oim(this, aolnVar);
        }
        java.lang.Object objC = oimVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oimVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return ((java.lang.Boolean) objC).booleanValue() ? defpackage.amql.ENROLLMENT_STATUS_MANUAL_OPTED_IN : defpackage.amql.ENROLLMENT_STATUS_MANUAL_OPTED_OUT;
        }
        aooc.af(objC);
        oimVar.b = 1;
        objC = C(oimVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        if (!((oit) objC).f) {
            return defpackage.amql.ENROLLMENT_STATUS_UNKNOWN;
        }
        oimVar.b = 2;
        objC = h(oimVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objC).booleanValue()) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        oin oinVar;
        if (aolnVar instanceof oin) {
            oinVar = (oin) aolnVar;
            int i = oinVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oinVar.b = i - Integer.MIN_VALUE;
            } else {
                oinVar = new oin(this, aolnVar);
            }
        } else {
            oinVar = new oin(this, aolnVar);
        }
        java.lang.Object objC = oinVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oinVar.b;
        if (i2 == 0) {
            aooc.af(objC);
            oinVar.b = 1;
            objC = C(oinVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return java.lang.Boolean.valueOf(((oit) objC).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        oio oioVar;
        if (aolnVar instanceof oio) {
            oioVar = (oio) aolnVar;
            int i = oioVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oioVar.b = i - Integer.MIN_VALUE;
            } else {
                oioVar = new oio(this, aolnVar);
            }
        } else {
            oioVar = new oio(this, aolnVar);
        }
        java.lang.Object objC = oioVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oioVar.b;
        if (i2 == 0) {
            aooc.af(objC);
            oioVar.b = 1;
            objC = C(oioVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return java.lang.Boolean.valueOf(((oit) objC).c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        oip oipVar;
        if (aolnVar instanceof oip) {
            oipVar = (oip) aolnVar;
            int i = oipVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oipVar.b = i - Integer.MIN_VALUE;
            } else {
                oipVar = new oip(this, aolnVar);
            }
        } else {
            oipVar = new oip(this, aolnVar);
        }
        java.lang.Object objC = oipVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oipVar.b;
        if (i2 == 0) {
            aooc.af(objC);
            oipVar.b = 1;
            objC = C(oipVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return java.lang.Boolean.valueOf(((oit) objC).e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [ecx, java.lang.Object] */
    public final java.lang.Object j(boolean z, aoln aolnVar) {
        oiq oiqVar;
        if (aolnVar instanceof oiq) {
            oiqVar = (oiq) aolnVar;
            int i = oiqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oiqVar.c = i - Integer.MIN_VALUE;
            } else {
                oiqVar = new oiq(this, aolnVar);
            }
        } else {
            oiqVar = new oiq(this, aolnVar);
        }
        java.lang.Object obj = oiqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = oiqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r8 = this.b;
            jbl jblVar = new jbl(z, (aoln) null, 5, (boolean[]) null);
            oiqVar.a = z;
            oiqVar.c = 1;
            if (r8.a(jblVar, oiqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = oiqVar.a;
            aooc.af(obj);
        }
        if (z) {
            defpackage.rju rjuVar = (defpackage.rju) this.a;
            agsm.i(826, ((defpackage.sna) rjuVar.c).a(), "capabilityPublisherSynclet failed", new java.lang.Object[0]);
            agsm.i(827, ((defpackage.sng) rjuVar.a).a(), "batchCapabilityPullerSynclet failed", new java.lang.Object[0]);
            agsm.i(828, ((defpackage.snt) rjuVar.b).a(), "localNetworkIdentityHasRcsSynclet failed", new java.lang.Object[0]);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object k(boolean z, aoln aolnVar) {
        oir oirVar;
        if (aolnVar instanceof oir) {
            oirVar = (oir) aolnVar;
            int i = oirVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oirVar.b = i - Integer.MIN_VALUE;
            } else {
                oirVar = new oir(this, aolnVar);
            }
        } else {
            oirVar = new oir(this, aolnVar);
        }
        java.lang.Object obj = oirVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oirVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r5 = this.b;
            jbl jblVar = new jbl(z, (aoln) null, 6, (float[]) null);
            oirVar.b = 1;
            if (r5.a(jblVar, oirVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object l(boolean z, aoln aolnVar) {
        ois oisVar;
        if (aolnVar instanceof ois) {
            oisVar = (ois) aolnVar;
            int i = oisVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oisVar.b = i - Integer.MIN_VALUE;
            } else {
                oisVar = new ois(this, aolnVar);
            }
        } else {
            oisVar = new ois(this, aolnVar);
        }
        java.lang.Object obj = oisVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oisVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r5 = this.b;
            jbl jblVar = new jbl(z, (aoln) null, 7, (byte[][]) null);
            oisVar.b = 1;
            if (r5.a(jblVar, oisVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(aoln aolnVar) {
        nue nueVar;
        if (aolnVar instanceof nue) {
            nueVar = (nue) aolnVar;
            int i = nueVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nueVar.b = i - Integer.MIN_VALUE;
            } else {
                nueVar = new nue(this, aolnVar);
            }
        } else {
            nueVar = new nue(this, aolnVar);
        }
        java.lang.Object objD = nueVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nueVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = ((defpackage.afpl) this.b).X();
            nueVar.b = 1;
            objD = aosv.D(ajcqVarX, nueVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAc = ((defpackage.nud) aooc.ar(objD, defpackage.nud.class)).ac();
        nueVar.b = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAc, nueVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(aoln aolnVar) {
        nuf nufVar;
        if (aolnVar instanceof nuf) {
            nufVar = (nuf) aolnVar;
            int i = nufVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nufVar.b = i - Integer.MIN_VALUE;
            } else {
                nufVar = new nuf(this, aolnVar);
            }
        } else {
            nufVar = new nuf(this, aolnVar);
        }
        java.lang.Object objA = nufVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nufVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return afsq.cu((nmz) objA);
        }
        aooc.af(objA);
        java.lang.Object obj = this.a;
        nufVar.b = 1;
        objA = ((ogj) obj).a(nufVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        nmo nmoVarB = nmo.b(((nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = nmo.q;
        }
        if (nmoVarB != nmo.i) {
            return null;
        }
        nufVar.b = 2;
        objA = m(nufVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        return afsq.cu((nmz) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ucr] */
    public final java.lang.Object o(java.lang.String str, java.lang.String str2, defpackage.rmy rmyVar, long j, aoln aolnVar) {
        nqa nqaVar;
        if (aolnVar instanceof nqa) {
            nqaVar = (nqa) aolnVar;
            int i = nqaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqaVar.c = i - Integer.MIN_VALUE;
            } else {
                nqaVar = new nqa(this, aolnVar);
            }
        } else {
            nqaVar = new nqa(this, aolnVar);
        }
        java.lang.Object obj = nqaVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nqaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                j = nqaVar.a;
                rmyVar = nqaVar.f;
                str2 = nqaVar.e;
                str = nqaVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        java.lang.Object obj2 = this.a;
        npw npwVarAw = mni.aw(nsm.a.m());
        npwVarAw.x(false);
        nsm nsmVarT = npwVarAw.t();
        nqaVar.d = str;
        nqaVar.e = str2;
        nqaVar.f = rmyVar;
        nqaVar.a = j;
        nqaVar.c = 1;
        if (((nri) obj2).k(j, nsmVarT, nqaVar) == aoluVar) {
            return aoluVar;
        }
        ?? r6 = this.b;
        int iAD = a.aD(rmyVar.c);
        int i3 = iAD != 0 ? iAD : 1;
        aooh.f(str, "countryIso");
        aooh.f(str2, "normalizedNumber");
        defpackage.uzx uzxVarCd = wsc.cd(defpackage.ucq.a.m());
        uzxVarCd.p(j);
        uzxVarCd.q(3);
        uzxVarCd.r(str);
        defpackage.uzx uzxVarA = airh.A(aivu.a.m());
        uzxVarA.aC(str2);
        uzxVarA.aG(wsc.bH(3));
        uzxVarA.aF(i3);
        uzxVarA.aA(defpackage.rms.UNKNOWN_LOOKUP_RESULT_TYPE);
        uzxVarA.aB(rmt.a);
        uzxVarA.aE();
        uzxVarA.aD(aivt.d);
        uzxVarCd.s(uzxVarA.az());
        akzx akzxVarP = uzxVarCd.o().p();
        aooh.e(akzxVarP, "toBuilder(...)");
        ajcq ajcqVarE = r6.e(akzxVarP);
        nqaVar.d = null;
        nqaVar.e = null;
        nqaVar.f = null;
        nqaVar.c = 2;
        if (aosv.D(ajcqVarE, nqaVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:20:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(aoln r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nez
            if (r0 == 0) goto L13
            r0 = r6
            nez r0 = (nez) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            nez r0 = new nez
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            aolu r1 = aolu.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            aooc.af(r6)
            goto L7d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            aooc.af(r6)
            java.lang.Object r5 = r5.a
            zpm r5 = (zpm) r5
            aihd r5 = r5.a()
            java.lang.String r6 = "getAllCallScopes(...)"
            aooh.e(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r2 = 10
            int r2 = ajsz.bl(r5, r2)
            r6.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
            r2 = r5
            r5 = r6
        L56:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L86
            java.lang.Object r6 = r2.next()
            apqr r6 = (defpackage.apqr) r6
            java.lang.Class<ney> r4 = defpackage.ney.class
            java.lang.Object r6 = r6.a(r4)
            ney r6 = (defpackage.ney) r6
            ogj r6 = r6.cI()
            r0.a = r5
            r0.b = r2
            r0.c = r5
            r0.e = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto Laa
            r4 = r5
        L7d:
            nmu r6 = (nmu) r6
            alat r6 = r6.i
            r5.add(r6)
            r5 = r4
            goto L56
        L86:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L8f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L8f
            r6.add(r0)
            goto L8f
        La6:
            java.lang.Object r1 = ajsz.bG(r6)
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgi.p(aoln):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object q(int i, aoln aolnVar) {
        return aoov.aj((aolr) this.b, new hxo(this, i, (aoln) null, 7), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final ajcq r() {
        return aosv.F((aoss) this.a, 0, new lve(this, (aoln) null, 10), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(aoln aolnVar) {
        mjn mjnVar;
        if (aolnVar instanceof mjn) {
            mjnVar = (mjn) aolnVar;
            int i = mjnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjnVar.b = i - Integer.MIN_VALUE;
            } else {
                mjnVar = new mjn(this, aolnVar);
            }
        } else {
            mjnVar = new mjn(this, aolnVar);
        }
        java.lang.Object objD = mjnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mjnVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            j$.util.Optional optionalG = ((zjm) this.b).g();
            aooh.e(optionalG, "getFeature(...)");
            zzx zzxVar = (zzx) aooh.q(optionalG);
            if (zzxVar == null) {
                return java.lang.Boolean.FALSE;
            }
            ajcq ajcqVarR = zzxVar.r();
            mjnVar.b = 1;
            objD = aosv.D(ajcqVarR, mjnVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(((wgi) objD).c);
    }

    public final void t() {
        ((aogc) this.b).s(ajcm.a, lzz.b);
    }

    public final defpackage.zrx u(kiu kiuVar) {
        aooh.f(kiuVar, "coalescedRow");
        defpackage.zoe zoeVarCi = aehj.ci(defpackage.zrx.a.m());
        java.lang.String string = uyb.b(kiuVar.g).toString();
        aooh.e(string, "toString(...)");
        zoeVarCi.e(string);
        defpackage.uzx uzxVarCu = aehj.cu(defpackage.zsf.a.m());
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        aooh.e(kiwVar, "getNumberAttributes(...)");
        uzxVarCu.aa(true != kiwVar.j ? 5 : 4);
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        java.lang.String str = kiwVar2.g;
        aooh.e(str, "getLookupUri(...)");
        uzxVarCu.U(str.length() > 0);
        defpackage.vaa vaaVarD = defpackage.abxl.D(defpackage.abvz.a.m());
        vaaVarD.U(((aeqx) this.b).d(kiuVar, true).toString());
        kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = kiw.a;
        }
        java.lang.String str2 = kiwVar3.e;
        aooh.e(str2, "getPhotoUri(...)");
        vaaVarD.V(str2);
        alad aladVarP = ((gpd) this.a).a(kiuVar, 2).p();
        aooh.e(aladVarP, "build(...)");
        defpackage.abwd abwdVar = (defpackage.abwd) aladVarP;
        aooh.f(abwdVar, "value");
        akzx akzxVar = (akzx) vaaVarD.a;
        akzxVar.u();
        defpackage.abvz abvzVar = (defpackage.abvz) akzxVar.b;
        j$.util.Objects.requireNonNull(abwdVar);
        abvzVar.f = abwdVar;
        abvzVar.b |= 8;
        kiw kiwVar4 = kiuVar.r;
        if (kiwVar4 == null) {
            kiwVar4 = kiw.a;
        }
        java.lang.String str3 = kiwVar4.h;
        aooh.e(str3, "getNumberTypeLabel(...)");
        vaaVarD.T(str3);
        kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar5.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        boolean z = rmtVarB != rmt.a;
        akzxVar.u();
        defpackage.abvz abvzVar2 = (defpackage.abvz) akzxVar.b;
        abvzVar2.b |= 16;
        abvzVar2.g = z;
        uzxVarCu.W(vaaVarD.S());
        zoeVarCi.d(uzxVarCu.T());
        return zoeVarCi.a();
    }

    public final llw v(llq llqVar, lll lllVar) {
        for (llr llrVar : llqVar.b) {
            if (new alam(llrVar.c, llr.a).contains(lllVar)) {
                return new llw(android.net.Uri.parse(D(llrVar.d).d), llrVar.e);
            }
        }
        throw new java.lang.IllegalStateException("no DisclosureTextDefinition for ".concat(java.lang.String.valueOf(lllVar.name())));
    }

    public final llw w(lls llsVar, lll lllVar) {
        for (llt lltVar : llsVar.b) {
            if (new alam(lltVar.c, llt.a).contains(lllVar)) {
                return new llw(android.net.Uri.parse(D(lltVar.d).d), lltVar.e);
            }
        }
        throw new java.lang.IllegalStateException("no LifecycleTextDefinition for ".concat(java.lang.String.valueOf(lllVar.name())));
    }

    public final llw x(lll lllVar) {
        lls llsVar = ((llv) this.b).h;
        if (llsVar == null) {
            llsVar = lls.a;
        }
        return w(llsVar, lllVar);
    }

    public final llw y(lll lllVar) {
        llq llqVar = ((llv) this.b).c;
        if (llqVar == null) {
            llqVar = llq.a;
        }
        return v(llqVar, lllVar);
    }

    public final aify z(lll lllVar) {
        j$.util.Optional optionalEmpty;
        aift aiftVar = new aift(4);
        for (llo lloVar : ((llv) this.b).i) {
            java.util.Iterator it = lloVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optionalEmpty = j$.util.Optional.empty();
                    break;
                }
                llp llpVar = (llp) it.next();
                if (new alam(llpVar.c, llp.a).contains(lllVar)) {
                    optionalEmpty = j$.util.Optional.of(llpVar);
                    break;
                }
            }
            if (optionalEmpty.isPresent()) {
                defpackage.acuh acuhVarD = D(((llp) optionalEmpty.orElseThrow()).d);
                akzx akzxVarM = lgk.b.m();
                alam alamVar = new alam(lloVar.d, llo.a);
                akzxVarM.u();
                lgk lgkVar = akzxVarM.b;
                alak alakVar = lgkVar.e;
                if (!alakVar.c()) {
                    lgkVar.e = alad.H(alakVar);
                }
                java.util.Iterator it2 = alamVar.iterator();
                while (it2.hasNext()) {
                    lgkVar.e.g(((lln) it2.next()).d);
                }
                java.lang.String str = ((llp) optionalEmpty.orElseThrow()).e;
                akzxVarM.u();
                lgk lgkVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                lgkVar2.c |= 1;
                lgkVar2.d = str;
                java.lang.String str2 = acuhVarD.d;
                akzxVarM.u();
                lgk lgkVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                lgkVar3.c |= 2;
                lgkVar3.f = str2;
                java.lang.String str3 = ((llp) optionalEmpty.orElseThrow()).f;
                akzxVarM.u();
                lgk lgkVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                lgkVar4.c |= 4;
                lgkVar4.g = str3;
                java.lang.String str4 = lloVar.c;
                akzxVarM.u();
                lgk lgkVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                lgkVar5.c |= 8;
                lgkVar5.h = str4;
                aiftVar.i(akzxVarM.p());
            }
        }
        return aiftVar.h();
    }

    public pgi(aolr aolrVar, zpm zpmVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(zpmVar, "callScopes");
        this.b = aolrVar;
        this.a = zpmVar;
    }

    public pgi(ecx ecxVar, java.util.concurrent.ExecutorService executorService, aoss aossVar) {
        aooh.f(ecxVar, "dataStore");
        aooh.f(executorService, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        this.b = ecxVar;
        this.a = aossVar;
    }

    public pgi(ecx ecxVar, defpackage.rju rjuVar) {
        aooh.f(ecxVar, "dataStore");
        this.b = ecxVar;
        this.a = rjuVar;
    }

    public pgi(java.lang.Object obj, alad aladVar) {
        this.b = obj;
        this.a = aladVar;
    }

    public pgi(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public pgi(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public pgi(lbi lbiVar, aazc aazcVar) {
        this.a = aazcVar;
        this.b = lbiVar;
    }

    public pgi(lxu lxuVar, ucm ucmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        this.b = lxuVar;
        this.a = ucmVar;
    }

    public pgi(met metVar, aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = metVar;
        this.b = aossVar;
    }

    public pgi(ogj ogjVar, defpackage.afpl afplVar) {
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.a = ogjVar;
        this.b = afplVar;
    }

    public pgi(defpackage.pub pubVar, aogc aogcVar) {
        aooh.f(aogcVar, "resultPropagator");
        this.a = pubVar;
        this.b = aogcVar;
    }

    public pgi(ucr ucrVar, nri nriVar) {
        aooh.f(nriVar, "dobbyDatabase");
        this.b = ucrVar;
        this.a = nriVar;
    }

    public pgi(zjm zjmVar, aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.b = zjmVar;
        this.a = aossVar;
    }

    public pgi(zpm zpmVar, gpd gpdVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.b = zpmVar;
        this.a = gpdVar;
    }

    public pgi(ajct ajctVar) {
        this.a = new java.util.HashSet();
        this.b = new ajdc(ajctVar);
    }

    public pgi(aoin aoinVar, aoin aoinVar2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public pgi(aoin aoinVar, aoin aoinVar2, byte[] bArr) {
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public pgi(com.android.dialer.incall.buttonbar.GenericButtonBarView genericButtonBarView) {
        this.a = genericButtonBarView;
        com.android.dialer.incall.buttonbar.GenericButtonBarView.inflate(genericButtonBarView.getContext(), 2131624043, genericButtonBarView);
        android.view.View viewFindViewById = genericButtonBarView.findViewById(2131427622);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.b = (com.google.android.libraries.communications.ux.views.buttonbar.ButtonBarGrid) viewFindViewById;
    }

    public pgi(android.content.Context context, aolr aolrVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        this.a = context;
        this.b = aolrVar;
    }

    public pgi(php phpVar) {
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
        this.a = phpVar;
    }

    public pgi(zpz zpzVar, byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.b = zpzVar;
    }

    public pgi(zpz zpzVar) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = zpzVar;
    }

    public pgi(java.util.Set set) {
        this.b = set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ajsz.bv(arrayList, ((zam) it.next()).a);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(arrayList, 10)), 16));
        for (java.lang.Object obj : arrayList) {
            linkedHashMap.put(obj, java.lang.Boolean.FALSE);
        }
        this.a = ajsz.aT(linkedHashMap);
    }
}
