package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vya implements ebo {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vya(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final boolean a(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            ahvr.j(new defpackage.vxv(((kiu) this.a).d), view);
            return true;
        }
        if (i == 1) {
            ((lya) this.a).D();
            return true;
        }
        java.lang.Object obj = this.a;
        if (i != 2) {
            return ((com.google.android.material.bottomsheet.BottomSheetDragHandleView) obj).b();
        }
        ahvr.j(new defpackage.vxw(((kiu) obj).d), view);
        return true;
    }
}
