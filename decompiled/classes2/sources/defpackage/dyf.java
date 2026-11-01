package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dyf implements defpackage.dyg {
    private final android.view.ContentInfo.Builder a;

    public dyf(android.content.ClipData clipData, int i) {
        this.a = new android.view.ContentInfo.Builder(clipData, i);
    }

    @Override // defpackage.dyg
    public final defpackage.dyl a() {
        return new defpackage.dyl(new defpackage.dyi(ac$.ExternalSyntheticApiModelOutline0.m(this.a)));
    }

    @Override // defpackage.dyg
    public final void b(android.os.Bundle bundle) {
        ac$.ExternalSyntheticApiModelOutline0.m(this.a, bundle);
    }

    @Override // defpackage.dyg
    public final void c(int i) {
        ac$.ExternalSyntheticApiModelOutline0.m(this.a, i);
    }

    @Override // defpackage.dyg
    public final void d(android.net.Uri uri) {
        ac$.ExternalSyntheticApiModelOutline0.m(this.a, uri);
    }
}
