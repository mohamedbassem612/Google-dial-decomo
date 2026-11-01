package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahke extends defpackage.anqa {
    final /* synthetic */ defpackage.ahix a;
    final /* synthetic */ anpk b;
    final /* synthetic */ defpackage.ahkf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahke(defpackage.ahkf ahkfVar, anty antyVar, defpackage.ahix ahixVar, anpk anpkVar) {
        super(antyVar);
        this.a = ahixVar;
        this.b = anpkVar;
        j$.util.Objects.requireNonNull(ahkfVar);
        this.c = ahkfVar;
    }

    @Override // defpackage.anqa
    public final void a(anqw anqwVar, anph anphVar) {
        java.lang.Iterable iterableB = anphVar.b(defpackage.akaa.c);
        java.lang.Iterable iterableB2 = anphVar.b(defpackage.akaa.d);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ahkg ahkgVar = this.c.c;
        long j = jElapsedRealtime - ahkgVar.b;
        anqt anqtVar = anqwVar.o;
        int i = anqtVar.r;
        defpackage.ahix ahixVar = this.a;
        ahzi ahziVar = ahixVar.b;
        aogc aogcVar = ahkgVar.c;
        java.lang.String strP = aogcVar.p();
        afim afimVar = (afim) ahziVar.eZ();
        java.lang.Object obj = aogcVar.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(iterableB != null);
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(iterableB2 != null);
        afimVar.b(j, new java.lang.Object[]{obj, strP, numValueOf, boolValueOf, boolValueOf2});
        if (ahkgVar.a.m() && aogcVar.p().endsWith(":search") && anqtVar.equals(anqt.q)) {
            ((afip) ahixVar.c.eZ()).b(1L, new java.lang.Object[]{this.b.b, boolValueOf2});
        }
        super.a(anqwVar, anphVar);
    }
}
