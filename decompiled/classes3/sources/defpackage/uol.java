package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uol implements agtk {
    final /* synthetic */ defpackage.uoo a;

    public uol(defpackage.uoo uooVar) {
        this.a = uooVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        if (th instanceof defpackage.agtp) {
            defpackage.uoo.b.b().l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer$onContactUnstarred$<anonymous>", "onFailure", 184, "FavoritesBarFragmentPeer.kt").v("Unstarred contact failed, parcelled before completion");
        } else {
            defpackage.uoo.b.d().k(th).l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer$onContactUnstarred$<anonymous>", "onFailure", 187, "FavoritesBarFragmentPeer.kt").v("Failed to unstar a contact");
        }
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.uoo.b.b().l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer$onContactUnstarred$<anonymous>", "onSuccess", 177, "FavoritesBarFragmentPeer.kt").v("Removed a contact.");
        this.a.c.d();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
