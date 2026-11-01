package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dyi implements defpackage.dyj {
    private final android.view.ContentInfo a;

    public dyi(android.view.ContentInfo contentInfo) {
        dzk.x(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.dyj
    public final int a() {
        return ac$.ExternalSyntheticApiModelOutline0.m(this.a);
    }

    @Override // defpackage.dyj
    public final int b() {
        return ac$.ExternalSyntheticApiModelOutline0.m$1(this.a);
    }

    @Override // defpackage.dyj
    public final android.content.ClipData c() {
        return ac$.ExternalSyntheticApiModelOutline0.m(this.a);
    }

    @Override // defpackage.dyj
    public final android.view.ContentInfo d() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ContentInfoCompat{" + this.a + '}';
    }
}
