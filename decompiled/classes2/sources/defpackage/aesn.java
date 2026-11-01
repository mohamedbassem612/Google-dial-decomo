package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aesn extends defpackage.li {
    final /* synthetic */ aenj a;
    final /* synthetic */ aeso b;
    private boolean c;

    public aesn(aeso aesoVar, aenj aenjVar) {
        this.a = aenjVar;
        j$.util.Objects.requireNonNull(aesoVar);
        this.b = aesoVar;
    }

    @Override // defpackage.li
    public final void g(android.support.v7.widget.RecyclerView recyclerView, int i) {
        if (this.c) {
            if (i == 0) {
                this.b.f(this.a);
                this.c = false;
                return;
            }
            return;
        }
        if (i == 1) {
            this.b.d(this.a);
            this.c = true;
        }
    }

    @Override // defpackage.li
    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
    }
}
