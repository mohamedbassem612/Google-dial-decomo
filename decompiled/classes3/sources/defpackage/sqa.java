package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sqa extends aomh implements aonn {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ aosy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqa(aosy aosyVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = aosyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return c(bool, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        boolean z = true;
        aooc.af(obj);
        if (i != 0) {
            if (!((java.lang.Boolean) obj).booleanValue()) {
                z = false;
            }
        } else if (!this.b) {
            aosy aosyVar = this.c;
            this.a = 1;
            obj = aosyVar.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.sqa sqaVar = new defpackage.sqa(this.c, aolnVar);
        sqaVar.b = ((java.lang.Boolean) obj).booleanValue();
        return sqaVar;
    }
}
