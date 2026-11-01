package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class mlg implements agtk {
    final /* synthetic */ defpackage.mli a;

    public mlg(defpackage.mli mliVar) {
        j$.util.Objects.requireNonNull(mliVar);
        this.a = mliVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        a.bq(defpackage.mli.a.c(), "failed to call clearPhoneNumberAfterMmiCodeCheck.", "com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer$4", "onFailure", (char) 741, "PreCallDialpadFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj2).booleanValue()) {
            defpackage.mli.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadFragmentPeer$4", "onSuccess", 730, "PreCallDialpadFragmentPeer.java").v("clear precall dialpad digits through mmi checking.");
            this.a.h.e("");
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
