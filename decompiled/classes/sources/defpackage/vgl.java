package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vgl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/configuration/impl/OmtpVvmDialerConfigurationLoaderImpl");
    public final defpackage.aoin b;
    public final defpackage.ahzi c = defpackage.ahvr.bI(new defpackage.ahzi() { // from class: vgk
        @Override // defpackage.ahzi
        public final java.lang.Object eZ() {
            defpackage.vbu vbuVar;
            defpackage.vbu vbuVar2;
            defpackage.vbu vbuVar3;
            defpackage.vbu vbuVar4;
            defpackage.vbu vbuVar5;
            defpackage.akzx akzxVarL;
            defpackage.vgl vglVar = this.a;
            defpackage.aigf aigfVar = (defpackage.aigf) aitt.k(j$.util.DesugarCollections.unmodifiableMap(((defpackage.vbv) vglVar.b.a()).b)).b(new vga(4)).i(j$.util.function.Predicate.-CC.$default$negate(new defpackage.vgb(4))).e(new aitg(1));
            defpackage.ailj it = aigfVar.keySet().iterator();
            while (it.hasNext()) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.vgl.a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/configuration/impl/OmtpVvmDialerConfigurationLoaderImpl", "getOmtpVvmDialerConfigMap", 318, "OmtpVvmDialerConfigurationLoaderImpl.java")).y("overriding carrier config for carrier %s", (defpackage.vdd) it.next());
            }
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            defpackage.vgh vghVar = vglVar.g;
            defpackage.aigb aigbVar2 = new defpackage.aigb(4);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_BOUYGUES_FRANCE, defpackage.vgh.a);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FREEDOM_CANADA, defpackage.vgh.b);
            defpackage.vdd vddVar = defpackage.vdd.VVM_CARRIER_ORANGE_BELGIUM;
            if (((java.lang.Boolean) vghVar.am.a()).booleanValue()) {
                defpackage.akzx akzxVarL2 = defpackage.vgh.c.L();
                akzxVarL2.X("8082");
                vbuVar = (defpackage.vbu) akzxVarL2.r();
            } else {
                vbuVar = defpackage.vgh.c;
            }
            aigbVar2.i(vddVar, vbuVar);
            defpackage.vdd vddVar2 = defpackage.vdd.VVM_CARRIER_ORANGE_LUXEMBOURG;
            if (((java.lang.Boolean) vghVar.an.a()).booleanValue()) {
                defpackage.akzx akzxVarL3 = defpackage.vgh.d.L();
                akzxVarL3.X("64085");
                akzxVarL3.X("8082");
                vbuVar2 = (defpackage.vbu) akzxVarL3.r();
            } else {
                vbuVar2 = defpackage.vgh.d;
            }
            aigbVar2.i(vddVar2, vbuVar2);
            defpackage.vdd vddVar3 = defpackage.vdd.VVM_CARRIER_ORANGE_FRANCE;
            defpackage.vbu vbuVar6 = defpackage.vgh.e;
            aigbVar2.i(vddVar3, vbuVar6);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ORANGE_FRANCE_NTN, vbuVar6);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ORANGE_LA_REUNION, defpackage.vgh.f);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_O2_UK, defpackage.vgh.g);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SWISSCOM_CH, defpackage.vgh.h);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SWISSCOM_CH16, defpackage.vgh.i);
            defpackage.vdd vddVar4 = defpackage.vdd.VVM_CARRIER_TMO_US;
            aigbVar2.i(vddVar4, defpackage.vgh.j);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ULTRA, defpackage.vgh.k);
            defpackage.vdd vddVar5 = defpackage.vdd.VVM_CARRIER_PROXIMUS;
            if (((java.lang.Boolean) vghVar.ao.a()).booleanValue()) {
                defpackage.akzx akzxVarL4 = defpackage.vgh.l.L();
                akzxVarL4.X("32475161969");
                vbuVar3 = (defpackage.vbu) akzxVarL4.r();
            } else {
                vbuVar3 = defpackage.vgh.l;
            }
            aigbVar2.i(vddVar5, vbuVar3);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_VERIZON, defpackage.vgh.n);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_MCI, defpackage.vgh.o);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_MOBILE_TEL_INC, defpackage.vgh.p);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_RURAL_CELLULAR_CORP, defpackage.vgh.q);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SOUTHERN_IL_RSA_PARTNERSHIP, defpackage.vgh.r);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ALLTEL_COMM_INC, defpackage.vgh.s);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_MIDWEST_WIRELESS_HOLDINGS, defpackage.vgh.t);
            defpackage.vdd vddVar6 = defpackage.vdd.VVM_CARRIER_ATT;
            defpackage.vbu vbuVar7 = defpackage.vgh.v;
            aigbVar2.i(vddVar6, vbuVar7);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ATT_5G, vbuVar7);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ATT_5G_SA, vbuVar7);
            defpackage.vdd vddVar7 = defpackage.vdd.VVM_CARRIER_CRICKET_WIRELESS;
            defpackage.vbu vbuVar8 = defpackage.vgh.w;
            aigbVar2.i(vddVar7, vbuVar8);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CRICKET_WIRELESS_5G, vbuVar8);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FIRST_NET_LAB, defpackage.vgh.x);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FIRST_NET, defpackage.vgh.y);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FIRST_NET_PACIFIC, defpackage.vgh.z);
            defpackage.vdd vddVar8 = defpackage.vdd.VVM_CARRIER_CONSUMER_CELLULAR;
            defpackage.vbu vbuVar9 = defpackage.vgh.A;
            aigbVar2.i(vddVar8, vbuVar9);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CONSUMER_CELLULAR_ATT, vbuVar9);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_TELRITE, defpackage.vgh.B);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_AIRVOICE, defpackage.vgh.C);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_TRACFONE_ATT, defpackage.vgh.D);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_ATT_MVNOS, defpackage.vgh.E);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_LIBERTY_CABLEVISION, defpackage.vgh.F);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CORIOLIS, defpackage.vgh.G);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_TRACFONE_US_TMO, defpackage.vgh.H);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FAMILY_MOBILE_WALMART, defpackage.vgh.I);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SIMPLE_MOBILE, defpackage.vgh.J);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_REPUBLIC_WIRELESS, defpackage.vgh.K);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_TRACFONE_US_VZW, defpackage.vgh.L);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_VISIBLE_US_VZW, defpackage.vgh.M);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CHARTER_US_VZW, defpackage.vgh.N);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SPECTRUM_NAAS, defpackage.vgh.O);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_LRA_CELLCOM, defpackage.vgh.S);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_EL_TELECOM, defpackage.vgh.T);
            defpackage.vdd vddVar9 = defpackage.vdd.VVM_CARRIER_TELUS_CANADA_ANDROID_O;
            defpackage.vbu vbuVar10 = defpackage.vgh.U;
            aigbVar2.i(vddVar9, vbuVar10);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_TELUS_CANADA_ANDROID_P, vbuVar10);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_KOODO, vbuVar10);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_METRO_PCS, defpackage.vgh.V);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SUNRISE, defpackage.vgh.W);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FREE, defpackage.vgh.X);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CSPIRE, defpackage.vgh.Y);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CSPIRE_US, defpackage.vgh.Z);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_CSPIRE_NL, defpackage.vgh.aa);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SKY, defpackage.vgh.ab);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_NEXTECH, defpackage.vgh.ac);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_USMOBILE, defpackage.vgh.u);
            defpackage.vdd vddVar10 = defpackage.vdd.VVM_CARRIER_COX_US;
            if (((java.lang.Boolean) vghVar.al.a()).booleanValue()) {
                defpackage.akzx akzxVarL5 = defpackage.vgh.P.L();
                akzxVarL5.X("900080006200");
                akzxVarL5.X("900080006201");
                akzxVarL5.X("900080006202");
                akzxVarL5.X("900080006203");
                akzxVarL5.X("900080006204");
                akzxVarL5.X("900080006205");
                vbuVar4 = (defpackage.vbu) akzxVarL5.r();
            } else {
                vbuVar4 = defpackage.vgh.P;
            }
            aigbVar2.i(vddVar10, vbuVar4);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SKY_IE, defpackage.vgh.ad);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_SIMULATOR, defpackage.vgh.m);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_FREE_RE, defpackage.vgh.ae);
            defpackage.vdd vddVar11 = defpackage.vdd.VVM_CARRIER_DEUTSCHE_TELEKOM;
            if (((java.lang.Boolean) vghVar.ap.a()).booleanValue()) {
                defpackage.akzx akzxVarL6 = defpackage.vgh.ag.L();
                akzxVarL6.X("73240");
                vbuVar5 = (defpackage.vbu) akzxVarL6.r();
            } else {
                vbuVar5 = defpackage.vgh.ag;
            }
            aigbVar2.i(vddVar11, vbuVar5);
            defpackage.vdd vddVar12 = defpackage.vdd.VVM_CARRIER_EE;
            defpackage.vbu vbuVar11 = defpackage.vgh.af;
            aigbVar2.i(vddVar12, vbuVar11);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_BT_BUSINESS, vbuVar11);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_EE_BUSINESS, vbuVar11);
            if (((java.lang.Boolean) vghVar.ai.a()).booleanValue()) {
                defpackage.akzx akzxVarL7 = defpackage.vgh.R.L();
                akzxVarL7.u();
                defpackage.vbu vbuVar12 = (defpackage.vbu) akzxVarL7.b;
                j$.util.Objects.requireNonNull("cbs");
                vbuVar12.b |= 1024;
                vbuVar12.n = "cbs";
                akzxVarL = akzxVarL7;
            } else {
                akzxVarL = ((java.lang.Boolean) vghVar.ah.a()).booleanValue() ? defpackage.vgh.R.L() : defpackage.vgh.Q.L();
            }
            if (((java.lang.Boolean) vghVar.ak.a()).booleanValue()) {
                akzxVarL.X("900080006200");
                akzxVarL.X("900080006201");
                akzxVarL.X("900080006202");
                akzxVarL.X("900080006203");
                akzxVarL.X("900080006204");
                akzxVarL.X("900080006205");
            }
            defpackage.vbu vbuVar13 = (defpackage.vbu) akzxVarL.r();
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_COMCAST_US_VZW, vbuVar13);
            aigbVar2.i(defpackage.vdd.VVM_CARRIER_COMCAST, vbuVar13);
            if (((java.lang.Boolean) vghVar.aj.a()).booleanValue()) {
                aigbVar2.i(defpackage.vdd.VVM_CARRIER_COMCAST_BUSINESS, vbuVar13);
            }
            aigbVar.l(aigbVar2.e(true));
            aigbVar.l(aigfVar);
            defpackage.aigf aigfVarE = aigbVar.e(false);
            defpackage.aigb aigbVar3 = new defpackage.aigb(4);
            aigbVar3.l(aigfVarE);
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(((defpackage.alfa) vglVar.e.a()).b).map(new vga(4));
            j$.util.Objects.requireNonNull(aigfVarE);
            aigbVar3.l((defpackage.aigf) new aitn(map.filter(new ree(aigfVarE, 15)), new vga(5), new defpackage.thy(aigfVarE, 11)).e(new aitg(1)));
            defpackage.akzx akzxVarL8 = ((defpackage.vbu) aigfVarE.get(vddVar4)).L();
            boolean zBooleanValue = ((java.lang.Boolean) vglVar.d.a()).booleanValue();
            akzxVarL8.u();
            defpackage.vbu vbuVar14 = (defpackage.vbu) akzxVarL8.b;
            vbuVar14.b |= 32;
            vbuVar14.j = zBooleanValue;
            aigbVar3.i(vddVar4, (defpackage.vbu) akzxVarL8.r());
            defpackage.vbu vbuVar15 = (defpackage.vbu) aigfVarE.get(vddVar5);
            if (vbuVar15 != null && ((java.lang.Boolean) vglVar.f.a()).booleanValue()) {
                java.lang.String str = vbuVar15.d;
                if ((vbuVar15.b & 2) != 0 && !str.startsWith("+")) {
                    defpackage.akzx akzxVarL9 = vbuVar15.L();
                    java.lang.String strValueOf = java.lang.String.valueOf(str);
                    akzxVarL9.u();
                    defpackage.vbu vbuVar16 = (defpackage.vbu) akzxVarL9.b;
                    java.lang.String strConcat = "+".concat(strValueOf);
                    j$.util.Objects.requireNonNull(strConcat);
                    vbuVar16.b |= 2;
                    vbuVar16.d = strConcat;
                    vbuVar15 = (defpackage.vbu) akzxVarL9.r();
                }
            }
            aigbVar3.i(vddVar5, vbuVar15);
            return aigbVar3.e(false);
        }
    });
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.vgh g;
    private final defpackage.ajct h;
    private final defpackage.aoin i;
    private final defpackage.oko j;
    private final defpackage.zjm k;

    public vgl(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.ajct ajctVar, defpackage.zjm zjmVar, defpackage.oko okoVar, defpackage.vgh vghVar) {
        this.b = aoinVar;
        this.k = zjmVar;
        this.h = ajctVar;
        this.d = aoinVar2;
        this.j = okoVar;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.i = aoinVar5;
        this.g = vghVar;
    }

    public static j$.util.Optional d(j$.util.Optional optional, j$.util.Optional optional2) {
        java.lang.String[] stringArray;
        java.lang.String[] stringArray2;
        if (!optional2.isPresent()) {
            return optional;
        }
        android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) optional2.orElseThrow();
        boolean z = optional.isPresent() ? ((defpackage.vbu) optional.orElseThrow()).q : false;
        defpackage.vbu vbuVar = (defpackage.vbu) optional.orElse(defpackage.vbu.a);
        defpackage.akzx akzxVarL = vbuVar.L();
        if (!z && (stringArray2 = persistableBundle.getStringArray("carrier_vvm_package_name_string_array")) != null && stringArray2.length > 0) {
            java.util.List listAsList = java.util.Arrays.asList(stringArray2);
            akzxVarL.u();
            defpackage.vbu vbuVar2 = (defpackage.vbu) akzxVarL.b;
            vbuVar2.b();
            defpackage.akyl.i(listAsList, vbuVar2.g);
        }
        if (!z && (stringArray = persistableBundle.getStringArray("vvm_disabled_capabilities_string_array")) != null && stringArray.length > 0) {
            java.util.List listAsList2 = java.util.Arrays.asList(stringArray);
            akzxVarL.u();
            defpackage.vbu vbuVar3 = (defpackage.vbu) akzxVarL.b;
            vbuVar3.c();
            defpackage.akyl.i(listAsList2, vbuVar3.f);
        }
        if (!z || (vbuVar.b & 8) == 0) {
            java.lang.String string = persistableBundle.getString("vvm_client_prefix_string", vbuVar.h);
            akzxVarL.u();
            defpackage.vbu vbuVar4 = (defpackage.vbu) akzxVarL.b;
            j$.util.Objects.requireNonNull(string);
            vbuVar4.b |= 8;
            vbuVar4.h = string;
        }
        if (!z || (vbuVar.b & 2) == 0) {
            java.lang.String string2 = persistableBundle.getString("vvm_destination_number_string", vbuVar.d);
            akzxVarL.u();
            defpackage.vbu vbuVar5 = (defpackage.vbu) akzxVarL.b;
            j$.util.Objects.requireNonNull(string2);
            vbuVar5.b |= 2;
            vbuVar5.d = string2;
        }
        if (!z || (vbuVar.b & 1) == 0) {
            int i = persistableBundle.getInt("vvm_port_number_int", vbuVar.c);
            akzxVarL.u();
            defpackage.vbu vbuVar6 = (defpackage.vbu) akzxVarL.b;
            vbuVar6.b |= 1;
            vbuVar6.c = i;
        }
        if (!z || (vbuVar.b & 4) == 0) {
            boolean z2 = persistableBundle.getBoolean("vvm_cellular_data_required_bool", vbuVar.e);
            akzxVarL.u();
            defpackage.vbu vbuVar7 = (defpackage.vbu) akzxVarL.b;
            vbuVar7.b |= 4;
            vbuVar7.e = z2;
        }
        if (!z || (vbuVar.b & 16) == 0) {
            boolean z3 = persistableBundle.getBoolean("vvm_legacy_mode_enabled_bool", vbuVar.i);
            akzxVarL.u();
            defpackage.vbu vbuVar8 = (defpackage.vbu) akzxVarL.b;
            vbuVar8.b |= 16;
            vbuVar8.i = z3;
        }
        if (!z || (vbuVar.b & 262144) == 0) {
            boolean z4 = persistableBundle.getBoolean("vvm_prefetch_bool", vbuVar.v);
            akzxVarL.u();
            defpackage.vbu vbuVar9 = (defpackage.vbu) akzxVarL.b;
            vbuVar9.b |= 262144;
            vbuVar9.v = z4;
        }
        return j$.util.Optional.of((defpackage.vbu) akzxVarL.r());
    }

    public static j$.util.Optional e() {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
        try {
            throw null;
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public final defpackage.ajcq a(defpackage.vdd vddVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        vez vezVar = new vez(this, vddVar, 8);
        defpackage.ajct ajctVar = this.h;
        defpackage.ajcq ajcqVarF = defpackage.ahvr.F(vezVar, ajctVar);
        defpackage.ahrv ahrvVarH = defpackage.ahrv.g(this.j.m(phoneAccountHandle)).i(new qgk(12), ajctVar).h(new vfw(this, 4), ajctVar);
        defpackage.ahrv ahrvVarE = defpackage.ahvr.af(ajcqVarF, ahrvVarH).e(new vez(ajcqVarF, ahrvVarH, 7, (byte[]) null), ajctVar);
        j$.util.Optional optionalG = this.k.g();
        return !optionalG.isEmpty() ? defpackage.ahrv.g(ahrvVarE).h(new vfw(optionalG, 5), ajctVar) : ahrvVarE;
    }

    public final j$.util.Optional b(j$.util.Optional optional) {
        java.lang.String[] stringArray;
        if (!optional.isPresent()) {
            return j$.util.Optional.empty();
        }
        android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) optional.orElseThrow();
        if (android.text.TextUtils.isEmpty(persistableBundle.getString("vvm_type_string"))) {
            return (!((java.lang.Boolean) this.i.a()).booleanValue() || (stringArray = persistableBundle.getStringArray("carrier_vvm_package_name_string_array")) == null || stringArray.length <= 0) ? j$.util.Optional.empty() : optional;
        }
        return optional;
    }

    public final j$.util.Optional c(defpackage.vdd vddVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.vbu) ((defpackage.aigf) this.c.eZ()).get(vddVar));
        j$.util.Optional optionalD = this.j.D(phoneAccountHandle);
        j$.util.Optional optionalD2 = d(optionalOfNullable, optionalD.isEmpty() ? j$.util.Optional.empty() : b(((defpackage.oko) optionalD.orElseThrow()).s()));
        j$.util.Optional optionalG = this.k.g();
        if (!optionalG.isPresent()) {
            return optionalD2;
        }
        return e();
    }
}
