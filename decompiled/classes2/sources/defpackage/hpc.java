package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hpc implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ hpc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v39, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v41, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v43, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v45, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v49, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v55, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v57, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v59, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v66, types: [android.content.Context, com.android.dialer.calloptions.ui.CallOptionsActivity] */
    /* JADX WARN: Type inference failed for: r2v15, types: [aonj, java.lang.Object] */
    public final java.lang.Object a() {
        defpackage.mba mbaVar;
        switch (this.$cid) {
            case 0:
                zmw zmwVar = (zmw) this.b;
                int iOrdinal = zmwVar.ordinal();
                java.lang.Object obj = this.a;
                if (iOrdinal == 0) {
                    qbe qbeVarD = ((defpackage.hpf) obj).d();
                    if (qbeVarD != null) {
                        qbeVarD.a(qbc.mx);
                    }
                } else if (iOrdinal == 2) {
                    qbe qbeVarD2 = ((defpackage.hpf) obj).d();
                    if (qbeVarD2 != null) {
                        qbeVarD2.a(qbc.mw);
                    }
                } else {
                    if (iOrdinal != 3) {
                        throw new java.lang.AssertionError("Unexpected Audio Route");
                    }
                    qbe qbeVarD3 = ((defpackage.hpf) obj).d();
                    if (qbeVarD3 != null) {
                        qbeVarD3.a(qbc.mv);
                    }
                }
                ((defpackage.hpf) obj).b.e(zmwVar);
                return aojh.a;
            case 1:
                java.lang.Object obj2 = this.a;
                aooh.c(obj2);
                defpackage.hpf hpfVar = (defpackage.hpf) this.b;
                qbe qbeVarD4 = hpfVar.d();
                if (qbeVarD4 != null) {
                    qbeVarD4.a(qbc.my);
                }
                zmu zmuVar = new zmu();
                zmuVar.a = zmw.b;
                zmuVar.b(j$.util.Optional.ofNullable(obj2));
                hpfVar.b.d(zmuVar.a());
                return aojh.a;
            case 2:
                java.lang.Object obj3 = this.a;
                defpackage.inu inuVar = (defpackage.inu) this.b;
                aoov.an(inuVar.c, (aolr) null, 0, new defpackage.inm(inuVar, (igf) obj3, (aoln) null, 2, (byte[]) null), 3);
                return aojh.a;
            case 3:
                defpackage.isr isrVar = (defpackage.isr) this.a;
                wsc wscVar = (wsc) aooh.q(isrVar.c);
                java.lang.Object obj4 = this.b;
                if (wscVar != null) {
                    wsc.bf(isrVar.b, ((defpackage.iss) obj4).b);
                }
                isrVar.d.o(((defpackage.iss) obj4).c ? rmx.wR : rmx.wO);
                return aojh.a;
            case 4:
                ((defpackage.iyi) this.b).c(((defpackage.ixu) this.a).d);
                return aojh.a;
            case 5:
                java.lang.String str = ((defpackage.ixf) this.a).b;
                aooh.e(str, "getId(...)");
                ((defpackage.iyi) this.b).b(str);
                return aojh.a;
            case 6:
                defpackage.ixf ixfVar = (defpackage.ixf) this.a;
                java.lang.String str2 = ixfVar.b;
                aooh.e(str2, "getId(...)");
                java.lang.String str3 = ixfVar.e;
                aooh.e(str3, "getName(...)");
                defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "showRenameDialog", 410, "BeeslyGreetingSettingsFragmentPeer.kt").y("showRenameDialog: id=%s", str2);
                akzx akzxVarM = defpackage.izo.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str2, "value");
                akzxVarM.u();
                defpackage.izo izoVar = (defpackage.izo) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                izoVar.b = str2;
                aooh.f(str3, "value");
                akzxVarM.u();
                defpackage.izo izoVar2 = (defpackage.izo) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                izoVar2.c = str3;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.izo izoVar3 = (defpackage.izo) aladVarP;
                aooh.f(izoVar3, "args");
                defpackage.iyn iynVar = new defpackage.iyn();
                amxr.g(iynVar);
                ahgl.b(iynVar, izoVar3);
                iynVar.r(((defpackage.iyi) this.b).b.I(), "BeeslyRenameDialog");
                return aojh.a;
            case 7:
                java.lang.String str4 = ((defpackage.ixf) this.a).b;
                aooh.e(str4, "getId(...)");
                defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "showDeleteConfirmDialog", 423, "BeeslyGreetingSettingsFragmentPeer.kt").y("showDeleteConfirmDialog: id=%s", str4);
                akzx akzxVarM2 = defpackage.iyr.a.m();
                aooh.f(akzxVarM2, "builder");
                aooh.f(str4, "value");
                akzxVarM2.u();
                defpackage.iyr iyrVar = (defpackage.iyr) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                iyrVar.b = str4;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.iyr iyrVar2 = (defpackage.iyr) aladVarP2;
                aooh.f(iyrVar2, "args");
                defpackage.ixy ixyVar = new defpackage.ixy();
                amxr.g(ixyVar);
                ahgl.b(ixyVar, iyrVar2);
                ixyVar.r(((defpackage.iyi) this.b).b.I(), "BeeslyDeleteDialog");
                return aojh.a;
            case 8:
                java.lang.String str5 = ((defpackage.ixe) this.a).b;
                aooh.e(str5, "getId(...)");
                ((defpackage.iyi) this.b).b(str5);
                return aojh.a;
            case 9:
                a.E((ccp) this.a, false);
                this.b.a();
                return aojh.a;
            case 10:
                a.E((ccp) this.a, false);
                this.b.a();
                return aojh.a;
            case 11:
                a.E((ccp) this.a, false);
                this.b.a();
                return aojh.a;
            case 12:
                ((defpackage.jad) this.a).b.a();
                this.b.a(defpackage.jac.c);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.jad) this.a).c.a();
                this.b.a(defpackage.jac.b);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.jad) this.a).d.a();
                this.b.a(defpackage.jac.d);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj5 = this.a;
                java.lang.String str6 = ((defpackage.jhq) this.b).a;
                if (str6 == null) {
                    mbaVar = null;
                } else {
                    j$.util.Optional optionalE = ((zpm) ((defpackage.jho) obj5).d.a).e(str6);
                    defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(5), 11);
                    if (true == optionalE.isPresent()) {
                        optionalE = j$.util.Optional.ofNullable(hvdVar.a.a(optionalE.get()));
                    }
                    aooh.e(optionalE, "map(...)");
                    mbaVar = (defpackage.mba) aooh.q(optionalE);
                }
                if (mbaVar != null) {
                    mbaVar.b(mce.hT);
                }
                defpackage.jho jhoVar = (defpackage.jho) obj5;
                aoov.an(jhoVar.c, (aolr) null, 0, new defpackage.jcu(jhoVar, str6, (aoln) null, 7), 3);
                return aojh.a;
            case 16:
                this.b.a(new defpackage.kbt(java.lang.Long.valueOf(((defpackage.kbx) this.a).a)));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.b.a(new defpackage.kbq(new kcy((kiu) this.a)));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.kbx kbxVar = (defpackage.kbx) this.a;
                this.b.a(new defpackage.kbo(kbxVar.k.a, kbxVar.n));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((defpackage.kpu) this.a).c.c((yse) this.b);
                return aojh.a;
            default:
                defpackage.ksv ksvVar = (defpackage.ksv) this.a;
                ksvVar.i = 4;
                ksvVar.e.o(rmx.AU);
                android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                intent.setType("vnd.android.cursor.item/contact");
                intent.putExtra("phone", (java.lang.String) this.b);
                ?? r11 = ksvVar.b;
                ahqx.l((android.content.Context) r11, intent);
                r11.finish();
                return aojh.a;
        }
    }

    public /* synthetic */ hpc(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
