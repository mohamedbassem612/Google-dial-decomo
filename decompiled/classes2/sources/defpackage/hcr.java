package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcr {
    public final android.content.res.AssetManager d;
    public final defpackage.hcz a = new defpackage.hcz();
    public final java.util.Map b = new java.util.HashMap();
    public final java.util.Map c = new java.util.HashMap();
    public java.lang.String e = ".ttf";

    public hcr(android.graphics.drawable.Drawable.Callback callback) {
        if (callback instanceof android.view.View) {
            this.d = ((android.view.View) callback).getContext().getAssets();
        } else {
            defpackage.hge.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }
}
