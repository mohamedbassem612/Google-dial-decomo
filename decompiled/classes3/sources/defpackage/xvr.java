package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvr extends defpackage.xvn {
    private static final android.content.UriMatcher b;

    static {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    private static final java.io.InputStream h(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    @Override // defpackage.xvn
    protected final /* bridge */ /* synthetic */ java.lang.Object b(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        android.net.Uri uriLookupContact;
        java.io.InputStream inputStreamH;
        int iMatch = b.match(uri);
        if (iMatch == 1) {
            uriLookupContact = android.provider.ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new java.io.FileNotFoundException("Contact cannot be found");
            }
            inputStreamH = h(contentResolver, uriLookupContact);
        } else if (iMatch == 3) {
            inputStreamH = h(contentResolver, uri);
        } else if (iMatch == 5) {
            uriLookupContact = android.provider.ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new java.io.FileNotFoundException("Contact cannot be found");
            }
            inputStreamH = h(contentResolver, uriLookupContact);
        } else if (this.a && defpackage.xff.x(uri) && defpackage.xff.w()) {
            android.content.res.AssetFileDescriptor assetFileDescriptorV = defpackage.xff.v(uri, contentResolver);
            if (assetFileDescriptorV == null) {
                throw new java.io.FileNotFoundException("FileDescriptor is null for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
            }
            try {
                inputStreamH = assetFileDescriptorV.createInputStream();
            } catch (java.io.IOException e) {
                try {
                    assetFileDescriptorV.close();
                } catch (java.lang.Exception unused) {
                }
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("Unable to create stream").initCause(e));
            }
        } else {
            inputStreamH = contentResolver.openInputStream(uri);
        }
        if (inputStreamH != null) {
            return inputStreamH;
        }
        throw new java.io.FileNotFoundException("InputStream is null for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // defpackage.xvn
    protected final /* synthetic */ void c(java.lang.Object obj) throws java.io.IOException {
        ((java.io.InputStream) obj).close();
    }
}
