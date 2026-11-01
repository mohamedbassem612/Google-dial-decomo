package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tvn {
    public final java.lang.Object a;

    public tvn(android.content.Context context, defpackage.aepr aeprVar) {
        this.a = aeprVar;
        android.app.Application application = (android.app.Application) context;
        application.registerActivityLifecycleCallbacks(aeprVar.a);
        application.registerComponentCallbacks(aeprVar.a);
        if (android.os.Build.VERSION.SDK_INT < 37 || aeprVar.b != null) {
            return;
        }
        aeprVar.b = new aepp();
        deh$.ExternalSyntheticApiModelOutline0.m(aeprVar.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vmh */
    public static java.lang.String n(boolean z) throws vmh {
        try {
            return new org.json.JSONObject().put("vvmserviceProfile", new org.json.JSONObject().put("attributes", new org.json.JSONObject().put("attribute", new org.json.JSONArray().put(new org.json.JSONObject().put("name", "VVMOn").put("value", new org.json.JSONArray().put(z ? "true" : "false")))))).toString();
        } catch (org.json.JSONException e) {
            throw new vmh(e);
        }
    }

    public final void A(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        j$.util.Objects.requireNonNull(str);
        aegwVar.k = str;
    }

    public final void B(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        j$.util.Objects.requireNonNull(str);
        aegwVar.j = str;
    }

    public final void C(boolean z) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        aegwVar.e = z;
    }

    public final void D(java.lang.String str) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        j$.util.Objects.requireNonNull(str);
        aegwVar.h = str;
    }

    public final void E(defpackage.aegv aegvVar) {
        defpackage.aooh.f(aegvVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        aegwVar.f = aegvVar.a();
    }

    public final void F(java.lang.String str) {
        defpackage.aooh.f(str, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        j$.util.Objects.requireNonNull(str);
        aegwVar.c = str;
    }

    public final void G(java.lang.String str) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        j$.util.Objects.requireNonNull(str);
        aegwVar.g = str;
    }

    public final void H(int i) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        aegwVar.b = i;
    }

    public final void I(long j) {
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        aegwVar.d = j;
    }

    public final void J(defpackage.aegu aeguVar) {
        defpackage.aooh.f(aeguVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.aegw aegwVar = (defpackage.aegw) akzxVar.b;
        defpackage.aegw aegwVar2 = defpackage.aegw.a;
        aegwVar.i = aeguVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object K(defpackage.aoln aolnVar) throws java.lang.Exception {
        defpackage.aeft aeftVar;
        if (aolnVar instanceof defpackage.aeft) {
            aeftVar = (defpackage.aeft) aolnVar;
            int i = aeftVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeftVar.b = i - Integer.MIN_VALUE;
            } else {
                aeftVar = new defpackage.aeft(this, aolnVar);
            }
        } else {
            aeftVar = new defpackage.aeft(this, aolnVar);
        }
        java.lang.Object objY = aeftVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeftVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objY);
            defpackage.aaum aaumVarE = ((defpackage.abce) this.a).e();
            aeftVar.b = 1;
            objY = defpackage.aooh.Y(aaumVarE, aeftVar);
            if (objY == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objY);
        }
        defpackage.aooh.e(objY, "await(...)");
        return objY;
    }

    public final defpackage.zzd L(java.lang.String str, java.lang.String str2) {
        java.util.List list = defpackage.zzd.m;
        defpackage.zza zzaVar = new defpackage.zza((android.content.Context) this.a, str);
        zzaVar.e = str2;
        zzaVar.f = new akxl(1, (byte[]) null);
        return zzaVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [adiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [adiz, java.lang.Object] */
    public final defpackage.adjg M(java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursor = null;
        defpackage.adjg adjgVarF = null;
        try {
            try {
                android.database.Cursor cursorQuery = this.a.getReadableDatabase().query("pending_downloads", defpackage.adjg.a, "download_id=?", new java.lang.String[]{str}, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        adjgVarF = cursorQuery.moveToNext() ? defpackage.adjg.f(cursorQuery) : null;
                        cursorQuery.close();
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        ?? r11 = this.a;
                        java.io.IOException iOException = new java.io.IOException(defpackage.a.bx(str, "SqlitePendingDownloadQueue#get, SQL query failed, download: "), e);
                        r11.a(iOException);
                        throw iOException;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                return adjgVarF;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [adiz, java.lang.Object] */
    public final void N(java.lang.String str) throws java.io.IOException {
        try {
            this.a.getWritableDatabase().delete("pending_downloads", "download_id=?", new java.lang.String[]{str});
        } catch (android.database.sqlite.SQLiteException e) {
            ?? r4 = this.a;
            java.io.IOException iOException = new java.io.IOException("SqlitePendingDownloadQueue#remove, SQL delete failed, download: ".concat(java.lang.String.valueOf(str)), e);
            r4.a(iOException);
            throw iOException;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [adiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [adiz, java.lang.Object] */
    public final void O(defpackage.adjg adjgVar) throws java.io.IOException {
        try {
            ?? r0 = this.a;
            int iUpdate = r0.getWritableDatabase().update("pending_downloads", adjgVar.c(), "download_id=?", new java.lang.String[]{adjgVar.i()});
            if (iUpdate == 1) {
                return;
            }
            java.io.IOException iOException = new java.io.IOException(java.lang.String.format(java.util.Locale.US, "SqlitePendingDownloadQueue#update, SQL update failed, download: %s, updated %d.", adjgVar.i(), java.lang.Integer.valueOf(iUpdate)));
            r0.a(iOException);
            throw iOException;
        } catch (android.database.sqlite.SQLiteException e) {
            ?? r9 = this.a;
            java.io.IOException iOException2 = new java.io.IOException("SqlitePendingDownloadQueue#update, SQL update failed, download: ".concat(adjgVar.i()), e);
            r9.a(iOException2);
            throw iOException2;
        }
    }

    public final void P(defpackage.adfq adfqVar) {
        java.lang.Object obj = this.a;
        synchronized (obj) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) obj).iterator();
            while (it.hasNext()) {
                new defpackage.abqu(adfqVar, it.next(), 3).run();
            }
        }
    }

    public final boolean Q() {
        return ((java.util.concurrent.CopyOnWriteArrayList) this.a).isEmpty();
    }

    public final void R(java.lang.Object obj) {
        ((java.util.concurrent.CopyOnWriteArrayList) this.a).add(obj);
    }

    public final synchronized int S(java.lang.Object obj) {
        defpackage.aibt aibtVar = ((defpackage.aiaw) this.a).a;
        int iA = aibtVar.a(obj);
        java.lang.Integer num = (java.lang.Integer) aibtVar.b(iA).f(obj, iA);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final synchronized void T(java.lang.Object obj) {
        ((defpackage.aiaw) this.a).a.remove(obj);
    }

    public final synchronized boolean U(java.lang.Object obj, defpackage.adqg adqgVar) {
        boolean z;
        int iS = S(obj);
        z = iS == -1;
        if (z) {
            ((defpackage.admw) adqgVar.b).a((defpackage.adib) adqgVar.a, 0);
        }
        ((defpackage.aiaw) this.a).a.put(obj, java.lang.Integer.valueOf(z ? 0 : iS + 1));
        return z;
    }

    public final void V(java.lang.Throwable th) {
        ((defpackage.tvn) this.a).P(new adfv(th, 0));
    }

    public final void W(defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, defpackage.adme admeVar) {
        ((defpackage.tvn) this.a).P(new adfw(adhwVar, versionedName, str, admeVar, 0));
    }

    public final void X(defpackage.adhw adhwVar, int i) {
        ((defpackage.tvn) this.a).P(new adjy(adhwVar, i, 1));
    }

    public final void Y(com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, java.lang.Throwable th) {
        ((defpackage.tvn) this.a).P(new adgv(versionedName, str, th, 1));
    }

    public final void Z(defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, boolean z) {
        ((defpackage.tvn) this.a).P(new adfu(adhwVar, versionedName, str, z));
    }

    public final boolean a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return ((android.telecom.PhoneAccountHandle) this.a).equals(phoneAccountHandle);
    }

    public final void aa(java.lang.String str, java.lang.Throwable th) {
        ((defpackage.tvn) this.a).P(new adjw(str, th, 1));
    }

    public final void ab(defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, java.lang.Throwable th) {
        ((defpackage.tvn) this.a).P(new adfw(adhwVar, versionedName, str, th, 2));
    }

    public final void ac(defpackage.adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, java.lang.Throwable th) {
        ((defpackage.tvn) this.a).P(new adfw(adhwVar, versionedName, str, th, 1));
    }

    public final defpackage.ajcq ad() {
        return ((defpackage.afhf) this.a).c();
    }

    public final defpackage.ajcq ae(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        return ((defpackage.ahda) this.a).g(callable, executor);
    }

    public final defpackage.ajcq af(defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        return ((defpackage.ahda) this.a).h(ajasVar, executor);
    }

    public final void ag(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (defpackage.adbe.a(100L)) {
            defpackage.akzx akzxVarM = aiwo.a.m();
            akzxVarM.u();
            aiwo aiwoVar = akzxVarM.b;
            aiwoVar.b |= 524288;
            aiwoVar.f = 100L;
            defpackage.akzx akzxVarM2 = aiww.a.m();
            akzxVarM2.u();
            aiww aiwwVar = akzxVarM2.b;
            aiwwVar.c = airh.i(i);
            aiwwVar.b |= 1;
            akzxVarM2.u();
            aiww aiwwVar2 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            aiwwVar2.b |= 2;
            aiwwVar2.d = str;
            akzxVarM2.u();
            aiww aiwwVar3 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str2);
            aiwwVar3.b |= 4;
            aiwwVar3.e = str2;
            akzxVarM2.u();
            aiww aiwwVar4 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str3);
            aiwwVar4.b |= 8;
            aiwwVar4.f = str3;
            akzxVarM.u();
            aiwo aiwoVar2 = akzxVarM.b;
            aiww aiwwVarR = akzxVarM2.r();
            j$.util.Objects.requireNonNull(aiwwVarR);
            aiwoVar2.q = aiwwVarR;
            aiwoVar2.d |= 2;
            ((defpackage.adae) this.a).a((aiwo) akzxVarM.r(), 1072);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ucw] */
    public final void b(java.lang.String str, ucu ucuVar) {
        defpackage.lpb.a();
        this.a.c(str, ucuVar);
    }

    public final boolean c() {
        return ((defpackage.tkk) this.a).a();
    }

    public final /* synthetic */ defpackage.tru d() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.tru) aladVarR;
    }

    public final void e(trt trtVar) {
        defpackage.aooh.f(trtVar, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) this.a;
        akzxVar.u();
        defpackage.tru truVar = (defpackage.tru) akzxVar.b;
        defpackage.tru truVar2 = defpackage.tru.a;
        truVar.c = trtVar.a();
    }

    public final defpackage.ajcq f(android.telecom.Call.Details details) {
        defpackage.aooh.f(details, "callDetails");
        java.lang.Object obj = this.a;
        long jM = aa$.ExternalSyntheticApiModelOutline0.m(details);
        defpackage.swc swcVar = (defpackage.swc) obj;
        ajml ajmlVarK = swcVar.b.k(jM);
        if (ajmlVarK != null) {
            defpackage.ajcq ajcqVarB = ((defpackage.swa) ajmlVarK.b).b(ajmlVarK.a, details);
            if (ajcqVarB != null) {
                return ajcqVarB;
            }
        }
        return swcVar.a.b(jM, details);
    }

    public final java.lang.Object g(android.telecom.Call.Details details, defpackage.aoln aolnVar) {
        return ((defpackage.swc) this.a).c(aa$.ExternalSyntheticApiModelOutline0.m(details), details, aolnVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final ufi h(uim uimVar, defpackage.udm udmVar, defpackage.udm udmVar2, java.lang.String str) {
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(((defpackage.alfc) this.a.a()).b);
        j$.util.Objects.requireNonNull(str);
        if (stream.anyMatch(new ree(str, 7))) {
            long j = udmVar.c;
            defpackage.udm udmVar3 = udn.a;
            uzx uzxVarCc = defpackage.wsc.cc(defpackage.udm.a.m());
            uzxVarCc.n(j);
            uzxVarCc.l(defpackage.udj.SPAM_STATUS_NOT_SPAM);
            udmVar = uzxVarCc.k();
        }
        return ufi.c(uimVar, udmVar, udmVar2);
    }

    public final ufi i(ufu ufuVar, java.lang.String str) {
        uim uimVar;
        int iAS = defpackage.a.aS(ufuVar.c);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (i == 0) {
            uimVar = uim.a;
        } else if (i == 1) {
            uimVar = uim.b;
        } else if (i != 2) {
            uimVar = i != 3 ? uim.e : uim.d;
        } else {
            uimVar = uim.c;
        }
        defpackage.udm udmVar = defpackage.udm.a;
        defpackage.akzx akzxVarM = udmVar.m();
        defpackage.udj udjVarB = defpackage.udj.b(ufuVar.e);
        if (udjVarB == null) {
            udjVarB = defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        akzxVarM.u();
        defpackage.udm udmVar2 = (defpackage.udm) akzxVarM.b;
        udmVar2.d = udjVarB.f;
        udmVar2.b |= 2;
        defpackage.udm udmVar3 = (defpackage.udm) akzxVarM.r();
        defpackage.akzx akzxVarM2 = udmVar.m();
        defpackage.udj udjVarB2 = defpackage.udj.b(ufuVar.d);
        if (udjVarB2 == null) {
            udjVarB2 = defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        akzxVarM2.u();
        defpackage.udm udmVar4 = (defpackage.udm) akzxVarM2.b;
        udmVar4.d = udjVarB2.f;
        udmVar4.b |= 2;
        int iAQ = defpackage.a.aQ(ufuVar.f);
        if (iAQ == 0) {
            iAQ = 1;
        }
        akzxVarM2.u();
        defpackage.udm udmVar5 = (defpackage.udm) akzxVarM2.b;
        udmVar5.i = iAQ - 1;
        udmVar5.b |= 128;
        int iAQ2 = defpackage.a.aQ(ufuVar.g);
        int i2 = iAQ2 != 0 ? iAQ2 : 1;
        akzxVarM2.u();
        defpackage.udm udmVar6 = (defpackage.udm) akzxVarM2.b;
        udmVar6.j = i2 - 1;
        udmVar6.b |= 256;
        return h(uimVar, udmVar3, (defpackage.udm) akzxVarM2.r(), str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ucw] */
    public final taq j(java.lang.String str) {
        return this.a.d(str);
    }

    public final ajml k(long j) {
        defpackage.aihd aihdVarA = ((defpackage.zpm) this.a).a();
        defpackage.aooh.e(aihdVarA, "getAllCallScopes(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aihdVarA, 10));
        java.util.Iterator<E> it = aihdVarA.iterator();
        while (it.hasNext()) {
            arrayList.add((uih) ((apqr) it.next()).a(uih.class));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((uih) obj).b() == j) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((uih) it2.next()).kI());
        }
        return (ajml) defpackage.ajsz.bO(arrayList3);
    }

    public final zur l() {
        return ((defpackage.aogc) this.a).am("dialer_wear");
    }

    public final void m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.mni.cx(new rqy(this, phoneAccountHandle, 17));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoin, java.lang.Object] */
    public final java.lang.String o() {
        java.lang.String str = (java.lang.String) this.a.a();
        return android.text.TextUtils.isEmpty(str) ? "wsg.t-mobile.com" : str;
    }

    public final java.lang.String p(java.lang.String str) {
        return java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects/operations/search", o(), str);
    }

    public final java.lang.String q(java.lang.String str) {
        return java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/vvmserviceProfile", o(), str);
    }

    public final void r(android.app.Activity activity, int i) {
        activity.setTheme(i);
        j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
        if (true == optionalG.isPresent()) {
            optionalG = ((defpackage.urm) optionalG.get()).a();
            optionalG.getClass();
        }
        j$.util.Objects.requireNonNull(activity);
        defpackage.jyv jyvVar = new defpackage.jyv(activity, 15);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            ((android.app.Activity) jyvVar.a).setTheme(((java.lang.Integer) obj).intValue());
        }
    }

    public final /* synthetic */ defpackage.unv s() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.unv) aladVarR;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object t(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.a.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object u(defpackage.unv unvVar, defpackage.aoln aolnVar) {
        defpackage.unw unwVar;
        if (aolnVar instanceof defpackage.unw) {
            unwVar = (defpackage.unw) aolnVar;
            int i = unwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                unwVar.b = i - Integer.MIN_VALUE;
            } else {
                unwVar = new defpackage.unw(this, aolnVar);
            }
        } else {
            unwVar = new defpackage.unw(this, aolnVar);
        }
        java.lang.Object obj = unwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = unwVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r5 = this.a;
            defpackage.uer uerVar = new defpackage.uer(unvVar, (defpackage.aoln) null, 2);
            unwVar.b = 1;
            if (r5.a(uerVar, unwVar) == aoluVar) {
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

    public final /* synthetic */ defpackage.unq v() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.unq) aladVarR;
    }

    public final void w(defpackage.aepo aepoVar) {
        aepoVar.getClass();
        defpackage.aepq aepqVar = ((defpackage.aepr) this.a).a;
        int i = defpackage.aepq.c;
        aepqVar.a.add(aepoVar);
    }

    public final void x(defpackage.aepo aepoVar) {
        defpackage.aepq aepqVar = ((defpackage.aepr) this.a).a;
        int i = defpackage.aepq.c;
        aepqVar.a.remove(aepoVar);
    }

    public final defpackage.ajcq y(aemo aemoVar, java.lang.String str, int i) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(aemoVar.a(((defpackage.adak) this.a).f(new android.accounts.Account(str, "com.google")), new adfb(), defpackage.aesg.f(i)));
        adfe adfeVar = new adfe(16);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ahrv ahrvVarH = ahrvVarG.e(adfc.class, adfeVar, ajbmVar).f(defpackage.aacw.class, new acwn(19), ajbmVar).f(java.io.IOException.class, new acwn(20), ajbmVar).h(new adfe(17), ajbmVar);
        defpackage.ahvr.J(ahrvVarH, new jya(this, 17), ajbmVar);
        return ahrvVarH;
    }

    public final /* synthetic */ defpackage.aegw z() {
        defpackage.alad aladVarR = ((defpackage.akzx) this.a).r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.aegw) aladVarR;
    }

    public tvn(defpackage.aoin aoinVar, byte[] bArr, byte[] bArr2) {
        defpackage.aooh.f(aoinVar, "phenotypeServerTokens");
        this.a = aoinVar;
    }

    public tvn(java.lang.Object obj) {
        this.a = obj;
    }

    public tvn(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public tvn(long j, final defpackage.adfq adfqVar) {
        defpackage.aiaa aiaaVar = new defpackage.aiaa();
        aiaaVar.d(1);
        aiaaVar.e(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        aiaaVar.f(4L);
        aiaaVar.g(new defpackage.aibv() { // from class: adhg
            @Override // defpackage.aibv
            public final void a(defpackage.aibw aibwVar) {
                int i = aibwVar.a;
                if (i == 4 || i == 1 || i == 3) {
                    adfqVar.a(aibwVar.getKey());
                }
            }
        });
        this.a = aiaaVar.a();
    }

    public tvn(defpackage.adak adakVar) {
        defpackage.ahvr.ci(adakVar);
        this.a = adakVar;
    }

    public tvn(android.content.Context context) {
        this.a = new android.telecom.PhoneAccountHandle(new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.tvn.class), "ACCOUNT_ID");
    }

    public tvn() {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public tvn(android.content.Context context, char[] cArr) {
        defpackage.aooh.f(context, "context");
        this.a = context;
    }

    public tvn(defpackage.zpm zpmVar) {
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        this.a = zpmVar;
    }

    public tvn(defpackage.swc swcVar) {
        if (swcVar == null) {
            defpackage.aooh.i("spamStatusCachePrefetchedCallIntegration");
        }
        this.a = swcVar;
    }

    public tvn(defpackage.ecx ecxVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        this.a = ecxVar;
    }

    public tvn(byte[] bArr) {
        this.a = j$.util.DesugarCollections.synchronizedSet(new defpackage.acc(0));
    }

    public tvn(byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.ahda();
    }

    public tvn(char[] cArr) {
        this.a = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public tvn(android.content.Context context, byte[] bArr, byte[] bArr2) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.a = context;
    }
}
