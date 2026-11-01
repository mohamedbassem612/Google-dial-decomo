package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alyx implements java.util.function.ToDoubleFunction {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(java.lang.Object obj) {
        float fFloatValue;
        switch (this.$cid) {
            case 0:
                fFloatValue = ((defpackage.aloe) obj).d;
                break;
            case 1:
                return ((uqs) obj).b;
            case 2:
                fFloatValue = ((defpackage.amay) obj).c;
                break;
            case 3:
                ahzf ahzfVar = defpackage.ambu.a;
                fFloatValue = ((java.lang.Float) obj).floatValue();
                break;
            case 4:
                ahzf ahzfVar2 = defpackage.ambu.a;
                fFloatValue = ((java.lang.Float) obj).floatValue();
                break;
            case 5:
                fFloatValue = ((java.lang.Float) obj).floatValue();
                break;
            case 6:
                fFloatValue = ((java.lang.Float) obj).floatValue();
                break;
            default:
                fFloatValue = ((java.lang.Float) obj).floatValue();
                break;
        }
        return fFloatValue;
    }
}
