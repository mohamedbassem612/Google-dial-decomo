package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class rmg implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rmg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aoin, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return this.a;
            case 1:
                return (defpackage.ahlb) this.a.a();
            case 2:
                return ((defpackage.rpa) this.a.a()).g;
            case 3:
                return this.a;
            case 4:
                return (defpackage.rns) this.a.a();
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return (defpackage.ahlb) this.a.a();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return this.a;
            case 17:
                return ((defpackage.sww) defpackage.agab.aH(((com.android.dialer.revelio.impl.tidepods.impl.TidepodsRevelioTipsContentProvider) this.a).getContext(), defpackage.sww.class)).mY();
            case 18:
                defpackage.aiyy aiyyVar = new defpackage.aiyy();
                aiyyVar.a = new exm(this.a, 16);
                return new defpackage.adcq(aiyyVar);
            case 19:
                return (defpackage.rnt) this.a.a();
            default:
                defpackage.iot iotVar = defpackage.tsc.b;
                java.lang.Object obj = this.a;
                defpackage.iqf tsaVar = new tsa(obj, 0);
                defpackage.tsc tscVar = (defpackage.tsc) obj;
                return tscVar.c.b(iotVar, tsaVar, new tsb(tscVar));
        }
    }
}
