package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqx implements aoql {
    public final java.lang.CharSequence a;
    public final int b;
    public final aonn c;

    public aoqx(java.lang.CharSequence charSequence, int i, aonn aonnVar) {
        aooh.f(charSequence, "input");
        this.a = charSequence;
        this.b = i;
        this.c = aonnVar;
    }

    public final java.util.Iterator a() {
        return new defpackage.aoqw(this);
    }
}
