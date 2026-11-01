package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class isr implements defpackage.abyf {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/calllogdropdownmenu/BeeslyCallLogViewBinder");
    public final ahey b;
    public final j$.util.Optional c;
    public final rlv d;
    public final iqm e;
    public final aoss f;
    public final defpackage.jid g;
    public final zjm h;
    public final kgl i;
    private final android.content.Context j;
    private final isj k;
    private final aoin l;
    private final defpackage.ksg m;
    private final aoin n;
    private final gpd o;
    private final tkl p;
    private final kaw q;
    private final defpackage.ni r;
    private final rsr s;

    public isr(ahey aheyVar, android.content.Context context, zjm zjmVar, defpackage.ni niVar, j$.util.Optional optional, gpd gpdVar, rlv rlvVar, isj isjVar, aoin aoinVar, iqm iqmVar, defpackage.ksg ksgVar, kaw kawVar, aoss aossVar, defpackage.jid jidVar, kgl kglVar, aoin aoinVar2, tkl tklVar, rsr rsrVar) {
        aooh.f(context, "appContext");
        aooh.f(optional, "transcriptAudioFeedback");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(isjVar, "beeslyCallLogDataIntegration");
        aooh.f(aoinVar, "enableBeeslySmartActions");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(kglVar, "beeslySot");
        this.b = aheyVar;
        this.j = context;
        this.h = zjmVar;
        this.r = niVar;
        this.c = optional;
        this.o = gpdVar;
        this.d = rlvVar;
        this.k = isjVar;
        this.l = aoinVar;
        this.e = iqmVar;
        this.m = ksgVar;
        this.q = kawVar;
        this.f = aossVar;
        this.g = jidVar;
        this.i = kglVar;
        this.n = aoinVar2;
        this.p = tklVar;
        this.s = rsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:59:0x0141  */
    private final defpackage.iss c(defpackage.klb klbVar) {
        java.lang.CharSequence charSequenceB;
        int iAR;
        java.lang.String string;
        defpackage.krp krpVarA;
        rsr rsrVar = this.s;
        kiu kiuVar = klbVar.a;
        mmy mmyVarO = rsrVar.O(kiuVar);
        defpackage.ied iedVarD = null;
        if (!defpackage.hgz.o(mmyVarO)) {
            return null;
        }
        if (defpackage.hgz.o(mmyVarO)) {
            zjm zjmVar = this.h;
            if (zjmVar.g().isEmpty()) {
                charSequenceB = "";
            } else {
                java.lang.String str = mmyVarO.c;
                aooh.e(str, "getTranscriptSnippet(...)");
                if (str.length() == 0) {
                    java.lang.String str2 = mmyVarO.d;
                    aooh.e(str2, "getFallbackSnippet(...)");
                    charSequenceB = d(str2);
                } else if (mmyVarO.e) {
                    j$.util.Optional optionalG = zjmVar.g();
                    aooh.e(optionalG, "getFeature(...)");
                    mnp mnpVar = (mnp) aooh.q(optionalG);
                    if (mnpVar != null) {
                        java.lang.String str3 = mmyVarO.c;
                        aooh.e(str3, "getTranscriptSnippet(...)");
                        charSequenceB = mnpVar.b(str3);
                    } else {
                        charSequenceB = mmyVarO.c;
                        aooh.e(charSequenceB, "getTranscriptSnippet(...)");
                    }
                } else {
                    charSequenceB = mmyVarO.c;
                    aooh.e(charSequenceB, "getTranscriptSnippet(...)");
                }
            }
        } else {
            charSequenceB = "";
        }
        if (charSequenceB.length() == 0 || (iAR = a.aR(mmyVarO.n)) == 0 || iAR != 4) {
            return null;
        }
        int i = kiuVar.q;
        if (i == 1) {
            string = this.j.getString(2132017522);
        } else if (i != 3) {
            string = i != 5 ? null : this.j.getString(2132017521);
        } else {
            string = this.j.getString(2132017523);
        }
        if (string == null) {
            a.d().l("com/android/dialer/beesly/impl/calllogdropdownmenu/BeeslyCallLogViewBinder", "getViewDataforBeeslyV1", 156, "BeeslyCallLogViewBinder.kt").w("Unexpected call type for Beesly: %d", kiuVar.q);
            this.d.o(rmx.wQ);
            return null;
        }
        if (!kiuVar.j) {
            agsm.i(133, this.r.T(kiuVar.d), "Failed to mark Beesly call as read", new java.lang.Object[0]);
        }
        if (kiuVar.M >= 2) {
            java.lang.String str4 = java.lang.String.format(java.util.Locale.getDefault(), "(%d)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(kiuVar.M)}, 1));
            aooh.e(str4, "format(...)");
            string = string.concat(java.lang.String.valueOf(str4));
        }
        isq isqVar = (isq) defpackage.hgt.w(kiuVar, this.k);
        if (isqVar == null) {
            krpVarA = null;
        } else {
            defpackage.kor korVar = isqVar.g;
            if (korVar == null) {
                korVar = defpackage.kor.a;
            }
            if (korVar == null || !((java.lang.Boolean) this.l.a()).booleanValue()) {
                krpVarA = null;
            } else {
                if ((korVar.b == 1 ? (defpackage.kqy) korVar.c : defpackage.kqy.a).c.size() > 0) {
                    krpVarA = this.m.a(korVar);
                } else {
                    krpVarA = null;
                }
            }
        }
        defpackage.ksj ksjVar = new defpackage.ksj(string, 2132017563);
        defpackage.ksm ksmVarN = defpackage.hgz.n(charSequenceB.toString(), null);
        java.lang.String str5 = rsrVar.O(kiuVar).f;
        aooh.e(str5, "getAudioRecordingFilePath(...)");
        if (str5.length() > 0) {
            defpackage.kis kisVar = kiuVar.u;
            if (kisVar == null) {
                kisVar = defpackage.kis.a;
            }
            if (kisVar.d.size() != 0 && this.h.g().isPresent()) {
                defpackage.heq heqVarT = defpackage.hgz.t(defpackage.ied.a.m());
                kaw kawVar = this.q;
                java.lang.String str6 = rsrVar.O(kiuVar).f;
                aooh.e(str6, "getAudioRecordingFilePath(...)");
                java.lang.String string2 = kawVar.v(str6).toString();
                aooh.e(string2, "toString(...)");
                heqVarT.H(string2);
                heqVarT.E(defpackage.iec.DOBBY_AUDIO_UNDER_CALL_LOG);
                defpackage.kis kisVar2 = kiuVar.u;
                if (kisVar2 == null) {
                    kisVar2 = defpackage.kis.a;
                }
                java.lang.Object obj = kisVar2.d.get(0);
                aooh.e(obj, "get(...)");
                heqVarT.G(((java.lang.Number) obj).longValue());
                iedVarD = heqVarT.D();
            }
        }
        ahey aheyVar = this.b;
        defpackage.krx krxVar = new defpackage.krx(ksjVar, ksmVarN, krpVarA, new defpackage.krd(iedVarD, aheyVar));
        vqf vqfVarBy = wsc.by(utu.a.m());
        vqfVarBy.z(kiuVar.e);
        vqfVarBy.C(4);
        java.lang.String strD = defpackage.kon.d(aheyVar, kiuVar);
        aooh.e(strD, "getUniqueCallId(...)");
        vqfVarBy.B(strD);
        abwd abwdVarP = this.o.a(kiuVar, 1).p();
        aooh.e(abwdVarP, "build(...)");
        vqfVarBy.A(abwdVarP);
        vqfVarBy.y(kiuVar.d);
        return new defpackage.iss(krxVar, vqfVarBy.x(), this.p.u(kiuVar));
    }

    private final java.lang.CharSequence d(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(this.b, 2132086244), 0, spannableString.length(), 17);
        return spannableString;
    }

    @Override // defpackage.abyf
    public final /* synthetic */ abya a(java.lang.Object obj) {
        java.lang.CharSequence charSequenceD;
        java.lang.String string;
        defpackage.ksm ksmVarN;
        defpackage.krd krdVar;
        java.lang.String str;
        iqm iqmVar = this.e;
        defpackage.klb klbVar = (defpackage.klb) obj;
        if (!iqmVar.b()) {
            return c(klbVar);
        }
        kiu kiuVar = klbVar.a;
        isj isjVar = this.k;
        if (!defpackage.hgz.aa(kiuVar, isjVar, this.s)) {
            return c(klbVar);
        }
        isq isqVar = (isq) defpackage.hgt.w(kiuVar, isjVar);
        if (isqVar == null) {
            return c(klbVar);
        }
        if (defpackage.hgz.s(isqVar)) {
            java.lang.String string2 = this.j.getString(2132017564);
            aooh.e(string2, "getString(...)");
            charSequenceD = d(string2);
        } else if (defpackage.hgz.r(isqVar)) {
            java.lang.String string3 = this.j.getString(2132017565);
            aooh.e(string3, "getString(...)");
            charSequenceD = d(string3);
        } else {
            charSequenceD = isqVar.e;
            aooh.e(charSequenceD, "getTranscriptText(...)");
        }
        int i = kiuVar.q;
        if (i == 1) {
            string = this.j.getString(2132017522);
        } else if (i != 3) {
            string = i != 5 ? null : this.j.getString(2132017521);
        } else {
            string = this.j.getString(2132017523);
        }
        if (string == null) {
            a.d().l("com/android/dialer/beesly/impl/calllogdropdownmenu/BeeslyCallLogViewBinder", "getViewDataforBeeslyV2", 251, "BeeslyCallLogViewBinder.kt").w("Unexpected call type for Beesly: %d", kiuVar.q);
            this.d.o(rmx.wQ);
            return null;
        }
        if (!kiuVar.j) {
            agsm.i(134, this.r.T(kiuVar.d), "Failed to mark Beesly call as read", new java.lang.Object[0]);
        }
        defpackage.ksj ksjVar = new defpackage.ksj(string, 2132017563);
        if (iqmVar.d()) {
            ksmVarN = new defpackage.ksm("", null);
        } else {
            ksmVarN = defpackage.hgz.n(charSequenceD.toString(), iqmVar.b() ? 5 : null);
        }
        if ((isqVar.b & 8) == 0 || (str = isqVar.f) == null) {
            krdVar = null;
        } else {
            defpackage.heq heqVarT = defpackage.hgz.t(defpackage.ied.a.m());
            java.lang.String string4 = this.q.v(str).toString();
            aooh.e(string4, "toString(...)");
            heqVarT.H(string4);
            heqVarT.E(defpackage.iec.BEESLY_AUDIO_UNDER_CALL_LOG);
            defpackage.kis kisVar = kiuVar.u;
            if (kisVar == null) {
                kisVar = defpackage.kis.a;
            }
            java.lang.Object obj2 = kisVar.d.get(0);
            aooh.e(obj2, "get(...)");
            heqVarT.G(((java.lang.Number) obj2).longValue());
            krdVar = new defpackage.krd(heqVarT.D(), this.b);
        }
        defpackage.krx krxVar = new defpackage.krx(ksjVar, ksmVarN, null, krdVar);
        vqf vqfVarBy = wsc.by(utu.a.m());
        vqfVarBy.z(kiuVar.e);
        vqfVarBy.C(4);
        java.lang.String strD = defpackage.kon.d(this.b, kiuVar);
        aooh.e(strD, "getUniqueCallId(...)");
        vqfVarBy.B(strD);
        abwd abwdVarP = this.o.a(kiuVar, 1).p();
        aooh.e(abwdVarP, "build(...)");
        vqfVarBy.A(abwdVarP);
        vqfVarBy.y(kiuVar.d);
        return new defpackage.iss(krxVar, vqfVarBy.x(), this.p.u(kiuVar));
    }

    @Override // defpackage.abyf
    public final /* bridge */ /* synthetic */ void b(android.view.View view, abya abyaVar) {
        defpackage.iss issVar = (defpackage.iss) abyaVar;
        if (issVar != null) {
            android.view.View viewFindViewById = view.findViewById(2131427557);
            aooh.e(viewFindViewById, "findViewById(...)");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewFindViewById;
            int i = 1;
            if (linearLayout.getChildCount() == 0) {
                ahvr.f(view, defpackage.ieh.class, new defpackage.kiz(this, i));
            }
            linearLayout.removeAllViews();
            android.content.Context context = view.getContext();
            aooh.e(context, "getContext(...)");
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
            linearLayout.addView(composeView);
            defpackage.krd krdVar = issVar.a.d;
            android.view.View viewG = null;
            defpackage.ied iedVar = krdVar != null ? krdVar.a : null;
            if (iedVar != null) {
                viewG = defpackage.hgz.g(this.b);
                defpackage.heq heqVarL = defpackage.hhb.l(defpackage.iek.a.m());
                heqVarL.z(iedVar);
                heqVarL.B();
                heqVarL.C();
                heqVarL.A();
                defpackage.hgz.c(viewG, heqVarL.y());
                defpackage.hgz.d(viewG, new defpackage.kja(iedVar, this, 1));
            }
            android.view.View view2 = viewG;
            if (this.e.f() || view2 != null) {
                if (!((java.lang.Boolean) this.n.a()).booleanValue()) {
                    composeView.k(dgi.a);
                }
                composeView.a(new cja(-2091200395, true, new defpackage.bit(issVar, this, view2, view, 6)));
            }
        }
    }
}
