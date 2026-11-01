package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class axz extends cmv implements ddh {
    public azz b;
    public azz c;

    public axz() {
        axk axkVar = bab.a;
        this.b = axkVar;
        this.c = axkVar;
    }

    private final void e() {
        den.q(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new defpackage.auj(this, 8));
    }

    public abstract azz b(azz azzVar);

    public final void cZ() {
        this.b = bab.a;
    }

    public void d() {
        if (((cmv) this).D) {
            this.c = b(this.b);
            e();
        }
    }

    public final java.lang.Object db() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public void dc() {
        den.o(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new defpackage.auj(this, 9));
        d();
    }

    public void u() {
        this.c = this.b;
        e();
    }
}
