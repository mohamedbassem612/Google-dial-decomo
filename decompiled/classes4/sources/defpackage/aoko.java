package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoko extends defpackage.aojk {
    final /* synthetic */ defpackage.aokp a;
    private int b;
    private int c;

    public aoko(defpackage.aokp aokpVar) {
        this.a = aokpVar;
        this.b = aokpVar.d;
        this.c = aokpVar.c;
    }

    @Override // defpackage.aojk
    protected final void a() {
        if (this.b == 0) {
            b();
            return;
        }
        defpackage.aokp aokpVar = this.a;
        c(aokpVar.a[this.c]);
        this.c = (this.c + 1) % aokpVar.b;
        this.b--;
    }
}
