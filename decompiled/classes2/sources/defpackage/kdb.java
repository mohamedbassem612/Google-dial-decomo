package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kdb implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kdb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v62, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v66, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 8;
        boolean z = false;
        z = false;
        switch (this.$cid) {
            case 0:
                return ((kdd) ((ahbv) this.a).f).b(((kiv) obj).b);
            case 1:
                alat alatVar = ((kiv) obj).b;
                ahbv ahbvVar = (ahbv) this.a;
                return ahvr.H(((kdd) ahbvVar.f).c(alatVar), new defpackage.jvq(i), (java.util.concurrent.Executor) ahbvVar.e);
            case 2:
                return ((kdd) ((ahbv) this.a).f).b(((kiv) obj).b);
            case 3:
                alat alatVar2 = ((kiv) obj).b;
                ahbv ahbvVar2 = (ahbv) this.a;
                return ahvr.H(((kdd) ahbvVar2.f).c(alatVar2), new defpackage.jvq(i), (java.util.concurrent.Executor) ahbvVar2.e);
            case 4:
                return this.a.a(obj);
            case 5:
                return ((tkl) obj).a((kiu) this.a);
            case 6:
                return ((aogc) obj).bc((kiu) this.a);
            case 7:
                return ((tkl) obj).a((kiu) this.a);
            case 8:
                return ((aogc) obj).bc((kiu) this.a);
            case 9:
                return ((kaw) obj).w((kiu) this.a);
            case 10:
                return defpackage.adnw.a((java.io.File) obj, ((defpackage.llw) this.a).b);
            case 11:
                return defpackage.adnw.a((java.io.File) obj, (java.lang.String) this.a);
            case 12:
                adnm adnmVar = (adnm) obj;
                java.lang.Object obj2 = this.a;
                ahoq ahoqVarW = ahvr.W(283, "CallScreenSession_getCallAvatarSessionManagerAfterInitialization");
                try {
                    ajcq ajcqVarH = ahvr.H(adnmVar.b(adoa.a), new defpackage.lgd(adnmVar, z ? 1 : 0), ((defpackage.lgg) obj2).e);
                    ahoqVarW.a(ajcqVarH);
                    ahoqVarW.close();
                    return ajcqVarH;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                akzx akzxVarP = ((defpackage.lcj) obj).p();
                akzxVarP.u();
                defpackage.lcj lcjVar = (defpackage.lcj) akzxVarP.b;
                java.lang.String str = ((defpackage.lgv) this.a).d;
                j$.util.Objects.requireNonNull(str);
                lcjVar.b |= 16;
                lcjVar.c = str;
                return (defpackage.lcj) akzxVarP.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return a.l((aonj) this.a, obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((oko) this.a).E(((android.telephony.SubscriptionInfo) obj).getSubscriptionId());
            case 16:
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.Object obj3 = this.a;
                if (obj3 != null && ((java.lang.String) obj3).equals(str2)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return this.a.a(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return this.a.a(obj);
            default:
                return ((zmn) this.a).c((android.telecom.PhoneAccountHandle) obj);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
