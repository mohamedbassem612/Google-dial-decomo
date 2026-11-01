package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ojh extends aomh implements aono {
    /* synthetic */ java.lang.Object a;
    /* synthetic */ float b;

    public ojh(aoln aolnVar) {
        super(3, aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float fFloatValue = ((java.lang.Number) obj2).floatValue();
        defpackage.ojh ojhVar = new defpackage.ojh((aoln) obj3);
        ojhVar.a = (ysc) obj;
        ojhVar.b = fFloatValue;
        return ojhVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        return new defpackage.ojg((ysc) this.a, this.b);
    }
}
