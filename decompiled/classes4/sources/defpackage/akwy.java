package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class akwy implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.akxt a;
    public final /* synthetic */ defpackage.alfr b;
    public final /* synthetic */ defpackage.akxy c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ akxf f;

    public /* synthetic */ akwy(defpackage.akxt akxtVar, defpackage.alfr alfrVar, defpackage.akxy akxyVar, boolean z, int i, akxf akxfVar) {
        this.a = akxtVar;
        this.b = alfrVar;
        this.c = akxyVar;
        this.d = z;
        this.e = i;
        this.f = akxfVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        akxm akxmVar = (akxm) obj;
        aihd aihdVar = defpackage.akwz.a;
        akxmVar.a(new ahiw(this.a, 18), new ahiw(this.b, 19), this.c, this.d, this.e, this.f);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
