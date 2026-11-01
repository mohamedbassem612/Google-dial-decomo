package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lof implements agtk {
    final /* synthetic */ defpackage.loi a;

    public lof(defpackage.loi loiVar) {
        this.a = loiVar;
    }

    private final void d(android.net.Uri uri) {
        android.provider.ContactsContract.QuickContact.showQuickContact(this.a.b, new android.graphics.Rect(0, 0, 0, 0), uri, 3, (java.lang.String[]) null);
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        android.net.Uri uri = (android.net.Uri) obj;
        aooh.f(uri, "contactUri");
        defpackage.loi.a.b().l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer$onContactItemSelectedCallback$<anonymous>", "onFailure", 159, "ChocolateChipFragmentPeer.kt").v("Failed to check if contacts app embeddable, don't use Activity embedding");
        d(uri);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        android.net.Uri uri = (android.net.Uri) obj;
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        aooh.f(uri, "contactUri");
        if (zBooleanValue) {
            defpackage.loi loiVar = this.a;
            loiVar.l.b(loiVar.b, uri);
        } else {
            defpackage.loi.a.b().l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer$onContactItemSelectedCallback$<anonymous>", "onSuccess", 151, "ChocolateChipFragmentPeer.kt").v("Contacts detail is not embeddable, don't use Activity embedding");
            d(uri);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
