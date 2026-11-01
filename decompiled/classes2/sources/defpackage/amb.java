package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class amb implements defpackage.alp {
    private final /* synthetic */ defpackage.alu a;

    public amb(float f, float f2, aiw aiwVar) {
        int[] iArr = defpackage.alr.a;
        this.a = new defpackage.alu((aiwVar == null && f == 1.0f && f2 == 1500.0f) ? defpackage.ajd.a : aiwVar != null ? new defpackage.alq(aiwVar, f, f2, 1) : new defpackage.alq(f, f2, 0));
    }

    @Override // defpackage.alp
    public final long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.a(aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.b(aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.c(j, aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.a.d(j, aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final boolean e() {
        return false;
    }
}
