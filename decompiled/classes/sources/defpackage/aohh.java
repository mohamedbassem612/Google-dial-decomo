package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aohh {
    public final defpackage.anmc a;
    public final defpackage.anmb b;

    protected aohh(defpackage.anmc anmcVar, defpackage.anmb anmbVar) {
        if (anmcVar == null) {
            throw new java.lang.NullPointerException("channel");
        }
        this.a = anmcVar;
        if (anmbVar == null) {
            throw new java.lang.NullPointerException("callOptions");
        }
        this.b = anmbVar;
    }

    protected abstract defpackage.aohh a(defpackage.anmc anmcVar, defpackage.anmb anmbVar);

    public final defpackage.aohh i(long j, java.util.concurrent.TimeUnit timeUnit) {
        return a(this.a, this.b.b(defpackage.anmw.c(j, timeUnit)));
    }

    public final defpackage.aohh j(defpackage.anme... anmeVarArr) {
        return a(defpackage.ajsz.dt(this.a, anmeVarArr), this.b);
    }

    public final defpackage.aohh k(defpackage.anma anmaVar, java.lang.Object obj) {
        return a(this.a, this.b.e(anmaVar, obj));
    }

    public final defpackage.aohh l(defpackage.anar anarVar) {
        defpackage.anlz anlzVarA = defpackage.anmb.a(this.b);
        anlzVarA.h = anarVar;
        return a(this.a, new defpackage.anmb(anlzVarA));
    }
}
