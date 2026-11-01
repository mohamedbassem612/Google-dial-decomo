package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anpe {
    private final defpackage.anpb a;
    private final java.lang.Object b;
    private volatile byte[] c;

    public anpe(defpackage.anpb anpbVar, java.lang.Object obj) {
        this.a = anpbVar;
        this.b = obj;
    }

    public static defpackage.anpb a(anpc anpcVar) {
        java.lang.Object obj = anpcVar.c;
        return (defpackage.anpb) (defpackage.anpb.class.isInstance(obj) ? defpackage.anpb.class.cast(obj) : null);
    }

    public final java.io.InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = anph.k(b());
                }
            }
        }
        return this.c;
    }
}
