package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class u6 extends j$.util.stream.b6 {
    public final java.util.Comparator b;
    public boolean c;

    public u6(j$.util.stream.f6 f6Var, java.util.Comparator comparator) {
        super(f6Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final boolean t() {
        this.c = true;
        return false;
    }
}
