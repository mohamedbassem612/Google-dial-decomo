package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bkh extends aomh implements aonn {
    int a;
    final /* synthetic */ android.view.textclassifier.TextClassifier b;
    final /* synthetic */ aonn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkh(android.view.textclassifier.TextClassifier textClassifier, aonn aonnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = textClassifier;
        this.c = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        android.view.textclassifier.TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            return null;
        }
        aonn aonnVar = this.c;
        this.a = 1;
        java.lang.Object objA = aonnVar.a(textClassifier, this);
        return objA == aoluVar ? aoluVar : objA;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.bkh(this.b, this.c, aolnVar);
    }
}
