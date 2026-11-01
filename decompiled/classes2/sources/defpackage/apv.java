package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class apv implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ apv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [bgw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [aowi, java.lang.Object] */
    public final java.lang.Object a() {
        int i = 20;
        switch (this.$cid) {
            case 0:
                defpackage.apy apyVar = (defpackage.apy) this.a;
                return new aoiu(apyVar.p(), apyVar.k());
            case 1:
                return ((defpackage.apy) this.a).p();
            case 2:
                java.lang.Object objM = this.a.m();
                return (defpackage.ase) (true != (objM instanceof aowl) ? objM : null);
            case 3:
                return java.lang.Boolean.valueOf(((ato) this.a).c == aso.a);
            case 4:
                java.lang.Object objM2 = this.a.m();
                return (defpackage.atz) (true != (objM2 instanceof aowl) ? objM2 : null);
            case 5:
                return java.lang.Boolean.valueOf(((ato) this.a).c == aso.a);
            case 6:
                return new defpackage.bbt((aonj) this.a.a());
            case 7:
                return java.lang.Integer.valueOf(((defpackage.bcb) ((defpackage.bcl) this.a).d.a()).j);
            case 8:
                return new rai(this.a, (byte[]) null);
            case 9:
                dat datVar = ((bdu) this.a).b;
                if (datVar != null) {
                    cfo.w(datVar);
                }
                return aojh.a;
            case 10:
                return this.a;
            case 11:
                defpackage.bfw bfwVar = (defpackage.bfw) this.a;
                bfwVar.k.a(java.lang.Boolean.valueOf(!bfwVar.j));
                return aojh.a;
            case 12:
                return java.lang.Long.valueOf(((defpackage.blz) this.a).a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return java.lang.Long.valueOf(((defpackage.blz) this.a).a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return this.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj = this.a;
                return java.lang.Boolean.valueOf(obj != null ? ((java.lang.Boolean) new defpackage.apv(obj, i).a()).booleanValue() : false);
            case 16:
                java.lang.Object obj2 = this.a;
                return java.lang.Boolean.valueOf(obj2 != null ? ((java.lang.Boolean) new defpackage.apv(obj2, i).a()).booleanValue() : false);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ?? r5 = this.a;
                if (r5 != 0) {
                    return (java.util.List) r5.a();
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.a.d();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.a.a();
                return aojh.a;
            default:
                defpackage.bgy bgyVar = (defpackage.bgy) this.a;
                dji djiVar = bgyVar.b;
                dkw dkwVarA = bgyVar.a();
                return java.lang.Boolean.valueOf(aooh.n(djiVar, dkwVarA != null ? dkwVarA.a.a : null));
        }
    }
}
