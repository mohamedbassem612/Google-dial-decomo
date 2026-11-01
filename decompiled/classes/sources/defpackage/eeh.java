package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eeh extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.eei b;
    final /* synthetic */ defpackage.aoor c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ boolean e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeh(defpackage.eei eeiVar, defpackage.aoor aoorVar, java.lang.Object obj, boolean z, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.b = eeiVar;
        this.c = aoorVar;
        this.d = obj;
        this.e = z;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.eeh) c((defpackage.eem) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.eem eemVar = (defpackage.eem) this.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.a;
        defpackage.aooc.af(obj);
        if (i == 0) {
            defpackage.eeg eegVar = new defpackage.eeg(this.c, this.b, eemVar, this.d, this.e, null);
            this.f = null;
            this.a = 1;
            if (defpackage.dpy.o(eegVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.eeh eehVar = new defpackage.eeh(this.b, this.c, this.d, this.e, aolnVar);
        eehVar.f = obj;
        return eehVar;
    }
}
