package com.android.dialer.androidauto.impl.caricons;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class CarIconContentProvider extends androidx.core.content.FileProvider {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/androidauto/impl/caricons/CarIconContentProvider");
    private final defpackage.ahzi b = defpackage.ahvr.bI(new defpackage.hlv(this, 1));
    private final defpackage.ahzi c = defpackage.ahvr.bI(new defpackage.hlv(this, 0));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.net.Uri uri, defpackage.aoln aolnVar) {
        hlw hlwVar;
        if (aolnVar instanceof hlw) {
            hlwVar = (hlw) aolnVar;
            int i = hlwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hlwVar.c = i - Integer.MIN_VALUE;
            } else {
                hlwVar = new hlw(this, aolnVar);
            }
        } else {
            hlwVar = new hlw(this, aolnVar);
        }
        java.lang.Object objA = hlwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hlwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.akzx akzxVarM = abwd.a.m();
            java.lang.String queryParameter = uri.getQueryParameter("photoThumbnailUri");
            if (queryParameter != null) {
                akzxVarM.u();
                abwd abwdVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(queryParameter);
                abwdVar.b |= 4;
                abwdVar.e = queryParameter;
            }
            java.lang.String queryParameter2 = uri.getQueryParameter("photoId");
            if (queryParameter2 != null) {
                long j = java.lang.Long.parseLong(queryParameter2);
                akzxVarM.u();
                abwd abwdVar2 = akzxVarM.b;
                abwdVar2.b |= 8;
                abwdVar2.f = j;
            }
            java.lang.String queryParameter3 = uri.getQueryParameter("name");
            if (queryParameter3 != null) {
                akzxVarM.u();
                abwd abwdVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(queryParameter3);
                abwdVar3.b |= 1;
                abwdVar3.c = queryParameter3;
            }
            java.lang.String queryParameter4 = uri.getQueryParameter("lookupUri");
            if (queryParameter4 != null) {
                akzxVarM.u();
                abwd abwdVar4 = akzxVarM.b;
                j$.util.Objects.requireNonNull(queryParameter4);
                abwdVar4.b |= 16;
                abwdVar4.g = queryParameter4;
            }
            java.lang.String queryParameter5 = uri.getQueryParameter("formattedNumber");
            if (queryParameter5 != null) {
                akzxVarM.u();
                abwd abwdVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(queryParameter5);
                abwdVar5.b |= 2;
                abwdVar5.d = queryParameter5;
            }
            java.lang.String queryParameter6 = uri.getQueryParameter("isSpam");
            if (queryParameter6 != null) {
                boolean z = java.lang.Boolean.parseBoolean(queryParameter6);
                akzxVarM.u();
                abwd abwdVar6 = akzxVarM.b;
                abwdVar6.b |= 256;
                abwdVar6.k = z;
            }
            abwd abwdVarR = akzxVarM.r();
            defpackage.aooh.e(abwdVarR, "build(...)");
            abwd abwdVar7 = abwdVarR;
            java.lang.String queryParameter7 = uri.getQueryParameter("width");
            if (queryParameter7 == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            int i3 = java.lang.Integer.parseInt(queryParameter7);
            java.lang.String queryParameter8 = uri.getQueryParameter("height");
            if (queryParameter8 == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            defpackage.ahzi ahziVar = this.c;
            int i4 = java.lang.Integer.parseInt(queryParameter8);
            java.lang.Object objEZ = ahziVar.eZ();
            defpackage.aooh.e(objEZ, "get(...)");
            defpackage.ajcq ajcqVarE = ((defpackage.ops) this.b.eZ()).e(abwdVar7, oph.a(), i3, i4);
            defpackage.aosy aosyVarAm = defpackage.aoov.am((defpackage.aoss) objEZ, 0, new defpackage.dmu(ajcqVarE, (defpackage.aoln) null, 11), 3);
            aosyVarAm.p(new aib(ajcqVarE, 11));
            hlwVar.c = 1;
            objA = aosyVarAm.a(hlwVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        defpackage.aooh.e(objA, "await(...)");
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        hlx hlxVar;
        if (aolnVar instanceof hlx) {
            hlxVar = (hlx) aolnVar;
            int i = hlxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hlxVar.c = i - Integer.MIN_VALUE;
            } else {
                hlxVar = new hlx(this, aolnVar);
            }
        } else {
            hlxVar = new hlx(this, aolnVar);
        }
        java.lang.Object objA = hlxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = hlxVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objA);
                ((defpackage.aimw) a.b().l("com/android/dialer/androidauto/impl/caricons/CarIconContentProvider", "loadCallBackgroundViaGlide", 116, "CarIconContentProvider.kt")).v("CarIconContentProvider.loadCallBackgroundViaGlide: decoding bitmap via Glide API");
                java.lang.Object objEZ = this.c.eZ();
                defpackage.aooh.e(objEZ, "get(...)");
                defpackage.ops opsVar = (defpackage.ops) this.b.eZ();
                ((defpackage.aimw) ((defpackage.aimw) defpackage.ops.a.b()).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl", "loadCallBackgroundIntoBitmap", 323, "GlidePhotoManagerImpl.java")).y("loadCallBackgroundIntoBitmap: %s", str);
                defpackage.ajcq ajcqVarM = defpackage.dff.m(new jnr(opsVar, str, 3));
                defpackage.aosy aosyVarAm = defpackage.aoov.am((defpackage.aoss) objEZ, 0, new defpackage.dmu(ajcqVarM, (defpackage.aoln) null, 12, (byte[]) null), 3);
                aosyVarAm.p(new aib(ajcqVarM, 12));
                hlxVar.d = str;
                hlxVar.c = 1;
                objA = aosyVarAm.a(hlxVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = hlxVar.d;
                defpackage.aooc.af(objA);
            }
            j$.util.Optional optional = (j$.util.Optional) objA;
            if (!optional.isPresent()) {
                ((defpackage.aimw) a.d().l("com/android/dialer/androidauto/impl/caricons/CarIconContentProvider", "loadCallBackgroundViaGlide", 133, "CarIconContentProvider.kt")).y("Failed to decode a calling card background bitmap for URI: %s", str);
            }
            defpackage.aooh.c(optional);
            return optional;
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/androidauto/impl/caricons/CarIconContentProvider", "loadCallBackgroundViaGlide", 143, "CarIconContentProvider.kt")).y("Unexpected error decoding call background bitmap for URI: %s", str);
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            defpackage.aooh.c(optionalEmpty);
            return optionalEmpty;
        }
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.IOException {
        defpackage.aooh.f(uri, "uri");
        defpackage.aooh.f(str, "mode");
        long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
        defpackage.aooh.c(parcelFileDescriptorArrCreatePipe);
        android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
        java.lang.Object objEZ = this.c.eZ();
        defpackage.aooh.e(objEZ, "get(...)");
        defpackage.aoov.an((defpackage.aoss) objEZ, null, 0, new amh(this, uri, parcelFileDescriptor2, (defpackage.aoln) null, 17), 3);
        android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
        defpackage.aooh.c(parcelFileDescriptor);
        return parcelFileDescriptor;
    }
}
