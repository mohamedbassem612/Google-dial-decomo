package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vxj implements agtk {
    final /* synthetic */ defpackage.vxq a;

    public vxj(defpackage.vxq vxqVar) {
        j$.util.Objects.requireNonNull(vxqVar);
        this.a = vxqVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.vxq.a.c(), "Failed to fetch preference for show archive confirmation dialog", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$4", "onFailure", (char) 264, "VisualVoicemailFragmentPeer.java", th, zct.b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.vxq vxqVar = this.a;
        arrayList.addAll(vxqVar.O);
        vxqVar.q(arrayList);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.vxq vxqVar = this.a;
        java.util.Set set = vxqVar.O;
        arrayList.addAll(set);
        if (((java.lang.Boolean) obj2).booleanValue()) {
            vxqVar.q(arrayList);
            return;
        }
        vxqVar.g(arrayList);
        vxqVar.N = false;
        set.clear();
        ((android.view.ActionMode) vxqVar.J.orElseThrow()).finish();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
