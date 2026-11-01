package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abrz {
    public abrz(defpackage.ajje ajjeVar) {
        j$.util.Objects.requireNonNull(ajjeVar);
    }

    public static boolean A(java.util.concurrent.Future future) {
        if (future == null || !future.isDone()) {
            return false;
        }
        try {
            defpackage.ahvr.cc(future.isDone(), "Future was expected to be done: %s", future);
            defpackage.a.h(future);
            return true;
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    public static defpackage.ajcq B(final defpackage.ajcq ajcqVar, final java.util.concurrent.Callable callable, final java.util.concurrent.Executor executor) {
        executor.getClass();
        final defpackage.ajdd ajddVar = new defpackage.ajdd();
        ajcqVar.c(new java.lang.Runnable() { // from class: adft
            @Override // java.lang.Runnable
            public final void run() {
                java.util.concurrent.Callable callable2 = callable;
                java.util.concurrent.Executor executor2 = executor;
                final defpackage.ajdd ajddVar2 = ajddVar;
                if (ajddVar2.isCancelled()) {
                    return;
                }
                try {
                    final defpackage.ajcq ajcqVar2 = (defpackage.ajcq) callable2.call();
                    final defpackage.ajcq ajcqVar3 = ajcqVar;
                    if (ajcqVar2 == null) {
                        ajddVar2.q(ajcqVar3);
                    } else {
                        ajcqVar2.c(new java.lang.Runnable() { // from class: adfs
                            @Override // java.lang.Runnable
                            public final void run() {
                                defpackage.ajcq ajcqVar4 = ajcqVar2;
                                defpackage.ajdd ajddVar3 = ajddVar2;
                                try {
                                    defpackage.ahvr.cc(ajcqVar4.isDone(), "Future was expected to be done: %s", ajcqVar4);
                                    defpackage.a.h(ajcqVar4);
                                } catch (java.util.concurrent.ExecutionException e) {
                                    ajddVar3.p(e.getCause());
                                } catch (java.lang.Throwable th) {
                                    ajddVar3.p(th);
                                }
                                ajddVar3.q(ajcqVar3);
                            }
                        }, executor2);
                    }
                } catch (java.lang.Exception e) {
                    ajddVar2.p(e);
                }
            }
        }, executor);
        return ajddVar;
    }

    public static defpackage.agmo C(defpackage.akof akofVar) {
        if (akofVar.b.isEmpty()) {
            return null;
        }
        defpackage.agml agmlVar = ((defpackage.akog) akofVar.b.get(0)).b;
        if (agmlVar == null) {
            agmlVar = defpackage.agml.a;
        }
        defpackage.alat<defpackage.agmo> alatVar = agmlVar.d;
        if (alatVar.isEmpty()) {
            return null;
        }
        for (defpackage.agmo agmoVar : alatVar) {
            if ((agmoVar.b & 1) != 0) {
                defpackage.agmm agmmVar = agmoVar.c;
                if (agmmVar == null) {
                    agmmVar = defpackage.agmm.a;
                }
                if (agmmVar.b) {
                    return agmoVar;
                }
            }
        }
        return (defpackage.agmo) alatVar.get(0);
    }

    public static android.content.SharedPreferences D(android.content.Context context, java.lang.String str, defpackage.ahyn ahynVar) {
        return context.getSharedPreferences(G(str, ahynVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [albh, java.lang.Object] */
    public static defpackage.albh E(java.lang.String str, defpackage.albn albnVar) {
        try {
            return albnVar.j(android.util.Base64.decode(str, 3), defpackage.akzq.a);
        } catch (java.lang.IllegalArgumentException e) {
            throw new defpackage.alaz("Unable to decode to byte array", new java.io.IOException(e));
        }
    }

    public static defpackage.albh F(android.content.SharedPreferences sharedPreferences, java.lang.String str, defpackage.albn albnVar) {
        java.lang.String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return E(string, albnVar);
        } catch (defpackage.alaz unused) {
            return null;
        }
    }

    public static java.lang.String G(java.lang.String str, defpackage.ahyn ahynVar) {
        return (ahynVar == null || !ahynVar.f()) ? str : str.concat((java.lang.String) ahynVar.b());
    }

    public static java.lang.String H(defpackage.albh albhVar) {
        return android.util.Base64.encodeToString(albhVar.i(), 3);
    }

    public static void I(android.content.SharedPreferences.Editor editor, java.lang.String str, defpackage.albh albhVar) {
        editor.putString(str, H(albhVar));
    }

    public static boolean J(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean K(android.content.SharedPreferences sharedPreferences, java.lang.String str, defpackage.albh albhVar) {
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        I(editorEdit, str, albhVar);
        return editorEdit.commit();
    }

    public static android.net.Uri L(android.content.Context context, defpackage.ahyn ahynVar) {
        java.util.regex.Pattern pattern = defpackage.afej.a;
        defpackage.afei afeiVar = new defpackage.afei(context);
        afeiVar.e((ahynVar == null || !ahynVar.f()) ? "datadownload" : (java.lang.String) ahynVar.b());
        if (ahynVar != null && ahynVar.f()) {
            afeiVar.f("datadownload");
        }
        return afeiVar.a();
    }

    public static android.net.Uri M(android.content.Context context, defpackage.ahyn ahynVar) {
        return L(context, ahynVar).buildUpon().appendPath("links").build();
    }

    public static android.net.Uri N(android.content.Context context, java.lang.String str) {
        defpackage.ahzf ahzfVar = afek.a;
        return defpackage.aehj.N(str, context.getPackageName(), 0L);
    }

    public static java.lang.String O(java.lang.String str, defpackage.ahyn ahynVar) {
        if (ahynVar != null && ahynVar.f()) {
            str = str.concat((java.lang.String) ahynVar.b());
        }
        return str.concat(".pb");
    }

    public static android.net.Uri P(android.content.Context context, int i, java.lang.String str, java.lang.String str2, defpackage.acxa acxaVar, defpackage.ahyn ahynVar, boolean z) {
        try {
            return z ? N(context, str2) : L(context, ahynVar).buildUpon().appendPath(Q(i)).build().buildUpon().appendPath(str).build();
        } catch (java.lang.Exception e) {
            defpackage.adbe.g(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            acxaVar.a();
            return null;
        }
    }

    public static java.lang.String Q(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? "public_3p" : "private";
        }
        return "public";
    }

    public static android.net.Uri R(android.content.Context context) {
        java.util.regex.Pattern pattern = defpackage.afej.a;
        defpackage.afei afeiVar = new defpackage.afei(context);
        afeiVar.e("datadownloadmanifest");
        afeiVar.f("datadownload");
        return afeiVar.a();
    }

    public static defpackage.afgl S(android.content.Context context, defpackage.ajct ajctVar, defpackage.adba adbaVar, defpackage.adae adaeVar, defpackage.ahyn ahynVar) {
        defpackage.afgq afgqVarD = defpackage.afgs.d(context, ajctVar);
        afgqVarD.c = G("gms_icing_mdd_groups", ahynVar);
        afgqVarD.b();
        afgqVarD.e = new defpackage.rwp(adaeVar, 20);
        afgqVarD.e(new defpackage.adby(adbaVar, 1));
        return afgqVarD.a();
    }

    public static defpackage.afgl T(android.content.Context context, defpackage.ajct ajctVar, defpackage.adba adbaVar, defpackage.adae adaeVar, defpackage.ahyn ahynVar) {
        defpackage.afgq afgqVarD = defpackage.afgs.d(context, ajctVar);
        afgqVarD.c = G("gms_icing_mdd_shared_files", ahynVar);
        afgqVarD.b();
        afgqVarD.e = new defpackage.rwp(adaeVar, 20);
        afgqVarD.e(new defpackage.adby(adbaVar, 0));
        return afgqVarD.a();
    }

    public static final defpackage.acyu U(defpackage.adae adaeVar, defpackage.adak adakVar, defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3, defpackage.amyz amyzVar4, defpackage.amyz amyzVar5, defpackage.amyz amyzVar6, defpackage.amyz amyzVar7, defpackage.amyz amyzVar8, defpackage.amyz amyzVar9, defpackage.amyz amyzVar10, defpackage.amyz amyzVar11, defpackage.amyz amyzVar12, defpackage.amyz amyzVar13, defpackage.amyz amyzVar14, defpackage.amyz amyzVar15, defpackage.amyz amyzVar16, defpackage.amyz amyzVar17) {
        android.content.Context contextC = defpackage.adaf.c(adaeVar);
        defpackage.adba adbaVar = (defpackage.adba) amyzVar.a();
        defpackage.acxa acxaVar = (defpackage.acxa) amyzVar2.a();
        defpackage.acyv acyvVar = (defpackage.acyv) amyzVar14.a();
        defpackage.adlt adltVarW = W(adaeVar, adakVar, amyzVar, amyzVar2, amyzVar3, amyzVar4, amyzVar5, amyzVar6, amyzVar7, amyzVar8, amyzVar9, amyzVar10, amyzVar12, amyzVar13, amyzVar14);
        defpackage.abrz abrzVar = (defpackage.abrz) amyzVar11.a();
        defpackage.ahyn ahynVar = (defpackage.ahyn) amyzVar15.a();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) amyzVar6.a();
        defpackage.ahyn ahynVar2 = (defpackage.ahyn) amyzVar3.a();
        defpackage.aogc aogcVar = (defpackage.aogc) amyzVar5.a();
        defpackage.ahyn ahynVar3 = (defpackage.ahyn) amyzVar16.a();
        af(adakVar, amyzVar4, amyzVar6, amyzVar14);
        return new defpackage.acyu(contextC, adbaVar, acxaVar, acyvVar, adltVarW, abrzVar, ahynVar, executor, ahynVar2, aogcVar, ahynVar3, (defpackage.acvl) amyzVar4.a(), (java.util.concurrent.Executor) amyzVar17.a());
    }

    public static final long V() {
        return j$.time.Instant.now().toEpochMilli();
    }

    public static final defpackage.adlt W(defpackage.adae adaeVar, defpackage.adak adakVar, defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3, defpackage.amyz amyzVar4, defpackage.amyz amyzVar5, defpackage.amyz amyzVar6, defpackage.amyz amyzVar7, defpackage.amyz amyzVar8, defpackage.amyz amyzVar9, defpackage.amyz amyzVar10, defpackage.amyz amyzVar11, defpackage.amyz amyzVar12, defpackage.amyz amyzVar13) {
        android.content.Context contextC = defpackage.adaf.c(adaeVar);
        defpackage.acxa acxaVar = (defpackage.acxa) amyzVar2.a();
        defpackage.aczw aczwVar = (defpackage.aczw) amyzVar7.a();
        defpackage.aogc aogcVar = (defpackage.aogc) amyzVar5.a();
        defpackage.adax adaxVar = new defpackage.adax(defpackage.adaf.c(adaeVar), (defpackage.ahzi) amyzVar8.a(), (defpackage.aogc) amyzVar5.a(), (defpackage.adch) amyzVar9.a(), (defpackage.ahyn) amyzVar10.a(), (defpackage.adbf) amyzVar11.a(), (java.util.concurrent.Executor) amyzVar6.a(), (defpackage.acvl) amyzVar4.a());
        defpackage.ahyn ahynVar = (defpackage.ahyn) amyzVar12.a();
        defpackage.ahyn ahynVar2 = (defpackage.ahyn) amyzVar10.a();
        defpackage.adba adbaVar = (defpackage.adba) amyzVar.a();
        defpackage.acvl acvlVar = (defpackage.acvl) amyzVar4.a();
        defpackage.ahyn ahynVar3 = (defpackage.ahyn) amyzVar3.a();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) amyzVar6.a();
        defpackage.agab agabVar = new defpackage.agab((int[]) null);
        java.lang.Object obj = adakVar.j;
        return new defpackage.adlt(contextC, acxaVar, aczwVar, aogcVar, adaxVar, ahynVar, ahynVar2, adbaVar, acvlVar, ahynVar3, executor, agabVar);
    }

    public static dva X(android.content.Context context) {
        dva dvaVarY = Y(context);
        dvaVarY.h(context.getResources().getString(2132019326));
        dvaVarY.n(android.R.drawable.stat_notify_sync_noanim);
        return dvaVarY;
    }

    public static dva Y(android.content.Context context) {
        dva dvaVar = new dva(context, "download-notification-channel-id");
        dvaVar.r = "service";
        dvaVar.d(8, true);
        return dvaVar;
    }

    public static void Z(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        intent.putExtra("key", str);
        aa$.ExternalSyntheticApiModelOutline0.m(context, intent);
    }

    public static void aa(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        aa$.ExternalSyntheticApiModelOutline0.m(context, intent);
    }

    public static defpackage.acxd ab(defpackage.acuu acuuVar) {
        defpackage.acxc acxcVarA = defpackage.acxd.a();
        if ((acuuVar.b & 1) != 0) {
            acxcVarA.d(acuuVar.c);
        }
        if ((acuuVar.b & 2) != 0) {
            acxcVarA.c(acuuVar.d);
        }
        if ((acuuVar.b & 4) != 0) {
            acxcVarA.b(acuuVar.e);
        }
        return acxcVarA.a();
    }

    public static vaa ac(java.lang.Iterable iterable) {
        return new vaa(defpackage.aiql.Y(iterable));
    }

    @java.lang.SafeVarargs
    public static vaa ad(defpackage.ajcq... ajcqVarArr) {
        return new vaa(defpackage.aiql.Z(ajcqVarArr));
    }

    @java.lang.SafeVarargs
    public static vaa ae(defpackage.ajcq... ajcqVarArr) {
        return new vaa(defpackage.aiql.ab(ajcqVarArr));
    }

    public static final defpackage.abrz af(defpackage.adak adakVar, defpackage.amyz amyzVar, defpackage.amyz amyzVar2, defpackage.amyz amyzVar3) {
        defpackage.aooc.ap(adakVar.i);
        return new defpackage.abrz();
    }

    public static defpackage.acwi ag(android.content.Context context, defpackage.ajct ajctVar, defpackage.aify aifyVar, defpackage.aogc aogcVar, defpackage.aogc aogcVar2, defpackage.adch adchVar, defpackage.ahyn ahynVar, defpackage.ahzi ahziVar, defpackage.ahyn ahynVar2, defpackage.adae adaeVar, defpackage.adae adaeVar2, defpackage.acxa acxaVar, defpackage.ahbz ahbzVar, defpackage.ahyn ahynVar3, defpackage.ahyn ahynVar4, defpackage.acvl acvlVar, defpackage.ahyn ahynVar5, defpackage.ahyn ahynVar6) {
        defpackage.adbk adblVar;
        defpackage.acwj acwjVar = new defpackage.acwj();
        acwjVar.a = context.getApplicationContext();
        defpackage.ahvr.ci(ajctVar);
        acwjVar.b = ajctVar;
        java.util.List list = acwjVar.c;
        list.addAll(aifyVar);
        acwjVar.d = defpackage.ahyn.g(aogcVar);
        acwjVar.v = aogcVar2;
        acwjVar.e = adchVar;
        acwjVar.f = ahynVar;
        acwjVar.g = defpackage.ahvr.bI(ahziVar);
        acwjVar.h = ahynVar2;
        acwjVar.i = defpackage.ahyn.h(adaeVar);
        acwjVar.j = defpackage.ahyn.h(adaeVar2);
        acwjVar.k = defpackage.ahyn.h(acxaVar);
        acwjVar.l = ahynVar3;
        acwjVar.m = defpackage.ahyn.h(com.google.android.libraries.mdi.download.foreground.sting.ForegroundDownloadService.class);
        acwjVar.u = ahbzVar;
        acwjVar.s = ahynVar4;
        acwjVar.n = defpackage.ahyn.h(acvlVar);
        acwjVar.p = ahynVar5;
        acwjVar.q = ahynVar6;
        defpackage.ahvr.ci(acwjVar.a);
        defpackage.ahvr.ci(acwjVar.d);
        defpackage.ahvr.ci(acwjVar.v);
        defpackage.ahvr.ci(acwjVar.u);
        defpackage.ahvr.ci(acwjVar.e);
        defpackage.ahvr.ci(acwjVar.f);
        defpackage.ahvr.ci(acwjVar.g);
        defpackage.ahvr.ci(acwjVar.p);
        defpackage.ajdc ajdcVar = new defpackage.ajdc(acwjVar.b);
        int i = 4;
        if (acwjVar.i.f()) {
            defpackage.ahvr.J(defpackage.ahvr.G(new defpackage.nya(acwjVar, i), ajdcVar), new defpackage.lcn(acwjVar, 7), defpackage.ajbm.INSTANCE);
        }
        defpackage.apjg apjgVar = acwjVar.t;
        apjgVar.b = new defpackage.adae(acwjVar.a);
        apjgVar.a = new defpackage.adai((java.util.concurrent.Executor) ajdcVar, (java.util.concurrent.Executor) acwjVar.b);
        apjgVar.c = new defpackage.adag(acwjVar.h, acwjVar.g);
        defpackage.acvl acvlVar2 = (defpackage.acvl) acwjVar.n.d(new defpackage.adcl(acwjVar, 1));
        if (acwjVar.j.f()) {
            adblVar = new defpackage.adbk(acwjVar.a, (defpackage.adae) acwjVar.j.b(), new defpackage.adag(acvlVar2, defpackage.ahyw.b), acvlVar2);
        } else {
            adblVar = new adbl();
        }
        acwjVar.o = defpackage.ahyn.h(new defpackage.acxg(acwjVar.a));
        apjgVar.d = new defpackage.adak(acwjVar.v, acwjVar.e, adblVar, acwjVar.f, acwjVar.k, acwjVar.l, acwjVar.s, acwjVar.o, acvlVar2, acwjVar.q, acwjVar.r);
        apjgVar.e = new defpackage.adao(acwjVar.b, acwjVar.u);
        defpackage.aooc.an(apjgVar.b, defpackage.adae.class);
        defpackage.aooc.an(apjgVar.c, defpackage.adag.class);
        defpackage.aooc.an(apjgVar.a, defpackage.adai.class);
        defpackage.aooc.an(apjgVar.d, defpackage.adak.class);
        defpackage.aooc.an(apjgVar.e, defpackage.adao.class);
        java.lang.Object obj = apjgVar.b;
        java.lang.Object obj2 = apjgVar.c;
        java.lang.Object obj3 = apjgVar.a;
        java.lang.Object obj4 = apjgVar.d;
        java.lang.Object obj5 = apjgVar.e;
        defpackage.amyz amyzVarC = defpackage.amyu.c(new defpackage.adah(obj4, 5));
        defpackage.amyz amyzVarC2 = defpackage.amyu.c(new defpackage.adah(obj4, 14));
        defpackage.adae adaeVar3 = (defpackage.adae) obj;
        defpackage.adaf adafVar = new defpackage.adaf(adaeVar3);
        defpackage.amyz amyzVarC3 = defpackage.amyu.c(new defpackage.adah(obj4, 8));
        defpackage.amyz amyzVarC4 = defpackage.amyu.c(new defpackage.adah(obj4, 7));
        defpackage.adaa adaaVar = new defpackage.adaa(adafVar, amyzVarC2, amyzVarC3, amyzVarC4);
        defpackage.amyz amyzVarC5 = defpackage.amyu.c(new defpackage.adaq(adafVar, amyzVarC3, 4));
        defpackage.amyz amyzVarC6 = defpackage.amyu.c(new defpackage.adah(obj4, 12));
        defpackage.aczm aczmVar = new defpackage.aczm(amyzVarC4);
        defpackage.adao adaoVar = (defpackage.adao) obj5;
        defpackage.amyz amyzVarC7 = defpackage.amyu.c(new defpackage.adap(adaoVar, adafVar, amyzVarC5, amyzVarC6, amyzVarC, aczmVar, amyzVarC3, 3));
        defpackage.amyz amyzVarC8 = defpackage.amyu.c(new defpackage.adah(obj3, 3));
        defpackage.amyz amyzVarC9 = defpackage.amyu.c(new defpackage.adan(adafVar, amyzVarC2, amyzVarC7, amyzVarC8, amyzVarC4, 2, null));
        defpackage.amyz amyzVarC10 = defpackage.amyu.c(new defpackage.adaq(adafVar, amyzVarC3, 3));
        defpackage.amyz amyzVarC11 = defpackage.amyu.c(new defpackage.adah(new defpackage.aczb(adafVar, amyzVarC, adaaVar, amyzVarC9, defpackage.amyu.c(new defpackage.adan(adafVar, amyzVarC2, defpackage.amyu.c(new defpackage.adap(adaoVar, adafVar, amyzVarC10, amyzVarC6, amyzVarC, aczmVar, amyzVarC3, 0)), amyzVarC8, amyzVarC4, 1, null)), amyzVarC5, amyzVarC10, aczmVar, amyzVarC6, amyzVarC8, amyzVarC4), 10));
        defpackage.amyz amyzVarC12 = defpackage.amyu.c(new defpackage.adah(obj2, 0));
        defpackage.amyz amyzVarC13 = defpackage.amyu.c(new defpackage.adah(obj4, 9));
        defpackage.amyz amyzVarC14 = defpackage.amyu.c(new defpackage.adah(obj4, 4));
        defpackage.amyz amyzVarC15 = defpackage.amyu.c(new defpackage.adar(adaoVar, adafVar, amyzVarC3, 0));
        defpackage.amyz amyzVarC16 = defpackage.amyu.c(new defpackage.adah(defpackage.amyu.c(defpackage.adal.a), 13));
        defpackage.amyz amyzVarC17 = defpackage.amyu.c(new defpackage.adar(amyzVarC15, amyzVarC16, amyzVarC8, 1));
        defpackage.amyz amyzVarC18 = defpackage.amyu.c(new defpackage.adah(obj2, 1));
        defpackage.aczy aczyVar = new defpackage.aczy(adafVar, amyzVarC16, amyzVarC2, amyzVarC3, amyzVarC8);
        defpackage.amyz amyzVarC19 = defpackage.amyu.c(new defpackage.adaq(adafVar, amyzVarC3, 2));
        defpackage.amyz amyzVarC20 = defpackage.amyu.c(new defpackage.adan(adafVar, amyzVarC16, amyzVarC2, defpackage.amyu.c(new defpackage.adap(adaoVar, adafVar, amyzVarC19, amyzVarC6, amyzVarC, aczmVar, amyzVarC3, 2)), amyzVarC8, 0));
        defpackage.amyz amyzVarC21 = defpackage.amyu.c(new defpackage.adaq(adafVar, amyzVarC3, 0));
        defpackage.amyz amyzVarC22 = defpackage.amyu.c(new defpackage.adah(new defpackage.acyz(amyzVarC, aczyVar, amyzVarC20, defpackage.amyu.c(new defpackage.adam(adafVar, amyzVarC16, amyzVarC2, defpackage.amyu.c(new defpackage.adap(adaoVar, adafVar, amyzVarC21, amyzVarC6, amyzVarC, aczmVar, amyzVarC3, 1)), amyzVarC8, amyzVarC4)), amyzVarC19, amyzVarC21, aczmVar, amyzVarC6, amyzVarC8, amyzVarC4), 6));
        defpackage.amyz amyzVarC23 = defpackage.amyu.c(new defpackage.adaq(obj4, adafVar, 1));
        defpackage.amyz amyzVarC24 = defpackage.amyu.c(new defpackage.adah(obj4, 11));
        defpackage.amyz amyzVarC25 = defpackage.amyu.c(new defpackage.adah(obj3, 2));
        if (adblVar instanceof defpackage.adbk) {
            adblVar.b = defpackage.ahyn.h((defpackage.adbf) amyzVarC17.a());
        }
        defpackage.ahyn ahynVarH = defpackage.ahwt.a;
        android.content.Context applicationContext = acwjVar.a.getApplicationContext();
        defpackage.ajdc ajdcVar2 = new defpackage.ajdc(ajdcVar);
        defpackage.ahvr.bI(acwjVar.g);
        if (acwjVar.f.f()) {
            defpackage.ahyn.h(acwjVar.f.b());
        }
        if (acwjVar.m.f()) {
            ahynVarH = defpackage.ahyn.h(acwjVar.m.b());
        }
        defpackage.aogc aogcVar3 = new defpackage.aogc(applicationContext, ahynVarH, (java.util.concurrent.Executor) ajdcVar2);
        android.content.Context context2 = acwjVar.a;
        defpackage.adba adbaVar = (defpackage.adba) amyzVarC.a();
        android.content.Context contextC = defpackage.adaf.c(adaeVar3);
        defpackage.adba adbaVar2 = (defpackage.adba) amyzVarC.a();
        defpackage.adak adakVar = (defpackage.adak) obj4;
        defpackage.adlt adltVarW = W(adaeVar3, adakVar, amyzVarC, amyzVarC2, amyzVarC3, amyzVarC4, amyzVarC6, amyzVarC8, amyzVarC11, amyzVarC12, amyzVarC13, amyzVarC14, amyzVarC17, amyzVarC18, amyzVarC22);
        defpackage.aczw aczwVar = (defpackage.aczw) amyzVarC11.a();
        defpackage.acyu acyuVarU = U(adaeVar3, adakVar, amyzVarC, amyzVarC2, amyzVarC3, amyzVarC4, amyzVarC6, amyzVarC8, amyzVarC11, amyzVarC12, amyzVarC13, amyzVarC14, amyzVarC16, amyzVarC17, amyzVarC18, amyzVarC22, amyzVarC23, amyzVarC24, amyzVarC25);
        defpackage.acyv acyvVar = (defpackage.acyv) amyzVarC22.a();
        defpackage.adak adakVar2 = new defpackage.adak(defpackage.adaf.c(adaeVar3), (defpackage.acyv) amyzVarC22.a(), W(adaeVar3, adakVar, amyzVarC, amyzVarC2, amyzVarC3, amyzVarC4, amyzVarC6, amyzVarC8, amyzVarC11, amyzVarC12, amyzVarC13, amyzVarC14, amyzVarC17, amyzVarC18, amyzVarC22), (defpackage.aczw) amyzVarC11.a(), (defpackage.adba) amyzVarC.a(), (defpackage.abrz) amyzVarC16.a(), (defpackage.aogc) amyzVarC6.a(), (defpackage.ahyn) amyzVarC3.a(), (defpackage.acxa) amyzVarC2.a(), (java.util.concurrent.Executor) amyzVarC8.a(), (defpackage.acvl) amyzVarC4.a());
        defpackage.acxa acxaVar2 = (defpackage.acxa) amyzVarC2.a();
        defpackage.agqj agqjVar = new defpackage.agqj(defpackage.adaf.c(adaeVar3), (defpackage.acyv) amyzVarC22.a(), W(adaeVar3, adakVar, amyzVarC, amyzVarC2, amyzVarC3, amyzVarC4, amyzVarC6, amyzVarC8, amyzVarC11, amyzVarC12, amyzVarC13, amyzVarC14, amyzVarC17, amyzVarC18, amyzVarC22), (defpackage.aogc) amyzVarC6.a(), (defpackage.adba) amyzVarC.a(), (defpackage.acxa) amyzVarC2.a(), (defpackage.ahyn) amyzVarC3.a(), (java.util.concurrent.Executor) amyzVarC8.a());
        defpackage.ahbq ahbqVar = new defpackage.ahbq(U(adaeVar3, adakVar, amyzVarC, amyzVarC2, amyzVarC3, amyzVarC4, amyzVarC6, amyzVarC8, amyzVarC11, amyzVarC12, amyzVarC13, amyzVarC14, amyzVarC16, amyzVarC17, amyzVarC18, amyzVarC22, amyzVarC23, amyzVarC24, amyzVarC25), (defpackage.acyv) amyzVarC22.a(), (defpackage.adba) amyzVarC.a(), (java.util.concurrent.Executor) amyzVarC8.a());
        defpackage.adaf.c(adaeVar3);
        defpackage.adba adbaVar3 = (defpackage.adba) amyzVarC.a();
        defpackage.aogc aogcVar4 = new defpackage.aogc(adbaVar3, (defpackage.acvl) amyzVarC4.a(), (defpackage.adbf) amyzVarC17.a(), (float[]) null);
        defpackage.ahyn ahynVar7 = (defpackage.ahyn) amyzVarC3.a();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) amyzVarC8.a();
        defpackage.ahyn ahynVar8 = (defpackage.ahyn) amyzVarC24.a();
        defpackage.acvl acvlVar3 = (defpackage.acvl) amyzVarC4.a();
        defpackage.adbf adbfVar = (defpackage.adbf) amyzVarC17.a();
        af(adakVar, amyzVarC4, amyzVarC8, amyzVarC22);
        defpackage.aczk aczkVar = new defpackage.aczk(contextC, adbaVar2, adltVarW, aczwVar, acyuVarU, acyvVar, adakVar2, acxaVar2, agqjVar, ahbqVar, aogcVar4, ahynVar7, executor, ahynVar8, acvlVar3, adbfVar);
        defpackage.ahyn ahynVar9 = acwjVar.d;
        defpackage.aogc aogcVar5 = acwjVar.v;
        defpackage.ahyn ahynVar10 = acwjVar.f;
        defpackage.ahyn ahynVar11 = acwjVar.m;
        return new defpackage.acwx(context2, adbaVar, aczkVar, ajdcVar, list, ahynVar9, aogcVar5, ahynVar10, ahynVar11, acvlVar2, aogcVar3, new defpackage.agab((int[]) null));
    }

    private static final defpackage.abvb ah(android.content.pm.PackageManager packageManager, java.lang.String str) {
        boolean z = false;
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            long jM = ft$.ExternalSyntheticApiModelOutline0.m(packageInfo);
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled) {
                z = true;
            }
            return new defpackage.abvb(jM, z);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.RuntimeException unused) {
            return null;
        }
    }

    public static final long b(boolean z, boolean z2, boolean z3, int i, int i2, int i3, long j) {
        long j2 = true != z ? 0L : 1L;
        return (((((((((((j2 << 1) | (true != z2 ? 0L : 1L)) << 1) | (true == z3 ? 1L : 0L)) << 6) | ((long) ((i + 21) & 63))) << 6) | ((long) (i2 + 21))) << 6) | ((long) ((i3 + 21) & 63))) << 43) | (j & 8796093022207L);
    }

    public static final android.os.ParcelFileDescriptor c(android.content.Context context, android.net.Uri uri, afaw afawVar) {
        return afax.h(context, uri, afawVar);
    }

    public static final defpackage.abux d(android.content.pm.PackageManager packageManager) {
        if (packageManager == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.abvb abvbVarAh = ah(packageManager, "com.google.android.contacts");
        defpackage.abvb abvbVarAh2 = ah(packageManager, "com.google.android.dialer");
        return new defpackage.abux(abvbVarAh != null ? abvbVarAh.a : -1L, abvbVarAh2 != null ? abvbVarAh2.a : -1L, abvbVarAh != null ? abvbVarAh.b : false, abvbVarAh2 != null ? abvbVarAh2.b : false);
    }

    public static defpackage.acmi e(defpackage.acni acniVar) {
        java.util.List listB = acniVar.b();
        return (defpackage.acmi) listB.get(listB.size() - 1);
    }

    public static defpackage.acmi f(defpackage.acni acniVar) {
        return (defpackage.acmi) acniVar.b().get(0);
    }

    public static defpackage.acmc g(java.lang.String str) {
        defpackage.apdi apdiVar = defpackage.acmp.a;
        defpackage.akzx akzxVarM = defpackage.acmo.a.m();
        akzxVarM.u();
        defpackage.acmo acmoVar = (defpackage.acmo) akzxVarM.b;
        acmoVar.d = 1;
        acmoVar.b |= 2;
        akzxVarM.u();
        defpackage.acmo acmoVar2 = (defpackage.acmo) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        acmoVar2.b |= 1;
        acmoVar2.c = str;
        return new defpackage.acmc(apdiVar, (defpackage.acmo) akzxVarM.r());
    }

    public static defpackage.acmc h() {
        defpackage.apdi apdiVar = defpackage.acmp.a;
        defpackage.akzx akzxVarM = defpackage.acmo.a.m();
        akzxVarM.u();
        defpackage.acmo acmoVar = (defpackage.acmo) akzxVarM.b;
        acmoVar.d = 3;
        acmoVar.b |= 2;
        return new defpackage.acmc(apdiVar, (defpackage.acmo) akzxVarM.r());
    }

    public static final long i(defpackage.bor borVar, int i) {
        if (i == 9) {
            return borVar.b;
        }
        if (i == 10) {
            return borVar.d;
        }
        if (i == 11) {
            return borVar.M;
        }
        if (i == 12) {
            return borVar.N;
        }
        if (i == 13) {
            return borVar.g;
        }
        if (i == 14) {
            return borVar.i;
        }
        if (i == 15) {
            return borVar.Q;
        }
        if (i == 16) {
            return borVar.R;
        }
        if (i == 17) {
            return borVar.q;
        }
        if (i == 18) {
            return borVar.s;
        }
        if (i == 19) {
            return borVar.k;
        }
        if (i == 20) {
            return borVar.m;
        }
        if (i == 21) {
            return borVar.U;
        }
        if (i == 22) {
            return borVar.V;
        }
        if (i == 23) {
            return borVar.A;
        }
        if (i == 24) {
            return borVar.B;
        }
        if (i == 25) {
            return borVar.a;
        }
        if (i == 26) {
            return borVar.c;
        }
        if (i == 27) {
            return borVar.K;
        }
        if (i == 28) {
            return borVar.L;
        }
        if (i == 29) {
            return borVar.C;
        }
        if (i == 30) {
            return borVar.f;
        }
        if (i == 31) {
            return borVar.h;
        }
        if (i == 32) {
            return borVar.O;
        }
        if (i == 33) {
            return borVar.P;
        }
        if (i == 34) {
            return borVar.p;
        }
        if (i == 35) {
            return borVar.D;
        }
        if (i == 36) {
            return borVar.F;
        }
        if (i == 37) {
            return borVar.G;
        }
        if (i == 38) {
            return borVar.H;
        }
        if (i == 39) {
            return borVar.I;
        }
        if (i == 40) {
            return borVar.J;
        }
        return i == 41 ? borVar.E : borVar.r;
    }

    public static /* synthetic */ defpackage.bwo j() {
        defpackage.dkz dkzVar = defpackage.acuf.a;
        defpackage.dkz dkzVar2 = defpackage.acuf.d;
        defpackage.dkz dkzVar3 = defpackage.acuf.e;
        defpackage.dkz dkzVar4 = defpackage.acuf.f;
        defpackage.dkz dkzVar5 = defpackage.acuf.g;
        defpackage.dkz dkzVar6 = defpackage.acuf.h;
        defpackage.dkz dkzVar7 = defpackage.acuf.i;
        defpackage.dkz dkzVar8 = defpackage.acuf.m;
        defpackage.dkz dkzVar9 = defpackage.acuf.n;
        defpackage.dkz dkzVar10 = defpackage.acuf.o;
        defpackage.dkz dkzVar11 = defpackage.acuf.a;
        defpackage.dkz dkzVar12 = defpackage.acuf.b;
        defpackage.dkz dkzVar13 = defpackage.acuf.c;
        defpackage.dkz dkzVar14 = defpackage.acuf.j;
        defpackage.dkz dkzVar15 = defpackage.acuf.k;
        defpackage.dkz dkzVar16 = defpackage.acuf.l;
        if (dkzVar2 == null) {
            defpackage.aooh.i("displayLarge");
        }
        if (dkzVar3 == null) {
            defpackage.aooh.i("displayMedium");
        }
        if (dkzVar4 == null) {
            defpackage.aooh.i("displaySmall");
        }
        if (dkzVar5 == null) {
            defpackage.aooh.i("headlineLarge");
        }
        if (dkzVar6 == null) {
            defpackage.aooh.i("headlineMedium");
        }
        if (dkzVar7 == null) {
            defpackage.aooh.i("headlineSmall");
        }
        if (dkzVar8 == null) {
            defpackage.aooh.i("titleLarge");
        }
        if (dkzVar9 == null) {
            defpackage.aooh.i("titleMedium");
        }
        if (dkzVar10 == null) {
            defpackage.aooh.i("titleSmall");
        }
        if (dkzVar11 == null) {
            defpackage.aooh.i("bodyLarge");
        }
        if (dkzVar12 == null) {
            defpackage.aooh.i("bodyMedium");
        }
        if (dkzVar13 == null) {
            defpackage.aooh.i("bodySmall");
        }
        if (dkzVar14 == null) {
            defpackage.aooh.i("labelLarge");
        }
        if (dkzVar15 == null) {
            defpackage.aooh.i("labelMedium");
        }
        if (dkzVar16 == null) {
            defpackage.aooh.i("labelSmall");
        }
        return new defpackage.bwo(dkzVar2, dkzVar3, dkzVar4, dkzVar5, dkzVar6, dkzVar7, dkzVar8, dkzVar9, dkzVar10, dkzVar11, dkzVar12, dkzVar13, dkzVar14, dkzVar15, dkzVar16, dkzVar2, dkzVar3, dkzVar4, dkzVar5, dkzVar6, dkzVar7, dkzVar8, dkzVar9, dkzVar10, dkzVar11, dkzVar12, dkzVar13, dkzVar14, dkzVar15, dkzVar16);
    }

    /* JADX WARN: Failed to calculate best type for var: r21v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r60v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r60v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r60v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r60v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void k(java.lang.String r39, defpackage.cmw r40, long r41, long r43, defpackage.dnd r45, defpackage.dmq r46, long r47, defpackage.dot r49, long r50, int r52, boolean r53, int r54, int r55, defpackage.aonj r56, defpackage.dkz r57, defpackage.cav r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrz.k(java.lang.String, cmw, long, long, dnd, dmq, long, dot, long, int, boolean, int, int, aonj, dkz, cav, int, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x019a  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:173:0x0204  */
    /* JADX WARN: Code duplicated, block: B:174:0x0207  */
    /* JADX WARN: Code duplicated, block: B:178:0x020f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:182:0x0218  */
    /* JADX WARN: Code duplicated, block: B:184:0x021d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0222  */
    /* JADX WARN: Code duplicated, block: B:188:0x022b  */
    /* JADX WARN: Code duplicated, block: B:189:0x022e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0235  */
    /* JADX WARN: Code duplicated, block: B:195:0x023a  */
    /* JADX WARN: Code duplicated, block: B:197:0x023e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0249  */
    /* JADX WARN: Code duplicated, block: B:200:0x024c  */
    /* JADX WARN: Code duplicated, block: B:204:0x0254  */
    /* JADX WARN: Code duplicated, block: B:206:0x0259  */
    /* JADX WARN: Code duplicated, block: B:209:0x0264  */
    /* JADX WARN: Code duplicated, block: B:213:0x0270  */
    /* JADX WARN: Code duplicated, block: B:216:0x027b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0284  */
    /* JADX WARN: Code duplicated, block: B:221:0x0297  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:231:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:234:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:237:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:239:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:240:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:242:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:244:0x0307  */
    /* JADX WARN: Code duplicated, block: B:245:0x030a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0313  */
    /* JADX WARN: Code duplicated, block: B:249:0x0317  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:252:0x031f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0322  */
    /* JADX WARN: Code duplicated, block: B:256:0x0328  */
    /* JADX WARN: Code duplicated, block: B:258:0x0332  */
    /* JADX WARN: Code duplicated, block: B:260:0x033f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0345  */
    /* JADX WARN: Code duplicated, block: B:263:0x0371  */
    /* JADX WARN: Code duplicated, block: B:265:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:256:0x0328
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final void l(defpackage.dji r35, defpackage.cmw r36, long r37, long r39, long r41, defpackage.dot r43, long r44, int r46, boolean r47, int r48, int r49, java.util.Map r50, defpackage.aonj r51, defpackage.dkz r52, defpackage.cav r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrz.l(dji, cmw, long, long, long, dot, long, int, boolean, int, int, java.util.Map, aonj, dkz, cav, int, int, int):void");
    }

    public static final void m(defpackage.bor borVar, defpackage.bry bryVar, defpackage.bti btiVar, defpackage.bwo bwoVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.bor borVar2;
        defpackage.bry bryVar2;
        defpackage.bti btiVar2;
        defpackage.bwo bwoVar2;
        defpackage.aooh.f(aonnVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2124579738);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(borVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bryVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(btiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bwoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            int i4 = (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896);
            borVar2 = borVar;
            bryVar2 = bryVar;
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            defpackage.bqx.b(borVar2, bryVar2, btiVar2, bwoVar2, defpackage.cfo.j(1798917965, new zjn(n(borVar, cavVarB), aonnVar, 17, (byte[]) null), cavVarB), cavVarB, i4 | (i2 & 7168));
        } else {
            borVar2 = borVar;
            bryVar2 = bryVar;
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new afng(borVar2, bryVar2, btiVar2, bwoVar2, aonnVar, i, 1);
        }
    }

    public static final defpackage.bme n(defpackage.bor borVar, defpackage.cav cavVar) {
        if (borVar == null) {
            defpackage.aooh.i("colorScheme");
        }
        long j = borVar.a;
        boolean zA = cavVar.A(j);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zA || objR == defpackage.cau.a) {
            float fD = defpackage.cqg.d(j);
            float fC = defpackage.cqg.c(j);
            float fB = defpackage.cqg.b(j);
            float[] fArr = defpackage.crp.a;
            objR = new defpackage.bme(j, defpackage.cfd.N(fD, fC, fB, 0.4f, defpackage.crp.y[(int) (63 & j)]));
            cbtVar.ab(objR);
        }
        return (defpackage.bme) objR;
    }

    public static final void o(defpackage.bor borVar, defpackage.bti btiVar, defpackage.bwo bwoVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.bor borVar2;
        defpackage.aonn aonnVar2;
        defpackage.bti btiVar2;
        defpackage.aooh.f(aonnVar, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(648134875);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(borVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 & (-1009);
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                btiVar = defpackage.acqn.a;
                bwoVar = defpackage.aaoo.ac();
            } else {
                cavVarB.s();
            }
            defpackage.bti btiVar3 = btiVar;
            defpackage.bwo bwoVar2 = bwoVar;
            cavVarB.l();
            borVar2 = borVar;
            m(borVar2, new acqg(), btiVar3, bwoVar2, aonnVar, cavVarB, (i2 & 14) | ((i4 << 3) & 57344));
            bwoVar = bwoVar2;
            aonnVar2 = aonnVar;
            btiVar2 = btiVar3;
        } else {
            borVar2 = borVar;
            aonnVar2 = aonnVar;
            cavVarB.s();
            btiVar2 = btiVar;
        }
        defpackage.bwo bwoVar3 = bwoVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abns(borVar2, btiVar2, bwoVar3, aonnVar2, i, 3);
        }
    }

    public static final void p(defpackage.bor borVar, defpackage.bry bryVar, defpackage.bti btiVar, defpackage.bwo bwoVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.bor borVar2;
        defpackage.bti btiVar2;
        defpackage.bwo bwoVar2;
        if (aonnVar == null) {
            defpackage.aooh.i("content");
        }
        defpackage.cav cavVarB = cavVar.b(295511914);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(borVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(btiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bwoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            byte[] bArr = null;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                bryVar = new defpackage.acqf();
            } else {
                cavVarB.s();
            }
            defpackage.bry bryVar2 = bryVar;
            cavVarB.l();
            borVar2 = borVar;
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            defpackage.bqx.a(borVar2, bryVar2, btiVar2, bwoVar2, defpackage.cfo.j(-1166625323, new defpackage.bec(n(borVar, cavVarB), aonnVar, 9, bArr), cavVarB), cavVarB, (i2 & 14) | 24576 | (i2 & 896) | (i2 & 7168));
            bryVar = bryVar2;
        } else {
            borVar2 = borVar;
            btiVar2 = btiVar;
            bwoVar2 = bwoVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(borVar2, bryVar, btiVar2, bwoVar2, aonnVar, i, 20);
        }
    }

    public static final long q(long j, float f) {
        double d = f;
        if ((((d > 1.0E-4d ? 1 : (d == 1.0E-4d ? 0 : -1)) >>> 31) | (d > 99.9999d ? 1 : 0)) != 0) {
            double[][] dArr = amnp.a;
            return ((long) amnp.d(d)) << 32;
        }
        float[] fArr = defpackage.crp.a;
        defpackage.crn crnVar = defpackage.crp.t;
        long jE = defpackage.cqg.e(j, crnVar);
        return defpackage.cqg.e(defpackage.cfd.R(f, defpackage.cqg.c(jE), defpackage.cqg.b(jE), 0.0f, crnVar, 8), defpackage.crp.e);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    public static final long r(long j, defpackage.cav cavVar) {
        long jS;
        cavVar.u(-1064574756);
        defpackage.bor borVarAk = defpackage.den.ak(cavVar);
        if (defpackage.anty.ah(j, borVarAk.a)) {
            jS = borVarAk.b;
        } else if (defpackage.anty.ah(j, borVarAk.f)) {
            jS = borVarAk.g;
        } else if (defpackage.anty.ah(j, borVarAk.j)) {
            jS = borVarAk.k;
        } else if (defpackage.anty.ah(j, borVarAk.n)) {
            jS = borVarAk.o;
        } else if (defpackage.anty.ah(j, borVarAk.w)) {
            jS = borVarAk.x;
        } else if (defpackage.anty.ah(j, borVarAk.c)) {
            jS = borVarAk.d;
        } else if (defpackage.anty.ah(j, borVarAk.h)) {
            jS = borVarAk.i;
        } else if (defpackage.anty.ah(j, borVarAk.l)) {
            jS = borVarAk.m;
        } else if (defpackage.anty.ah(j, borVarAk.y)) {
            jS = borVarAk.z;
        } else if (defpackage.anty.ah(j, borVarAk.u)) {
            jS = borVarAk.v;
        } else if (defpackage.anty.ah(j, borVarAk.p)) {
            jS = borVarAk.q;
        } else if (defpackage.anty.ah(j, borVarAk.r)) {
            jS = borVarAk.s;
        } else if (defpackage.anty.ah(j, borVarAk.D) || defpackage.anty.ah(j, borVarAk.F) || defpackage.anty.ah(j, borVarAk.G) || defpackage.anty.ah(j, borVarAk.H) || defpackage.anty.ah(j, borVarAk.I) || defpackage.anty.ah(j, borVarAk.J) || defpackage.anty.ah(j, borVarAk.E)) {
            jS = borVarAk.q;
        } else if (defpackage.anty.ah(j, borVarAk.K) || defpackage.anty.ah(j, borVarAk.L)) {
            jS = borVarAk.M;
        } else if (defpackage.anty.ah(j, borVarAk.O) || defpackage.anty.ah(j, borVarAk.P)) {
            jS = borVarAk.Q;
        } else {
            jS = (defpackage.anty.ah(j, borVarAk.S) || defpackage.anty.ah(j, borVarAk.T)) ? borVarAk.U : defpackage.cfd.S();
        }
        if (jS == 16) {
            jS = ((defpackage.cqg) cavVar.e(defpackage.boy.a)).a;
        }
        cavVar.o();
        return jS;
    }

    public static /* synthetic */ defpackage.bor s(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long jR = (2097152 & i) != 0 ? defpackage.cfd.R(0.81960785f, 0.88235295f, 1.0f, 1.0f, null, 16) : j22;
        int i3 = 524288 & i;
        int i4 = 262144 & i;
        int i5 = 131072 & i;
        int i6 = 65536 & i;
        int i7 = i & 32768;
        int i8 = i & 16384;
        int i9 = i & 8192;
        int i10 = i & 4096;
        int i11 = i & 2048;
        int i12 = i & 1024;
        int i13 = i & 512;
        int i14 = i & 256;
        int i15 = i & 128;
        int i16 = i & 64;
        int i17 = i & 32;
        int i18 = i & 16;
        int i19 = i & 8;
        int i20 = i & 4;
        int i21 = i & 2;
        int i22 = i & 1;
        long j45 = (1048576 & i) != 0 ? -58493812439252992L : j21;
        long j46 = i3 != 0 ? -7912210227527680L : j20;
        long j47 = i4 != 0 ? -16668849680154624L : j19;
        long j48 = i5 != 0 ? -52838929648320512L : j18;
        long j49 = i6 != 0 ? -7912210227527680L : j17;
        long j50 = i7 != 0 ? -66688592860151808L : j16;
        long j51 = i8 != 0 ? -7912210227527680L : j15;
        long j52 = i9 != 0 ? -66688592860151808L : j14;
        long j53 = i10 != 0 ? -16625921482031104L : j13;
        long j54 = i11 != 0 ? -67745159109935104L : j12;
        long j55 = i12 != 0 ? -69181168540450816L : j11;
        long j56 = i13 != 0 ? -41142024304328704L : j10;
        long j57 = i14 != 0 ? -17196366153383936L : j9;
        long j58 = i15 != 0 ? -71975719076364288L : j8;
        long j59 = i16 != 0 ? -72001153872691200L : j7;
        long j60 = i17 != 0 ? -36081577872064512L : j6;
        long j61 = i18 != 0 ? -68864818429296640L : j5;
        long j62 = i19 != 0 ? -12415698185748480L : j4;
        long j63 = i20 != 0 ? -69732539262042112L : j3;
        long j64 = i21 != 0 ? -70317689901416448L : j2;
        return new defpackage.bor(1 != i22 ? j : -24549921394786304L, j64, j63, j62, j61, j60, j59, j58, j57, j56, j55, j54, j53, j52, j51, j50, j49, j48, j47, jR, j46, j45, (i & 4194304) != 0 ? -3737562145357824L : 0L, (i & 8388608) != 0 ? -45013937321672704L : 0L, (i & 16777216) != 0 ? -32619108382015488L : 0L, (i & 33554432) != 0 ? -1725288362803200L : 0L, (i & 67108864) != 0 ? -31928103978663936L : j23, (i & 134217728) != 0 ? -52838929648320512L : j24, (i & 268435456) != 0 ? -72057594037927936L : j25, (i & 536870912) != 0 ? -56513544752988160L : j26, (i2 & 8) == 0 ? j32 : -66688592860151808L, (i & 1073741824) != 0 ? -63579122437193728L : j27, (i & Integer.MIN_VALUE) != 0 ? -60752226502574080L : j28, 1 != (i2 & 1) ? j29 : -57643859886211072L, (i2 & 2) != 0 ? -64427966888673280L : j30, (i2 & 4) != 0 ? -68101491071647744L : j31, (i2 & 16) != 0 ? -12415698185748480L : j33, (i2 & 32) != 0 ? -24549921394786304L : j34, (i2 & 64) != 0 ? -70898395249639424L : j35, (i2 & 128) != 0 ? -69732539262042112L : j36, (i2 & 256) != 0 ? -17196366153383936L : j37, (i2 & 512) != 0 ? -36081577872064512L : j38, (i2 & 1024) != 0 ? -72025480567455744L : j39, (i2 & 2048) != 0 ? -71975719076364288L : j40, (i2 & 4096) == 0 ? j41 : -16625921482031104L, (i2 & 8192) != 0 ? -41142024304328704L : j42, (i2 & 16384) != 0 ? -70044315233026048L : j43, (i2 & 32768) == 0 ? j44 : -67745159109935104L);
    }

    public static final long t(int i, defpackage.cav cavVar) {
        return i(((defpackage.bqv) cavVar.e(defpackage.bqx.a)).a, i);
    }

    public static /* synthetic */ defpackage.bor u(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i, int i2) {
        long j46;
        long j47;
        long j48;
        long j49;
        long jR = (2097152 & i) != 0 ? defpackage.cfd.R(0.4117647f, 0.5686275f, 0.8392157f, 1.0f, null, 16) : j22;
        int i3 = 524288 & i;
        int i4 = 262144 & i;
        int i5 = 131072 & i;
        int i6 = 65536 & i;
        int i7 = i & 32768;
        int i8 = i & 16384;
        int i9 = i & 8192;
        int i10 = i & 4096;
        int i11 = i & 2048;
        int i12 = i & 1024;
        int i13 = i & 512;
        int i14 = i & 256;
        int i15 = i & 128;
        int i16 = i & 64;
        int i17 = i & 32;
        int i18 = i & 16;
        int i19 = i & 8;
        int i20 = i & 4;
        int i21 = i & 2;
        int i22 = i & 1;
        long j50 = (1048576 & i) != 0 ? -3673528477941760L : j21;
        long j51 = i3 != 0 ? -58493812439252992L : j20;
        long j52 = i4 != 0 ? -52838929648320512L : j19;
        long j53 = i5 != 0 ? -8475168770883584L : j18;
        long j54 = i6 != 0 ? -63297651755450368L : j17;
        long j55 = i7 != 0 ? -4294967296L : j16;
        long j56 = i8 != 0 ? -63297651755450368L : j15;
        long j57 = i9 != 0 ? -4294967296L : j14;
        long j58 = i10 != 0 ? -70044315233026048L : j13;
        long j59 = i11 != 0 ? -16625921482031104L : j12;
        long j60 = i12 != 0 ? -4294967296L : j11;
        long j61 = i13 != 0 ? -66309149679419392L : j10;
        long j62 = i14 != 0 ? -72025480567455744L : j9;
        long j63 = i15 != 0 ? -17196366153383936L : j8;
        long j64 = i16 != 0 ? -4294967296L : j7;
        long j65 = i17 != 0 ? -71948076666847232L : j6;
        long j66 = i18 != 0 ? -24549921394786304L : j5;
        long j67 = i19 != 0 ? -70898395249639424L : j4;
        long j68 = i20 != 0 ? -12415698185748480L : j3;
        long j69 = i21 != 0 ? -4294967296L : j2;
        long j70 = 1 != i22 ? j : -68864818429296640L;
        long j71 = (i & 4194304) != 0 ? -21631662915846144L : 0L;
        long j72 = j60;
        long j73 = -4294967296L;
        long j74 = j69;
        if ((i & 8388608) != 0) {
            long j75 = j64;
            j49 = -4294967296L;
            j46 = j62;
            j47 = j65;
            j48 = j75;
        } else {
            j46 = j62;
            j47 = j65;
            j48 = j64;
            j49 = 0;
        }
        long j76 = -16625921482031104L;
        long j77 = (i & 16777216) != 0 ? -1725288362803200L : 0L;
        long j78 = (i & 33554432) != 0 ? -53746280144306176L : j23;
        long j79 = (i & 67108864) != 0 ? -39275152344612864L : j24;
        long j80 = (i & 134217728) != 0 ? -16668849680154624L : j25;
        long j81 = (i & 268435456) != 0 ? -72057594037927936L : j26;
        long j82 = (i & 536870912) != 0 ? -4294967296L : j27;
        long j83 = (i & 1073741824) != 0 ? -4234249343336448L : j28;
        long j84 = (i & Integer.MIN_VALUE) != 0 ? -6211184134979584L : j29;
        long j85 = 1 != (i2 & 1) ? j30 : -9601030023020544L;
        long j86 = (i2 & 2) != 0 ? -1975835280015360L : j31;
        if ((i2 & 4) == 0) {
            j73 = j32;
        }
        long j87 = (i2 & 8) != 0 ? -12424597357985792L : j33;
        long j88 = (i2 & 16) != 0 ? -12415698185748480L : j34;
        long j89 = (i2 & 32) != 0 ? -24549921394786304L : j35;
        long j90 = (i2 & 64) != 0 ? -70898395249639424L : j36;
        long j91 = (i2 & 128) != 0 ? -69732539262042112L : j37;
        long j92 = (i2 & 256) != 0 ? -17196366153383936L : j38;
        long j93 = (i2 & 512) != 0 ? -36081577872064512L : j39;
        long j94 = (i2 & 1024) == 0 ? j40 : -72025480567455744L;
        long j95 = (i2 & 2048) != 0 ? -71975719076364288L : j41;
        if ((i2 & 4096) == 0) {
            j76 = j42;
        }
        return new defpackage.bor(j70, j74, j68, j67, j66, j47, j48, j63, j46, j61, j72, j59, j58, j57, j56, j55, j54, j53, j52, jR, j51, j50, j71, j49, j77, j78, j79, j80, j81, j82, j87, j83, j84, j85, j86, j73, j88, j89, j90, j91, j92, j93, j94, j95, j76, (i2 & 8192) != 0 ? -41142024304328704L : j43, (i2 & 16384) != 0 ? -70044315233026048L : j44, (i2 & 32768) != 0 ? -67745159109935104L : j45);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0114  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:109:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0130  */
    /* JADX WARN: Code duplicated, block: B:114:0x0136  */
    /* JADX WARN: Code duplicated, block: B:120:0x014e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0158  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01db  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:154:0x035d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0365  */
    /* JADX WARN: Code duplicated, block: B:160:0x036d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0370  */
    /* JADX WARN: Code duplicated, block: B:164:0x037a  */
    /* JADX WARN: Code duplicated, block: B:165:0x037d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0385  */
    /* JADX WARN: Code duplicated, block: B:171:0x038d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0390  */
    /* JADX WARN: Code duplicated, block: B:175:0x039a  */
    /* JADX WARN: Code duplicated, block: B:176:0x039d  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:190:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:197:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:200:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:202:0x0400  */
    /* JADX WARN: Code duplicated, block: B:203:0x040d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0446  */
    /* JADX WARN: Code duplicated, block: B:209:0x045f  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0158, please report this as an issue */
    public static final void v(boolean z, defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, boolean z2, defpackage.aonn aonnVar2, defpackage.aonn aonnVar3, defpackage.crd crdVar, defpackage.bte bteVar, defpackage.btg btgVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2, int i3) {
        int i4;
        defpackage.cmw cmwVar2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        defpackage.aonn aonnVar4;
        int i8;
        int i9;
        defpackage.aonn aonnVar5;
        int i10;
        defpackage.bte bteVar2;
        int i11;
        int i12;
        boolean z4;
        boolean z5;
        defpackage.crd crdVar2;
        defpackage.btg btgVar2;
        defpackage.awa awaVar2;
        defpackage.aonn aonnVar6;
        defpackage.cmw cmwVar3;
        defpackage.aonn aonnVar7;
        defpackage.amu amuVar2;
        defpackage.ayy ayyVar2;
        defpackage.cdk cdkVarI;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        defpackage.cmw cmwVar4;
        boolean z6;
        defpackage.btg btgVar3;
        boolean z7;
        defpackage.amu amuVarA;
        defpackage.amu amuVar3;
        defpackage.awa awaVar3;
        defpackage.ayy ayyVar3;
        defpackage.bte bteVar3;
        boolean z8;
        defpackage.cmw cmwVar5;
        defpackage.btg btgVar4;
        int i18;
        int i19;
        defpackage.aonn aonnVar8;
        long jI;
        long jI2;
        defpackage.crn[] crnVarArr;
        long jN;
        long jI3;
        long j;
        long jN2;
        long jI4;
        long jI5;
        defpackage.bor borVar;
        defpackage.bte bteVar4;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        int i20;
        int i21;
        int i22;
        if (aomyVar == null) {
            defpackage.aooh.i("onClick");
        }
        if (aonnVar == null) {
            defpackage.aooh.i("label");
        }
        defpackage.cav cavVarB = cavVar.b(-802480423);
        if ((i & 6) == 0) {
            i4 = (true != cavVarB.C(z) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != cavVarB.D(aomyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.D(aonnVar) ? 128 : 256;
        }
        int i23 = i3 & 8;
        if (i23 == 0) {
            if ((i & 3072) == 0) {
                cmwVar2 = cmwVar;
                i4 |= true != cavVarB.B(cmwVar2) ? 1024 : 2048;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != cavVarB.C(z2)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                aonnVar4 = aonnVar2;
            } else {
                aonnVar4 = aonnVar2;
                if ((i & 196608) == 0) {
                    if (true != cavVarB.D(aonnVar4)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                aonnVar5 = aonnVar3;
            } else {
                aonnVar5 = aonnVar3;
                if ((i & 1572864) == 0) {
                    if (true != cavVarB.D(aonnVar5)) {
                        i10 = 524288;
                    } else {
                        i10 = 1048576;
                    }
                    i4 |= i10;
                }
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0 || !cavVarB.B(crdVar)) {
                    i22 = 4194304;
                } else {
                    i22 = 8388608;
                }
                i4 |= i22;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    bteVar2 = bteVar;
                    int i24 = cavVarB.B(bteVar2) ? 67108864 : 33554432;
                    i4 |= i24;
                } else {
                    bteVar2 = bteVar;
                }
                i4 |= i24;
            } else {
                bteVar2 = bteVar;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0 || !cavVarB.B(btgVar)) {
                    i21 = 268435456;
                } else {
                    i21 = 536870912;
                }
                i4 |= i21;
            }
            if ((i2 & 6) == 0) {
                if ((i3 & 1024) == 0 || !cavVarB.B(amuVar)) {
                    i20 = 2;
                } else {
                    i20 = 4;
                }
                i11 = i2 | i20;
            } else {
                i11 = i2;
            }
            if ((i2 & 48) == 0) {
                i11 |= 16;
            }
            i12 = i11 | 3456;
            if ((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (cavVarB.H(z4, i4 & 1)) {
                i13 = i3 & 1024;
                i14 = i3 & 512;
                i15 = i12;
                i16 = i3 & 256;
                i17 = i3 & 128;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i23 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    z6 = (!z3) | z2;
                    if (i7 != 0) {
                        aonnVar4 = null;
                    }
                    defpackage.aonn aonnVar9 = i9 == 0 ? aonnVar5 : null;
                    if (i17 != 0) {
                        i4 &= -29360129;
                        defpackage.ayy ayyVar4 = defpackage.acpw.a;
                        defpackage.bti btiVar = defpackage.acqn.a;
                        crdVar = defpackage.agab.ct(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).c, 14);
                    } else {
                        crdVar = crdVar;
                    }
                    if (i16 != 0) {
                        defpackage.ayy ayyVar5 = defpackage.acpw.a;
                        defpackage.cbd cbdVar = defpackage.bqx.a;
                        jI = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 18);
                        jI2 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 25);
                        long jI6 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 17);
                        float fD = defpackage.cqg.d(jI6);
                        float fC = defpackage.cqg.c(jI6);
                        float fB = defpackage.cqg.b(jI6);
                        float[] fArr = defpackage.crp.a;
                        crnVarArr = defpackage.crp.y;
                        jN = defpackage.cfd.N(fD, fC, fB, 0.38f, crnVarArr[(int) (jI6 & 63)]);
                        long jI7 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 17);
                        long jN3 = defpackage.cfd.N(defpackage.cqg.d(jI7), defpackage.cqg.c(jI7), defpackage.cqg.b(jI7), 0.38f, crnVarArr[(int) (jI7 & 63)]);
                        jI3 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 31);
                        long jI8 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 17);
                        j = jN3;
                        int i25 = i4;
                        jN2 = defpackage.cfd.N(defpackage.cqg.d(jI8), defpackage.cqg.c(jI8), defpackage.cqg.b(jI8), 0.12f, crnVarArr[(int) (jI8 & 63)]);
                        jI4 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 14);
                        jI5 = i(((defpackage.bqv) cavVarB.e(cbdVar)).a, 14);
                        int i26 = defpackage.bpm.a;
                        borVar = ((defpackage.bqv) cavVarB.e(cbdVar)).a;
                        bteVar4 = borVar.ab;
                        if (bteVar4 == null) {
                            long jB = defpackage.bos.b(borVar, 18);
                            long jB2 = defpackage.bos.b(borVar, 25);
                            long jB3 = defpackage.bos.b(borVar, 18);
                            long jB4 = defpackage.bos.b(borVar, 17);
                            long jN4 = defpackage.cfd.N(defpackage.cqg.d(jB4), defpackage.cqg.c(jB4), defpackage.cqg.b(jB4), 0.38f, crnVarArr[(int) (jB4 & 63)]);
                            long jB5 = defpackage.bos.b(borVar, 17);
                            long jN5 = defpackage.cfd.N(defpackage.cqg.d(jB5), defpackage.cqg.c(jB5), defpackage.cqg.b(jB5), 0.38f, crnVarArr[(int) (jB5 & 63)]);
                            long jB6 = defpackage.bos.b(borVar, 17);
                            long jN6 = defpackage.cfd.N(defpackage.cqg.d(jB6), defpackage.cqg.c(jB6), defpackage.cqg.b(jB6), 0.38f, crnVarArr[(int) (jB6 & 63)]);
                            long jB7 = defpackage.bos.b(borVar, 31);
                            long jB8 = defpackage.bos.b(borVar, 17);
                            bteVar4 = new defpackage.bte(jB, jB2, jB3, jN4, jN5, jN6, jB7, defpackage.cfd.N(defpackage.cqg.d(jB8), defpackage.cqg.c(jB8), defpackage.cqg.b(jB8), 0.12f, crnVarArr[(int) (jB8 & 63)]), defpackage.bos.b(borVar, 14), defpackage.bos.b(borVar, 14), defpackage.bos.b(borVar, 14));
                            borVar.ab = bteVar4;
                        }
                        if (jI == 16) {
                            jI = bteVar4.b;
                        }
                        long j10 = jI;
                        if (jI2 != 16) {
                            j2 = jI2;
                        } else {
                            jI2 = 16;
                            j2 = bteVar4.c;
                        }
                        if (jI2 != 16) {
                            j3 = jI2;
                        } else {
                            j3 = bteVar4.d;
                        }
                        if (jN == 16) {
                            jN = bteVar4.f;
                        }
                        long j11 = jN;
                        if (j != 16) {
                            j4 = j;
                        } else {
                            j = 16;
                            j4 = bteVar4.g;
                        }
                        if (j != 16) {
                            j5 = j;
                        } else {
                            j5 = bteVar4.h;
                        }
                        if (jI3 == 16) {
                            jI3 = bteVar4.i;
                        }
                        long j12 = jI3;
                        if (jN2 != 16) {
                            j6 = jN2;
                        } else {
                            j6 = bteVar4.j;
                        }
                        if (jI4 != 16) {
                            j7 = jI4;
                        } else {
                            j7 = bteVar4.k;
                        }
                        if (jI5 != 16) {
                            j8 = jI5;
                        } else {
                            jI5 = 16;
                            j8 = bteVar4.l;
                        }
                        if (jI5 != 16) {
                            j9 = jI5;
                        } else {
                            j9 = bteVar4.m;
                        }
                        i4 = i25 & (-234881025);
                        bteVar2 = new defpackage.bte(j10, j2, j3, j11, j4, j5, j12, j6, j7, j8, j9);
                    }
                    if (i14 != 0) {
                        defpackage.ayy ayyVar6 = defpackage.acpw.a;
                        int i27 = defpackage.bpm.a;
                        btgVar3 = new defpackage.btg();
                        i4 &= -1879048193;
                    } else {
                        btgVar3 = btgVar;
                    }
                    if (i13 != 0) {
                        defpackage.ayy ayyVar7 = defpackage.acpw.a;
                        z7 = z6;
                        amuVarA = defpackage.acpw.a(z7, z, cavVarB);
                        i15 &= -15;
                    } else {
                        z7 = z6;
                        amuVarA = amuVar;
                    }
                    defpackage.ayy ayyVar8 = defpackage.acpw.a;
                    int i28 = defpackage.bpm.a;
                    amuVar3 = amuVarA;
                    awaVar3 = defpackage.boq.a;
                    ayyVar3 = defpackage.acpw.a;
                    bteVar3 = bteVar2;
                    z8 = z7;
                    cmwVar5 = cmwVar4;
                    btgVar4 = btgVar3;
                    i18 = i15 & (-113);
                    i19 = i4;
                    aonnVar8 = aonnVar9;
                } else {
                    cavVarB.s();
                    if (i17 != 0) {
                        i4 &= -29360129;
                    }
                    if (i16 != 0) {
                        i4 &= -234881025;
                    }
                    if (i14 != 0) {
                        i4 &= -1879048193;
                    }
                    i18 = (i13 != 0 ? i15 & (-15) : i15) & (-113);
                    z8 = z2;
                    amuVar3 = amuVar;
                    ayyVar3 = ayyVar;
                    i19 = i4;
                    bteVar3 = bteVar2;
                    cmwVar5 = cmwVar2;
                    aonnVar8 = aonnVar5;
                    btgVar4 = btgVar;
                    awaVar3 = awaVar;
                }
                defpackage.aonn aonnVar10 = aonnVar4;
                defpackage.crd crdVar3 = crdVar;
                cavVarB.l();
                defpackage.boq.c(z, aomyVar, aonnVar, cmwVar5, z8, aonnVar10, aonnVar8, crdVar3, bteVar3, btgVar4, amuVar3, awaVar3, ayyVar3, cavVarB, 2147483646 & i19, i18 & 8078);
                ayyVar2 = ayyVar3;
                awaVar2 = awaVar3;
                amuVar2 = amuVar3;
                btgVar2 = btgVar4;
                bteVar2 = bteVar3;
                crdVar2 = crdVar3;
                aonnVar7 = aonnVar8;
                aonnVar6 = aonnVar10;
                z5 = z8;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB.s();
                z5 = z2;
                crdVar2 = crdVar;
                btgVar2 = btgVar;
                awaVar2 = awaVar;
                aonnVar6 = aonnVar4;
                cmwVar3 = cmwVar2;
                aonnVar7 = aonnVar5;
                amuVar2 = amuVar;
                ayyVar2 = ayyVar;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new acpr(z, aomyVar, aonnVar, cmwVar3, z5, aonnVar6, aonnVar7, crdVar2, bteVar2, btgVar2, amuVar2, awaVar2, ayyVar2, i, i2, i3);
            }
        }
        i4 |= 3072;
        cmwVar2 = cmwVar;
        i5 = i3 & 16;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != cavVarB.C(z2)) {
                i6 = 8192;
            } else {
                i6 = 16384;
            }
            i4 |= i6;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            aonnVar4 = aonnVar2;
        } else {
            aonnVar4 = aonnVar2;
            if ((i & 196608) == 0) {
                if (true != cavVarB.D(aonnVar4)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            aonnVar5 = aonnVar3;
        } else {
            aonnVar5 = aonnVar3;
            if ((i & 1572864) == 0) {
                if (true != cavVarB.D(aonnVar5)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i4 |= i10;
            }
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                i22 = 4194304;
            } else {
                i22 = 4194304;
            }
            i4 |= i22;
        }
        if ((i & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                bteVar2 = bteVar;
                if (cavVarB.B(bteVar2)) {
                }
                i4 |= i24;
            } else {
                bteVar2 = bteVar;
            }
            i4 |= i24;
        } else {
            bteVar2 = bteVar;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                i21 = 268435456;
            } else {
                i21 = 268435456;
            }
            i4 |= i21;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0) {
                i20 = 2;
            } else {
                i20 = 2;
            }
            i11 = i2 | i20;
        } else {
            i11 = i2;
        }
        if ((i2 & 48) == 0) {
            i11 |= 16;
        }
        i12 = i11 | 3456;
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (cavVarB.H(z4, i4 & 1)) {
            i13 = i3 & 1024;
            i14 = i3 & 512;
            i15 = i12;
            i16 = i3 & 256;
            i17 = i3 & 128;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i23 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z6 = (!z3) | z2;
                if (i7 != 0) {
                    aonnVar4 = null;
                }
                if (i9 == 0) {
                }
                if (i17 != 0) {
                    i4 &= -29360129;
                    defpackage.ayy ayyVar9 = defpackage.acpw.a;
                    defpackage.bti btiVar2 = defpackage.acqn.a;
                    crdVar = defpackage.agab.ct(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).c, 14);
                } else {
                    crdVar = crdVar;
                }
                if (i16 != 0) {
                    defpackage.ayy ayyVar10 = defpackage.acpw.a;
                    defpackage.cbd cbdVar2 = defpackage.bqx.a;
                    jI = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 18);
                    jI2 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 25);
                    long jI9 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 17);
                    float fD2 = defpackage.cqg.d(jI9);
                    float fC2 = defpackage.cqg.c(jI9);
                    float fB2 = defpackage.cqg.b(jI9);
                    float[] fArr2 = defpackage.crp.a;
                    crnVarArr = defpackage.crp.y;
                    jN = defpackage.cfd.N(fD2, fC2, fB2, 0.38f, crnVarArr[(int) (jI9 & 63)]);
                    long jI10 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 17);
                    long jN7 = defpackage.cfd.N(defpackage.cqg.d(jI10), defpackage.cqg.c(jI10), defpackage.cqg.b(jI10), 0.38f, crnVarArr[(int) (jI10 & 63)]);
                    jI3 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 31);
                    long jI11 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 17);
                    j = jN7;
                    int i29 = i4;
                    jN2 = defpackage.cfd.N(defpackage.cqg.d(jI11), defpackage.cqg.c(jI11), defpackage.cqg.b(jI11), 0.12f, crnVarArr[(int) (jI11 & 63)]);
                    jI4 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 14);
                    jI5 = i(((defpackage.bqv) cavVarB.e(cbdVar2)).a, 14);
                    int i210 = defpackage.bpm.a;
                    borVar = ((defpackage.bqv) cavVarB.e(cbdVar2)).a;
                    bteVar4 = borVar.ab;
                    if (bteVar4 == null) {
                        long jB9 = defpackage.bos.b(borVar, 18);
                        long jB10 = defpackage.bos.b(borVar, 25);
                        long jB11 = defpackage.bos.b(borVar, 18);
                        long jB12 = defpackage.bos.b(borVar, 17);
                        long jN8 = defpackage.cfd.N(defpackage.cqg.d(jB12), defpackage.cqg.c(jB12), defpackage.cqg.b(jB12), 0.38f, crnVarArr[(int) (jB12 & 63)]);
                        long jB13 = defpackage.bos.b(borVar, 17);
                        long jN9 = defpackage.cfd.N(defpackage.cqg.d(jB13), defpackage.cqg.c(jB13), defpackage.cqg.b(jB13), 0.38f, crnVarArr[(int) (jB13 & 63)]);
                        long jB14 = defpackage.bos.b(borVar, 17);
                        long jN10 = defpackage.cfd.N(defpackage.cqg.d(jB14), defpackage.cqg.c(jB14), defpackage.cqg.b(jB14), 0.38f, crnVarArr[(int) (jB14 & 63)]);
                        long jB15 = defpackage.bos.b(borVar, 31);
                        long jB16 = defpackage.bos.b(borVar, 17);
                        bteVar4 = new defpackage.bte(jB9, jB10, jB11, jN8, jN9, jN10, jB15, defpackage.cfd.N(defpackage.cqg.d(jB16), defpackage.cqg.c(jB16), defpackage.cqg.b(jB16), 0.12f, crnVarArr[(int) (jB16 & 63)]), defpackage.bos.b(borVar, 14), defpackage.bos.b(borVar, 14), defpackage.bos.b(borVar, 14));
                        borVar.ab = bteVar4;
                    }
                    if (jI == 16) {
                        jI = bteVar4.b;
                    }
                    long j13 = jI;
                    if (jI2 != 16) {
                        j2 = jI2;
                    } else {
                        jI2 = 16;
                        j2 = bteVar4.c;
                    }
                    if (jI2 != 16) {
                        j3 = jI2;
                    } else {
                        j3 = bteVar4.d;
                    }
                    if (jN == 16) {
                        jN = bteVar4.f;
                    }
                    long j14 = jN;
                    if (j != 16) {
                        j4 = j;
                    } else {
                        j = 16;
                        j4 = bteVar4.g;
                    }
                    if (j != 16) {
                        j5 = j;
                    } else {
                        j5 = bteVar4.h;
                    }
                    if (jI3 == 16) {
                        jI3 = bteVar4.i;
                    }
                    long j15 = jI3;
                    if (jN2 != 16) {
                        j6 = jN2;
                    } else {
                        j6 = bteVar4.j;
                    }
                    if (jI4 != 16) {
                        j7 = jI4;
                    } else {
                        j7 = bteVar4.k;
                    }
                    if (jI5 != 16) {
                        j8 = jI5;
                    } else {
                        jI5 = 16;
                        j8 = bteVar4.l;
                    }
                    if (jI5 != 16) {
                        j9 = jI5;
                    } else {
                        j9 = bteVar4.m;
                    }
                    i4 = i29 & (-234881025);
                    bteVar2 = new defpackage.bte(j13, j2, j3, j14, j4, j5, j15, j6, j7, j8, j9);
                }
                if (i14 != 0) {
                    defpackage.ayy ayyVar11 = defpackage.acpw.a;
                    int i211 = defpackage.bpm.a;
                    btgVar3 = new defpackage.btg();
                    i4 &= -1879048193;
                } else {
                    btgVar3 = btgVar;
                }
                if (i13 != 0) {
                    defpackage.ayy ayyVar12 = defpackage.acpw.a;
                    z7 = z6;
                    amuVarA = defpackage.acpw.a(z7, z, cavVarB);
                    i15 &= -15;
                } else {
                    z7 = z6;
                    amuVarA = amuVar;
                }
                defpackage.ayy ayyVar13 = defpackage.acpw.a;
                int i212 = defpackage.bpm.a;
                amuVar3 = amuVarA;
                awaVar3 = defpackage.boq.a;
                ayyVar3 = defpackage.acpw.a;
                bteVar3 = bteVar2;
                z8 = z7;
                cmwVar5 = cmwVar4;
                btgVar4 = btgVar3;
                i18 = i15 & (-113);
                i19 = i4;
                aonnVar8 = aonnVar9;
            } else {
                if (i23 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                z6 = (!z3) | z2;
                if (i7 != 0) {
                    aonnVar4 = null;
                }
                if (i9 == 0) {
                }
                if (i17 != 0) {
                    i4 &= -29360129;
                    defpackage.ayy ayyVar14 = defpackage.acpw.a;
                    defpackage.bti btiVar3 = defpackage.acqn.a;
                    crdVar = defpackage.agab.ct(((defpackage.bqv) cavVarB.e(defpackage.bqx.a)).c, 14);
                } else {
                    crdVar = crdVar;
                }
                if (i16 != 0) {
                    defpackage.ayy ayyVar15 = defpackage.acpw.a;
                    defpackage.cbd cbdVar3 = defpackage.bqx.a;
                    jI = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 18);
                    jI2 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 25);
                    long jI12 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 17);
                    float fD3 = defpackage.cqg.d(jI12);
                    float fC3 = defpackage.cqg.c(jI12);
                    float fB3 = defpackage.cqg.b(jI12);
                    float[] fArr3 = defpackage.crp.a;
                    crnVarArr = defpackage.crp.y;
                    jN = defpackage.cfd.N(fD3, fC3, fB3, 0.38f, crnVarArr[(int) (jI12 & 63)]);
                    long jI13 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 17);
                    long jN11 = defpackage.cfd.N(defpackage.cqg.d(jI13), defpackage.cqg.c(jI13), defpackage.cqg.b(jI13), 0.38f, crnVarArr[(int) (jI13 & 63)]);
                    jI3 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 31);
                    long jI14 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 17);
                    j = jN11;
                    int i213 = i4;
                    jN2 = defpackage.cfd.N(defpackage.cqg.d(jI14), defpackage.cqg.c(jI14), defpackage.cqg.b(jI14), 0.12f, crnVarArr[(int) (jI14 & 63)]);
                    jI4 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 14);
                    jI5 = i(((defpackage.bqv) cavVarB.e(cbdVar3)).a, 14);
                    int i214 = defpackage.bpm.a;
                    borVar = ((defpackage.bqv) cavVarB.e(cbdVar3)).a;
                    bteVar4 = borVar.ab;
                    if (bteVar4 == null) {
                        long jB17 = defpackage.bos.b(borVar, 18);
                        long jB18 = defpackage.bos.b(borVar, 25);
                        long jB19 = defpackage.bos.b(borVar, 18);
                        long jB110 = defpackage.bos.b(borVar, 17);
                        long jN12 = defpackage.cfd.N(defpackage.cqg.d(jB110), defpackage.cqg.c(jB110), defpackage.cqg.b(jB110), 0.38f, crnVarArr[(int) (jB110 & 63)]);
                        long jB111 = defpackage.bos.b(borVar, 17);
                        long jN13 = defpackage.cfd.N(defpackage.cqg.d(jB111), defpackage.cqg.c(jB111), defpackage.cqg.b(jB111), 0.38f, crnVarArr[(int) (jB111 & 63)]);
                        long jB112 = defpackage.bos.b(borVar, 17);
                        long jN14 = defpackage.cfd.N(defpackage.cqg.d(jB112), defpackage.cqg.c(jB112), defpackage.cqg.b(jB112), 0.38f, crnVarArr[(int) (jB112 & 63)]);
                        long jB113 = defpackage.bos.b(borVar, 31);
                        long jB114 = defpackage.bos.b(borVar, 17);
                        bteVar4 = new defpackage.bte(jB17, jB18, jB19, jN12, jN13, jN14, jB113, defpackage.cfd.N(defpackage.cqg.d(jB114), defpackage.cqg.c(jB114), defpackage.cqg.b(jB114), 0.12f, crnVarArr[(int) (jB114 & 63)]), defpackage.bos.b(borVar, 14), defpackage.bos.b(borVar, 14), defpackage.bos.b(borVar, 14));
                        borVar.ab = bteVar4;
                    }
                    if (jI == 16) {
                        jI = bteVar4.b;
                    }
                    long j16 = jI;
                    if (jI2 != 16) {
                        j2 = jI2;
                    } else {
                        jI2 = 16;
                        j2 = bteVar4.c;
                    }
                    if (jI2 != 16) {
                        j3 = jI2;
                    } else {
                        j3 = bteVar4.d;
                    }
                    if (jN == 16) {
                        jN = bteVar4.f;
                    }
                    long j17 = jN;
                    if (j != 16) {
                        j4 = j;
                    } else {
                        j = 16;
                        j4 = bteVar4.g;
                    }
                    if (j != 16) {
                        j5 = j;
                    } else {
                        j5 = bteVar4.h;
                    }
                    if (jI3 == 16) {
                        jI3 = bteVar4.i;
                    }
                    long j18 = jI3;
                    if (jN2 != 16) {
                        j6 = jN2;
                    } else {
                        j6 = bteVar4.j;
                    }
                    if (jI4 != 16) {
                        j7 = jI4;
                    } else {
                        j7 = bteVar4.k;
                    }
                    if (jI5 != 16) {
                        j8 = jI5;
                    } else {
                        jI5 = 16;
                        j8 = bteVar4.l;
                    }
                    if (jI5 != 16) {
                        j9 = jI5;
                    } else {
                        j9 = bteVar4.m;
                    }
                    i4 = i213 & (-234881025);
                    bteVar2 = new defpackage.bte(j16, j2, j3, j17, j4, j5, j18, j6, j7, j8, j9);
                }
                if (i14 != 0) {
                    defpackage.ayy ayyVar16 = defpackage.acpw.a;
                    int i215 = defpackage.bpm.a;
                    btgVar3 = new defpackage.btg();
                    i4 &= -1879048193;
                } else {
                    btgVar3 = btgVar;
                }
                if (i13 != 0) {
                    defpackage.ayy ayyVar17 = defpackage.acpw.a;
                    z7 = z6;
                    amuVarA = defpackage.acpw.a(z7, z, cavVarB);
                    i15 &= -15;
                } else {
                    z7 = z6;
                    amuVarA = amuVar;
                }
                defpackage.ayy ayyVar18 = defpackage.acpw.a;
                int i216 = defpackage.bpm.a;
                amuVar3 = amuVarA;
                awaVar3 = defpackage.boq.a;
                ayyVar3 = defpackage.acpw.a;
                bteVar3 = bteVar2;
                z8 = z7;
                cmwVar5 = cmwVar4;
                btgVar4 = btgVar3;
                i18 = i15 & (-113);
                i19 = i4;
                aonnVar8 = aonnVar9;
            }
            defpackage.aonn aonnVar11 = aonnVar4;
            defpackage.crd crdVar4 = crdVar;
            cavVarB.l();
            defpackage.boq.c(z, aomyVar, aonnVar, cmwVar5, z8, aonnVar11, aonnVar8, crdVar4, bteVar3, btgVar4, amuVar3, awaVar3, ayyVar3, cavVarB, 2147483646 & i19, i18 & 8078);
            ayyVar2 = ayyVar3;
            awaVar2 = awaVar3;
            amuVar2 = amuVar3;
            btgVar2 = btgVar4;
            bteVar2 = bteVar3;
            crdVar2 = crdVar4;
            aonnVar7 = aonnVar8;
            aonnVar6 = aonnVar11;
            z5 = z8;
            cmwVar3 = cmwVar5;
        } else {
            cavVarB.s();
            z5 = z2;
            crdVar2 = crdVar;
            btgVar2 = btgVar;
            awaVar2 = awaVar;
            aonnVar6 = aonnVar4;
            cmwVar3 = cmwVar2;
            aonnVar7 = aonnVar5;
            amuVar2 = amuVar;
            ayyVar2 = ayyVar;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new acpr(z, aomyVar, aonnVar, cmwVar3, z5, aonnVar6, aonnVar7, crdVar2, bteVar2, btgVar2, amuVar2, awaVar2, ayyVar2, i, i2, i3);
        }
    }

    public static final void w(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar2, defpackage.crd crdVar, bod bodVar, bof bofVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        defpackage.crd crdVar2;
        defpackage.amu amuVar2;
        defpackage.ayy ayyVar2;
        boolean z2;
        bof bofVar2;
        defpackage.awa awaVar2;
        bof bofVar3;
        defpackage.awa awaVar3;
        boolean z3;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonnVar, "label");
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1749139236);
        if (i4 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            i5 |= true != cavVarB.D(aonnVar2) ? 8192 : 16384;
        }
        int i6 = i5 | 196608;
        if ((1572864 & i) == 0) {
            crdVar2 = crdVar;
            i6 |= true != cavVarB.B(crdVar2) ? 524288 : 1048576;
        } else {
            crdVar2 = crdVar;
        }
        if ((12582912 & i) == 0) {
            i6 |= true != cavVarB.B(bodVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            amuVar2 = amuVar;
            i6 |= true != cavVarB.B(amuVar2) ? 268435456 : 536870912;
        } else {
            amuVar2 = amuVar;
        }
        int i7 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            ayyVar2 = ayyVar;
            i7 |= true == cavVarB.B(ayyVar2) ? 32 : 16;
        } else {
            ayyVar2 = ayyVar;
        }
        int i8 = i7 | 384;
        if (cavVarB.H(((306783379 & i6) == 306783378 && (i8 & 147) == 146) ? false : true, i6 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.ayy ayyVar3 = acph.a;
                int i9 = bna.a;
                bofVar3 = new bof();
                awaVar3 = defpackage.boq.a;
                z3 = true;
            } else {
                cavVarB.s();
                z3 = z;
                bofVar3 = bofVar;
                awaVar3 = awaVar;
            }
            cavVarB.l();
            defpackage.boq.b(aomyVar, aonnVar, cmwVar2, z3, aonnVar2, crdVar2, bodVar, bofVar3, amuVar2, awaVar3, ayyVar2, cavVarB, i6 & 1912602622, i8 & 1008);
            z2 = z3;
            bofVar2 = bofVar3;
            awaVar2 = awaVar3;
        } else {
            cavVarB.s();
            z2 = z;
            bofVar2 = bofVar;
            awaVar2 = awaVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bby(aomyVar, aonnVar, cmwVar, z2, aonnVar2, crdVar, bodVar, bofVar2, amuVar, awaVar2, ayyVar, i, i2, 4);
        }
    }

    public static final void x(defpackage.aomy aomyVar, defpackage.aonn aonnVar, defpackage.cmw cmwVar, boolean z, defpackage.aonn aonnVar2, defpackage.crd crdVar, bod bodVar, bof bofVar, defpackage.amu amuVar, defpackage.awa awaVar, defpackage.ayy ayyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar3;
        defpackage.crd crdVar2;
        defpackage.amu amuVar2;
        boolean z2;
        bof bofVar2;
        defpackage.awa awaVar2;
        defpackage.ayy ayyVar2;
        defpackage.awa awaVar3;
        bof bofVar3;
        defpackage.ayy ayyVar3;
        defpackage.aooh.f(aomyVar, "onClick");
        defpackage.aooh.f(aonnVar, "label");
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1478467158);
        boolean z3 = true;
        if (i4 == 0) {
            i3 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            aonnVar3 = aonnVar2;
            i5 |= true != cavVarB.D(aonnVar3) ? 8192 : 16384;
        } else {
            aonnVar3 = aonnVar2;
        }
        if ((196608 & i) == 0) {
            crdVar2 = crdVar;
            i5 |= true != cavVarB.B(crdVar2) ? 65536 : 131072;
        } else {
            crdVar2 = crdVar;
        }
        if ((1572864 & i) == 0) {
            i5 |= true != cavVarB.B(bodVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            amuVar2 = amuVar;
            i5 |= true != cavVarB.B(amuVar2) ? 33554432 : 67108864;
        } else {
            amuVar2 = amuVar;
        }
        if ((805306368 & i) == 0) {
            i5 |= 268435456;
        }
        int i6 = i2 | 54;
        if (cavVarB.H(((306783379 & i5) == 306783378 && (i6 & 19) == 18) ? false : true, i5 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.ayy ayyVar4 = acqv.a;
                float f = defpackage.bvj.a;
                bof bofVar4 = new bof();
                awaVar3 = defpackage.boq.a;
                bofVar3 = bofVar4;
                ayyVar3 = acqv.a;
            } else {
                cavVarB.s();
                z3 = z;
                bofVar3 = bofVar;
                ayyVar3 = ayyVar;
                awaVar3 = awaVar;
            }
            cavVarB.l();
            defpackage.boq.d(aomyVar, aonnVar, cmwVar2, z3, aonnVar3, crdVar2, bodVar, bofVar3, amuVar2, awaVar3, ayyVar3, cavVarB, i5 & 239075326, i6 & 126);
            z2 = z3;
            bofVar2 = bofVar3;
            ayyVar2 = ayyVar3;
            awaVar2 = awaVar3;
        } else {
            cavVarB.s();
            z2 = z;
            bofVar2 = bofVar;
            awaVar2 = awaVar;
            ayyVar2 = ayyVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bby(aomyVar, aonnVar, cmwVar, z2, aonnVar2, crdVar, bodVar, bofVar2, amuVar, awaVar2, ayyVar2, i, i2, 5);
        }
    }

    public static final /* synthetic */ defpackage.adae y(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.adae(akzxVar);
    }

    public final defpackage.abry a() {
        defpackage.abry abryVar = new defpackage.abry(defpackage.absb.b, android.os.Process.myTid(), true, -21, false, false);
        defpackage.absb.c = abryVar;
        return abryVar;
    }

    public final java.lang.Object z(defpackage.akex akexVar, int i) throws defpackage.adgf {
        if (i >= 5) {
            throw new defpackage.adgf("Array has a depth greater than max of 5: ".concat(akexVar.u()));
        }
        int iB = akexVar.b();
        int i2 = iB - 1;
        if (i2 == 0) {
            akexVar.m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (akexVar.s()) {
                arrayList.add(z(akexVar, i + 1));
            }
            akexVar.o();
            return arrayList;
        }
        if (i2 == 5) {
            return akexVar.k();
        }
        if (i2 == 6) {
            return java.lang.Integer.valueOf(akexVar.d());
        }
        if (i2 == 7) {
            return java.lang.Boolean.valueOf(akexVar.t());
        }
        throw new defpackage.adgf("Unsupported extra type found: " + defpackage.anty.ap(iB) + ": " + akexVar.u());
    }

    public abrz() {
    }

    public abrz(defpackage.ahzi ahziVar) {
        defpackage.ahvr.bI(ahziVar);
    }
}
