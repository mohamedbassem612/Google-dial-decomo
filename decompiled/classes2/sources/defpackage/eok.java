package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class eok implements emv {
    public final /* synthetic */ aoot a;
    public final /* synthetic */ aonj b;
    public final /* synthetic */ xfi c;

    public /* synthetic */ eok(xfi xfiVar, aoot aootVar, aonj aonjVar) {
        this.c = xfiVar;
        this.a = aootVar;
        this.b = aonjVar;
    }

    public final void a(emx emxVar, emp empVar) {
        aoot aootVar = this.a;
        int iOrdinal = empVar.ordinal();
        if (iOrdinal == 1) {
            aootVar.a = this.b.a(this.c);
        } else if (iOrdinal == 4) {
            defpackage.eol eolVar = (defpackage.eol) aootVar.a;
            if (eolVar != null) {
                eolVar.a();
            }
            aootVar.a = null;
        }
    }
}
