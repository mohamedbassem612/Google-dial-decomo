package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afnx implements aono {
    final /* synthetic */ cmw a;
    final /* synthetic */ defpackage.akmc b;
    final /* synthetic */ aonj c;

    public afnx(cmw cmwVar, defpackage.akmc akmcVar, aonj aonjVar) {
        this.a = cmwVar;
        this.b = akmcVar;
        this.c = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.afpl afplVar = (defpackage.afpl) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Number) obj3).intValue();
        aooh.f(afplVar, "$this$VisualElement");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? cavVar.B(afplVar) : cavVar.D(afplVar)) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            cmw cmwVar = this.a;
            defpackage.akmc akmcVar = this.b;
            aonj aonjVar = this.c;
            boolean zB = cavVar.B(aonjVar);
            java.lang.Object objG = cavVar.g();
            if (zB || objG == cau.a) {
                objG = new abli(aonjVar, 15);
                cavVar.w(objG);
            }
            defpackage.afny.l(cmwVar, akmcVar, afplVar.b((aonj) objG), cavVar, 6);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
