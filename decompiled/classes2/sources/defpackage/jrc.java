package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jrc extends aomh implements aonj {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ ztf c;
    final /* synthetic */ kgl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrc(kgl kglVar, long j, ztf ztfVar, aoln aolnVar) {
        super(1, aolnVar);
        this.d = kglVar;
        this.b = j;
        this.c = ztfVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.jrc(this.d, this.b, this.c, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [abwo, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        kgl kglVar = this.d;
        afpl afplVar = new afpl(new java.lang.Long(this.b), new defpackage.jrb(this.c, (aoln) null, 0), (char[]) null);
        this.a = 1;
        java.lang.Object objB = aazc.B((abwo) kglVar.a, afplVar, (abwn) null, this);
        return objB == aoluVar ? aoluVar : objB;
    }
}
