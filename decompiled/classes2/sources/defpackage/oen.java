package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class oen implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ oen(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:137:0x0369  */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Type inference failed for: r0v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object, rlv] */
    public final java.lang.Object a(java.lang.Object obj) throws aois {
        java.lang.CharSequence charSequence;
        int color;
        j$.util.Optional optional;
        int color2;
        android.widget.TextView textViewB;
        java.lang.CharSequence text;
        rmx rmxVar;
        java.lang.CharSequence charSequenceK = null;
        switch (this.$cid) {
            case 0:
                gin ginVarA = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList.add(oer.k(ginVarA));
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case 1:
                return ((oer) this.b).a.c((gjh) obj, (java.util.Collection) this.a);
            case 2:
                gin ginVarA2 = ((gjh) obj).a((java.lang.String) this.a);
                try {
                    ((rsr) this.b).b.a(ginVarA2);
                    if (ginVarA2.m()) {
                        charSequenceK = oer.k(ginVarA2);
                        break;
                    }
                    return charSequenceK;
                } finally {
                    ginVarA2.close();
                }
            case 3:
                return aazc.g((abwx) this.b, (java.lang.String) this.a, (aoln) obj);
            case 4:
                return java.lang.Integer.valueOf(((oer) this.b).b.c((gjh) obj, (java.lang.Iterable) this.a));
            case 5:
                return java.lang.Integer.valueOf(((oer) this.b).c.c((gjh) obj, (java.lang.Iterable) this.a));
            case 6:
                ahkl ahklVar = (ahkl) obj;
                aooh.f(ahklVar, "$this$buildDataStoreConfig");
                ahklVar.b = new ahkk(1, 1);
                if (!((zzx) this.a).m()) {
                    java.lang.Object obj2 = this.b;
                    ahklVar.b(((owx) obj2).c.b(owx.a, new tsa(obj2, 1), iqi.a));
                }
                return aojh.a;
            case 7:
                android.view.View view = (android.view.View) obj;
                aooh.f(view, "view");
                int i = dzs.a;
                int layoutDirection = view.getLayoutDirection();
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                if (layoutDirection == 0) {
                    j$.util.Optional optional2 = ((pnb) obj3).d().e;
                    pmt pmtVar = new pmt(new defpackage.opy(obj4, 17), 20);
                    if (true == optional2.isPresent()) {
                        pmtVar.a.a(optional2.get());
                    }
                } else {
                    j$.util.Optional optional3 = ((pnb) obj3).d().e;
                    pmv pmvVar = new pmv(new defpackage.opy(obj4, 18), 1);
                    if (true == optional3.isPresent()) {
                        pmvVar.a.a(optional3.get());
                    }
                }
                return aojh.a;
            case 8:
                android.widget.Chronometer chronometer = (android.widget.Chronometer) obj;
                aooh.f(chronometer, "chronometer");
                pom pomVar = (pom) this.a;
                java.util.List list = pomVar.o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    pnf pnfVarB = pnf.b(((png) it.next()).e);
                    if (pnfVarB == null) {
                        pnfVarB = pnf.g;
                    }
                    arrayList2.add(pnfVarB);
                }
                java.lang.Object obj5 = this.b;
                java.util.Set setCf = ajsz.cf(arrayList2);
                java.lang.String str = pomVar.a;
                pnb pnbVar = (pnb) obj5;
                if (!aooh.n(setCf, pnbVar.i)) {
                    pmy pmyVarC = pnbVar.c(str);
                    if (pmyVarC == null) {
                        pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "triggerOnIndicatorUpdatedListeners", 813, "ContactGridSubscriber.kt").v("No call scope when indicator is updated");
                        pnbVar.i = setCf;
                    } else {
                        java.util.Set set = pnbVar.i;
                        java.util.Set setAH = ajsz.aH(set, setCf);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator it2 = setAH.iterator();
                        while (it2.hasNext()) {
                            ppq ppqVar = (ppq) wsc.D(pmyVarC.kT(), (pnf) it2.next());
                            if (ppqVar != null) {
                                arrayList3.add(ppqVar);
                            }
                        }
                        java.util.Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            pnbVar.m.aG(chronometer, new defpackage.lye((ppq) it3.next(), 19), new defpackage.lge(obj5, str, 17));
                        }
                        pnbVar.i = setCf;
                        java.util.Set setAH2 = ajsz.aH(setCf, set);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it4 = setAH2.iterator();
                        while (it4.hasNext()) {
                            ppr pprVar = (ppr) wsc.D(pmyVarC.kU(), (pnf) it4.next());
                            if (pprVar != null) {
                                arrayList4.add(pprVar);
                            }
                        }
                        java.util.Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            pnbVar.m.aG(chronometer, new defpackage.lye((ppr) it5.next(), 20), new defpackage.lge(obj5, str, 18));
                        }
                    }
                }
                return aojh.a;
            case 9:
                com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) obj;
                aooh.f(chip, "it");
                pom pomVar2 = (pom) this.a;
                ((pnb) this.b).h(pomVar2.a, qbc.hf, (pmz) null, true);
                chip.setVisibility(0);
                java.lang.CharSequence charSequence2 = pomVar2.f.b;
                if (charSequence2 != null) {
                    chip.setText(charSequence2);
                    aooh.f(chip, "progressText");
                    android.content.Context context = chip.getContext();
                    aooh.e(context, "getContext(...)");
                    android.graphics.drawable.Drawable drawable = context.getDrawable(2131231150);
                    aooh.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
                    android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) drawable;
                    animatedVectorDrawable.setBounds(0, 0, animatedVectorDrawable.getIntrinsicWidth(), animatedVectorDrawable.getIntrinsicHeight());
                    java.util.Objects.toString(charSequence2);
                    java.lang.String strConcat = charSequence2.toString().concat(" ");
                    android.text.SpannableString spannableString = new android.text.SpannableString(strConcat);
                    spannableString.setSpan(new android.text.style.ImageSpan(animatedVectorDrawable, 1), strConcat.length() - 1, strConcat.length(), 17);
                    chip.setText(spannableString);
                    animatedVectorDrawable.start();
                    if (!aooh.n(android.os.Build.FINGERPRINT, "robolectric")) {
                        animatedVectorDrawable.registerAnimationCallback(new defpackage.hrt(chip, spannableString, animatedVectorDrawable));
                    }
                }
                return aojh.a;
            case 10:
                android.widget.TextView textView = (android.widget.TextView) obj;
                aooh.f(textView, "bottomRowTextView");
                java.lang.Object obj6 = this.a;
                pom pomVar3 = (pom) obj6;
                pog pogVar = pomVar3.f;
                java.lang.CharSequence charSequence3 = pogVar.a;
                charSequence = charSequence3 != null ? charSequence3 : "";
                java.lang.Object obj7 = this.b;
                pnb pnbVar2 = (pnb) obj7;
                java.util.Set set2 = pnbVar2.h;
                pmz pmzVar = pmz.e;
                if (!set2.contains(pmzVar)) {
                    pnbVar2.h(pomVar3.a, qbc.fE, pmzVar, false);
                }
                if (aooh.n(charSequence.toString(), pnbVar2.b.getString(2132019028))) {
                    pnbVar2.m.aF(textView, new defpackage.lge(obj7, obj6, 19));
                }
                if (pnbVar2.g && pnb.o(pomVar3.l)) {
                    textView.setText(pomVar3.n);
                } else if (!aooh.n(textView.getText(), charSequence)) {
                    textView.setText(charSequence);
                }
                textView.setVisibility(0);
                int i2 = 9;
                if (pogVar.b != null) {
                    pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "updateEmergencyDialingConnectivityStateLabel", 677, "ContactGridSubscriber.kt").v("Showing dialing connectivity state label");
                    j$.util.Optional optional4 = pnbVar2.d().l;
                    oys oysVar = new oys(new defpackage.oou(8), 17);
                    if (true == optional4.isPresent()) {
                        oysVar.a.a(optional4.get());
                    }
                    j$.util.Optional optional5 = pnbVar2.d().m;
                    oys oysVar2 = new oys(new defpackage.oen(obj7, obj6, i2), 18);
                    if (true == optional5.isPresent()) {
                        oysVar2.a.a(optional5.get());
                    }
                } else {
                    pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "updateEmergencyDialingConnectivityStateLabel", 693, "ContactGridSubscriber.kt").v("Hiding dialing connectivity state label");
                    j$.util.Optional optional6 = pnbVar2.d().l;
                    oys oysVar3 = new oys(new defpackage.oou(9), 19);
                    if (true == optional6.isPresent()) {
                        oysVar3.a.a(optional6.get());
                    }
                    j$.util.Optional optional7 = pnbVar2.d().m;
                    oys oysVar4 = new oys(new defpackage.oou(10), 20);
                    if (true == optional7.isPresent()) {
                        oysVar4.a.a(optional7.get());
                    }
                }
                return aojh.a;
            case 11:
                android.widget.Chronometer chronometer2 = (android.widget.Chronometer) obj;
                aooh.f(chronometer2, "chronometerView");
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                ((pnb) obj8).m.aG(chronometer2, new defpackage.lge(obj8, obj9, 20), new pmw(obj8, obj9, 1, (byte[]) null));
                chronometer2.setBase((((pom) obj9).f.g - j$.time.Instant.now().toEpochMilli()) + android.os.SystemClock.elapsedRealtime());
                pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "updateBottomRow$<anonymous>", 640, "ContactGridSubscriber.kt").x("starting chronometer with base: %d", chronometer2.getBase());
                chronometer2.start();
                return aojh.a;
            case 12:
                aooh.f((apqr) obj, "it");
                pnb pnbVar3 = (pnb) this.b;
                pnbVar3.h.add(pmz.g);
                java.lang.String str2 = (java.lang.String) this.a;
                pnbVar3.f(mce.aE, str2);
                pnbVar3.h(str2, qbc.fB, (pmz) null, false);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.widget.TextView textView2 = (android.widget.TextView) obj;
                aooh.f(textView2, "it");
                java.lang.String str3 = ((pom) this.a).j.a;
                charSequence = str3 != null ? str3 : "";
                java.lang.Object obj10 = this.b;
                textView2.setText(charSequence);
                ((pnb) obj10).i();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.widget.TextView textView3 = (android.widget.TextView) obj;
                aooh.f(textView3, "middleRowTextView");
                pom pomVar4 = (pom) this.a;
                java.lang.CharSequence charSequence4 = pomVar4.e.a;
                java.lang.Object obj11 = this.b;
                if (charSequence4 != null) {
                    if (!aooh.n(textView3.getText(), charSequence4)) {
                        textView3.setText(charSequence4);
                    }
                    textView3.setSelected(true);
                    pnb pnbVar4 = (pnb) obj11;
                    java.util.Set set3 = pnbVar4.h;
                    pmz pmzVar2 = pmz.d;
                    if (!set3.contains(pmzVar2)) {
                        pnbVar4.h(pomVar4.a, qbc.fA, pmzVar2, false);
                    }
                    ahoq ahoqVarW = ahvr.W(490, "ContactGridSubscriber_attemptEmittingFirstContactDisplayedEvent");
                    try {
                        pnd pndVar = ((pnb) obj11).e;
                        android.widget.TextView textView4 = (pndVar == null || (optional = pndVar.c) == null) ? null : (android.widget.TextView) aooh.q(optional);
                        if (textView4 == null) {
                            pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "attemptEmittingFirstContactDisplayedEvent$<anonymous>", 430, "ContactGridSubscriber.kt").v("No middle row view or info to show");
                        } else {
                            java.lang.CharSequence text2 = textView4.getText();
                            if (text2 == null || text2.length() == 0) {
                                pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "attemptEmittingFirstContactDisplayedEvent$<anonymous>", 436, "ContactGridSubscriber.kt").v("No middle row text to show");
                            } else {
                                java.lang.Long l = ((pnb) obj11).j;
                                if (l != null) {
                                    l.longValue();
                                }
                                pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "attemptEmittingFirstContactDisplayedEvent$<anonymous>", 446, "ContactGridSubscriber.kt").v("Waiting middle row to draw to log the information was shown");
                                ((pnb) obj11).m.aG(textView4, new pmx(obj11, 1), new pmx(obj11, 0));
                            }
                        }
                        ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    } catch (java.lang.Throwable th2) {
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            ajsz.ak(ahoqVarW, th2);
                            throw th3;
                        }
                    }
                }
                poh pohVar = pomVar4.i;
                if (pohVar != poh.c) {
                    android.content.Context context2 = textView3.getContext();
                    aooh.e(context2, "getContext(...)");
                    if (((pnb) obj11).m(pohVar, context2)) {
                        color = textView3.getContext().getColor(2131099860);
                    } else {
                        color = urg.c(textView3.getContext(), android.R.attr.textColorPrimary);
                    }
                } else {
                    color = textView3.getContext().getColor(2131099860);
                }
                textView3.setTextColor(color);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.widget.TextView textView5 = (android.widget.TextView) obj;
                aooh.f(textView5, "topRowTextView");
                java.lang.Object obj12 = this.a;
                pom pomVar5 = (pom) obj12;
                java.lang.CharSequence charSequence5 = pomVar5.d.a;
                if (charSequence5 == null) {
                    pnb.a.b().l("com/android/dialer/incall/contactgrid/ContactGridSubscriber", "updateTopRow$<anonymous>", 320, "ContactGridSubscriber.kt").v("No top row label to show. Making it invisible");
                    textView5.setVisibility(4);
                    textView5.setText((java.lang.CharSequence) null);
                } else {
                    java.lang.Object obj13 = this.b;
                    textView5.setText(charSequence5);
                    textView5.setVisibility(0);
                    textView5.setSingleLine(true);
                    textView5.setSelected(true);
                    poh pohVar2 = pomVar5.i;
                    poh pohVar3 = poh.c;
                    if (pohVar2 != pohVar3) {
                        android.content.Context context3 = textView5.getContext();
                        aooh.e(context3, "getContext(...)");
                        if (((pnb) obj13).m(pohVar2, context3)) {
                            color2 = textView5.getContext().getColor(2131099860);
                        } else {
                            color2 = urg.c(textView5.getContext(), android.R.attr.textColorPrimary);
                        }
                    } else {
                        color2 = textView5.getContext().getColor(2131099860);
                    }
                    textView5.setTextColor(color2);
                    if (pohVar2 == pohVar3) {
                        java.lang.CharSequence text3 = textView5.getText();
                        aooh.e(text3, "getText(...)");
                        android.text.SpannableString spannableString2 = new android.text.SpannableString(text3);
                        java.lang.Object[] spans = spannableString2.getSpans(0, spannableString2.length(), android.text.style.ForegroundColorSpan.class);
                        aooh.e(spans, "getSpans(...)");
                        for (android.text.style.ForegroundColorSpan foregroundColorSpan : (android.text.style.ForegroundColorSpan[]) spans) {
                            spannableString2.removeSpan(foregroundColorSpan);
                        }
                        textView5.setText(spannableString2);
                    }
                    pnb pnbVar5 = (pnb) obj13;
                    java.util.Set set4 = pnbVar5.h;
                    pmz pmzVar3 = pmz.c;
                    if (!set4.contains(pmzVar3)) {
                        pnbVar5.h(pomVar5.a, qbc.fD, pmzVar3, false);
                    }
                    if (!set4.contains(pmz.a) && (textViewB = pnbVar5.b()) != null && (text = textViewB.getText()) != null) {
                        text.length();
                    }
                    pmz pmzVar4 = pmz.f;
                    if (!set4.contains(pmzVar4)) {
                        android.widget.TextView textViewB2 = pnbVar5.b();
                        charSequenceK = textViewB2 != null ? textViewB2.getText() : null;
                        if (charSequenceK != null && charSequenceK.length() != 0) {
                            set4.add(pmzVar4);
                            java.lang.String str4 = pomVar5.a;
                            pnbVar5.f(mce.D, str4);
                            pnbVar5.k.e(str4).ifPresentOrElse(new oxs(new defpackage.mkm(obj13, obj12, str4, 5), 3), new pmw(charSequenceK, obj13, 0));
                        }
                    }
                }
                return aojh.a;
            case 16:
                qug qugVar = (qug) obj;
                aooh.f(qugVar, "voiceButtonKey");
                aooh.e(((qxo) this.b).e, "getCallId(...)");
                pez.bW(qugVar, new qzj(this.a, 1));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                qtr qtrVar = (qtr) obj;
                aooh.f(qtrVar, "bottomSheetFragmentKey");
                java.lang.String str5 = ((qyr) this.b).c;
                aooh.e(str5, "getCallId(...)");
                java.lang.Object obj14 = this.a;
                ahok ahokVarF = ((qyv) obj14).e.f(676, "CuldesacFragmentPeer_onCategoryButtonClicked");
                try {
                    qym qymVarA = ((qyv) obj14).a(str5);
                    if (qymVarA != null) {
                        aooh.f(qtrVar, "bottomSheetFragmentKey");
                        ahoq ahoqVarW2 = ahvr.W(674, "CuldesacController_onCategoryButtonClicked");
                        try {
                            qym.a.b().l("com/android/dialer/incall/voice/culdesac/service/CuldesacController", "onCategoryButtonClicked$<anonymous>", 51, "CuldesacController.kt").y("bottomSheetFragmentKey: %s", qtrVar);
                            int iOrdinal = qtrVar.ordinal();
                            if (iOrdinal == 1) {
                                qymVarA.c.b(mce.gQ);
                            } else if (iOrdinal == 4) {
                                qymVarA.c.b(mce.gN);
                            }
                            int iOrdinal2 = qtrVar.ordinal();
                            if (iOrdinal2 == 1) {
                                qymVarA.g.a(qbc.mg);
                            } else if (iOrdinal2 == 4) {
                                qymVarA.g.a(qbc.mf);
                            }
                            qymVarA.f.c(qtrVar);
                            ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th4) {
                            try {
                                throw th4;
                            } catch (java.lang.Throwable th5) {
                                ajsz.ak(ahoqVarW2, th4);
                                throw th5;
                            }
                        }
                    }
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        ajsz.ak(ahokVarF, th6);
                        throw th7;
                    }
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Long l2 = (java.lang.Long) obj;
                aooh.f(l2, "outgoingCallRequestId");
                java.lang.Object obj15 = this.a;
                rdk rdkVar = (rdk) obj15;
                rdkVar.O.aF(rdkVar.c.N(), new defpackage.opo(obj15, l2, this.b, 3));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                rth rthVar = (rth) obj;
                aooh.f(rthVar, "loadResult");
                int iAf = anty.af(rthVar.b);
                if (iAf == 0) {
                    rmxVar = rmx.sa;
                } else if (iAf == 1) {
                    rmxVar = rmx.sb;
                } else if (iAf == 2) {
                    rmxVar = rmx.sc;
                } else if (iAf == 3) {
                    rmxVar = rmx.sd;
                } else {
                    if (iAf != 4) {
                        throw new aois();
                    }
                    rmxVar = rmx.se;
                }
                java.lang.Object obj16 = this.a;
                java.lang.Object obj17 = this.b;
                rsq rsqVar = (rsq) obj16;
                rsqVar.a.a.o(rmxVar);
                rrz rrzVar = rthVar.a;
                rrzVar.g();
                rsqVar.d.aF((android.view.View) obj17, new qsu(obj16, 16));
                if (((java.lang.Boolean) rsqVar.c.a()).booleanValue()) {
                    rsqVar.b.b(rrzVar.b());
                }
                return aojh.a;
            default:
                java.lang.Throwable th8 = (java.lang.Throwable) obj;
                aooh.f(th8, "it");
                saa.f(th8);
                java.lang.Object obj18 = this.a;
                if (obj18 != null) {
                    ((saa) this.b).e((aeun) obj18, rub.c);
                }
                return aojh.a;
        }
    }

    public /* synthetic */ oen(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
