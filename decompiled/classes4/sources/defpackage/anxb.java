package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anxb extends anop {
    public final anmm a;
    public final defpackage.anol b;
    public final anqw c;

    public anxb(anmm anmmVar, defpackage.anol anolVar, anqw anqwVar) {
        this.a = (anmm) j$.util.Objects.requireNonNull(anmmVar, "state");
        this.b = (defpackage.anol) j$.util.Objects.requireNonNull(anolVar, "picker");
        this.c = (anqw) j$.util.Objects.requireNonNull(anqwVar, "acceptAddressesStatus");
    }

    public final defpackage.anon a(defpackage.anof anofVar) {
        return new defpackage.anxa(this, anofVar);
    }

    public final java.lang.String c() {
        return "fixed_picker_lb_internal";
    }

    public final void d() {
    }

    public final void e() {
    }
}
