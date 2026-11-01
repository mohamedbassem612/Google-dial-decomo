package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jhz implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jhz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                if (((iqm) this.a).b() && ((defpackage.iqp) this.b).b()) {
                    return true;
                }
                break;
            case 1:
                iqm iqmVar = (iqm) this.a;
                if (iqmVar.a() && (iqmVar.b() || ((zjm) this.b).g().isPresent())) {
                    return true;
                }
                break;
            case 2:
                if (((defpackage.jnn) this.a).a() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
            case 3:
                if (((wyc) this.b).a() || ((whh) this.a).a()) {
                    return true;
                }
                break;
            case 4:
                if (((java.lang.Boolean) this.a.a()).booleanValue() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
            case 5:
                return afsq.cz((mnk) this.a, (aoin) this.b);
            case 6:
                if (((java.lang.Boolean) this.a).booleanValue() || ((java.lang.Boolean) this.b).booleanValue()) {
                    return true;
                }
                break;
            case 7:
                if (((oev) this.a).a() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
            case 8:
                if (((java.lang.Boolean) this.b.a()).booleanValue() || ((qbw) this.a).a()) {
                    return true;
                }
                break;
            case 9:
                if (((java.lang.Boolean) this.b.a()).booleanValue() || ((qbw) this.a).a()) {
                    return true;
                }
                break;
            case 10:
                if (((smx) this.a).a() || ((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
            case 11:
                if (((gat) this.b).B() && ((tkk) this.a).a()) {
                    return true;
                }
                break;
            case 12:
                if (((gat) this.b).B() && ((tkk) this.a).a()) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                if (((tzc) this.a).a() && ((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                if (((teh) this.a).a() && ((usg) this.b).a()) {
                    return true;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                if (((teh) this.a).a() && ((usg) this.b).a()) {
                    return true;
                }
                break;
            default:
                if (((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.b.a()).booleanValue()) {
                    return true;
                }
                break;
        }
        return false;
    }

    public /* synthetic */ jhz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
