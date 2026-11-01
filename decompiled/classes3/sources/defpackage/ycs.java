package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycs implements defpackage.xuu {
    private final /* synthetic */ int $cid;

    public ycs(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xuu
    public final /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        int i3 = this.$cid;
        if (i3 != 0) {
            return i3 != 1 ? new defpackage.yaj((java.io.File) obj) : new defpackage.ycl((android.graphics.Bitmap) obj, 1);
        }
        return defpackage.ycq.g((android.graphics.drawable.Drawable) obj);
    }

    @Override // defpackage.xuu
    public final /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        int i = this.$cid;
        if (i == 0) {
        } else if (i != 1) {
        }
        return true;
    }
}
