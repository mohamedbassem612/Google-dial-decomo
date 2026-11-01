package com.android.dialer.persistentlog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class PersistentLoggerContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/persistentlog/PersistentLoggerContentProvider");

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, sok] */
    @Override // android.content.ContentProvider
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        android.content.Context context = getContext();
        if (context != null) {
            defpackage.sok sokVar = (defpackage.sok) defpackage.agab.aH(context, defpackage.sok.class);
            j$.util.Optional optionalA = sokVar.bu().a();
            printWriter.println("*** Dialer Persistent Log Contents ***");
            try {
                printWriter.println((java.lang.String) sokVar.bK().a().get(((java.lang.Long) sokVar.hU().a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/persistentlog/PersistentLoggerContentProvider", "dump", 57, "PersistentLoggerContentProvider.java")).v("successfully dumped persistent log");
                sokVar.bs().o(defpackage.rmx.PERSISTENT_LOGGING_SUCCEEDED);
            } catch (java.lang.Exception e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/android/dialer/persistentlog/PersistentLoggerContentProvider", "dump", '>', "PersistentLoggerContentProvider.java")).v("error dumping persistent log");
                sokVar.bs().o(defpackage.rmx.PERSISTENT_LOGGING_FAILED);
                if (e instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
            printWriter.flush();
            rhb rhbVar = new rhb(sokVar, 10);
            if (true == optionalA.isPresent()) {
                rhbVar.a.bu().p((defpackage.aeun) optionalA.get(), defpackage.ruc.bH);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.UnsupportedOperationException();
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
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
