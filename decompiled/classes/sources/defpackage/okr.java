package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class okr implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ okr(java.lang.Object obj, int i) {
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return this.a.a(obj);
            case 1:
                return this.a.a(obj);
            case 2:
                return this.a.a(obj);
            case 3:
                return this.a.a(obj);
            case 4:
                return ((defpackage.vda) obj).c((android.telecom.PhoneAccountHandle) this.a);
            case 5:
                return java.lang.Boolean.valueOf(!((defpackage.vcg) obj).r((android.telecom.PhoneAccountHandle) this.a));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aimz aimzVar = defpackage.vzh.a;
                return new android.telecom.PhoneAccountHandle((android.content.ComponentName) obj, (java.lang.String) this.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.a.a(obj);
            default:
                return this.a.a(obj);
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
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
