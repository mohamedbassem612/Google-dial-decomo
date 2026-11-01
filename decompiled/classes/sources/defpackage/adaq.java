package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adaq implements defpackage.amyv {
    private final /* synthetic */ int $cid;
    private final defpackage.amyz a;
    private final java.lang.Object b;

    public adaq(java.lang.Object obj, defpackage.amyz amyzVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = amyzVar;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.amyz amyzVar = this.a;
            android.content.Context contextA = ((defpackage.adaf) this.b).a();
            defpackage.ahyn ahynVar = (defpackage.ahyn) amyzVar.a();
            java.util.regex.Pattern pattern = defpackage.afej.a;
            defpackage.afei afeiVar = new defpackage.afei(contextA);
            afeiVar.e("mdd_pds_config");
            afeiVar.f(defpackage.abrz.O("DestFileGroups", ahynVar));
            android.net.Uri uriA = afeiVar.a();
            defpackage.aooc.ap(uriA);
            return uriA;
        }
        if (i == 1) {
            ((defpackage.adaf) this.a).a();
            java.lang.Object obj = ((defpackage.adak) this.b).g;
            defpackage.aooc.ap(obj);
            return obj;
        }
        if (i == 2) {
            defpackage.amyz amyzVar2 = this.a;
            android.content.Context contextA2 = ((defpackage.adaf) this.b).a();
            defpackage.ahyn ahynVar2 = (defpackage.ahyn) amyzVar2.a();
            java.util.regex.Pattern pattern2 = defpackage.afej.a;
            defpackage.afei afeiVar2 = new defpackage.afei(contextA2);
            afeiVar2.e("mdd_pds_config");
            afeiVar2.f(defpackage.abrz.O("DiagFileGroups", ahynVar2));
            android.net.Uri uriA2 = afeiVar2.a();
            defpackage.aooc.ap(uriA2);
            return uriA2;
        }
        defpackage.amyz amyzVar3 = this.a;
        if (i != 3) {
            android.content.Context contextA3 = ((defpackage.adaf) this.b).a();
            defpackage.ahyn ahynVar3 = (defpackage.ahyn) amyzVar3.a();
            java.util.regex.Pattern pattern3 = defpackage.afej.a;
            defpackage.afei afeiVar3 = new defpackage.afei(contextA3);
            afeiVar3.e("mdd_pds_config");
            afeiVar3.f(defpackage.abrz.O("DiagSharedFiles", ahynVar3));
            android.net.Uri uriA3 = afeiVar3.a();
            defpackage.aooc.ap(uriA3);
            return uriA3;
        }
        android.content.Context contextA4 = ((defpackage.adaf) this.b).a();
        defpackage.ahyn ahynVar4 = (defpackage.ahyn) amyzVar3.a();
        java.util.regex.Pattern pattern4 = defpackage.afej.a;
        defpackage.afei afeiVar4 = new defpackage.afei(contextA4);
        afeiVar4.e("mdd_pds_config");
        afeiVar4.f(defpackage.abrz.O("DestSharedFiles", ahynVar4));
        android.net.Uri uriA4 = afeiVar4.a();
        defpackage.aooc.ap(uriA4);
        return uriA4;
    }
}
