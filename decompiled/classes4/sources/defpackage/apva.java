package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apva implements defpackage.apvm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ apva(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.apvm
    public final java.lang.Object a() {
        if (this.$cid != 0) {
            return ((defpackage.aput) this.a).a.openConnection((java.net.URL) this.b);
        }
        defpackage.apvf apvfVarB = defpackage.apvf.b(defpackage.rp$$ExternalSyntheticApiModelOutline0.m(this.b));
        defpackage.apvc apvcVar = (defpackage.apvc) this.a;
        apvcVar.a.onResponseStarted(apvcVar.b, apvfVarB);
        return null;
    }
}
