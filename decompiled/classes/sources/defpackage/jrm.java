package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jrm implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jrm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [aoin, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                return this.a;
            case 10:
                return (defpackage.rnt) this.a.a();
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return this.a;
            case 13:
                defpackage.aiyy aiyyVar = new defpackage.aiyy();
                aiyyVar.a = new exm(this.a, 10);
                return new defpackage.adcq(aiyyVar);
            default:
                return (defpackage.rrz) this.a.a();
        }
    }
}
