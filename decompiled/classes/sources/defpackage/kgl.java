package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgl {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public kgl(defpackage.zzx zzxVar) {
        this.a = zzxVar;
        defpackage.aigf aigfVarK = zzxVar.k();
        defpackage.aooh.e(aigfVarK, "get(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(aigfVarK.size()));
        for (java.util.Map.Entry entry : aigfVarK.entrySet()) {
            linkedHashMap.put(entry.getKey(), (defpackage.kfy) ((defpackage.aoin) entry.getValue()).a());
        }
        this.b = linkedHashMap;
        java.util.List<java.util.Map.Entry> listBX = defpackage.ajsz.bX(linkedHashMap.entrySet(), new defpackage.beg(5));
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listBX, 10));
        for (java.util.Map.Entry entry2 : listBX) {
            defpackage.kgc kgcVar = (defpackage.kgc) entry2.getKey();
            arrayList.add(new defpackage.kgk(kgcVar, kgcVar == defpackage.kgc.a, ((defpackage.kfy) entry2.getValue()).a().a, new defpackage.bev(this, kgcVar, 13)));
        }
        defpackage.aozj aozjVar = new defpackage.aozj(arrayList);
        this.d = aozjVar;
        this.c = new defpackage.aoys(aozjVar, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    private final java.lang.Object M(defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.ahvr.ag(this.b, (defpackage.ahda) this.c, new jlk(aonjVar, (defpackage.aoln) null, 8)).a(aolnVar);
    }

    public final java.lang.Class A() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = ((java.lang.ClassLoader) this.c).loadClass("androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean B() {
        if (defpackage.gus.B("ActivityEmbeddingComponent#setEmbeddingRules is not valid", new defpackage.ghb(this, 17)) && defpackage.gus.B("ActivityEmbeddingComponent#isActivityEmbedded is not valid", new defpackage.ghb(this, 14))) {
            int i = 15;
            if (defpackage.gus.B("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new defpackage.ghb(this, i)) && defpackage.gus.B("SplitRule#getSplitRatio is not valid", new defpackage.gpf(4))) {
                int i2 = 12;
                if (defpackage.gus.B("SplitRule#getLayoutDirection is not valid", new defpackage.gpf(i2)) && defpackage.gus.B("Class ActivityRule is not valid", new defpackage.giy(7)) && defpackage.gus.B("Class ActivityRule.Builder is not valid", new defpackage.giy(16)) && defpackage.gus.B("Class SplitInfo is not valid", new defpackage.giy(i2)) && defpackage.gus.B("Class SplitPairRule is not valid", new defpackage.gpf(i)) && defpackage.gus.B("Class SplitPairRule.Builder is not valid", new defpackage.giy(3)) && defpackage.gus.B("Class SplitPlaceholderRule is not valid", new defpackage.gpf(8)) && defpackage.gus.B("Class SplitPlaceholderRule.Builder is not valid", new defpackage.giy(9))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean C() {
        if (B()) {
            int i = 16;
            if (defpackage.gus.B("ActivityEmbeddingComponent#setSplitInfoCallback is not valid", new defpackage.ghb(this, i)) && defpackage.gus.B("ActivityEmbeddingComponent#clearSplitInfoCallback is not valid", new defpackage.ghb(this, 11)) && defpackage.gus.B("ActivityEmbeddingComponent#setSplitAttributesCalculator is not valid", new defpackage.ghb(this, 18)) && defpackage.gus.B("SplitInfo#getSplitAttributes is not valid", new defpackage.gpf(i)) && defpackage.gus.B("SplitPlaceholderRule#getFinishPrimaryWithPlaceholder is not valid", new defpackage.giy(8))) {
                int i2 = 5;
                if (defpackage.gus.B("SplitRule#getDefaultSplitAttributes is not valid", new defpackage.gpf(i2)) && defpackage.gus.B("Class ActivityRule.Builder is not valid", new defpackage.gpf(1)) && defpackage.gus.B("Class EmbeddingRule is not valid", new defpackage.giy(i2))) {
                    int i3 = 2;
                    if (defpackage.gus.B("Class SplitAttributes is not valid", new defpackage.gpf(i3)) && defpackage.gus.B("Class SplitAttributesCalculatorParams is not valid", new defpackage.giy(13)) && defpackage.gus.B("Class SplitAttributes.SplitType is not valid", new defpackage.gpf(3)) && defpackage.gus.B("Class SplitPairRule.Builder is not valid", new defpackage.giy(i3)) && defpackage.gus.B("Class SplitPlaceholderRule.Builder is not valid", new defpackage.gpf(10))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean D() {
        return C() && defpackage.gus.B("#invalidateTopVisibleSplitAttributes is not valid", new defpackage.ghb(this, 13)) && defpackage.gus.B("#updateSplitAttributes is not valid", new defpackage.ghb(this, 12)) && defpackage.gus.B("SplitInfo#getToken is not valid", new defpackage.giy(6));
    }

    public final boolean E() {
        int i = 0;
        if (!D() || !defpackage.gus.B("ActivityStack#getActivityToken is not valid", new defpackage.gpf(6)) || !defpackage.gus.B("registerActivityStackCallback is not valid", new defpackage.ghb(this, 19)) || !defpackage.gus.B("unregisterActivityStackCallback is not valid", new defpackage.gpg(this, i)) || !defpackage.gus.B("#pin(unPin)TopActivityStack is not valid", new defpackage.ghb(this, 8))) {
            return false;
        }
        int i2 = 20;
        return defpackage.gus.B("updateSplitAttributes is not valid", new defpackage.ghb(this, i2)) && defpackage.gus.B("SplitInfo#getSplitInfoToken is not valid", new defpackage.giy(4)) && defpackage.gus.B("Class AnimationBackground is not valid", new defpackage.giy(i2)) && defpackage.gus.B("Class ActivityStack.Token is not valid", new defpackage.gpf(17)) && defpackage.gus.B("Class WindowAttributes is not valid", new defpackage.giy(14)) && defpackage.gus.B("SplitInfo.Token is not valid", new defpackage.giy(15));
    }

    public final boolean F() {
        if (E() && defpackage.gus.B("ActivityEmbeddingComponent#getEmbeddedActivityWindowInfo is not valid", new defpackage.ghb(this, 10)) && defpackage.gus.B("ActivityEmbeddingComponent#setEmbeddedActivityWindowInfoCallback is not valid", new defpackage.ghb(this, 7))) {
            int i = 9;
            if (defpackage.gus.B("ActivityEmbeddingComponent#clearEmbeddedActivityWindowInfoCallback is not valid", new defpackage.ghb(this, i)) && defpackage.gus.B("SplitAttributes#getDividerAttributes is not valid", new defpackage.gpf(11)) && defpackage.gus.B("SplitAttributes#setDividerAttributes is not valid", new defpackage.giy(18)) && defpackage.gus.B("Class EmbeddedActivityWindowInfo is not valid", new defpackage.gpf(i)) && defpackage.gus.B("Class DividerAttributes is not valid", new defpackage.gpf(13)) && defpackage.gus.B("Class DividerAttributes.Builder is not valid", new defpackage.giy(17))) {
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        return F() && defpackage.gus.B("SplitAttributes#getAnimationParams is not valid", new defpackage.giy(10)) && defpackage.gus.B("SplitAttributes#setAnimationParams is not valid", new defpackage.gpf(14)) && defpackage.gus.B("DividerAttributes#isDraggingToFullscreenAllowed is not valid", new defpackage.gpf(7)) && defpackage.gus.B("DividerAttributes.Builder#setDraggingToFullscreenAllowed is not valid", new defpackage.giy(11)) && defpackage.gus.B("Class AnimationParams is not valid", new defpackage.gpf(0)) && defpackage.gus.B("Class AnimationParams.Builder is not valid", new defpackage.giy(19));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aomy, java.lang.Object] */
    public final defpackage.gag H() {
        return (defpackage.gag) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eoe, java.lang.Object] */
    public final defpackage.eoa I(defpackage.aopu aopuVar, java.lang.String str) {
        defpackage.eoa eoaVarK;
        synchronized (this.b) {
            java.util.Map map = ((defpackage.eoh) this.c).a;
            eoaVarK = (defpackage.eoa) map.get(str);
            if (!aopuVar.d(eoaVarK)) {
                defpackage.eos eosVar = new defpackage.eos((defpackage.eoq) this.d);
                eosVar.b(defpackage.eog.a, str);
                eoaVarK = defpackage.dzl.k(this.a, aopuVar, eosVar);
                if (eoaVarK == null) {
                    defpackage.aooh.i("viewModel");
                }
                defpackage.eoa eoaVar = (defpackage.eoa) map.put(str, eoaVarK);
                if (eoaVar != null) {
                    eoaVar.g();
                }
            } else if (eoaVarK == null) {
                defpackage.aooh.h("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
            }
        }
        return eoaVarK;
    }

    public final java.util.ArrayList J(java.lang.Object obj) {
        return (java.util.ArrayList) ((defpackage.aec) this.b).get(obj);
    }

    public final void K(java.lang.Object obj) {
        defpackage.aec aecVar = (defpackage.aec) this.b;
        if (aecVar.containsKey(obj)) {
            return;
        }
        aecVar.put(obj, null);
    }

    public final void L(java.lang.Object obj, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((defpackage.aec) this.b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                L(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.kfy a(defpackage.kgc kgcVar) {
        defpackage.kfy kfyVar = (defpackage.kfy) this.b.get(kgcVar);
        if (kfyVar != null) {
            return kfyVar;
        }
        throw new java.lang.IllegalStateException("can't find the selected filter");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq b(long j) {
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            return defpackage.ahvr.F(new jww(this, j, 0), this.a);
        }
        defpackage.acc accVar = new defpackage.acc(0);
        ?? r2 = this.d;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        java.util.Set set = (java.util.Set) r2.get(lValueOf);
        if (set != null) {
            accVar.addAll(set);
            ((java.util.Set) r2.get(lValueOf)).removeAll(set);
        }
        return defpackage.aiql.z(defpackage.aihd.o(accVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void c(long j, java.util.function.Consumer consumer) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        defpackage.akzx akzxVarM = ampl.a.m();
        ?? r0 = this.c;
        defpackage.akzx akzxVar = (defpackage.akzx) j$.util.Map.-EL.getOrDefault((java.util.Map) r0, lValueOf, akzxVarM);
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, akzxVar);
        r0.put(lValueOf, akzxVar);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void d(long j, int i) {
        jwv jwvVar = new jwv(this, i, j, 0);
        ?? r7 = this.a;
        defpackage.ajcq ajcqVarE = defpackage.ahvr.E(jwvVar, r7);
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        defpackage.agsm.i(181, ajcqVarE, "failed to update metrics for call created at %d", lValueOf);
        defpackage.agsm.i(182, defpackage.ahvr.E(new tbl(this, j, ajcqVarE, 1), r7), "failed to save the update metrics future for call created at %d", lValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(java.util.Collection collection, defpackage.aoln aolnVar) {
        jqx jqxVar;
        if (aolnVar instanceof jqx) {
            jqxVar = (jqx) aolnVar;
            int i = jqxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqxVar.b = i - Integer.MIN_VALUE;
            } else {
                jqxVar = new jqx(this, aolnVar);
            }
        } else {
            jqxVar = new jqx(this, aolnVar);
        }
        java.lang.Object obj = jqxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jqxVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!collection.isEmpty()) {
                bhp bhpVar = new bhp(collection, this, (defpackage.aoln) null, 11);
                jqxVar.b = 1;
                if (M(bhpVar, jqxVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final java.lang.Object f(defpackage.aoln aolnVar) {
        return M(new blq(this, (defpackage.aoln) null, 18), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, ztf ztfVar, defpackage.aoln aolnVar) {
        jra jraVar;
        if (aolnVar instanceof jra) {
            jraVar = (jra) aolnVar;
            int i = jraVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jraVar.b = i - Integer.MIN_VALUE;
            } else {
                jraVar = new jra(this, aolnVar);
            }
        } else {
            jraVar = new jra(this, aolnVar);
        }
        java.lang.Object obj = jraVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jraVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            jrc jrcVar = new jrc(this, j, ztfVar, (defpackage.aoln) null);
            jraVar.b = 1;
            if (M(jrcVar, jraVar) == aoluVar) {
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

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final long h() {
        if (!((defpackage.zzx) this.a).m()) {
            return ((java.lang.Long) this.c.a()).longValue();
        }
        ((defpackage.lpe) this.d).a();
        return 3000L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: jip */
    public final void i(java.util.List list) throws jip {
        try {
            ((defpackage.ojo) this.b).n("com.android.blockednumber", list);
        } catch (android.content.OperationApplicationException | android.os.RemoteException | java.lang.SecurityException e) {
            throw new jip(e);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v1, types: [aoin, java.lang.Object] */
    public final defpackage.ajcq j(defpackage.aifo aifoVar, java.lang.String str) {
        hsl hslVar = new hsl(this, aifoVar, str, 3, (byte[]) null);
        ?? r6 = this.d;
        defpackage.ajcq ajcqVarF = defpackage.ahvr.F(hslVar, r6);
        return ((java.lang.Boolean) this.c.a()).booleanValue() ? defpackage.ahvr.H(ajcqVarF, new iau(this, aifoVar, 4), r6) : ajcqVarF;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq k(defpackage.aifo aifoVar, java.lang.String str) {
        defpackage.jio jioVar = new defpackage.jio(this, aifoVar, str, 0);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), jioVar, 1));
        this.d.execute(ajdkVar);
        return ajdkVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq l(defpackage.aifo aifoVar, java.lang.String str) {
        return defpackage.ahvr.F(new hsl(this, aifoVar, str, 2, (byte[]) null), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(long j, defpackage.aoln aolnVar) {
        itg itgVar;
        if (aolnVar instanceof itg) {
            itgVar = (itg) aolnVar;
            int i = itgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                itgVar.b = i - Integer.MIN_VALUE;
            } else {
                itgVar = new itg(this, aolnVar);
            }
        } else {
            itgVar = new itg(this, aolnVar);
        }
        java.lang.Object obj = itgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = itgVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ity ityVar = new ity(j);
            itgVar.b = 1;
            if (((defpackage.itf) this.a).a(abxl.M(ityVar), itgVar) == aoluVar) {
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
    public final java.lang.Object n(java.util.Collection collection, defpackage.aoln aolnVar) {
        ith ithVar;
        if (aolnVar instanceof ith) {
            ithVar = (ith) aolnVar;
            int i = ithVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ithVar.b = i - Integer.MIN_VALUE;
            } else {
                ithVar = new ith(this, aolnVar);
            }
        } else {
            ithVar = new ith(this, aolnVar);
        }
        java.lang.Object obj = ithVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ithVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!collection.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(abxl.M(new ity(((java.lang.Number) it.next()).longValue())));
                }
                java.lang.Object obj2 = this.a;
                ithVar.b = 1;
                defpackage.itf itfVar = (defpackage.itf) obj2;
                if (defpackage.aoov.aj(itfVar.c, new ite(itfVar, arrayList, (defpackage.aoln) null, 1), ithVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final java.lang.Object o(defpackage.aoln aolnVar) {
        defpackage.itf itfVar = (defpackage.itf) this.a;
        return defpackage.aoov.aj(itfVar.c, new hnj(itfVar, (defpackage.aoln) null, 6), aolnVar);
    }

    public final java.lang.Object p(ity ityVar, defpackage.aoln aolnVar) {
        defpackage.itf itfVar = (defpackage.itf) this.a;
        return defpackage.aoov.aj(itfVar.c, new iki(itfVar, ityVar, (defpackage.aoln) null, 4), aolnVar);
    }

    public final java.lang.Object q(java.util.Set set, defpackage.aoln aolnVar) {
        defpackage.itf itfVar = (defpackage.itf) this.a;
        return defpackage.aoov.aj(itfVar.c, new ite(itfVar, set, (defpackage.aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object r(ity ityVar, java.lang.String str, java.lang.String str2, long j, defpackage.aoln aolnVar) {
        iti itiVar;
        if (aolnVar instanceof iti) {
            itiVar = (iti) aolnVar;
            int i = itiVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                itiVar.b = i - Integer.MIN_VALUE;
            } else {
                itiVar = new iti(this, aolnVar);
            }
        } else {
            itiVar = new iti(this, aolnVar);
        }
        java.lang.Object obj = itiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = itiVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj2 = this.a;
            afpl afplVar = new afpl(ityVar, new itc(ityVar, itx.a, str2, str, new java.lang.Long(j), 15992));
            itiVar.b = 1;
            if (((defpackage.itf) obj2).a(afplVar, itiVar) == aoluVar) {
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

    public final java.lang.Object s(ity ityVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return ((defpackage.itf) this.a).a(new afpl(ityVar, new itj(aonnVar, (defpackage.aoln) null, 0), (char[]) null), aolnVar);
    }

    public final java.lang.Object t(ity ityVar, kqy kqyVar, defpackage.aoln aolnVar) {
        return s(ityVar, new defpackage.bpj(kqyVar, (defpackage.aoln) null, 7), aolnVar);
    }

    public final java.lang.Object u(ity ityVar, itq itqVar, defpackage.aoln aolnVar) {
        return s(ityVar, new defpackage.bpj(itqVar, (defpackage.aoln) null, 8), aolnVar);
    }

    public final java.lang.Object v(ity ityVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return ((defpackage.itf) this.a).a(new afpl(ityVar, new apw(aonnVar, ityVar, (defpackage.aoln) null, 12), (char[]) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v0, types: [aolr, java.lang.Object] */
    public final java.lang.Object w(ity ityVar, java.lang.String str, long j, java.lang.String str2, defpackage.aoln aolnVar) {
        itk itkVar;
        if (aolnVar instanceof itk) {
            itkVar = (itk) aolnVar;
            int i = itkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                itkVar.b = i - Integer.MIN_VALUE;
            } else {
                itkVar = new itk(this, aolnVar);
            }
        } else {
            itkVar = new itk(this, aolnVar);
        }
        itk itkVar2 = itkVar;
        java.lang.Object obj = itkVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = itkVar2.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r12 = this.c;
            ujn ujnVar = new ujn(this, ityVar, str2, str, j, (defpackage.aoln) null, 1);
            itkVar2.b = 1;
            if (defpackage.aoov.aj(r12, ujnVar, itkVar2) == aoluVar) {
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
    /* JADX WARN: Type inference failed for: r13v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object x(ity ityVar, java.lang.Integer num, defpackage.aoln aolnVar) {
        itm itmVar;
        if (aolnVar instanceof itm) {
            itmVar = (itm) aolnVar;
            int i = itmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                itmVar.b = i - Integer.MIN_VALUE;
            } else {
                itmVar = new itm(this, aolnVar);
            }
        } else {
            itmVar = new itm(this, aolnVar);
        }
        java.lang.Object obj = itmVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = itmVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r13 = this.c;
            hyq hyqVar = new hyq(this, ityVar, num, (defpackage.aoln) null, 7);
            itmVar.b = 1;
            if (defpackage.aoov.aj(r13, hyqVar, itmVar) == aoluVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v0, types: [aolr, java.lang.Object] */
    public final java.lang.Object y(ity ityVar, java.lang.String str, java.lang.Long l, java.lang.String str2, java.lang.Long l2, defpackage.aoln aolnVar) {
        itn itnVar;
        if (aolnVar instanceof itn) {
            itnVar = (itn) aolnVar;
            int i = itnVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                itnVar.b = i - Integer.MIN_VALUE;
            } else {
                itnVar = new itn(this, aolnVar);
            }
        } else {
            itnVar = new itn(this, aolnVar);
        }
        itn itnVar2 = itnVar;
        java.lang.Object obj = itnVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = itnVar2.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r12 = this.c;
            qkx qkxVar = new qkx(this, ityVar, str2, l2, str, l, (defpackage.aoln) null, 1);
            itnVar2.b = 1;
            if (defpackage.aoov.aj(r12, qkxVar, itnVar2) == aoluVar) {
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

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.window.extensions.WindowExtensions, java.lang.Object] */
    public final androidx.window.extensions.embedding.ActivityEmbeddingComponent z() {
        boolean zG;
        if (!((defpackage.kaw) this.b).ac() || !defpackage.gus.B("WindowExtensions#getActivityEmbeddingComponent is not valid", new defpackage.gpg(this, 1))) {
            return null;
        }
        int i = new defpackage.gms().a;
        if (i == 1) {
            zG = B();
        } else if (i == 2) {
            zG = C();
        } else if (i >= 3 && i < 5) {
            zG = D();
        } else if (i == 5) {
            zG = E();
        } else if (i == 6) {
            zG = F();
        } else {
            zG = (i != 7 && i < 8) ? false : G();
        }
        if (!zG) {
            return null;
        }
        try {
            return goy$.ExternalSyntheticApiModelOutline3.m((androidx.window.extensions.WindowExtensions) this.d);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    public kgl(defpackage.aoxh aoxhVar, defpackage.gdp gdpVar, defpackage.kaw kawVar, defpackage.aomy aomyVar) {
        this.a = aoxhVar;
        this.b = gdpVar;
        this.d = kawVar;
        this.c = aomyVar;
    }

    public kgl(defpackage.eja ejaVar, defpackage.eja ejaVar2, java.lang.Object obj) {
        this.a = ejaVar;
        this.d = "";
        this.c = ejaVar2;
        this.b = obj;
    }

    public kgl(defpackage.zzx zzxVar, defpackage.lpe lpeVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.a = zzxVar;
        this.d = lpeVar;
        this.c = aoinVar;
        this.b = aoinVar2;
    }

    public /* synthetic */ kgl(defpackage.aoxh aoxhVar, defpackage.gdp gdpVar, defpackage.kaw kawVar) {
        this(aoxhVar, gdpVar, kawVar, defpackage.gbs.a);
    }

    public kgl(defpackage.eoh eohVar, defpackage.eoe eoeVar, defpackage.eoq eoqVar) {
        if (eohVar == null) {
            defpackage.aooh.i("store");
        }
        if (eoeVar == null) {
            defpackage.aooh.i("factory");
        }
        if (eoqVar == null) {
            defpackage.aooh.i("defaultExtras");
        }
        this.c = eohVar;
        this.a = eoeVar;
        this.d = eoqVar;
        this.b = new defpackage.dzl();
    }

    public kgl(defpackage.jrd jrdVar, defpackage.aoss aossVar) {
        if (jrdVar == null) {
            defpackage.aooh.i("dao");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.d = jrdVar;
        this.b = aossVar;
        this.c = new defpackage.ahda((byte[]) null);
        defpackage.jqy jqyVar = new defpackage.aoom() { // from class: jqy
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return java.lang.Long.valueOf(((defpackage.jrj) obj).a);
            }
        };
        defpackage.dkm dkmVar = new defpackage.dkm(5);
        defpackage.jqz jqzVar = new defpackage.aoom() { // from class: jqz
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return ((defpackage.jrj) obj).b;
            }
        };
        defpackage.aeza aezaVar = new defpackage.aeza();
        if (jrdVar == null) {
            defpackage.aooh.i("dao");
        }
        this.a = defpackage.aazc.n("StirShakenEntity", "callCreationTimeMillis", jrdVar, jqyVar, defpackage.abxf.a, dkmVar, jqzVar, aezaVar);
    }

    public kgl(byte[] bArr) {
        this.d = new defpackage.dya(10);
        this.b = new defpackage.aec(0);
        this.c = new java.util.ArrayList();
        this.a = new java.util.HashSet();
    }

    public kgl() {
        this.c = new defpackage.aca();
        this.d = new android.util.SparseArray();
        this.a = new defpackage.adb(10);
        this.b = new defpackage.aca();
    }

    public kgl(defpackage.aoss aossVar, defpackage.aonj aonjVar, defpackage.aonn aonnVar, defpackage.aonn aonnVar2) {
        this.c = aossVar;
        this.d = aonnVar2;
        this.a = defpackage.aooh.H(Integer.MAX_VALUE, 0, null, 6);
        this.b = new defpackage.kaw((char[]) null);
        defpackage.aoub aoubVar = (defpackage.aoub) ((defpackage.apbj) aossVar).a.get(defpackage.aoub.d);
        if (aoubVar != null) {
            aoubVar.p(new defpackage.cju(aonjVar, this, aonnVar, 2));
        }
    }

    public kgl(defpackage.ajcu ajcuVar, defpackage.aoin aoinVar) {
        this.c = new defpackage.aca();
        this.d = new defpackage.aca();
        this.a = new defpackage.ajdc(ajcuVar);
        this.b = aoinVar;
    }

    public kgl(java.lang.ClassLoader classLoader, defpackage.gne gneVar, androidx.window.extensions.WindowExtensions windowExtensions) {
        if (windowExtensions == null) {
            defpackage.aooh.i("windowExtensions");
        }
        this.c = classLoader;
        this.a = gneVar;
        this.d = windowExtensions;
        this.b = new defpackage.kaw(classLoader, (byte[]) null);
    }

    public kgl(android.content.Context context, defpackage.gwf gwfVar, defpackage.gwa gwaVar, defpackage.gwf gwfVar2) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.b = context;
        this.d = gwfVar;
        this.a = gwaVar;
        this.c = gwfVar2;
    }

    public kgl(android.content.Context context, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.itf itfVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (itfVar == null) {
            defpackage.aooh.i("repository");
        }
        this.b = context;
        this.d = aolrVar;
        this.c = aolrVar2;
        this.a = itfVar;
    }

    public kgl(defpackage.jyy jyyVar, defpackage.aoin aoinVar, defpackage.jyz jyzVar) {
        if (jyyVar == null) {
            defpackage.aooh.i("coalescedRowsDao");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("annotatedCallLogRefreshStarter");
        }
        if (jyzVar == null) {
            defpackage.aooh.i("coalescedRowsUpdatedNotifier");
        }
        this.c = jyyVar;
        this.a = aoinVar;
        this.d = jyzVar;
        defpackage.gdc gdcVar = new defpackage.gdc((defpackage.aonn) new defpackage.jzm(null, 0), (defpackage.aoxh) jyzVar.e, 7);
        defpackage.dgz dgzVar = new defpackage.dgz(this, (defpackage.aoln) null, 16, (byte[]) null);
        int i = defpackage.aoyc.a;
        this.b = new defpackage.apaa(new defpackage.gdd(dgzVar, (defpackage.aoln) null, 2), gdcVar);
    }

    public kgl(defpackage.jzr jzrVar, defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        if (jzrVar == null) {
            defpackage.aooh.i("callLogPagingData");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = aossVar;
        this.a = aolrVar;
        defpackage.aoss aossVarP = defpackage.aosv.p(aossVar, aolrVar);
        this.c = aossVarP;
        this.d = defpackage.aoov.at(new defpackage.gdc(new defpackage.gdc((defpackage.aonn) new defpackage.efl((defpackage.aoln) null, 2, (char[]) null), (defpackage.aoxh) new defpackage.fzh(new defpackage.aowy(new defpackage.fzn(defpackage.gfz.f(new defpackage.fzn(new defpackage.fzh(jzrVar.g, 4), new defpackage.gdd((defpackage.aoln) null, aossVarP, 1), null, 2, null)), new defpackage.kkg(null, 1, null), (defpackage.aoln) null, 0)), 1), 7), new defpackage.fzb(null), 6), aossVarP, defpackage.aozb.b);
    }

    public kgl(defpackage.ajct ajctVar, defpackage.ojo ojoVar, defpackage.aoin aoinVar, defpackage.zzx zzxVar) {
        this.d = ajctVar;
        this.b = ojoVar;
        this.c = aoinVar;
        this.a = zzxVar;
    }
}
