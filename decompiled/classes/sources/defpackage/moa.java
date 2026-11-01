package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class moa implements defpackage.zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ moa(defpackage.aoin aoinVar, defpackage.smx smxVar, int i) {
        this.$cid = i;
        this.b = aoinVar;
        this.a = smxVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    @Override // defpackage.zcs
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                if (((defpackage.mnk) this.a).a() && !((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
            case 1:
                defpackage.iqm iqmVar = (defpackage.iqm) this.a;
                if (iqmVar.a() && (iqmVar.b() || ((defpackage.zjm) this.b).g().isPresent())) {
                    return true;
                }
                break;
            case 2:
                return defpackage.afsq.cz((defpackage.mnk) this.a, this.b);
            case 3:
                return defpackage.afsq.cz((defpackage.mnk) this.a, this.b);
            case 4:
                return defpackage.afsq.cw((defpackage.mnk) this.a, (defpackage.mnl) this.b);
            case 5:
                return defpackage.afsq.cw((defpackage.mnk) this.a, (defpackage.mnl) this.b);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.afsq.cw((defpackage.mnk) this.a, (defpackage.mnl) this.b);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.afsq.cw((defpackage.mnk) this.a, (defpackage.mnl) this.b);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.afsq.cz((defpackage.mnk) this.a, this.b);
            case 9:
                return defpackage.afsq.cw((defpackage.mnk) this.a, (defpackage.mnl) this.b);
            case 10:
                if (((java.lang.Boolean) this.b.a()).booleanValue() && ((defpackage.smx) this.a).a()) {
                    return true;
                }
                break;
            default:
                if (((java.lang.Boolean) this.b.a()).booleanValue() && !((defpackage.smx) this.a).a()) {
                    return true;
                }
                break;
        }
        return false;
    }

    public /* synthetic */ moa(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
