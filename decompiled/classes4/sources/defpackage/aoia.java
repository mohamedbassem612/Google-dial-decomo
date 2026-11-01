package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class aoia extends defpackage.aohz {
    final /* synthetic */ defpackage.aoib a;

    protected aoia(defpackage.aoib aoibVar) {
        j$.util.Objects.requireNonNull(aoibVar);
        this.a = aoibVar;
    }

    @Override // defpackage.aohz, defpackage.anof
    public void f(anmm anmmVar, defpackage.anol anolVar) {
        defpackage.aoib aoibVar = this.a;
        if (aoibVar.c != anmm.e) {
            aoibVar.c = anmmVar;
            aoibVar.d = anolVar;
            defpackage.aoid aoidVar = aoibVar.e;
            if (aoidVar.i) {
                return;
            }
            aoidVar.f();
        }
    }

    @Override // defpackage.aohz
    protected final defpackage.anof g() {
        return this.a.e.h;
    }
}
