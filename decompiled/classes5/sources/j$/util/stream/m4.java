package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class m4 extends java.util.concurrent.CountedCompleter {
    public final j$.util.stream.u2 a;
    public final int b;

    public m4(j$.util.stream.u2 u2Var) {
        this.a = u2Var;
        this.b = 0;
    }

    public abstract void a();

    public abstract j$.util.stream.m4 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.l() != 0) {
            this.setPendingCount(this.a.l() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iL = this.a.l() - 1;
                i = this.b + iCount;
                if (i2 < iL) {
                    j$.util.stream.m4 m4VarB = this.b(i2, i);
                    iCount = (int) (m4VarB.a.count() + ((long) iCount));
                    m4VarB.fork();
                    i2++;
                }
            }
            this = this.b(i2, i);
        }
        this.a();
        this.propagateCompletion();
    }

    public m4(j$.util.stream.m4 m4Var, j$.util.stream.u2 u2Var, int i) {
        super(m4Var);
        this.a = u2Var;
        this.b = i;
    }
}
