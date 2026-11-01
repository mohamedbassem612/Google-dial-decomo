package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aef extends aokj {
    final /* synthetic */ aed a;
    private int b;

    public aef(aed aedVar) {
        this.a = aedVar;
    }

    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.b(i);
    }

    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
