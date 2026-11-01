package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aqg extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.auo b;
    final /* synthetic */ aqi c;
    final /* synthetic */ aqb d;
    final /* synthetic */ long e;
    final /* synthetic */ aoub f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(defpackage.auo auoVar, aqi aqiVar, aqb aqbVar, long j, aoub aoubVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = auoVar;
        this.c = aqiVar;
        this.d = aqbVar;
        this.e = j;
        this.f = aoubVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((apnt) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        apnt apntVar = (apnt) this.g;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.auo auoVar = this.b;
            aqi aqiVar = this.c;
            aqb aqbVar = this.d;
            auoVar.e = aqiVar.b(aqbVar, this.e);
            afx afxVar = new afx(aqiVar, this.f, apntVar, 2, (int[]) null);
            defpackage.af afVar = new defpackage.af(aqiVar, auoVar, aqbVar, 2, (char[]) null);
            this.g = null;
            this.a = 1;
            if (auoVar.a(afxVar, afVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.aqg aqgVar = new defpackage.aqg(this.b, this.c, this.d, this.e, this.f, aolnVar);
        aqgVar.g = obj;
        return aqgVar;
    }
}
