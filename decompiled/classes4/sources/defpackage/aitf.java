package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class aitf implements java.util.function.BiFunction {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aitf(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
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
            case 6:
                break;
            default:
                break;
        }
        return j$.util.function.BiFunction.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
        int i = 2;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
            case 1:
                return obj2;
            case 2:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVarM = defpackage.aloe.a.m();
                akzxVarM.u();
                defpackage.aloe aloeVar = (defpackage.aloe) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                aloeVar.b |= 1;
                aloeVar.c = str;
                float fFloatValue = ((java.lang.Float) obj2).floatValue();
                akzxVarM.u();
                defpackage.aloe aloeVar2 = (defpackage.aloe) akzxVarM.b;
                aloeVar2.b |= 2;
                aloeVar2.d = fFloatValue;
                return (defpackage.aloe) akzxVarM.p();
            case 3:
                akzx akzxVarM2 = defpackage.alsf.a.m();
                java.lang.String strA = ((akzc) obj).A();
                akzxVarM2.u();
                defpackage.alsf alsfVar = (defpackage.alsf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strA);
                alsfVar.b |= 1;
                alsfVar.c = strA;
                float fFloatValue2 = ((java.lang.Float) obj2).floatValue();
                akzxVarM2.u();
                defpackage.alsf alsfVar2 = (defpackage.alsf) akzxVarM2.b;
                alsfVar2.b |= 2;
                alsfVar2.d = fFloatValue2;
                return (defpackage.alsf) akzxVarM2.p();
            case 4:
                ymf ymfVarA = ymh.a((android.content.Context) obj);
                ymfVarA.b((java.util.concurrent.ExecutorService) obj2);
                return new yna(ymfVarA.a());
            case 5:
                return defpackage.altp.b(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
            case 6:
                int i3 = defpackage.alza.h;
                return aitt.l(((defpackage.alxk) obj2).b, new defpackage.alyz(i2), new defpackage.alyy((java.lang.String) obj, i));
            default:
                return defpackage.altp.b(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
        }
    }
}
