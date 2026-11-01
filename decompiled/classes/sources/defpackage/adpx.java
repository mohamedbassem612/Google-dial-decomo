package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adpx implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ adpx(defpackage.ahce ahceVar, defpackage.ahax ahaxVar, int i) {
        this.$cid = i;
        this.b = ahceVar;
        this.a = ahaxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                defpackage.adqb adqbVar = (defpackage.adqb) obj2;
                java.lang.String str = adqbVar.c;
                defpackage.adhv adhvVar = defpackage.adhv.a;
                defpackage.ajiu ajiuVar = new defpackage.ajiu((char[]) null);
                ajiuVar.h("messagekeys", this.b);
                return defpackage.ajck.w(adqbVar.h.d(str, ajiuVar.f(), adqbVar.f)).x(new defpackage.vut(obj2, 9), adqbVar.f);
            case 1:
                return ((defpackage.adnr) this.a).c((defpackage.adoa) this.b);
            case 2:
                defpackage.adqy adqyVar = (defpackage.adqy) this.a;
                java.lang.String str2 = adqyVar.c;
                int i = adqyVar.d;
                java.util.Set set = defpackage.adik.a;
                return adqyVar.e.b(new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(str2, i), this.b);
            case 3:
                defpackage.aemh aemhVar = (defpackage.aemh) obj;
                ((java.util.concurrent.atomic.AtomicReference) ((defpackage.aenc) this.a).b).set(aemhVar);
                return (defpackage.ajcq) this.b.apply(aemhVar);
            case 4:
                java.util.List list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (true) {
                    java.lang.Object obj3 = this.a;
                    if (!it.hasNext()) {
                        return defpackage.ahvr.ah(arrayList).o(new defpackage.jio(obj3, list, arrayList, 6), defpackage.ajbm.INSTANCE);
                    }
                    arrayList.add((defpackage.ajcq) this.b.apply(((defpackage.adak) ((defpackage.ahbq) obj3).c).f((android.accounts.Account) it.next())));
                }
                break;
            case 5:
                defpackage.aemr aemrVar = (defpackage.aemr) this.a;
                aemrVar.h((defpackage.aemn) obj);
                return (defpackage.ajcq) this.b.apply(aemrVar.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                int i2 = ((defpackage.aexj) obj).a;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544 || i2 == 29547) && ((defpackage.aezs) this.b).a()) {
                    ((defpackage.aeyy) this.a).b();
                }
                return defpackage.ajcm.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj4 = this.a;
                defpackage.afhc afhcVar = (defpackage.afhc) obj4;
                afhcVar.c((android.net.Uri) defpackage.aiql.H(afhcVar.a), obj);
                java.lang.Object obj5 = afhcVar.d;
                ?? r5 = this.b;
                synchronized (obj5) {
                    ((defpackage.afhc) obj4).e = r5;
                    break;
                }
                return defpackage.aiql.z(obj);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aexg aexgVar = (defpackage.aexg) obj;
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1350, "ConsistencyTierState.setNewValues", defpackage.ahot.a, true);
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                try {
                    if (((defpackage.ahbv) obj7).d.get(obj6) != defpackage.ahav.a) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    java.lang.Object obj8 = ((defpackage.ahbv) obj7).c;
                    defpackage.aooh.c(aexgVar);
                    defpackage.ajcq ajcqVarF = defpackage.ajan.f(((defpackage.ahbq) obj8).a((java.lang.String) obj6, aexgVar), defpackage.ahqx.a(new defpackage.jtv(obj7, obj6, 20)), defpackage.ajbm.INSTANCE);
                    ahoqVarX.a(ajcqVarF);
                    defpackage.ajsz.ak(ahoqVarX, null);
                    return ajcqVarF;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.ajsz.ak(ahoqVarX, th);
                        throw th2;
                    }
                }
            case 9:
                defpackage.ahyc ahycVarA = defpackage.ahqx.a(new defpackage.ahbx(this.a, 2));
                java.lang.Object obj9 = this.b;
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                return defpackage.ahvr.H(((defpackage.ahce) obj9).s.a(ahycVarA, ajbmVar), defpackage.ahqx.a(new defpackage.ahbx((defpackage.ahda) obj, 3)), ajbmVar);
            case 10:
                final java.util.Set setKeySet = ((java.util.HashMap) this.b).keySet();
                final defpackage.ahlm ahlmVar = ((defpackage.ahlt) this.a).e;
                return ahlmVar.c.submit(new java.util.concurrent.Callable() { // from class: ahlk
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        defpackage.ahlm ahlmVar2 = ahlmVar;
                        ahlmVar2.b.writeLock().lock();
                        java.util.Set<defpackage.ahlv> set2 = setKeySet;
                        try {
                            defpackage.ahmp ahmpVarA = defpackage.ahmp.a;
                            try {
                                ahmpVarA = ahlmVar2.a();
                            } catch (java.io.IOException e) {
                                if (!ahlmVar2.g(e)) {
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahlm.a.c()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 405, "SyncManagerDataStore.java")).v("Unable to read or clear store, will not update scheduled account ids. ");
                                }
                            }
                            defpackage.akzx akzxVarL = ahmpVarA.L();
                            akzxVarL.u();
                            ((defpackage.ahmp) akzxVarL.b).f = defpackage.alae.a;
                            java.util.TreeSet treeSet = new java.util.TreeSet();
                            for (defpackage.ahlv ahlvVar : set2) {
                                if (ahlvVar.a()) {
                                    treeSet.add(java.lang.Integer.valueOf(((com.google.apps.tiktok.account.AutoValue_AccountId) ahlvVar.c).a));
                                }
                            }
                            akzxVarL.u();
                            defpackage.ahmp ahmpVar = (defpackage.ahmp) akzxVarL.b;
                            defpackage.alak alakVar = ahmpVar.f;
                            if (!alakVar.c()) {
                                ahmpVar.f = defpackage.alad.H(alakVar);
                            }
                            defpackage.akyl.i(treeSet, ahmpVar.f);
                            try {
                                ahlmVar2.f((defpackage.ahmp) akzxVarL.r());
                            } catch (java.io.IOException e2) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahlm.a.c()).k(e2)).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 426, "SyncManagerDataStore.java")).v("Error writing scheduled account ids");
                            }
                            ahlmVar2.b.writeLock().unlock();
                            return null;
                        } catch (java.lang.Throwable th3) {
                            ahlmVar2.b.writeLock().unlock();
                            throw th3;
                        }
                    }
                });
            case 11:
                ?? r0 = this.b;
                java.lang.Object obj10 = this.a;
                defpackage.ahlt ahltVar = (defpackage.ahlt) obj10;
                return defpackage.ahvr.L(ahltVar.h(r0), new defpackage.vuw(obj10, (java.lang.Object) r0, (java.lang.Long) obj, 7), ahltVar.b);
            default:
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.HashSet hashSet = new java.util.HashSet();
                for (defpackage.gsx gsxVar : (java.util.List) obj) {
                    if (gsxVar.b == defpackage.gsw.a) {
                        hashSet.add(gsxVar.d);
                    }
                }
                defpackage.ailj it2 = defpackage.aihd.o(hashSet).iterator();
                while (it2.hasNext()) {
                    ?? r1 = this.b;
                    defpackage.grn grnVar = (defpackage.grn) it2.next();
                    if (!r1.contains(grnVar)) {
                        defpackage.ahme ahmeVar = (defpackage.ahme) this.a;
                        arrayList2.add(defpackage.ajan.f(ahmeVar.g.g(defpackage.ahme.c(grnVar, ahmeVar.b())), new agqd(13), defpackage.ajbm.INSTANCE));
                    }
                }
                return defpackage.aiql.Y(arrayList2).b(defpackage.ahqx.i(new defpackage.kve(10)), defpackage.ajbm.INSTANCE);
        }
    }

    public /* synthetic */ adpx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
