package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahoy {
    int a;
    final int b;
    defpackage.ahoy c;
    final java.util.Map d = new java.util.HashMap(0);

    public ahoy(int i, int i2) {
        if (i > i2) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final java.lang.String toString() {
        return "Node" + java.lang.System.identityHashCode(this);
    }
}
