package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jzi extends aomh implements aonn {
    int a;
    final /* synthetic */ java.util.List b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzi(java.util.List list, int i, aoln aolnVar, long j) {
        super(2, aolnVar);
        this.b = list;
        this.c = i;
        this.d = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            aoss aossVar = (aoss) this.e;
            java.util.List list = this.b;
            int i2 = this.c;
            int size = ((list.size() + i2) - 1) / i2;
            java.util.List listBP = ajsz.bP(list, size);
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBP, 10));
            int i3 = 0;
            for (java.lang.Object obj2 : listBP) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ajsz.bh();
                }
                arrayList.add(aoov.am(aossVar, 0, new defpackage.jzh((java.util.List) obj2, i3, size, null, this.d), 3));
                i3 = i4;
            }
            this.a = 1;
            obj = aooh.v(arrayList, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        return ajsz.bm((java.lang.Iterable) obj);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.jzi jziVar = new defpackage.jzi(this.b, this.c, aolnVar, this.d);
        jziVar.e = obj;
        return jziVar;
    }
}
