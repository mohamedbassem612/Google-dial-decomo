package com.android.dialer.callscreen.impl.speechrecognition;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class SodaAudioProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callscreen/impl/speechrecognition/SodaAudioProvider");

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return "audio";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaAudioProvider", "openFile", 36, "SodaAudioProvider.java")).I("openFile(%s, %s)", uri, str);
        if (!str.equals("r")) {
            throw new java.io.FileNotFoundException("Only read mode is supported.");
        }
        int id = (int) android.content.ContentUris.parseId(uri);
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaAudioProvider", "openFile", 42, "SodaAudioProvider.java")).w("Adopting %d file descriptor", id);
        try {
            return android.os.ParcelFileDescriptor.fromFd(id);
        } catch (java.io.IOException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/callscreen/impl/speechrecognition/SodaAudioProvider", "openFile", '0', "SodaAudioProvider.java")).v("falling back to adoptFd");
            return android.os.ParcelFileDescriptor.adoptFd(id);
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
