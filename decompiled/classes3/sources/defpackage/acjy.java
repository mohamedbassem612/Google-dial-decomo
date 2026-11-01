package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjy extends al {
    public static final aiof ak = aiof.i("GnpSdk");
    public acit am;
    public aduj an;
    public android.content.Context ao;
    public aeey ap;
    public defpackage.acjx aq;
    public com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext ar;
    public defpackage.aofv au;
    public defpackage.afpl av;
    public defpackage.rai aw;
    private android.os.Handler ax;
    private defpackage.akkc ay;
    boolean al = false;
    public boolean as = false;
    public boolean at = false;

    public static defpackage.acjy aU(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.akkc akkcVar) {
        defpackage.acjy acjyVar = new defpackage.acjy();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("promo_context", promoContext);
        bundle.putInt("theme", akkcVar.d);
        acjyVar.au(bundle);
        return acjyVar;
    }

    private final void aV(final defpackage.acin acinVar, final az azVar, final com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext) {
        java.util.Iterator it = acinVar.b.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setOnClickListener(new android.view.View.OnClickListener() { // from class: acjw
                /* JADX WARN: Code duplicated, block: B:104:0x0332 A[Catch: all -> 0x0373, TryCatch #0 {all -> 0x0373, blocks: (B:3:0x0013, B:6:0x0034, B:8:0x0038, B:10:0x003f, B:12:0x0047, B:13:0x0049, B:15:0x0055, B:16:0x0057, B:9:0x003d, B:17:0x0060, B:20:0x0068, B:22:0x006f, B:32:0x008d, B:34:0x00a3, B:36:0x00aa, B:35:0x00a8, B:37:0x00b5, B:39:0x00b9, B:41:0x00c0, B:43:0x00c4, B:45:0x00cb, B:48:0x00e7, B:51:0x00fb, B:53:0x0118, B:54:0x011d, B:56:0x0134, B:57:0x0139, B:59:0x0145, B:61:0x0155, B:62:0x015a, B:44:0x00c9, B:40:0x00be, B:63:0x017c, B:65:0x0182, B:67:0x018a, B:69:0x01ae, B:71:0x01b5, B:73:0x01b9, B:75:0x01c0, B:74:0x01be, B:70:0x01b3, B:76:0x01da, B:78:0x020c, B:87:0x02e4, B:79:0x023a, B:81:0x0240, B:82:0x026d, B:85:0x027b, B:86:0x02ac, B:88:0x02f1, B:90:0x02f7, B:92:0x02fd, B:94:0x0304, B:96:0x0308, B:98:0x030f, B:100:0x0317, B:101:0x0319, B:103:0x031f, B:105:0x0350, B:97:0x030d, B:93:0x0302, B:104:0x0332, B:106:0x0358, B:21:0x006d), top: B:115:0x0013 }] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    android.content.Intent intent;
                    defpackage.acjy acjyVar = this.a;
                    ahpm ahpmVarA = acjyVar.an.a("PromoUiDialog");
                    defpackage.acin acinVar2 = acinVar;
                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext2 = promoContext;
                    try {
                        akjc akjcVar = (akjc) view.getTag(2131428316);
                        acjyVar.at = true;
                        acjyVar.av.v(promoContext2, acjyVar.am.c(akjcVar));
                        acinVar2.a.dismiss();
                        int i = akjcVar.c;
                        android.app.Activity activity = azVar;
                        if (i == 8) {
                            acit acitVar = acjyVar.am;
                            akij akijVarB = akij.b((i == 8 ? (akik) akjcVar.d : akik.a).g);
                            if (akijVarB == null) {
                                akijVarB = akij.a;
                            }
                            aigf aigfVarB = promoContext2.b();
                            akjb akjbVarB = akjb.b(akjcVar.e);
                            if (akjbVarB == null) {
                                akjbVarB = akjb.a;
                            }
                            acitVar.a(activity, akijVarB, (android.content.Intent) aigfVarB.get(akjbVarB));
                        }
                        int i2 = akjcVar.c;
                        if (i2 == 14) {
                            int iOrdinal = defpackage.akiw.a((i2 == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a).b).ordinal();
                            if (iOrdinal == 0) {
                                aiof aiofVar = defpackage.ackf.a;
                                defpackage.ackf ackfVarJ = defpackage.abxl.j(promoContext2);
                                u uVar = new u(activity.a());
                                uVar.e(0, ackfVarJ, "PermissionRequestFrag", 1);
                                uVar.i(true, true);
                            } else if (iOrdinal == 1) {
                                if (dwz.b()) {
                                    akgw akgwVar = akgw.b;
                                    defpackage.akix akixVar = akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a;
                                    akgw akgwVarB = akgw.b((akixVar.b == 2 ? (defpackage.akio) akixVar.c : defpackage.akio.a).c);
                                    if (akgwVarB == null) {
                                        akgwVarB = akgw.a;
                                    }
                                    if (akgwVar.equals(akgwVarB)) {
                                        intent = new android.content.Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                        intent.putExtra("android.provider.extra.APP_PACKAGE", acjyVar.ao.getPackageName());
                                    } else {
                                        intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        intent.setData(android.net.Uri.parse(java.lang.String.format("package:%s", acjyVar.ao.getPackageName())));
                                    }
                                } else {
                                    intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                    intent.setData(android.net.Uri.parse(java.lang.String.format("package:%s", acjyVar.ao.getPackageName())));
                                }
                                acjyVar.am.a(activity, akij.b, intent);
                            } else if (iOrdinal == 2) {
                                defpackage.adyb adybVar = acjyVar.aq.a;
                                if (adybVar == null || ((defpackage.adyc) adybVar).a()) {
                                    ahvr.cj(promoContext2.e(), "User is not signed in, can't launch authenticated URL in custom tab");
                                    defpackage.adyb adybVar2 = acjyVar.aq.a;
                                    aooh.f(activity, "activity");
                                    sw swVar = new sw();
                                    swVar.a.putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", true);
                                    vx vxVarA = swVar.a();
                                    ((android.content.Intent) vxVarA.a).setPackage("com.android.chrome");
                                    aosy aosyVar = ((defpackage.adyc) adybVar2).i;
                                    if (aosyVar == null) {
                                        defpackage.adyc.a.d().v("PrefetchAuthToken was not called, launching URL with account chooser instead");
                                        ((defpackage.adyc) adybVar2).b(vxVarA, activity);
                                        ((defpackage.adyc) adybVar2).f.b(((defpackage.adyc) adybVar2).b.getPackageName(), ((defpackage.adyc) adybVar2).e.a, "FALLBACK_NO_PREFETCH");
                                    } else if (aosyVar.x()) {
                                        adtv adtvVar = (adtz) aosyVar.b();
                                        int iR = anty.R(adtvVar);
                                        if (iR == 0) {
                                            defpackage.adyc.a.b().v("Auth token job completed successfully, launching authenticated url");
                                            android.net.Uri uri = android.net.Uri.parse((java.lang.String) ((adub) adtvVar).a);
                                            aooh.e(uri, "parse(...)");
                                            vxVarA.c(activity, uri);
                                            ((defpackage.adyc) adybVar2).f.b(((defpackage.adyc) adybVar2).b.getPackageName(), ((defpackage.adyc) adybVar2).e.a, "AUTHENTICATED");
                                        } else if (iR == 1) {
                                            hgb.b(defpackage.adyc.a.d(), "Failed to get auth token, launching URL with account chooser instead", adtvVar.b());
                                            ((defpackage.adyc) adybVar2).b(vxVarA, activity);
                                            ((defpackage.adyc) adybVar2).f.b(((defpackage.adyc) adybVar2).b.getPackageName(), ((defpackage.adyc) adybVar2).e.a, "FALLBACK_AUTH_FAILED");
                                        }
                                    } else {
                                        defpackage.adyc.a.b().v("Auth token job is not completed, launching URL with account chooser instead");
                                        ((defpackage.adyc) adybVar2).b(vxVarA, activity);
                                        ((defpackage.adyc) adybVar2).f.b(((defpackage.adyc) adybVar2).b.getPackageName(), ((defpackage.adyc) adybVar2).e.a, "FALLBACK_AUTH_NOT_COMPLETED");
                                    }
                                    acjyVar.ap.i(acjyVar.ao.getPackageName(), true);
                                } else {
                                    defpackage.acjy.ak.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/dialogs/PromoUiDialogFragment", "setDialogActionListeners", 272, "PromoUiDialogFragment.java").v("Chrome eCCT is not supported, launching unauthenticated URL instead");
                                    acit acitVar2 = acjyVar.am;
                                    akij akijVar = akij.b;
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                                    defpackage.akix akixVar2 = akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a;
                                    acitVar2.a(activity, akijVar, intent2.setData(android.net.Uri.parse((akixVar2.b == 3 ? (defpackage.akjl) akixVar2.c : defpackage.akjl.a).c)));
                                    acjyVar.ap.i(acjyVar.ao.getPackageName(), false);
                                }
                            } else if (iOrdinal == 3) {
                                defpackage.akix akixVar3 = akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a;
                                akii akiiVar = akixVar3.b == 4 ? (akii) akixVar3.c : akii.a;
                                aooh.f(promoContext2, "promoContext");
                                aooh.f(akiiVar, "data");
                                android.content.Intent intent3 = new android.content.Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
                                java.lang.String str = akiiVar.d;
                                if (str.length() == 0) {
                                    str = "GNP";
                                }
                                aooh.e(str, "ifEmpty(...)");
                                java.lang.String strAa = aoov.aa(str, 100);
                                java.lang.String str2 = akiiVar.e;
                                if (str2.length() == 0) {
                                    str2 = "in-app-dialog";
                                }
                                aooh.e(str2, "ifEmpty(...)");
                                java.lang.String strAa2 = aoov.aa(str2, 100);
                                java.lang.String str3 = akiiVar.f;
                                aooh.e(str3, "getUtmCampaign(...)");
                                java.lang.String strAa3 = aoov.aa(str3, 100);
                                intent3.setPackage("com.google.android.gms");
                                java.lang.String strE = promoContext2.e();
                                if (strE != null) {
                                    intent3.putExtra("extra.accountName", strE);
                                }
                                intent3.putExtra("extra.screenId", akiiVar.c);
                                intent3.putExtra("extra.utmSource", strAa);
                                intent3.putExtra("extra.utmMedium", strAa2);
                                if (strAa3.length() > 0) {
                                    intent3.putExtra("extra.utmCampaign", strAa3);
                                }
                                if (anfq.a.b().j()) {
                                    intent3.putExtra("extra.screen.utm_source", strAa);
                                    intent3.putExtra("extra.screen.utm_medium", strAa2);
                                    if (strAa3.length() > 0) {
                                        intent3.putExtra("extra.screen.utm_campaign", strAa3);
                                    }
                                }
                                acjyVar.am.a(activity, akij.e, intent3);
                                ((afip) acjyVar.ap.q.eZ()).b(1L, new java.lang.Object[]{acjyVar.ao.getPackageName()});
                            } else if (iOrdinal == 4) {
                                defpackage.acjy.ak.d().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/dialogs/PromoUiDialogFragment", "setDialogActionListeners", 308, "PromoUiDialogFragment.java").y("Custom action data type is not supported [%s].", defpackage.akiw.a((akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a).b));
                            }
                        }
                        ahpmVarA.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            ahpmVarA.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aofv] */
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
    public final android.app.Dialog eb(android.os.Bundle bundle) {
        defpackage.acin acinVar;
        java.lang.Object obj;
        android.app.Dialog dialog = null;
        if (this.al) {
            az azVarG = G();
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = this.ar;
            defpackage.akkc akkcVar = this.ay;
            akjx akjxVar = promoContext.c().h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            akjx akjxVar2 = akjxVar;
            ?? r1 = this.au;
            defpackage.absj absjVar = new defpackage.absj(this, 2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            akjh akjhVarK = defpackage.aofv.k(akjxVar2);
            android.view.View viewG = r1.g(azVarG, akjxVar2, akkcVar, akjhVarK, arrayList);
            if (viewG == null) {
                acinVar = null;
            } else {
                int iC = akky.c(akjhVarK.l);
                if (iC == 0) {
                    iC = 1;
                }
                int i = iC - 1;
                if (i == 4) {
                    ds dsVar = new ds(azVarG, 2132084740);
                    android.view.Window window = dsVar.getWindow();
                    android.content.Context context = (android.content.Context) r1.d;
                    window.setBackgroundDrawable(context.getDrawable(2131231136));
                    android.view.View decorView = dsVar.getWindow().getDecorView();
                    float dimension = context.getResources().getDimension(2131166146);
                    int i2 = dzs.a;
                    decorView.setElevation(dimension);
                    dsVar.setContentView(viewG);
                    dsVar.setCanceledOnTouchOutside(false);
                    dsVar.setOnShowListener(new jlg(absjVar, 15));
                    obj = dsVar;
                } else if (i != 6) {
                    acinVar = null;
                } else {
                    defpackage.afqy afqyVar = new defpackage.afqy(azVarG, true != anfq.d() ? 2132084738 : 2132084739);
                    afqyVar.setContentView(defpackage.aofv.l(viewG));
                    if (anfq.d()) {
                        final int paddingBottom = viewG.getPaddingBottom();
                        dyy dyyVar = new dyy() { // from class: acjq
                            public final eax dC(android.view.View view, eax eaxVar) {
                                int i3 = eaxVar.f(2).e;
                                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), paddingBottom + i3);
                                return eaxVar;
                            }
                        };
                        int i3 = dzs.a;
                        dzk.o(viewG, dyyVar);
                    }
                    afqyVar.setOnShowListener(new acjr(afqyVar, azVarG, absjVar, 0));
                    obj = afqyVar;
                }
                ?? r12 = obj;
                r1.i(azVarG, r12, null, akjhVarK, viewG);
                acinVar = new defpackage.acin(r12, arrayList);
            }
            if (acinVar == null) {
                ak.c().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/dialogs/PromoUiDialogFragment", "buildDialog", 158, "PromoUiDialogFragment.java").v("Failed to build dialog.");
                this.av.u(promoContext, defpackage.acir.b);
            } else {
                aV(acinVar, azVarG, promoContext);
                dialog = acinVar.a;
            }
        }
        if (dialog != null) {
            return dialog;
        }
        cy cyVarCreate = new cx(z()).create();
        android.os.Handler handler = this.ax;
        j$.util.Objects.requireNonNull(cyVarCreate);
        handler.post(new defpackage.absj(cyVarCreate, 3));
        return cyVarCreate;
    }

    public final void g(android.content.Context context) {
        super.g(context);
        try {
            ((defpackage.abzv) ((aoin) defpackage.adxj.a(context).hc().get(defpackage.acjy.class)).a()).a(this);
            this.al = true;
        } catch (java.lang.Exception e) {
            ak.d().k(e).l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/dialogs/PromoUiDialogFragment", "onAttach", 123, "PromoUiDialogFragment.java").v("Failed to inject members.");
        }
    }

    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        this.ax = new android.os.Handler();
        this.as = bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED");
        if (this.al) {
            android.os.Bundle bundle2 = ((aw) this).m;
            bundle2.setClassLoader(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext.class.getClassLoader());
            this.ar = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) bundle2.getParcelable("promo_context");
            this.ay = defpackage.akkc.b(bundle2.getInt("theme", defpackage.akkc.UNSPECIFIED.d));
        }
        akjx akjxVar = this.ar.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        if (j$.util.Collection.-EL.stream((akjxVar.c == 2 ? (akjh) akjxVar.d : akjh.a).g).anyMatch(new defpackage.zun(3))) {
            defpackage.acjx acjxVar = (defpackage.acjx) new eog(this).a(defpackage.acjx.class);
            this.aq = acjxVar;
            com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = this.ar;
            defpackage.rai raiVar = this.aw;
            if (acjxVar.a != null || promoContext.e() == null) {
                return;
            }
            akjx akjxVar2 = promoContext.c().h;
            if (akjxVar2 == null) {
                akjxVar2 = akjx.a;
            }
            aify aifyVar = (aify) j$.util.Collection.-EL.stream((akjxVar2.c == 2 ? (akjh) akjxVar2.d : akjh.a).g).filter(new defpackage.zun(4)).collect(aido.a);
            if (aifyVar.size() > 1) {
                ak.c().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/dialogs/PromoUiDialogFragment$AuthCustomTabsViewModel", "initializeAndPrefetchAuthToken", 354, "PromoUiDialogFragment.java").v("Found more than one action with in-app browser redirect, using the first one.");
            }
            akjc akjcVar = (akjc) aifyVar.get(0);
            java.lang.String strE = promoContext.e();
            defpackage.akix akixVar = akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a;
            defpackage.akjl akjlVar = akixVar.b == 3 ? (defpackage.akjl) akixVar.c : defpackage.akjl.a;
            him himVar = ((hio) raiVar.a).a;
            acjxVar.a = new defpackage.adyc((android.content.Context) himVar.s.a(), (aoss) himVar.cb.a(), (adym) himVar.rE.a(), (aduu) himVar.qJ.a(), (aeey) himVar.qK.a(), strE, akjlVar.c);
            defpackage.akix akixVar2 = akjcVar.c == 14 ? (defpackage.akix) akjcVar.d : defpackage.akix.a;
            if ((akixVar2.b == 3 ? (defpackage.akjl) akixVar2.c : defpackage.akjl.a).d) {
                defpackage.adyb adybVar = acjxVar.a;
                aiof aiofVar = defpackage.adyc.a;
                defpackage.adyc adycVar = (defpackage.adyc) adybVar;
                aiofVar.b().I("Prefetching auth token for account: %s, url: %s", aesg.p(adycVar.g), adycVar.h);
                if (adycVar.i != null) {
                    aiofVar.b().v("Auth token job was already started, skipping prefetch");
                } else if (adycVar.a()) {
                    adycVar.i = aoov.am(adycVar.c, 0, new defpackage.acbt(adycVar, (aoln) null, 19), 3);
                } else {
                    aiofVar.b().v("Device does not support eCCT, skipping prefetch");
                }
            }
        }
    }

    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.as);
    }

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.at = true;
        this.av.v(this.ar, 3);
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        java.util.ArrayList arrayList;
        akjh akjhVarK;
        android.view.View viewG;
        super.onConfigurationChanged(configuration);
        defpackage.aofv aofvVar = this.au;
        az azVarG = G();
        android.app.Dialog dialog = ((al) this).d;
        akjx akjxVar = this.ar.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        defpackage.akkc akkcVar = this.ay;
        defpackage.acin acinVar = null;
        if (azVarG != null && dialog != null && (viewG = aofvVar.g(azVarG, akjxVar, akkcVar, (akjhVarK = defpackage.aofv.k(akjxVar)), (arrayList = new java.util.ArrayList()))) != null) {
            if (dialog instanceof defpackage.afqy) {
                dialog.setContentView(defpackage.aofv.l(viewG));
            } else {
                dialog.setContentView(viewG);
            }
            aofvVar.i(azVarG, dialog, configuration, akjhVarK, viewG);
            acinVar = new defpackage.acin(dialog, arrayList);
        }
        if (acinVar != null) {
            aV(acinVar, G(), this.ar);
        } else {
            ak.c().l("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/dialogs/PromoUiDialogFragment", "onConfigurationChanged", 135, "PromoUiDialogFragment.java").v("Failed to build dialog.");
            this.av.u(this.ar, defpackage.acir.b);
        }
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext;
        super.onDismiss(dialogInterface);
        if (this.at || !this.as || (promoContext = this.ar) == null) {
            return;
        }
        this.at = true;
        this.av.v(promoContext, 3);
    }
}
