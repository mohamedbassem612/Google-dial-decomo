package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uoe implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ uoe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [aoin, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return this.a;
            case 1:
                defpackage.aiyy aiyyVar = new defpackage.aiyy();
                j$.util.Objects.requireNonNull(this.a);
                aiyyVar.a = new defpackage.tzo(0);
                return new defpackage.adcq(aiyyVar);
            case 2:
                defpackage.aiyy aiyyVar2 = new defpackage.aiyy();
                java.lang.Object obj = this.a;
                j$.util.Objects.requireNonNull(obj);
                aiyyVar2.a = new exm(obj, 18);
                return new defpackage.adcq(aiyyVar2);
            case 3:
                return (defpackage.aguq) this.a.a();
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return this.a;
        }
    }
}
