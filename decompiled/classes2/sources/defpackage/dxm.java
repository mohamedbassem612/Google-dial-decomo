package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxm implements dxw {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public dxm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            amwp amwpVar = (amwp) obj;
            if (amwpVar == null) {
                amwpVar = new amwp(-3, (byte[]) null);
            }
            ((vx) this.a).I(amwpVar);
            return;
        }
        amwp amwpVar2 = (amwp) obj;
        synchronized (defpackage.dxn.c) {
            aec aecVar = defpackage.dxn.d;
            java.lang.Object obj2 = this.a;
            java.util.ArrayList arrayList = (java.util.ArrayList) aecVar.get(obj2);
            if (arrayList != null) {
                aecVar.remove(obj2);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((dxw) arrayList.get(i)).accept(amwpVar2);
                }
            }
        }
    }
}
