package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abxl {
    public static volatile anqq a;
    private static volatile anpk b;

    private abxl() {
    }

    public static aaum A(ajcq ajcqVar) {
        defpackage.uzx uzxVar = new defpackage.uzx();
        zzx zzxVar = new zzx((zzx) uzxVar.a);
        aiql.I(ajcqVar, new defpackage.ynd(zzxVar, ajcqVar, uzxVar, 3), ajbm.a);
        return (aaum) zzxVar.a;
    }

    public static /* synthetic */ java.lang.String B(int i) {
        if (i != 1) {
            return i != 2 ? "UNKNOWN_ERROR" : "NO_CALLLOG_PERMISSION";
        }
        return "SUCCESS";
    }

    public static final /* synthetic */ defpackage.vaa C(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vaa(akzxVar);
    }

    public static final /* synthetic */ defpackage.vaa D(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vaa(akzxVar);
    }

    public static final defpackage.vaa E(android.net.Uri uri) {
        aooh.f(uri, "uri");
        return new defpackage.vaa(uri);
    }

    public static final /* synthetic */ defpackage.vqf F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqf(akzxVar);
    }

    public static final defpackage.vqf G(abyf abyfVar) {
        aooh.f(abyfVar, "<this>");
        return new defpackage.vqf(abyfVar);
    }

    public static final /* synthetic */ defpackage.vqf H(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqf(akzxVar);
    }

    public static final /* synthetic */ defpackage.vqf I(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqf(akzxVar);
    }

    public static final /* synthetic */ defpackage.vqf J(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqf(akzxVar);
    }

    public static final /* synthetic */ defpackage.vqf K(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqf(akzxVar);
    }

    public static final defpackage.afpl L(java.lang.String str, int i) {
        aooh.f(str, "id");
        return new defpackage.afpl(str, new defpackage.ackt(i), (char[]) null);
    }

    public static final defpackage.afpl M(java.lang.Object obj) {
        return new defpackage.afpl(obj, new bbf((aoln) null, 18, (float[][][]) null), (char[]) null);
    }

    private static final long N(defpackage.amml ammlVar) {
        if ((ammlVar.b & 1) == 0) {
            return cfd.R(ammlVar.c, ammlVar.d, ammlVar.e, 0.0f, (crn) null, 24);
        }
        float f = ammlVar.c;
        float f2 = ammlVar.d;
        float f3 = ammlVar.e;
        akzv akzvVar = ammlVar.f;
        if (akzvVar == null) {
            akzvVar = akzv.a;
        }
        return cfd.R(f, f2, f3, akzvVar.b, (crn) null, 16);
    }

    private static final bss O(defpackage.acix acixVar, cav cavVar) {
        float f = bwa.a;
        return bwa.b(N(acixVar.a), N(acixVar.c), N(acixVar.b), cavVar);
    }

    private static final int P(int i, int i2, android.content.Context context, defpackage.akkc akkcVar) {
        if (akkcVar == defpackage.akkc.DARK) {
            i = i2;
        }
        return context.getColor(i);
    }

    public static anpk a() {
        anpk anpkVarA = b;
        if (anpkVarA == null) {
            synchronized (defpackage.abxl.class) {
                anpkVarA = b;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("com.google.android.libraries.dialer.patrick.account.CallingCardAccountGrpcService", "GetMyCallingCardAccount");
                    aalVarD.b();
                    defpackage.abxj abxjVar = defpackage.abxj.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(abxjVar);
                    aalVarD.c = new aohc(defpackage.abxk.a);
                    anpkVarA = aalVarD.a();
                    b = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static /* synthetic */ int b(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.abwj) {
            return 0;
        }
        if (obj instanceof defpackage.abwk) {
            return 1;
        }
        return obj instanceof defpackage.abwi ? 2 : -2;
    }

    public static final defpackage.abwl c(java.lang.Object obj, java.lang.Object obj2) {
        if (aooh.n(obj, obj2)) {
            throw new java.lang.IllegalArgumentException("Before and after must be different");
        }
        if (obj != null) {
            return obj2 == null ? new defpackage.abwi(obj) : new defpackage.abwk(obj, obj2);
        }
        if (obj2 != null) {
            return new defpackage.abwj(obj2);
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    public static final boolean d(android.net.Uri uri) {
        if (uri != null && aooh.n(uri.getAuthority(), "com.android.contacts")) {
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            java.util.List<java.lang.String> pathSegments2 = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.getPathSegments();
            aooh.e(pathSegments2, "getPathSegments(...)");
            if (aooh.n(pathSegments, ajsz.bU(pathSegments2, "encoded"))) {
                return true;
            }
        }
        return false;
    }

    public static final defpackage.abxp e(defpackage.abxu abxuVar) {
        aooh.f(abxuVar, "<this>");
        defpackage.abxt abxtVar = (defpackage.abxt) abxuVar;
        if ((abxtVar.b & 1) == 0) {
            return null;
        }
        defpackage.abxp abxpVar = abxtVar.c;
        return abxpVar == null ? defpackage.abxp.a : abxpVar;
    }

    public static final defpackage.abxr f(defpackage.abxu abxuVar) {
        aooh.f(abxuVar, "<this>");
        defpackage.abxt abxtVar = (defpackage.abxt) abxuVar;
        if ((abxtVar.b & 2) == 0) {
            return null;
        }
        defpackage.abxr abxrVar = abxtVar.d;
        return abxrVar == null ? defpackage.abxr.a : abxrVar;
    }

    public static final defpackage.abxs g(defpackage.abxq abxqVar) {
        defpackage.abxp abxpVar = (defpackage.abxp) abxqVar;
        int i = abxpVar.b;
        if (i == 1) {
            return i == 1 ? (defpackage.abxs) abxpVar.c : defpackage.abxs.a;
        }
        return null;
    }

    public static final android.content.Intent h(defpackage.abxn abxnVar) {
        android.content.Intent component = new android.content.Intent().setComponent(new android.content.ComponentName("com.google.android.dialer", "com.android.dialer.patrick.onboarding.ui.OnboardingFlowActivity"));
        component.putExtra("OnboardingFlowArgument", abxnVar != null ? abxnVar.i() : null);
        aooh.e(component, "apply(...)");
        return component;
    }

    public static /* synthetic */ java.lang.String i(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "BOTTOM_SHEET";
            case 3:
                return "DIALOG";
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return "PERMISSION";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return "TOOLTIP";
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return "CUSTOM_UI";
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return "IN_APP_REVIEW";
            default:
                return "null";
        }
    }

    public static final defpackage.ackf j(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        defpackage.ackf ackfVar = new defpackage.ackf();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("promo_context", promoContext);
        ackfVar.au(bundle);
        return ackfVar;
    }

    public static final cmw k(cmw cmwVar, ccp ccpVar) {
        return vn.e(cmwVar, new defpackage.abph(ccpVar, 4));
    }

    public static final void l(final cmw cmwVar, final defpackage.aciw aciwVar, boolean z, aomy aomyVar, aomy aomyVar2, aonn aonnVar, cav cavVar, int i) {
        int i2;
        defpackage.aciw aciwVar2;
        cav cavVar2;
        aoos aoosVar;
        bss bssVarB;
        cav cavVar3;
        boolean z2;
        aonn aonnVar2;
        boolean z3;
        boolean z4;
        aooh.f(aciwVar, "promotionData");
        aooh.f(aomyVar, "onTooltipShown");
        aooh.f(aomyVar2, "onTooltipDismissed");
        aooh.f(aonnVar, "content");
        int i3 = i & 6;
        cav cavVarB = cavVar.b(1792655592);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aciwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aomyVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            bwj bwjVarC = bwh.c(true, true, cavVarB, 54, 4);
            cbt cbtVar = (cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            final ccp ccpVar = (ccp) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
                cbtVar.ab(objR2);
            }
            final cei ceiVar = (cei) objR2;
            aoos aoosVar2 = new aoos();
            aoosVar2.a = den.ak(cavVarB).a;
            if (aciwVar.f) {
                cavVarB.u(1379950823);
                int i4 = aciwVar.j;
                cavVarB.u(460158311);
                cavVarB.u(460159613);
                boolean zBg = den.bg(cavVarB);
                cbtVar.W(false);
                cbtVar.W(false);
                if (zBg) {
                    cavVarB.u(1380079132);
                    bssVarB = O(aciwVar.e, cavVarB);
                    defpackage.aciv acivVar = aciwVar.g;
                    if (acivVar != null) {
                        aoosVar2.a = N(acivVar.c);
                    }
                    z2 = false;
                    cbtVar.W(false);
                } else {
                    bwjVarC = bwjVarC;
                    obj = obj;
                    cavVarB.u(1380241882);
                    bssVarB = O(aciwVar.d, cavVarB);
                    defpackage.aciv acivVar2 = aciwVar.g;
                    if (acivVar2 != null) {
                        aoosVar2.a = N(acivVar2.b);
                    }
                    z2 = false;
                    cbtVar.W(false);
                }
                cbtVar.W(z2);
                aoosVar = aoosVar2;
                cavVar3 = cavVarB;
            } else {
                bwjVarC = bwjVarC;
                obj = obj;
                cavVarB.u(1380415916);
                float f = bwa.a;
                aoosVar = aoosVar2;
                bssVarB = bwa.b(den.ak(cavVarB).F, den.ak(cavVarB).s, den.ak(cavVarB).s, cavVarB);
                cavVar3 = cavVarB;
                aoosVar.a = den.ak(cavVar3).a;
                z2 = false;
                cbtVar.W(false);
            }
            final bss bssVar = bssVarB;
            if (z) {
                cavVar3.u(1380867710);
                aonn aonnVarJ = cfo.j(-1414367089, new defpackage.abkv(aonnVar, 6), cavVar3);
                cbtVar.W(z2);
                aonnVar2 = aonnVarJ;
            } else {
                cavVar3.u(1380962725);
                cbtVar.W(z2);
                aonnVar2 = aonnVar;
            }
            cye cyeVarB = awo.b(cmh.a, z2);
            int iM = anty.M(cbtVar.x);
            cje cjeVarAi = cbtVar.ai();
            cmw cmwVarM = cfo.m(cavVar3, cmwVar);
            final aoos aoosVar3 = aoosVar;
            aomy aomyVar3 = dam.a;
            cavVar3.v();
            if (cbtVar.w) {
                cavVar3.j(aomyVar3);
            } else {
                cavVar3.x();
            }
            cev.c(cavVar3, cyeVarB, dam.e);
            cev.c(cavVar3, cjeVarAi, dam.d);
            cev.c(cavVar3, java.lang.Integer.valueOf(iM), dam.f);
            cev.b(cavVar3, dam.g);
            cev.c(cavVar3, cmwVarM, dam.c);
            int i5 = aciwVar.i;
            float f2 = bwa.a;
            drr drrVarA = bwa.a(i5 + (-1) != 2 ? 1 : 2, cavVar3);
            final bwj bwjVar = bwjVarC;
            java.lang.Object obj2 = obj;
            aciwVar2 = aciwVar;
            cja cjaVarJ = cfo.j(359315875, new aono() { // from class: acjn
                public final java.lang.Object a(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    aonn aonnVar3;
                    cja cjaVar;
                    aonn aonnVarJ2;
                    vx vxVar = (vx) obj3;
                    cav cavVar4 = (cav) obj4;
                    int iIntValue = ((java.lang.Integer) obj5).intValue();
                    aooh.f(vxVar, "$this$TooltipBox");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((iIntValue & 8) == 0 ? cavVar4.B(vxVar) : cavVar4.D(vxVar)) ? 2 : 4;
                    }
                    if (cavVar4.H((iIntValue & 19) != 18, iIntValue & 1)) {
                        cei ceiVar2 = ceiVar;
                        defpackage.aciw aciwVar3 = aciwVar;
                        if (aciwVar3.c.length() > 0) {
                            cavVar4.u(1320858401);
                            cja cjaVarJ2 = cfo.j(1179530385, new defpackage.zjn(ceiVar2, aciwVar3, 13, null), cavVar4);
                            cavVar4.o();
                            cjaVar = cjaVarJ2;
                            aonnVar3 = null;
                        } else {
                            cavVar4.u(1321078749);
                            cavVar4.o();
                            aonnVar3 = null;
                            cjaVar = null;
                        }
                        defpackage.aciv acivVar3 = aciwVar3.g;
                        if (acivVar3 == null) {
                            cavVar4.u(1321550537);
                            cavVar4.o();
                            aonnVarJ2 = aonnVar3;
                        } else {
                            aoos aoosVar4 = aoosVar3;
                            ccp ccpVar2 = ccpVar;
                            bwj bwjVar2 = bwjVar;
                            cavVar4.u(1321550538);
                            aonnVarJ2 = cfo.j(1148949380, new fxd(ceiVar2, acivVar3, bwjVar2, ccpVar2, aoosVar4, 4), cavVar4);
                            cavVar4.o();
                        }
                        bss bssVar2 = bssVar;
                        cmw cmwVar2 = cmwVar;
                        float f3 = bwa.a;
                        bwh.f(vxVar, cmwVar2, cjaVar, aonnVarJ2, bwa.c, 0.0f, (crd) null, bssVar2, 0.0f, cfo.j(-1496087984, new defpackage.zjn(aciwVar3, ceiVar2, 14), cavVar4), cavVar4, iIntValue & 14, 6);
                    } else {
                        cavVar4.s();
                    }
                    return aojh.a;
                }
            }, cavVar3);
            if (aciwVar2.g != null) {
                z3 = true;
                z4 = true;
            } else {
                z3 = true;
                z4 = false;
            }
            cav cavVar4 = cavVar3;
            int i6 = i2;
            bwh.b(drrVarA, cjaVarJ, bwjVar, (cmw) null, false, z4, aonnVar2, cavVar4, 48, 120);
            cavVar2 = cavVar4;
            cbtVar.W(z3);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(bwjVar.c());
            boolean zD = cavVar2.D(bwjVar) | ((i6 & 7168) == 2048 ? z3 : false);
            boolean z5 = (i6 & 57344) == 16384 ? z3 : false;
            java.lang.Object objR3 = cbtVar.R();
            if ((zD | z5) || objR3 == obj2) {
                objR3 = new isf(bwjVar, aomyVar, aomyVar2, ccpVar, (aoln) null, 6);
                cbtVar.ab(objR3);
            }
            cbp.g(boolValueOf, (aonn) objR3, cavVar2);
        } else {
            aciwVar2 = aciwVar;
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bxp(cmwVar, aciwVar2, z, aomyVar, aomyVar2, aonnVar, i, 6);
        }
    }

    public static final defpackage.acix m(akkd akkdVar) {
        aooh.f(akkdVar, "<this>");
        akiv akivVar = akkdVar.d;
        if (akivVar == null) {
            akivVar = akiv.a;
        }
        defpackage.amml ammlVar = akivVar.e;
        if (ammlVar == null) {
            ammlVar = defpackage.amml.a;
        }
        aooh.e(ammlVar, "getBackground(...)");
        akiv akivVar2 = akkdVar.d;
        if (akivVar2 == null) {
            akivVar2 = akiv.a;
        }
        defpackage.amml ammlVar2 = akivVar2.c;
        if (ammlVar2 == null) {
            ammlVar2 = defpackage.amml.a;
        }
        aooh.e(ammlVar2, "getPrimary(...)");
        akiv akivVar3 = akkdVar.d;
        if (akivVar3 == null) {
            akivVar3 = akiv.a;
        }
        defpackage.amml ammlVar3 = akivVar3.d;
        if (ammlVar3 == null) {
            ammlVar3 = defpackage.amml.a;
        }
        aooh.e(ammlVar3, "getSecondary(...)");
        return new defpackage.acix(ammlVar, ammlVar2, ammlVar3);
    }

    public static final defpackage.aciy n(android.content.Context context, defpackage.akkc akkcVar, boolean z) {
        if (!a.n() || !z) {
            return null;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130969072, 2130969034, 2130969093, 2130969105, 2130969053, 2130969057, android.R.attr.colorBackground, 2130969068, 2130969035, 2130969074});
        aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(0, P(2131099983, 2131099934, context, akkcVar));
        int color2 = typedArrayObtainStyledAttributes.getColor(1, P(2131099970, 2131099921, context, akkcVar));
        int color3 = typedArrayObtainStyledAttributes.getColor(2, P(2131099990, 2131099941, context, akkcVar));
        int color4 = typedArrayObtainStyledAttributes.getColor(3, P(2131099994, 2131099945, context, akkcVar));
        int color5 = typedArrayObtainStyledAttributes.getColor(4, P(2131099976, 2131099925, context, akkcVar));
        int color6 = typedArrayObtainStyledAttributes.getColor(5, P(2131099978, 2131099928, context, akkcVar));
        int color7 = typedArrayObtainStyledAttributes.getColor(6, P(2131099962, 2131099913, context, akkcVar));
        int color8 = typedArrayObtainStyledAttributes.getColor(7, P(2131099981, 2131099932, context, akkcVar));
        int color9 = typedArrayObtainStyledAttributes.getColor(8, P(2131099971, 2131099922, context, akkcVar));
        int color10 = typedArrayObtainStyledAttributes.getColor(9, P(2131099984, 2131099935, context, akkcVar));
        typedArrayObtainStyledAttributes.recycle();
        return new defpackage.aciy(color, color2, color3, color4, aaoo.aq(2131165873, context), aaoo.aq(2131165874, context), aaoo.aq(2131165875, context), aaoo.aq(2131165876, context), aaoo.aq(2131165877, context), color5, color6, color7, color8, color9, color10);
    }

    public static final /* synthetic */ alcv o(akzx akzxVar) {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.achs) akzxVar.b).b));
        aooh.e(mapUnmodifiableMap, "getPermissionRequestsCountMap(...)");
        return new alcv(mapUnmodifiableMap);
    }

    public static defpackage.wsk p(java.lang.String str, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        defpackage.wsk wskVar = new defpackage.wsk(str);
        if (it.hasNext()) {
            wskVar.e("account");
            wskVar.e(" NOT IN(?");
            wskVar.f((java.lang.String) it.next());
            while (it.hasNext()) {
                wskVar.e(", ?");
                wskVar.f((java.lang.String) it.next());
            }
            wskVar.e(")");
        }
        return wskVar.h();
    }

    public static java.lang.String q(akhl akhlVar) {
        akhq akhqVar = akhlVar.c;
        if (akhqVar == null) {
            akhqVar = akhq.a;
        }
        return r(akhqVar);
    }

    public static java.lang.String r(akhq akhqVar) {
        ahvr.bM(akhqVar != null);
        ahvr.bM(akhqVar.c.size() > 0);
        return android.text.TextUtils.join(",", new java.util.TreeSet((java.util.Collection) akhqVar.c));
    }

    public static final boolean s(java.util.List list, defpackage.akkn akknVar) {
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (akknVar.c.e(i2) == ((java.lang.Number) list.get(i)).intValue() && (i2 = i2 + 1) == akknVar.c.size()) {
                return i == list.size() + (-1);
            }
            i++;
        }
        return false;
    }

    public static final akiq t(akiq akiqVar) {
        aooh.f(akiqVar, "event");
        akzx akzxVarP = akiqVar.p();
        aooh.f(akzxVarP, "builder");
        java.lang.String strA = akhr.a(akiqVar.e, akhr.a);
        aooh.e(strA, "normalizeAndroidPackageName(...)");
        aooh.f(strA, "value");
        akzxVarP.u();
        akiq akiqVar2 = akzxVarP.b;
        j$.util.Objects.requireNonNull(strA);
        akiqVar2.b |= 4;
        akiqVar2.e = strA;
        akiq akiqVarP = akzxVarP.p();
        aooh.e(akiqVarP, "build(...)");
        return akiqVarP;
    }

    public static final defpackage.ackw u(akjb akjbVar) {
        if (akjbVar != null) {
            int iOrdinal = akjbVar.ordinal();
            if (iOrdinal == 1) {
                return defpackage.ackw.b;
            }
            if (iOrdinal == 2) {
                return defpackage.ackw.c;
            }
            if (iOrdinal == 3) {
                return defpackage.ackw.d;
            }
            if (iOrdinal == 4) {
                return defpackage.ackw.e;
            }
        }
        return defpackage.ackw.a;
    }

    public static final defpackage.aclc v(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        int i;
        java.util.ArrayList arrayList;
        aooh.f(promoContext, "promoContext");
        akjx akjxVar = promoContext.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        aooh.e(akjxVar, "getUi(...)");
        aooh.f(akjxVar, "ui");
        int i2 = akjxVar.c;
        if (i2 == 5) {
            i = 5;
        } else {
            int i3 = 2;
            int iC = akky.c((i2 == 2 ? (akjh) akjxVar.d : akjh.a).l);
            if (iC == 0 || iC != 5) {
                int i4 = akjxVar.c;
                int iC2 = akky.c((i4 == 2 ? (akjh) akjxVar.d : akjh.a).l);
                if (iC2 == 0 || iC2 != 7) {
                    i3 = 6;
                    if (i4 == 6) {
                        i3 = 4;
                    } else if (i4 != 11) {
                        akjw akjwVarB = akjw.b(akjxVar.e);
                        if (akjwVarB == null) {
                            akjwVarB = akjw.a;
                        }
                        i = akjwVarB == akjw.h ? 7 : 1;
                    }
                }
            } else {
                i3 = 3;
            }
            i = i3;
        }
        akjx akjxVar2 = promoContext.c().h;
        if (akjxVar2 == null) {
            akjxVar2 = akjx.a;
        }
        aooh.e(akjxVar2, "getUi(...)");
        aooh.f(akjxVar2, "ui");
        java.lang.String str = "";
        if ((akjxVar2.c == 5 ? (defpackage.akkh) akjxVar2.d : defpackage.akkh.a).c == 1) {
            defpackage.akkh akkhVar = akjxVar2.c == 5 ? (defpackage.akkh) akjxVar2.d : defpackage.akkh.a;
            if (akkhVar.c == 1) {
                str = (java.lang.String) akkhVar.d;
            }
        } else {
            int i5 = akjxVar2.c;
            if (i5 == 5) {
                defpackage.akkh akkhVar2 = i5 == 5 ? (defpackage.akkh) akjxVar2.d : defpackage.akkh.a;
                if (akkhVar2.c == 8) {
                    str = (java.lang.String) akkhVar2.d;
                }
            } else {
                str = null;
            }
        }
        java.lang.String str2 = str;
        aigf aigfVarB = promoContext.b();
        aooh.e(aigfVarB, "getActionTypeIntentMap(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(aigfVarB.size()));
        for (java.util.Map.Entry entry : aigfVarB.entrySet()) {
            linkedHashMap.put(u((akjb) entry.getKey()), entry.getValue());
        }
        java.util.Map mapAS = ajsz.aS(linkedHashMap);
        java.lang.String str3 = promoContext.c().d;
        aooh.e(str3, "getGnpCampaignId(...)");
        alat alatVar = promoContext.c().e;
        aooh.e(alatVar, "getBusinessExperimentsList(...)");
        if (alatVar.isEmpty()) {
            akhq akhqVar = promoContext.c().c;
            if (akhqVar == null) {
                akhqVar = akhq.a;
            }
            arrayList = akhqVar.c;
            aooh.c(arrayList);
        } else {
            alat alatVar2 = promoContext.c().e;
            aooh.e(alatVar2, "getBusinessExperimentsList(...)");
            arrayList = new java.util.ArrayList(ajsz.bl(alatVar2, 10));
            java.util.Iterator it = alatVar2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((akhk) it.next()).b));
            }
        }
        return new defpackage.aclc(i, str2, mapAS, str3, arrayList);
    }

    public static final boolean w(akgw akgwVar) {
        aooh.f(akgwVar, "type");
        int iOrdinal = akgwVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
        }
        return dwz.b();
    }

    public static final java.lang.String x(akgw akgwVar) {
        aooh.f(akgwVar, "type");
        if (!w(akgwVar)) {
            java.util.Objects.toString(akgwVar);
            throw new java.lang.IllegalArgumentException("Invalid AndroidPermissionType ".concat(java.lang.String.valueOf(akgwVar)));
        }
        int iOrdinal = akgwVar.ordinal();
        if (iOrdinal == 1) {
            return "android.permission.POST_NOTIFICATIONS";
        }
        if (iOrdinal == 2) {
            return "android.permission.CAMERA";
        }
        if (iOrdinal == 3) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (iOrdinal == 4) {
            return "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        if (iOrdinal == 5) {
            return "android.permission.ACTIVITY_RECOGNITION";
        }
        java.util.Objects.toString(akgwVar);
        throw new java.lang.IllegalArgumentException("Invalid AndroidPermissionType ".concat(java.lang.String.valueOf(akgwVar)));
    }

    public static final akic y(akst akstVar) {
        aooh.f(akstVar, "<this>");
        int iOrdinal = akstVar.ordinal();
        if (iOrdinal == 3) {
            return akic.j;
        }
        switch (iOrdinal) {
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return akic.e;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return akic.b;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return akic.c;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return akic.d;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return akic.g;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return akic.h;
            default:
                return akic.a;
        }
    }

    public static final j$.time.Duration z(akhp akhpVar, int i) {
        java.lang.Object next;
        j$.time.Duration durationAv;
        int iAO;
        aooh.f(akhpVar, "<this>");
        alat alatVar = akhpVar.c;
        aooh.e(alatVar, "getPerActionDurationList(...)");
        java.util.Iterator it = alatVar.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            iAO = a.aO(((akho) next).c);
            if (iAO == 0) {
                iAO = 1;
            }
        } while (iAO != i);
        akho akhoVar = (akho) next;
        if (akhoVar != null) {
            akzm akzmVar = akhoVar.d;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            if (akzmVar != null && (durationAv = aooc.av(akzmVar)) != null) {
                return durationAv;
            }
        }
        akzm akzmVar2 = akhpVar.d;
        if (akzmVar2 == null) {
            akzmVar2 = akzm.a;
        }
        if (defpackage.akmr.i(akzmVar2, aldf.a) <= 0) {
            return null;
        }
        akzm akzmVar3 = akhpVar.d;
        if (akzmVar3 == null) {
            akzmVar3 = akzm.a;
        }
        aooh.e(akzmVar3, "getDefaultDuration(...)");
        return aooc.av(akzmVar3);
    }
}
