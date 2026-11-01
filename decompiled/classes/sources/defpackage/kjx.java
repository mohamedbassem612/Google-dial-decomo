package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kjx implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kjx(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.$cid) {
            case 0:
                return new java.util.ArrayList();
            case 1:
                return new defpackage.acc(0);
            case 2:
                return new java.util.ArrayList();
            case 3:
                return new java.util.HashSet();
            case 4:
                return new java.lang.NoSuchFieldException();
            case 5:
                return new java.lang.NullPointerException();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.FALSE;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.time.Duration.ofDays(14L);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return -1;
            case 9:
                return new defpackage.aift(4);
            case 10:
                return new defpackage.aihb();
            case 11:
                aiha aihaVar = aiha.a;
                return new uzx((byte[]) null, (char[]) null);
            default:
                return new defpackage.aigb(4);
        }
    }
}
