package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class idc implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ idc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
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

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v82, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        ajbg ajbgVarFindAny;
        int i = 8;
        switch (this.$cid) {
            case 0:
                ((defpackage.idh) this.a).e.a(qbc.hs);
                return ((defpackage.iax) obj).e((j$.time.Duration) this.b);
            case 1:
                ((defpackage.idh) this.a).e.a(qbc.hs);
                return ((defpackage.iax) obj).f((j$.time.Duration) this.b);
            case 2:
                ((defpackage.idh) this.a).e.a(qbc.hs);
                return ((defpackage.iax) obj).d((j$.time.Duration) this.b);
            case 3:
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                defpackage.kiw kiwVar = ((kiu) this.a).r;
                if (kiwVar == null) {
                    kiwVar = defpackage.kiw.a;
                }
                rmt rmtVarB = rmt.b(kiwVar.o);
                if (rmtVarB == null) {
                    rmtVarB = rmt.a;
                }
                java.lang.Object obj2 = this.b;
                aooh.f(phoneAccountHandle, "phoneAccountHandle");
                return java.lang.Boolean.valueOf(((sry) ((aeqx) obj2).j).a(rmtVarB, phoneAccountHandle, false));
            case 4:
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj;
                aooh.f(phoneAccountHandle2, "handle");
                java.lang.Object obj3 = this.a;
                defpackage.nwb nwbVar = (defpackage.nwb) obj3;
                oko okoVar = nwbVar.c;
                return ahvr.I(aosv.F(okoVar.b, 0, new defpackage.ofa(okoVar, phoneAccountHandle2, (aoln) null, 9), 3), new defpackage.ljp(obj3, this.b, 10), nwbVar.e);
            case 5:
                long jIntValue = ((java.lang.Integer) this.b).intValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                j$.lang.Iterable.-EL.forEach(((defpackage.nzj) obj).b, new defpackage.fcg(arrayList, 14));
                defpackage.nzg nzgVar = ((nzh) this.a).c;
                ahrv ahrvVarQ = ahvr.Q(new defpackage.ibi(nzgVar, arrayList, 18), nzgVar.b);
                defpackage.jwi jwiVar = new defpackage.jwi(nzgVar, jIntValue, i);
                ajct ajctVar = nzgVar.c;
                return ahrvVarQ.i(jwiVar, ajctVar).h(new lix(16), ajctVar);
            case 6:
                qig qigVar = new qig();
                qigVar.c(qio.g);
                qigVar.e(j$.util.Optional.of(this.b));
                qigVar.d((j$.util.Optional) this.a);
                qigVar.b((java.lang.CharSequence) obj);
                return qigVar.a();
            case 7:
                return ((android.content.Context) this.a).getString(2132017942, (java.lang.String) obj, this.b);
            case 8:
                java.lang.String str = (java.lang.String) obj;
                defpackage.idc idcVar = new defpackage.idc(this.a, str, 7);
                java.lang.Object objOfNullable = this.b;
                j$.util.Optional optional = (j$.util.Optional) objOfNullable;
                if (true == optional.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(((android.content.Context) idcVar.a).getString(2132017942, (java.lang.String) optional.get(), idcVar.b));
                }
                return (java.lang.String) ((j$.util.Optional) objOfNullable).orElse(str);
            case 9:
                ajbgVarFindAny = j$.util.Collection.-EL.stream((java.util.Collection) this.b).filter(new ree(((android.telephony.SubscriptionInfo) obj).getIccId(), 2)).findAny();
                qkv qkvVar = new qkv(this.a, 19);
                if (true == ajbgVarFindAny.isPresent()) {
                    return j$.util.Optional.ofNullable(aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) ((android.content.Context) qkvVar.a).getSystemService(android.app.NotificationManager.class), (java.lang.String) ajbgVarFindAny.get()));
                }
                break;
            case 10:
                return ((srv) this.b).a.eU(ahqx.i(new qfb((ssm) obj, this.a, 19, (byte[]) null)));
            case 11:
                ajbgVarFindAny = new android.content.Intent();
                ajbgVarFindAny.setClassName((android.content.Context) ((tvn) this.b).a, "com.android.dialer.shortcuts.CallContactActivity");
                ajbgVarFindAny.setData((android.net.Uri) this.a);
                ajbgVarFindAny.setAction("com.android.dialer.shortcuts.CALL_CONTACT");
                break;
            case 12:
                return ((val) obj).c((android.telecom.PhoneAccountHandle) this.a, ((akzx) this.b).p());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                vcc vccVar = (vcc) obj;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) this.a;
                ajcq ajcqVarD = vccVar.d(phoneAccountHandle3);
                ajcq ajcqVarA = vccVar.a(phoneAccountHandle3);
                return ahvr.ak(new ajcq[]{ajcqVarD, ajcqVarA}).o(new uwl(ajcqVarD, ajcqVarA, 12), (java.util.concurrent.Executor) ((zth) this.b).d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                vcc vccVar2 = (vcc) obj;
                java.lang.Object obj4 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle4 = (android.telecom.PhoneAccountHandle) obj4;
                ajcq ajcqVarD2 = vccVar2.d(phoneAccountHandle4);
                ajcq ajcqVarA2 = vccVar2.a(phoneAccountHandle4);
                ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarD2, ajcqVarA2});
                uwl uwlVar = new uwl(ajcqVarD2, ajcqVarA2, 11);
                ?? r10 = ((zth) this.b).d;
                return ahrv.g(ahdaVarAk.o(uwlVar, (java.util.concurrent.Executor) r10)).i(new vcu(vccVar2, obj4, 0), (java.util.concurrent.Executor) r10);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                vcg vcgVar = (vcg) obj;
                java.lang.Object obj5 = this.a;
                ahrv ahrvVarG = ahrv.g(vcgVar.m((android.telecom.PhoneAccountHandle) obj5));
                java.lang.Object obj6 = this.b;
                return ahrvVarG.i(new sue(obj6, obj5, vcgVar, 17, (byte[]) null), ((vea) obj6).d);
            case 16:
                return ((vfu) this.b).c.c((vdd) obj, (android.telecom.PhoneAccountHandle) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ajbgVarFindAny = new ajbg(((vcc) obj).g((android.telecom.PhoneAccountHandle) this.a, (j$.util.Optional) this.b));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.String str2 = ((vgm) obj).e;
                if (str2.indexOf(64) != -1) {
                    return aiql.z(j$.util.Optional.of(vkj.f(str2.substring(0, str2.indexOf(64)))));
                }
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                a.bI(vkj.a.d(), "Invalid IMAP username", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/AccountSubscriber", "getNumber", (char) 486, "AccountSubscriber.java", zct.b);
                return ((vkj) obj8).c((android.telecom.PhoneAccountHandle) obj7);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ahvr.H(((vcg) obj).h((android.telecom.PhoneAccountHandle) this.a), new vmj(4), (java.util.concurrent.Executor) ((ahbv) this.b).g);
            default:
                akzx akzxVarM = quf.a.m();
                qug qugVar = qug.v;
                akzxVarM.u();
                quf qufVar = akzxVarM.b;
                qufVar.e = qugVar.H;
                qufVar.b |= 1;
                akzxVarM.u();
                quf qufVar2 = akzxVarM.b;
                qufVar2.c = 2;
                qufVar2.d = 2131231550;
                android.content.Context context = (android.content.Context) this.a;
                java.lang.String string = context.getString(2132017425);
                akzxVarM.u();
                quf qufVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                qufVar3.b |= 4;
                qufVar3.g = string;
                java.lang.String string2 = context.getString(2132017424);
                akzxVarM.u();
                quf qufVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                qufVar4.b |= 8;
                qufVar4.h = string2;
                java.lang.Object obj9 = this.b;
                zpo zpoVar = zpo.f;
                akzxVarM.u();
                quf qufVar5 = akzxVarM.b;
                qufVar5.b |= 16;
                qufVar5.i = obj9 == zpoVar;
                que queVar = que.c;
                akzxVarM.u();
                quf qufVar6 = akzxVarM.b;
                qufVar6.l = queVar.g;
                qufVar6.b |= 512;
                return akzxVarM.p();
        }
        return ajbgVarFindAny;
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

    public /* synthetic */ idc(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
