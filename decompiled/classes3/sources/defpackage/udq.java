package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class udq implements defpackage.qbb {
    public final aoin a;
    public final aoin b;
    public final oko c;
    public final defpackage.zoe d;
    public final zzx e;
    private final ajct f;
    private final ucr g;
    private final defpackage.afpl h;

    public udq(defpackage.afpl afplVar, ajct ajctVar, ucr ucrVar, aoin aoinVar, aoin aoinVar2, zzx zzxVar, defpackage.zoe zoeVar, oko okoVar) {
        this.h = afplVar;
        this.f = ajctVar;
        this.g = ucrVar;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.e = zzxVar;
        this.d = zoeVar;
        this.c = okoVar;
    }

    @Override // defpackage.qbb
    public final ajcq a() {
        ahrv ahrvVarG = ahrv.g(((defpackage.udp) aooc.ar(this.h.Y(), defpackage.udp.class)).q());
        ucr ucrVar = this.g;
        j$.util.Objects.requireNonNull(ucrVar);
        defpackage.udu uduVar = new defpackage.udu(ucrVar, 1);
        ajct ajctVar = this.f;
        return ahrvVarG.i(uduVar, ajctVar).h(new ahyc() { // from class: udo
            public final java.lang.Object apply(java.lang.Object obj) {
                uip uipVar = (uip) obj;
                aift aiftVar = new aift(4);
                j$.util.Optional optionalF = uipVar.k().f();
                defpackage.ubv ubvVar = new defpackage.ubv(aiftVar, 3);
                if (true == optionalF.isPresent()) {
                    java.lang.Object obj2 = optionalF.get();
                    java.lang.Object obj3 = ubvVar.a;
                    udk udkVar = udk.b;
                    udk udkVarB = udk.b(((udm) obj2).f);
                    if (udkVarB == null) {
                        udkVarB = udk.a;
                    }
                    if (udkVar.equals(udkVarB)) {
                        ((aift) obj3).i(defpackage.amot.DIALER_STIR_SHAKER_VERIFIED);
                    }
                }
                if (defpackage.udn.b(uipVar.k().b())) {
                    aiftVar.i(defpackage.amot.GLOBAL_SPAM_LIST);
                }
                j$.util.Optional optionalG = uipVar.k().g();
                defpackage.ubv ubvVar2 = new defpackage.ubv(aiftVar, 4);
                if (true == optionalG.isPresent()) {
                    java.lang.Object obj4 = optionalG.get();
                    java.lang.Object obj5 = ubvVar2.a;
                    udj udjVarB = udj.b(((udm) obj4).d);
                    if (udjVarB == null) {
                        udjVarB = udj.a;
                    }
                    if (udj.c.equals(udjVarB)) {
                        ((aift) obj5).i(defpackage.amot.LOCAL_SPAM_LIST);
                    } else if (udj.b.equals(udjVarB)) {
                        ((aift) obj5).i(defpackage.amot.LOCAL_WHITELIST);
                    }
                }
                defpackage.udq udqVar = this.a;
                if (!udqVar.e.m() && ((java.lang.Boolean) udqVar.a.a()).booleanValue()) {
                    int iIntValue = ((java.lang.Long) udqVar.b.a()).intValue();
                    oko okoVar = udqVar.c;
                    java.lang.String str = (java.lang.String) okoVar.z().orElse((java.lang.Object) null);
                    android.telecom.Call call = (android.telecom.Call) udqVar.d.a;
                    java.lang.String numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(defpackage.ura.c(call), str);
                    java.lang.String numberToE165 = android.telephony.PhoneNumberUtils.formatNumberToE164((java.lang.String) okoVar.i(call.getDetails().getAccountHandle()).v().orElse((java.lang.Object) null), akfg.b(str).eW);
                    if (!android.text.TextUtils.isEmpty(numberToE164) && !android.text.TextUtils.isEmpty(numberToE165)) {
                        int length = numberToE164.length();
                        int length2 = numberToE165.length();
                        if (length2 == length && length2 >= iIntValue) {
                            int i = length2 - iIntValue;
                            if (numberToE165.substring(0, i).equals(numberToE164.substring(0, i))) {
                                aiftVar.i(defpackage.amot.SAME_PREFIX);
                            }
                        }
                    }
                }
                j$.util.Optional optionalD = uipVar.k().d();
                defpackage.ubv ubvVar3 = new defpackage.ubv(aiftVar, 5);
                if (true == optionalD.isPresent()) {
                    java.lang.Object obj6 = optionalD.get();
                    java.lang.Object obj7 = ubvVar3.a;
                    udj udjVar = udj.c;
                    udj udjVarB2 = udj.b(((udm) obj6).d);
                    if (udjVarB2 == null) {
                        udjVarB2 = udj.a;
                    }
                    if (udjVar.equals(udjVarB2)) {
                        ((aift) obj7).i(defpackage.amot.PATRONUS_SPAM);
                    }
                }
                j$.util.Optional optionalA = uipVar.k().a();
                defpackage.ubv ubvVar4 = new defpackage.ubv(aiftVar, 6);
                if (true == optionalA.isPresent()) {
                    java.lang.Object obj8 = optionalA.get();
                    java.lang.Object obj9 = ubvVar4.a;
                    udm udmVar = (udm) obj8;
                    udj udjVar2 = udj.c;
                    udj udjVarB3 = udj.b(udmVar.d);
                    if (udjVarB3 == null) {
                        udjVarB3 = udj.a;
                    }
                    if (udjVar2.equals(udjVarB3)) {
                        ((aift) obj9).i(defpackage.amot.GCORE_SPAM);
                    }
                    int iAN = a.aN(udmVar.e);
                    if (iAN != 0 && iAN == 3) {
                        ((aift) obj9).i(defpackage.amot.GCORE_SPOOF);
                    }
                    udk udkVar2 = udk.c;
                    udk udkVarB2 = udk.b(udmVar.f);
                    if (udkVarB2 == null) {
                        udkVarB2 = udk.a;
                    }
                    if (udkVar2.equals(udkVarB2)) {
                        ((aift) obj9).i(defpackage.amot.GCORE_STIR_SHAKEN_FAILED);
                    }
                }
                return aiftVar.h();
            }
        }, ajctVar);
    }

    @Override // defpackage.qbb
    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        aify aifyVar = (aify) obj;
        akzxVar.u();
        amow amowVar = akzxVar.b;
        amow amowVar2 = amow.a;
        alak alakVar = amowVar.m;
        if (!alakVar.c()) {
            amowVar.m = alad.H(alakVar);
        }
        java.util.Iterator it = aifyVar.iterator();
        while (it.hasNext()) {
            amowVar.m.g(((defpackage.amot) it.next()).k);
        }
    }
}
