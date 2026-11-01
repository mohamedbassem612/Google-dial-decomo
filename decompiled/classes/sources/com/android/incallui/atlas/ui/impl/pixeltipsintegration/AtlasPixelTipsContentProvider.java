package com.android.incallui.atlas.ui.impl.pixeltipsintegration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AtlasPixelTipsContentProvider extends android.content.ContentProvider {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsContentProvider");
    private defpackage.aoin b;
    private defpackage.aoin c;
    private defpackage.aoin d;

    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String str3;
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsContentProvider", "call", 88, "AtlasPixelTipsContentProvider.java")).v("AtlasPixelTipsContentProvider called");
        if (!((defpackage.aaco) this.d.a()).c(android.os.Binder.getCallingUid())) {
            throw new java.lang.SecurityException("Access not allowed for package: ".concat(java.lang.String.valueOf(getCallingPackage())));
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        if ("getArticleConfig".equals(str)) {
            try {
                xap xapVarB = xap.b(((defpackage.xar) ((rju) this.c.a()).j().get()).c);
                if (xapVarB == null) {
                    xapVarB = xap.a;
                }
                str3 = (xapVarB == xap.b || xapVarB == xap.d) ? "dialer.settingIsEnabled" : "dialer.settingIsDisabled";
            } catch (java.lang.InterruptedException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsContentProvider", "getArticleContentProto", 't', "AtlasPixelTipsContentProvider.java")).v("getEnrollmentStatus() interrupted");
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.ExecutionException e2) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e2)).l("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsContentProvider", "getArticleContentProto", 'w', "AtlasPixelTipsContentProvider.java")).v("getEnrollmentStatus() failed");
            }
            defpackage.akzx akzxVarM = afac.a.m();
            akzxVarM.u();
            afac afacVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            afacVar.b |= 1;
            afacVar.c = str3;
            bundle2.putByteArray("article_content_config", akzxVarM.r().i());
            defpackage.akzx akzxVarM2 = afad.a.m();
            boolean zA = ((defpackage.wyc) this.b.a()).a();
            akzxVarM2.u();
            afad afadVar = akzxVarM2.b;
            afadVar.b |= 1;
            afadVar.c = zA;
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
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/incallui/atlas/ui/impl/pixeltipsintegration/AtlasPixelTipsContentProvider", "onCreate", 40, "AtlasPixelTipsContentProvider.java")).v("enter");
        this.b = new defpackage.vfy(this, 15);
        this.c = new defpackage.vfy(this, 16);
        this.d = new defpackage.vfy(this, 17);
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
