package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class caq extends aomg implements aonn {
    int a;
    int b;
    int c;
    int d;
    final /* synthetic */ defpackage.car e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caq(defpackage.car carVar, aoln aolnVar) {
        super(aolnVar);
        this.e = carVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoqn) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        java.lang.String strConcat;
        int i4;
        int i5;
        aoqn aoqnVar = (aoqn) this.f;
        aolu aoluVar = aolu.a;
        if (this.d != 0) {
            i = this.c;
            i2 = this.b;
            i3 = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        while (true) {
            defpackage.car carVar = this.e;
            int i6 = carVar.d;
            acm acmVar = carVar.c;
            if (i3 >= java.lang.Math.min(i6 + 10, acmVar.b)) {
                return aojh.a;
            }
            int i7 = i3 + 1;
            int iA = acmVar.a(i3);
            switch (iA) {
                case 0:
                    strConcat = "up";
                    break;
                case 1:
                    java.lang.Object objC = carVar.a.c(i2);
                    java.util.Objects.toString(objC);
                    strConcat = "down ".concat(java.lang.String.valueOf(objC));
                    i2++;
                    break;
                case 2:
                    strConcat = "remove " + acmVar.a(i7) + ' ' + acmVar.a(i3 + 2);
                    i7 = i3 + 3;
                    break;
                case 3:
                    strConcat = "move " + acmVar.a(i7) + ' ' + acmVar.a(i3 + 2) + ' ' + acmVar.a(i3 + 3);
                    i7 = i3 + 4;
                    break;
                case 4:
                    strConcat = "clear";
                    break;
                case 5:
                    i4 = i3 + 2;
                    i5 = i2 + 1;
                    strConcat = "insertBottomUp " + acmVar.a(i7) + ' ' + carVar.a.c(i2);
                    i7 = i4;
                    i2 = i5;
                    break;
                case 6:
                    i4 = i3 + 2;
                    i5 = i2 + 1;
                    strConcat = "insertTopDown " + acmVar.a(i7) + ' ' + carVar.a.c(i2);
                    i7 = i4;
                    i2 = i5;
                    break;
                case 7:
                    java.lang.Object objC2 = carVar.a.c(i2);
                    aooh.d(objC2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                    aoov.f(objC2, 2);
                    aonn aonnVar = (aonn) objC2;
                    i2 += 2;
                    java.util.Objects.toString(aonnVar);
                    strConcat = "apply ".concat(java.lang.String.valueOf(aonnVar));
                    break;
                case 8:
                    java.lang.Object objC3 = carVar.b.c(i);
                    java.util.Objects.toString(objC3);
                    strConcat = "reuse ".concat(java.lang.String.valueOf(objC3));
                    i++;
                    break;
                case 9:
                    strConcat = "recompose pending";
                    break;
                default:
                    strConcat = a.bj(iA, "unknown op: ");
                    break;
            }
            java.lang.String str = i3 + ": " + strConcat;
            this.f = aoqnVar;
            this.a = i7;
            this.b = i2;
            this.c = i;
            this.d = 1;
            if (aoqnVar.a(str, this) == aoluVar) {
                return aoluVar;
            }
            i3 = i7;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.caq caqVar = new defpackage.caq(this.e, aolnVar);
        caqVar.f = obj;
        return caqVar;
    }
}
