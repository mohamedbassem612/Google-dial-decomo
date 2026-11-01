package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class vhj implements defpackage.vha {
    protected final java.util.ArrayList a = new java.util.ArrayList();
    protected java.lang.String b;

    @Override // defpackage.vha
    public java.io.InputStream a() {
        return null;
    }

    public final int c() {
        return this.a.size();
    }

    public final defpackage.vhb d(int i) {
        return (defpackage.vhb) this.a.get(i);
    }

    public java.lang.String e() {
        return this.b;
    }

    public final void f(defpackage.vhb vhbVar) {
        this.a.add(vhbVar);
    }

    @Override // defpackage.vha
    public void b(android.content.Context context, java.io.OutputStream outputStream) {
    }
}
