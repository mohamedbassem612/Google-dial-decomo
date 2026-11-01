package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aeyt {
    public final boolean a;
    public final defpackage.aihd c;
    private final defpackage.ahyc d;
    private volatile java.lang.String e = null;
    public final boolean b = false;

    public aeyt(defpackage.ahyc ahycVar, boolean z, defpackage.aihd aihdVar) {
        this.d = ahycVar;
        this.a = z;
        this.c = aihdVar;
    }

    final java.lang.String a(android.content.Context context) {
        java.lang.String str = this.e;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) this.d.apply(context);
        this.e = str2;
        return str2;
    }
}
