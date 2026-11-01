package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class onw implements defpackage.sqn {
    public final defpackage.ajct e;
    public final defpackage.ruc f;
    public final defpackage.kaw g;
    public final defpackage.ahbv h;
    private final android.content.Context j;
    private final defpackage.ojo k;
    private final defpackage.okj l;
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/fixeddialingnumber/impl/phonelookup/FixedDialingNumberPhoneLookupContributor");
    private static final java.lang.String[] i = {"name", "number"};
    static final defpackage.aenj b = new defpackage.aenj("FixedDialingNumberPhoneLookupContributor.lookup");
    static final defpackage.aenj c = new defpackage.aenj("FixedDialingNumberPhoneLookupContributor.getMostRecentInfo");
    static final defpackage.aenj d = new defpackage.aenj("FixedDialingNumberPhoneLookupContributor.getOriginalFdnList");

    public onw(android.content.Context context, defpackage.kaw kawVar, defpackage.ajct ajctVar, defpackage.ahbv ahbvVar, defpackage.ojo ojoVar, defpackage.ruc rucVar, defpackage.okj okjVar) {
        this.j = context;
        this.g = kawVar;
        this.e = ajctVar;
        this.h = ahbvVar;
        this.k = ojoVar;
        this.f = rucVar;
        this.l = okjVar;
    }

    private final defpackage.ajcq j() {
        android.content.Context context = this.j;
        defpackage.ruc rucVar = this.f;
        byte[] bArr = null;
        java.lang.String strA = defpackage.rlt.a(context, null);
        rucVar.j(d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        defpackage.okj okjVar = this.l;
        defpackage.mgu mguVar = okjVar.c;
        int iM$1 = fh$.ExternalSyntheticApiModelOutline0.m$1();
        j$.util.Objects.requireNonNull(mguVar);
        int iF = new defpackage.mgi(mguVar, defpackage.mgv.SUBSCRIPTION_MANAGER_GET_DEFAULT_SUBSCRIPTION_ID, java.lang.Integer.valueOf(iM$1), iM$1).f();
        if (iF != -1) {
            arrayList2.add(android.net.Uri.parse(defpackage.a.bj(iF, "content://icc/fdn/subId/")));
        }
        try {
            java.util.List<android.telephony.SubscriptionInfo> listN = okjVar.n();
            if (listN != null) {
                for (android.telephony.SubscriptionInfo subscriptionInfo : listN) {
                    if (subscriptionInfo.getSubscriptionId() != iF) {
                        arrayList2.add(android.net.Uri.parse("content://icc/fdn/subId/" + subscriptionInfo.getSubscriptionId()));
                    }
                }
            }
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e)).l("com/android/dialer/fixeddialingnumber/impl/phonelookup/FixedDialingNumberPhoneLookupContributor", "getContentUriList", (char) 178, "FixedDialingNumberPhoneLookupContributor.java")).v("Read phone state permissions not granted");
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            defpackage.ajbg ajbgVarD = this.k.d((android.net.Uri) it.next(), i, null, null, null);
            defpackage.kwb kwbVar = new defpackage.kwb(5);
            long j = defpackage.ahqx.a;
            arrayList.add(ajbgVarD.c(new defpackage.ahqn(defpackage.ahns.c(false), kwbVar), this.e).h());
        }
        defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j(arrayList)), (byte[]) null);
        defpackage.guy guyVar = new defpackage.guy(arrayList, 7);
        defpackage.ajct ajctVar = this.e;
        defpackage.ajcq ajcqVarO = ahdaVar.o(guyVar, ajctVar);
        k(ajcqVarO, d);
        defpackage.kjs kjsVar = new defpackage.kjs(this, strA, 10, bArr);
        long j2 = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), kjsVar, 1);
        int i2 = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarO, ajaxVar);
        ajcqVarO.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
        return ajalVar;
    }

    private final void k(defpackage.ajcq ajcqVar, defpackage.aenj aenjVar) {
        defpackage.sqh sqhVar = new defpackage.sqh(this, aenjVar, 1);
        long j = defpackage.ahqx.a;
        ajcqVar.c(new defpackage.ajcc(ajcqVar, new defpackage.sqh(defpackage.ahns.c(false), sqhVar, 2)), this.e);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq a(defpackage.aigf aigfVar) {
        defpackage.ruc rucVar = this.f;
        defpackage.aenj aenjVar = c;
        rucVar.j(aenjVar);
        defpackage.ajcq ajcqVarJ = j();
        defpackage.kjs kjsVar = new defpackage.kjs(this, aigfVar, 9, null);
        long j = defpackage.ahqx.a;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarJ, new defpackage.ajax(defpackage.ahns.c(false), kjsVar, 1));
        ajcqVarJ.c(ajalVar, defpackage.aiql.t(this.e, ajalVar));
        k(ajalVar, aenjVar);
        return ajalVar;
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq c(hkd hkdVar) {
        defpackage.ruc rucVar = this.f;
        defpackage.aenj aenjVar = b;
        rucVar.j(aenjVar);
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(j(), new ljp(this, hkdVar, 15, (byte[]) null), this.e);
        k(ajcqVarI, aenjVar);
        return ajcqVarI;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ defpackage.ajcq d(android.content.Context context, android.telecom.Call.Details details, defpackage.ajcq ajcqVar) {
        return sns.f(this, context, details);
    }

    @Override // defpackage.sqn
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }

    @Override // defpackage.sqn
    public final /* synthetic */ java.lang.Object f(spn spnVar) {
        spi spiVar = spnVar.o;
        return spiVar == null ? spi.a : spiVar;
    }

    @Override // defpackage.sqn
    public final java.lang.String g() {
        return "FixedDialingNumberPhoneLookup";
    }

    @Override // defpackage.sqn
    public final /* synthetic */ void h(defpackage.akzx akzxVar, java.lang.Object obj) {
        spi spiVar = (spi) obj;
        akzxVar.u();
        spn spnVar = akzxVar.b;
        spn spnVar2 = spn.a;
        j$.util.Objects.requireNonNull(spiVar);
        spnVar.o = spiVar;
        spnVar.b |= 4096;
    }

    public final defpackage.ajcq i(defpackage.aiii aiiiVar, hkd hkdVar) {
        defpackage.ajcq ajcqVarO = this.g.o(aiiiVar.p(), new ljp(this, hkdVar, 16, (byte[]) null));
        defpackage.ahda ahdaVarAk = defpackage.ahvr.ak(ajcqVarO);
        lly llyVar = new lly(aiiiVar, ajcqVarO, 13);
        defpackage.ajct ajctVar = this.e;
        return defpackage.ahvr.H(ahdaVarAk.o(llyVar, ajctVar), new onp(3), ajctVar);
    }
}
