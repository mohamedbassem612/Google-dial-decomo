package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ewp {
    public int a;

    public void dJ() {
        this.a = 0;
    }

    public final void dK(int i) {
        this.a |= i;
    }

    public final boolean dL(int i) {
        return (this.a & i) == i;
    }
}
