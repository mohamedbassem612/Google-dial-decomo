package com.android.dialer.sodatranscription.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class SodaAudioFileDescriptorProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/SodaAudioFileDescriptorProvider");

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aooh.f(uri, "uri");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        defpackage.aooh.f(uri, "uri");
        return "audio";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        defpackage.aooh.f(uri, "uri");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        defpackage.aooh.f(uri, "uri");
        defpackage.aooh.f(str, "mode");
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sodatranscription/impl/SodaAudioFileDescriptorProvider", "openFile", 26, "SodaAudioFileDescriptorProvider.kt")).I("openFile(%s, %s)", uri, str);
        if (!defpackage.aooh.n(str, "r")) {
            throw new java.io.FileNotFoundException("Only read mode is supported.");
        }
        int id = (int) android.content.ContentUris.parseId(uri);
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sodatranscription/impl/SodaAudioFileDescriptorProvider", "openFile", 31, "SodaAudioFileDescriptorProvider.kt")).w("Adopting %d file descriptor", id);
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorFromFd = android.os.ParcelFileDescriptor.fromFd(id);
            defpackage.aooh.c(parcelFileDescriptorFromFd);
            return parcelFileDescriptorFromFd;
        } catch (java.io.IOException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e).l("com/android/dialer/sodatranscription/impl/SodaAudioFileDescriptorProvider", "openFile", 36, "SodaAudioFileDescriptorProvider.kt")).v("falling back to adoptFd");
            android.os.ParcelFileDescriptor parcelFileDescriptorAdoptFd = android.os.ParcelFileDescriptor.adoptFd(id);
            defpackage.aooh.c(parcelFileDescriptorAdoptFd);
            return parcelFileDescriptorAdoptFd;
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        defpackage.aooh.f(uri, "uri");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        defpackage.aooh.f(uri, "uri");
        throw new java.lang.UnsupportedOperationException();
    }
}
