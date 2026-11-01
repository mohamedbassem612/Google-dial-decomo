package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agoj implements ajat {
    public final java.util.List a;
    public final int b;
    public final java.util.concurrent.Executor c;
    private final ahyp e;
    public int d = -1;
    private final ajat f = ahqx.c(this);

    public agoj(java.util.List list, ahyp ahypVar, java.util.concurrent.Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = ahypVar;
        this.c = executor;
    }

    public final ajcq a(java.lang.Object obj) {
        return this.e.a(obj) ? aiql.z(obj) : b();
    }

    public final ajcq b() {
        int i = this.d + 1;
        this.d = i;
        return i < this.b ? ajan.g((ajcq) this.a.get(i), this.f, this.c) : aiql.z((java.lang.Object) null);
    }
}
