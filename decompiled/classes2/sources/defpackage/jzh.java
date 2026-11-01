package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jzh extends aomh implements aonn {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzh(java.util.List list, int i, int i2, aoln aolnVar, long j) {
        super(2, aolnVar);
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        java.util.List list = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        int i = 0;
        for (java.lang.Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                ajsz.bh();
            }
            int i3 = this.c;
            arrayList.add(((defpackage.jzb) obj2).a(this.d, (this.b * i3) + i));
            i = i2;
        }
        return arrayList;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jzh(this.a, this.b, this.c, aolnVar, this.d);
    }
}
