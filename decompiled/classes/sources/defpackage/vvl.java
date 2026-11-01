package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vvl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.aoin d;
    public final defpackage.gat e;
    public final defpackage.rsr f;
    private final defpackage.aoin g;
    private final defpackage.ajct h;
    private final defpackage.rlv i;
    private final defpackage.oko j;
    private final defpackage.vze k;
    private final defpackage.aogc l;

    public vvl(android.content.Context context, defpackage.vze vzeVar, defpackage.aoin aoinVar, defpackage.gat gatVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aogc aogcVar, defpackage.rlv rlvVar, defpackage.oko okoVar, defpackage.rsr rsrVar, defpackage.aoin aoinVar2) {
        this.b = context;
        this.k = vzeVar;
        this.g = aoinVar;
        this.e = gatVar;
        this.c = ajctVar;
        this.h = ajctVar2;
        this.l = aogcVar;
        this.i = rlvVar;
        this.j = okoVar;
        this.f = rsrVar;
        this.d = aoinVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r0.equals("vvm_type_vvm3_mvno") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r0.equals("vvm_type_omtp_1_3") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0.equals("vvm_type_omtp_1_2") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0.equals("vvm_type_vvm3") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r0.equals("vvm_type_test") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r0.equals("vvm_type_rest") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r0.equals("vvm_type_omtp") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r0.equals("vvm_type_cvvm") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0.equals("vvm_type_advvm") != false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(defpackage.vzi r6) {
        /*
            java.lang.String r0 = r6.d
            r1 = 0
            java.lang.String r2 = "canShowTos"
            java.lang.String r3 = "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl"
            java.lang.String r4 = "VoicemailFullscreenPromoDataServiceImpl.java"
            if (r0 == 0) goto L86
            int r5 = r0.hashCode()
            switch(r5) {
                case -1479165891: goto L5c;
                case -1478817107: goto L53;
                case -1478735449: goto L4a;
                case -1478675867: goto L41;
                case -1478600199: goto L38;
                case -654844142: goto L2f;
                case -654844141: goto L26;
                case 545654704: goto L1d;
                case 1388114743: goto L14;
                default: goto L12;
            }
        L12:
            goto L86
        L14:
            java.lang.String r5 = "vvm_type_advvm"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L1d:
            java.lang.String r5 = "vvm_type_vvm3_mvno"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L26:
            java.lang.String r5 = "vvm_type_omtp_1_3"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L2f:
            java.lang.String r5 = "vvm_type_omtp_1_2"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L38:
            java.lang.String r5 = "vvm_type_vvm3"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L41:
            java.lang.String r5 = "vvm_type_test"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L4a:
            java.lang.String r5 = "vvm_type_rest"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L53:
            java.lang.String r5 = "vvm_type_omtp"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
            goto L64
        L5c:
            java.lang.String r5 = "vvm_type_cvvm"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L86
        L64:
            java.lang.String r0 = r6.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L84
            aimz r0 = defpackage.vvl.a
            ainm r0 = r0.b()
            aimw r0 = (defpackage.aimw) r0
            r5 = 476(0x1dc, float:6.67E-43)
            ainm r0 = r0.l(r3, r2, r5, r4)
            aimw r0 = (defpackage.aimw) r0
            java.lang.String r6 = r6.f
            java.lang.String r2 = "invalid phone account for %s"
            r0.y(r2, r6)
            goto L9f
        L84:
            r1 = 1
            goto L9f
        L86:
            aimz r0 = defpackage.vvl.a
            ainm r0 = r0.b()
            aimw r0 = (defpackage.aimw) r0
            r5 = 470(0x1d6, float:6.59E-43)
            ainm r0 = r0.l(r3, r2, r5, r4)
            aimw r0 = (defpackage.aimw) r0
            java.lang.String r2 = r6.d
            java.lang.String r6 = r6.f
            java.lang.String r3 = "unsupported type: %s for %s"
            r0.I(r3, r2, r6)
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvl.n(vzi):boolean");
    }

    public static boolean o(defpackage.vzi vziVar) {
        return "vvm_type_vvm3".equals(vziVar.d);
    }

    public static boolean p() {
        return java.util.Locale.getDefault().getLanguage().equals(java.util.Locale.forLanguageTag("es").getLanguage());
    }

    private final void t(defpackage.ajcq ajcqVar) {
        this.l.t(ajcqVar, new defpackage.agxj("VoicemailFullscreenPromoDataService"));
    }

    public final android.telecom.PhoneAccountHandle a(defpackage.vzi vziVar) {
        return (android.telecom.PhoneAccountHandle) sos.a(vziVar.e, vziVar.f).orElse((java.lang.Object) null);
    }

    public final defpackage.ajcq b(defpackage.vzi vziVar) {
        defpackage.ajcq ajcqVarZ = o(vziVar) ? defpackage.aiql.z(java.lang.Boolean.TRUE) : defpackage.ahvr.F(new defpackage.vms(this, vziVar, 14, null), this.h);
        defpackage.ajcq ajcqVarG = g(vziVar);
        return defpackage.ahvr.ak(ajcqVarZ, ajcqVarG).o(new tbb(ajcqVarZ, vziVar, ajcqVarG, 19, (byte[]) null), this.c);
    }

    public final defpackage.ajcq c(defpackage.vzi vziVar) {
        if (o(vziVar)) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "evaluateTosEligibility", 524, "VoicemailFullscreenPromoDataServiceImpl.java")).y("showing TOS for verizon for %s", vziVar.f);
            return defpackage.aiql.z(java.lang.Boolean.TRUE);
        }
        defpackage.ajcq ajcqVarG = g(vziVar);
        defpackage.ajcq ajcqVarF = defpackage.ahvr.F(new defpackage.vms(this, vziVar, 13, null), this.h);
        return defpackage.ahvr.ak(ajcqVarF, ajcqVarG).o(new tbb(ajcqVarG, ajcqVarF, vziVar, 18), this.c);
    }

    public final defpackage.ajcq d(vtt vttVar) {
        int i = vttVar.b & 2;
        if (i == 0) {
            return defpackage.aiql.z(j$.util.Optional.empty());
        }
        if (i == 0) {
            return defpackage.aiql.z(j$.util.Optional.empty());
        }
        vtq vtqVar = vttVar.d;
        if (vtqVar == null) {
            vtqVar = vtq.a;
        }
        return defpackage.ahrv.g(this.k.b(defpackage.wsc.at(vtqVar))).i(new defpackage.vuu(this, 6), this.c);
    }

    public final defpackage.ajcq e(defpackage.vzi vziVar) {
        return defpackage.ahvr.F(new defpackage.vms(this, vziVar, 15, null), this.h);
    }

    public final defpackage.ajcq f(defpackage.vzi vziVar) {
        android.telecom.PhoneAccountHandle phoneAccountHandleK = defpackage.ttj.k(vziVar);
        return phoneAccountHandleK == null ? defpackage.aiql.z(java.lang.Boolean.FALSE) : defpackage.ahvr.H(((defpackage.ahbv) this.g.a()).f(phoneAccountHandleK), new defpackage.vrx(6), this.c);
    }

    public final defpackage.ajcq g(defpackage.vzi vziVar) {
        return ((defpackage.ahbv) this.g.a()).i(a(vziVar));
    }

    public final defpackage.ajcq h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.E(new rqy(this, phoneAccountHandle, 20), this.h);
    }

    public final defpackage.ajcq i(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str) {
        return defpackage.ahvr.E(new opo(this, phoneAccountHandle, str, 12, (byte[]) null), this.h);
    }

    public final java.lang.String j() {
        return this.b.getString(2132018312);
    }

    public final void k(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str) {
        boolean zEquals = j$.util.Objects.equals(str, "vvm_type_vvm3");
        defpackage.rlv rlvVar = this.i;
        if (zEquals) {
            rlvVar.n(defpackage.rmw.VOICEMAIL_VVM3_TOS_V2_ACCEPTED);
        } else {
            rlvVar.n(defpackage.rmw.VOICEMAIL_DIALER_TOS_ACCEPTED);
        }
        t(defpackage.ahvr.I(this.e.x(this.b, phoneAccountHandle, true), new why(this, phoneAccountHandle, str, 1), this.c));
    }

    public final void l(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str) {
        defpackage.ajcq ajcqVarI = ((defpackage.ahbv) this.g.a()).i(phoneAccountHandle);
        defpackage.vmv vmvVar = new defpackage.vmv(this, phoneAccountHandle, 14);
        defpackage.ajct ajctVar = this.c;
        t(defpackage.ahvr.ak(defpackage.ahvr.I(ajcqVarI, vmvVar, ajctVar), i(phoneAccountHandle, str), h(phoneAccountHandle)).q(new fvl(11), ajctVar));
    }

    public final void m(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str) {
        t(defpackage.ahvr.I(((defpackage.ahbv) this.g.a()).i(phoneAccountHandle), new vjx(this, phoneAccountHandle, str, 20), this.c));
    }

    public final void q(android.text.SpannableString spannableString, java.lang.String str, java.lang.String str2) {
        int iIndexOf;
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str) || (iIndexOf = spannableString.toString().indexOf(str)) == -1) {
            return;
        }
        int length = str.length() + iIndexOf;
        spannableString.setSpan(new android.text.style.URLSpan(str2), iIndexOf, length, 33);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(this.b, 2132085225), iIndexOf, length, 33);
    }

    public final void r(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.i.n(defpackage.rmw.VOICEMAIL_VVM3_TOS_DECLINED);
        defpackage.ajcq ajcqVarL = defpackage.ajcm.a;
        defpackage.aoin aoinVar = this.g;
        defpackage.ahbv ahbvVar = (defpackage.ahbv) aoinVar.a();
        j$.util.Optional.of(phoneAccountHandle);
        if (ahbvVar.k()) {
            ajcqVarL = ((defpackage.ahbv) aoinVar.a()).l(phoneAccountHandle, false);
        } else {
            defpackage.oko okoVar = this.j;
            defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
            okoVar.j.setVisualVoicemailEnabled(phoneAccountHandle, false);
            defpackage.mgv mgvVar = defpackage.mgv.TELEPHONY_SET_VISUAL_VOICEMAIL_ENABLED;
            java.util.List listAY = defpackage.ajsz.aY(defpackage.gus.ax(false));
            android.telecom.PhoneAccountHandle phoneAccountHandle2 = okoVar.i;
            defpackage.zjv.i(okoVar.g, mgvVar, listAY, defpackage.gus.aw(defpackage.aais.aH(phoneAccountHandle2 != null ? phoneAccountHandle2.getId() : null)), 0, 24);
        }
        t(ajcqVarL);
    }

    public final jyn s(defpackage.vzi vziVar) {
        return new jyn(this.b, a(vziVar));
    }
}
