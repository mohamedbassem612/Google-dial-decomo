package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aomg extends defpackage.aomf implements defpackage.aooe {
    public aomg(defpackage.aoln aolnVar) {
        super(aolnVar);
    }

    @Override // defpackage.aooe
    public final int da() {
        return 2;
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
