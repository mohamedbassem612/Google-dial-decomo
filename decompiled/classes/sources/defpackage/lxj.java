package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lxj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/contactsfragment/ContactsAppIntentProvider");
    public final android.content.Context b;
    public final defpackage.aoin c;
    public final defpackage.rlv d;
    public final defpackage.lvs e;

    public lxj(android.content.Context context, defpackage.aoin aoinVar, defpackage.lvs lvsVar, defpackage.rlv rlvVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (lvsVar == null) {
            defpackage.aooh.i("contactDisplayPreferences");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = context;
        this.c = aoinVar;
        this.e = lvsVar;
        this.d = rlvVar;
    }

    public final android.content.Intent a(android.content.pm.PackageManager packageManager) {
        ((defpackage.aimw) a.b().l("com/android/dialer/contactsfragment/ContactsAppIntentProvider", "getDefaultContactsIntent", 69, "ContactsAppIntentProvider.kt")).v("Opening default contacts app because leaf page is not supported");
        this.d.o(defpackage.rmx.CONTACTS_LEAF_PAGE_NOT_AVAILABLE);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.provider.ContactsContract.Contacts.CONTENT_URI);
        if (intent.resolveActivity(packageManager) == null) {
            return null;
        }
        intent.setFlags(268435457);
        return intent;
    }
}
