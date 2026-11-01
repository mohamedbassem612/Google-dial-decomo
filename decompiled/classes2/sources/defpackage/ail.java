package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ail implements aomy {
    public final /* synthetic */ aik a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ aiq c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ nf f;

    public /* synthetic */ ail(aik aikVar, java.lang.Object obj, nf nfVar, aiq aiqVar, java.lang.Object obj2, java.lang.String str) {
        this.a = aikVar;
        this.b = obj;
        this.f = nfVar;
        this.c = aiqVar;
        this.d = obj2;
        this.e = str;
    }

    public final java.lang.Object a() {
        boolean z;
        aku akuVar = aim.a;
        aik aikVar = this.a;
        aii aiiVar = aikVar.b;
        nf nfVar = aiiVar.g;
        nf nfVar2 = this.f;
        java.lang.Object obj = this.d;
        java.lang.String str = this.e;
        if (nfVar == nfVar2 && aooh.n(aiiVar.a, str)) {
            z = false;
        } else {
            aikVar.b = new aii(aikVar.b.d(), nfVar2, obj, str);
            z = true;
        }
        aiq aiqVar = this.c;
        java.lang.Object obj2 = this.b;
        boolean z2 = !aooh.n(obj2, aikVar.b.c());
        aikVar.c = aik.b(aiqVar, obj);
        if (z2 | z) {
            aiq aiqVar2 = aikVar.c;
            aoub aoubVar = aikVar.d;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            if (!aooh.n(aikVar.b.c(), obj2)) {
                aikVar.d = aoov.an(aikVar.a, (aolr) null, 4, new defpackage.amh(aikVar, obj2, aiqVar2, (aoln) null, 1), 1);
            }
        }
        return aojh.a;
    }
}
