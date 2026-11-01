package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rkh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/largescreensupport/activityembedding/AndroidxActivityEmbeddingApi");
    public final android.content.Context b;

    public rkh(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = context;
    }

    public final boolean a(android.app.Activity activity) {
        return defpackage.gus.aT(this.b).aa(activity);
    }

    public final boolean b() {
        return defpackage.aooh.n(defpackage.gus.T(this.b).y(), defpackage.gpn.a);
    }
}
