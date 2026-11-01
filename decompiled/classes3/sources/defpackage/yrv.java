package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yrv extends aomh implements aono {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.yse c;
    final /* synthetic */ zth d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrv(aoln aolnVar, zth zthVar, defpackage.yse yseVar) {
        super(3, aolnVar);
        this.d = zthVar;
        this.c = yseVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.yrv yrvVar = new defpackage.yrv((aoln) obj3, this.d, this.c);
        yrvVar.e = (aoxi) obj;
        yrvVar.b = obj2;
        return yrvVar.b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [aoxi, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            ?? r8 = this.e;
            aowy aowyVar = new aowy(new defpackage.yrw(((java.lang.Boolean) this.b).booleanValue(), this.d, this.c, (aoln) null, 0));
            this.a = 1;
            if (aoov.aG((aoxi) r8, aowyVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
