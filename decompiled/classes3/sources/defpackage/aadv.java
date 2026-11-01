package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aadv extends aadr {
    public final aafc b;

    public aadv(aafc aafcVar, zzx zzxVar) {
        super(4, zzxVar);
        this.b = aafcVar;
    }

    public final int a(aaeo aaeoVar) {
        aogc aogcVar = (aogc) aaeoVar.e.get(this.b);
        if (aogcVar != null) {
            return ((aafj) aogcVar.b).d;
        }
        return -1;
    }

    public final boolean c(aaeo aaeoVar) {
        aogc aogcVar = (aogc) aaeoVar.e.get(this.b);
        return aogcVar != null && ((aafj) aogcVar.b).c;
    }

    public final com.google.android.gms.common.Feature[] d(aaeo aaeoVar) {
        aogc aogcVar = (aogc) aaeoVar.e.get(this.b);
        if (aogcVar == null) {
            return null;
        }
        return ((aafj) aogcVar.b).b;
    }

    public final void e(aaeo aaeoVar) {
        aogc aogcVar = (aogc) aaeoVar.e.remove(this.b);
        if (aogcVar == null) {
            this.a.i(java.lang.Boolean.FALSE);
            return;
        }
        ((aafl) ((apnt) aogcVar.c).a).b.a(aaeoVar.b, this.a);
        ((aafj) aogcVar.b).a.a();
    }

    public final /* bridge */ /* synthetic */ void i(acxg acxgVar, boolean z) {
    }
}
