package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class cag implements defpackage.cah {
    public final java.lang.Object a;
    public java.lang.Object b;
    private final java.util.ArrayList c = new java.util.ArrayList();

    public cag(java.lang.Object obj) {
        this.a = obj;
        this.b = obj;
    }

    @Override // defpackage.cah
    public final java.lang.Object a() {
        return this.b;
    }

    @Override // defpackage.cah
    public final /* synthetic */ void b(defpackage.aonn aonnVar, java.lang.Object obj) {
        aonnVar.a(a(), obj);
    }

    @Override // defpackage.cah
    public final void c() {
        this.c.clear();
        this.b = this.a;
        e();
    }

    @Override // defpackage.cah
    public final void d(java.lang.Object obj) {
        this.c.add(this.b);
        this.b = obj;
    }

    protected abstract void e();

    @Override // defpackage.cah
    public /* synthetic */ void g() {
        throw null;
    }

    @Override // defpackage.cah
    public final void h() {
        java.util.ArrayList arrayList = this.c;
        this.b = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.cah
    public /* synthetic */ void f() {
    }
}
