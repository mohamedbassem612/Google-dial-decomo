package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class airp extends defpackage.airq implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public airp(int i) {
        this.a = i;
    }

    @Override // defpackage.airq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.airq
    public final int b() {
        return 32;
    }

    @Override // defpackage.airq
    public final boolean c(defpackage.airq airqVar) {
        return this.a == airqVar.a();
    }

    @Override // defpackage.airq
    public final byte[] d() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
