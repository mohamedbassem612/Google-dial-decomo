package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xux extends defpackage.xvn {
    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return android.content.res.AssetFileDescriptor.class;
    }

    @Override // defpackage.xvn
    protected final /* bridge */ /* synthetic */ java.lang.Object b(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        android.content.res.AssetFileDescriptor assetFileDescriptorF = f(uri);
        if (assetFileDescriptorF != null) {
            return assetFileDescriptorF;
        }
        throw new java.io.FileNotFoundException("FileDescriptor is null for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // defpackage.xvn
    protected final /* synthetic */ void c(java.lang.Object obj) throws java.io.IOException {
        ((android.content.res.AssetFileDescriptor) obj).close();
    }
}
