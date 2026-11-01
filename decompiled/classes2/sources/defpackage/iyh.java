package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyh implements defpackage.odm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public iyh(defpackage.jrw jrwVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(jrwVar);
        this.a = jrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v35, types: [geh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, ifs] */
    @Override // defpackage.odm
    public final /* synthetic */ void a(java.lang.Object obj) {
        android.widget.LinearLayout linearLayout;
        java.lang.String string;
        defpackage.ogc ogcVar;
        android.os.Bundle bundle;
        j$.util.Optional optional;
        java.lang.String strY;
        java.lang.String str;
        qnf qnfVar;
        qnf qnfVar2;
        pux puxVar;
        java.lang.String str2;
        int i = 8;
        int i2 = 2;
        ahak ahakVar = null;
        android.graphics.SurfaceTexture surfaceTexture = null;
        str = null;
        java.lang.String str3 = null;
        listPreference = null;
        listPreference = null;
        listPreference = null;
        androidx.preference.ListPreference listPreference = null;
        android.widget.LinearLayout linearLayout2 = 0;
        boolean z = false;
        z = false;
        switch (this.$cid) {
            case 0:
                defpackage.ixu ixuVar = (defpackage.ixu) obj;
                defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 152, "BeeslyGreetingSettingsFragmentPeer.kt").v("subscriptionCallbacks onDataLoad");
                defpackage.iyi iyiVar = (defpackage.iyi) this.a;
                if (((java.lang.Boolean) iyiVar.j.a()).booleanValue()) {
                    iyiVar.l.b(ixuVar);
                    return;
                }
                ixh ixhVar = ixuVar.c;
                if (ixhVar == null) {
                    ixhVar = ixh.a;
                }
                aooh.e(ixhVar, "getGreetingsData(...)");
                java.util.List listA = iyiVar.a(ixhVar);
                defpackage.iyc iycVar = iyiVar.b;
                android.support.v7.widget.RecyclerView recyclerViewFindViewById = iycVar.N().findViewById(2131427559);
                if (iyiVar.o) {
                    iyiVar.o = false;
                } else if (recyclerViewFindViewById.E == null) {
                    emy emyVar = ((ahfw) iycVar).a;
                    ahak ahakVar2 = iyiVar.m;
                    if (ahakVar2 == null) {
                        aooh.j("adapter");
                        ahakVar2 = null;
                    }
                    defpackage.hrs hrsVar = new defpackage.hrs(emyVar, new defpackage.iyu(ahakVar2));
                    hrsVar.u();
                    recyclerViewFindViewById.Z(hrsVar);
                }
                ahak ahakVar3 = iyiVar.m;
                if (ahakVar3 == null) {
                    aooh.j("adapter");
                } else {
                    ahakVar = ahakVar3;
                }
                ahakVar.x(listA);
                if (iyiVar.p) {
                    iycVar.N().findViewById(2131427559).W(0);
                    iyiVar.p = false;
                }
                iyiVar.n = ixuVar.d;
                com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButtonFindViewById = iycVar.N().findViewById(2131429024);
                if (iyiVar.n) {
                    floatingActionButtonFindViewById.setBackgroundTintList(android.content.res.ColorStateList.valueOf(urg.c(iycVar.A(), 2130969115)));
                    floatingActionButtonFindViewById.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(iycVar.A(), 2130969068)));
                    return;
                } else {
                    floatingActionButtonFindViewById.setBackgroundTintList(android.content.res.ColorStateList.valueOf(urg.c(iycVar.A(), 2130969094)));
                    floatingActionButtonFindViewById.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(iycVar.A(), 2130969046)));
                    return;
                }
            case 1:
                aify aifyVar = (aify) obj;
                aimz aimzVar = defpackage.ifg.a;
                aimzVar.b().l("com/android/dialer/audioplayback/impl/ui/AudioDeviceSelectorDialogFragmentPeer$audioDeviceEntrySubscriptionCallbacks$<anonymous>", "onDataLoad", 64, "AudioDeviceSelectorDialogFragmentPeer.kt").w("%d available audio devices loaded", aifyVar.size());
                defpackage.ifg ifgVar = (defpackage.ifg) this.a;
                android.view.View view = ((aw) ifgVar.c).Q;
                if (view != null) {
                    linearLayout = (android.widget.LinearLayout) view.findViewById(2131427495);
                }
                if (linearLayout2 == 0) {
                    linearLayout2 = linearLayout;
                    aimzVar.d().l("com/android/dialer/audioplayback/impl/ui/AudioDeviceSelectorDialogFragmentPeer$audioDeviceEntrySubscriptionCallbacks$<anonymous>", "onDataLoad", 68, "AudioDeviceSelectorDialogFragmentPeer.kt").v("AudioDeviceSelectorDialogFragment's view is not inflated.");
                    return;
                }
                linearLayout2 = linearLayout;
                linearLayout2.removeAllViews();
                android.media.AudioDeviceInfo audioDeviceInfo = ifgVar.e.l;
                ailk ailkVarY = aifyVar.y(0);
                aooh.e(ailkVarY, "iterator(...)");
                while (ailkVarY.hasNext()) {
                    defpackage.ieq ieqVar = (defpackage.ieq) ailkVarY.next();
                    aooh.c(ieqVar);
                    android.media.AudioDeviceInfo audioDeviceInfo2 = ieqVar.a;
                    boolean zN = aooh.n(audioDeviceInfo2, audioDeviceInfo);
                    ?? ifsVar = new defpackage.ifs(ifgVar.d);
                    defpackage.ifb ifbVarF = ifsVar.y();
                    aooh.f(ieqVar, "entry");
                    java.lang.Object obj2 = ifbVarF.b;
                    android.content.Context context = (android.content.Context) ifbVarF.a;
                    android.widget.ImageView imageView = (android.widget.ImageView) obj2;
                    imageView.setImageDrawable(context.getDrawable(ifi.a(audioDeviceInfo2.getType())));
                    android.widget.TextView textView = (android.widget.TextView) ifbVarF.c;
                    textView.setText(ieqVar.b);
                    ((android.widget.ImageView) ifbVarF.d).setVisibility(true != zN ? 8 : 0);
                    if (zN) {
                        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(context, 2130969072)));
                        textView.setTextColor(urg.c(context, 2130969072));
                    } else {
                        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(context, 2130968958)));
                        textView.setTextColor(urg.c(context, android.R.attr.textColorSecondary));
                    }
                    ifgVar.k.g((android.view.View) ifsVar, new defpackage.iff(audioDeviceInfo2));
                    linearLayout2.addView(ifsVar);
                }
                return;
            case 2:
                defpackage.jrq jrqVar = (defpackage.jrq) obj;
                defpackage.jrw jrwVar = (defpackage.jrw) this.a;
                if (!jrwVar.d()) {
                    jrwVar.d.k(jrqVar.e);
                    jrwVar.j.g(jrwVar.n.b(jrqVar.e, false), 5L, java.util.concurrent.TimeUnit.SECONDS);
                }
                jrwVar.c.k(jrqVar.h);
                j$.util.Optional optionalG = jrwVar.q.g();
                defpackage.hvp hvpVar = new defpackage.hvp(this, jrqVar, 4);
                if (true == optionalG.isPresent()) {
                    java.lang.Object obj3 = optionalG.get();
                    java.lang.Object obj4 = hvpVar.a;
                    java.lang.Object obj5 = hvpVar.b;
                    ?? r4 = ((defpackage.iyh) obj4).a;
                    defpackage.jrw jrwVar2 = (defpackage.jrw) r4;
                    if (jrwVar2.e == null) {
                        defpackage.jrr jrrVar = jrwVar2.g;
                        jrwVar2.e = (androidx.preference.SwitchPreference) jrrVar.ee(jrrVar.dX().getString(2132017486));
                    }
                    androidx.preference.SwitchPreference switchPreference = jrwVar2.e;
                    defpackage.jrq jrqVar2 = (defpackage.jrq) obj5;
                    boolean z2 = jrqVar2.f;
                    boolean z3 = jrqVar2.g;
                    if (z2) {
                        switchPreference.n = r4;
                        switchPreference.k(z3);
                    } else {
                        jrwVar2.g.dW().af(switchPreference);
                        defpackage.jrw.a.b().l("com/android/dialer/callerid/settings/impl/CallerIdSettingsFragmentPeer", "setupB2cEnrichedCallingSettings", 323, "CallerIdSettingsFragmentPeer.java").v("removing B2C EC settings as it is not supported");
                        switchPreference.k(false);
                    }
                }
                com.android.dialer.common.preference.ClickableWhenDisabledSwitchPreference clickableWhenDisabledSwitchPreference = jrwVar.c;
                if (!((androidx.preference.TwoStatePreference) clickableWhenDisabledSwitchPreference).a && jrqVar.h) {
                    clickableWhenDisabledSwitchPreference.k(true);
                    jrwVar.j.g(jrwVar.n.a(true, false), 5L, java.util.concurrent.TimeUnit.SECONDS);
                    jrwVar.b(true, false);
                }
                j$.util.Optional optionalG2 = jrwVar.p.g();
                defpackage.hvp hvpVar2 = new defpackage.hvp(this, jrqVar, 5);
                if (true == optionalG2.isPresent()) {
                    java.lang.Object obj6 = optionalG2.get();
                    java.lang.Object obj7 = hvpVar2.a;
                    if (!((defpackage.jrq) hvpVar2.b).i) {
                        defpackage.jrw jrwVar3 = (defpackage.jrw) ((defpackage.iyh) obj7).a;
                        jrwVar3.c.I(true);
                        jrwVar3.d.I(((androidx.preference.TwoStatePreference) jrwVar3.c).a);
                        return;
                    }
                    defpackage.jrw jrwVar4 = (defpackage.jrw) ((defpackage.iyh) obj7).a;
                    jrwVar4.c.k(true);
                    jrwVar4.c.I(false);
                    jrwVar4.c.c = new defpackage.jrv(obj7, z ? 1 : 0);
                    jrwVar4.d.k(true);
                    jrwVar4.d.I(false);
                    jrwVar4.d.c = new defpackage.jrv(obj7, i2);
                    return;
                }
                return;
            case 3:
                defpackage.lso lsoVar = (defpackage.lso) aooh.q((j$.util.Optional) obj);
                if (lsoVar != null) {
                    defpackage.ltk ltkVar = ((defpackage.ltp) this.a).c;
                    android.view.View viewFindViewById = ((aw) ltkVar).Q.findViewById(2131429343);
                    aooh.e(viewFindViewById, "findViewById(...)");
                    android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById;
                    if ((lsoVar.b & 1) != 0) {
                        string = ltkVar.z().getString(2132019040, lsoVar.c);
                        aooh.c(string);
                    } else {
                        string = ltkVar.z().getString(2132019036);
                        aooh.c(string);
                    }
                    textView2.setText(string);
                }
                defpackage.ltp.a.b().l("com/android/dialer/contactchecker/receiver/impl/ui/ContactCheckerAlertCenterFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 61, "ContactCheckerAlertCenterFragmentPeer.kt").v("loaded verificationModel");
                return;
            case 4:
                defpackage.mmq.a.b().l("com/android/dialer/display/settings/impl/DisplayOptionsSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 65, "DisplayOptionsSettingsFragmentPeer.kt").v("subscriptionCallbacks onDataLoad");
                ((defpackage.mmq) this.a).b().k(((defpackage.mmg) obj).b);
                return;
            case 5:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.nvl.a.b().l("com/android/dialer/dobby/impl/wear/bam/ui/BamCenterFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 70, "BamCenterFragmentPeer.kt").y("is model present: %b", java.lang.Boolean.valueOf(optional2.isPresent()));
                defpackage.num numVar = (defpackage.num) aooh.q(optional2);
                if (numVar != null) {
                    defpackage.nvl nvlVar = (defpackage.nvl) this.a;
                    if (!nvlVar.g) {
                        nvlVar.b(nvlVar.b, new nto(nvlVar, (aoln) null, 9, (byte[]) null));
                        nvlVar.g = true;
                    }
                    android.widget.Chronometer chronometer = (android.widget.Chronometer) nvlVar.d.N().findViewById(2131427538);
                    chronometer.setBase((numVar.c - j$.time.Instant.now().toEpochMilli()) + android.os.SystemClock.elapsedRealtime());
                    chronometer.start();
                    return;
                }
                return;
            case 6:
                java.lang.Object obj8 = this.a;
                defpackage.ogg oggVar = (defpackage.ogg) obj8;
                defpackage.ogb ogbVar = oggVar.a;
                android.view.View viewFindViewById2 = ogbVar.N().findViewById(2131428219);
                aooh.e(viewFindViewById2, "findViewById(...)");
                android.widget.ImageView imageView2 = (android.widget.ImageView) viewFindViewById2;
                defpackage.ofj ofjVar = (defpackage.ofj) aooh.q((j$.util.Optional) obj);
                if (ofjVar == null) {
                    imageView2.setVisibility(8);
                    oggVar.g = null;
                    oggVar.h = null;
                    return;
                }
                imageView2.setVisibility(0);
                if (oggVar.d.a(ogbVar.A())) {
                    imageView2.getLayoutParams().width = (int) ogbVar.dX().getDimension(2131165314);
                    imageView2.getLayoutParams().height = (int) ogbVar.dX().getDimension(2131165314);
                    imageView2.requestLayout();
                }
                ops opsVar = oggVar.i;
                abwd abwdVar = ofjVar.a;
                akcu akcuVar = new akcu();
                akcuVar.f();
                akcuVar.g(false);
                akcuVar.h(true);
                opsVar.g(imageView2, abwdVar, akcuVar.e(), false);
                android.view.View viewFindViewById3 = ogbVar.N().findViewById(2131427824);
                aooh.e(viewFindViewById3, "findViewById(...)");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3;
                if (viewGroup.getChildCount() <= 0) {
                    ahey aheyVar = oggVar.e;
                    defpackage.ogi ogiVar = new defpackage.ogi(ofjVar.b, ofjVar.c);
                    defpackage.ogo ogoVar = new defpackage.ogo(aheyVar);
                    defpackage.ogj ogjVarC = ogoVar.y();
                    java.lang.Object obj9 = ogjVarC.b;
                    defpackage.oeu oeuVar = ogiVar.a;
                    android.content.Context context2 = ((android.view.View) ogjVarC.a).getContext();
                    aooh.e(context2, "getContext(...)");
                    aooh.f(context2, "appContext");
                    java.lang.String string2 = context2.getString(oeuVar.e);
                    aooh.e(string2, "getString(...)");
                    ((android.widget.TextView) obj9).setText(string2);
                    java.lang.Object obj10 = ogjVarC.c;
                    java.lang.String str4 = ogiVar.b;
                    com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) obj10;
                    lottieAnimationView.k(str4, str4);
                    lottieAnimationView.p(-1);
                    lottieAnimationView.e();
                    viewGroup.addView(ogoVar);
                    android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(ogbVar.A(), 2130837505);
                    animatorLoadAnimator.setTarget(viewGroup);
                    oggVar.g = animatorLoadAnimator;
                    viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new defpackage.oge(viewGroup, obj8, 0));
                    android.animation.Animator animatorLoadAnimator2 = android.animation.AnimatorInflater.loadAnimator(ogbVar.A(), 2130837506);
                    animatorLoadAnimator2.setTarget(viewGroup);
                    oggVar.h = animatorLoadAnimator2;
                    j$.util.Optional optionalH = oggVar.j.h();
                    aooh.e(optionalH, "getPrimaryCallScope(...)");
                    apqr apqrVar = (apqr) aooh.q(optionalH);
                    qbe qbeVarCp = (apqrVar == null || (ogcVar = (defpackage.ogc) apqrVar.a(defpackage.ogc.class)) == null) ? null : ogcVar.cp();
                    if (qbeVarCp != null) {
                        qbeVarCp.c(qbc.jq);
                    }
                    oggVar.m.i(aoov.am(oggVar.f, 0, new defpackage.ogf(oggVar, (aoln) null, 0), 3));
                    return;
                }
                return;
            case 7:
                defpackage.ohc ohcVar = (defpackage.ohc) aooh.q((j$.util.Optional) obj);
                if (ohcVar != null) {
                    defpackage.ohb ohbVar = ohcVar.a;
                    int iOrdinal = ohbVar.ordinal();
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        ((defpackage.ohv) this.a).f.b(ohcVar);
                        return;
                    } else {
                        defpackage.ohv.b.b().l("com/android/dialer/expresso/sender/impl/ui/ExpressoGridFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 85, "ExpressoGridFragmentPeer.kt").y("Invalid state %s", ohbVar);
                        return;
                    }
                }
                return;
            case 8:
                defpackage.oiu oiuVar = (defpackage.oiu) obj;
                defpackage.oiz oizVar = (defpackage.oiz) this.a;
                androidx.preference.SwitchPreference switchPreferenceC = oizVar.c();
                androidx.preference.SwitchPreference switchPreferenceD = oizVar.d();
                androidx.preference.Preference preferenceA = oizVar.a();
                androidx.preference.Preference preferenceB = oizVar.b();
                switchPreferenceC.k(oiuVar.c);
                switchPreferenceC.R(true);
                preferenceB.R(oiuVar.e);
                if (!oiuVar.d && !oiuVar.e) {
                    z = true;
                }
                preferenceA.R(z);
                switchPreferenceD.k(oiuVar.f);
                switchPreferenceD.R(true);
                return;
            case 9:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                defpackage.orq orqVar = new defpackage.orq(this, i2);
                if (true == optional3.isPresent()) {
                    java.lang.Object obj11 = optional3.get();
                    java.lang.Object obj12 = orqVar.a;
                    if (((osn) obj11).a) {
                        ((osx) ((defpackage.iyh) obj12).a).b.H().finish();
                    }
                }
                osx osxVar = (osx) this.a;
                if (osxVar.i.b(zpo.h).isEmpty()) {
                    osxVar.b.H().finish();
                    return;
                }
                return;
            case 10:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                defpackage.orq orqVar2 = new defpackage.orq(this.a, 14);
                if (true == optional4.isPresent()) {
                    java.lang.Object obj13 = optional4.get();
                    java.lang.Object obj14 = orqVar2.a;
                    zai zaiVar = ((ovf) obj13).a;
                    ovi oviVar = ((ovk) obj14).b;
                    ((android.widget.TextView) ((aw) oviVar).Q.findViewById(2131427465)).setText(afsq.cr(oviVar.z().getString(2132017326, zaiVar.d)));
                    return;
                }
                return;
            case 11:
                oxa oxaVar = (oxa) obj;
                oxi oxiVar = (oxi) this.a;
                oxh oxhVar = oxiVar.c;
                androidx.preference.ListPreference listPreference2 = (androidx.preference.ListPreference) oxhVar.ee(oxhVar.A().getString(2132017327));
                aimz aimzVar2 = oxi.a;
                aimw aimwVarL = aimzVar2.b().l("com/android/dialer/incall/answer/method/settings/ui/AnswerMethodSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 69, "AnswerMethodSettingsFragmentPeer.kt");
                owy owyVarB = owy.b(oxaVar.b);
                if (owyVarB == null) {
                    owyVarB = owy.d;
                }
                aimwVarL.y("onDataLoad: %s", owyVarB);
                owy owyVarB2 = owy.b(oxaVar.b);
                if (owyVarB2 == null) {
                    owyVarB2 = owy.d;
                }
                int iOrdinal2 = owyVarB2.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            throw new java.lang.IllegalStateException("Must be swipe, tap, or unknown!");
                        }
                        if (listPreference2 != null) {
                            listPreference2.q(oxiVar.c());
                            listPreference = listPreference2;
                        }
                    } else if (listPreference2 != null) {
                        listPreference2.q(oxiVar.b());
                        listPreference = listPreference2;
                    }
                } else if (((java.lang.Boolean) oxiVar.f.a()).booleanValue() && oxiVar.e.a()) {
                    aimzVar2.b().l("com/android/dialer/incall/answer/method/settings/ui/AnswerMethodSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 79, "AnswerMethodSettingsFragmentPeer.kt").v("No selected answer method found and Simple View active. Defaulting to tap.");
                    if (listPreference2 != null) {
                        listPreference2.q(oxiVar.c());
                        listPreference = listPreference2;
                    }
                } else {
                    aimzVar2.b().l("com/android/dialer/incall/answer/method/settings/ui/AnswerMethodSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 82, "AnswerMethodSettingsFragmentPeer.kt").v("No selected answer method found. Defaulting to swipe.");
                    if (listPreference2 != null) {
                        listPreference2.q(oxiVar.b());
                        listPreference = listPreference2;
                    }
                }
                if (listPreference != null) {
                    listPreference.p(listPreference.i);
                }
                if ((!((java.lang.Boolean) oxiVar.g.a()).booleanValue() && !((java.lang.Boolean) oxiVar.h.a()).booleanValue() && !((java.lang.Boolean) oxiVar.i.a()).booleanValue()) || (bundle = ((aw) oxhVar).m) == null || bundle.isEmpty()) {
                    return;
                }
                rvq rvqVarP = akmr.p(bundle, "extra_settings_launch_config", rvq.a, akzq.a());
                rvo rvoVar = rvqVarP.c == 2 ? (rvo) rvqVarP.d : rvo.a;
                if ((rvoVar.b == 10 ? (rve) rvoVar.c : rve.a).b) {
                    bundle.remove("extra_settings_launch_config");
                    oxhVar.p(oxiVar.a());
                    return;
                }
                return;
            case 12:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                java.lang.Object obj15 = this.a;
                oyc oycVar = (oyc) obj15;
                if (!oycVar.l) {
                    if (((java.lang.Boolean) (true != optional5.isPresent() ? optional5 : j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((own) optional5.get()).d))).orElse(java.lang.Boolean.FALSE)).booleanValue() && oycVar.d().isPresent()) {
                        oycVar.l = true;
                        oycVar.h.isPresent();
                    }
                }
                oycVar.t = optional5;
                j$.util.Optional optional6 = oycVar.t;
                defpackage.orq orqVar3 = new defpackage.orq(obj15, 16);
                if (true == optional6.isPresent()) {
                    java.lang.Object obj16 = optional6.get();
                    java.lang.Object obj17 = orqVar3.a;
                    j$.util.Optional optional7 = ((own) obj16).c;
                    if (optional7.isPresent()) {
                        oyc oycVar2 = (oyc) obj17;
                        oycVar2.c().setText((java.lang.CharSequence) optional7.orElseThrow());
                        oycVar2.c().setVisibility(0);
                        oycVar2.b().setVisibility(8);
                        oycVar2.c().animate().alpha(1.0f);
                    } else {
                        oyc oycVar3 = (oyc) obj17;
                        oycVar3.c().animate().alpha(0.0f).setListener(defpackage.hrz.a(oycVar3.d, new oxr(obj17, 6)));
                    }
                }
                oycVar.p();
                if (oycVar.t.isPresent()) {
                    int color = ((own) oycVar.t.orElseThrow()).f ? oycVar.b.getColor(2131099994) : urg.c(oycVar.b, 2130969068);
                    j$.util.Optional optionalD = oycVar.d();
                    oxt oxtVar = new oxt(color, 0);
                    if (true == optionalD.isPresent()) {
                        ((android.widget.TextView) optionalD.get()).setTextColor(oxtVar.a);
                    }
                    j$.util.Optional optionalE = oycVar.e();
                    oxt oxtVar2 = new oxt(color, 2);
                    if (true == optionalE.isPresent()) {
                        ((android.widget.TextView) optionalE.get()).setTextColor(oxtVar2.a);
                    }
                    oycVar.c().setTextColor(color);
                }
                j$.util.Optional optional8 = oycVar.t;
                defpackage.orq orqVar4 = new defpackage.orq(obj15, 18);
                if (true == optional8.isPresent()) {
                    java.lang.Object obj18 = optional8.get();
                    j$.util.Optional optionalD2 = ((oyc) orqVar4.a).d();
                    defpackage.orq orqVar5 = new defpackage.orq((own) obj18, 17);
                    if (true == optionalD2.isPresent()) {
                        ((android.widget.TextView) optionalD2.get()).setText(true != ((own) orqVar5.a).m ? 2132017680 : 2132017681);
                        return;
                    }
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                own ownVar = (own) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                oyp oypVar = (oyp) this.a;
                oypVar.h = ownVar;
                android.widget.TextView textViewA = oypVar.a();
                oym oymVar = oypVar.b;
                textViewA.setVisibility(true == oymVar.H().isInMultiWindowMode() ? 0 : 8);
                own ownVar2 = oypVar.h;
                if (ownVar2 != null && (optional = ownVar2.b) != null) {
                    str3 = (java.lang.String) aooh.q(optional);
                }
                if (str3 != null) {
                    oypVar.a().setText(str3);
                    oypVar.a().animate().alpha(1.0f).start();
                } else {
                    oypVar.a().animate().alpha(0.0f).start();
                }
                own ownVar3 = oypVar.h;
                if (ownVar3 != null) {
                    oypVar.m(oyp.n(ownVar3));
                    java.lang.String strY2 = ownVar3.m ? oymVar.Y(2132017661) : oymVar.Y(2132017660);
                    oypVar.h().setText(strY2);
                    oypVar.b().setText(strY2);
                    oypVar.e().setContentDescription(strY2);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                oyu oyuVar = (oyu) this.a;
                oyuVar.i = (j$.util.Optional) obj;
                oyuVar.j();
                oyuVar.i();
                oyr oyrVar = oyuVar.c;
                android.widget.TextView textView3 = (android.widget.TextView) oyrVar.N().findViewById(2131429335);
                textView3.setVisibility(true != oyrVar.H().isInMultiWindowMode() ? 0 : 8);
                j$.util.Optional optional9 = oyuVar.i;
                if (true == optional9.isPresent()) {
                    optional9 = ((own) optional9.get()).b;
                    optional9.getClass();
                }
                optional9.ifPresentOrElse(new oxs(textView3, 2), new defpackage.lye(textView3, 15));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                own ownVar4 = (own) aooh.q((j$.util.Optional) obj);
                java.lang.Object obj19 = this.a;
                if (ownVar4 == null) {
                    ozk ozkVar = (ozk) obj19;
                    if (ozkVar.a() != null) {
                        ozkVar.d(true);
                        return;
                    }
                    return;
                }
                ozk ozkVar2 = (ozk) obj19;
                ozkVar2.g.b(ownVar4);
                ozkVar2.d(false);
                ozn oznVarB = ozkVar2.b();
                if (oznVarB != null) {
                    if (!ozkVar2.f(ownVar4)) {
                        owy owyVar = ownVar4.n;
                        if (owyVar == null) {
                            return;
                        }
                        int iOrdinal3 = owyVar.ordinal();
                        if (iOrdinal3 == 1) {
                            oznVarB.e = 1;
                            return;
                        } else if (iOrdinal3 != 2) {
                            return;
                        }
                    }
                    oznVarB.e = 2;
                    return;
                }
                return;
            case 16:
                j$.util.Optional optional10 = (j$.util.Optional) obj;
                pdd pddVar = (pdd) this.a;
                pddVar.g = optional10;
                if (pddVar.g.isPresent()) {
                    pcy pcyVar = pddVar.c;
                    android.view.View view2 = ((aw) pcyVar).Q;
                    aooh.d(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
                    ((android.widget.LinearLayout) view2).removeAllViews();
                    ailk ailkVarY2 = ((pcq) pddVar.g.orElseThrow()).a.y(0);
                    aooh.e(ailkVarY2, "iterator(...)");
                    while (ailkVarY2.hasNext()) {
                        zmv zmvVar = (zmv) ailkVarY2.next();
                        aooh.c(zmvVar);
                        android.view.View viewInflate = pcyVar.K().inflate(2131623997, (android.view.ViewGroup) ((aw) pcyVar).Q, false);
                        aooh.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                        android.widget.TextView textView4 = (android.widget.TextView) viewInflate;
                        j$.util.Optional optional11 = zmvVar.c;
                        if (optional11.isPresent()) {
                            java.lang.Object objOrElseThrow = optional11.orElseThrow();
                            aooh.e(objOrElseThrow, "orElseThrow(...)");
                            strY = (java.lang.String) objOrElseThrow;
                        } else if (zmvVar.a == zmw.b) {
                            strY = pcyVar.Y(2132017465);
                            aooh.e(strY, "getString(...)");
                        } else {
                            strY = "";
                        }
                        textView4.setText(strY);
                        zmw zmwVar = zmvVar.a;
                        if (zmwVar == null) {
                            textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        } else {
                            int iOrdinal4 = zmwVar.ordinal();
                            if (iOrdinal4 == 0) {
                                textView4.setCompoundDrawablesWithIntrinsicBounds(2131231058, 0, 0, 0);
                            } else if (iOrdinal4 == 1) {
                                textView4.setCompoundDrawablesWithIntrinsicBounds(2131231931, 0, 0, 0);
                            } else if (iOrdinal4 == 2) {
                                textView4.setCompoundDrawablesWithIntrinsicBounds(2131231958, 0, 0, 0);
                            } else if (iOrdinal4 != 3) {
                                textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            } else {
                                textView4.setCompoundDrawablesWithIntrinsicBounds(2131232007, 0, 0, 0);
                            }
                        }
                        android.view.View view3 = ((aw) pcyVar).Q;
                        aooh.d(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
                        ((android.widget.LinearLayout) view3).addView(textView4);
                        textView4.setVisibility(0);
                        if (((java.lang.Boolean) zmvVar.d.orElseThrow()).booleanValue()) {
                            int iC = urg.c(pcyVar.z(), 2130969072);
                            textView4.setSelected(true);
                            textView4.setTextColor(iC);
                            textView4.setCompoundDrawableTintList(android.content.res.ColorStateList.valueOf(iC));
                            textView4.setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode.SRC_ATOP);
                        }
                        pddVar.j.g(textView4, new pcv(zmvVar));
                    }
                } else {
                    pdd.a.b().l("com/android/dialer/incall/audioroute/ui/TidePodsAudioRouteSelectorDialogFragmentPeer", "updateSelector", 196, "TidePodsAudioRouteSelectorDialogFragmentPeer.kt").v("no primary call data, dismissing fragment.");
                    pddVar.c.f();
                }
                gpd gpdVar = pddVar.k;
                pcq pcqVar = (pcq) aooh.q(optional10);
                gpdVar.i(pcqVar != null ? pcqVar.b : null).b(mce.aU);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                j$.util.Optional optional12 = (j$.util.Optional) obj;
                pdq.a.b().l("com/android/dialer/incall/avatar/ui/AvatarFragmentPeer$modelCallback$<anonymous>", "onDataLoad", 67, "AvatarFragmentPeer.kt").y("newModelOptional.isPresent: %b", java.lang.Boolean.valueOf(optional12.isPresent()));
                pdn pdnVar = (pdn) aooh.q(optional12);
                if (pdnVar != null) {
                    pdq pdqVar = (pdq) this.a;
                    pdqVar.f.b(pdnVar);
                    pdqVar.b.aE();
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                j$.util.Optional optional13 = (j$.util.Optional) obj;
                if (!optional13.isPresent()) {
                    a.bI(pmh.a.d(), "no CallTransferDialogModel.", "com/android/dialer/incall/calltransfer/impl/ui/CallTransferDialogFragmentPeer$1", "onDataLoad", '=', "CallTransferDialogFragmentPeer.java", zct.b);
                    return;
                }
                java.lang.Object obj20 = this.a;
                plw plwVar = (plw) optional13.orElseThrow();
                pme pmeVar = ((pmh) obj20).b;
                ((android.widget.TextView) pmeVar.d.findViewById(2131427799)).setText(pmeVar.dX().getString(2132017875, plwVar.d, plwVar.e));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                pyc pycVar = (pyc) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                pyu pyuVar = (pyu) this.a;
                pyuVar.h = pycVar;
                android.widget.EditText editText = (android.widget.EditText) pyuVar.d.N().findViewById(2131428000);
                pyc pycVar2 = pyuVar.h;
                if (pycVar2 == null) {
                    editText.getText().clear();
                    return;
                } else {
                    editText.setText(pycVar2.d);
                    editText.setSelection(editText.length());
                    return;
                }
            default:
                qnf qnfVar3 = (qnf) aooh.q((j$.util.Optional) obj);
                qnv qnvVar = (qnv) this.a;
                qnf qnfVar4 = qnvVar.k;
                java.lang.String str5 = qnfVar4 != null ? qnfVar4.a : null;
                if (qnfVar3 != null) {
                    str = qnfVar3.a;
                    qnfVar = qnfVar3;
                } else {
                    str = null;
                    qnfVar = null;
                }
                if (!aooh.n(str5, str) && qnfVar != null && (str2 = qnfVar.a) != null) {
                    j$.util.Optional optionalV = qnvVar.p.V(str2);
                    aooh.e(optionalV, "forCallId(...)");
                    qnd qndVar = (qnd) aooh.q(optionalV);
                    if (qndVar != null) {
                        qndVar.n.n.h();
                    }
                }
                qnf qnfVar5 = qnvVar.k;
                android.graphics.SurfaceTexture surfaceTexture2 = (qnfVar5 == null || (puxVar = qnfVar5.e) == null) ? null : puxVar.a;
                if (qnfVar3 != null) {
                    pux puxVar2 = qnfVar3.e;
                    surfaceTexture = puxVar2 != null ? puxVar2.a : null;
                    qnfVar2 = qnfVar3;
                } else {
                    qnfVar2 = null;
                }
                if (!aooh.n(surfaceTexture, surfaceTexture2)) {
                    android.view.TextureView textureViewA = qnvVar.a();
                    android.view.ViewParent parent = textureViewA.getParent();
                    aooh.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) parent;
                    frameLayout.removeView(textureViewA);
                    if (surfaceTexture != null) {
                        if (da$.ExternalSyntheticApiModelOutline1.m(surfaceTexture)) {
                            qnv.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "replaceSurfaceTexture", 665, "VideoAnswerFragmentPeer.kt").v("surface texture is released");
                        } else {
                            textureViewA.setSurfaceTexture(surfaceTexture);
                        }
                    }
                    frameLayout.addView(textureViewA, 0);
                }
                if (qnfVar2 == null || qnfVar2.d) {
                    qnvVar.b().setVisibility(0);
                    qnvVar.c().setVisibility(8);
                } else {
                    qnvVar.b().setVisibility(8);
                    qnvVar.c().setVisibility(0);
                }
                qnvVar.k = qnfVar3;
                qnvVar.g();
                com.google.android.material.chip.Chip chipF = qnvVar.f();
                qnf qnfVar6 = qnvVar.k;
                chipF.setVisibility((qnfVar6 == null || !qnfVar6.g) ? 8 : 0);
                com.google.android.material.chip.Chip chipE = qnvVar.e();
                qnf qnfVar7 = qnvVar.k;
                chipE.setVisibility((qnfVar7 == null || qnfVar7.i) ? 0 : 8);
                qnvVar.i();
                qnf qnfVar8 = qnvVar.k;
                if (qnfVar8 == null || !qnfVar8.c) {
                    qnr qnrVar = qnvVar.b;
                    qnrVar.N().setBackgroundColor(urg.c(qnrVar.H(), 2130968922));
                } else {
                    qnvVar.b.N().setBackgroundResource(2131230907);
                }
                android.view.View viewFindViewById4 = qnvVar.b.N().findViewById(2131428749);
                qnf qnfVar9 = qnvVar.k;
                if (qnfVar9 != null && qnfVar9.h) {
                    i = 0;
                }
                viewFindViewById4.setVisibility(i);
                qnd qndVarD = qnvVar.d();
                if (qndVarD != null) {
                    qndVarD.k.set(true);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.odm
    public final void b(java.lang.Throwable th) throws java.lang.Throwable {
        switch (this.$cid) {
            case 0:
                defpackage.iyi.a.c().k(th).l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 201, "BeeslyGreetingSettingsFragmentPeer.kt").v("[Beesly] subscriptionCallbacks onDataLoadError");
                return;
            case 1:
                defpackage.ifg.a.c().k(th).l("com/android/dialer/audioplayback/impl/ui/AudioDeviceSelectorDialogFragmentPeer$audioDeviceEntrySubscriptionCallbacks$<anonymous>", "onDataLoadError", 80, "AudioDeviceSelectorDialogFragmentPeer.kt").v("failed producing audio device selector model.");
                return;
            case 2:
                a.by(defpackage.jrw.a.d(), "couldn't load CallerIdAndSpamSettingsModel.", "com/android/dialer/callerid/settings/impl/CallerIdSettingsFragmentPeer$2", "onDataLoadError", (char) 151, "CallerIdSettingsFragmentPeer.java", th);
                return;
            case 3:
                defpackage.ltp.a.c().k(th).l("com/android/dialer/contactchecker/receiver/impl/ui/ContactCheckerAlertCenterFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 65, "ContactCheckerAlertCenterFragmentPeer.kt").v("failed to load verificationModel");
                return;
            case 4:
                defpackage.mmq.a.c().k(th).l("com/android/dialer/display/settings/impl/DisplayOptionsSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 71, "DisplayOptionsSettingsFragmentPeer.kt").v("subscriptionCallbacks onDataLoadError");
                return;
            case 5:
                defpackage.nvl.a.c().k(th).l("com/android/dialer/dobby/impl/wear/bam/ui/BamCenterFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 84, "BamCenterFragmentPeer.kt").v("failed to load BamCenterFragmentModel");
                return;
            case 6:
                throw th;
            case 7:
                return;
            case 8:
                throw th;
            case 9:
                a.by(osx.a.c(), "Failed to load AccountSelectorDialogContainerModel", "com/android/dialer/incall/accountselectordialog/ui/AccountSelectorDialogContainerFragmentPeer$1", "onDataLoadError", 'V', "AccountSelectorDialogContainerFragmentPeer.java", th);
                return;
            case 10:
                a.bq(ovk.a.c(), "failed to load CallerTagModel", "com/android/dialer/incall/answer/callertag/ui/CallerTagCenterFragmentPeer$1", "onDataLoadError", '5', "CallerTagCenterFragmentPeer.java", th, zct.b);
                return;
            case 11:
                oxi.a.c().k(th).l("com/android/dialer/incall/answer/method/settings/ui/AnswerMethodSettingsFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 93, "AnswerMethodSettingsFragmentPeer.kt").v("Error loading data!");
                android.os.Bundle bundle = ((aw) ((oxi) this.a).c).m;
                if (bundle == null) {
                    throw th;
                }
                bundle.remove("extra_settings_launch_config");
                throw th;
            case 12:
                a.bq(oyc.a.c(), "failed to load AnswerMethodModel at FlingUpDownAnswerMethodFragmentPeer", "com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer$1", "onDataLoadError", (char) 232, "FlingUpDownAnswerMethodFragmentPeer.java", th, zct.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                oyp.a.c().k(th).l("com/android/dialer/incall/answer/method/ui/TwoButtonAnswerLargeScreenMethodFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 122, "TwoButtonAnswerLargeScreenMethodFragmentPeer.kt").v("failed to load AnswerMethodModel at TwoButtonAnswerLargeScreenMethodFragmentPeer");
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                a.bq(oyu.a.c(), "failed to load AnswerMethodModel at TwoButtonAnswerMethodFragmentPeer", "com/android/dialer/incall/answer/method/ui/TwoButtonAnswerMethodFragmentPeer$1", "onDataLoadError", 'g', "TwoButtonAnswerMethodFragmentPeer.java", th, zct.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ozk.a.c().k(th).l("com/android/dialer/incall/answer/method/ui/horizontalswipe/impl/HorizontalSwipeAnswerMethodFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 114, "HorizontalSwipeAnswerMethodFragmentPeer.kt").v("failed to load AnswerMethodModel");
                return;
            case 16:
                pdd.a.c().k(th).m(aioa.b).l("com/android/dialer/incall/audioroute/ui/TidePodsAudioRouteSelectorDialogFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 102, "TidePodsAudioRouteSelectorDialogFragmentPeer.kt").v("failed producing audio route selector model.");
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                pdq.a.d().k(th).l("com/android/dialer/incall/avatar/ui/AvatarFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 74, "AvatarFragmentPeer.kt").v("failed loading AvatarUiModel");
                ((pdq) this.a).b.aE();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                a.bq(pmh.a.c(), "Failed to fetch CallTransferDialogModel.", "com/android/dialer/incall/calltransfer/impl/ui/CallTransferDialogFragmentPeer$1", "onDataLoadError", 'J', "CallTransferDialogFragmentPeer.java", th, zct.b);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                a.bq(pyu.a.c(), "Error producing in-call dialpad's UI model", "com/android/dialer/incall/dialpad/ui/TidePodsDialpadFragmentPeer$1", "onDataLoadError", (char) 147, "TidePodsDialpadFragmentPeer.java", th, zct.b);
                return;
            default:
                qnv.a.c().i(zct.b).k(th).l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 142, "VideoAnswerFragmentPeer.kt").v("failed to load VideoModel at VideoAnswerFragmentPeer");
                return;
        }
    }

    public iyh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public iyh(osx osxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(osxVar);
        this.a = osxVar;
    }

    public iyh(ovk ovkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ovkVar);
        this.a = ovkVar;
    }

    public iyh(oyc oycVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(oycVar);
        this.a = oycVar;
    }

    public iyh(oyu oyuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(oyuVar);
        this.a = oyuVar;
    }

    public iyh(pmh pmhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(pmhVar);
        this.a = pmhVar;
    }

    public iyh(pyu pyuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(pyuVar);
        this.a = pyuVar;
    }
}
