package com.android.dialer.revelio.impl.tidepods.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class TidepodsRevelioTipsContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioTipsContentProvider");
    private defpackage.aoin b;

    /* JADX WARN: Code duplicated, block: B:21:0x00e8  */
    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String str3;
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioTipsContentProvider", "call", 86, "TidepodsRevelioTipsContentProvider.java")).v("TidepodsRevelioTipsContentProvider called");
        int callingUid = android.os.Binder.getCallingUid();
        if (callingUid != android.os.Process.myUid() && !defpackage.aaco.a(getContext()).c(callingUid)) {
            throw new java.lang.SecurityException("Access not allowed for package: ".concat(java.lang.String.valueOf(getCallingPackage())));
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        if ("getArticleConfig".equals(str)) {
            j$.util.Optional optionalG = ((defpackage.zjm) this.b.a()).g();
            try {
                if (optionalG.isPresent()) {
                    defpackage.swv swvVar = (defpackage.swv) optionalG.orElseThrow();
                    if (((java.lang.Boolean) defpackage.ahrv.g(swvVar.i.e()).h(new rht(18), swvVar.c).get()).booleanValue()) {
                        str3 = "dialer.settingIsEnabled";
                    } else {
                        str3 = "dialer.settingIsDisabled";
                    }
                } else {
                    str3 = "dialer.settingIsDisabled";
                }
            } catch (java.lang.InterruptedException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioTipsContentProvider", "getArticleContentProto", 114, "TidepodsRevelioTipsContentProvider.java")).I("Interrupted while getting Tidepods Revelio settings [%s]: %s", e.getClass(), e.getMessage());
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.ExecutionException e2) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioTipsContentProvider", "getArticleContentProto", 122, "TidepodsRevelioTipsContentProvider.java")).I("Failed getting Tidepods Revelio settings [%s]: %s", e2.getClass(), e2.getMessage());
            }
            defpackage.akzx akzxVarM = afac.a.m();
            akzxVarM.u();
            afac afacVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            afacVar.b |= 1;
            afacVar.c = str3;
            bundle2.putByteArray("article_content_config", akzxVarM.r().i());
            j$.util.Optional optionalG2 = ((defpackage.zjm) this.b.a()).g();
            defpackage.akzx akzxVarM2 = afad.a.m();
            boolean zIsPresent = optionalG2.isPresent();
            akzxVarM2.u();
            afad afadVar = akzxVarM2.b;
            afadVar.b |= 1;
            afadVar.c = zIsPresent;
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
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioTipsContentProvider", "onCreate", 42, "TidepodsRevelioTipsContentProvider.java")).v("enter");
        this.b = new defpackage.rmg(this, 17);
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
