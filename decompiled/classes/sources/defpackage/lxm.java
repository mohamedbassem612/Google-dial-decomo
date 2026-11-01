package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lxm {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/contactsfragment/mainscreenuiintegration/ContactsScreenProviderImpl");
    private final defpackage.aw b;
    private final defpackage.aoin c;
    private final defpackage.rlv d;
    private final defpackage.lvs e;

    public lxm(defpackage.aw awVar, defpackage.aoin aoinVar, defpackage.lvs lvsVar, defpackage.rlv rlvVar) {
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        if (lvsVar == null) {
            defpackage.aooh.i("contactDisplayPreferences");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = awVar;
        this.c = aoinVar;
        this.e = lvsVar;
        this.d = rlvVar;
    }

    public final void a() {
        java.lang.String str;
        defpackage.aimz aimzVar;
        defpackage.aw awVar = this.b;
        android.content.pm.PackageManager packageManager = awVar.A().getPackageManager();
        android.content.Intent intent = new android.content.Intent("com.google.android.apps.contacts.action.DIALER_LEAF");
        if (intent.resolveActivity(packageManager) == null) {
            aimzVar = a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/contactsfragment/mainscreenuiintegration/ContactsScreenProviderImpl", "openContactsScreen", 36, "ContactsScreenProviderImpl.kt")).v("Leaf page intent is not resolvable");
        } else {
            long jM = ft$.ExternalSyntheticApiModelOutline0.m(awVar.A().getPackageManager().getPackageInfo("com.google.android.contacts", 0));
            long jLongValue = ((java.lang.Number) this.c.a()).longValue();
            defpackage.aimz aimzVar2 = a;
            if (jM > jLongValue) {
                ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/contactsfragment/mainscreenuiintegration/ContactsScreenProviderImpl", "openContactsScreen", 40, "ContactsScreenProviderImpl.kt")).v("Display leaf page");
                this.d.o(defpackage.rmx.CONTACTS_LEAF_PAGE_DISPLAYED);
                lvo lvoVarA = this.e.a();
                if (lvoVarA != null) {
                    int iOrdinal = lvoVarA.ordinal();
                    if (iOrdinal != 0) {
                        str = iOrdinal == 1 ? "display_name_alt" : "display_name";
                    }
                    intent.putExtra("display_name_format", str);
                    defpackage.afsq.G(awVar, intent);
                    return;
                }
                throw new defpackage.aois();
            }
            ((defpackage.aimw) aimzVar2.b().l("com/android/dialer/contactsfragment/mainscreenuiintegration/ContactsScreenProviderImpl", "contactsVersionHighEnough", 86, "ContactsScreenProviderImpl.kt")).v("Contacts version is too old");
            aimzVar = aimzVar2;
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/contactsfragment/mainscreenuiintegration/ContactsScreenProviderImpl", "openContactsScreen", 58, "ContactsScreenProviderImpl.kt")).v("Opening default contacts app in a new window because leaf page is not supported");
        this.d.o(defpackage.rmx.CONTACTS_LEAF_PAGE_NOT_AVAILABLE);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.provider.ContactsContract.Contacts.CONTENT_URI);
        if (intent2.resolveActivity(awVar.H().getPackageManager()) == null) {
            agby.o(awVar.N(), 2132018153, 0).h();
        } else {
            intent2.setFlags(268435457);
            defpackage.afsq.G(awVar, intent2);
        }
    }
}
