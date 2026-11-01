package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbq extends dye {
    final /* synthetic */ defpackage.agbv a;

    public agbq(defpackage.agbv agbvVar) {
        j$.util.Objects.requireNonNull(agbvVar);
        this.a = agbvVar;
    }

    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.h(1048576);
        ebdVar.x(true);
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.a.e(3);
        return true;
    }
}
