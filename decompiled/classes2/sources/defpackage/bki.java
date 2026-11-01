package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bki extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    long d;
    int e;
    final /* synthetic */ java.lang.CharSequence f;
    final /* synthetic */ long g;
    final /* synthetic */ defpackage.bkj h;
    private /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bki(java.lang.CharSequence charSequence, long j, defpackage.bkj bkjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = charSequence;
        this.g = j;
        this.h = bkjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c(aa$.ExternalSyntheticApiModelOutline0.m(obj), (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        android.view.textclassifier.TextClassifier textClassifierM = aa$.ExternalSyntheticApiModelOutline0.m(this.i);
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            j = this.d;
            if (i != 1) {
                aooc.af(obj);
            } else {
                obj4 = this.c;
                obj3 = this.b;
                obj2 = this.a;
                aooc.af(obj);
                try {
                    ((defpackage.bkj) obj4).g((defpackage.bmd) obj2);
                } finally {
                    ((apdp) obj3).d();
                }
            }
        } else {
            aooc.af(obj);
            java.lang.CharSequence charSequence = this.f;
            long j2 = this.g;
            android.view.textclassifier.TextSelection.Request.Builder builder = new android.view.textclassifier.TextSelection.Request.Builder(charSequence, dky.c(j2), dky.b(j2));
            defpackage.bkj bkjVar = this.h;
            android.view.textclassifier.TextSelection.Request.Builder builderM = ft$.ExternalSyntheticApiModelOutline0.m(builder, bkjVar.a());
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                ac$.ExternalSyntheticApiModelOutline0.m(builderM, true);
            }
            android.view.textclassifier.TextSelection textSelectionM = ft$.ExternalSyntheticApiModelOutline0.m(textClassifierM, ft$.ExternalSyntheticApiModelOutline0.m(builderM));
            long jE = dfd.e(aa$.ExternalSyntheticApiModelOutline0.m(textSelectionM), aa$.ExternalSyntheticApiModelOutline0.m$1(textSelectionM));
            if (android.os.Build.VERSION.SDK_INT < 31 || ac$.ExternalSyntheticApiModelOutline0.m(textSelectionM) == null) {
                defpackage.bkj bkjVar2 = this.h;
                java.lang.CharSequence charSequence2 = this.f;
                this.i = null;
                this.d = jE;
                this.e = 2;
                j = jE;
                if (bkjVar2.d(charSequence2, j, textClassifierM, this) == aoluVar) {
                    return aoluVar;
                }
            } else {
                android.view.textclassifier.TextClassification textClassificationM = ac$.ExternalSyntheticApiModelOutline0.m(textSelectionM);
                aooh.c(textClassificationM);
                defpackage.bmd bmdVarB = bkjVar.b(charSequence, jE, textClassificationM);
                apdp apdpVar = bkjVar.e;
                this.i = null;
                this.a = bmdVarB;
                this.b = apdpVar;
                this.c = bkjVar;
                this.d = jE;
                this.e = 1;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = bmdVarB;
                obj3 = apdpVar;
                obj4 = bkjVar;
                j = jE;
                ((defpackage.bkj) obj4).g((defpackage.bmd) obj2);
            }
        }
        return new dky(j);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.bki bkiVar = new defpackage.bki(this.f, this.g, this.h, aolnVar);
        bkiVar.i = obj;
        return bkiVar;
    }
}
