package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mli {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer");
    public final ajwr A;
    public final ahbv B;
    public final aais C;
    public final ipc D;
    private final aoin E;
    private final aogc F;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean f;
    public final defpackage.mla g;
    public final defpackage.mlm h;
    public final defpackage.mkw i;
    public final defpackage.mlp j;
    public final defpackage.mkt k;
    public final defpackage.mjm l;
    public final defpackage.mji m;
    public final defpackage.mjk n;
    public final agtj o;
    public final aoin p;
    public final rlv q;
    public final defpackage.mkj r;
    public final defpackage.ahhb s;
    public defpackage.mjr u;
    public final zpm y;
    public final gpd z;
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional t = j$.util.Optional.empty();
    public final agye v = new defpackage.mle(this);
    public final agtk w = new defpackage.mlf(this);
    public final agtk x = new defpackage.mlg(this);

    public mli(aoin aoinVar, defpackage.mla mlaVar, defpackage.mlm mlmVar, defpackage.mkw mkwVar, defpackage.mlp mlpVar, defpackage.mkt mktVar, defpackage.mjm mjmVar, defpackage.mji mjiVar, defpackage.mjk mjkVar, ajwr ajwrVar, agtj agtjVar, gpd gpdVar, aogc aogcVar, zpm zpmVar, ahbv ahbvVar, aoin aoinVar2, aais aaisVar, rlv rlvVar, ipc ipcVar, defpackage.mkj mkjVar, defpackage.ahhb ahhbVar) {
        this.E = aoinVar;
        this.g = mlaVar;
        this.h = mlmVar;
        this.i = mkwVar;
        this.j = mlpVar;
        this.k = mktVar;
        this.l = mjmVar;
        this.m = mjiVar;
        this.n = mjkVar;
        this.A = ajwrVar;
        this.o = agtjVar;
        this.z = gpdVar;
        this.F = aogcVar;
        this.y = zpmVar;
        this.B = ahbvVar;
        this.p = aoinVar2;
        this.C = aaisVar;
        this.q = rlvVar;
        this.D = ipcVar;
        this.r = mkjVar;
        this.s = ahhbVar;
    }

    public final void a() {
        defpackage.mlm mlmVar = this.h;
        mlmVar.c(2);
        mlmVar.e("");
        mlmVar.c(0);
    }

    /* JADX WARN: Code duplicated, block: B:229:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x021d  */
    /* JADX WARN: Code duplicated, block: B:53:0x022c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0230  */
    /* JADX WARN: Code duplicated, block: B:57:0x0254  */
    /* JADX WARN: Code duplicated, block: B:58:0x026a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0272  */
    /* JADX WARN: Code duplicated, block: B:63:0x0281  */
    /* JADX WARN: Code duplicated, block: B:65:0x0285  */
    /* JADX WARN: Code duplicated, block: B:67:0x0298  */
    /* JADX WARN: Code duplicated, block: B:68:0x029b  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ad  */
    final void b(java.lang.String str) {
        aimz aimzVar;
        ajcq ajcqVarH;
        j$.util.Optional optionalEmpty;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String string;
        java.lang.Object obj3;
        java.lang.String string2;
        java.lang.Object obj4;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.Object obj5;
        java.lang.String string6;
        java.lang.String string7;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        j$.util.Optional optionalEmpty2;
        vua vuaVar;
        boolean z;
        j$.util.Optional optionalOfNullable;
        aimz aimzVar2;
        j$.util.Optional optionalOfNullable2;
        j$.util.Optional optionalOfNullable3;
        defpackage.kdb kdbVar;
        oko okoVar;
        j$.util.Optional optionalV;
        defpackage.kdb kdbVar2;
        java.lang.Object obj6;
        boolean z2;
        j$.util.Optional optionalOfNullable4;
        java.util.List listU;
        if (this.l.a().equals(str)) {
            return;
        }
        this.j.a(str);
        if (str.isEmpty()) {
            this.f = false;
        } else if (!this.f) {
            agtj agtjVar = this.o;
            defpackage.mji mjiVar = this.m;
            az azVarG = this.g.G();
            defpackage.mjf mjfVar = mjiVar.e;
            gus.aI();
            java.lang.String strStripSeparators = android.telephony.PhoneNumberUtils.stripSeparators(str);
            android.content.Context context = mjfVar.b;
            aimz aimzVar3 = defpackage.mjf.a;
            aimzVar3.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleDeviceIdDisplay", 237, "SpecialCharSequenceMgr.java").v("handle device id display");
            java.lang.String str5 = "handleChars";
            if (zqz.a(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") && str.equals("*#06#")) {
                if (ahvr.r(android.os.Build.MANUFACTURER, "Oppo") || ahvr.r(android.os.Build.MANUFACTURER, "OnePlus")) {
                    aimzVar = aimzVar3;
                    aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleDeviceIdDisplay", 248, "SpecialCharSequenceMgr.java").v("deferring processing of IMEI display code");
                    mni.aK(mjfVar.e, defpackage.mga.OEM_DEVICE_ID_DIALOG_USED);
                } else {
                    android.view.View viewInflate = android.view.LayoutInflater.from(azVarG).inflate(2131624147, (android.view.ViewGroup) null);
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewInflate.findViewById(2131427960);
                    oko okoVarBe = mni.aH(azVarG).be();
                    try {
                        java.lang.Object objG = new mgr(okoVarBe.h(), j$.util.Optional.ofNullable(okoVarBe.j.getDeviceSoftwareVersion())).a(mgv.bI).g(new defpackage.mig(16));
                        aooh.c(objG);
                        optionalEmpty = (j$.util.Optional) objG;
                    } catch (java.lang.SecurityException e) {
                        oko.a.d().k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "maybeGetDeviceSoftwareVersion", 1228, "DialerTelephony.kt").v("TelephonyManager.getDeviceSoftwareVersion called without permission.");
                        optionalEmpty = j$.util.Optional.empty();
                        aooh.c(optionalEmpty);
                    }
                    java.lang.String str6 = (java.lang.String) optionalEmpty.orElse((java.lang.Object) null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    j$.util.Optional optionalO = okoVarBe.o();
                    boolean zBooleanValue = ((java.lang.Boolean) mni.aH(azVarG).hI().a()).booleanValue();
                    aify aifyVar = (!zBooleanValue || (listU = okoVarBe.U()) == null) ? aike.a : (aify) j$.util.Collection.-EL.stream(listU).filter(new defpackage.mif(0)).map(new defpackage.mig(0)).filter(new defpackage.mif(2)).distinct().collect(aido.a);
                    int i = 0;
                    while (i < okoVarBe.a()) {
                        android.view.ViewGroup viewGroup2 = viewGroup;
                        if (okoVarBe.a() == 1) {
                            str2 = (java.lang.String) okoVarBe.u((java.lang.Integer) null).orElse((java.lang.Object) null);
                            str3 = (java.lang.String) okoVarBe.w((java.lang.Integer) null).orElse((java.lang.Object) null);
                        } else {
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                            str2 = (java.lang.String) okoVarBe.u(numValueOf).orElse((java.lang.Object) null);
                            str3 = (java.lang.String) okoVarBe.w(numValueOf).orElse((java.lang.Object) null);
                        }
                        j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
                        if (!zBooleanValue && okoVarBe.U() != null) {
                            if (okoVarBe.U().size() > i) {
                                j$.util.Optional optionalOfNullable5 = j$.util.Optional.ofNullable(fn$.ExternalSyntheticApiModelOutline0.m(fn$.ExternalSyntheticApiModelOutline0.m(okoVarBe.U().get(i))));
                                str4 = str3;
                                optionalEmpty2 = (true != optionalOfNullable5.isPresent() || true == anty.aD((java.lang.String) optionalOfNullable5.get())) ? optionalOfNullable5 : j$.util.Optional.empty();
                            }
                            z = zBooleanValue;
                            vuaVar = new vua((byte[]) null);
                            vuaVar.f = j$.util.Optional.ofNullable(str2);
                            vuaVar.d = j$.util.Optional.ofNullable(str4);
                            optionalOfNullable = j$.util.Optional.ofNullable(mni.aH(azVarG).bd().d(i));
                            aimzVar2 = aimzVar3;
                            if (true == optionalOfNullable.isPresent()) {
                                optionalOfNullable2 = j$.util.Optional.ofNullable(((android.telephony.SubscriptionInfo) optionalOfNullable.get()).getIccId());
                            }
                            if (optionalOfNullable2 != null) {
                                optionalOfNullable2 = optionalOfNullable;
                                throw new java.lang.NullPointerException("Null iccId");
                            }
                            optionalOfNullable2 = optionalOfNullable;
                            vuaVar.e = optionalOfNullable2;
                            optionalOfNullable3 = j$.util.Optional.ofNullable(mni.aH(azVarG).bd().d(i));
                            kdbVar = new defpackage.kdb(okoVarBe, 15);
                            okoVar = okoVarBe;
                            if (true == optionalOfNullable3.isPresent()) {
                                optionalV = ((oko) kdbVar.a).E(((android.telephony.SubscriptionInfo) optionalOfNullable3.get()).getSubscriptionId());
                                optionalV.getClass();
                            } else {
                                optionalV = optionalOfNullable3;
                            }
                            if (true == optionalV.isPresent()) {
                                optionalV = ((oko) optionalV.get()).v();
                                optionalV.getClass();
                            }
                            if (optionalV != null) {
                                throw new java.lang.NullPointerException("Null msisdn");
                            }
                            vuaVar.h = optionalV;
                            if (optionalEmpty2 != null) {
                                throw new java.lang.NullPointerException("Null eid");
                            }
                            vuaVar.g = optionalEmpty2;
                            vuaVar.h(i);
                            kdbVar2 = new defpackage.kdb(str2, 16);
                            if (true != optionalO.isPresent()) {
                                optionalOfNullable4 = optionalO;
                            } else {
                                java.lang.Object obj7 = optionalO.get();
                                obj6 = kdbVar2.a;
                                if (obj6 == null && ((java.lang.String) obj6).equals(obj7)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                optionalOfNullable4 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(z2));
                            }
                            vuaVar.a = ((java.lang.Boolean) optionalOfNullable4.orElse(java.lang.Boolean.FALSE)).booleanValue();
                            vuaVar.b = (byte) (vuaVar.b | 2);
                            arrayList.add(vuaVar.g());
                            i++;
                            viewGroup = viewGroup2;
                            str5 = str5;
                            zBooleanValue = z;
                            aimzVar3 = aimzVar2;
                            okoVarBe = okoVar;
                        }
                        str4 = str3;
                        optionalEmpty2 = optionalEmpty3;
                        z = zBooleanValue;
                        vuaVar = new vua((byte[]) null);
                        vuaVar.f = j$.util.Optional.ofNullable(str2);
                        vuaVar.d = j$.util.Optional.ofNullable(str4);
                        optionalOfNullable = j$.util.Optional.ofNullable(mni.aH(azVarG).bd().d(i));
                        aimzVar2 = aimzVar3;
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable2 = j$.util.Optional.ofNullable(((android.telephony.SubscriptionInfo) optionalOfNullable.get()).getIccId());
                        }
                        if (optionalOfNullable2 != null) {
                            optionalOfNullable2 = optionalOfNullable;
                            throw new java.lang.NullPointerException("Null iccId");
                        }
                        optionalOfNullable2 = optionalOfNullable;
                        vuaVar.e = optionalOfNullable2;
                        optionalOfNullable3 = j$.util.Optional.ofNullable(mni.aH(azVarG).bd().d(i));
                        kdbVar = new defpackage.kdb(okoVarBe, 15);
                        okoVar = okoVarBe;
                        if (true == optionalOfNullable3.isPresent()) {
                            optionalV = ((oko) kdbVar.a).E(((android.telephony.SubscriptionInfo) optionalOfNullable3.get()).getSubscriptionId());
                            optionalV.getClass();
                        } else {
                            optionalV = optionalOfNullable3;
                        }
                        if (true == optionalV.isPresent()) {
                            optionalV = ((oko) optionalV.get()).v();
                            optionalV.getClass();
                        }
                        if (optionalV != null) {
                            throw new java.lang.NullPointerException("Null msisdn");
                        }
                        vuaVar.h = optionalV;
                        if (optionalEmpty2 != null) {
                            throw new java.lang.NullPointerException("Null eid");
                        }
                        vuaVar.g = optionalEmpty2;
                        vuaVar.h(i);
                        kdbVar2 = new defpackage.kdb(str2, 16);
                        if (true != optionalO.isPresent()) {
                            optionalOfNullable4 = optionalO;
                        } else {
                            java.lang.Object obj8 = optionalO.get();
                            obj6 = kdbVar2.a;
                            if (obj6 == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            optionalOfNullable4 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(z2));
                        }
                        vuaVar.a = ((java.lang.Boolean) optionalOfNullable4.orElse(java.lang.Boolean.FALSE)).booleanValue();
                        vuaVar.b = (byte) (vuaVar.b | 2);
                        arrayList.add(vuaVar.g());
                        i++;
                        viewGroup = viewGroup2;
                        str5 = str5;
                        zBooleanValue = z;
                        aimzVar3 = aimzVar2;
                        okoVarBe = okoVar;
                    }
                    android.view.ViewGroup viewGroup3 = viewGroup;
                    java.lang.String str7 = str5;
                    aimzVar = aimzVar3;
                    if (((java.lang.Boolean) mni.aH(azVarG).hR().a()).booleanValue()) {
                        j$.util.List.-EL.sort(arrayList, j$.util.Comparator.-CC.comparing(new defpackage.mig(2), j$.util.Comparator.-CC.nullsLast(j$.util.Comparator.-CC.naturalOrder())));
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            vua vuaVar2 = new vua((defpackage.mij) arrayList.get(i2));
                            vuaVar2.h(i2);
                            arrayList.set(i2, vuaVar2.g());
                        }
                    }
                    tjw tjwVar = new tjw((short[]) null);
                    tjwVar.d(aike.a);
                    tjwVar.b = str6;
                    java.lang.String strM = da$.ExternalSyntheticApiModelOutline1.m();
                    if (strM == null) {
                        throw new java.lang.NullPointerException("Null serialNumber");
                    }
                    tjwVar.a = strM;
                    aify aifyVarN = aify.n(arrayList);
                    if (aifyVarN == null) {
                        throw new java.lang.NullPointerException("Null simsSlotsInfo");
                    }
                    tjwVar.d = aifyVarN;
                    tjwVar.d(aifyVar);
                    java.lang.Object obj9 = tjwVar.a;
                    if (obj9 == null || (obj = tjwVar.d) == null || (obj2 = tjwVar.c) == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        if (tjwVar.a == null) {
                            sb.append(" serialNumber");
                        }
                        if (tjwVar.d == null) {
                            sb.append(" simsSlotsInfo");
                        }
                        if (tjwVar.c == null) {
                            sb.append(" euiccEids");
                        }
                        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    defpackage.mii miiVar = new defpackage.mii((java.lang.String) obj9, (java.lang.String) tjwVar.b, (aify) obj, (aify) obj2);
                    java.util.List list = miiVar.c;
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        defpackage.mij mijVar = (defpackage.mij) list.get(i3);
                        java.lang.String strValueOf = list.size() == 1 ? "" : java.lang.String.valueOf(mijVar.g + 1);
                        mijVar.a.isPresent();
                        j$.util.Optional optional = mijVar.b;
                        java.util.List list2 = list;
                        int i4 = size;
                        int i5 = i3;
                        android.view.View view = viewInflate;
                        az azVar = azVarG;
                        android.view.ViewGroup viewGroup4 = viewGroup3;
                        java.lang.String str8 = str7;
                        agtj agtjVar2 = agtjVar;
                        defpackage.oqh oqhVar = new defpackage.oqh((android.content.Context) azVar, viewGroup4, strValueOf, mijVar, miiVar, 1);
                        if (true == optional.isPresent()) {
                            java.lang.Object obj10 = optional.get();
                            java.lang.Object obj11 = oqhVar.c;
                            java.lang.Object obj12 = oqhVar.a;
                            java.lang.Object obj13 = oqhVar.e;
                            java.lang.Object obj14 = oqhVar.d;
                            java.lang.Object obj15 = oqhVar.b;
                            java.lang.String str9 = (java.lang.String) obj10;
                            android.content.Context context2 = (android.content.Context) obj11;
                            if (defpackage.mik.c(context2)) {
                                obj5 = obj12;
                                string7 = context2.getString(2132019023, obj13);
                            } else {
                                obj5 = obj12;
                                if (((java.lang.String) obj13).isEmpty()) {
                                    string7 = context2.getResources().getString(2132019026);
                                } else {
                                    string6 = ((defpackage.mij) obj14).h ? context2.getResources().getString(2132019025, obj13) : context2.getResources().getString(2132019024, obj13);
                                }
                                defpackage.mik.b(context2, (android.view.ViewGroup) obj5, str9, string6, ((defpackage.mii) obj15).b, false);
                            }
                            string6 = string7;
                            obj15 = obj15;
                            defpackage.mik.b(context2, (android.view.ViewGroup) obj5, str9, string6, ((defpackage.mii) obj15).b, false);
                        }
                        j$.util.Optional optional2 = mijVar.c;
                        defpackage.mie mieVar = new defpackage.mie((android.content.Context) azVar, viewGroup4, strValueOf, 0);
                        if (true == optional2.isPresent()) {
                            java.lang.Object obj16 = optional2.get();
                            java.lang.Object obj17 = mieVar.a;
                            java.lang.Object obj18 = mieVar.b;
                            java.lang.Object obj19 = mieVar.c;
                            java.lang.String str10 = (java.lang.String) obj16;
                            android.content.Context context3 = (android.content.Context) obj17;
                            if (defpackage.mik.c(context3)) {
                                string5 = context3.getString(2132019333, obj19);
                            } else {
                                if (((java.lang.String) obj19).isEmpty()) {
                                    string5 = context3.getResources().getString(2132019335);
                                } else {
                                    string4 = context3.getResources().getString(2132019334, obj19);
                                }
                                defpackage.mik.b(context3, (android.view.ViewGroup) obj18, str10, string4, "", true);
                            }
                            string4 = string5;
                            defpackage.mik.b(context3, (android.view.ViewGroup) obj18, str10, string4, "", true);
                        }
                        j$.util.Optional optional3 = mijVar.d;
                        defpackage.mie mieVar2 = new defpackage.mie(viewGroup4, azVar, strValueOf, 2);
                        if (true == optional3.isPresent()) {
                            java.lang.Object obj20 = optional3.get();
                            java.lang.Object obj21 = mieVar2.b;
                            java.lang.Object obj22 = mieVar2.a;
                            java.lang.Object obj23 = mieVar2.c;
                            java.lang.String str11 = (java.lang.String) obj20;
                            android.content.Context context4 = (android.content.Context) obj22;
                            if (defpackage.mik.c(context4)) {
                                obj4 = obj21;
                                string3 = context4.getString(2132018884, obj23);
                            } else {
                                obj4 = obj21;
                                string3 = ((java.lang.String) obj23).isEmpty() ? context4.getResources().getString(2132018886) : context4.getResources().getString(2132018885, obj23);
                            }
                            defpackage.mik.a((android.view.ViewGroup) obj4, string3, str11);
                        }
                        j$.util.Optional optional4 = mijVar.e;
                        defpackage.mie mieVar3 = new defpackage.mie(viewGroup4, azVar, strValueOf, 3);
                        if (true == optional4.isPresent()) {
                            java.lang.Object obj24 = optional4.get();
                            java.lang.Object obj25 = mieVar3.b;
                            java.lang.Object obj26 = mieVar3.a;
                            java.lang.Object obj27 = mieVar3.c;
                            java.lang.String str12 = (java.lang.String) obj24;
                            android.content.Context context5 = (android.content.Context) obj26;
                            if (defpackage.mik.c(context5)) {
                                obj3 = obj25;
                                string2 = context5.getString(2132019361, obj27);
                            } else {
                                obj3 = obj25;
                                string2 = ((java.lang.String) obj27).isEmpty() ? context5.getResources().getString(2132019363) : context5.getResources().getString(2132019362, obj27);
                            }
                            defpackage.mik.a((android.view.ViewGroup) obj3, string2, str12);
                        }
                        j$.util.Optional optional5 = mijVar.f;
                        defpackage.mie mieVar4 = new defpackage.mie(viewGroup4, azVar, strValueOf, 4);
                        if (true == optional5.isPresent()) {
                            java.lang.Object obj28 = optional5.get();
                            java.lang.Object obj29 = mieVar4.b;
                            java.lang.Object obj30 = mieVar4.a;
                            java.lang.Object obj31 = mieVar4.c;
                            java.lang.String str13 = (java.lang.String) obj28;
                            android.content.Context context6 = (android.content.Context) obj30;
                            if (((java.lang.Boolean) mni.aH(context6).hQ().a()).booleanValue()) {
                                string = context6.getString(2132018505);
                            } else if (defpackage.mik.c(context6)) {
                                string = context6.getString(2132018503, obj31);
                            } else {
                                string = ((java.lang.String) obj31).isEmpty() ? context6.getResources().getString(2132018505) : context6.getResources().getString(2132018504, obj31);
                            }
                            defpackage.mik.a((android.view.ViewGroup) obj29, string, str13);
                        }
                        viewInflate = view;
                        azVarG = azVar;
                        viewGroup3 = viewGroup4;
                        str7 = str8;
                        size = i4;
                        agtjVar = agtjVar2;
                        i3 = i5 + 1;
                        list = list2;
                    }
                    agtjVar = agtjVar;
                    android.view.View view2 = viewInflate;
                    az azVar2 = azVarG;
                    android.view.ViewGroup viewGroup5 = viewGroup3;
                    str5 = str7;
                    aify aifyVar2 = miiVar.d;
                    int i6 = 0;
                    while (i6 < aifyVar2.size()) {
                        int i7 = i6 + 1;
                        defpackage.mik.a(viewGroup5, (aifyVar2.size() <= 1 || ((java.lang.Boolean) mni.aH(azVar2).hQ().a()).booleanValue()) ? azVar2.getString(2132018505) : azVar2.getString(2132018503, java.lang.String.valueOf(i7)), (java.lang.String) aifyVar2.get(i6));
                        i6 = i7;
                    }
                    defpackage.mik.a(viewGroup5, azVar2.getString(2132020078), miiVar.a);
                    afsn afsnVar = new afsn(azVar2, 0);
                    afsnVar.y(azVar2.getResources().getString(2132018289));
                    afsnVar.A(view2);
                    afsnVar.w(android.R.string.ok, (android.content.DialogInterface.OnClickListener) null);
                    afsnVar.p(false);
                    afsnVar.a().getWindow().setLayout(-1, -2);
                }
                aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", str5, 137, "SpecialCharSequenceMgr.java").v("return valid code no conflicts");
                ajcqVarH = aiql.z(ruh.c);
                agtjVar.i(new zoe(ahrv.g(ajcqVarH).h(new lix(7), mjiVar.c)), this.x);
            } else {
                aimzVar = aimzVar3;
            }
            if (defpackage.mjf.a(azVarG, str)) {
                aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", str5, 137, "SpecialCharSequenceMgr.java").v("return valid code no conflicts");
                ajcqVarH = aiql.z(ruh.c);
            } else {
                aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handlePinEntry", 192, "SpecialCharSequenceMgr.java").v("handle pin entry");
                if ((str.startsWith("**04") || str.startsWith("**05")) && str.endsWith("#")) {
                    zjs zjsVar = mjfVar.f;
                    java.util.List listT = zjsVar.t();
                    boolean zContains = listT.contains(zjsVar.g("tel").orElse((java.lang.Object) null));
                    if (listT.size() > 1 && !zContains) {
                        defpackage.ve veVar = mjfVar.h;
                        veVar.d(new defpackage.mje(mjfVar, str));
                        defpackage.lvk.aX((defpackage.lvm) mni.bN(listT).p(), veVar).r(azVarG.a(), "tag_select_acct_fragment");
                    } else if (!zjsVar.w(str, (android.telecom.PhoneAccountHandle) null)) {
                    }
                    aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", str5, 137, "SpecialCharSequenceMgr.java").v("return valid code no conflicts");
                    ajcqVarH = aiql.z(ruh.c);
                }
                aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleAdnEntry", 181, "SpecialCharSequenceMgr.java").v("handle ADN entry");
                int length = str.length();
                if (length > 1 && length < 5 && str.endsWith("#")) {
                    mjfVar.c.o(rmx.jM);
                    mni.aK(mjfVar.e, defpackage.mga.ADN_QUERY_REMOVED);
                }
                aimzVar.b().l("com/android/dialer/dialpadview/SpecialCharSequenceMgr", "handleChars", 141, "SpecialCharSequenceMgr.java").v("start to process mmi code");
                rur rurVar = mjfVar.g;
                ahrv ahrvVarG = ahrv.g(rurVar.g.isPresent() ? ajcm.a : ahvr.F(ahqx.i(new run(rurVar)), rurVar.d));
                defpackage.oqe oqeVar = new defpackage.oqe(rurVar, strStripSeparators, 15);
                ajct ajctVar = rurVar.c;
                ajcqVarH = ahvr.H(ahvr.H(ahrvVarG.h(oqeVar, ajctVar), new qgx(rurVar, 18), ajctVar), new defpackage.iau(mjfVar, str, 20), mjfVar.d);
            }
            agtjVar.i(new zoe(ahrv.g(ajcqVarH).h(new lix(7), mjiVar.c)), this.x);
        }
        ahvr.i(new defpackage.mkp(str), this.g);
        this.h.d();
        defpackage.mji mjiVar2 = this.m;
        defpackage.mjm mjmVar = mjiVar2.d;
        ahda ahdaVar = mjmVar.f;
        defpackage.lly llyVar = new defpackage.lly(mjmVar, str, 9);
        ajct ajctVar2 = mjmVar.b;
        agsm.i(356, ahdaVar.g(llyVar, ajctVar2), "fail to cache phone number in the PreCallDialpadService", new java.lang.Object[0]);
        if (afsq.bT(str) >= ((java.lang.Long) this.E.a()).longValue()) {
            mjiVar2.a(str, this.f, new aile(defpackage.miy.WAIT_TIME));
        } else if (((com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) this.i.c.get(defpackage.miv.WAIT_TIME_VOICE_BUTTON)).getVisibility() == 0) {
            mjmVar.g.s(ahdaVar.g(new defpackage.lly(mjmVar, new aile(defpackage.miy.WAIT_TIME), 8), ajctVar2), defpackage.mjm.a);
        }
    }

    public final void c(android.view.View view, mce mceVar) {
        this.F.aF(view, new defpackage.lge(this, mceVar, 11, null));
    }

    public final void d() {
        if (((java.lang.Boolean) this.p.a()).booleanValue()) {
            this.r.b(false);
        }
    }

    final void e(java.lang.String str) {
        this.h.d();
        this.m.a(str, this.f, aihd.r(defpackage.miy.RTT, defpackage.miy.VOICE));
        this.j.a(str);
        this.l.c();
    }

    public final void f(java.lang.String str) {
        defpackage.mlh mlhVar = new defpackage.mlh(this);
        boolean zEquals = "01189998819991197253".equals(str);
        defpackage.mkt mktVar = this.k;
        if (!zEquals) {
            if (mktVar.a.isPresent()) {
                ((defpackage.mjo) mktVar.a.orElseThrow()).a();
                return;
            }
            return;
        }
        if (!mktVar.a.isPresent()) {
            mktVar.a = j$.util.Optional.of(new defpackage.mjo(mlhVar));
        }
        defpackage.mjo mjoVar = (defpackage.mjo) mktVar.a.orElseThrow();
        if (mjoVar.b == null) {
            mjoVar.b = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), -16776961, -65536);
            mjoVar.b.addUpdateListener(new defpackage.mh(mjoVar, 5, null));
            mjoVar.b.addListener(new tjm(mjoVar, 1));
            mjoVar.b.setDuration(wsc.bp(mjoVar.c.a(), urp.d));
            mjoVar.b.setRepeatMode(2);
            mjoVar.b.setRepeatCount(6);
        }
        if (mjoVar.b.isStarted()) {
            return;
        }
        mjoVar.b.start();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Collection] */
    public final void g(defpackage.mjr mjrVar, int i) {
        j$.util.Optional optionalEmpty;
        int i2 = 1;
        if (this.t.isPresent()) {
            optionalEmpty = this.t;
        } else {
            defpackage.mla mlaVar = this.g;
            android.view.View view = ((aw) mlaVar).Q;
            if (view == null) {
                optionalEmpty = j$.util.Optional.empty();
            } else {
                com.android.dialer.dialpadview.DialpadView dialpadView = (com.android.dialer.dialpadview.DialpadView) view.findViewById(2131427997);
                androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(view.getContext());
                composeView.setId(2131428953);
                composeView.setVisibility(8);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                composeView.setLayoutParams(layoutParams);
                int dimensionPixelSize = mlaVar.dX().getDimensionPixelSize(2131165643);
                composeView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                dialpadView.addView((android.view.View) composeView, 0);
                this.t = j$.util.Optional.of(composeView);
                optionalEmpty = this.t;
            }
        }
        vag vagVar = new vag(this, mjrVar.a, i, 1);
        if (true == optionalEmpty.isPresent()) {
            java.lang.Object obj = optionalEmpty.get();
            java.lang.Object obj2 = vagVar.b;
            ?? r13 = vagVar.c;
            int i3 = vagVar.a;
            androidx.compose.ui.platform.ComposeView composeView2 = (androidx.compose.ui.platform.ComposeView) obj;
            composeView2.setVisibility(0);
            java.util.List list = (java.util.List) j$.util.Collection.-EL.stream((java.util.Collection) r13).map(new defpackage.mig(4)).collect(aido.a);
            defpackage.lvd lvdVar = new defpackage.lvd(obj2, 6);
            defpackage.kgq kgqVar = new defpackage.kgq(obj2, 20);
            defpackage.mtr mtrVar = new defpackage.mtr(obj2, i2);
            aooh.f(list, "entries");
            aais aaisVar = ((defpackage.mli) obj2).C;
            aooh.f(aaisVar, "glideImageManager");
            ((ddl) obj).k(dgi.a);
            composeView2.a(new cja(-1823621253, true, new defpackage.alh(aaisVar, list, i3, lvdVar, kgqVar, mtrVar, 11)));
        }
    }

    public final void h(android.view.animation.Animation.AnimationListener animationListener) {
        int i;
        defpackage.mkt mktVar = this.k;
        defpackage.mla mlaVar = mktVar.e;
        android.content.Context contextZ = mlaVar.z();
        if (mktVar.d) {
            i = mktVar.c ? 2130772005 : 2130772006;
        } else {
            i = 2130772004;
        }
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(contextZ, i);
        animationLoadAnimation.setInterpolator(defpackage.hrm.b);
        animationLoadAnimation.setAnimationListener(animationListener);
        animationLoadAnimation.setDuration(mktVar.b);
        ((aw) mlaVar).Q.startAnimation(animationLoadAnimation);
        this.b = false;
    }

    public final void i(java.lang.String str) {
        java.lang.String strExtractPostDialPortion;
        a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer", "updateDigitsNewIntent", 529, "PreCallDialpadFragmentPeer.java").v("enter");
        if (((java.lang.Boolean) this.p.a()).booleanValue()) {
            j$.util.Optional optional = this.t;
            if (true == optional.isPresent()) {
                ((ddl) optional.get()).g();
            }
        }
        this.f = true;
        defpackage.mlm mlmVar = this.h;
        aooh.f(str, "newDigits");
        ahoq ahoqVarW = ahvr.W(372, "PreCallDialpadInputRenderer_updateDigitsFromIntent");
        try {
            if (((java.lang.Boolean) mlmVar.j.a()).booleanValue()) {
                strExtractPostDialPortion = str;
            } else {
                java.lang.String str2 = mlmVar.l;
                if (str2 == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                java.lang.String strExtractNetworkPortion = android.telephony.PhoneNumberUtils.extractNetworkPortion(str);
                aooh.e(strExtractNetworkPortion, "extractNetworkPortion(...)");
                strExtractPostDialPortion = android.telephony.PhoneNumberUtils.extractPostDialPortion(str);
                aooh.e(strExtractPostDialPortion, "extractPostDialPortion(...)");
                if (strExtractNetworkPortion.length() != 0) {
                    java.lang.String strG = mlmVar.e.g(strExtractNetworkPortion, str2);
                    if (strG == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                    strExtractPostDialPortion = strExtractPostDialPortion.length() != 0 ? strG.concat(java.lang.String.valueOf(strExtractPostDialPortion)) : strG;
                }
            }
            if (strExtractPostDialPortion.length() > 0) {
                android.widget.EditText editText = mlmVar.k;
                if (editText == null) {
                    aooh.j("digits");
                    editText = null;
                }
                editText.getText().clear();
                mlmVar.e(strExtractPostDialPortion);
            }
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            e(str);
            c(((aw) this.g).Q, mce.u);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    final void j(boolean z) {
        defpackage.mlp mlpVar = this.j;
        if (z) {
            android.view.View view = mlpVar.b;
            android.view.animation.Interpolator interpolator = defpackage.hrm.a;
            view.setAlpha(0.0f);
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.setStartDelay(0L);
            viewPropertyAnimatorAnimate.alpha(1.0f).withLayer().setListener(new defpackage.hrl(view));
            viewPropertyAnimatorAnimate.start();
            return;
        }
        android.view.View view2 = mlpVar.b;
        rai raiVar = new rai(mlpVar, (char[]) null);
        android.view.animation.Interpolator interpolator2 = defpackage.hrm.a;
        view2.setAlpha(1.0f);
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
        viewPropertyAnimatorAnimate2.cancel();
        viewPropertyAnimatorAnimate2.alpha(0.0f).withLayer().setListener(new defpackage.hrk(view2, raiVar));
        viewPropertyAnimatorAnimate2.start();
    }
}
