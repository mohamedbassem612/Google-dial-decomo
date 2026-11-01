package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvq extends defpackage.xuy {
    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // defpackage.xuy
    protected final /* synthetic */ java.lang.Object c(android.content.res.AssetManager assetManager, java.lang.String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.xuy
    protected final /* synthetic */ void f(java.lang.Object obj) throws java.io.IOException {
        ((java.io.InputStream) obj).close();
    }
}
