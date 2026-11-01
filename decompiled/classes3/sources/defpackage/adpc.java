package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class adpc {
    protected android.media.AudioManager a;

    public adpc(android.content.Context context, java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(str).concat(" permission is missing"));
            }
        }
        this.a = (android.media.AudioManager) context.getSystemService("audio");
    }

    public abstract void d();

    public abstract void e();

    public boolean f() {
        return true;
    }
}
