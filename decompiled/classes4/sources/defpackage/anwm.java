package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anwm extends defpackage.anwq {
    public final defpackage.anoi a;
    public final defpackage.anmv b;
    public final anmg[] c;
    public volatile anqw d;
    final /* synthetic */ anwn e;
    private java.lang.String g;
    private java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwm(anwn anwnVar, defpackage.anoi anoiVar, anmg[] anmgVarArr, java.lang.String str, java.lang.String str2) {
        super("connecting_and_lb");
        j$.util.Objects.requireNonNull(anwnVar);
        this.e = anwnVar;
        this.b = defpackage.anmv.k();
        this.a = anoiVar;
        this.c = anmgVarArr;
        this.g = str;
        this.h = str2;
        for (anmg anmgVar : anmgVarArr) {
        }
    }

    @Override // defpackage.anwq, defpackage.anvp
    public final void b(defpackage.anxu anxuVar) {
        if (this.a.a.g()) {
            anxuVar.a("wait_for_ready");
            anqw anqwVar = this.d;
            if (anqwVar != null && !anqwVar.h()) {
                anxuVar.b("Last Pick Failure", anqwVar);
            }
        }
        super.b(anxuVar);
    }

    @Override // defpackage.anwq, defpackage.anvp
    public final void c(anqw anqwVar) {
        super.c(anqwVar);
        anwn anwnVar = this.e;
        synchronized (anwnVar.a) {
            if (anwnVar.e != null) {
                boolean zRemove = anwnVar.g.remove(this);
                if (!anwnVar.e() && zRemove) {
                    anrc anrcVar = anwnVar.b;
                    anrcVar.b(anwnVar.d);
                    if (anwnVar.h.a != null) {
                        anrcVar.b(anwnVar.e);
                        anwnVar.e = null;
                    }
                }
            }
        }
        this.e.b.a();
    }

    final java.lang.Runnable p(defpackage.anvp anvpVar) {
        q();
        return t(anvpVar);
    }

    final synchronized void q() {
        if (this.g != null) {
            this.g = null;
            this.h = null;
            for (anmg anmgVar : this.c) {
            }
        }
    }

    final synchronized void r(java.lang.String str, java.lang.String str2) {
        if (this.f == null) {
            int i = 0;
            if (!str.equals(this.g)) {
                q();
                this.g = str;
                this.h = str2;
                anmg[] anmgVarArr = this.c;
                while (i < anmgVarArr.length) {
                    anmg anmgVar = anmgVarArr[i];
                    i++;
                }
            } else if (!str2.equals(this.h)) {
                this.h = str2;
                anmg[] anmgVarArr2 = this.c;
                while (i < anmgVarArr2.length) {
                    anmg anmgVar2 = anmgVarArr2[i];
                    i++;
                }
            }
        }
    }

    @Override // defpackage.anwq
    protected final void s() {
        q();
        int i = 0;
        while (true) {
            anmg[] anmgVarArr = this.c;
            if (i >= anmgVarArr.length) {
                return;
            }
            anmg anmgVar = anmgVarArr[i];
            i++;
        }
    }
}
