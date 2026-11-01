package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class amc implements defpackage.als {
    private final int a;
    private final int b;
    private final ajh c;
    private final defpackage.alu d;

    public amc(int i, int i2, ajh ajhVar) {
        this.a = i;
        this.b = i2;
        this.c = ajhVar;
        this.d = new defpackage.alu(new defpackage.ajq(i, i2, ajhVar));
    }

    @Override // defpackage.alp
    public final /* synthetic */ long a(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return defpackage.yj.a(this);
    }

    @Override // defpackage.alp
    public final /* synthetic */ aiw b(aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return d(defpackage.yj.a(this), aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw c(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.d.c(j, aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final aiw d(long j, aiw aiwVar, aiw aiwVar2, aiw aiwVar3) {
        return this.d.d(j, aiwVar, aiwVar2, aiwVar3);
    }

    @Override // defpackage.alp
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.als
    public final int f() {
        return this.b;
    }

    @Override // defpackage.als
    public final int g() {
        return this.a;
    }
}
