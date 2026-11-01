package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anxu {
    private final java.util.ArrayList a = new java.util.ArrayList();

    public final void a(java.lang.Object obj) {
        this.a.add(obj.toString());
    }

    public final void b(java.lang.String str, java.lang.Object obj) {
        this.a.add(str + '=' + java.lang.String.valueOf(obj));
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
