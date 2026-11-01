package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class skx implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ skx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v28, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(java.lang.Object obj) {
        cxi cxiVarDn;
        java.lang.String upperCase = null;
        switch (this.$cid) {
            case 0:
                java.lang.Float f = (java.lang.Float) obj;
                f.floatValue();
                ((defpackage.sle) this.a).K.n(null, null, f);
                return aojh.a;
            case 1:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                ((defpackage.sle) this.a).K.n(null, num, null);
                return aojh.a;
            case 2:
                cpn cpnVar = (cpn) obj;
                aooh.f(cpnVar, "it");
                aooh.f(cpnVar, "rect");
                final long jD = cpnVar.d();
                final long jK = dpy.k(cpnVar.c());
                ((defpackage.sle) this.a).K.z(new aonj() { // from class: ski
                    public final java.lang.Object a(java.lang.Object obj2) {
                        defpackage.skp skpVar = (defpackage.skp) obj2;
                        aooh.f(skpVar, "uiModel");
                        defpackage.rze rzeVarI = snl.i(skpVar.p());
                        defpackage.ryu ryuVarJ = snl.j(rzeVarI.a().p());
                        akzx akzxVarM = defpackage.skm.a.m();
                        aooh.f(akzxVarM, "builder");
                        long j = jD;
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
                        akzxVarM.u();
                        defpackage.skm skmVar = (defpackage.skm) akzxVarM.b;
                        skmVar.b |= 1;
                        skmVar.c = fIntBitsToFloat;
                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
                        akzxVarM.u();
                        defpackage.skm skmVar2 = (defpackage.skm) akzxVarM.b;
                        skmVar2.b |= 2;
                        skmVar2.d = fIntBitsToFloat2;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        defpackage.skm skmVar3 = (defpackage.skm) aladVarP;
                        aooh.f(skmVar3, "value");
                        akzx akzxVar = (akzx) ryuVarJ.a;
                        akzxVar.u();
                        defpackage.skn sknVar = (defpackage.skn) akzxVar.b;
                        j$.util.Objects.requireNonNull(skmVar3);
                        sknVar.c = skmVar3;
                        sknVar.b |= 1;
                        akzxVar.u();
                        defpackage.skn sknVar2 = (defpackage.skn) akzxVar.b;
                        sknVar2.b |= 4;
                        long j2 = jK;
                        sknVar2.e = (int) (4294967295L & j2);
                        akzxVar.u();
                        defpackage.skn sknVar3 = (defpackage.skn) akzxVar.b;
                        sknVar3.b |= 2;
                        sknVar3.d = (int) (j2 >> 32);
                        rzeVarI.d(ryuVarJ.a());
                        return rzeVarI.b();
                    }
                });
                return aojh.a;
            case 3:
                defpackage.smr smrVar = (defpackage.smr) obj;
                aooh.f(smrVar, "it");
                ((defpackage.sle) this.a).K.z(new cos(smrVar.a, 5));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.j(diqVar, (java.lang.String) this.a);
                dfb.o(diqVar, 0);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj2 = this.a;
                java.util.List list = defpackage.sme.a;
                return a.J((java.lang.String) obj2, (diq) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iFloatValue = (int) ((java.lang.Float) obj).floatValue();
                java.util.List list2 = defpackage.sme.a;
                ((defpackage.smu) this.a).p.a(java.lang.Integer.valueOf(iFloatValue));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aes aesVar = (aes) obj;
                ?? r5 = this.a;
                java.util.List list3 = defpackage.sme.a;
                aooh.f(aesVar, "$this$AnimatedContent");
                int i = ((java.lang.Number) aesVar.b()).intValue() >= ((java.lang.Number) aesVar.c()).intValue() ? -1 : 1;
                cos cosVar = new cos(i, 8);
                aonj aonjVar = aga.a;
                return new afo(aga.c((ajl) r5, new nm(cosVar, 17)), aga.f((ajl) r5, new nm(new cos(i, 9), 18)), (ahu) null, 12);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj3 = this.a;
                java.util.List list4 = defpackage.sme.a;
                return a.J((java.lang.String) obj3, (diq) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.util.List list5 = defpackage.sme.a;
                ((defpackage.smu) this.a).g.a(new defpackage.smt(null));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                cxi cxiVar = (cxi) obj;
                aooh.f(cxiVar, "coordinates");
                cxi cxiVarDn2 = cxiVar.dn();
                if (cxiVarDn2 != null && (cxiVarDn = cxiVarDn2.dn()) != null) {
                    java.lang.Object obj4 = this.a;
                    cpn cpnVarQ = cxiVarDn.q(cxiVar, true);
                    aonj aonjVar2 = ((defpackage.slh) obj4).e;
                    if (aonjVar2 != null) {
                        aonjVar2.a(cpnVarQ);
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                diq diqVar2 = (diq) obj;
                aooh.f(diqVar2, "$this$semantics");
                float f2 = defpackage.smf.a;
                diqVar2.a(defpackage.smf.o, ((android.net.Uri) this.a).toString());
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return a.K((java.lang.String) this.a, (diq) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return a.J((java.lang.String) this.a, (diq) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.abvs abvsVar = (defpackage.abvs) obj;
                int i2 = sod.a;
                aooh.f(abvsVar, "$this$build");
                for (java.util.Map.Entry entry : this.a.entrySet()) {
                    abvsVar.b((java.lang.String) entry.getKey(), ajsz.bZ(((java.util.Map) entry.getValue()).keySet()));
                }
                return aojh.a;
            case 15:
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                return ((sou) this.a).b(phoneAccountHandle.getComponentName().flattenToString(), phoneAccountHandle.getId());
            case 16:
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                aooh.f(phoneAccountHandle2, "handle");
                java.lang.String strT = ((sry) this.a).a.i(phoneAccountHandle2).T();
                if (strT != null) {
                    upperCase = strT.toUpperCase(java.util.Locale.ROOT);
                    aooh.e(upperCase, "toUpperCase(...)");
                }
                return upperCase == null ? "" : upperCase;
            case 17:
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                aooh.f(charSequence, "it");
                java.lang.String string = charSequence.toString();
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.zhj zhjVar = (defpackage.zhj) akzxVar.b;
                defpackage.zhj zhjVar2 = defpackage.zhj.a;
                j$.util.Objects.requireNonNull(string);
                zhjVar.b |= 4;
                zhjVar.e = string;
                return aojh.a;
            case 18:
                amtg amtgVar = (amtg) obj;
                aooh.f(amtgVar, "it");
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                ampv ampvVar = akzxVar2.b;
                ampv ampvVar2 = ampv.a;
                j$.util.Objects.requireNonNull(amtgVar);
                ampvVar.r = amtgVar;
                ampvVar.b |= Integer.MIN_VALUE;
                return aojh.a;
            case 19:
                return a.K((java.lang.String) this.a, (diq) obj);
            default:
                ((cei) this.a).h((int) (((dpp) obj).a & 4294967295L));
                return aojh.a;
        }
    }
}
