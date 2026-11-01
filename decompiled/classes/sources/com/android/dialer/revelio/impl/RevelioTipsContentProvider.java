package com.android.dialer.revelio.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class RevelioTipsContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/RevelioTipsContentProvider");

    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/RevelioTipsContentProvider", "call", 64, "RevelioTipsContentProvider.java")).v("RevelioTipsContentProvider called");
        int callingUid = android.os.Binder.getCallingUid();
        if (callingUid != android.os.Process.myUid() && !defpackage.aaco.a(getContext()).c(callingUid)) {
            throw new java.lang.SecurityException("Access not allowed for package: ".concat(java.lang.String.valueOf(getCallingPackage())));
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        if ("getArticleConfig".equals(str)) {
            defpackage.akzx akzxVarM = afac.a.m();
            akzxVarM.u();
            afac afacVar = akzxVarM.b;
            j$.util.Objects.requireNonNull("dialer.settingIsDisabled");
            afacVar.b |= 1;
            afacVar.c = "dialer.settingIsDisabled";
            bundle2.putByteArray("article_content_config", akzxVarM.r().i());
            defpackage.akzx akzxVarM2 = afad.a.m();
            akzxVarM2.u();
            afad afadVar = akzxVarM2.b;
            afadVar.b |= 1;
            afadVar.c = false;
            bundle2.putByteArray("article_visibility_config", akzxVarM2.r().i());
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
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
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/RevelioTipsContentProvider", "onCreate", 32, "RevelioTipsContentProvider.java")).v("enter");
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
