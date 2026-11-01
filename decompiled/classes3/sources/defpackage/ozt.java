package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ozt implements ahjr {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/paw/impl/PawSecretCodeReceiver");
    public final android.content.Context b;
    public final rlv c;
    private final aogc d;

    public ozt(android.content.Context context, rlv rlvVar, aogc aogcVar) {
        this.b = context;
        this.c = rlvVar;
        this.d = aogcVar;
    }

    public final ajcq a(android.content.Intent intent, int i) {
        java.lang.String host = intent.getData().getHost();
        if (android.text.TextUtils.isEmpty(host)) {
            return ajcm.a;
        }
        return !android.text.TextUtils.equals("729", host) ? ajcm.a : this.d.bl(new jsd(this, 17));
    }
}
