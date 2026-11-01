package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqf {
    public final java.lang.Object a;

    public vqf(acgr acgrVar, aazc aazcVar) {
        aooh.f(acgrVar, "cappedPromotionStore");
        aooh.f(aazcVar, "clock");
        this.a = acgrVar;
    }

    public final void A(defpackage.abwd abwdVar) {
        aooh.f(abwdVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utu utuVar = (defpackage.utu) akzxVar.b;
        defpackage.utu utuVar2 = defpackage.utu.a;
        j$.util.Objects.requireNonNull(abwdVar);
        utuVar.d = abwdVar;
        utuVar.b |= 2;
    }

    public final void B(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utu utuVar = (defpackage.utu) akzxVar.b;
        defpackage.utu utuVar2 = defpackage.utu.a;
        j$.util.Objects.requireNonNull(str);
        utuVar.b |= 4;
        utuVar.e = str;
    }

    public final void C(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utu utuVar = (defpackage.utu) akzxVar.b;
        defpackage.utu utuVar2 = defpackage.utu.a;
        utuVar.f = i - 1;
        utuVar.b |= 8;
    }

    public final java.lang.String D(defpackage.aefu aefuVar) {
        java.lang.String string;
        java.lang.String string2 = aefuVar.a;
        if (aoov.ad(string2, "//")) {
            string2 = "https:".concat(java.lang.String.valueOf(string2));
        }
        defpackage.angf angfVar = defpackage.angf.a;
        if (angfVar.eZ().b() && aoov.ad(string2, "http://") && defpackage.afbo.a(string2)) {
            aooh.f(string2, "<this>");
            int iW = aoov.w(string2, "http://", 0, false);
            if (iW >= 0) {
                int i = iW + 7;
                aooh.f(string2, "<this>");
                if (i < iW) {
                    throw new java.lang.IndexOutOfBoundsException(a.bA(iW, i, "End index (", ") is less than start index (", ")."));
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.CharSequence) string2, 0, iW);
                sb.append((java.lang.CharSequence) "https://");
                sb.append((java.lang.CharSequence) string2, i, string2.length());
                string2 = sb.toString();
            }
        }
        boolean z = true;
        if (angfVar.eZ().a()) {
            boolean zAd = aoov.ad(string2, "https://www.gstatic.com/gnp_");
            android.net.Uri uri = android.net.Uri.parse(string2);
            aooh.e(uri, "parse(...)");
            if (defpackage.akvx.e(uri)) {
                z = zAd;
            } else if (!zAd) {
                return string2;
            }
            defpackage.akwa akwaVar = new defpackage.akwa();
            int i2 = aefuVar.b;
            if (i2 > 0) {
                akwaVar.b(i2);
            }
            int i3 = aefuVar.c;
            if (i3 > 0) {
                akwaVar.a(i3);
            }
            if (z) {
                try {
                    android.net.Uri uri2 = android.net.Uri.parse(string2);
                    aooh.e(uri2, "parse(...)");
                    string = defpackage.akvx.c(akwaVar, uri2).toString();
                    aooh.c(string);
                } catch (defpackage.abzs e) {
                    hgb.b(((aimp) this.a).d(), "SCS options could not be added. Using raw url.", e);
                    return string2;
                }
            } else {
                try {
                    android.net.Uri uri3 = android.net.Uri.parse(string2);
                    aooh.e(uri3, "parse(...)");
                    try {
                        string = ((android.net.Uri) defpackage.akvx.f(akwaVar, new defpackage.abzr(uri3), false)).toString();
                        aooh.c(string);
                    } catch (defpackage.akvv e2) {
                        throw new defpackage.abzs(e2);
                    }
                } catch (defpackage.abzs e3) {
                    hgb.b(((aimp) this.a).d(), "FIFE options could not be applied. Using raw url.", e3);
                    return string2;
                }
            }
        } else {
            boolean zAd2 = aoov.ad(string2, "https://www.gstatic.com/gnp_");
            if (defpackage.afbo.a(string2)) {
                z = zAd2;
            } else if (!zAd2) {
                return string2;
            }
            int i4 = aefuVar.b;
            if (i4 == -1) {
                i4 = -1;
            }
            int i5 = aefuVar.c;
            int i6 = i5 != -1 ? i5 : -1;
            if (!z) {
                java.lang.String strB = defpackage.afbo.b(string2, 0, i4, i6);
                if (strB != null) {
                    string2 = strB;
                }
                aooh.e(string2, "modifyOptions(...)");
                return string2;
            }
            defpackage.akwa akwaVar2 = new defpackage.akwa();
            akwaVar2.b(i4);
            akwaVar2.a(i6);
            try {
                android.net.Uri uri4 = android.net.Uri.parse(string2);
                aooh.e(uri4, "parse(...)");
                string = defpackage.akvx.c(akwaVar2, uri4).toString();
                aooh.c(string);
            } catch (defpackage.abzs e4) {
                hgb.b(((aimp) this.a).d(), "SCS options could not be added. Using raw url.", e4);
                return string2;
            }
        }
        return string;
    }

    public final void E() {
        ((android.media.AudioTrack) this.a).play();
    }

    public final void F() {
        ((android.media.AudioTrack) this.a).release();
    }

    public final void G() {
        ((android.media.AudioTrack) this.a).stop();
    }

    public final int H(byte[] bArr, int i, int i2) {
        return ((android.media.AudioTrack) this.a).write(bArr, i, i2, 0);
    }

    public final adpe I(adog adogVar, ajct ajctVar, j$.util.Optional optional) {
        int iOrdinal = adogVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return new defpackage.adpj((android.content.Context) this.a, optional);
        }
        if (iOrdinal == 2) {
            return new defpackage.adpq((android.content.Context) this.a, ajctVar, optional);
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public final android.view.View J(az azVar, defpackage.akkh akkhVar) {
        java.lang.String str;
        android.view.View viewN;
        int i = akkhVar.c;
        int iA = akky.a(i);
        android.view.View viewFindViewById = null;
        if (iA == 0) {
            throw null;
        }
        int i2 = iA - 1;
        if (i2 == 0) {
            str = i == 1 ? (java.lang.String) akkhVar.d : "";
            if (azVar == null) {
                defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 39, "TargetElementFinder.java").v("activity is null, can't find view.");
            } else {
                android.content.res.Resources resources = azVar.getResources();
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "id", azVar.getPackageName());
                    if (identifier == 0) {
                        defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 50, "TargetElementFinder.java").y("Did not find resource with id %s", str);
                    } else {
                        android.view.View viewFindViewById2 = azVar.findViewById(android.R.id.content);
                        android.view.View viewFindViewById3 = viewFindViewById2.findViewById(identifier);
                        if (viewFindViewById3 == null && (viewN = aesg.n(azVar)) != null) {
                            viewFindViewById3 = viewN.findViewById(identifier);
                        }
                        android.view.View rootView = viewFindViewById2.getRootView();
                        viewFindViewById = (viewFindViewById3 != null || rootView == null) ? viewFindViewById3 : rootView.findViewById(identifier);
                        if (viewFindViewById == null) {
                            defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 72, "TargetElementFinder.java").y("Did not find a view with id %s", str);
                        }
                    }
                }
            }
        } else if (i2 == 1) {
            str = i == 8 ? (java.lang.String) akkhVar.d : "";
            if (azVar == null) {
                defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 87, "TargetElementFinder.java").v("activity is null, can't find view.");
                return null;
            }
            if (str == null) {
                defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 92, "TargetElementFinder.java").v("Received null tag, can't find a view with tag.");
                return null;
            }
            android.view.View viewFindViewById4 = azVar.findViewById(android.R.id.content);
            android.view.View viewA = defpackage.acjg.a(azVar, viewFindViewById4, new defpackage.zqi(str, 12));
            android.view.View rootView2 = viewFindViewById4.getRootView();
            viewFindViewById = (viewA != null || rootView2 == null) ? viewA : defpackage.acjg.a(azVar, rootView2, new defpackage.zqi(str, 13));
            if (viewFindViewById == null) {
                defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 111, "TargetElementFinder.java").y("Did not find a view with tag %s", str);
                return viewFindViewById;
            }
        } else if (i2 == 2) {
            java.lang.Object obj = this.a;
            if (i == 9) {
                ((java.lang.Integer) akkhVar.d).intValue();
            }
            if (azVar == null) {
                defpackage.acjg.a.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 120, "TargetElementFinder.java").v("activity is null, can't find view.");
                return null;
            }
            aikn aiknVar = ((defpackage.acjg) obj).b;
            if (aiknVar.isEmpty()) {
                defpackage.acjg.a.c().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 125, "TargetElementFinder.java").v("No Visual Element View Finder was bound, can't find View");
                return null;
            }
            ailj ailjVarK = aiknVar.k();
            while (ailjVarK.hasNext()) {
                android.view.View viewA2 = ((defpackage.acks) ailjVarK.next()).a();
                if (viewA2 != null) {
                    return viewA2;
                }
            }
        }
        return viewFindViewById;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [acgr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [acgr, java.lang.Object] */
    public final java.lang.Object K(aoln aolnVar) {
        defpackage.acac acacVar;
        if (aolnVar instanceof defpackage.acac) {
            acacVar = (defpackage.acac) aolnVar;
            int i = acacVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                acacVar.b = i - Integer.MIN_VALUE;
            } else {
                acacVar = new defpackage.acac(this, aolnVar);
            }
        } else {
            acacVar = new defpackage.acac(this, aolnVar);
        }
        java.lang.Object objD = acacVar.a;
        java.util.Map map = aolu.a;
        int i2 = acacVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarC = this.a.c();
            aooh.e(ajcqVarC, "getAll(...)");
            acacVar.b = 1;
            objD = aosv.D(ajcqVarC, acacVar);
            if (objD != map) {
            }
            return map;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        map = (java.util.Map) objD;
        if (ajsz.bt(map.entrySet(), new defpackage.abiy(14))) {
            this.a.b(map);
        }
        aooh.c(map);
        return map;
    }

    public final /* synthetic */ defpackage.abxt L() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abxt) aladVarP;
    }

    public final void M(defpackage.abxp abxpVar) {
        aooh.f(abxpVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxt abxtVar = (defpackage.abxt) akzxVar.b;
        defpackage.abxt abxtVar2 = defpackage.abxt.a;
        j$.util.Objects.requireNonNull(abxpVar);
        abxtVar.c = abxpVar;
        abxtVar.b |= 1;
    }

    public final void N(defpackage.abxr abxrVar) {
        aooh.f(abxrVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxt abxtVar = (defpackage.abxt) akzxVar.b;
        defpackage.abxt abxtVar2 = defpackage.abxt.a;
        j$.util.Objects.requireNonNull(abxrVar);
        abxtVar.d = abxrVar;
        abxtVar.b |= 2;
    }

    public final /* synthetic */ defpackage.abxs O() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abxs) aladVarP;
    }

    public final void P(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxs abxsVar = (defpackage.abxs) akzxVar.b;
        defpackage.abxs abxsVar2 = defpackage.abxs.a;
        j$.util.Objects.requireNonNull(str);
        abxsVar.b |= 8;
        abxsVar.f = str;
    }

    public final void Q(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxs abxsVar = (defpackage.abxs) akzxVar.b;
        defpackage.abxs abxsVar2 = defpackage.abxs.a;
        j$.util.Objects.requireNonNull(str);
        abxsVar.b |= 16;
        abxsVar.g = str;
    }

    public final void R(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxs abxsVar = (defpackage.abxs) akzxVar.b;
        defpackage.abxs abxsVar2 = defpackage.abxs.a;
        abxsVar.b |= 1;
        abxsVar.c = f;
    }

    public final void S(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxs abxsVar = (defpackage.abxs) akzxVar.b;
        defpackage.abxs abxsVar2 = defpackage.abxs.a;
        abxsVar.b |= 2;
        abxsVar.d = f;
    }

    public final void T(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxs abxsVar = (defpackage.abxs) akzxVar.b;
        defpackage.abxs abxsVar2 = defpackage.abxs.a;
        abxsVar.b |= 4;
        abxsVar.e = f;
    }

    public final /* synthetic */ defpackage.abxr U() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abxr) aladVarP;
    }

    public final void V(defpackage.amml ammlVar) {
        aooh.f(ammlVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxr abxrVar = (defpackage.abxr) akzxVar.b;
        defpackage.abxr abxrVar2 = defpackage.abxr.a;
        j$.util.Objects.requireNonNull(ammlVar);
        abxrVar.c = ammlVar;
        abxrVar.b |= 1;
    }

    public final void W(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxr abxrVar = (defpackage.abxr) akzxVar.b;
        defpackage.abxr abxrVar2 = defpackage.abxr.a;
        abxrVar.b |= 16;
        abxrVar.g = i;
    }

    public final void X(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxr abxrVar = (defpackage.abxr) akzxVar.b;
        defpackage.abxr abxrVar2 = defpackage.abxr.a;
        abxrVar.b |= 32;
        abxrVar.h = f;
    }

    public final void Y(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxr abxrVar = (defpackage.abxr) akzxVar.b;
        defpackage.abxr abxrVar2 = defpackage.abxr.a;
        abxrVar.b |= 2;
        abxrVar.d = f;
    }

    public final void Z(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxr abxrVar = (defpackage.abxr) akzxVar.b;
        defpackage.abxr abxrVar2 = defpackage.abxr.a;
        abxrVar.b |= 8;
        abxrVar.f = i;
    }

    public final /* synthetic */ defpackage.vtw a() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.vtw) aladVarP;
    }

    public final void aa(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxr abxrVar = (defpackage.abxr) akzxVar.b;
        defpackage.abxr abxrVar2 = defpackage.abxr.a;
        abxrVar.b |= 4;
        abxrVar.e = f;
    }

    public final /* synthetic */ defpackage.abxp ab() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abxp) aladVarP;
    }

    public final void ac(defpackage.abxs abxsVar) {
        aooh.f(abxsVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abxp abxpVar = (defpackage.abxp) akzxVar.b;
        defpackage.abxp abxpVar2 = defpackage.abxp.a;
        j$.util.Objects.requireNonNull(abxsVar);
        abxpVar.c = abxsVar;
        abxpVar.b = 1;
    }

    public final /* synthetic */ defpackage.abwd ad() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abwd) aladVarP;
    }

    public final void ae(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
        defpackage.abwd abwdVar2 = defpackage.abwd.a;
        j$.util.Objects.requireNonNull(str);
        abwdVar.b |= 2;
        abwdVar.d = str;
    }

    public final void af(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
        defpackage.abwd abwdVar2 = defpackage.abwd.a;
        abwdVar.b |= 256;
        abwdVar.k = z;
    }

    public final void ag(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
        defpackage.abwd abwdVar2 = defpackage.abwd.a;
        j$.util.Objects.requireNonNull(str);
        abwdVar.b |= 16;
        abwdVar.g = str;
    }

    public final void ah(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
        defpackage.abwd abwdVar2 = defpackage.abwd.a;
        j$.util.Objects.requireNonNull(str);
        abwdVar.b |= 1;
        abwdVar.c = str;
    }

    public final void ai(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
        defpackage.abwd abwdVar2 = defpackage.abwd.a;
        abwdVar.b |= 8;
        abwdVar.f = j;
    }

    public final void aj(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.abwd abwdVar = (defpackage.abwd) akzxVar.b;
        defpackage.abwd abwdVar2 = defpackage.abwd.a;
        j$.util.Objects.requireNonNull(str);
        abwdVar.b |= 4;
        abwdVar.e = str;
    }

    public final void b(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVar.b;
        defpackage.vtw vtwVar2 = defpackage.vtw.a;
        j$.util.Objects.requireNonNull(str);
        vtwVar.b |= 2;
        vtwVar.d = str;
    }

    public final void c(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.vtw vtwVar = (defpackage.vtw) akzxVar.b;
        defpackage.vtw vtwVar2 = defpackage.vtw.a;
        vtwVar.c = i - 1;
        vtwVar.b |= 1;
    }

    public final /* synthetic */ defpackage.vpt d() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.vpt) aladVarP;
    }

    public final /* synthetic */ defpackage.wos e() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.wos) aladVarP;
    }

    public final defpackage.wpg f() {
        defpackage.wpg wpgVar = ((defpackage.wos) ((akzx) this.a).b).c;
        if (wpgVar == null) {
            wpgVar = defpackage.wpg.a;
        }
        aooh.e(wpgVar, "getUi(...)");
        return wpgVar;
    }

    public final void g(defpackage.wpg wpgVar) {
        aooh.f(wpgVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.wos wosVar = (defpackage.wos) akzxVar.b;
        defpackage.wos wosVar2 = defpackage.wos.a;
        j$.util.Objects.requireNonNull(wpgVar);
        wosVar.c = wpgVar;
        wosVar.b |= 1;
    }

    public final /* synthetic */ defpackage.wor h() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.wor) aladVarP;
    }

    public final /* synthetic */ defpackage.uwv i() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uwv) aladVarP;
    }

    public final void j(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwv uwvVar = (defpackage.uwv) akzxVar.b;
        defpackage.uwv uwvVar2 = defpackage.uwv.a;
        j$.util.Objects.requireNonNull(str);
        uwvVar.b |= 1;
        uwvVar.c = str;
    }

    public final void k() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwv uwvVar = (defpackage.uwv) akzxVar.b;
        defpackage.uwv uwvVar2 = defpackage.uwv.a;
        uwvVar.d = 0;
    }

    public final /* synthetic */ defpackage.uwt l() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uwt) aladVarP;
    }

    public final void m(defpackage.uwv uwvVar) {
        aooh.f(uwvVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwt uwtVar = (defpackage.uwt) akzxVar.b;
        defpackage.uwt uwtVar2 = defpackage.uwt.a;
        j$.util.Objects.requireNonNull(uwvVar);
        uwtVar.c = uwvVar;
        uwtVar.b = 1;
    }

    public final void n(defpackage.uww uwwVar) {
        aooh.f(uwwVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwt uwtVar = (defpackage.uwt) akzxVar.b;
        defpackage.uwt uwtVar2 = defpackage.uwt.a;
        j$.util.Objects.requireNonNull(uwwVar);
        uwtVar.c = uwwVar;
        uwtVar.b = 2;
    }

    public final void o(defpackage.uwx uwxVar) {
        aooh.f(uwxVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwt uwtVar = (defpackage.uwt) akzxVar.b;
        defpackage.uwt uwtVar2 = defpackage.uwt.a;
        j$.util.Objects.requireNonNull(uwxVar);
        uwtVar.c = uwxVar;
        uwtVar.b = 3;
    }

    public final /* synthetic */ defpackage.uwu p() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uwu) aladVarP;
    }

    public final void q(defpackage.uwt uwtVar) {
        aooh.f(uwtVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwu uwuVar = (defpackage.uwu) akzxVar.b;
        defpackage.uwu uwuVar2 = defpackage.uwu.a;
        j$.util.Objects.requireNonNull(uwtVar);
        uwuVar.c = uwtVar;
        uwuVar.b |= 1;
    }

    public final void r() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwu uwuVar = (defpackage.uwu) akzxVar.b;
        defpackage.uwu uwuVar2 = defpackage.uwu.a;
        uwuVar.f = a.R(3);
        uwuVar.b |= 8;
    }

    public final /* synthetic */ defpackage.uva s() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uva) aladVarP;
    }

    public final void t(alcf alcfVar) {
        aooh.f(alcfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uva uvaVar = (defpackage.uva) akzxVar.b;
        defpackage.uva uvaVar2 = defpackage.uva.a;
        j$.util.Objects.requireNonNull(alcfVar);
        uvaVar.e = alcfVar;
        uvaVar.b |= 1;
    }

    public final /* synthetic */ defpackage.utw u() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.utw) aladVarP;
    }

    public final void v(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utw utwVar = (defpackage.utw) akzxVar.b;
        defpackage.utw utwVar2 = defpackage.utw.a;
        j$.util.Objects.requireNonNull(str);
        utwVar.b |= 1;
        utwVar.c = str;
    }

    public final void w(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utw utwVar = (defpackage.utw) akzxVar.b;
        defpackage.utw utwVar2 = defpackage.utw.a;
        j$.util.Objects.requireNonNull(str);
        utwVar.b |= 2;
        utwVar.d = str;
    }

    public final /* synthetic */ defpackage.utu x() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.utu) aladVarP;
    }

    public final void y(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utu utuVar = (defpackage.utu) akzxVar.b;
        defpackage.utu utuVar2 = defpackage.utu.a;
        utuVar.b |= 64;
        utuVar.i = j;
    }

    public final void z(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.utu utuVar = (defpackage.utu) akzxVar.b;
        defpackage.utu utuVar2 = defpackage.utu.a;
        utuVar.b |= 1;
        utuVar.c = j;
    }

    public vqf(abyf abyfVar) {
        aooh.f(abyfVar, "simpleViewBinder");
        this.a = abyfVar;
    }

    public vqf(ahhp ahhpVar) {
        aooh.f(ahhpVar, "requestManager");
        this.a = ahhpVar;
    }

    public vqf(java.lang.Object obj) {
        this.a = obj;
    }

    public vqf(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public vqf(ucm ucmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        this.a = ucmVar;
    }

    public vqf(defpackage.wle wleVar) {
        aooh.f(wleVar, "xatuAudioPrismPipelineResultListener");
        this.a = wleVar;
    }

    public vqf(android.content.Context context, char[] cArr) {
        this.a = (android.media.AudioManager) context.getSystemService("audio");
    }

    public vqf(android.content.res.Resources resources, boolean z) {
        this.a = new aeic(resources, z);
    }

    public vqf(java.lang.Object obj, java.lang.String str) {
        defpackage.adpa.c(obj, defpackage.adpa.a(str));
        this.a = obj;
    }

    public vqf(byte[] bArr, byte[] bArr2) {
        this.a = new java.util.LinkedHashMap();
    }

    public vqf(byte[] bArr) {
        this.a = new java.util.ArrayList(20);
    }

    public vqf() {
        this.a = aiof.i("GnpSdk");
    }
}
