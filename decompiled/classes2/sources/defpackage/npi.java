package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class npi implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ npi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajzi */
    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r14v42, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v81, types: [bry, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) throws ajzi, aois {
        afo oyxVar;
        int i;
        java.lang.String string;
        java.lang.String string2;
        defpackage.ogj ogjVar;
        int i2 = 3;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                afpl afplVar = (afpl) obj;
                aooh.f(afplVar, "$this$withClickable");
                java.lang.String string3 = ((defpackage.npr) this.a).c.getString(2132018368);
                aooh.e(string3, "getString(...)");
                afplVar.C(string3);
                return aojh.a;
            case 1:
                met metVar = (met) obj;
                aooh.f(metVar, "darpa");
                defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "showPreferenceRestrictedDialog$<anonymous>", 586, "DobbySettingsMainFragmentPeer.kt").v("show preference restricted dialog from AAPM");
                android.content.Intent intentA = metVar.a();
                if (intentA == null) {
                    throw new java.lang.IllegalStateException("AAPM dialog intent is null, which should never happen if AAPM is enabled.");
                }
                afsq.G(((defpackage.npr) this.a).b, intentA);
                return aojh.a;
            case 2:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                defpackage.npr.a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "onAutomaticCallScreenSwitchCheckChanged", 570, "DobbySettingsMainFragmentPeer.kt").y("enable feature switch changed to %b", bool);
                java.lang.Object obj2 = this.a;
                if (zBooleanValue) {
                    defpackage.npr nprVar = (defpackage.npr) obj2;
                    agtj agtjVar = nprVar.i;
                    defpackage.npe npeVar = nprVar.e;
                    defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "saveUserOptedIn", 268, "DobbySettingsService.kt").v("enrolling the user into feature");
                    npeVar.f.o(rmx.ks);
                    defpackage.nht nhtVar = new defpackage.nht(npeVar, (aoln) null, 17, (byte[]) null);
                    aoss aossVar = npeVar.b;
                    ajcq ajcqVarF = aosv.F(aossVar, 0, nhtVar, 3);
                    npeVar.p.s(ajcqVarF, defpackage.not.a);
                    agtjVar.i(zoe.N(aosv.F(aossVar, 0, new defpackage.nrw(npeVar, ajcqVarF, (aoln) null, 1), 3)), nprVar.p);
                } else {
                    defpackage.npr nprVar2 = (defpackage.npr) obj2;
                    agtj agtjVar2 = nprVar2.i;
                    defpackage.npe npeVar2 = nprVar2.e;
                    defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "saveUserOptedOut", 312, "DobbySettingsService.kt").v("opting the user out of feature");
                    ajcq ajcqVarF2 = aosv.F(npeVar2.b, 0, new defpackage.nht(npeVar2, (aoln) null, 18, (char[]) null), 3);
                    npeVar2.p.s(ajcqVarF2, defpackage.not.a);
                    agtjVar2.i(zoe.N(ajcqVarF2), nprVar2.q);
                }
                return aojh.a;
            case 3:
                java.lang.Long l = (java.lang.Long) obj;
                aooh.f(l, "it");
                long jLongValue = l.longValue();
                akzx akzxVar = (akzx) ((defpackage.nwj) this.a).a;
                akzxVar.u();
                defpackage.num numVar = (defpackage.num) akzxVar.b;
                defpackage.num numVar2 = defpackage.num.a;
                numVar.b |= 1;
                numVar.c = jLongValue;
                return aojh.a;
            case 4:
                alin alinVar = (alin) obj;
                aooh.f(alinVar, "it");
                akzx akzxVarM = zsb.a.m();
                aooh.f(akzxVarM, "builder");
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) alinVar.c;
                java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                aooh.e(strFlattenToString, "flattenToString(...)");
                aooh.f(strFlattenToString, "value");
                akzxVarM.u();
                zsb zsbVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(strFlattenToString);
                zsbVar.b |= 1;
                zsbVar.c = strFlattenToString;
                java.lang.String id = phoneAccountHandle.getId();
                aooh.e(id, "getId(...)");
                aooh.f(id, "value");
                akzxVarM.u();
                zsb zsbVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(id);
                zsbVar2.b |= 2;
                zsbVar2.d = id;
                int iOrdinal = ((svi) alinVar.b).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i2 = 4;
                    } else if (iOrdinal == 2) {
                        i2 = 5;
                    } else if (iOrdinal == 3) {
                        i2 = 6;
                    } else if (iOrdinal == 4) {
                        i2 = 7;
                    } else {
                        if (iOrdinal != 5) {
                            throw new aois();
                        }
                        i2 = 8;
                    }
                }
                java.lang.Object obj3 = this.a;
                akzxVarM.u();
                zsb zsbVar3 = akzxVarM.b;
                zsbVar3.e = i2 - 2;
                zsbVar3.b |= 4;
                boolean z2 = alinVar.a;
                akzxVarM.u();
                zsb zsbVar4 = akzxVarM.b;
                zsbVar4.b |= 8;
                zsbVar4.f = z2;
                zsb zsbVarP = akzxVarM.p();
                aooh.e(zsbVarP, "build(...)");
                zsb zsbVar5 = zsbVarP;
                aooh.f(zsbVar5, "value");
                akzx akzxVar2 = (akzx) ((uzx) obj3).a;
                akzxVar2.u();
                zsc zscVar = akzxVar2.b;
                zsc zscVar2 = zsc.a;
                j$.util.Objects.requireNonNull(zsbVar5);
                zscVar.d = zsbVar5;
                zscVar.b |= 2;
                return aojh.a;
            case 5:
                defpackage.nza.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/duo/tidepods/DuoUpgradeSupportedCache", "isUpgradeSupported$<anonymous>", 113, "DuoUpgradeSupportedCache.kt").v("isDuoUpgradeSupported timed out. Retrying.");
                ((defpackage.nza) this.a).j.a(qbc.er);
                return java.lang.Boolean.FALSE;
            case 6:
                oac.a.b().l("com/android/dialer/emergencycalling/calllocation/service/EmergencyLocationUpdater", "requestLocationUpdates$<anonymous>$<anonymous>", 132, "EmergencyLocationUpdater.kt").v("onSuccess");
                oac oacVar = (oac) this.a;
                oacVar.k.i((java.lang.String) null).b(mce.bD);
                zjv.i(oacVar.f, mgv.eE, (java.util.List) null, (mhc) null, 0, 30);
                return aojh.a;
            case 7:
                defpackage.oad oadVar = (defpackage.oad) obj;
                aooh.f(oadVar, "<destruct>");
                android.location.Location location = oadVar.a;
                j$.util.Optional optional = oadVar.b;
                akzx akzxVarM2 = defpackage.jxp.a.m();
                aooh.f(akzxVarM2, "builder");
                double latitude = location.getLatitude();
                akzxVarM2.u();
                defpackage.jxp jxpVar = (defpackage.jxp) akzxVarM2.b;
                jxpVar.b |= 1;
                jxpVar.c = latitude;
                double longitude = location.getLongitude();
                akzxVarM2.u();
                defpackage.jxp jxpVar2 = (defpackage.jxp) akzxVarM2.b;
                jxpVar2.b |= 2;
                jxpVar2.d = longitude;
                alad aladVarP = akzxVarM2.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.jxp jxpVar3 = (defpackage.jxp) aladVarP;
                aooh.f(jxpVar3, "value");
                java.lang.Object obj4 = this.a;
                akzx akzxVar3 = (akzx) ((defpackage.jhw) obj4).a;
                akzxVar3.u();
                defpackage.jxs jxsVar = (defpackage.jxs) akzxVar3.b;
                defpackage.jxs jxsVar2 = defpackage.jxs.a;
                j$.util.Objects.requireNonNull(jxpVar3);
                jxsVar.c = jxpVar3;
                jxsVar.b |= 1;
                defpackage.lwx lwxVar = new defpackage.lwx(new defpackage.npi(obj4, 9), 16);
                if (true == optional.isPresent()) {
                    lwxVar.a.a(optional.get());
                }
                return aojh.a;
            case 8:
                defpackage.jxr jxrVar = (defpackage.jxr) obj;
                aooh.f(jxrVar, "it");
                aooh.f(jxrVar, "value");
                akzx akzxVar4 = (akzx) ((defpackage.jhw) this.a).a;
                akzxVar4.u();
                defpackage.jxs jxsVar3 = (defpackage.jxs) akzxVar4.b;
                defpackage.jxs jxsVar4 = defpackage.jxs.a;
                jxsVar3.f = jxrVar.c;
                jxsVar3.b |= 8;
                return aojh.a;
            case 9:
                defpackage.opc opcVar = (defpackage.opc) obj;
                aooh.f(opcVar, "it");
                java.lang.String str = opcVar.c;
                aooh.e(str, "getFormattedAddress(...)");
                aooh.f(str, "value");
                akzx akzxVar5 = (akzx) ((defpackage.jhw) this.a).a;
                akzxVar5.u();
                defpackage.jxs jxsVar5 = (defpackage.jxs) akzxVar5.b;
                defpackage.jxs jxsVar6 = defpackage.jxs.a;
                j$.util.Objects.requireNonNull(str);
                jxsVar5.b |= 2;
                jxsVar5.d = str;
                return aojh.a;
            case 10:
                if (!((java.lang.Boolean) obj).booleanValue() && ((zms) this.a).a() == zmw.a) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 11:
                return java.lang.Boolean.valueOf(!((defpackage.obd) this.a).h.get());
            case 12:
                java.lang.String str2 = (java.lang.String) obj;
                aooh.f(str2, "it");
                aooh.f(str2, "value");
                akzx akzxVar6 = (akzx) ((defpackage.heq) this.a).a;
                akzxVar6.u();
                defpackage.obf obfVar = (defpackage.obf) akzxVar6.b;
                defpackage.obf obfVar2 = defpackage.obf.a;
                j$.util.Objects.requireNonNull(str2);
                obfVar.b |= 512;
                obfVar.l = str2;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.oeu oeuVar = (defpackage.oeu) obj;
                java.lang.String string4 = ((android.content.Context) this.a).getString(oeuVar.e);
                aooh.e(string4, "getString(...)");
                oyxVar = new oyx(new pne(string4, java.lang.Integer.valueOf(oeuVar.g)));
                return oyxVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return a.J((java.lang.String) this.a, (diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.aes aesVar = (defpackage.aes) obj;
                aooh.f(aesVar, "$this$AnimatedContent");
                ?? r14 = this.a;
                oyxVar = new afo(aga.n(r14.a(), 2), aga.o(r14.a(), 2), (ahu) null, 12);
                aesVar.a(oyxVar, uu.d(2));
                return oyxVar;
            case 16:
                defpackage.ojg ojgVar = (defpackage.ojg) obj;
                aooh.f(ojgVar, "it");
                ysc yscVar = ojgVar.a;
                float f = ojgVar.b;
                java.lang.Object obj5 = this.a;
                defpackage.oji ojiVar = (defpackage.oji) obj5;
                android.widget.LinearLayout linearLayoutA = ojiVar.a();
                aooh.e(linearLayoutA, "<get-aiCoreModelAvailabilityContainer>(...)");
                yta ytaVar = yscVar.a;
                switch (ytaVar.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                        i = 8;
                        break;
                    default:
                        throw new aois();
                }
                linearLayoutA.setVisibility(i);
                defpackage.ojl ojlVar = ojiVar.d;
                android.widget.TextView textView = (android.widget.TextView) ojlVar.findViewById(2131427442);
                switch (ytaVar.ordinal()) {
                    case 0:
                        string = ojlVar.getContext().getString(2132017307);
                        break;
                    case 1:
                    case 3:
                    case 4:
                        string = ojlVar.getContext().getString(2132017305);
                        break;
                    case 2:
                    case 5:
                    case 6:
                        string = null;
                        break;
                    default:
                        throw new aois();
                }
                textView.setText(string);
                android.widget.TextView textView2 = (android.widget.TextView) ojlVar.findViewById(2131427441);
                java.lang.Float fValueOf = java.lang.Float.valueOf(f);
                switch (ytaVar.ordinal()) {
                    case 0:
                        string2 = ojlVar.getContext().getString(2132017306);
                        break;
                    case 1:
                    case 2:
                        string2 = ojlVar.getContext().getString(2132017303);
                        break;
                    case 3:
                        string2 = ojlVar.getContext().getString(2132017304);
                        break;
                    case 4:
                        string2 = ojlVar.getContext().getString(2132017302, java.lang.Float.valueOf(fValueOf.floatValue()));
                        break;
                    case 5:
                    case 6:
                        string2 = null;
                        break;
                    default:
                        throw new aois();
                }
                textView2.setText(string2);
                if (ytaVar == yta.e || ytaVar == yta.b) {
                    ojiVar.a().setEnabled(false);
                }
                ojiVar.a().setOnClickListener(new qgq(yscVar, obj5, 1, (byte[]) null));
                android.widget.LinearLayout linearLayoutB = ojiVar.b();
                aooh.e(linearLayoutB, "<get-astreaNeedsUpdateContainer>(...)");
                linearLayoutB.setVisibility(true != yscVar.b ? 0 : 8);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.media.Ringtone ringtone = (android.media.Ringtone) obj;
                aooh.c(ringtone);
                defpackage.ogj ogjVar2 = (defpackage.ogj) this.a;
                ogjVar = new defpackage.ogj((zjv) ogjVar2.c, (mgu) ogjVar2.b, ringtone);
                return ogjVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                android.media.Ringtone ringtone2 = (android.media.Ringtone) obj;
                aooh.c(ringtone2);
                defpackage.ogj ogjVar3 = (defpackage.ogj) this.a;
                ogjVar = new defpackage.ogj((zjv) ogjVar3.c, (mgu) ogjVar3.b, ringtone2);
                return ogjVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((oko) this.a).k.a((android.telecom.PhoneAccountHandle) null, (android.telephony.TelephonyManager) obj);
            default:
                ajzi ajziVar = (ajzi) obj;
                ((mgu) ((aogc) this.a).c).d(new defpackage.ljc(ajziVar, 2)).a(mgv.fc).d(new defpackage.old(0));
                aooh.c(ajziVar);
                throw ajziVar;
        }
    }
}
