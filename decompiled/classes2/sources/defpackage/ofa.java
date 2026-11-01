package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ofa extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(tkl tklVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tklVar;
        this.b = "Dialer:AudioPlayback";
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r7v105, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v82, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.hardware.display.DisplayManager$DisplayListener, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        amts amtsVar;
        java.lang.Integer num;
        pyw pywVar;
        int i = 1;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ((defpackage.ofc) this.a).d = (amql) this.b;
                return aojh.a;
            case 1:
                aooc.af(obj);
                java.lang.Object obj2 = this.a;
                aooh.f(obj2, "key");
                defpackage.oeu oeuVar = defpackage.oeu.URGENT;
                int iOrdinal = ((defpackage.oeu) obj2).ordinal();
                if (iOrdinal == 0) {
                    amtsVar = amts.b;
                } else if (iOrdinal == 1) {
                    amtsVar = amts.c;
                } else if (iOrdinal == 2) {
                    amtsVar = amts.d;
                } else {
                    if (iOrdinal != 3) {
                        throw new aois();
                    }
                    amtsVar = amts.e;
                }
                return java.lang.Boolean.valueOf(((defpackage.oez) this.b).b.add(amtsVar));
            case 2:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.ofc) this.a).b.add(this.b));
            case 3:
                aooc.af(obj);
                j$.util.Optional optionalOf = j$.util.Optional.of(this.b);
                aooh.e(optionalOf, "of(...)");
                tpf tpfVar = (tpf) this.a;
                tpfVar.d = optionalOf;
                ((zpz) tpfVar.b).a(ajcm.a);
                return aojh.a;
            case 4:
                aooc.af(obj);
                ((tkl) this.b).n((android.hardware.display.DisplayManager.DisplayListener) this.a);
                return aojh.a;
            case 5:
                aooc.af(obj);
                oju ojuVar = (oju) this.b;
                android.media.AudioManager audioManager = ojuVar.f;
                android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) this.a;
                boolean zM = mp$.ExternalSyntheticApiModelOutline0.m(audioManager, audioDeviceInfo);
                zjv.i(ojuVar.d, mgv.dI, ajsz.aY(gus.au(audioDeviceInfo.getType())), gus.ax(zM), 0, 24);
                return java.lang.Boolean.valueOf(zM);
            case 6:
                aooc.af(obj);
                return ((tkl) this.a).i((java.lang.String) this.b);
            case 7:
                aooc.af(obj);
                return new java.lang.Integer(((okj) this.b).b((android.telecom.PhoneAccountHandle) this.a));
            case 8:
                aooc.af(obj);
                return ((okj) this.b).c((android.telecom.PhoneAccountHandle) this.a);
            case 9:
                aooc.af(obj);
                try {
                    java.lang.Object obj3 = this.b;
                    num = (java.lang.Integer) new mgr(((oko) obj3).h(), new java.lang.Integer(baa$.ExternalSyntheticApiModelOutline1.m(((oko) obj3).j, (android.telecom.PhoneAccountHandle) this.a))).b(mgv.bW).d(new defpackage.old(i));
                    break;
                } catch (java.lang.SecurityException e) {
                    oko.a.d().k(e).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "getSubscriptionId$<anonymous>", 1647, "DialerTelephony.kt").v("TelephonyManager.getSubscriptionId called without permission.");
                    num = new java.lang.Integer(-1);
                }
                aooh.c(num);
                return num;
            case 10:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((oko) this.a).X((java.lang.String) this.b));
            case 11:
                aooc.af(obj);
                return aooh.q(((oko) this.b).D((android.telecom.PhoneAccountHandle) this.a));
            case 12:
                aooc.af(obj);
                return ((oko) this.b).D((android.telecom.PhoneAccountHandle) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                return ((oko) this.b).i((android.telecom.PhoneAccountHandle) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                aify aifyVar = ((ahau) this.b).a;
                ahap ahapVar = ahap.a;
                if (!aifyVar.contains(ahapVar)) {
                    ahar aharVar = ahas.d;
                    aooh.e(aharVar, "NO_DATA");
                    return aharVar;
                }
                java.util.List listH = ((aprf) ((defpackage.mzi) this.a).a).h();
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listH, 10));
                java.util.Iterator it = listH.iterator();
                while (it.hasNext()) {
                    arrayList.add(((akzc) it.next()).A());
                }
                java.lang.String string = arrayList.toString();
                ahaq ahaqVarA = ahar.a();
                ahaqVarA.b(false);
                ahaqVarA.a = ahapVar;
                ahaqVarA.c(akzc.w(string));
                return ahaqVarA.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                java.lang.String action = ((android.content.Intent) this.a).getAction();
                aimz aimzVar = owh.a;
                aimzVar.b().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoReceiver", "onReceive$<anonymous>", 31, "PostCallAnswerMethodPromoReceiver.kt").y("onReceive action: %s", action);
                if (aooh.n(action, "com.android.dialer.incall.answer.method.promo.postcall.ACTION_DISMISSED")) {
                    ((owh) this.b).b.o(rmx.Bh);
                } else {
                    aimzVar.d().l("com/android/dialer/incall/answer/method/promo/postcall/PostCallAnswerMethodPromoReceiver", "onReceive$<anonymous>", 37, "PostCallAnswerMethodPromoReceiver.kt").y("Unknown action: %s", action);
                }
                return aojh.a;
            case 16:
                aooc.af(obj);
                this.b.a(this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooc.af(obj);
                peh pehVar = (peh) this.a;
                pehVar.f.a();
                if (pehVar.e) {
                    ((ccp) ((aoot) this.b).a).b(java.lang.Boolean.TRUE);
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooc.af(obj);
                ((pqa) this.b).b.a(this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooc.af(obj);
                pzg pzgVar = (pzg) this.b;
                aoiu aoiuVar = pzgVar.e;
                if ((aoiuVar != null ? (pzd) aoiuVar.a : null) == this.a) {
                    if (((aoiuVar == null || (pywVar = (pyw) aoiuVar.b) == null) ? null : pywVar.b) instanceof pyy) {
                        pzgVar.b();
                    }
                    pzgVar.e = null;
                }
                pzgVar.d--;
                return aojh.a;
            default:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((pzm) this.a).c.add(this.b));
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.hardware.display.DisplayManager$DisplayListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.ofa((defpackage.ofc) this.a, (amql) this.b, aolnVar, 0);
            case 1:
                return new defpackage.ofa((defpackage.oez) this.b, (defpackage.oeu) this.a, aolnVar, 1);
            case 2:
                return new defpackage.ofa((defpackage.ofc) this.a, (java.lang.String) this.b, aolnVar, 2);
            case 3:
                return new defpackage.ofa((tpf) this.a, (qtz) this.b, aolnVar, 3);
            case 4:
                return new defpackage.ofa((tkl) this.b, (android.hardware.display.DisplayManager.DisplayListener) this.a, aolnVar, 4);
            case 5:
                return new defpackage.ofa((oju) this.b, (android.media.AudioDeviceInfo) this.a, aolnVar, 5);
            case 6:
                return new defpackage.ofa((tkl) this.a, aolnVar, 6);
            case 7:
                return new defpackage.ofa((okj) this.b, (android.telecom.PhoneAccountHandle) this.a, aolnVar, 7);
            case 8:
                return new defpackage.ofa((okj) this.b, (android.telecom.PhoneAccountHandle) this.a, aolnVar, 8, (byte[]) null);
            case 9:
                return new defpackage.ofa((oko) this.b, (android.telecom.PhoneAccountHandle) this.a, aolnVar, 9);
            case 10:
                return new defpackage.ofa((oko) this.a, (java.lang.String) this.b, aolnVar, 10);
            case 11:
                return new defpackage.ofa((oko) this.b, (android.telecom.PhoneAccountHandle) this.a, aolnVar, 11, (byte[]) null);
            case 12:
                return new defpackage.ofa((oko) this.b, (android.telecom.PhoneAccountHandle) this.a, aolnVar, 12, (char[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.ofa((oko) this.b, (android.telecom.PhoneAccountHandle) this.a, aolnVar, 13, (short[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.ofa((ahau) this.b, (defpackage.mzi) this.a, aolnVar, 14);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.ofa((android.content.Intent) this.a, (owh) this.b, aolnVar, 15);
            case 16:
                return new defpackage.ofa((aonj) this.b, (ouj) this.a, aolnVar, 16);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.ofa((peh) this.a, (aoot) this.b, aolnVar, 17);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.ofa((pqa) this.b, (pom) this.a, aolnVar, 18);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.ofa((pzg) this.b, (pzd) this.a, aolnVar, 19);
            default:
                return new defpackage.ofa((pzm) this.a, (ampy) this.b, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(android.content.Intent intent, owh owhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = intent;
        this.b = owhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(aonj aonjVar, ouj oujVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = aonjVar;
        this.a = oujVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(defpackage.oez oezVar, defpackage.oeu oeuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = oezVar;
        this.a = oeuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(defpackage.ofc ofcVar, amql amqlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ofcVar;
        this.b = amqlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(defpackage.ofc ofcVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ofcVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(oju ojuVar, android.media.AudioDeviceInfo audioDeviceInfo, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ojuVar;
        this.a = audioDeviceInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(okj okjVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = okjVar;
        this.a = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(okj okjVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = okjVar;
        this.a = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(oko okoVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = okoVar;
        this.a = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(oko okoVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = okoVar;
        this.a = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(oko okoVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = okoVar;
        this.a = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(oko okoVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = okoVar;
        this.a = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(oko okoVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okoVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(peh pehVar, aoot aootVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = pehVar;
        this.b = aootVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(pqa pqaVar, pom pomVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = pqaVar;
        this.a = pomVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(pzg pzgVar, pzd pzdVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = pzgVar;
        this.a = pzdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(pzm pzmVar, ampy ampyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = pzmVar;
        this.b = ampyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(tkl tklVar, android.hardware.display.DisplayManager.DisplayListener displayListener, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tklVar;
        this.a = displayListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(ahau ahauVar, defpackage.mzi mziVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ahauVar;
        this.a = mziVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofa(tpf tpfVar, qtz qtzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tpfVar;
        this.b = qtzVar;
    }
}
