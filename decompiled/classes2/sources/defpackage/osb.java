package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class osb implements stg {
    private final /* synthetic */ int $cid;
    private final rlv a;
    private final oko b;
    private final java.lang.Object c;

    public osb(aoin aoinVar, rlv rlvVar, oko okoVar, int i) {
        this.$cid = i;
        this.c = aoinVar;
        this.a = rlvVar;
        this.b = okoVar;
    }

    public final aw a() {
        if (this.$cid != 0) {
            this.a.o(rmx.iI);
            return defpackage.oqo.c();
        }
        j$.util.Optional optionalG = ((zjm) this.c).g();
        if (!optionalG.isPresent()) {
            this.a.o(rmx.iH);
            return new aw();
        }
        defpackage.osd osdVar = new defpackage.osd();
        amxr.g(osdVar);
        return osdVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r6v6, types: [aoin, java.lang.Object] */
    public final java.lang.Boolean b(ste steVar) {
        boolean z;
        if (this.$cid == 0) {
            return java.lang.Boolean.valueOf(!this.b.X(steVar.e));
        }
        if (!this.b.X(steVar.e)) {
            z = ((double) (j$.time.Instant.now().toEpochMilli() % 100)) / 100.0d > ((java.lang.Double) this.c.a()).doubleValue();
        }
        return java.lang.Boolean.valueOf(z);
    }

    public osb(zjm zjmVar, rlv rlvVar, oko okoVar, int i) {
        this.$cid = i;
        this.c = zjmVar;
        this.a = rlvVar;
        this.b = okoVar;
    }
}
