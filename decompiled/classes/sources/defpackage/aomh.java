package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aomh extends defpackage.aomd implements defpackage.aooe {
    private final int a;

    public aomh(int i, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.a = i;
    }

    @Override // defpackage.aooe
    public final int da() {
        return this.a;
    }

    @Override // defpackage.aomb
    public final java.lang.String toString() {
        if (this.A != null) {
            return super.toString();
        }
        java.lang.String strA = defpackage.aoou.a(this);
        defpackage.aooh.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
