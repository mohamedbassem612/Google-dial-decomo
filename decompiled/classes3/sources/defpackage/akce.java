package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akce extends anty {
    public final anty a;
    private final ahqz b;

    public akce(anty antyVar) {
        super((byte[]) null, (byte[]) null, (byte[]) null);
        this.a = antyVar;
        this.b = ahqz.b();
    }

    private final void f(java.lang.Runnable runnable) {
        if (ahns.q()) {
            runnable.run();
        } else {
            ahqz.c(this.b, runnable).run();
        }
    }

    public final void a(anqw anqwVar, anph anphVar) {
        f(new akaz(this, anqwVar, anphVar, 11));
    }

    public final void c(anph anphVar) {
        f(new akbr(this, anphVar, 11, (byte[]) null));
    }

    public final void d(java.lang.Object obj) {
        f(new akbr(this, obj, 12, (byte[]) null));
    }

    public final void e() {
        anty antyVar = this.a;
        j$.util.Objects.requireNonNull(antyVar);
        f(new defpackage.ahts(antyVar, 17));
    }
}
