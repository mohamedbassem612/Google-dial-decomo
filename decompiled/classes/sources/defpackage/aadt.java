package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aadt extends defpackage.aadr {
    public final defpackage.aogc b;

    public aadt(defpackage.aogc aogcVar, defpackage.zzx zzxVar) {
        super(3, zzxVar);
        this.b = aogcVar;
    }

    @Override // defpackage.aadp
    public final int a(defpackage.aaeo aaeoVar) {
        return ((defpackage.aafj) this.b.b).d;
    }

    @Override // defpackage.aadp
    public final boolean c(defpackage.aaeo aaeoVar) {
        return ((defpackage.aafj) this.b.b).c;
    }

    @Override // defpackage.aadp
    public final com.google.android.gms.common.Feature[] d(defpackage.aaeo aaeoVar) {
        return ((defpackage.aafj) this.b.b).b;
    }

    @Override // defpackage.aadr
    public final void e(defpackage.aaeo aaeoVar) {
        defpackage.aogc aogcVar = this.b;
        defpackage.aafj aafjVar = (defpackage.aafj) aogcVar.b;
        aafjVar.b(aaeoVar.b, this.a);
        defpackage.aafc aafcVarA = aafjVar.a();
        if (aafcVarA != null) {
            aaeoVar.e.put(aafcVarA, aogcVar);
        }
    }

    @Override // defpackage.aadr, defpackage.aadw
    public final /* bridge */ /* synthetic */ void i(defpackage.acxg acxgVar, boolean z) {
    }
}
