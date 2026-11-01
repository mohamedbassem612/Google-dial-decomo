package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpl {
    public final java.lang.Object a;
    public final java.lang.Object b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public afpl(java.lang.String str, java.util.List list, byte[] bArr) {
        this.a = new java.util.ArrayList();
        this.b = str;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.afpl afplVar = (defpackage.afpl) it.next();
            int i = 0;
            while (true) {
                int size = this.a.size();
                ?? r1 = this.a;
                if (i >= size) {
                    r1.add(afplVar);
                    break;
                }
                if (((java.lang.String) ((defpackage.afpl) r1.get(i)).a).equals(afplVar.a)) {
                    this.a.set(i, afplVar);
                    break;
                }
                i++;
            }
        }
    }

    public static void T(java.io.File file, java.io.File file2) throws defpackage.aajc {
        if (file.renameTo(file2)) {
            return;
        }
        throw new defpackage.aajc("Failed to rename " + file.toString() + " -> " + file2.toString() + '.');
    }

    public static final void U(defpackage.aajd aajdVar) {
        ai(aajdVar.a());
    }

    public static final void V(defpackage.aajd aajdVar) throws defpackage.aajc {
        java.io.File file = aajdVar.c;
        try {
            if (file.exists() || file.createNewFile()) {
                if (!file.setLastModified(java.lang.System.currentTimeMillis())) {
                    throw new defpackage.aajc(a.bG((byte) 46, aajdVar, "Failed to update last-used timestamp for "));
                }
            } else {
                throw new defpackage.aajc("Failed to touch last-used file for " + aajdVar.toString() + '.');
            }
        } catch (java.io.IOException e) {
            throw new defpackage.aajc(a.bK(e, aajdVar, "Failed to touch last-used file for ", ": "), e);
        }
    }

    public static defpackage.afpl af(defpackage.zul zulVar) {
        return new defpackage.afpl(zulVar, j$.util.Optional.empty(), (char[]) null);
    }

    public static defpackage.afpl ag(java.lang.Object obj) {
        return new defpackage.afpl(defpackage.zul.a, j$.util.Optional.of(obj), (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    private final void ah(java.lang.String str) {
        ?? r1 = this.b;
        if (r1 != 0) {
            ahvr.bR(r1.contains(str), "Can't access key outside migration: %s", str);
        }
    }

    private static boolean ai(java.io.File file) {
        java.io.File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (java.io.File file2 : fileArrListFiles) {
                ai(file2);
            }
        }
        return file.delete();
    }

    public static defpackage.afpl r(akxp akxpVar) {
        j$.util.Objects.requireNonNull(akxpVar);
        akww akwwVarC = defpackage.akmr.c(akxpVar);
        ahvr.bP(akwwVarC.b.size() == 1, "Unexpected number of scalar ptokens: %s", akwwVarC.b.size());
        defpackage.akwv akwvVar = (defpackage.akwv) akwwVarC.b.get(0);
        alfs alfsVar = (akwvVar.b == 1 ? (akwu) akwvVar.c : akwu.a).c;
        if (alfsVar == null) {
            alfsVar = alfs.a;
        }
        alfr alfrVar = alfsVar.c;
        if (alfrVar == null) {
            alfrVar = alfr.a;
        }
        akzx akzxVarM = alfr.a.m();
        if ((alfrVar.c & 536870912) != 0) {
            boolean z = alfrVar.q;
            akzxVarM.u();
            alfr alfrVar2 = akzxVarM.b;
            alfrVar2.c |= 536870912;
            alfrVar2.q = z;
        }
        if ((alfrVar.c & 134217728) != 0) {
            boolean z2 = alfrVar.o;
            akzxVarM.u();
            alfr alfrVar3 = akzxVarM.b;
            alfrVar3.c |= 134217728;
            alfrVar3.o = z2;
        }
        if ((alfrVar.c & 268435456) != 0) {
            boolean z3 = alfrVar.p;
            akzxVarM.u();
            alfr alfrVar4 = akzxVarM.b;
            alfrVar4.c |= 268435456;
            alfrVar4.p = z3;
        }
        acc accVar = new acc(0);
        if ((alfrVar.c & 2097152) != 0) {
            accVar.add(java.lang.Integer.valueOf(alfrVar.j));
        }
        if (!alfrVar.k.isEmpty()) {
            accVar.addAll(alfrVar.k);
        }
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) ahvr.bt(accVar, new java.lang.Comparable[0]);
        ahvr.ay(comparableArr, comparableArr.length);
        java.util.Arrays.sort(comparableArr);
        aike aikeVarH = aify.h(comparableArr);
        if (!aikeVarH.isEmpty()) {
            int iIntValue = ((java.lang.Integer) aikeVarH.get(0)).intValue();
            akzxVarM.u();
            alfr alfrVar5 = akzxVarM.b;
            alfrVar5.c |= 2097152;
            alfrVar5.j = iIntValue;
        }
        int i = aikeVarH.d;
        if (i > 1) {
            akzxVarM.aJ(aikeVarH.b(1, i));
        }
        if ((alfrVar.c & 33554432) != 0) {
            boolean z4 = alfrVar.m;
            akzxVarM.u();
            alfr alfrVar6 = akzxVarM.b;
            alfrVar6.c |= 33554432;
            alfrVar6.m = z4;
        }
        if ((alfrVar.c & 67108864) != 0) {
            int iAM = a.aM(alfrVar.n);
            if (iAM == 0) {
                iAM = 1;
            }
            akzxVarM.u();
            alfr alfrVar7 = akzxVarM.b;
            alfrVar7.n = iAM - 1;
            alfrVar7.c |= 67108864;
        }
        if ((alfrVar.b & 2097152) != 0) {
            int iB = defpackage.akmr.b(alfrVar.g);
            if (iB == 0) {
                iB = 1;
            }
            akzxVarM.u();
            alfr alfrVar8 = akzxVarM.b;
            alfrVar8.g = iB - 1;
            alfrVar8.b |= 2097152;
        }
        akzz akzzVarM = akwu.a.m();
        akzx akzxVarM2 = alfs.a.m();
        akzxVarM2.u();
        alfs alfsVar2 = akzxVarM2.b;
        alfr alfrVarP = akzxVarM.p();
        j$.util.Objects.requireNonNull(alfrVarP);
        alfsVar2.c = alfrVarP;
        alfsVar2.b |= 1;
        akzzVarM.u();
        akwu akwuVar = akzzVarM.b;
        alfs alfsVarP = akzxVarM2.p();
        j$.util.Objects.requireNonNull(alfsVarP);
        akwuVar.c = alfsVarP;
        akwuVar.b |= 1;
        return new defpackage.afpl(akxpVar, defpackage.akmr.d(akzzVarM), (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final void A(java.lang.String str) {
        aooh.f(str, "key");
        this.a.add(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final boolean B(java.lang.String str) {
        aooh.f(str, "key");
        return !this.a.contains(str);
    }

    public final void C(java.lang.String str) {
        aooh.f(str, "text");
        ((java.lang.StringBuilder) this.a).append(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void D(java.lang.String str, aomy aomyVar, aonj aonjVar) {
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.a;
        int length = sb.length();
        aonjVar.a(this);
        this.b.add(new defpackage.abfd(str, aomyVar, length, sb.length()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void E(int i, aonj aonjVar) {
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.a;
        int length = sb.length();
        aonjVar.a(this);
        this.b.add(new defpackage.abfe(i, length, sb.length()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void F(aonj aonjVar) {
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.a;
        int length = sb.length();
        aonjVar.a(this);
        this.b.add(new defpackage.abfi(length, sb.length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final java.util.List G() {
        return (java.util.List) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ccp, java.lang.Object] */
    public final void H(java.util.List list) {
        this.b.b(list);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0009 A[SYNTHETIC] */
    public final defpackage.abcw I(java.util.List list) {
        defpackage.abct abctVar;
        java.lang.Thread thread;
        defpackage.abcv abcvVar;
        defpackage.abcw abcwVar = new defpackage.abcw();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                defpackage.abcs abcsVar = (defpackage.abcs) ((ajcq) it.next()).get();
                if (abcsVar != null) {
                    java.lang.Object obj = this.b;
                    if (obj != null) {
                        try {
                            defpackage.abcv abcvVar2 = abcsVar.c;
                            if (abcvVar2 == null || (abctVar = abcsVar.b) == null) {
                                android.util.Log.e("AppDoctor", "Null CompletionResult from Fixer.");
                            } else {
                                defpackage.zvl zvlVar = abctVar.c;
                                int i = abcvVar2.a(zvlVar).b;
                                java.lang.Object obj2 = ((defpackage.ajxi) obj).a;
                                if (i == 5) {
                                    java.lang.String str = abctVar.b;
                                    android.os.Bundle bundleA = ((abcn) obj2).a();
                                    bundleA.putString("com.google.android.gms.common.appdoctor.uuid", str);
                                    ((abcn) obj2).b.call("mark_fix_completed", null, bundleA);
                                } else {
                                    abcvVar2.a(zvlVar);
                                    java.lang.String str2 = abctVar.b;
                                    android.os.Bundle bundleA2 = ((abcn) obj2).a();
                                    bundleA2.putString("com.google.android.gms.common.appdoctor.uuid", str2);
                                    ((abcn) obj2).b.call("mark_fix_attempted", null, bundleA2);
                                }
                            }
                        } catch (android.os.RemoteException unused) {
                            java.lang.Object obj3 = ((defpackage.ajxi) obj).b;
                            java.lang.Object obj4 = ((defpackage.ajxi) obj).c;
                            akzx akzxVarM = defpackage.zwa.a.m();
                            defpackage.abct abctVar2 = abcsVar.b;
                            akzxVarM.u();
                            ((defpackage.zwa) akzxVarM.b).b = abctVar2.c.a();
                            akzxVarM.u();
                            defpackage.zwa zwaVar = (defpackage.zwa) akzxVarM.b;
                            java.lang.String str3 = abctVar2.b;
                            j$.util.Objects.requireNonNull(str3);
                            zwaVar.d = str3;
                            ((acxg) obj4).i(((defpackage.abcv) obj3).b, (defpackage.zwa) akzxVarM.p(), ((defpackage.abcv) obj3).a);
                        }
                        abcwVar.a |= abcsVar.b();
                        abcwVar.b |= abcsVar.a();
                        if (!abcsVar.a() && (abcvVar = abcsVar.c) != null) {
                            android.content.Context context = abcvVar.b;
                            synchronized (defpackage.abcz.class) {
                                try {
                                    java.lang.Thread thread2 = defpackage.abcz.b;
                                    if (thread2 == null || !thread2.isAlive()) {
                                        java.lang.Thread thread3 = defpackage.abcz.a;
                                        if (thread3 != null && thread3 != defpackage.abcz.b) {
                                            thread3.interrupt();
                                        }
                                        java.lang.Thread thread4 = new java.lang.Thread(new defpackage.yne(context.getApplicationContext(), 18));
                                        thread4.start();
                                        defpackage.abcz.a = thread4;
                                        defpackage.abcz.b = thread4;
                                    } else {
                                        android.util.Log.d("AppDoctorRestartUtil", "A restart app timeout thread already started.");
                                        ahvr.ci(defpackage.abcz.b);
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (abcsVar.b()) {
                            synchronized (defpackage.abcz.class) {
                                thread = defpackage.abcz.a;
                                if (thread == null && thread.isAlive()) {
                                    android.util.Log.d("AppDoctorRestartUtil", "A restart process timeout thread already started.");
                                    ahvr.ci(defpackage.abcz.a);
                                } else {
                                    java.lang.Thread thread5 = new java.lang.Thread((java.lang.Runnable) new fvl(14));
                                    thread5.start();
                                    defpackage.abcz.a = thread5;
                                }
                            }
                        }
                    } else {
                        abcwVar.a |= abcsVar.b();
                        abcwVar.b |= abcsVar.a();
                        if (!abcsVar.a()) {
                        }
                        if (abcsVar.b()) {
                            synchronized (defpackage.abcz.class) {
                                thread = defpackage.abcz.a;
                                if (thread == null) {
                                }
                                java.lang.Thread thread6 = new java.lang.Thread((java.lang.Runnable) new fvl(14));
                                thread6.start();
                                defpackage.abcz.a = thread6;
                            }
                        }
                    }
                }
            } catch (java.lang.InterruptedException e) {
                android.util.Log.e("AppDoctorFixerFramework", "applyFixes future interrupted", e);
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.CancellationException e2) {
                e = e2;
                android.util.Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
            } catch (java.util.concurrent.ExecutionException e3) {
                e = e3;
                android.util.Log.e("AppDoctorFixerFramework", "applyFixes future failed", e);
            }
        }
        return abcwVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void J(defpackage.abct abctVar) {
        ?? r2 = this.a;
        ahvr.bZ(!r2.contains(abctVar), "The same fixer cannot be added twice");
        r2.add(abctVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    public final defpackage.akwb K(defpackage.abcv abcvVar) throws java.lang.Throwable {
        defpackage.akwb akwbVar;
        android.content.Context context;
        ajcq ajcqVarCH;
        defpackage.abcw abcwVarI;
        ajcq ajcqVarCH2;
        boolean z;
        defpackage.afpl afplVar = this;
        defpackage.abcw abcwVar = new defpackage.abcw();
        try {
            aify<defpackage.abct> aifyVarN = aify.n((java.util.Collection) afplVar.a);
            java.util.ArrayList arrayList = new java.util.ArrayList(aifyVarN.size());
            try {
                java.util.Iterator it = aifyVarN.iterator();
                while (true) {
                    java.lang.Object obj = null;
                    if (!it.hasNext()) {
                        akwbVar = new defpackage.akwb(false, aiql.z((java.lang.Object) null));
                        if (!abcwVar.b()) {
                            break;
                        }
                        context = abcvVar.b;
                        abcwVar.a(context);
                        break;
                    }
                    if (((defpackage.abct) it.next()).a(abcvVar)) {
                        android.content.Context context2 = abcvVar.b;
                        defpackage.afpl afplVar2 = new defpackage.afpl(context2, null, null, null);
                        boolean z2 = false;
                        boolean z3 = false;
                        for (defpackage.abct abctVar : aifyVarN) {
                            defpackage.abcu abcuVar = new defpackage.abcu(abcvVar);
                            abcuVar.g = abctVar;
                            defpackage.abcv abcvVarA = abcuVar.a();
                            if (abctVar.a(abcvVarA)) {
                                defpackage.abcu abcuVar2 = new defpackage.abcu(abcvVarA);
                                defpackage.abcq abcqVar = abctVar.e;
                                abcuVar2.b(new defpackage.abcr(abcqVar.a, 3));
                                defpackage.abcv abcvVarA2 = abcuVar2.a();
                                abctVar.c(abcvVarA2, abcqVar, afplVar2);
                                ajcqVarCH2 = abctVar.f ? afsq.cH(new defpackage.wwx((java.lang.Object) abctVar, (java.lang.Object) abcvVarA2, (java.lang.Object) afplVar2, 7, (byte[]) null)) : aiql.z(abctVar.b(abcvVarA2, afplVar2, abcqVar));
                                z = true;
                            } else {
                                ajcqVarCH2 = aiql.z(defpackage.abcs.a);
                                z = false;
                            }
                            z3 |= z;
                            z2 |= !ajcqVarCH2.isDone();
                            arrayList.add(ajcqVarCH2);
                            obj = obj;
                        }
                        java.lang.Object obj2 = obj;
                        if (z2) {
                            defpackage.abcw abcwVar2 = new defpackage.abcw();
                            try {
                                ajcqVarCH = afsq.cH(java.util.concurrent.Executors.callable((java.lang.Runnable) new abb(afplVar, abcwVar, arrayList, abcvVar, 9)));
                                abcwVarI = abcwVar2;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                abcwVar = abcwVar2;
                                if (abcwVar.b()) {
                                    abcwVar.a(abcvVar.b);
                                }
                                throw th;
                            }
                        } else {
                            ajcqVarCH = aiql.z(obj2);
                            abcwVarI = afplVar.I(arrayList);
                        }
                        akwbVar = new defpackage.akwb(z3, ajcqVarCH);
                        if (!abcwVarI.b()) {
                            break;
                        }
                        abcwVarI.a(context2);
                        break;
                    }
                    afplVar = this;
                }
            } catch (java.lang.RuntimeException e) {
                afsq.cG(e, abcvVar, "AppDoctorFixerFramework");
                akwbVar = new defpackage.akwb(false, aiql.y(e));
                if (abcwVar.b()) {
                    context = abcvVar.b;
                    abcwVar.a(context);
                    break;
                }
            }
            return akwbVar;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final int L() {
        return aacn.b((android.content.Context) this.b, 11925000);
    }

    public final void M(int i, com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        android.content.Intent data = new android.content.Intent("android.intent.action.VIEW").setData(googleHelp.q);
        byte[] bArr = null;
        if (i == 7) {
            i = 7;
        } else if (!((android.app.Activity) this.b).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new aanh(android.os.Looper.getMainLooper()).post(new defpackage.wdm(this, data, 17, bArr));
            return;
        }
        java.lang.Object obj = this.b;
        boolean z = aacn.a;
        if (i == 1 && true == aacn.g((android.content.Context) obj)) {
            i = 18;
        }
        aabx.a.h((android.app.Activity) obj, i, 0, (android.content.DialogInterface.OnCancelListener) null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ahzi, java.lang.Object] */
    public final void N(android.content.Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new java.lang.IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int iL = L();
        if (iL == 0) {
            ((defpackage.aams) this.a.eZ()).a(intent);
        } else {
            M(iL, (com.google.android.gms.googlehelp.GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"));
        }
    }

    public final defpackage.aajd O() {
        return P("tmp_".concat(java.lang.String.valueOf(java.util.UUID.randomUUID().toString())));
    }

    public final defpackage.aajd P(java.lang.String str) {
        aaoo aaooVar = defpackage.aana.a;
        java.io.File fileR = R();
        int i = defpackage.aanc.a;
        java.io.File file = new java.io.File(aaoo.j(fileR, str));
        aaoo aaooVar2 = defpackage.aana.a;
        java.io.File file2 = new java.io.File(aaoo.j(file, "the.apk"));
        aaoo aaooVar3 = defpackage.aana.a;
        java.io.File file3 = new java.io.File(aaoo.j(file, "opt"));
        aaoo aaooVar4 = defpackage.aana.a;
        return new defpackage.aajd(file2, file3, new java.io.File(aaoo.j(file, "t")));
    }

    public final defpackage.aajd Q(defpackage.aajh aajhVar) throws defpackage.aajc {
        defpackage.aajd aajdVarP = P(aajhVar.a);
        if (!aajdVarP.b()) {
            return null;
        }
        V(aajdVarP);
        return aajdVarP;
    }

    public final java.io.File R() {
        return ((android.content.Context) this.b).getDir("dg_cache", 0);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void S() {
        ?? r4 = this.a;
        for (java.io.File file : r4) {
            if (!ai(file)) {
                android.util.Log.e("DG", "Failed to clean up temporary file " + java.lang.String.valueOf(file) + '.');
            }
        }
        r4.clear();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aoss, java.lang.Object] */
    public final void W() {
        aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.zqs(this, (aoln) null, 14, (byte[]) null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq X() {
        return ahvr.F(new defpackage.zpk(this, 2), (java.util.concurrent.Executor) this.b);
    }

    @java.lang.Deprecated
    public final hkl Y() {
        hiv hivVar = (hiv) this.a;
        hivVar.b();
        return hivVar.a();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aoin, java.lang.Object] */
    public final defpackage.zpw Z(java.lang.Class cls, defpackage.zpt zptVar, java.util.function.Supplier supplier, defpackage.zps zpsVar, boolean z) {
        zpy zpyVar = (zpy) this.b.a();
        zpyVar.getClass();
        ajct ajctVar = (ajct) this.a.a();
        ajctVar.getClass();
        return new defpackage.zpw(zpyVar, ajctVar, cls, zptVar, z);
    }

    public final aomy a(aomy aomyVar) {
        aooh.f(aomyVar, "onClick");
        return new defpackage.xtu(this, aomyVar, 14);
    }

    public final defpackage.agyz aa(java.lang.Class cls, defpackage.zpt zptVar) {
        return ((defpackage.afpl) this.a).Z(cls, zptVar, new defpackage.vjq(20), new defpackage.zpq(), true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object ab(defpackage.zki zkiVar, aoln aolnVar) {
        defpackage.zlw zlwVar;
        defpackage.zkf zkfVar;
        defpackage.zki zkiVar2;
        java.lang.String str;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.zlw) {
            zlwVar = (defpackage.zlw) aolnVar;
            int i = zlwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlwVar.b = i - Integer.MIN_VALUE;
            } else {
                zlwVar = new defpackage.zlw(this, aolnVar);
            }
        } else {
            zlwVar = new defpackage.zlw(this, aolnVar);
        }
        java.lang.Object obj2 = zlwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zlwVar.b;
        if (i2 == 0) {
            aooc.af(obj2);
            aooh.f(zkiVar, "<this>");
            if ((zkiVar.b & 1) != 0) {
                zkfVar = zkiVar.c;
                if (zkfVar == null) {
                    zkfVar = defpackage.zkf.a;
                }
            } else {
                zkfVar = null;
            }
            java.lang.String str2 = zkfVar != null ? zkfVar.c : null;
            if (str2 == null) {
                throw new java.lang.IllegalStateException("Synthetic tethered phone call id not available. This id should always be provided.");
            }
            java.lang.Object obj3 = this.a;
            zlwVar.c = zkiVar;
            zlwVar.d = str2;
            apdp apdpVar = (apdp) obj3;
            zlwVar.e = apdpVar;
            zlwVar.b = 1;
            if (apdpVar.b(zlwVar) == aoluVar) {
                return aoluVar;
            }
            zkiVar2 = zkiVar;
            str = str2;
            obj = obj3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = zlwVar.e;
            str = zlwVar.d;
            zkiVar2 = zlwVar.c;
            aooc.af(obj2);
        }
        try {
            ?? r5 = this.b;
            java.lang.Object arrayList = r5.get(str);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                r5.put(str, arrayList);
            }
            ((java.util.List) arrayList).add(zkiVar2);
            return aojh.a;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object ac(java.lang.String str, aoln aolnVar) {
        defpackage.zlx zlxVar;
        java.lang.Object obj;
        aify aifyVarBv;
        if (aolnVar instanceof defpackage.zlx) {
            zlxVar = (defpackage.zlx) aolnVar;
            int i = zlxVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlxVar.b = i - Integer.MIN_VALUE;
            } else {
                zlxVar = new defpackage.zlx(this, aolnVar);
            }
        } else {
            zlxVar = new defpackage.zlx(this, aolnVar);
        }
        java.lang.Object obj2 = zlxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zlxVar.b;
        if (i2 == 0) {
            aooc.af(obj2);
            obj = this.a;
            zlxVar.c = str;
            apdp apdpVar = (apdp) obj;
            zlxVar.d = apdpVar;
            zlxVar.b = 1;
            if (apdpVar.b(zlxVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = zlxVar.d;
            java.lang.String str2 = zlxVar.c;
            aooc.af(obj2);
            obj = apdpVar2;
            str = str2;
        }
        try {
            java.util.List list = (java.util.List) this.b.get(str);
            if (list == null || (aifyVarBv = ahvr.bv(list)) == null) {
                aifyVarBv = aike.a;
                aooh.e(aifyVarBv, "of(...)");
            }
            return aifyVarBv;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object ad(aoln aolnVar) {
        defpackage.zli zliVar;
        if (aolnVar instanceof defpackage.zli) {
            zliVar = (defpackage.zli) aolnVar;
            int i = zliVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zliVar.b = i - Integer.MIN_VALUE;
            } else {
                zliVar = new defpackage.zli(this, aolnVar);
            }
        } else {
            zliVar = new defpackage.zli(this, aolnVar);
        }
        java.lang.Object objD = zliVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zliVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aooh.q((j$.util.Optional) objD);
        }
        aooc.af(objD);
        ajcq ajcqVarX = ((defpackage.afpl) this.a).X();
        zliVar.b = 1;
        objD = aosv.D(ajcqVarX, zliVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBK = ((defpackage.zlh) aooc.ar(objD, defpackage.zlh.class)).bK();
        zliVar.b = 2;
        objD = aosv.D(ajcqVarBK, zliVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d0 -> B:27:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ae(defpackage.zki r8, aoln r9) throws aois {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpl.ae(zki, aoln):java.lang.Object");
    }

    public final aonj b(aonj aonjVar) {
        aooh.f(aonjVar, "onClick");
        return new defpackage.abdu(this, aonjVar, 15, null);
    }

    public final void c(acmf acmfVar) {
        ((defpackage.acmg) this.b).a(acmfVar, (defpackage.acmd) this.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [aonn] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ajzt, java.lang.Object] */
    public final java.lang.Object d(aonn aonnVar, aoln aolnVar) {
        defpackage.afmr afmrVar;
        ?? r12;
        if (aolnVar instanceof defpackage.afmr) {
            afmrVar = (defpackage.afmr) aolnVar;
            int i = afmrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afmrVar.c = i - Integer.MIN_VALUE;
            } else {
                afmrVar = new defpackage.afmr(this, aolnVar);
            }
        } else {
            afmrVar = new defpackage.afmr(this, aolnVar);
        }
        java.lang.Object objK = afmrVar.b;
        aolu aoluVar = aolu.a;
        int i2 = afmrVar.c;
        if (i2 == 0) {
            aooc.af(objK);
            java.lang.Object obj = this.a;
            afmrVar.a = aonnVar;
            afmrVar.c = 1;
            defpackage.ahdv ahdvVar = (defpackage.ahdv) obj;
            aohh aohhVarK = ((aohh) ahdvVar.b.a(((ajyz) ahdvVar.c).a((ajzt) ahdvVar.e))).k(defpackage.ajzu.a, ahdvVar.g);
            java.lang.Object obj2 = ahdvVar.d;
            anma anmaVar = akar.a;
            ahyn ahynVarH = ahyn.h(new aile(obj2));
            aihd aihdVarR = aihd.r("incognito", "pseudonymous");
            ahvr.bN(!aihdVarR.isEmpty(), "Must provide at least one fallback account type");
            ahvr.bN(!aihdVarR.contains("google"), "Cannot fall back for google accounts");
            defpackage.ulw ulwVar = new defpackage.ulw(aihdVarR, ahyn.h(ahdvVar.a), (ahyn) ahwt.a);
            aihb aihbVar = new aihb();
            aihbVar.i(ulwVar);
            defpackage.akaf akafVar = new defpackage.akaf(ahynVarH, aihbVar.h());
            ahyn ahynVar = akafVar.a;
            ahynVar.f();
            ahvr.bZ(!((aihd) ahynVar.b()).isEmpty(), "Cannot get token for empty scope set");
            java.util.HashSet hashSet = new java.util.HashSet();
            ailj ailjVarK = akafVar.b.k();
            while (ailjVarK.hasNext()) {
                ailj ailjVarK2 = ((aihd) ((defpackage.ulw) ailjVarK.next()).c).k();
                while (ailjVarK2.hasNext()) {
                    java.lang.String str = (java.lang.String) ailjVarK2.next();
                    ahvr.cc(hashSet.add(str), "Cannot map account type (%s) to more than one fallback provider", str);
                }
            }
            objK = aohhVarK.k(anmaVar, new defpackage.akag(akafVar)).k(defpackage.ajzy.a, new defpackage.ajzy(((android.accounts.Account) ahdvVar.f).name));
            r12 = aonnVar;
            if (objK != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objK);
            return objK;
        }
        java.lang.Object obj3 = afmrVar.a;
        aooc.af(objK);
        r12 = obj3;
        afmrVar.a = null;
        afmrVar.c = 2;
        java.lang.Object objA = r12.a(objK, afmrVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }

    public final boolean e() {
        for (boolean z : (boolean[]) this.b) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final aigf f() {
        ahvr.bN(this.b == null, "SharedPreferencesView#getAll() not available on key migration");
        return aigf.i(this.a.getAll());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean g(java.lang.String str, boolean z) {
        ah(str);
        return this.a.getBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long h(java.lang.String str) {
        ah(str);
        return this.a.getLong(str, 0L);
    }

    public final defpackage.wyw i(java.lang.String str) {
        java.util.List list = zzd.m;
        android.content.Context context = (android.content.Context) this.b;
        zza zzaVar = new zza(context, "OBAKE");
        ((zyw) zzaVar).e = str;
        ((zyw) zzaVar).f = new defpackage.afmw(0);
        return new defpackage.wyw(context, zzaVar.b(), (defpackage.akoh) this.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ajct, java.lang.Object] */
    public final ajcq j(android.net.Uri uri, afef afefVar) {
        return this.a.eU(new defpackage.wwx(this, uri, afefVar, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final void k() {
        afec.c();
        while (true) {
            ?? r0 = this.a;
            if (r0.isEmpty()) {
                return;
            } else {
                ((java.lang.Runnable) r0.remove()).run();
            }
        }
    }

    public final int l() {
        return ((android.media.AudioRecord) this.b).getAudioFormat();
    }

    public final int m() {
        return ((android.media.AudioRecord) this.b).getRecordingState();
    }

    public final int n() {
        return ((android.media.AudioRecord) this.b).getSampleRate();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    public final void o() {
        ((android.media.AudioRecord) this.b).release();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.adpg) it.next()).c(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void p() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.adpg) it.next()).a(((android.media.AudioRecord) this.b).getFormat());
        }
        ((android.media.AudioRecord) this.b).startRecording();
    }

    public final void q() {
        ((android.media.AudioRecord) this.b).stop();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void s(alaa alaaVar, java.util.List list, albg albgVar, java.util.List list2) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            num.intValue();
            aoin aoinVar = (aoin) this.a.get(num);
            defpackage.acns acnsVar = aoinVar == null ? null : (defpackage.acns) aoinVar.a();
            if (acnsVar != null) {
                apdi apdiVarB = ((akzq) this.b).b(alaaVar.r(), num.intValue());
                if (apdiVarB == null) {
                    aaoo.as(new java.lang.IllegalStateException("Extension with tag #" + num + " not found. Ensure " + java.lang.String.valueOf(alaaVar.getClass()) + "is properly extended."));
                } else {
                    alaaVar.c(apdiVarB);
                    java.lang.Object objJ = alaaVar.n.j((alac) apdiVarB.a);
                    if (objJ == null) {
                        objJ = apdiVarB.b;
                    } else {
                        apdiVarB.c(objJ);
                    }
                    ajcq ajcqVarA = acnsVar.a((albh) objJ);
                    if (defpackage.acns.b.equals(ajcqVarA)) {
                        continue;
                    } else if (albgVar != null) {
                        try {
                            ((defpackage.acnr) aiql.H(ajcqVarA)).a(albgVar);
                        } catch (java.util.concurrent.ExecutionException e) {
                            throw new java.lang.RuntimeException(e);
                        }
                    } else {
                        list2.add(ajcqVarA);
                    }
                }
            }
        }
    }

    public final android.text.SpannableString t(java.lang.String str) {
        adub adtwVar;
        aooh.f(str, "bodyText");
        final defpackage.aprf aprfVar = new defpackage.aprf(this);
        try {
            android.text.Spanned spannedF = yv.f(str);
            aooh.e(spannedF, "fromHtml(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(spannedF);
            android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannableString.getSpans(0, spannedF.length(), android.text.style.URLSpan.class);
            aooh.c(uRLSpanArr);
            for (android.text.style.URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                final java.lang.String url = uRLSpan.getURL();
                aooh.e(url, "getURL(...)");
                spannableString.setSpan(new android.text.style.URLSpan(url, aprfVar) { // from class: com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.base.PromoTextHelperImpl$CustomUrlSpan
                    private final defpackage.aprf a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(url);
                        aooh.f(url, "url");
                        this.a = aprfVar;
                    }

                    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                    public final void onClick(android.view.View view) {
                        aooh.f(view, "widget");
                        android.content.Context context = view.getContext();
                        aooh.e(context, "getContext(...)");
                        java.lang.String url2 = getURL();
                        aooh.e(url2, "getURL(...)");
                        java.lang.Object obj = this.a.a;
                        aooh.f(context, "context");
                        aooh.f(url2, "url");
                        vx vxVarA = new sw().a();
                        android.net.Uri uri = android.net.Uri.parse(url2);
                        aooh.e(uri, "parse(...)");
                        vxVarA.c(context, uri);
                        ((afip) ((aeey) ((defpackage.afpl) obj).b).p.eZ()).b(1L, new java.lang.Object[]{context.getPackageName()});
                    }
                }, spanStart, spanEnd, 33);
            }
            adtwVar = new adub(spannableString);
        } catch (java.lang.Exception e) {
            hgb.b(((aimp) this.a).c(), "Failed to create SpannableString from HTML.", e);
            adtwVar = new defpackage.adtw(e, adty.v);
        }
        if (adtwVar.i()) {
            return (android.text.SpannableString) adtwVar.d();
        }
        ((aimp) this.a).d().y("Failed to parse HTML body text: %s", str);
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoss, java.lang.Object] */
    public final void u(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar) {
        aooh.f(promoContext, "promoContext");
        aosv.F((aoss) this.a, 0, new defpackage.xhb(this, promoContext, acirVar, (aoln) null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aoss, java.lang.Object] */
    public final void v(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        aooh.f(promoContext, "promoContext");
        aosv.F((aoss) this.a, 0, new kgx(this, promoContext, i, (aoln) null, 10), 3);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aoss, java.lang.Object] */
    public final ajcq w(akjh akjhVar) {
        aooh.f(akjhVar, "generalPromptUi");
        return aosv.F((aoss) this.a, 0, new defpackage.abvg(this, akjhVar, (aoln) null, 18), 3);
    }

    public final void x() {
        aozj aozjVar = (aozj) this.a;
        if (((java.lang.Boolean) aozjVar.c()).booleanValue()) {
            ((java.util.concurrent.atomic.AtomicBoolean) this.b).set(false);
        }
        aozjVar.e(java.lang.Boolean.FALSE);
    }

    public final void y(int i, android.view.View view) {
        aooh.f(view, "view");
        ((aicz) this.a).t(java.lang.Integer.valueOf(i), view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String z(java.lang.String str) {
        ?? r0 = this.b;
        if (r0.containsKey(str)) {
            return (java.lang.String) r0.get(str);
        }
        android.database.Cursor cursorQuery = ((android.content.Context) this.a).getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.buildUpon().appendPath(str).build(), new java.lang.String[]{"lookup"}, null, null, null);
        java.lang.String str2 = null;
        if (cursorQuery != null) {
            try {
                java.lang.String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                ajsz.ak(cursorQuery, (java.lang.Throwable) null);
                str2 = string;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(cursorQuery, th);
                    throw th2;
                }
            }
        }
        ?? r6 = this.b;
        if (str2 != null) {
            r6.put(str, str2);
        } else {
            r6.remove(str);
        }
        return str2;
    }

    public afpl(acab acabVar, aoss aossVar) {
        aooh.f(aossVar, "futureScope");
        this.b = acabVar;
        this.a = aossVar;
    }

    public afpl(defpackage.acdn acdnVar, aoss aossVar) {
        aooh.f(aossVar, "futureScope");
        this.b = acdnVar;
        this.a = aossVar;
    }

    public afpl(achv achvVar, aoss aossVar) {
        aooh.f(achvVar, "delegate");
        aooh.f(aossVar, "futureScope");
        this.b = achvVar;
        this.a = aossVar;
    }

    public afpl(defpackage.acim acimVar, aoss aossVar) {
        aooh.f(acimVar, "delegate");
        aooh.f(aossVar, "futureScope");
        this.b = acimVar;
        this.a = aossVar;
    }

    public afpl(defpackage.acip acipVar, aoss aossVar) {
        aooh.f(acipVar, "delegate");
        aooh.f(aossVar, "futureScope");
        this.b = acipVar;
        this.a = aossVar;
    }

    public afpl(acit acitVar, aoss aossVar) {
        aooh.f(acitVar, "delegate");
        aooh.f(aossVar, "futureScope");
        this.b = acitVar;
        this.a = aossVar;
    }

    public afpl(defpackage.acmd acmdVar, defpackage.acmg acmgVar) {
        aooh.f(acmgVar, "interactionLogger");
        this.a = acmdVar;
        this.b = acmgVar;
    }

    public afpl(defpackage.afpl afplVar, aoss aossVar) {
        aooh.f(afplVar, "delegate");
        aooh.f(aossVar, "futureScope");
        this.b = afplVar;
        this.a = aossVar;
    }

    public afpl(defpackage.agja agjaVar, java.util.Map map) {
        aooh.f(map, "activeStateMap");
        this.a = agjaVar;
        this.b = map;
    }

    public afpl(defpackage.ahdv ahdvVar, aolr aolrVar) {
        aooh.f(aolrVar, "blockingContext");
        this.a = ahdvVar;
        this.b = aolrVar;
    }

    public afpl(amwu amwuVar, acal acalVar) {
        aooh.f(amwuVar, "targetingClausePredicate");
        aooh.f(acalVar, "clearcutLogger");
        this.a = amwuVar;
        this.b = acalVar;
    }

    public afpl(android.app.Activity activity) {
        this.b = activity;
        this.a = new defpackage.wtx(activity, 5);
    }

    public afpl(android.content.Context context) {
        aooh.f(context, "context");
        this.a = context;
        this.b = "oauth2:https://www.googleapis.com/auth/photos.image.readonly";
    }

    public afpl(android.content.Context context, defpackage.akoh akohVar) {
        aooh.f(context, "context");
        this.b = context;
        this.a = akohVar;
    }

    public afpl(aoss aossVar, zdi zdiVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = aossVar;
        this.b = zdiVar;
    }

    public afpl(hiv hivVar, ajct ajctVar) {
        this.a = hivVar;
        this.b = ajctVar;
    }

    public afpl(j$.util.Optional optional, java.util.Map map) {
        aooh.f(optional, "optionalClientRoleConfigOverride");
        this.b = optional;
        this.a = map;
    }

    public afpl(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public afpl(java.lang.Object obj, java.lang.Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public afpl(java.util.Map map, aolr aolrVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.b = map;
        this.a = aolrVar;
    }

    public afpl(java.util.Map map, java.util.Map map2) {
        this.b = map;
        this.a = map2;
    }

    public afpl(defpackage.vaa vaaVar) {
        this.b = vaaVar;
        this.a = new defpackage.acmm(vaaVar);
    }

    public afpl(defpackage.vqf vqfVar, defpackage.abxz abxzVar) {
        aooh.f(vqfVar, "viewBinder");
        this.a = vqfVar;
        this.b = abxzVar;
    }

    public afpl(zzx zzxVar, defpackage.afpl afplVar) {
        aooh.f(afplVar, "inCallProductionBuilder");
        this.b = zzxVar;
        this.a = afplVar;
    }

    public afpl(char[] cArr, byte[] bArr) {
        aokd aokdVar = aokd.a;
        this.a = aokdVar;
        this.b = aokdVar;
    }

    public afpl() {
        this.a = new android.graphics.Rect();
        this.b = new android.graphics.Rect();
    }

    public afpl(aeey aeeyVar) {
        aooh.f(aeeyVar, "clientStreamz");
        this.b = aeeyVar;
        this.a = aiof.i("GnpSdk");
    }

    public afpl(android.content.Context context, byte[] bArr) {
        aooh.f(context, "context");
        this.b = aooc.ah(3, new defpackage.abmn(context, 5));
        this.a = new aidf((byte[]) null);
    }

    public afpl(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ahbz ahbzVarBG = afsq.bG(context);
        aazc aazcVar = aang.a;
        java.util.concurrent.ExecutorService executorServiceW = aazc.w(4);
        java.util.regex.Pattern pattern = afej.a;
        afei afeiVar = new afei(context);
        afeiVar.e("app_doctor");
        afeiVar.f("AppDoctor.pb");
        android.net.Uri uriA = afeiVar.a();
        afgo afgoVarA = afgp.a();
        afgoVarA.e(uriA);
        afgoVarA.d(defpackage.abdm.a);
        this.a = ahbzVarBG.k(afgoVarA.a());
        this.b = executorServiceW;
    }

    public afpl(android.os.IBinder iBinder) throws android.os.RemoteException {
        java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (j$.util.Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new android.os.Messenger(iBinder);
            this.a = null;
        } else if (j$.util.Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.a = new com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat(iBinder);
            this.b = null;
        } else {
            android.util.Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(java.lang.String.valueOf(interfaceDescriptor)));
            throw new android.os.RemoteException();
        }
    }

    public afpl(aoin aoinVar, aoin aoinVar2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public afpl(java.util.Map map) {
        this.b = akzq.a();
        this.a = map;
    }

    public afpl(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new apdp();
        this.b = new zlv();
    }

    public afpl(char[] cArr) {
        this.a = aozk.a(java.lang.Boolean.FALSE);
        this.b = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public afpl(short[] sArr) {
        this.a = new java.util.LinkedHashSet();
        this.b = new java.util.LinkedHashSet();
    }

    public afpl(android.media.AudioRecord audioRecord, java.util.Set set) {
        android.util.ArraySet arraySet = new android.util.ArraySet();
        this.a = arraySet;
        this.b = audioRecord;
        arraySet.addAll(set);
    }

    public afpl(android.content.Context context, byte[] bArr, byte[] bArr2) {
        aooh.f(context, "context");
        this.a = context;
        this.b = new java.util.LinkedHashMap();
    }

    public afpl(defpackage.aehv aehvVar) {
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
        this.b = aehvVar;
    }

    public afpl(java.lang.Object obj) {
        this(obj, new nut(obj, (aoln) null, 9), (char[]) null);
    }

    public afpl(com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout expressSignInLayout) {
        this.a = new java.util.ArrayDeque();
        this.b = expressSignInLayout;
    }

    public afpl(java.lang.Object obj, java.lang.Object obj2) {
        this(obj, new lnb(obj2, obj, (aoln) null, 14), (char[]) null);
    }

    public afpl(byte[] bArr) {
        this.b = new aigb(4);
        this.a = new aigb(4);
    }

    public afpl(ajct ajctVar, java.util.List list) {
        aogc aogcVar = new aogc(list, java.util.Collections.EMPTY_LIST, java.util.Collections.EMPTY_LIST);
        this.a = ajctVar;
        this.b = aogcVar;
    }

    public afpl(android.content.Context context, char[] cArr) {
        this.a = new java.util.ArrayList();
        this.b = context;
    }

    public afpl(java.lang.Object obj, aonn aonnVar, byte[] bArr) {
        this(obj, new pzf(aonnVar, obj, (aoln) null, 8), (char[]) null);
    }

    public afpl(defpackage.acaa acaaVar, aoss aossVar) {
        aooh.f(aossVar, "futureScope");
        this.b = acaaVar;
        this.a = aossVar;
    }

    public afpl(defpackage.ajxi ajxiVar) {
        this.a = new java.util.ArrayList();
        this.b = ajxiVar;
    }

    public afpl(java.util.List list, aonj aonjVar) {
        aooh.f(list, "items");
        aooh.f(aonjVar, "key");
        this.a = aonjVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new defpackage.abef(it.next(), new akc(java.lang.Boolean.TRUE)));
        }
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(arrayList, cdu.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public afpl(java.lang.String str, java.util.List list) {
        this.b = new java.util.ArrayList();
        this.a = str;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.afer aferVar = (defpackage.afer) it.next();
                int i = 0;
                while (true) {
                    int size = this.b.size();
                    ?? r2 = this.b;
                    if (i < size) {
                        if (((defpackage.afer) r2.get(i)).a.equals(aferVar.a)) {
                            this.b.set(i, aferVar);
                            break;
                        }
                        i++;
                    } else {
                        r2.add(aferVar);
                        break;
                    }
                }
            }
        }
    }

    public afpl(byte[] bArr, byte[] bArr2) {
        this.a = new java.lang.StringBuilder();
        this.b = new java.util.ArrayList();
    }
}
