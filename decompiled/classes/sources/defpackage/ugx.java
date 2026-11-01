package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ugx extends defpackage.aomh implements defpackage.aonj {
    int a;
    final /* synthetic */ defpackage.oko b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugx(defpackage.oko okoVar, long j, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.b = okoVar;
        this.c = j;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ugx(this.b, this.c, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.oko okoVar = this.b;
            this.a = 1;
            obj = okoVar.I(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        }
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            throw new java.lang.IllegalStateException("SIM country code is null or empty, createDownloadLabelsSupplier is being called without a check for Hades integration availability.");
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        defpackage.aooh.e(lowerCase, "toLowerCase(...)");
        return defpackage.ajsz.aO(new defpackage.aoiu("country", lowerCase), new defpackage.aoiu("experimentid", java.lang.String.valueOf(this.c)));
    }
}
