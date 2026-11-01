package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vxl implements agtk {
    final /* synthetic */ defpackage.vxq a;

    public vxl(defpackage.vxq vxqVar) {
        j$.util.Objects.requireNonNull(vxqVar);
        this.a = vxqVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        java.lang.Long l = (java.lang.Long) obj;
        boolean z = th instanceof java.util.concurrent.CancellationException;
        defpackage.vxq vxqVar = this.a;
        if (z) {
            vxqVar.l(mce.dE);
            defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$6", "onFailure", 319, "VisualVoicemailFragmentPeer.java").v("delete canceled");
        } else {
            vxqVar.k(mcd.ao);
            a.bq(defpackage.vxq.a.c(), "failed deleting voicemail", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$6", "onFailure", (char) 322, "VisualVoicemailFragmentPeer.java", th, zct.b);
        }
        defpackage.vxq vxqVar2 = this.a;
        vxqVar2.K.remove(l);
        vxqVar2.w();
        vxqVar2.v();
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.vxq vxqVar = this.a;
        java.util.Set set = vxqVar.O;
        set.remove((java.lang.Long) obj);
        vxqVar.s();
        if (set.isEmpty()) {
            j$.util.Optional optional = vxqVar.J;
            if (true == optional.isPresent()) {
                ((android.view.ActionMode) optional.get()).finish();
            }
        }
        vxqVar.l(mce.dD);
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
