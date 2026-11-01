package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbz {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public ahbz(j$.util.Optional optional, defpackage.apnt apntVar, defpackage.aoin aoinVar, java.util.Map map, java.util.Map map2, j$.util.Optional optional2) {
        if (optional == null) {
            defpackage.aooh.i("updater");
        }
        if (apntVar == null) {
            defpackage.aooh.i("subpackager");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("deviceProvider");
        }
        if (map2 == null) {
            defpackage.aooh.i("subpackagedToTier");
        }
        if (optional2 == null) {
            defpackage.aooh.i("perProcessRegistrationOptional");
        }
        this.e = apntVar;
        this.f = aoinVar;
        this.b = map;
        this.a = map2;
        this.c = optional2;
        if (optional == null) {
            defpackage.aooh.i("<this>");
        }
        this.d = (defpackage.aogc) optional.orElse((java.lang.Object) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final java.lang.String n(java.lang.Class cls) {
        java.lang.String str = (java.lang.String) this.a.get(cls);
        defpackage.ahvr.cl(str, "The input Worker wasn't annotated with @GenerateWorker. If it or any of its chained work is annotated with @GenerateAccountWorker, its work must be started with TikTokAccountWorkManager, instead. Worker class: %s", cls.toString());
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    private final void o(defpackage.aguz aguzVar, defpackage.gsz gszVar) {
        defpackage.ailj it = aguzVar.i.iterator();
        while (it.hasNext()) {
            gszVar.b((java.lang.String) it.next());
        }
        defpackage.ahyn ahynVar = aguzVar.c;
        if (ahynVar.f()) {
            java.lang.Object objB = ahynVar.b();
            defpackage.gxl gxlVar = gszVar.c;
            gxlVar.r = true;
            gxlVar.s = (defpackage.gss) objB;
        }
        defpackage.ahyn ahynVar2 = aguzVar.j;
        if (ahynVar2.f()) {
            defpackage.ahyn ahynVar3 = aguzVar.k;
            if (ahynVar3.f()) {
                defpackage.agux aguxVar = (defpackage.agux) ahynVar3.b();
                gszVar.c((defpackage.grj) ahynVar2.b(), aguxVar.a, aguxVar.b);
            }
        }
        defpackage.ahyn ahynVar4 = aguzVar.e;
        if (ahynVar4.f() && (gszVar instanceof defpackage.gst)) {
            defpackage.gst gstVar = (defpackage.gst) gszVar;
            long jLongValue = ((java.lang.Long) ahynVar4.b()).longValue();
            if (jLongValue == Long.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            defpackage.gxl gxlVar2 = gstVar.c;
            gxlVar2.v = jLongValue;
            gxlVar2.w = 1;
        }
        defpackage.ipc ipcVar = new defpackage.ipc((char[]) null);
        ipcVar.r(aguzVar.f);
        defpackage.ahyn ahynVar5 = aguzVar.l;
        if (ahynVar5.f()) {
            android.content.ComponentName componentName = (android.content.ComponentName) ((defpackage.ahys) this.f).a.get(ahynVar5.b());
            ipcVar.x("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            ipcVar.x("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        gszVar.f(ipcVar.q());
        java.lang.String strN = n(aguzVar.a);
        int length = strN.length();
        java.util.regex.Pattern pattern = defpackage.agvl.a;
        gszVar.c.y = "TikTokWorker#".concat(java.lang.String.valueOf(strN.substring(java.lang.Math.max(0, length - 114))));
    }

    private final defpackage.aogc p() {
        java.lang.Object obj = this.d;
        if (obj != null) {
            return (defpackage.aogc) obj;
        }
        throw new java.lang.UnsupportedOperationException("Account support is not present");
    }

    private final defpackage.aogc q(defpackage.aguz aguzVar, defpackage.agux aguxVar) {
        if (!aguzVar.g.f()) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.gst gstVar = new defpackage.gst(com.google.apps.tiktok.contrib.work.TikTokListenableWorker.class, aguxVar.a, aguxVar.b);
        o(aguzVar, gstVar);
        gstVar.d(aguzVar.b);
        defpackage.agux aguxVar2 = aguzVar.d;
        gstVar.e(aguxVar2.a, aguxVar2.b);
        return gstVar.g();
    }

    private final defpackage.aogc r(defpackage.aguz aguzVar) {
        if (aguzVar.g.f()) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.gsk gskVar = new defpackage.gsk(com.google.apps.tiktok.contrib.work.TikTokListenableWorker.class);
        gskVar.d(aguzVar.b);
        defpackage.agux aguxVar = aguzVar.d;
        gskVar.e(aguxVar.a, aguxVar.b);
        gskVar.f(aguzVar.f);
        o(aguzVar, gskVar);
        return gskVar.g();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoir, java.lang.Object] */
    public final defpackage.ajcq a(java.lang.String str, defpackage.aexf aexfVar) {
        if (str == null) {
            defpackage.aooh.i("mendelPackage");
        }
        if (aexfVar == null) {
            defpackage.aooh.i("commitProperties");
        }
        java.lang.String str2 = aexfVar.c;
        defpackage.aooh.e(str2, "getSnapshotToken(...)");
        if (str2.length() == 0) {
            java.lang.Object obj = this.d;
            if (!((defpackage.aewq) obj).f.c(((defpackage.zzx) this.e).t(str)).d) {
                return defpackage.ajcm.a;
            }
        }
        defpackage.ahby ahbyVar = new defpackage.ahby(this, str, aexfVar);
        defpackage.ahby ahbyVar2 = (defpackage.ahby) ((j$.util.concurrent.ConcurrentHashMap) this.f.a()).put(str, ahbyVar);
        if (ahbyVar2 == null || !defpackage.aooh.n(ahbyVar2.b.c, aexfVar.c)) {
            ahbyVar2 = ahbyVar;
        }
        defpackage.ajdd ajddVar = ahbyVar.c;
        ajddVar.q(ahbyVar2.d.a());
        return ajddVar;
    }

    public final defpackage.ajcq b(java.lang.String str) {
        defpackage.aooh.f(str, "mendelPackage");
        return c(((defpackage.apnt) this.e).c(str), true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    public final defpackage.ajcq c(java.lang.String str, boolean z) {
        defpackage.ahav ahavVar = (defpackage.ahav) this.a.get(str);
        if (ahavVar == null) {
            android.util.Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(java.lang.String.valueOf(str)));
            return defpackage.aiql.z(null);
        }
        int iOrdinal = ahavVar.ordinal();
        if (iOrdinal == 0) {
            return ((defpackage.ahbv) this.f.a()).a(str, z);
        }
        if (iOrdinal != 1) {
            throw new defpackage.aois();
        }
        defpackage.aogc aogcVarP = p();
        defpackage.aooh.f(str, "mendelPackage");
        return defpackage.ajan.g(((defpackage.agoo) aogcVarP.c.a()).c(), defpackage.ahqx.c(new vll(aogcVarP, str, z, 7)), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq d(boolean z) {
        defpackage.aihd aihdVarKeySet = ((defpackage.aikj) this.b).keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ailj it = ((defpackage.aikh) aihdVarKeySet).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (f()) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((defpackage.apnt) this.e).c((java.lang.String) it2.next()));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList2, 10));
        java.util.Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(c((java.lang.String) it3.next(), z));
        }
        return defpackage.agab.aL(arrayList3);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq e(java.lang.String str, com.google.apps.tiktok.account.AccountId accountId) {
        java.lang.String strC = ((defpackage.apnt) this.e).c(str);
        defpackage.ahav ahavVar = (defpackage.ahav) this.a.get(strC);
        if (ahavVar != defpackage.ahav.b) {
            throw new java.lang.IllegalStateException(defpackage.a.bo(ahavVar, strC, "Package ", " was not a user package. Instead was "));
        }
        defpackage.aogc aogcVarP = p();
        return defpackage.ajan.g(((defpackage.agoo) aogcVarP.c.a()).b(accountId), defpackage.ahqx.c(new aczq(aogcVarP, strC, accountId, 20, (char[]) null)), defpackage.ajbm.INSTANCE);
    }

    public final boolean f() {
        java.lang.Object obj = this.c;
        j$.util.Optional optional = (j$.util.Optional) obj;
        optional.isPresent();
        defpackage.aooh.e(obj, "map(...)");
        return ((java.lang.Boolean) defpackage.aooh.p(optional, java.lang.Boolean.TRUE)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [agvb, java.lang.Object] */
    public final defpackage.ajcq g(java.lang.String str) {
        return ((defpackage.aogc) this.c).y(this.e.a(str), new agvj(1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [agvb, java.lang.Object] */
    public final defpackage.ajcq h(java.util.UUID uuid) {
        return ((defpackage.aogc) this.c).y(this.e.b(uuid), new agvj(0));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [agvb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [agvb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [agvb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [agvb, java.lang.Object] */
    public final defpackage.ajcq i(defpackage.aguz aguzVar) {
        defpackage.ajam ajamVar;
        java.lang.Boolean.FALSE.booleanValue();
        java.util.regex.Pattern pattern = defpackage.agvl.a;
        defpackage.aihd aihdVar = aguzVar.i;
        defpackage.ailj it = aihdVar.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (defpackage.agvl.a.matcher(str).matches()) {
                throw new agvf("Tag " + str + " is reserved by AccountWorkManager.");
            }
        }
        defpackage.ailj it2 = aihdVar.iterator();
        while (it2.hasNext()) {
            java.lang.String str2 = (java.lang.String) it2.next();
            if (defpackage.agvl.b.matcher(str2).matches()) {
                throw new agvf("Tag " + str2 + " is reserved by TikTokWorkManager.");
            }
        }
        defpackage.ahyn ahynVar = aguzVar.l;
        int i = 1;
        if (ahynVar.f()) {
            defpackage.ahvr.bZ(!((java.lang.String) ahynVar.b()).equals(((android.content.Context) this.b).getPackageName()), "Default process must be targeted using shorthand '' empty string, not the package name.");
            throw new java.lang.IllegalStateException("You must depend upon //java/com/google/apps/tiktok/contrib/work/impl:multiprocess_module in order to use .setTargetProcess");
        }
        defpackage.aile aileVar = new defpackage.aile("TikTokWorker#".concat(n(aguzVar.a)));
        defpackage.aguv aguvVar = new defpackage.aguv(aguzVar);
        aguvVar.e(defpackage.ahvr.ao(aihdVar, aileVar));
        defpackage.aguz aguzVarA = aguvVar.a();
        java.lang.Object obj = this.c;
        defpackage.ahyn ahynVar2 = aguzVarA.g;
        if (ahynVar2.f()) {
            if (!ahynVar2.f()) {
                throw new java.lang.IllegalStateException();
            }
            defpackage.ahyn ahynVar3 = aguzVarA.h;
            if (ahynVar3.f()) {
                if (!ahynVar2.f()) {
                    throw new java.lang.IllegalStateException();
                }
                if (!ahynVar3.f()) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.agux aguxVar = ((defpackage.aguw) ahynVar2.b()).a;
                ahynVar2.b();
                defpackage.aogc aogcVarQ = q(aguzVarA, aguxVar);
                defpackage.ajcq ajcqVarE = this.e.e(((defpackage.aguy) ahynVar3.b()).a, ((defpackage.aguy) ahynVar3.b()).b, aogcVarQ);
                defpackage.vut vutVar = new defpackage.vut(aogcVarQ, 19);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                int i2 = defpackage.ajan.c;
                ajamVar = new defpackage.ajam(ajcqVarE, vutVar);
                ajcqVarE.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
            } else {
                if (!ahynVar2.f()) {
                    throw new java.lang.IllegalStateException();
                }
                if (ahynVar3.f()) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.agux aguxVar2 = ((defpackage.aguw) ahynVar2.b()).a;
                ahynVar2.b();
                defpackage.aogc aogcVarQ2 = q(aguzVarA, aguxVar2);
                defpackage.ajcq ajcqVarD = this.e.d(aogcVarQ2);
                agnw agnwVar = new agnw(aogcVarQ2, 9);
                defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                int i3 = defpackage.ajan.c;
                ajamVar = new defpackage.ajam(ajcqVarD, agnwVar);
                ajcqVarD.c(ajamVar, defpackage.aiql.t(ajbmVar2, ajamVar));
            }
        } else {
            if (ahynVar2.f()) {
                throw new java.lang.IllegalStateException();
            }
            defpackage.ahyn ahynVar4 = aguzVarA.h;
            if (ahynVar4.f()) {
                if (ahynVar2.f()) {
                    throw new java.lang.IllegalStateException();
                }
                if (!ahynVar4.f()) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.aogc aogcVarR = r(aguzVarA);
                ?? r5 = this.e;
                java.lang.String str3 = ((defpackage.aguy) ahynVar4.b()).a;
                int i4 = ((defpackage.aguy) ahynVar4.b()).b - 1;
                if (i4 != 0) {
                    if (i4 == 1) {
                        i = 2;
                    } else if (i4 != 3) {
                        throw new java.lang.IllegalArgumentException("One-time unique work does not support ExistingPeriodicWorkPolicy UPDATE. Use CANCEL_AND_REENQUEUE or KEEP instead");
                    }
                }
                defpackage.ajcq ajcqVarF = r5.f(str3, i, aogcVarR);
                defpackage.vut vutVar2 = new defpackage.vut(aogcVarR, 18);
                defpackage.ajbm ajbmVar3 = defpackage.ajbm.INSTANCE;
                int i5 = defpackage.ajan.c;
                ajamVar = new defpackage.ajam(ajcqVarF, vutVar2);
                ajcqVarF.c(ajamVar, defpackage.aiql.t(ajbmVar3, ajamVar));
            } else {
                if (ahynVar2.f()) {
                    throw new java.lang.IllegalStateException();
                }
                if (ahynVar4.f()) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.aogc aogcVarR2 = r(aguzVarA);
                defpackage.ajcq ajcqVarD2 = this.e.d(aogcVarR2);
                agnw agnwVar2 = new agnw(aogcVarR2, 8);
                defpackage.ajbm ajbmVar4 = defpackage.ajbm.INSTANCE;
                int i6 = defpackage.ajan.c;
                ajamVar = new defpackage.ajam(ajcqVarD2, agnwVar2);
                ajcqVarD2.c(ajamVar, defpackage.aiql.t(ajbmVar4, ajamVar));
            }
        }
        return ((defpackage.aogc) obj).y(ajamVar, new defpackage.uqd(12));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [agvb, java.lang.Object] */
    public final defpackage.ajcq j(java.lang.String str) {
        return defpackage.ajan.f(this.e.c(new defpackage.ipc(defpackage.ajsz.cU(new java.lang.String[]{str}))), new defpackage.agqh(3), this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.afhf k(defpackage.afgp afgpVar) {
        ?? r0 = this.a;
        android.net.Uri uri = afgpVar.a;
        android.util.Pair pairCreate = (android.util.Pair) r0.get(uri);
        if (pairCreate == null) {
            defpackage.ahvr.bR(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            java.lang.String strCo = defpackage.ahvr.co(uri.getLastPathSegment());
            int iLastIndexOf = strCo.lastIndexOf(46);
            defpackage.ahvr.bR((iLastIndexOf == -1 ? "" : strCo.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            defpackage.ahvr.bN(afgpVar.b != null, "Proto schema cannot be null");
            defpackage.ahvr.bN(afgpVar.c != null, "Handler cannot be null");
            defpackage.afhd afhdVar = afgpVar.e;
            ?? r6 = this.f;
            java.lang.String strA = afhdVar.a();
            defpackage.afhh afhhVar = (defpackage.afhh) r6.get(strA);
            defpackage.ahvr.bR(afhhVar != 0, "No XDataStoreVariantFactory registered for ID %s", strA);
            java.lang.String strCo2 = defpackage.ahvr.co(uri.getLastPathSegment());
            int iLastIndexOf2 = strCo2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strCo2 = strCo2.substring(0, iLastIndexOf2);
            }
            defpackage.ajcq ajcqVarG = defpackage.ajan.g(defpackage.aiql.z(uri), this.c, defpackage.ajbm.INSTANCE);
            ?? r7 = this.d;
            defpackage.afhg afhgVarB = afhhVar.b(afgpVar, strCo2, r7, (defpackage.aogc) this.b);
            afhhVar.a();
            defpackage.afhf afhfVar = new defpackage.afhf(afhgVarB, ajcqVarG, false);
            defpackage.aify aifyVar = afgpVar.d;
            if (!aifyVar.isEmpty()) {
                afhfVar.b(new defpackage.afgn(aifyVar, r7));
            }
            pairCreate = android.util.Pair.create(afhfVar, afgpVar);
            android.util.Pair pair = (android.util.Pair) r0.putIfAbsent(uri, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        }
        defpackage.afhf afhfVar2 = (defpackage.afhf) pairCreate.first;
        defpackage.afgp afgpVar2 = (defpackage.afgp) pairCreate.second;
        if (afgpVar.equals(afgpVar2)) {
            return afhfVar2;
        }
        defpackage.albh albhVar = afgpVar.b;
        java.lang.String strBK = defpackage.ahvr.bK("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", albhVar.getClass().getSimpleName(), uri);
        defpackage.ahvr.bR(uri.equals(afgpVar2.a), strBK, "uri");
        defpackage.ahvr.bR(albhVar.equals(afgpVar2.b), strBK, "schema");
        defpackage.ahvr.bR(afgpVar.c.equals(afgpVar2.c), strBK, "handler");
        defpackage.ahvr.bR(defpackage.ahvr.aP(afgpVar.d, afgpVar2.d), strBK, "migrations");
        defpackage.ahvr.bR(afgpVar.e.equals(afgpVar2.e), strBK, "variantConfig");
        defpackage.ahvr.bR(afgpVar.f == afgpVar2.f, strBK, "useGeneratedExtensionRegistry");
        defpackage.ahvr.bR(true, strBK, "enableTracing");
        throw new java.lang.IllegalArgumentException(defpackage.ahvr.bK(strBK, "unknown"));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean l() {
        return !this.d.isEmpty();
    }

    public final void m(int i) {
        ((defpackage.aeod) this.f).a(new aeol(this, i));
    }

    public ahbz(defpackage.ahbz ahbzVar, defpackage.ajcu ajcuVar, java.util.Random random, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.f = ahbzVar;
        this.b = ajcuVar;
        this.c = random;
        this.e = aoinVar;
        this.a = aoinVar2;
        this.d = aoinVar3;
    }

    public ahbz(defpackage.ajje ajjeVar) {
        this.a = ajjeVar.f;
        this.b = ajjeVar.a;
        this.d = ajjeVar.e;
        this.f = ajjeVar.b;
        this.e = ajjeVar.c;
        this.c = ajjeVar.d;
    }

    public ahbz(android.content.Context context, defpackage.agvb agvbVar, java.util.Map map, java.util.concurrent.Executor executor, defpackage.ahyn ahynVar, defpackage.aogc aogcVar) {
        this.b = context;
        this.e = agvbVar;
        this.a = map;
        this.d = executor;
        this.f = ahynVar;
        this.c = aogcVar;
    }

    public ahbz(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6) {
        aoinVar.getClass();
        this.c = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.d = aoinVar3;
        aoinVar4.getClass();
        this.a = aoinVar4;
        aoinVar5.getClass();
        this.e = aoinVar5;
        aoinVar6.getClass();
        this.f = aoinVar6;
    }

    public ahbz(defpackage.aeod aeodVar, defpackage.ahyn ahynVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.f = aeodVar;
        this.b = ahynVar;
        this.e = aoinVar;
        this.d = aoinVar2;
        this.a = aoinVar3;
        this.c = aoinVar4;
    }

    public ahbz(java.util.concurrent.Executor executor, defpackage.aogc aogcVar, defpackage.afhj afhjVar, java.util.Map map) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        defpackage.ahvr.ci(executor);
        this.d = executor;
        defpackage.ahvr.ci(aogcVar);
        this.b = aogcVar;
        this.e = afhjVar;
        this.f = map;
        defpackage.ahvr.bM(!map.isEmpty());
        this.c = new defpackage.uqd(10);
    }

    public ahbz(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.ajct ajctVar, defpackage.aewq aewqVar, defpackage.zzx zzxVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("phenotypeApi");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("allStaticPackages");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("backgroundExecutor");
        }
        if (aewqVar == null) {
            defpackage.aooh.i("phenotypeContext");
        }
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = ajctVar;
        this.d = aewqVar;
        this.e = zzxVar;
        this.f = new defpackage.aoiy(new defpackage.acik(this, 6));
    }
}
