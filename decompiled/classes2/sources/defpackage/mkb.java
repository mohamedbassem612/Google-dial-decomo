package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mkb extends aomh implements aono {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;

    public mkb(aoln aolnVar) {
        super(3, aolnVar);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.mkb mkbVar = new defpackage.mkb((aoln) obj3);
        mkbVar.a = zBooleanValue;
        mkbVar.b = zBooleanValue2;
        return mkbVar.b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = false;
        if (z && z2) {
            z3 = true;
        }
        return java.lang.Boolean.valueOf(z3);
    }
}
