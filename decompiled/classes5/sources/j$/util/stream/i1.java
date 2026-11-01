package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i1 implements java.util.function.Consumer {
    public j$.util.stream.h1 a;
    public j$.util.stream.u2 b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        j$.util.stream.h1 h1Var = this.a;
        if (h1Var == null) {
            h1Var = new j$.util.stream.h1();
            this.a = h1Var;
        }
        h1Var.r(obj);
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    public final j$.util.stream.u2 build() {
        j$.util.stream.u2 u2VarC = this.a;
        if (u2VarC == null && this.b == null) {
            return j$.util.stream.n4.E(j$.util.stream.w7.REFERENCE);
        }
        if (u2VarC != null) {
            this.a = null;
            j$.util.stream.u2 u2Var = this.b;
            if (u2Var != null) {
                u2VarC = j$.util.stream.n4.C(j$.util.stream.w7.REFERENCE, u2Var, u2VarC);
            }
            this.b = u2VarC;
        }
        return this.b;
    }
}
