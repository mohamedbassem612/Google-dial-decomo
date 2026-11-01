package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoce implements defpackage.anmp {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aoce(defpackage.anmo anmoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anmoVar);
        this.a = anmoVar;
    }

    @Override // defpackage.anmp
    public final void a(defpackage.anmv anmvVar) {
        if (this.$cid != 0) {
            ((defpackage.anmo) this.a).j(anmvVar.c());
        } else if (anmvVar.c() != null) {
            ((defpackage.aocf) this.a).a.d = true;
        }
    }

    public aoce(defpackage.aocf aocfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aocfVar);
        this.a = aocfVar;
    }
}
