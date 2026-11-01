package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adak {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public final java.lang.Object i;
    public final java.lang.Object j;
    public final java.lang.Object k;

    public adak(defpackage.rlv rlvVar, defpackage.ajct ajctVar, java.util.Set set, defpackage.aoin aoinVar, defpackage.zpm zpmVar, defpackage.zjm zjmVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (set == null) {
            defpackage.aooh.i("allCuiProviders");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("allowlistedSemanticEventIdListProvider");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        if (zjmVar == null) {
            defpackage.aooh.i("callIdTracker");
        }
        this.k = rlvVar;
        this.c = ajctVar;
        this.j = set;
        this.h = aoinVar;
        this.d = zpmVar;
        this.g = zjmVar;
        defpackage.alak alakVar = ((defpackage.alfa) aoinVar.a()).b;
        defpackage.aooh.e(alakVar, "getElementList(...)");
        this.a = defpackage.ajsz.cf(alakVar);
        this.b = new defpackage.aoiy(new defpackage.mbe(this, 0));
        this.f = new defpackage.aoiy(new defpackage.mbe(this, 2));
        this.e = new defpackage.aoiy(new defpackage.mbe(this, 3));
        this.i = new j$.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, rlv] */
    private final void g(mbd mbdVar, java.lang.String str, java.lang.Integer num, defpackage.mce mceVar, defpackage.zal zalVar) {
        qbe qbeVar;
        mbg mbgVar;
        if (str != null) {
            ?? r1 = this.i;
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = (j$.util.concurrent.ConcurrentHashMap) r1;
            if (concurrentHashMap.get(str) != null) {
                qbeVar = (qbe) concurrentHashMap.get(str);
            } else {
                java.lang.String str2 = (java.lang.String) defpackage.aooh.q(((defpackage.zjm) this.g).c(str));
                if (str2 == null) {
                    qbeVar = null;
                } else {
                    apqr apqrVar = (apqr) ((defpackage.zpm) this.d).e(str2).orElse((java.lang.Object) null);
                    qbe qbeVarCp = (apqrVar == null || (mbgVar = (mbg) apqrVar.a(mbg.class)) == null) ? null : mbgVar.cp();
                    if (qbeVarCp != null) {
                        r1.put(str, qbeVarCp);
                    }
                    qbeVar = qbeVarCp;
                }
            }
        } else {
            qbeVar = null;
        }
        if (qbeVar != null) {
            qbeVar.b(mbdVar.o, j$.util.Optional.ofNullable(num), j$.util.Optional.ofNullable(mceVar != null ? java.lang.Integer.valueOf(mceVar.a()) : null), j$.util.Optional.ofNullable(zalVar != null ? java.lang.Integer.valueOf(zalVar.a()) : null));
        } else {
            this.k.p(mbdVar.n, j$.util.Optional.ofNullable(num), j$.util.Optional.ofNullable(mceVar != null ? java.lang.Integer.valueOf(mceVar.a()) : null), j$.util.Optional.ofNullable(zalVar != null ? java.lang.Integer.valueOf(zalVar.a()) : null));
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [adba, java.lang.Object] */
    public final int a(android.net.Uri uri, java.util.List list) {
        int iA;
        try {
            java.lang.Object obj = this.e;
            if (!((defpackage.aogc) obj).R(uri)) {
                return 0;
            }
            iA = 0;
            for (android.net.Uri uri2 : ((defpackage.aogc) obj).L(uri)) {
                try {
                    try {
                        java.util.Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                if (!((defpackage.aogc) obj).S(uri2)) {
                                    uri2.getPath();
                                    int i = defpackage.adbe.a;
                                    ((defpackage.aogc) obj).P(uri2);
                                    iA++;
                                    break;
                                }
                                iA += a(uri2, list);
                                break;
                            }
                        } while (!uri2.toString().startsWith(((android.net.Uri) it.next()).toString()));
                    } catch (java.io.IOException e) {
                        this.j.l(1059);
                        defpackage.adbe.g(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                }
            }
            return iA;
        } catch (java.io.IOException e3) {
            e = e3;
            iA = 0;
        }
        this.j.l(1059);
        defpackage.adbe.g(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
        return iA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.List b() {
        return (java.util.List) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final java.util.List c() {
        return (java.util.List) this.f.a();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7, types: [aoir, java.lang.Object] */
    public final void d(mbd mbdVar, mbh mbhVar, java.lang.String str) {
        j$.util.Objects.checkIndex(0, 3);
        if (mbhVar instanceof mbf) {
            g(mbdVar, str, ((mbf) mbhVar).a, null, null);
            return;
        }
        if (!(mbhVar instanceof mbi)) {
            throw new defpackage.aois();
        }
        mbi mbiVar = (mbi) mbhVar;
        ?? r6 = this.a;
        java.lang.Integer num = mbiVar.a;
        if (r6.contains(num) || defpackage.ajsz.cj(c(), mbiVar.c) || defpackage.ajsz.cj((java.util.List) this.e.a(), mbiVar.b)) {
            g(mbdVar, str, num, mbiVar.c, mbiVar.b);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void e(defpackage.rmx rmxVar, defpackage.rmx rmxVar2, defpackage.ajcq ajcqVar) {
        defpackage.ahvr.J(ajcqVar, new ynd(this, rmxVar2, rmxVar, 1), this.c);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public final defpackage.adff f(android.accounts.Account account) {
        android.accounts.Account account2;
        defpackage.adff adffVar;
        synchronized (this.e) {
            ?? r9 = this.k;
            if (r9.containsKey(account)) {
                account2 = account;
            } else {
                java.lang.Object obj = this.g;
                java.util.regex.Pattern pattern = defpackage.afej.a;
                defpackage.afei afeiVar = new defpackage.afei((android.content.Context) obj);
                afeiVar.a = "com.google.android.gms";
                afeiVar.d("managed");
                afeiVar.e("mdisync");
                afeiVar.c(account);
                afeiVar.f("profilesync/public/profile_info.pb");
                android.net.Uri uriA = afeiVar.a();
                java.lang.Object obj2 = this.h;
                defpackage.afgo afgoVarA = defpackage.afgp.a();
                afgoVarA.b = new defpackage.afgt((defpackage.afgk) this.a);
                afgoVarA.d(defpackage.adfl.a);
                afgoVarA.e(uriA);
                defpackage.tvn tvnVar = new defpackage.tvn(((defpackage.ahbz) obj2).k(afgoVarA.a()));
                defpackage.adag adagVar = new defpackage.adag(this.f, this.j);
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(new defpackage.adfg());
                java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference(new defpackage.adfh());
                j$.util.Objects.requireNonNull(atomicReference);
                defpackage.adfi adfiVar = new defpackage.adfi(atomicReference, 0);
                j$.util.Objects.requireNonNull(atomicReference2);
                defpackage.adfi adfiVar2 = new defpackage.adfi(atomicReference2, 2);
                defpackage.aapa aapaVar = new defpackage.aapa((android.content.Context) obj, new defpackage.aaox(account, defpackage.aizq.INSTANCE));
                java.lang.Object obj3 = this.b;
                defpackage.adai adaiVar = new defpackage.adai((android.content.Context) obj, aapaVar, (java.lang.String) obj3, account, adfiVar, adfiVar2);
                account2 = account;
                if (defpackage.anhc.a.eZ().c((android.content.Context) obj)) {
                    defpackage.adey.a(((android.content.Context) obj).getApplicationContext(), (java.lang.String) obj3);
                    defpackage.ajcq ajcqVarE = defpackage.aazc.e(((defpackage.abce) this.c).e());
                    adfe adfeVar = new adfe(2);
                    defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                    defpackage.ajcq ajcqVarF = defpackage.ajan.f(defpackage.ajan.f(ajcqVarE, adfeVar, ajbmVar), new ymu(15), ajbmVar);
                    j$.util.Objects.requireNonNull(this.i);
                    defpackage.ahyn.h(ajcqVarF);
                } else {
                    defpackage.adey.a(((android.content.Context) obj).getApplicationContext(), (java.lang.String) obj3);
                    account2.toString();
                    defpackage.ahyn.h(new defpackage.acun());
                }
                java.lang.Object obj4 = this.i;
                j$.util.Objects.requireNonNull(obj4);
                defpackage.adfi adfiVar3 = new defpackage.adfi(obj4, 1);
                new defpackage.agab(null, null, null, null);
                defpackage.adey.a(((android.content.Context) obj).getApplicationContext(), (java.lang.String) obj3);
                new defpackage.abrz(adfiVar3);
                defpackage.adff adffVar2 = new defpackage.adff(adaiVar, (android.content.Context) obj, adagVar, tvnVar, new defpackage.adqg(this, uriA));
                adffVar2.e(new defpackage.adfj(this, uriA), defpackage.ajbm.INSTANCE);
                atomicReference.set(adffVar2);
                atomicReference2.set(adffVar2);
                r9.put(account2, adffVar2);
            }
            adffVar = (defpackage.adff) r9.get(account2);
        }
        return adffVar;
    }

    public adak(defpackage.aogc aogcVar, defpackage.adch adchVar, defpackage.adba adbaVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4, defpackage.ahyn ahynVar5, defpackage.acvl acvlVar, defpackage.ahyn ahynVar6, defpackage.ahyn ahynVar7) {
        this.a = aogcVar;
        this.b = adchVar;
        this.c = adbaVar;
        this.d = ahynVar;
        this.k = ahynVar2;
        this.e = ahynVar3;
        this.f = ahynVar4;
        this.g = ahynVar5;
        this.h = acvlVar;
        this.i = ahynVar6;
        this.j = ahynVar7;
    }

    public adak(android.content.Context context, java.util.concurrent.Executor executor, java.lang.String str, defpackage.aogc aogcVar, defpackage.ahbz ahbzVar, defpackage.adag adagVar, defpackage.aazc aazcVar, defpackage.afgk afgkVar, defpackage.abce abceVar) {
        this.e = new java.lang.Object();
        this.k = new java.util.HashMap();
        this.g = context;
        this.f = executor;
        this.j = aogcVar;
        this.h = ahbzVar;
        this.i = adagVar;
        this.d = aazcVar;
        this.b = str;
        this.a = afgkVar;
        this.c = abceVar;
    }

    public adak(android.content.Context context, defpackage.acyv acyvVar, defpackage.adlt adltVar, defpackage.aczw aczwVar, defpackage.adba adbaVar, defpackage.abrz abrzVar, defpackage.aogc aogcVar, defpackage.ahyn ahynVar, defpackage.acxa acxaVar, java.util.concurrent.Executor executor, defpackage.acvl acvlVar) {
        this.h = context;
        this.g = acyvVar;
        this.d = adltVar;
        this.i = aczwVar;
        this.j = adbaVar;
        this.a = abrzVar;
        this.e = aogcVar;
        this.k = ahynVar;
        this.b = acxaVar;
        this.f = executor;
        this.c = acvlVar;
    }
}
