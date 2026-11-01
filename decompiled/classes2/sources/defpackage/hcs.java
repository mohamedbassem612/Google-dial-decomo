package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hcs {
    private static final java.lang.Object d = new java.lang.Object();
    public final android.content.Context a;
    public final java.lang.String b;
    public final java.util.Map c;

    public hcs(android.graphics.drawable.Drawable.Callback callback, java.lang.String str, java.util.Map map) {
        if (android.text.TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = java.lang.String.valueOf(str).concat("/");
        }
        this.c = map;
        if (callback instanceof android.view.View) {
            this.a = ((android.view.View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    public final void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        synchronized (d) {
            ((defpackage.gzt) this.c.get(str)).f = bitmap;
        }
    }
}
