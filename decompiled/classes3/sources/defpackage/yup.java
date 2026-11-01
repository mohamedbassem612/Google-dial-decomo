package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yup implements defpackage.ytz {
    private final /* synthetic */ int $cid;

    public yup(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ytz
    public final /* synthetic */ java.util.List a(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        int i = this.$cid;
        if (i == 0) {
            defpackage.yog yogVar = (defpackage.yog) obj;
            aooh.f(yogVar, "result");
            aify aifyVar = yogVar.a;
            arrayList = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
            java.util.Iterator it = aifyVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.yoj) it.next()).a);
            }
        } else if (i != 1) {
            defpackage.yoq yoqVar = (defpackage.yoq) obj;
            aooh.f(yoqVar, "result");
            aify aifyVar2 = yoqVar.a;
            arrayList = new java.util.ArrayList(ajsz.bl(aifyVar2, 10));
            java.util.Iterator it2 = aifyVar2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((defpackage.you) it2.next()).a);
            }
        } else {
            defpackage.ynp ynpVar = (defpackage.ynp) obj;
            aooh.f(ynpVar, "result");
            aify aifyVar3 = ynpVar.a;
            arrayList = new java.util.ArrayList(ajsz.bl(aifyVar3, 10));
            java.util.Iterator it3 = aifyVar3.iterator();
            while (it3.hasNext()) {
                arrayList.add(((defpackage.ynl) it3.next()).a);
            }
        }
        return arrayList;
    }
}
