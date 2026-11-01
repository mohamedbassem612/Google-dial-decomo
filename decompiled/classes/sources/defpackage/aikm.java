package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikm extends defpackage.aigy {
    static final defpackage.aikm a = new defpackage.aikm(new defpackage.aijx());
    final transient defpackage.aijx b;
    private final transient int c;

    public aikm(defpackage.aijx aijxVar) {
        this.b = aijxVar;
        long jC = 0;
        for (int i = 0; i < aijxVar.c; i++) {
            jC += (long) aijxVar.c(i);
        }
        this.c = defpackage.aiql.T(jC);
    }

    @Override // defpackage.aijo
    public final int b(java.lang.Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.aigy, defpackage.aijo
    public final /* synthetic */ java.util.Set i() {
        return new defpackage.aikk(this);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aigy
    public final defpackage.aihd n() {
        return new defpackage.aikk(this);
    }

    @Override // defpackage.aigy
    public final aijp p(int i) {
        return this.b.p(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.aijo
    public final int size() {
        return this.c;
    }

    @Override // defpackage.aigy, defpackage.aifo
    public java.lang.Object writeReplace() {
        return new aikl(this);
    }
}
