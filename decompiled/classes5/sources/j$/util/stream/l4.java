package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class l4 extends j$.util.stream.m4 {
    public final /* synthetic */ byte c;
    public final java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(j$.util.stream.l4 l4Var, j$.util.stream.u2 u2Var, int i) {
        super(l4Var, u2Var, i);
        this.c = (byte) 1;
        this.d = (java.lang.Object[]) l4Var.d;
    }

    @Override // j$.util.stream.m4
    public final void a() {
        switch (this.c) {
            case 0:
                ((j$.util.stream.t2) this.a).c(this.b, this.d);
                break;
            default:
                this.a.h((java.lang.Object[]) this.d, this.b);
                break;
        }
    }

    @Override // j$.util.stream.m4
    public final j$.util.stream.m4 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new j$.util.stream.l4(this, ((j$.util.stream.t2) this.a).a(i), i2);
            default:
                return new j$.util.stream.l4(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(j$.util.stream.u2 u2Var, java.lang.Object obj, byte b) {
        super(u2Var);
        this.c = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(j$.util.stream.l4 l4Var, j$.util.stream.t2 t2Var, int i) {
        super(l4Var, t2Var, i);
        this.c = (byte) 0;
        this.d = l4Var.d;
    }
}
