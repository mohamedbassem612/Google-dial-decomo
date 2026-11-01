package com.android.dialer.interactions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ContactUpdateService extends android.app.IntentService {
    private static final aimz a = aimz.i("com/android/dialer/interactions/ContactUpdateService");

    public ContactUpdateService() {
        super("ContactUpdateService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent intent) {
        long longExtra = intent.getLongExtra("phone_number_data_id", -1L);
        if (longExtra == -1) {
            a.bI(a.c().m(aioa.b), "Invalid arguments for setSuperPrimary request", "com/android/dialer/interactions/ContactUpdateService", "setSuperPrimary", 'H', "ContactUpdateService.java", zct.b);
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(2);
        contentValues.put("is_super_primary", (java.lang.Integer) 1);
        contentValues.put("is_primary", (java.lang.Integer) 1);
        ((rhk) agab.aH(this, rhk.class)).aZ().q(android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, longExtra), contentValues, (java.lang.String) null, (java.lang.String[]) null);
    }
}
