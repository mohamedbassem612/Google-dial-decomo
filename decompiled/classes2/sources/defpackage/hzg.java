package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzg {
    public final int a;
    public final lpb b;
    public final java.util.Queue c;
    public j$.util.Optional d = j$.util.Optional.empty();
    public int e;

    public hzg(int i, lpb lpbVar) {
        this.a = i;
        this.b = lpbVar;
        this.c = new java.util.ArrayDeque(i);
    }

    public final akzc a(int i) {
        lpb.b();
        akzc akzcVar = akzc.d;
        akzb akzbVar = new akzb(i);
        for (int i2 = 0; i2 < i; i2++) {
            java.util.Queue queue = this.c;
            if (queue.isEmpty()) {
                break;
            }
            akzbVar.write(((java.lang.Byte) queue.remove()).byteValue());
        }
        return akzbVar.b();
    }

    public final void b() {
        lpb.b();
        if (this.d.isPresent()) {
            ((ajdd) this.d.orElseThrow()).o(a(this.e));
            this.d = j$.util.Optional.empty();
        }
    }
}
