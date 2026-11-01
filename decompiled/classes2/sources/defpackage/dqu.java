package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class dqu implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ dqu(aoss aossVar, aii aiiVar, java.util.List list, cei ceiVar, ceg cegVar, int i) {
        this.$cid = i;
        this.b = aossVar;
        this.e = aiiVar;
        this.a = list;
        this.c = ceiVar;
        this.d = cegVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [dpf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object a() throws aois {
        java.lang.String str;
        int i = this.$cid;
        if (i == 0) {
            ?? r1 = this.e;
            java.lang.Object obj = this.d;
            ((defpackage.drk) this.a).a(this.b, (defpackage.drh) this.c, (dpq) obj, r1);
            return aojh.a;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.d;
            return aoov.an((aoss) this.b, (aolr) null, 0, new defpackage.bqq((aii) this.e, this.a, (cei) this.c, (ceg) obj2, null), 3);
        }
        if (i == 2) {
            cbd cbdVar = defpackage.dra.a;
            ?? r2 = this.e;
            java.lang.Object obj3 = this.d;
            ((defpackage.drq) this.c).o(this.b, (defpackage.drs) this.a, (dpq) obj3, r2);
            return aojh.a;
        }
        if (i == 3) {
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.a;
            java.lang.Object obj6 = this.e;
            final android.net.Uri uri = (android.net.Uri) this.d;
            final android.content.ContentValues contentValues = (android.content.ContentValues) obj6;
            final java.lang.String str2 = (java.lang.String) obj5;
            final java.lang.String[] strArr = (java.lang.String[]) obj4;
            return ((ojo) this.c).d.x(new agxe() { // from class: agxa
                public final java.lang.Object a(apni apniVar) {
                    return java.lang.Integer.valueOf(apniVar.k(uri, contentValues, str2, strArr));
                }
            });
        }
        if (i == 4) {
            android.content.Context context = ((ojo) this.c).a;
            java.lang.Object obj7 = this.b;
            java.lang.Object obj8 = this.a;
            return java.lang.Integer.valueOf(context.getContentResolver().update((android.net.Uri) this.d, (android.content.ContentValues) this.e, (java.lang.String) obj8, (java.lang.String[]) obj7));
        }
        uod.a.b().l("com/android/dialer/speeddial/bar/impl/integration/FavoritesBarCallLogScreenIntegration", "Render$<anonymous>$<anonymous>", 154, "FavoritesBarCallLogScreenIntegration.kt").v("onViewAllContacts");
        lxj lxjVar = ((uod) this.c).c;
        android.content.Context context2 = lxjVar.b;
        android.content.pm.PackageManager packageManager = context2.getPackageManager();
        android.content.Intent intent = new android.content.Intent("com.google.android.apps.contacts.action.DIALER_LEAF");
        if (intent.resolveActivity(packageManager) == null) {
            lxj.a.b().l("com/android/dialer/contactsfragment/ContactsAppIntentProvider", "getContactsIntent", 44, "ContactsAppIntentProvider.kt").v("Leaf page intent is not resolvable");
            aooh.c(packageManager);
            intent = lxjVar.a(packageManager);
        } else {
            if (ft$.ExternalSyntheticApiModelOutline0.m(context2.getPackageManager().getPackageInfo("com.google.android.contacts", 0)) > ((java.lang.Number) lxjVar.c.a()).longValue()) {
                lxj.a.b().l("com/android/dialer/contactsfragment/ContactsAppIntentProvider", "getContactsIntent", 52, "ContactsAppIntentProvider.kt").v("Display leaf page");
                lxjVar.d.o(rmx.rX);
                defpackage.lvo lvoVarA = lxjVar.e.a();
                if (lvoVarA != null) {
                    int iOrdinal = lvoVarA.ordinal();
                    if (iOrdinal != 0) {
                        str = iOrdinal == 1 ? "display_name_alt" : "display_name";
                    }
                    intent.putExtra("display_name_format", str);
                }
                throw new aois();
            }
            lxj.a.b().l("com/android/dialer/contactsfragment/ContactsAppIntentProvider", "contactsVersionHighEnough", 87, "ContactsAppIntentProvider.kt").v("Contacts version is too old");
            aooh.c(packageManager);
            intent = lxjVar.a(packageManager);
        }
        if (intent != null) {
            ahqx.l((android.content.Context) this.e, intent);
        } else {
            aoov.an((aoss) this.b, (aolr) null, 0, new ufr((nf) this.d, (java.lang.String) this.a, (aoln) null, 16), 3);
        }
        return aojh.a;
    }

    public /* synthetic */ dqu(defpackage.drk drkVar, aomy aomyVar, defpackage.drh drhVar, dpq dpqVar, dpf dpfVar, int i) {
        this.$cid = i;
        this.a = drkVar;
        this.b = aomyVar;
        this.c = drhVar;
        this.d = dpqVar;
        this.e = dpfVar;
    }

    public /* synthetic */ dqu(defpackage.drq drqVar, aomy aomyVar, defpackage.drs drsVar, dpq dpqVar, dpf dpfVar, int i) {
        this.$cid = i;
        this.c = drqVar;
        this.b = aomyVar;
        this.a = drsVar;
        this.d = dpqVar;
        this.e = dpfVar;
    }

    public /* synthetic */ dqu(ojo ojoVar, android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr, int i) {
        this.$cid = i;
        this.c = ojoVar;
        this.d = uri;
        this.e = contentValues;
        this.a = str;
        this.b = strArr;
    }

    public /* synthetic */ dqu(uod uodVar, android.content.Context context, aoss aossVar, nf nfVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = uodVar;
        this.e = context;
        this.b = aossVar;
        this.d = nfVar;
        this.a = str;
    }
}
